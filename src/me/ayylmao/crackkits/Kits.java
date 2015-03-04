package me.ayylmao.crackkits;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Kits extends JavaPlugin {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		//-----------ASSAULT KIT--------------
	
		if (cmd.getName().equalsIgnoreCase("assault")) {
		
		Player player = (Player) sender;
		
		player.sendMessage(ChatColor.DARK_RED + "You now have the Assault kit.");
		
		//AK-47
		ItemStack dpax = new ItemStack(Material.DIAMOND_PICKAXE);
		dpax.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 100);
		player.getInventory().addItem(dpax);
		
		//Red ChestPlate
		ItemStack lcp = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta cplam = (LeatherArmorMeta)lcp.getItemMeta();
		cplam.setColor(Color.RED);
		lcp.setItemMeta(cplam);
		player.getInventory().setChestplate(lcp);
		
		//Orange Helmet
		ItemStack lhelmet  = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta hlam = (LeatherArmorMeta)lhelmet.getItemMeta();
		hlam.setColor(Color.ORANGE);
		lhelmet.setItemMeta(hlam);
		player.getInventory().setHelmet(lhelmet);
		
		//Black Leggings
		ItemStack lpants = new ItemStack(Material.LEATHER_LEGGINGS);
		LeatherArmorMeta plam = (LeatherArmorMeta)lpants.getItemMeta();
		plam.setColor(Color.BLACK);
		lpants.setItemMeta(plam);
		player.getInventory().setLeggings(lpants);
		
		//Black Boots
		ItemStack lboots = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta blam = (LeatherArmorMeta)lboots.getItemMeta();
		blam.setColor(Color.BLACK);
		lboots.setItemMeta(blam);
		player.getInventory().setBoots(lboots);
		
		//--------------RECON KIT--------------
	    if (cmd.getName().equalsIgnoreCase("recon")) {
	
		player.sendMessage(ChatColor.DARK_RED + "You now have the recon kit!");
		
		//Hunting Rifle
		ItemStack brod = new ItemStack(Material.BLAZE_ROD);
		brod.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 100);
		player.getInventory().addItem(brod);
		
		
		//Green Helmet
		ItemStack lghelmet = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta hglam = (LeatherArmorMeta)lghelmet.getItemMeta();
		hglam.setColor(Color.LIME);
		lhelmet.setItemMeta(hglam);
		player.getInventory().setHelmet(lghelmet);
		
		//Red Chestplate
		ItemStack lrcp = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta rcplam = (LeatherArmorMeta)lrcp.getItemMeta();
		cplam.setColor(Color.RED);
		lcp.setItemMeta(rcplam);
		player.getInventory().setChestplate(lrcp);
		
		//Leather Pants
		ItemStack lp = new ItemStack(Material.LEATHER_LEGGINGS);
		player.getInventory().setLeggings(lp);
		
		//Red Boots
		ItemStack blb = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta blbam = (LeatherArmorMeta)blb.getItemMeta();
		blam.setColor(Color.RED);
		blb.setItemMeta(blbam);
		player.getInventory().setChestplate(blb);
		
		
		return true;}
		
	}
	return false;
}

}
