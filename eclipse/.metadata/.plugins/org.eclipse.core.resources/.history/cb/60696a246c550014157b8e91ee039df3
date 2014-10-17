package com.binksayres.uumcrafting;

import org.apache.logging.log4j.Level;

import com.binksayres.uumcrafting.proxy.*;
import com.binksayres.uumcrafting.references.*;
import com.binksayres.uumcrafting.utility.*;
import com.binksayres.uumcrafting.handler.ConfigurationHandler;
import com.binksayres.uumcrafting.init.ModBlocks;
import com.binksayres.uumcrafting.init.ModItems;
import com.binksayres.uumcrafting.init.Recipes;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;

@Mod(modid = Reference.MOD_ID , name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class UUMCrafting 
{
	@Mod.Instance(Reference.MOD_ID)
	public static UUMCrafting instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInitMod(FMLPreInitializationEvent event) 
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		LogHelper.debug("Registering Items...");
		ModItems.init();
		
		LogHelper.debug("Registering Blocks...");
		ModBlocks.init();
		
		LogHelper.info("Pre Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void InitMod(FMLInitializationEvent event) 
	{
		Recipes.init();
		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void postInitMod(FMLInitializationEvent event) 
	{
		LogHelper.info("Post Initialization Complete!");
	}
}
