package com.binksayres.uumcrafting.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreDict
{
	public static void init() 
	{
		OreDictionary.registerOre("itemRubber", ModItems.uuRubber);
		OreDictionary.registerOre("dustCopper", ModItems.uuCopperDust);
		OreDictionary.registerOre("ingotCopper", ModItems.uuCopperIngot);
		OreDictionary.registerOre("dustTin", ModItems.uuTinDust);
		OreDictionary.registerOre("ingotTin", ModItems.uuTinIngot);
	}
}
