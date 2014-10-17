package com.binksayres.uumcrafting.block;

import java.util.Random;

import com.binksayres.uumcrafting.init.ModBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockUUMGenerator extends BlockMaster 
{
	public BlockUUMGenerator() 
	{
		super(Material.iron);
		this.setBlockName("uumGenerator");
		this.setBlockTextureName("uumGenerator");
	}
	
	@Override
	public Item getItemDropped(int par1, Random random, int par3)
	{
		return Item.getItemFromBlock(ModBlocks.uumGenerator);
	}

}
