package fr.syl2010.mc_mods.coins.common;

import fr.syl2010.mc_mods.coins.common.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber //useless in 1.12
public class Registry{

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		//Coins.le_log.debug("Register items..."); //usable in 1.12
	    event.getRegistry().register(new Coins1());
	    //Coins.le_log.debug("Items registered"); //usable in 1.12
	}
}
