package com.craft4plus.custom.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CraftingRecipes {

	public static void addCustomCraftingRecipes() {

		// === EMERALD ITEMS === //
		addEmeraldSword();
		addEmeraldAxe();
		addEmeraldPickaxe();
		addEmeraldShovel();
		addEmeraldHoe();
		addEmeraldHelmet();
		addEmeraldChestplate();
		addEmeraldLeggings();
		addEmeraldBoots();

		// === DOUBLE AXES === //
		addWoodenDoubleAxe();
		addStoneDoubleAxe();
		addEndStoneDoubleAxe();
		addIronDoubleAxe();
		addGoldDoubleAxe();
		addDiamondDoubleAxe();
		addEmeraldDoubleAxe();

		// === STONE ARMOR === //
		addStoneHelmet();
		addStoneChestplate();
		addStoneLeggings();
		addStoneBoots();

		// === END STONE ITEMS === //
		addEndStoneSword();
		addEndStoneAxe();
		addEndStonePickaxe();
		addEndStoneShovel();
		addEndStoneHoe();
		addEndStoneHelmet();
		addEndStoneChestplate();
		addEndStoneLeggings();
		addEndStoneBoots();

		// === FOOD === //
		addGoldfish();

		// === SLIME ARMOR === //
		addSlimeBoots();

		// === SICKLES === //
		addWoodenSickle();
		addStoneSickle();
		addEndStoneSickle();
		addGoldenSickle();
		addIronSickle();
		addDiamondSickle();
		addEmeraldSickle();
		
		// === SLABS TO FULL BLOCKS === //
		addHalfSlabCombo(Material.STEP, Material.STONE);
		addHalfSlabCombo(Material.STEP, 3, Material.COBBLESTONE);
		addHalfSlabCombo(Material.STEP, 4, Material.BRICK);
		addHalfSlabCombo(Material.STEP, 6, Material.NETHER_BRICK);
		addHalfSlabCombo(Material.WOOD_STEP, Material.WOOD);
		addHalfSlabCombo(Material.WOOD_STEP, 1, Material.WOOD, 1);
		addHalfSlabCombo(Material.WOOD_STEP, 2, Material.WOOD, 2);
		addHalfSlabCombo(Material.WOOD_STEP, 3, Material.WOOD, 3);
		addHalfSlabCombo(Material.WOOD_STEP, 4, Material.WOOD, 4);
		addHalfSlabCombo(Material.WOOD_STEP, 5, Material.WOOD, 5);

	}

	// === EMERALD ITEMS === //
	private static void addEmeraldSword() {

		ItemStack item = CustomItemStack.EMERALD_SWORD;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("123", "456", "789");

		ItemRecipe1.setIngredient('1', Material.EMERALD);
		ItemRecipe1.setIngredient('4', Material.EMERALD);
		ItemRecipe1.setIngredient('7', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("123", "456", "789");

		ItemRecipe2.setIngredient('2', Material.EMERALD);
		ItemRecipe2.setIngredient('5', Material.EMERALD);
		ItemRecipe2.setIngredient('8', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe2);

		ShapedRecipe ItemRecipe3 = new ShapedRecipe(item);

		ItemRecipe3.shape("123", "456", "789");

		ItemRecipe3.setIngredient('3', Material.EMERALD);
		ItemRecipe3.setIngredient('6', Material.EMERALD);
		ItemRecipe3.setIngredient('9', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe3);
	}

	private static void addEmeraldAxe() {

		ItemStack item = CustomItemStack.EMERALD_AXE;

		ShapedRecipe ItemRecipe4 = new ShapedRecipe(item);

		ItemRecipe4.shape("123", "456", "789");

		ItemRecipe4.setIngredient('5', Material.STICK);
		ItemRecipe4.setIngredient('8', Material.STICK);
		ItemRecipe4.setIngredient('1', Material.EMERALD);
		ItemRecipe4.setIngredient('2', Material.EMERALD);
		ItemRecipe4.setIngredient('4', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe4);

		ShapedRecipe ItemRecipe5 = new ShapedRecipe(item);

		ItemRecipe5.shape("123", "456", "789");

		ItemRecipe5.setIngredient('5', Material.STICK);
		ItemRecipe5.setIngredient('8', Material.STICK);
		ItemRecipe5.setIngredient('3', Material.EMERALD);
		ItemRecipe5.setIngredient('2', Material.EMERALD);
		ItemRecipe5.setIngredient('6', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe5);
	}

	private static void addEmeraldPickaxe() {

		ItemStack item = CustomItemStack.EMERALD_PICKAXE;

		ShapedRecipe ItemRecipe6 = new ShapedRecipe(item);

		ItemRecipe6.shape("123", "456", "789");

		ItemRecipe6.setIngredient('5', Material.STICK);
		ItemRecipe6.setIngredient('8', Material.STICK);
		ItemRecipe6.setIngredient('1', Material.EMERALD);
		ItemRecipe6.setIngredient('2', Material.EMERALD);
		ItemRecipe6.setIngredient('3', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe6);
	}

	private static void addEmeraldShovel() {

		ItemStack item = CustomItemStack.EMERALD_SHOVEL;

		ShapedRecipe ItemRecipe7 = new ShapedRecipe(item);

		ItemRecipe7.shape("123", "456", "789");

		ItemRecipe7.setIngredient('5', Material.STICK);
		ItemRecipe7.setIngredient('8', Material.STICK);
		ItemRecipe7.setIngredient('2', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe7);
	}

	private static void addEmeraldHoe() {

		ItemStack item = CustomItemStack.EMERALD_HOE;

		ShapedRecipe ItemRecipe8 = new ShapedRecipe(item);

		ItemRecipe8.shape("123", "456", "789");

		ItemRecipe8.setIngredient('5', Material.STICK);
		ItemRecipe8.setIngredient('8', Material.STICK);
		ItemRecipe8.setIngredient('2', Material.EMERALD);
		ItemRecipe8.setIngredient('3', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe8);

		ShapedRecipe ItemRecipe9 = new ShapedRecipe(item);

		ItemRecipe9.shape("123", "456", "789");

		ItemRecipe9.setIngredient('5', Material.STICK);
		ItemRecipe9.setIngredient('8', Material.STICK);
		ItemRecipe9.setIngredient('1', Material.EMERALD);
		ItemRecipe9.setIngredient('2', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe9);
	}

	private static void addEmeraldHelmet() {

		ItemStack item = CustomItemStack.EMERALD_HELMET;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.EMERALD);
		ItemRecipe1.setIngredient('8', Material.EMERALD);
		ItemRecipe1.setIngredient('9', Material.EMERALD);
		ItemRecipe1.setIngredient('4', Material.EMERALD);
		ItemRecipe1.setIngredient('6', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("789", "456", "123");

		ItemRecipe2.setIngredient('4', Material.EMERALD);
		ItemRecipe2.setIngredient('5', Material.EMERALD);
		ItemRecipe2.setIngredient('6', Material.EMERALD);
		ItemRecipe2.setIngredient('1', Material.EMERALD);
		ItemRecipe2.setIngredient('3', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe2);
	}

	private static void addEmeraldChestplate() {

		ItemStack item = CustomItemStack.EMERALD_CHESTPLATE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.EMERALD);
		ItemRecipe1.setIngredient('9', Material.EMERALD);
		ItemRecipe1.setIngredient('4', Material.EMERALD);
		ItemRecipe1.setIngredient('5', Material.EMERALD);
		ItemRecipe1.setIngredient('6', Material.EMERALD);
		ItemRecipe1.setIngredient('1', Material.EMERALD);
		ItemRecipe1.setIngredient('2', Material.EMERALD);
		ItemRecipe1.setIngredient('3', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe1);

	}

	private static void addEmeraldLeggings() {

		ItemStack item = CustomItemStack.EMERALD_LEGGINGS;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.EMERALD);
		ItemRecipe1.setIngredient('8', Material.EMERALD);
		ItemRecipe1.setIngredient('9', Material.EMERALD);
		ItemRecipe1.setIngredient('4', Material.EMERALD);
		ItemRecipe1.setIngredient('6', Material.EMERALD);
		ItemRecipe1.setIngredient('1', Material.EMERALD);
		ItemRecipe1.setIngredient('3', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe1);

	}

	private static void addEmeraldBoots() {

		ItemStack item = CustomItemStack.EMERALD_BOOTS;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.EMERALD);
		ItemRecipe1.setIngredient('9', Material.EMERALD);
		ItemRecipe1.setIngredient('4', Material.EMERALD);
		ItemRecipe1.setIngredient('6', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("789", "456", "123");

		ItemRecipe2.setIngredient('4', Material.EMERALD);
		ItemRecipe2.setIngredient('6', Material.EMERALD);
		ItemRecipe2.setIngredient('1', Material.EMERALD);
		ItemRecipe2.setIngredient('3', Material.EMERALD);

		Bukkit.getServer().addRecipe(ItemRecipe2);
	}

	// === DOUBLE AXES === //

	@SuppressWarnings("deprecation")
	private static void addWoodenDoubleAxe() {

		ItemStack item = CustomItemStack.WOODEN_DOUBLE_AXE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("111", "121", "020");

		ItemRecipe1.setIngredient('1', Material.WOOD);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("111", "121", "020");

		ItemRecipe2.setIngredient('1', Material.WOOD, 1);
		ItemRecipe2.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe2);

		ShapedRecipe ItemRecipe3 = new ShapedRecipe(item);

		ItemRecipe3.shape("111", "121", "020");

		ItemRecipe3.setIngredient('1', Material.WOOD, 2);
		ItemRecipe3.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe3);

		ShapedRecipe ItemRecipe4 = new ShapedRecipe(item);

		ItemRecipe4.shape("111", "121", "020");

		ItemRecipe4.setIngredient('1', Material.WOOD, 3);
		ItemRecipe4.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe4);

		ShapedRecipe ItemRecipe5 = new ShapedRecipe(item);

		ItemRecipe5.shape("111", "121", "020");

		ItemRecipe5.setIngredient('1', Material.WOOD, 4);
		ItemRecipe5.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe5);

		ShapedRecipe ItemRecipe6 = new ShapedRecipe(item);

		ItemRecipe6.shape("111", "121", "020");

		ItemRecipe6.setIngredient('1', Material.WOOD, 5);
		ItemRecipe6.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe6);
	}

	private static void addStoneDoubleAxe() {

		ItemStack item = CustomItemStack.STONE_DOUBLE_AXE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("111", "121", "020");

		ItemRecipe1.setIngredient('1', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('2', Material.COBBLESTONE);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("111", "121", "020");

		ItemRecipe2.setIngredient('1', Material.STONE);
		ItemRecipe2.setIngredient('2', Material.STONE);

		Bukkit.getServer().addRecipe(ItemRecipe1);
	}

	private static void addEndStoneDoubleAxe() {

		ItemStack item = CustomItemStack.END_STONE_DOUBLE_AXE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('8', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('9', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('4', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('6', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('5', Material.STICK);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);
	}

	private static void addIronDoubleAxe() {

		ItemStack item = CustomItemStack.IRON_DOUBLE_AXE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.IRON_INGOT);
		ItemRecipe1.setIngredient('8', Material.IRON_INGOT);
		ItemRecipe1.setIngredient('9', Material.IRON_INGOT);
		ItemRecipe1.setIngredient('4', Material.IRON_INGOT);
		ItemRecipe1.setIngredient('6', Material.IRON_INGOT);
		ItemRecipe1.setIngredient('5', Material.STICK);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);
	}

	private static void addGoldDoubleAxe() {

		ItemStack item = CustomItemStack.GOLD_DOUBLE_AXE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.GOLD_INGOT);
		ItemRecipe1.setIngredient('8', Material.GOLD_INGOT);
		ItemRecipe1.setIngredient('9', Material.GOLD_INGOT);
		ItemRecipe1.setIngredient('4', Material.GOLD_INGOT);
		ItemRecipe1.setIngredient('6', Material.GOLD_INGOT);
		ItemRecipe1.setIngredient('5', Material.STICK);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);
	}

	private static void addDiamondDoubleAxe() {

		ItemStack item = CustomItemStack.DIAMOND_DOUBLE_AXE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.DIAMOND);
		ItemRecipe1.setIngredient('8', Material.DIAMOND);
		ItemRecipe1.setIngredient('9', Material.DIAMOND);
		ItemRecipe1.setIngredient('4', Material.DIAMOND);
		ItemRecipe1.setIngredient('6', Material.DIAMOND);
		ItemRecipe1.setIngredient('5', Material.STICK);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);
	}

	private static void addEmeraldDoubleAxe() {

		ItemStack item = CustomItemStack.EMERALD_DOUBLE_AXE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.EMERALD);
		ItemRecipe1.setIngredient('8', Material.EMERALD);
		ItemRecipe1.setIngredient('9', Material.EMERALD);
		ItemRecipe1.setIngredient('4', Material.EMERALD);
		ItemRecipe1.setIngredient('6', Material.EMERALD);
		ItemRecipe1.setIngredient('5', Material.STICK);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);
	}

	// === STONE ARMOR === //

	private static void addStoneHelmet() {

		ItemStack item = CustomItemStack.STONE_HELMET;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('8', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('9', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('4', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('6', Material.COBBLESTONE);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("789", "456", "123");

		ItemRecipe2.setIngredient('4', Material.COBBLESTONE);
		ItemRecipe2.setIngredient('5', Material.COBBLESTONE);
		ItemRecipe2.setIngredient('6', Material.COBBLESTONE);
		ItemRecipe2.setIngredient('1', Material.COBBLESTONE);
		ItemRecipe2.setIngredient('3', Material.COBBLESTONE);

		Bukkit.getServer().addRecipe(ItemRecipe2);

		ShapedRecipe ItemRecipe3 = new ShapedRecipe(item);

		ItemRecipe3.shape("789", "456", "123");

		ItemRecipe3.setIngredient('7', Material.STONE);
		ItemRecipe3.setIngredient('8', Material.STONE);
		ItemRecipe3.setIngredient('9', Material.STONE);
		ItemRecipe3.setIngredient('4', Material.STONE);
		ItemRecipe3.setIngredient('6', Material.STONE);

		Bukkit.getServer().addRecipe(ItemRecipe3);

		ShapedRecipe ItemRecipe4 = new ShapedRecipe(item);

		ItemRecipe4.shape("789", "456", "123");

		ItemRecipe4.setIngredient('4', Material.STONE);
		ItemRecipe4.setIngredient('5', Material.STONE);
		ItemRecipe4.setIngredient('6', Material.STONE);
		ItemRecipe4.setIngredient('1', Material.STONE);
		ItemRecipe4.setIngredient('3', Material.STONE);

		Bukkit.getServer().addRecipe(ItemRecipe4);
	}

	private static void addStoneChestplate() {

		ItemStack item = CustomItemStack.STONE_CHESTPLATE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('9', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('4', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('5', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('6', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('1', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('2', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('3', Material.COBBLESTONE);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("101", "111", "111");

		ItemRecipe2.setIngredient('1', Material.STONE);

		Bukkit.getServer().addRecipe(ItemRecipe2);

	}

	private static void addStoneLeggings() {

		ItemStack item = CustomItemStack.STONE_LEGGINGS;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('8', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('9', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('4', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('6', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('1', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('3', Material.COBBLESTONE);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("111", "101", "101");

		ItemRecipe2.setIngredient('1', Material.STONE);

		Bukkit.getServer().addRecipe(ItemRecipe2);

	}

	private static void addStoneBoots() {

		ItemStack item = CustomItemStack.STONE_BOOTS;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("101", "101", "000");

		ItemRecipe1.setIngredient('1', Material.COBBLESTONE);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("000", "101", "101");

		ItemRecipe2.setIngredient('1', Material.COBBLESTONE);

		Bukkit.getServer().addRecipe(ItemRecipe2);

		ShapedRecipe ItemRecipe3 = new ShapedRecipe(item);

		ItemRecipe3.shape("101", "101", "000");

		ItemRecipe3.setIngredient('1', Material.STONE);

		Bukkit.getServer().addRecipe(ItemRecipe3);

		ShapedRecipe ItemRecipe4 = new ShapedRecipe(item);

		ItemRecipe4.shape("000", "101", "101");

		ItemRecipe4.setIngredient('1', Material.STONE);

		Bukkit.getServer().addRecipe(ItemRecipe4);
	}

	// === END STONE ITEMS === //

	private static void addEndStoneSword() {

		ItemStack item = CustomItemStack.END_STONE_SWORD;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("123", "456", "789");

		ItemRecipe1.setIngredient('1', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('4', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('7', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("123", "456", "789");

		ItemRecipe2.setIngredient('2', Material.ENDER_STONE);
		ItemRecipe2.setIngredient('5', Material.ENDER_STONE);
		ItemRecipe2.setIngredient('8', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe2);

		ShapedRecipe ItemRecipe3 = new ShapedRecipe(item);

		ItemRecipe3.shape("123", "456", "789");

		ItemRecipe3.setIngredient('3', Material.ENDER_STONE);
		ItemRecipe3.setIngredient('6', Material.ENDER_STONE);
		ItemRecipe3.setIngredient('9', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe3);
	}

	private static void addEndStoneAxe() {

		ItemStack item = CustomItemStack.END_STONE_AXE;

		ShapedRecipe ItemRecipe4 = new ShapedRecipe(item);

		ItemRecipe4.shape("123", "456", "789");

		ItemRecipe4.setIngredient('5', Material.STICK);
		ItemRecipe4.setIngredient('8', Material.STICK);
		ItemRecipe4.setIngredient('1', Material.ENDER_STONE);
		ItemRecipe4.setIngredient('2', Material.ENDER_STONE);
		ItemRecipe4.setIngredient('4', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe4);

		ShapedRecipe ItemRecipe5 = new ShapedRecipe(item);

		ItemRecipe5.shape("123", "456", "789");

		ItemRecipe5.setIngredient('5', Material.STICK);
		ItemRecipe5.setIngredient('8', Material.STICK);
		ItemRecipe5.setIngredient('3', Material.ENDER_STONE);
		ItemRecipe5.setIngredient('2', Material.ENDER_STONE);
		ItemRecipe5.setIngredient('6', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe5);
	}

	private static void addEndStonePickaxe() {

		ItemStack item = CustomItemStack.END_STONE_PICKAXE;

		ShapedRecipe ItemRecipe6 = new ShapedRecipe(item);

		ItemRecipe6.shape("123", "456", "789");

		ItemRecipe6.setIngredient('5', Material.STICK);
		ItemRecipe6.setIngredient('8', Material.STICK);
		ItemRecipe6.setIngredient('1', Material.ENDER_STONE);
		ItemRecipe6.setIngredient('2', Material.ENDER_STONE);
		ItemRecipe6.setIngredient('3', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe6);
	}

	private static void addEndStoneShovel() {

		ItemStack item = CustomItemStack.END_STONE_SHOVEL;

		ShapedRecipe ItemRecipe7 = new ShapedRecipe(item);

		ItemRecipe7.shape("123", "456", "789");

		ItemRecipe7.setIngredient('5', Material.STICK);
		ItemRecipe7.setIngredient('8', Material.STICK);
		ItemRecipe7.setIngredient('2', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe7);
	}

	private static void addEndStoneHoe() {

		ItemStack item = CustomItemStack.END_STONE_HOE;

		ShapedRecipe ItemRecipe8 = new ShapedRecipe(item);

		ItemRecipe8.shape("123", "456", "789");

		ItemRecipe8.setIngredient('5', Material.STICK);
		ItemRecipe8.setIngredient('8', Material.STICK);
		ItemRecipe8.setIngredient('2', Material.ENDER_STONE);
		ItemRecipe8.setIngredient('3', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe8);

		ShapedRecipe ItemRecipe9 = new ShapedRecipe(item);

		ItemRecipe9.shape("123", "456", "789");

		ItemRecipe9.setIngredient('5', Material.STICK);
		ItemRecipe9.setIngredient('8', Material.STICK);
		ItemRecipe9.setIngredient('1', Material.ENDER_STONE);
		ItemRecipe9.setIngredient('2', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe9);
	}

	private static void addEndStoneHelmet() {

		ItemStack item = CustomItemStack.END_STONE_HELMET;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('8', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('9', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('4', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('6', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("789", "456", "123");

		ItemRecipe2.setIngredient('4', Material.ENDER_STONE);
		ItemRecipe2.setIngredient('5', Material.ENDER_STONE);
		ItemRecipe2.setIngredient('6', Material.ENDER_STONE);
		ItemRecipe2.setIngredient('1', Material.ENDER_STONE);
		ItemRecipe2.setIngredient('3', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe2);
	}

	private static void addEndStoneChestplate() {

		ItemStack item = CustomItemStack.END_STONE_CHESTPLATE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('9', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('4', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('5', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('6', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('1', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('2', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('3', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe1);

	}

	private static void addEndStoneLeggings() {

		ItemStack item = CustomItemStack.END_STONE_LEGGINGS;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('8', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('9', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('4', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('6', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('1', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('3', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe1);

	}

	private static void addEndStoneBoots() {

		ItemStack item = CustomItemStack.END_STONE_BOOTS;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("789", "456", "123");

		ItemRecipe1.setIngredient('7', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('9', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('4', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('6', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("789", "456", "123");

		ItemRecipe2.setIngredient('4', Material.ENDER_STONE);
		ItemRecipe2.setIngredient('6', Material.ENDER_STONE);
		ItemRecipe2.setIngredient('1', Material.ENDER_STONE);
		ItemRecipe2.setIngredient('3', Material.ENDER_STONE);

		Bukkit.getServer().addRecipe(ItemRecipe2);
	}

	// === FOOD === //

	private static void addGoldfish() {

		ItemStack item = CustomItemStack.GOLDFISH;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("111", "121", "111");

		ItemRecipe1.setIngredient('1', Material.GOLD_INGOT);
		ItemRecipe1.setIngredient('2', Material.RAW_FISH);

		Bukkit.getServer().addRecipe(ItemRecipe1);

	}

	// === SLIME ARMOR === //

	private static void addSlimeBoots() {

		ItemStack item = CustomItemStack.SLIME_BOOTS;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("101", "101", "000");

		ItemRecipe1.setIngredient('1', Material.SLIME_BALL);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("000", "101", "101");

		ItemRecipe2.setIngredient('1', Material.SLIME_BALL);

		Bukkit.getServer().addRecipe(ItemRecipe2);

	}

	// === SICKLES === //

	@SuppressWarnings("deprecation")
	public static void addWoodenSickle() {

		ItemStack item = CustomItemStack.WOODEN_SICKLE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("010", "001", "210");

		ItemRecipe1.setIngredient('1', Material.WOOD);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("010", "001", "210");

		ItemRecipe2.setIngredient('1', Material.WOOD, 1);
		ItemRecipe2.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe2);

		ShapedRecipe ItemRecipe3 = new ShapedRecipe(item);

		ItemRecipe3.shape("010", "001", "210");

		ItemRecipe3.setIngredient('1', Material.WOOD, 2);
		ItemRecipe3.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe3);

		ShapedRecipe ItemRecipe4 = new ShapedRecipe(item);

		ItemRecipe4.shape("010", "001", "210");

		ItemRecipe4.setIngredient('1', Material.WOOD, 3);
		ItemRecipe4.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe4);

		ShapedRecipe ItemRecipe5 = new ShapedRecipe(item);

		ItemRecipe5.shape("010", "001", "210");

		ItemRecipe5.setIngredient('1', Material.WOOD, 4);
		ItemRecipe5.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe5);

		ShapedRecipe ItemRecipe6 = new ShapedRecipe(item);

		ItemRecipe6.shape("010", "001", "210");

		ItemRecipe6.setIngredient('1', Material.WOOD, 5);
		ItemRecipe6.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe6);

		ShapedRecipe ItemRecipe7 = new ShapedRecipe(item);

		ItemRecipe7.shape("010", "001", "210");

		ItemRecipe7.setIngredient('1', Material.WOOD);
		ItemRecipe7.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe7);

		ShapedRecipe ItemRecipe8 = new ShapedRecipe(item);

		ItemRecipe8.shape("010", "001", "210");

		ItemRecipe8.setIngredient('1', Material.WOOD, 1);
		ItemRecipe8.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe8);

		ShapedRecipe ItemRecipe9 = new ShapedRecipe(item);

		ItemRecipe9.shape("010", "001", "210");

		ItemRecipe9.setIngredient('1', Material.WOOD, 2);
		ItemRecipe9.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe9);

		ShapedRecipe ItemRecipe10 = new ShapedRecipe(item);

		ItemRecipe10.shape("010", "001", "210");

		ItemRecipe10.setIngredient('1', Material.WOOD, 3);
		ItemRecipe10.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe10);

		ShapedRecipe ItemRecipe11 = new ShapedRecipe(item);

		ItemRecipe11.shape("010", "001", "210");

		ItemRecipe11.setIngredient('1', Material.WOOD, 4);
		ItemRecipe11.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe11);

		ShapedRecipe ItemRecipe12 = new ShapedRecipe(item);

		ItemRecipe12.shape("010", "001", "210");

		ItemRecipe12.setIngredient('1', Material.WOOD, 5);
		ItemRecipe12.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe12);

	}

	public static void addStoneSickle() {

		ItemStack item = CustomItemStack.STONE_SICKLE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("010", "001", "210");
		ItemRecipe1.setIngredient('1', Material.COBBLESTONE);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("010", "100", "012");
		ItemRecipe2.setIngredient('1', Material.COBBLESTONE);
		ItemRecipe2.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe2);

		ShapedRecipe ItemRecipe3 = new ShapedRecipe(item);

		ItemRecipe3.shape("010", "001", "210");
		ItemRecipe3.setIngredient('1', Material.STONE);
		ItemRecipe3.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe3);

		ShapedRecipe ItemRecipe4 = new ShapedRecipe(item);

		ItemRecipe4.shape("010", "100", "012");
		ItemRecipe4.setIngredient('1', Material.STONE);
		ItemRecipe4.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe4);

	}

	public static void addEndStoneSickle() {

		ItemStack item = CustomItemStack.END_STONE_SICKLE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("010", "001", "210");
		ItemRecipe1.setIngredient('1', Material.ENDER_STONE);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("010", "100", "012");
		ItemRecipe2.setIngredient('1', Material.ENDER_STONE);
		ItemRecipe2.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe2);

	}

	public static void addIronSickle() {

		ItemStack item = CustomItemStack.IRON_SICKLE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("010", "001", "210");
		ItemRecipe1.setIngredient('1', Material.IRON_INGOT);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("010", "100", "012");
		ItemRecipe2.setIngredient('1', Material.IRON_INGOT);
		ItemRecipe2.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe2);

	}

	public static void addGoldenSickle() {

		ItemStack item = CustomItemStack.GOLD_SICKLE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("010", "001", "210");
		ItemRecipe1.setIngredient('1', Material.GOLD_INGOT);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("010", "100", "012");
		ItemRecipe2.setIngredient('1', Material.GOLD_INGOT);
		ItemRecipe2.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe2);

	}

	public static void addDiamondSickle() {

		ItemStack item = CustomItemStack.DIAMOND_SICKLE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("010", "001", "210");
		ItemRecipe1.setIngredient('1', Material.DIAMOND);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("010", "100", "012");
		ItemRecipe2.setIngredient('1', Material.DIAMOND);
		ItemRecipe2.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe2);

	}

	public static void addEmeraldSickle() {

		ItemStack item = CustomItemStack.EMERALD_SICKLE;

		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("010", "001", "210");
		ItemRecipe1.setIngredient('1', Material.EMERALD);
		ItemRecipe1.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ShapedRecipe ItemRecipe2 = new ShapedRecipe(item);

		ItemRecipe2.shape("010", "100", "012");
		ItemRecipe2.setIngredient('1', Material.EMERALD);
		ItemRecipe2.setIngredient('2', Material.STICK);

		Bukkit.getServer().addRecipe(ItemRecipe2);

	}
	
	public static void addHalfSlabCombo(Material original, Material result) {
		addHalfSlabCombo(original, 1, 0, result, 1, 0);
	}
	
	public static void addHalfSlabCombo(Material original, int durabilityoriginal, Material result) {
		addHalfSlabCombo(original, 1, durabilityoriginal, result, 1, 0);
	}
	
	public static void addHalfSlabCombo(Material original, int durabilityoriginal, Material result, int durabilityresult) {
		addHalfSlabCombo(original, 1, durabilityoriginal, result, 1, durabilityresult);
	}
	
	@SuppressWarnings("deprecation")
	public static void addHalfSlabCombo(Material original, int quantityoriginal, int durabilityoriginal, Material result, int quantityresult, int durabilityresult) {
		
		ItemStack item = ItemStackUtilities.createItem(result, quantityresult, durabilityresult);
		
		ShapedRecipe ItemRecipe1 = new ShapedRecipe(item);

		ItemRecipe1.shape("100", "100", "000");

		ItemRecipe1.setIngredient('1', original, durabilityoriginal);

		Bukkit.getServer().addRecipe(ItemRecipe1);

		ItemRecipe1.shape("000", "100", "100");
		Bukkit.getServer().addRecipe(ItemRecipe1);
		
		ItemRecipe1.shape("010", "010", "000");
		Bukkit.getServer().addRecipe(ItemRecipe1);
		
		ItemRecipe1.shape("000", "010", "010");
		Bukkit.getServer().addRecipe(ItemRecipe1);
		
		ItemRecipe1.shape("001", "001", "000");
		Bukkit.getServer().addRecipe(ItemRecipe1);
		
		ItemRecipe1.shape("000", "001", "001");
		Bukkit.getServer().addRecipe(ItemRecipe1);
	}

}