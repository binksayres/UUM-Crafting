package com.binksayres.uumcrafting.client.gui;

import java.util.List;

import com.binksayres.uumcrafting.handler.*;
import com.binksayres.uumcrafting.references.*;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.*;
import cpw.mods.fml.client.config.*;

public class ModGuiConfig extends GuiConfig{

	public ModGuiConfig(GuiScreen guiString) {
		super(guiString, 
				new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), 
				Reference.MOD_ID,
				false,
				false, 
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}
}