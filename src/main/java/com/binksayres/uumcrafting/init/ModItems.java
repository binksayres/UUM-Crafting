package com.binksayres.uumcrafting.init;

import com.binksayres.uumcrafting.item.*;
import com.binksayres.uumcrafting.references.Reference;

import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	// creating a reference Item (public static final ItemMaster mapleLeaf = new ItemMapleLeaf();)
	public static final ItemMaster uuMatter = new ItemUUMatter();
	
	public static void init()
	{
		// Add item to GameRegistry (GameRegistry.registerItem(mapleLeaf, "mapleLeaf");)
		GameRegistry.registerItem(uuMatter, "uuMatter");
	}
}