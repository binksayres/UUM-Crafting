package com.binksayres.uumcrafting.handler;

import java.io.*;

import com.binksayres.uumcrafting.references.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.*;

public class ConfigurationHandler 
{
	public static Configuration configuration; 
	
	// *** Define the configuration values ***
	public static boolean testValue = false;
	// *** End of configuration values **
	
	public static void init(File configFile)
	{
		// Create the configuration object
		if (configuration == null) 
		{ 
			configuration = new Configuration(configFile); 
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) 
		{
			// Resync configs
		}
	}
	
	private static void loadConfiguration() 
	{
		testValue = configuration.getBoolean("testValue", Configuration.CATEGORY_GENERAL, true, "This is an example config value");
		
		if (configuration.hasChanged()) { configuration.save(); }
	}
	
}
