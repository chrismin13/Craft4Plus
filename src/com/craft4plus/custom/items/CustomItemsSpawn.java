package com.craft4plus.custom.items;

import java.util.HashMap;
import java.util.List;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.connorlinfoot.bountifulapi.BountifulAPI;

import net.md_5.bungee.api.ChatColor;


public class CustomItemsSpawn {
	
	// ============ STUFF CONTAINING CUSTOM ITEMS =========== //
	
	public static HashMap<Integer, ItemStack> CustomItems = new HashMap<Integer, ItemStack>();
	
	public void generateCustomItems() {
		// Emerald Items
		EmeraldSword();
		EmeraldAxe();
		EmeraldPickaxe();
		EmeraldShovel();
		EmeraldHoe();
		EmeraldHelmet();
		EmeraldChestplate();
		EmeraldLeggings();
		EmeraldBoots();
		
		// Double Axes
		WoodenDoubleAxe();
		StoneDoubleAxe();
		IronDoubleAxe();
		GoldDoubleAxe();
		DiamondDoubleAxe();
		EmeraldDoubleAxe();
		
		// Stone Armor
		StoneHelmet();
		StoneChestplate();
		StoneLeggings();
		StoneBoots();
		
		// End Stone Items
		EndStoneSword();
		EndStoneAxe();
		EndStonePickaxe();
		EndStoneShovel();
		EndStoneHoe();
		EndStoneHelmet();
		EndStoneChestplate();
		EndStoneLeggings();
		EndStoneBoots();
		EndStoneDoubleAxe();
		
		// Custom Food
		Goldfish();
		
	}
	
	// ======== END OF STUFF CONTAINING CUSTOM ITEMS ======= //
	
	// ------------ EMERALD ITEMS ---------------

		public static void EmeraldSword() { // ID OF 1

			ItemStack Item = ItemStackUtilities.createItem(Material.DIAMOND_SWORD, 1, 1561);

			ItemStackUtilities.setUnbreakable(Item, true, false);
			ItemStackUtilities.setName(Item, "Emerald Sword");

			CustomItems.put(1, Item);

		}

		public static void EmeraldAxe() { // ID OF 2

			ItemStack Item = ItemStackUtilities.createItem(Material.DIAMOND_AXE, 1, 1561);

			ItemStackUtilities.setUnbreakable(Item, true, false);
			ItemStackUtilities.setName(Item, "Emerald Axe");

			CustomItems.put(2, Item);

		}

		public static void EmeraldPickaxe() { // ID OF 3

			ItemStack Item = ItemStackUtilities.createItem(Material.DIAMOND_PICKAXE, 1, 1561);

			ItemStackUtilities.setUnbreakable(Item, true, false);
			ItemStackUtilities.setName(Item, "Emerald Pickaxe");

			CustomItems.put(3, Item);

		}

		public static void EmeraldShovel() { // ID OF 4

			ItemStack Item = ItemStackUtilities.createItem(Material.DIAMOND_SPADE, 1, 1561);

			ItemStackUtilities.setUnbreakable(Item, true, false);
			ItemStackUtilities.setName(Item, "Emerald Shovel");

			CustomItems.put(4, Item);

		}

		public static void EmeraldHoe() { // ID OF 5

			ItemStack Item = ItemStackUtilities.createItem(Material.DIAMOND_HOE, 1, 1561);

			ItemStackUtilities.setUnbreakable(Item, true, false);
			ItemStackUtilities.setName(Item, "Emerald Hoe");

			CustomItems.put(5, Item);

		}

		public static void EmeraldHelmet() { // ID OF 6

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_HELMET, 1, 0);

			ItemStackUtilities.setUnbreakable(Item, true, false);
			ItemStackUtilities.setName(Item, "Emerald Helmet");
			Item = ItemStackUtilities.setArmorLevel(Item, 3, 2, "head");
			ItemStackUtilities.setLeatherArmorColor(Item, 0, 255, 76);

			CustomItems.put(6, Item);

		}

		public static void EmeraldChestplate() { // ID OF 7

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_CHESTPLATE, 1, 0);

			ItemStackUtilities.setUnbreakable(Item, true, false);
			ItemStackUtilities.setName(Item, "Emerald Chestplate");
			Item = ItemStackUtilities.setArmorLevel(Item, 8, 2, "chest");
			ItemStackUtilities.setLeatherArmorColor(Item, 0, 255, 76);

			CustomItems.put(7, Item);

		}

		public static void EmeraldLeggings() { // ID OF 8

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_LEGGINGS, 1, 0);

			ItemStackUtilities.setUnbreakable(Item, true, false);
			ItemStackUtilities.setName(Item, "Emerald Leggings");
			Item = ItemStackUtilities.setArmorLevel(Item, 6, 2, "legs");
			ItemStackUtilities.setLeatherArmorColor(Item, 0, 255, 76);

			CustomItems.put(8, Item);

		}

		public static void EmeraldBoots() { // ID OF 9

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_BOOTS, 1, 0);

			ItemStackUtilities.setUnbreakable(Item, true, false);
			ItemStackUtilities.setName(Item, "Emerald Boots");
			Item = ItemStackUtilities.setArmorLevel(Item, 3, 2, "feet");
			ItemStackUtilities.setLeatherArmorColor(Item, 0, 255, 76);

			CustomItems.put(9, Item);

		}

		// ------------ END OF EMERALD ITEMS ---------------

		// ----------------- DOUBLE AXES -------------------

		public static void WoodenDoubleAxe() { // ID OF 10

			ItemStack Item = ItemStackUtilities.createItem(Material.WOOD_AXE, 1, 59);

			ItemStackUtilities.setUnbreakable(Item, true, true);
			ItemStackUtilities.setName(Item, "Wooden Double Axe");
			Item = ItemStackUtilities.setAttack(Item, 0.5, 7, false, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 59, 59);

			CustomItems.put(10, Item);

		}

		public static void StoneDoubleAxe() { // ID OF 11

			ItemStack Item = ItemStackUtilities.createItem(Material.STONE_AXE, 1, 131);

			ItemStackUtilities.setUnbreakable(Item, true, true);
			ItemStackUtilities.setName(Item, "Stone Double Axe");
			Item = ItemStackUtilities.setAttack(Item, 0.5, 9, false, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 131, 131);

			CustomItems.put(11, Item);

		}

		public static void IronDoubleAxe() { // ID OF 12

			ItemStack Item = ItemStackUtilities.createItem(Material.IRON_AXE, 1, 250);

			ItemStackUtilities.setUnbreakable(Item, true, true);
			ItemStackUtilities.setName(Item, "Iron Double Axe");
			Item = ItemStackUtilities.setAttack(Item, 0.6, 9, false, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 250, 250);

			CustomItems.put(12, Item);

		}

		public static void GoldDoubleAxe() { // ID OF 13

			ItemStack Item = ItemStackUtilities.createItem(Material.GOLD_AXE, 1, 31);

			ItemStackUtilities.setUnbreakable(Item, true, true);
			ItemStackUtilities.setName(Item, "Golden Double Axe");
			Item = ItemStackUtilities.setAttack(Item, 0.7, 7, false, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 32, 32);

			CustomItems.put(13, Item);

		}

		public static void DiamondDoubleAxe() { // ID OF 14 

			ItemStack Item = ItemStackUtilities.createItem(Material.GOLD_AXE, 1, 30);

			ItemStackUtilities.setUnbreakable(Item, true, true);
			ItemStackUtilities.setName(Item, "Diamond Double Axe");
			Item = ItemStackUtilities.setAttack(Item, 0.7, 9, false, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 1561, 1561);

			CustomItems.put(14, Item);

		}

		public static void EmeraldDoubleAxe() { // ID OF 15

			ItemStack Item = ItemStackUtilities.createItem(Material.GOLD_AXE, 1, 29);

			ItemStackUtilities.setUnbreakable(Item, true, false);
			ItemStackUtilities.setName(Item, "Emerald Double Axe");
			Item = ItemStackUtilities.setAttack(Item, 0.7, 9, false, true);

			CustomItems.put(15, Item);

		}

		public static boolean isDoubleAxe(ItemStack item) {
			if (!item.getType().equals(Material.AIR) && (item.getItemMeta() != null) && item.getItemMeta().spigot().isUnbreakable()) {
				Material m = item.getType();
				if ((m.equals(Material.WOOD_AXE) && item.getDurability() == 59)
						|| (m.equals(Material.STONE_AXE) && item.getDurability() == 131)
						|| (m.equals(Material.IRON_AXE) && item.getDurability() == 250)
						|| (m.equals(Material.GOLD_AXE) && item.getDurability() == 29)
						|| (m.equals(Material.GOLD_AXE) && item.getDurability() == 30)
						|| (m.equals(Material.GOLD_AXE) && item.getDurability() == 31)) {
					return true;
				}
				return false;
			}
			return false;
		}
		
		// ------------- END OF DOUBLE AXES ----------------
		
		// ----------------- STONE ARMOR -------------------
		
		public static void StoneHelmet() { // ID OF 16

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_HELMET, 1, 0);

			ItemStackUtilities.setName(Item, "Stone Helmet");
			Item = ItemStackUtilities.setArmorLevel(Item, 2, 0, "head");
			ItemStackUtilities.setLeatherArmorColor(Item, 103, 103, 103);

			CustomItems.put(16, Item);

		}

		public static void StoneChestplate() { // ID OF 17

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_CHESTPLATE, 1, 0);

			ItemStackUtilities.setName(Item, "Stone Chestplate");
			Item = ItemStackUtilities.setArmorLevel(Item, 5, 0, "chest");
			ItemStackUtilities.setLeatherArmorColor(Item, 103, 103, 103);

			CustomItems.put(17, Item);

		}

		public static void StoneLeggings() { // ID OF 18

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_LEGGINGS, 1, 0);

			ItemStackUtilities.setName(Item, "Stone Leggings");
			Item = ItemStackUtilities.setArmorLevel(Item, 4, 0, "legs");
			ItemStackUtilities.setLeatherArmorColor(Item, 103, 103, 103);

			CustomItems.put(18, Item);

		}

		public static void StoneBoots() { // ID OF 19

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_BOOTS, 1, 0);

			ItemStackUtilities.setName(Item, "Stone Boots");
			Item = ItemStackUtilities.setArmorLevel(Item, 1, 0, "feet");
			ItemStackUtilities.setLeatherArmorColor(Item, 103, 103, 103);

			CustomItems.put(19, Item);

		}
		
		public static boolean isStoneArmor(ItemStack item) {
			if (item != null) {
				Material m = item.getType();
				if ((m.equals(Material.LEATHER_HELMET)) || (m.equals(Material.LEATHER_CHESTPLATE))
						|| (m.equals(Material.LEATHER_LEGGINGS)) || (m.equals(Material.LEATHER_BOOTS))) {
					LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
					if ((meta.getColor().getRed() == 103) && (meta.getColor().getBlue() == 103) && (meta.getColor().getGreen() == 103)) {
						return true;
					}
					if ((meta.getColor().getRed() == 168) && (meta.getColor().getBlue() == 100) && (meta.getColor().getGreen() == 168)) {
						return true;
					}
					return false;
				}
				return false;
			}
			return false;
		}
		
		
		// ------------- END OF STONE ARMOR ----------------
		
		// --------------- END STONE ITEMS -----------------
		
		
		public static void EndStoneHelmet() { // ID OF 20

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_HELMET, 1, 0);

			ItemStackUtilities.setName(Item, "End Stone Helmet");
			Item = ItemStackUtilities.setArmorLevel(Item, 2, 0, "head");
			ItemStackUtilities.setLeatherArmorColor(Item, 168, 168, 100);

			CustomItems.put(20, Item);

		}

		public static void EndStoneChestplate() { // ID OF 21

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_CHESTPLATE, 1, 0);

			ItemStackUtilities.setName(Item, "End Stone Chestplate");
			Item = ItemStackUtilities.setArmorLevel(Item, 5, 0, "chest");
			ItemStackUtilities.setLeatherArmorColor(Item, 168, 168, 100);

			CustomItems.put(21, Item);

		}

		public static void EndStoneLeggings() { // ID OF 22

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_LEGGINGS, 1, 0);

			ItemStackUtilities.setName(Item, "End Stone Leggings");
			Item = ItemStackUtilities.setArmorLevel(Item, 4, 0, "legs");
			ItemStackUtilities.setLeatherArmorColor(Item, 168, 168, 100);

			CustomItems.put(22, Item);

		}

		public static void EndStoneBoots() {  // ID OF 23

			ItemStack Item = ItemStackUtilities.createItem(Material.LEATHER_BOOTS, 1, 0);

			ItemStackUtilities.setName(Item, "End Stone Boots");
			Item = ItemStackUtilities.setArmorLevel(Item, 1, 0, "feet");
			ItemStackUtilities.setLeatherArmorColor(Item, 168, 168, 100);

			CustomItems.put(23, Item);

		}
		
		public static void EndStoneSword() {  // ID OF 24
			
			ItemStack Item = ItemStackUtilities.createItem(Material.STONE_SWORD, 1 , 131);
			
			ItemStackUtilities.setName(Item, "End Stone Sword");
			ItemStackUtilities.setUnbreakable(Item, true, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 131, 131);
			
			CustomItems.put(24, Item);
			
		}
		
		public static void EndStoneAxe() { // ID OF 25
			
			ItemStack Item = ItemStackUtilities.createItem(Material.STONE_AXE, 1 , 130);
			
			ItemStackUtilities.setName(Item, "End Stone Axe");
			ItemStackUtilities.setUnbreakable(Item, true, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 131, 131);
			
			CustomItems.put(25, Item);
			
		}
		
		public static void EndStoneDoubleAxe() { // ID OF 26
			
			ItemStack Item = ItemStackUtilities.createItem(Material.STONE_AXE, 1 , 129);
			
			ItemStackUtilities.setName(Item, "End Stone Double Axe");
			ItemStackUtilities.setUnbreakable(Item, true, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 131, 131);
			
			CustomItems.put(26, Item);
			
		}
		
		public static void EndStonePickaxe() { // ID OF 27
			
			ItemStack Item = ItemStackUtilities.createItem(Material.STONE_PICKAXE, 1 , 131);
			
			ItemStackUtilities.setName(Item, "End Stone Pickaxe");
			ItemStackUtilities.setUnbreakable(Item, true, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 131, 131);
			
			CustomItems.put(27, Item);
			
		}
		
		public static void EndStoneShovel() { // ID OF 28
			
			ItemStack Item = ItemStackUtilities.createItem(Material.STONE_SPADE, 1 , 131);
			
			ItemStackUtilities.setName(Item, "End Stone Shovel");
			ItemStackUtilities.setUnbreakable(Item, true, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 131, 131);
			
			CustomItems.put(28, Item);
			
		}
		
		public static void EndStoneHoe() { // ID OF 29
			
			ItemStack Item = ItemStackUtilities.createItem(Material.STONE_HOE, 1 , 131);
			
			ItemStackUtilities.setName(Item, "End Stone Hoe");
			ItemStackUtilities.setUnbreakable(Item, true, true);
			Item = ItemStackUtilities.addDurabilityLore(Item, 131, 131);
			
			CustomItems.put(29, Item);
			
		}
		
		public static boolean isEndStoneSword(ItemStack item) {
			if (item.getItemMeta().spigot().isUnbreakable()) {
				Material m = item.getType();
				if (m.equals(Material.STONE_SWORD) && item.getDurability() == 131) {
					return true;
				}
				return false;
			}
			return false;
		}
		
		public static boolean isEndStoneItem(ItemStack item) {
			if (item.getItemMeta().spigot().isUnbreakable()) {
				Material m = item.getType();
				if ((m.equals(Material.STONE_AXE) && item.getDurability() == 130)
						|| (m.equals(Material.STONE_AXE) && item.getDurability() == 129)
						|| (m.equals(Material.STONE_SPADE) && item.getDurability() == 131)
						|| (m.equals(Material.STONE_PICKAXE) && item.getDurability() == 131)
						|| (m.equals(Material.STONE_HOE) && item.getDurability() == 131)) {
					return true;
				}
				return false;
			}
			return false;
		}
		
		// ------------ END OF END STONE ITEMS -------------
		
		// ----------------- CUSTOM FOOD -------------------
		
		public static void Goldfish() { // ID OF 30
			ItemStack Item = ItemStackUtilities.createItem(Material.DIAMOND_SWORD, 1, 1560);
			
			ItemStackUtilities.setName(Item, "Goldfish");
			ItemStackUtilities.setUnbreakable(Item, true, true);
			Item = ItemStackUtilities.nullifyModifiers(Item);
			
			CustomItems.put(30, Item);
		}
		
		public static boolean isCustomFood(ItemStack item, Material material) {
			if (material == Material.DIAMOND_SWORD) {
				if ((item.getDurability() >= 1560) && (item.getDurability() <= 1560)) return true;
			}
			return false;
		}
		
		public static void addFood(Player player, ItemStack item, Material material) {
			if (material == Material.DIAMOND_SWORD) {
				if (item.getDurability() == 1560) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 2400, 0));
					player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 1));
					addToFoodLevel(player, 4);
					addToSaturationLevel(player, 9.6F);
				}
			}
		}
		
		public static void addToFoodLevel(Player player, int FoodLevel) {
			if (player.getFoodLevel() > 20 - FoodLevel) {
				player.setFoodLevel(20);
			}
			player.setFoodLevel(player.getFoodLevel() + FoodLevel);
		}
		
		public static void addToSaturationLevel(Player player, float SaturationLevel) {
			if (player.getSaturation() > 20F - SaturationLevel) {
				player.setSaturation(20F);
			}
			player.setSaturation(player.getSaturation() + SaturationLevel);
		}
		
		// -------------- END OF CUSTOM FOOD ---------------
		
		public static int getCustomItemDurability(ItemStack item) {
			if ((!item.getType().equals(Material.AIR)) && (item.getItemMeta() != null) && (!item.getItemMeta().spigot().isUnbreakable())) {
				Material m = item.getType();
				if ((m.equals(Material.DIAMOND_SWORD)) || (m.equals(Material.DIAMOND_AXE))
						|| (m.equals(Material.DIAMOND_PICKAXE)) || (m.equals(Material.DIAMOND_SPADE))
						|| (m.equals(Material.DIAMOND_HOE))) {
					return 1560;
				}
				if ((m.equals(Material.STONE_SWORD)) || (m.equals(Material.STONE_PICKAXE)) || (m.equals(Material.STONE_SPADE))
						|| (m.equals(Material.STONE_HOE))) {
					return 130;
				}
				if (m.equals(Material.WOOD_AXE)) {
					return 58;
				}
				if (m.equals(Material.STONE_AXE)) {
					return 128;
				}
				if (m.equals(Material.IRON_AXE)) {
					return 250;
				}
				if (m.equals(Material.GOLD_AXE)) {
					return 28;
				}
				return 123456789;
			}
			return 123456789;
		}

		public static void reduceDurability(ItemStack item, Player player, int durabilitytoremove) {
			if (player.getGameMode() != GameMode.CREATIVE) {
				if (item.getItemMeta().getLore() != null) {
					List<String> lore = item.getItemMeta().getLore();
					for (String string : lore) {
						if (string.startsWith(ChatColor.GRAY + "Durability: ")) {
							String durability = string.replaceFirst(ChatColor.GRAY + "Durability: ", "");
							String segments[] = durability.split(" / ");
							int finaldurability = Integer.parseInt(segments[0]) - durabilitytoremove;
							String newstring = string.replaceFirst("Durability: " + segments[0],
									"Durability: " + Integer.toString(finaldurability));
							lore.remove(string);
							lore.add(newstring);
							if (finaldurability <= 10) {
								BountifulAPI.sendActionBar(player,
										ChatColor.RED + "" + ChatColor.BOLD + "Item Durability Low!");
								String redstring = newstring.replaceAll(ChatColor.GRAY + "", ChatColor.RED + "");
								lore.remove(newstring);
								lore.add(redstring);
							}
						} else if (string.startsWith(ChatColor.RED + "Durability: ")) {
							String durability = string.replaceFirst(ChatColor.RED + "Durability: ", "");
							String segments[] = durability.split(" / ");
							int finaldurability = Integer.parseInt(segments[0]) - durabilitytoremove;
							if (finaldurability == 0) {
								player.getInventory().removeItem(player.getInventory().getItemInMainHand());
								player.playSound(player.getLocation(), Sound.ENTITY_ITEM_BREAK, 1.0F, 1.0F);
								return;
							} else {
								String newstring = string.replaceFirst("Durability: " + segments[0],
										"Durability: " + Integer.toString(finaldurability));
								BountifulAPI.sendActionBar(player,
										ChatColor.RED + "" + ChatColor.BOLD + "Item Durability Low!");
								String redstring = newstring.replaceAll(ChatColor.RED + "", ChatColor.RED + "");
								lore.remove(string);
								lore.remove(newstring);
								lore.add(redstring);
							}
						}
					}
					ItemMeta im = item.getItemMeta();
					im.setDisplayName(im.getDisplayName());
					im.setLore(lore);
					item.setItemMeta(im);
				}
			}
		}

}
