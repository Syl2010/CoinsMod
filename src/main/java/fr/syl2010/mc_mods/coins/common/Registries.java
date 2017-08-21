package fr.syl2010.mc_mods.coins.common;

import fr.syl2010.mc_mods.coins.common.item.testItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Registries {

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
	    event.getRegistry().register(new testItem());
	}
	
}
