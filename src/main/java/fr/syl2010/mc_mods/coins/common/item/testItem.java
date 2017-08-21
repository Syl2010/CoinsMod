package fr.syl2010.mc_mods.coins.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class testItem extends Item {

	public testItem(){
		setCreativeTab(CreativeTabs.SEARCH);
		setDamage(new ItemStack(this), 10);
		setMaxStackSize(20);
		setUnlocalizedName("TestItem");
		setHarvestLevel("axe", 2);
	}
}
