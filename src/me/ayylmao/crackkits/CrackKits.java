package me.ayylmao.crackkits;

import org.bukkit.plugin.java.JavaPlugin;



public class CrackKits extends JavaPlugin {
	
	
	
	public void onEnable(){
		getLogger().info("CrackKits has been enabled!");
		 Kits commands = new Kits();
	        getCommand("assault").setExecutor(commands);
	        getCommand("recon").setExecutor(commands);
	      
	}
	public void onDisable(){
		getLogger().info("CrackKits has been disabled!");
	}
	
	
	
}

	
	

