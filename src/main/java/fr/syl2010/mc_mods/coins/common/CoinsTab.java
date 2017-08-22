package fr.syl2010.mc_mods.coins.common;

import fr.syl2010.mc_mods.coins.common.item.Coins1;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CoinsTab extends CreativeTabs{

	public CoinsTab() {
		super("Coins");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(new Coins1());
	}

	
}
