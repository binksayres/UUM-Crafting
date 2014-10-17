package com.binksayres.uumcrafting.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static void init() 
	{
		// Vanilla Shaped Recipe 
		// GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
		
		// Vanilla Shapeless Recipe
		// GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
		
		// OreDictionary Shaped Recipe
		// GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "stickWood"));
		
		// OreDictionary Shapeless Recipe
		// GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), "stickWood", new ItemStack(ModItems.mapleLeaf)));
		
		// Custom UUM Recipes
		GameRegistry.addRecipe(new ItemStack(ModItems.uuRubber, 2),  "uuu", "u u", "u  ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(ModItems.uuCopperDust, 2), "uuu", "uu ", "uuu", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(ModItems.uuTinDust, 2), "uuu", " u ", " u ", 'u', new ItemStack(ModItems.uuMatter));
		
		// Basic UUM Recipes
		GameRegistry.addRecipe(new ItemStack(ModItems.uuMatter, 64), "   ", " s ", "   ", 's', new ItemStack(Blocks.cobblestone));
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone,16), "   ", " u ", "   ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Blocks.log,8),          " u ", "   ", "   ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.flint,32),        " u ", "uu ", "uu ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Blocks.glowstone, 8),   " u ", "u u", "uuu", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.clay_ball, 48),   "uu ", "u  ", "uu ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 4),    "u u", "u u", "   ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Blocks.sand, 36),       " u ", "u u", " u ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Blocks.cactus, 48),     " u ", "uuu", "u u", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.reeds, 64),       "u u", "u u", "u u", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.gunpowder, 16),   "uuu", "u  ", "uuu", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.bone, 32),        "u  ", "uu ", "u  ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.leather, 32),     "u u", " u ", "uuu", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.string, 32),      "u u", "   ", " u ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.coal, 8),         "  u", "u  ", "  u", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.redstone, 24),    "   ", " u ", "uuu", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Blocks.iron_ore, 2),    "u u", " u ", "u u", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_ore, 2),    " u ", "uuu", " u ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.ender_pearl),     "uuu", "u u", "uuu", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.blaze_rod, 4),    "u u", "uu ", "u u", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.feather, 32),     " u ", " u ", "u u", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.dye, 48, 0),      " uu", " uu", " u ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.dye, 9, 4),       " u ", " u ", " uu", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.dye, 32, 3),      "uu ", "  u", "uu ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.dye, 32, 1),      "uu ", " u ", "uu ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.dye, 32, 11),     "u u", " u ", " u ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.emerald, 2),      "uuu", "uuu", " u ", 'u', new ItemStack(ModItems.uuMatter));
		GameRegistry.addRecipe(new ItemStack(Items.diamond),         "uuu", "uuu", "uuu", 'u', new ItemStack(ModItems.uuMatter));
	}
}
