package de.epiclabs.PrefixAPI.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.epiclabs.PrefixAPI.main.Main;
import de.epiclabs.PrefixAPI.utils.TabList;
import de.epiclabs.PrefixAPI.listener.LISTENER_AsyncPlayerChatEvent;
import de.epiclabs.PrefixAPI.listener.LISTENER_PlayerJoinEvent;


public class Main extends JavaPlugin{
	
	@Override
	public void onEnable(){
        Bukkit.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");

		TabList.loadTablist();
		
		Bukkit.getPluginManager().registerEvents(new LISTENER_PlayerJoinEvent(), this);

		Bukkit.getPluginManager().registerEvents(new LISTENER_AsyncPlayerChatEvent(), this);
}
}

