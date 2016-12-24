package com.craft4plus.custom.items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;

import com.craft4plus.main.Main;
import com.craft4plus.miscellaneous.SlimeChunks;
import com.craft4plus.miscellaneous.TreeBreaker;
import com.craft4plus.utils.armorequip.ArmorEquipEvent;
import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_10_R1.MinecraftServer;

public class CustomItemsListener implements Listener {

	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent event) {
		if ((event.getEntity() instanceof Player)) {
			Player player = (Player) event.getEntity();
			CustomItemsActions.customItemCheck(player);
			if (!player.getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
				ItemStack item = player.getInventory().getItemInMainHand();
				if (CustomItemsActions.isDoubleAxe(item)) {
					CustomItemsActions.reduceDurability(item, player, 2);
				}
				if (CustomItemsActions.isEndStoneSword(item)) {
					CustomItemsActions.reduceDurability(item, player, 1);
				}
				if (CustomItemsActions.isEndStoneItem(item)) {
					CustomItemsActions.reduceDurability(item, player, 2);
				}
			}

		}
	}

	@EventHandler
	public void onBlockBreakEvent(BlockBreakEvent event) {
		Player player = event.getPlayer();
		CustomItemsActions.customItemCheck(player);
		if (!player.getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
			ItemStack item = player.getInventory().getItemInMainHand();
			Block block = event.getBlock();
			if (CustomItemsActions.isDoubleAxe(item)) {
				TreeBreaker.Chop(block, player);
				CustomItemsActions.reduceDurability(item, player, 1);
				return;
			}
			if (CustomItemsActions.isSickle(item)) {
				CustomItemsActions.reduceDurability(item, player,
						CustomItemsActions.breakSeedsInRadius(block, CustomItemsActions.getSickleBreakRadius(item)));
				player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0F, 1.0F);
				return;
			}
		}
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		CustomItemsActions.customItemCheck(event.getPlayer());
	}

	@EventHandler
	public void onArmorEquip(ArmorEquipEvent event) {
		Player player = event.getPlayer();
		if ((event.getNewArmorPiece() != null) && (!event.getNewArmorPiece().getType().equals(Material.AIR))) {
			ItemStack newArmorPiece = event.getNewArmorPiece();
			if (CustomItemsActions.isStoneArmor(newArmorPiece)) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999999, 1));
				return;
			}
			if (CustomItemsActions.isSlimeBoots(newArmorPiece)) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 9999999, 1));
				return;
			}
		} else {
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
				public void run() {
					if (!(CustomItemsActions.isStoneArmor(player.getInventory().getItem(39))
							|| CustomItemsActions.isStoneArmor(player.getInventory().getItem(38))
							|| CustomItemsActions.isStoneArmor(player.getInventory().getItem(37))
							|| CustomItemsActions.isStoneArmor(player.getInventory().getItem(36)))) {
						if (player.hasPotionEffect(PotionEffectType.SLOW)) {
							for (PotionEffect effect : player.getActivePotionEffects()) {
								if (effect.getType().equals(PotionEffectType.SLOW) && effect.getDuration() >= 1000
										&& effect.getAmplifier() == 1) {
									player.removePotionEffect(effect.getType());
								}
							}
						}
					}
					if (CustomItemsActions.isSlimeBoots(event.getOldArmorPiece())) {
						if (player.hasPotionEffect(PotionEffectType.JUMP)) {
							for (PotionEffect effect : player.getActivePotionEffects()) {
								if (effect.getType().equals(PotionEffectType.JUMP) && effect.getDuration() >= 1000
										&& effect.getAmplifier() == 1) {
									player.removePotionEffect(effect.getType());
								}
							}
						}
					}
				}
			}, 1L);
		}
	}

	// CUSTOM FOOD - UTILITY TO HAVE A BOW THAT CAN SHOOT WITHOUT ARROWS - MADE
	// BY Ugleh

	HashMap<UUID, ItemStack> storedItem = new HashMap<UUID, ItemStack>();
	HashMap<UUID, Integer> EatingState = new HashMap<UUID, Integer>();
	HashMap<UUID, Integer> EatingStateLastCheck = new HashMap<UUID, Integer>();

	@EventHandler
	public void PlayerItemHeldEvent(PlayerItemHeldEvent e) {
		Player player = e.getPlayer();
		if (!player.getGameMode().equals(GameMode.CREATIVE) && player.hasPermission("c4p.unlimitedarrows")) {
			returnItem(e.getPlayer());
		}
	}

	@EventHandler
	public void PlayerDropItemEvent(PlayerDropItemEvent e) {
		Player player = e.getPlayer();
		if (!player.getGameMode().equals(GameMode.CREATIVE) && player.hasPermission("c4p.unlimitedarrows")) {
			returnItem(e.getPlayer());
		}
	}

	@EventHandler
	public void EntityShootBowEvent(EntityShootBowEvent e) {
		if (e.getEntity() instanceof Player) {
			Player player = (Player) e.getEntity();
			if (!player.getGameMode().equals(GameMode.CREATIVE) && player.hasPermission("c4p.unlimitedarrows")) {
				returnItem((Player) e.getEntity());
			}
		}

	}

	private void returnItem(Player player) {
		if (storedItem.containsKey(player.getUniqueId())) {
			int slot = player.getInventory().getSize() - 6;
			player.getInventory().setItem(slot, storedItem.get(player.getUniqueId()));
			player.updateInventory();
			storedItem.remove(player.getUniqueId());
		}
	}

	@EventHandler
	public void PlayerInteractEvent(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		unlimitedArrow(p, e);
		customFood(p, e);
	}

	public void unlimitedArrow(Player p, PlayerInteractEvent e) {
		String world = p.getWorld().getName();
		if (!p.getGameMode().equals(GameMode.CREATIVE) && p.hasPermission("c4p.unlimitedarrows")
				&& ((world == "Survival") || (world == "Survival_nether") || (world == "Survival_the_end")
						|| (world == "FloatingIslands") || (world == "skyworld") || (world == "skyworld_nether"))) {
			if (!(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)))
				return;
			if (storedItem.containsKey(p.getUniqueId()))
				return;
			if ((p.getInventory().getItemInMainHand().getType().equals(Material.BOW))
					|| (p.getInventory().getItemInOffHand().getType().equals(Material.BOW))) {
				int slot = p.getInventory().getSize() - 6;
				ItemStack item = p.getInventory().getItem(slot);
				storedItem.put(p.getUniqueId(), item);
				p.getInventory().setItem(slot, new ItemStack(Material.ARROW, 1));
			}
		}
	}

	public void customFood(Player player, PlayerInteractEvent event) {
		if ((player.getGameMode() != GameMode.CREATIVE) && (player.getGameMode() != GameMode.SPECTATOR)
				&& (event.getItem() != null) && (event.getItem().getType() != Material.AIR)
				&& (player.getFoodLevel() != 20)) {
			ItemStack item = event.getItem();
			Material material = item.getType();
			if (CustomItemsActions.isCustomFood(item, material)) {
				int CurrentTick = MinecraftServer.currentTick;
				UUID uuid = player.getUniqueId();
				if (!(EatingState.containsKey(uuid) && (EatingStateLastCheck.containsKey(uuid)))) {
					EatingState.put(uuid, CurrentTick);
					EatingStateLastCheck.put(uuid, CurrentTick);
					CustomItemsActions.addEatingFoodEffects(player, 5, Material.GOLD_INGOT);
				} else {
					if (EatingStateLastCheck.get(uuid) == CurrentTick - 4) {
						int TimePassed = EatingState.get(uuid) - CurrentTick;
						if (TimePassed == -28) {
							CustomItemsActions.addFood(player, item, material);
							EatingState.remove(player.getUniqueId());
							EatingStateLastCheck.remove(player.getUniqueId());
							player.getInventory().remove(item);
							player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_BURP, 1.0F, 1.0F);
						} else {
							EatingStateLastCheck.put(uuid, CurrentTick);
							CustomItemsActions.addEatingFoodEffects(player, 5, Material.GOLD_BLOCK);
						}
					} else {
						if (EatingStateLastCheck.get(uuid) == CurrentTick)
							return;
						EatingState.put(uuid, CurrentTick);
						EatingStateLastCheck.put(uuid, CurrentTick);
						CustomItemsActions.addEatingFoodEffects(player, 5, Material.GOLD_INGOT);
					}
				}
			}
		}
	}

	// END OF CUSTOM FOOD

	// NETHER STAR EXPLOIT FIX
	@EventHandler
	public void craftItem(PrepareItemCraftEvent e) {
		CraftingInventory inv = e.getInventory();
		ItemStack netherstar = new ItemStack(Material.NETHER_STAR, 1);
		ItemMeta meta = netherstar.getItemMeta();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aNavigator"));
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.translateAlternateColorCodes('&', "&aRight click to use the World Navigator"));
		meta.setLore(lore);
		netherstar.setItemMeta(meta);
		if (inv.contains(netherstar)) {
			for (HumanEntity human : e.getViewers()) {
				human.closeInventory();
				human.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Don't use the navigator to craft items!");
				Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
					@Override
					public void run() {
						human.getInventory().setItem(8, netherstar);
					}
				}, 1L);
			}
		}
	}
	// END OF NETHER STAR EXPLOIT FIX

	// === SUPER HOES === //

	@EventHandler
	public void onHoeBreak(BlockBreakEvent event) {
		if (event.getPlayer() == null)
			return;

		Player player = event.getPlayer();

		if (player.getGameMode() != GameMode.SURVIVAL)
			return;

		if (player.getInventory().getItemInMainHand() == null
				|| player.getInventory().getItemInMainHand().getType() == Material.AIR)
			return;

		ItemStack item = player.getInventory().getItemInMainHand();
		Material itemType = item.getType();
		Block block = event.getBlock();

		if (itemType == Material.DIAMOND_HOE) {
			CustomItemsActions.breakSeedsInRadius(block, 5);
		}
	}

	// === SLIME BUCKETS === //

	List<UUID> PlayersInSlimeChunks = new ArrayList<UUID>();

	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		Player player = event.getPlayer();
		UUID playeruuid = player.getUniqueId();
		if (SlimeChunks.isSlimeChunk(player.getLocation())) {
			if (!PlayersInSlimeChunks.contains(playeruuid)) {
				PlayersInSlimeChunks.add(playeruuid);
				Inventory inventory = player.getInventory();
				for (ItemStack item : inventory.getContents()) {
					if (CustomItemsActions.isSimpleSlimeBucket(item))
						item.setDurability((short) 1551);
				}
			}
		} else {
			if (PlayersInSlimeChunks.contains(playeruuid)) {
				PlayersInSlimeChunks.remove(playeruuid);
				Inventory inventory = player.getInventory();
				for (ItemStack item : inventory.getContents()) {
					if (CustomItemsActions.isHoppingSlimeBucket(item))
						item.setDurability((short) 1552);
				}
			}
		}
	}

	public void onItemDrop(PlayerDropItemEvent event) {
		Item item = event.getItemDrop();
		ItemStack itemstack = item.getItemStack();
		if (!CustomItemsActions.isSlimeBucket(itemstack))
			return;
		Player player = event.getPlayer();
		UUID playeruuid = player.getUniqueId();
		if (PlayersInSlimeChunks.contains(playeruuid))
			PlayersInSlimeChunks.remove(playeruuid);
		itemstack.setDurability((short) 1552);
		item.setItemStack(itemstack);
	}

	public void onItemPickup(PlayerPickupItemEvent event) {
		Item item = event.getItem();
		ItemStack itemstack = item.getItemStack();
		if (!CustomItemsActions.isSlimeBucket(itemstack))
			return;
		Player player = event.getPlayer();
		UUID playeruuid = player.getUniqueId();
		if (SlimeChunks.isSlimeChunk(player.getLocation())) {
			PlayersInSlimeChunks.add(playeruuid);
			for (ItemStack itemtochange : player.getInventory().getContents()) {
				if (CustomItemsActions.isSimpleSlimeBucket(itemtochange))
					itemtochange.setDurability((short) 1551);
			}
		} else {
			if (PlayersInSlimeChunks.contains(playeruuid))
				PlayersInSlimeChunks.remove(playeruuid);
			for (ItemStack itemtochange : player.getInventory().getContents()) {
				if (CustomItemsActions.isSimpleSlimeBucket(itemtochange))
					itemtochange.setDurability((short) 1552);
			}
		}
		item.setItemStack(itemstack);
	}

	public void onInventoryMove(InventoryMoveItemEvent event) {
		ItemStack item = event.getItem();
		if (!CustomItemsActions.isSlimeBucket(item))
			return;
		if (event.getDestination().getHolder() instanceof HumanEntity) {
			HumanEntity player = (HumanEntity) event.getDestination().getHolder();
			UUID playeruuid = player.getUniqueId();
			if (SlimeChunks.isSlimeChunk(player.getLocation())) {
				PlayersInSlimeChunks.add(playeruuid);
				for (ItemStack itemtochange : player.getInventory().getContents()) {
					if (CustomItemsActions.isSimpleSlimeBucket(itemtochange))
						itemtochange.setDurability((short) 1551);
				}
			} else {
				if (PlayersInSlimeChunks.contains(playeruuid))
					PlayersInSlimeChunks.remove(playeruuid);
				for (ItemStack itemtochange : player.getInventory().getContents()) {
					if (CustomItemsActions.isSimpleSlimeBucket(itemtochange))
						itemtochange.setDurability((short) 1552);
				}
			}
		} else {
			if (event.getInitiator().getHolder() instanceof HumanEntity) {
				HumanEntity player = (HumanEntity) event.getDestination().getHolder();
				UUID playeruuid = player.getUniqueId();
				if (PlayersInSlimeChunks.contains(playeruuid))
					PlayersInSlimeChunks.remove(playeruuid);
				for (ItemStack itemtochange : player.getInventory().getContents()) {
					if (CustomItemsActions.isSimpleSlimeBucket(itemtochange))
						itemtochange.setDurability((short) 1552);
				}
			}
		}
	}

	public void onBucketSlimeClick(PlayerInteractEntityEvent event) {
		if (!(event.getRightClicked() instanceof Slime))
			return;
		Player player = event.getPlayer();
		PlayerInventory inventory = player.getInventory();
		ItemStack item = null;
		if (inventory.getItemInMainHand().getType().equals(Material.BUCKET)) {
			item = inventory.getItemInMainHand();
		} else if (inventory.getItemInOffHand().getType().equals(Material.BUCKET)) {
			item = inventory.getItemInOffHand();
		}
		UUID playeruuid = player.getUniqueId();
		if (SlimeChunks.isSlimeChunk(player.getLocation())) {
			PlayersInSlimeChunks.add(playeruuid);
			item.setDurability((short) 1551);
		} else {
			if (PlayersInSlimeChunks.contains(playeruuid))
				PlayersInSlimeChunks.remove(playeruuid);
			item.setDurability((short) 1552);
		}
	}

	public void onSlimeBucketBlockClick(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		PlayerInventory inventory = player.getInventory();
		ItemStack item = null;
		if (CustomItemsActions.isSlimeBucket(inventory.getItemInMainHand())) {
			item = inventory.getItemInMainHand();
		} else if (CustomItemsActions.isSlimeBucket(inventory.getItemInOffHand())) {
			item = inventory.getItemInOffHand();
		} else return;
		if (event.getClickedBlock() == null) return;
		Location location = event.getClickedBlock().getLocation();
		item.setType(Material.BUCKET);
		location.getWorld().spawnEntity(location, EntityType.SLIME);
	}

}