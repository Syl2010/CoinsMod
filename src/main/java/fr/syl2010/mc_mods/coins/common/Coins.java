package fr.syl2010.mc_mods.coins.common;

import java.io.File;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = "coins", version = "1.0.0.0")
public class Coins {

	public static Logger le_log;
	public static Side le_type;
	public static File le_dossier_config;
	public static File le_fichier_config;
	
	@EventHandler
	public static void event(FMLPreInitializationEvent event){
		le_log = event.getModLog();
		le_type = event.getSide();
		le_dossier_config = event.getModConfigurationDirectory();
		le_fichier_config = event.getSuggestedConfigurationFile();
		
		le_log.debug("FMLPreInitializationEvent at "+le_type);
		
		MinecraftForge.EVENT_BUS.register(Registry.class);
		
		le_log.debug("End of FMLPreInitializationEvent");
	}
}
