package com.craft4plus.custom;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import com.connorlinfoot.bountifulapi.BountifulAPI;
import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_10_R1.NBTTagCompound;
import net.minecraft.server.v1_10_R1.NBTTagDouble;
import net.minecraft.server.v1_10_R1.NBTTagInt;
import net.minecraft.server.v1_10_R1.NBTTagList;
import net.minecraft.server.v1_10_R1.NBTTagString;

public class CustomItems {
	
	public static int ArmorUUID = 1;
	
	public static ItemStack createItem(Material material, int quantity, int durability) {
		
		ItemStack Item = new ItemStack(material, quantity, (short) durability);
		return Item;
		
		}
	
	public static void setUnbreakable(ItemStack Item, boolean SetUnbreakable, boolean HideUnbreakableTag) {

		ItemMeta ItemMeta = Item.getItemMeta();
		ItemMeta.spigot().setUnbreakable(SetUnbreakable);
		if (HideUnbreakableTag) {
			ItemMeta.removeItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		}
		Item.setItemMeta(ItemMeta);

	}

	public static void setName(ItemStack Item, String ItemName) {

		ItemMeta ItemMeta = Item.getItemMeta();
		ItemMeta.setDisplayName(ChatColor.RESET + ItemName);
		Item.setItemMeta(ItemMeta);

	}
	
	public static ItemStack setArmorLevel(ItemStack Item, int ArmorLevel, int ArmorToughnessLevel, String ApplicationArea) {
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Item);
		NBTTagCompound ItemCompound = (nmsStack.hasTag()) ? nmsStack.getTag() : new NBTTagCompound();

		NBTTagList ItemModifiers = new NBTTagList();

		NBTTagCompound ItemArmor = new NBTTagCompound();
		ItemArmor.set("AttributeName", new NBTTagString("generic.armor"));
		ItemArmor.set("Name", new NBTTagString("generic.armor"));
		ItemArmor.set("Amount", new NBTTagDouble(ArmorLevel));
		ItemArmor.set("Operation", new NBTTagInt(0));
		ItemArmor.set("UUIDLeast", new NBTTagInt(ArmorUUID));
		ItemArmor.set("UUIDMost", new NBTTagInt(ArmorUUID));
		ItemArmor.set("Slot", new NBTTagString(ApplicationArea)); // Can be "mainhand", "offhand", "feet", "legs", "chest", "head"

		NBTTagCompound ItemArmorToughness = new NBTTagCompound();
		ItemArmorToughness.set("AttributeName", new NBTTagString("generic.armorToughness"));
		ItemArmorToughness.set("Name", new NBTTagString("generic.armorToughness"));
		ItemArmorToughness.set("Amount", new NBTTagDouble(ArmorToughnessLevel));
		ItemArmorToughness.set("Operation", new NBTTagInt(0));
		ItemArmorToughness.set("UUIDLeast", new NBTTagInt(ArmorUUID));
		ItemArmorToughness.set("UUIDMost", new NBTTagInt(ArmorUUID));
		ItemArmorToughness.set("Slot", new NBTTagString(ApplicationArea)); // Can be "mainhand", "offhand", "feet", "legs", "chest", "head"
		
		ItemModifiers.add(ItemArmor);
		ItemModifiers.add(ItemArmorToughness);
		ItemCompound.set("AttributeModifiers", ItemModifiers);
		
		ArmorUUID = ArmorUUID + 1;
		
		nmsStack.setTag(ItemCompound);
		return CraftItemStack.asBukkitCopy(nmsStack);
		
	}
	
	public static ItemStack setAttack(ItemStack Item, double AttackSpeed, double AttackDamage) {
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Item);
		NBTTagCompound ItemCompound = (nmsStack.hasTag()) ? nmsStack.getTag() : new NBTTagCompound();

		NBTTagList ItemModifiers = new NBTTagList();

		// -- attack damage
		NBTTagCompound ItemDamage = new NBTTagCompound();
		ItemDamage.set("AttributeName", new NBTTagString("generic.attackDamage"));
		ItemDamage.set("Name", new NBTTagString("generic.attackDamage"));
		ItemDamage.set("Amount", new NBTTagDouble(AttackDamage - 1.0));
		ItemDamage.set("Operation", new NBTTagInt(0));
		ItemDamage.set("UUIDLeast", new NBTTagInt(894654));
		ItemDamage.set("UUIDMost", new NBTTagInt(2872));
		ItemDamage.set("Slot", new NBTTagString("mainhand"));

		// -- attack speed
		NBTTagCompound ItemSpeed = new NBTTagCompound();
		ItemSpeed.set("AttributeName", new NBTTagString("generic.attackSpeed"));
		ItemSpeed.set("Name", new NBTTagString("generic.attackSpeed"));
		ItemSpeed.set("Amount", new NBTTagDouble(AttackSpeed - 4.0));
		ItemSpeed.set("Operation", new NBTTagInt(0));
		ItemSpeed.set("UUIDLeast", new NBTTagInt(894654));
		ItemSpeed.set("UUIDMost", new NBTTagInt(2872));
		ItemSpeed.set("Slot", new NBTTagString("mainhand"));

		// -- apply modifiers
		ItemModifiers.add(ItemSpeed);
		ItemModifiers.add(ItemDamage);
		ItemCompound.set("AttributeModifiers", ItemModifiers);

		nmsStack.setTag(ItemCompound);
		return CraftItemStack.asBukkitCopy(nmsStack);
		
	}
	
	public static void setLeatherArmorColor(ItemStack Item, int Red, int Green, int Blue) {
		
		LeatherArmorMeta meta = (LeatherArmorMeta) Item.getItemMeta();
		
		meta.setColor(Color.fromRGB(Red, Green, Blue));
		
		ItemMeta ItemMeta = Item.getItemMeta();
		Item.setItemMeta(ItemMeta);
		
		Item.setItemMeta(meta);
		
	}
	
	public static ItemStack addDurabilityLore(ItemStack item, int CurrentDurability, int MaximumDurability) {
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(im.getDisplayName());
		if (item.getItemMeta().getLore() == null) {
			List<String> loreList = new ArrayList<String>();
			loreList.add("Durability: " + Integer.toString(CurrentDurability) + " / " + Integer.toString(MaximumDurability));//This is the first line of lore
			im.setLore(loreList);
			item.setItemMeta(im);
		} else {
			List<String> loreList = item.getItemMeta().getLore();
			loreList.add("Durability: " + Integer.toString(CurrentDurability) + " / " + Integer.toString(MaximumDurability));//This is the first line of lore
			im.setLore(loreList);
			item.setItemMeta(im);
		}
		return item;
	}
	
	// ------------ EMERALD ITEMS ---------------
	
	public static ItemStack EmeraldSword() {

		ItemStack Item = createItem(Material.DIAMOND_SWORD, 1, 1561);
		
		setUnbreakable(Item, true, false);
		setName(Item, "Emerald Sword");
		
		return Item;
		
	}

	public static ItemStack EmeraldAxe() {
		
		ItemStack Item = createItem(Material.DIAMOND_AXE, 1, 1561);
		
		setUnbreakable(Item, true, false);
		setName(Item, "Emerald Axe");
		
		return Item;
		
	}

	public static ItemStack EmeraldPickaxe() {

		ItemStack Item = createItem(Material.DIAMOND_PICKAXE, 1, 1561);
		
		setUnbreakable(Item, true, false);
		setName(Item, "Emerald Pickaxe");
		
		return Item;
		
	}

	public static ItemStack EmeraldShovel() {
		
		ItemStack Item = createItem(Material.DIAMOND_SPADE, 1, 1561);

		setUnbreakable(Item, true, false);
		setName(Item, "Emerald Shovel");

		return Item;
		
	}

	public static ItemStack EmeraldHoe() {
		
		ItemStack Item = createItem(Material.DIAMOND_HOE, 1, 1561);
		
		setUnbreakable(Item, true, false);
		setName(Item, "Emerald Hoe");
		
		return Item;
		
	}
	
	public static ItemStack EmeraldHelmet() {
		
		ItemStack Item = createItem(Material.LEATHER_HELMET, 1, 0);
		
		setUnbreakable(Item, true, false);
		setName(Item, "Emerald Helmet");
		Item = setArmorLevel(Item, 3, 2, "head");
		setLeatherArmorColor(Item, 0, 255, 76);
		
		return Item;
		
	}
	
	public static ItemStack EmeraldChestplate() {
		
		ItemStack Item = createItem(Material.LEATHER_CHESTPLATE, 1, 0);
		
		setUnbreakable(Item, true, false);
		setName(Item, "Emerald Chestplate");
		Item = setArmorLevel(Item, 8, 2, "chest");
		setLeatherArmorColor(Item, 0, 255, 76);
		
		return Item;
		
	}
	
	public static ItemStack EmeraldLeggings() {
		
		ItemStack Item = createItem(Material.LEATHER_LEGGINGS, 1, 0);
		
		setUnbreakable(Item, true, false);
		setName(Item, "Emerald Leggings");
		Item = setArmorLevel(Item, 6, 2, "legs");
		setLeatherArmorColor(Item, 0, 255, 76);
		
		return Item;
		
	}
	
	public static ItemStack EmeraldBoots() {
		
		ItemStack Item = createItem(Material.LEATHER_BOOTS, 1, 0);
		
		setUnbreakable(Item, true, false);
		setName(Item, "Emerald Boots");
		Item = setArmorLevel(Item, 3, 2, "feet");
		setLeatherArmorColor(Item, 0, 255, 76);
		
		return Item;
		
	}
	
	// ------------ END OF EMERALD ITEMS ---------------
	
	// ----------------- DOUBLE AXES ------------------- 
	
	public static ItemStack WoodenDoubleAxe() {

		ItemStack Item = createItem(Material.WOOD_AXE, 1, 59);
		
		setUnbreakable(Item, true, true);
		setName(Item, "Wooden Double Axe");
		Item = setAttack(Item, 0.5, 7.0);
		Item = addDurabilityLore(Item, 59, 59);
		
		return Item;

	}

	public static ItemStack StoneDoubleAxe() {

		ItemStack Item = createItem(Material.STONE_AXE, 1, 131);

		setUnbreakable(Item, true, true);
		setName(Item, "Stone Double Axe");
		Item = setAttack(Item, 0.5, 9.0);
		Item = addDurabilityLore(Item, 131, 131);
		
		return Item;

	}

	public static ItemStack IronDoubleAxe() {

		ItemStack Item = createItem(Material.IRON_AXE, 1, 250);

		setUnbreakable(Item, true, true);
		setName(Item, "Iron Double Axe");
		Item = setAttack(Item, 0.6, 9.0);
		Item = addDurabilityLore(Item, 250, 250);
		
		return Item;

	}

	public static ItemStack GoldDoubleAxe() {

		ItemStack Item = createItem(Material.GOLD_AXE, 1, 31);

		setUnbreakable(Item, true, true);
		setName(Item, "Golden Double Axe");
		Item = setAttack(Item, 0.7, 7.0);
		Item = addDurabilityLore(Item, 32, 32);

		return Item;

	}

	public static ItemStack DiamondDoubleAxe() {

		ItemStack Item = createItem(Material.GOLD_AXE, 1, 30);

		setUnbreakable(Item, true, true);
		setName(Item, "Diamond Double Axe");
		Item = setAttack(Item, 0.7, 9.0);
		Item = addDurabilityLore(Item, 1561, 1561);

		return Item;

	}
	
	public static ItemStack EmeraldDoubleAxe() {

		ItemStack Item = createItem(Material.GOLD_AXE, 1, 29);

		setUnbreakable(Item, true, false);
		setName(Item, "Emerald Double Axe");
		Item = setAttack(Item, 0.7, 9.0);

		return Item;

	}

	public static int getCustomItemDurability(ItemStack item) {
		if ((item.getItemMeta() != null) && (!item.getItemMeta().spigot().isUnbreakable())) {
			Material m = item.getType();
			if ((m.equals(Material.DIAMOND_SWORD)) || (m.equals(Material.DIAMOND_AXE))
					|| (m.equals(Material.DIAMOND_PICKAXE)) || (m.equals(Material.DIAMOND_SPADE))
					|| (m.equals(Material.DIAMOND_HOE))) {
				return 1560;
			}
			if (m.equals(Material.WOOD_AXE)) {
				return 58;
			}
			if (m.equals(Material.STONE_AXE)) {
				return 130;
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

	public static boolean isDoubleAxe(ItemStack item) {
		if (item.getItemMeta().spigot().isUnbreakable()) {
			Material m = item.getType();
			if ((m.equals(Material.WOOD_AXE) && item.getDurability() == 59)
					|| (m.equals(Material.STONE_AXE) && item.getDurability() == 131)
					|| (m.equals(Material.IRON_AXE) && item.getDurability() == 250)
					|| (m.equals(Material.GOLD_AXE) && item.getDurability() <= 28)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	@SuppressWarnings("deprecation")
	public static void reduceDurability(ItemStack item, Player player, int durabilitytoremove) {
		List<String> lore = item.getItemMeta().getLore();
		for (String string : lore) {
			if (string.startsWith("Durability: ")) {
				String durability = string.replaceFirst("Durability: ", "");
				String segments[] = durability.split(" / ");
				int finaldurability = Integer.parseInt(segments[0]) - durabilitytoremove;
				if (finaldurability == 0) {
					player.getInventory().removeItem(player.getItemInHand()); // Check if there is an item in hand and if it should be broken due to low durability.
					player.playSound(player.getLocation(), Sound.ENTITY_ITEM_BREAK, 1.0F, 1.0F);
					return;
				} else {
					String newstring = string.replaceFirst(segments[0], Integer.toString(finaldurability));
					lore.remove(string);
					lore.add(newstring);
					if (finaldurability <= 10) {
						BountifulAPI.sendActionBar(player, ChatColor.RED + "" + ChatColor.BOLD + "Item Durability Low!");
					}
				}
			}
		}
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(im.getDisplayName());
		im.setLore(lore);
		item.setItemMeta(im);		
	}
	
}
