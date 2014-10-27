package com.binksayres.uumcrafting.init;

import com.binksayres.uumcrafting.item.*;
import com.binksayres.uumcrafting.references.*;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	// creating a reference Item (public static final ItemMaster mapleLeaf = new ItemMapleLeaf();)
	public static final ItemMaster uuMatter = new ItemUUMatter();
	public static final ItemMaster uuRubber = new ItemUURubber();
	public static final ItemMaster uuCopperDust = new ItemUUCopperDust();
	public static final ItemMaster uuCopperIngot = new ItemUUCopperIngot();
	public static final ItemMaster uuTinDust = new ItemUUTinDust();
	public static final ItemMaster uuTinIngot = new ItemUUTinIngot();
	
	public static void init()
	{
		// Add item to GameRegistry (GameRegistry.registerItem(mapleLeaf, "mapleLeaf");)
		GameRegistry.registerItem(uuMatter, Names.Items.matter);
		GameRegistry.registerItem(uuRubber, Names.Items.rubber);
		GameRegistry.registerItem(uuCopperDust, Names.Items.copperDust);
		GameRegistry.registerItem(uuCopperIngot, Names.Items.copperIngot);
		GameRegistry.registerItem(uuTinDust, Names.Items.tinDust);
		GameRegistry.registerItem(uuTinIngot, Names.Items.tinIngot);
	}
}
