package com.binksayres.uumcrafting.creativetab;

import com.binksayres.uumcrafting.init.ModItems;
import com.binksayres.uumcrafting.references.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabUUMC
{
	public static final CreativeTabs UUMC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) 
	{
		@Override
		public Item getTabIconItem()
		{
			// Defines the graphic that will display on the Creative Tab 
			return ModItems.uuMatter;
		}
		
	};
}
