package fr.syl2010.mc_mods.coins.common.item;

import java.util.List;

import fr.syl2010.mc_mods.coins.common.CoinsTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Coins1 extends Item {

	public Coins1(){
		setCreativeTab(new CoinsTab());
		setUnlocalizedName("Coins1");
		setRegistryName("Coins1");
	}
	
	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List<String> list, boolean bool){
		list.add("1 coins");
	}
}
