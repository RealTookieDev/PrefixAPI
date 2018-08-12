package de.epiclabs.PrefixAPI.listener;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.epiclabs.PrefixAPI.utils.ScoreboardManager;
import de.epiclabs.PrefixAPI.utils.TabList;
import net.minecraft.server.v1_8_R3.ItemStack;

public class LISTENER_PlayerJoinEvent implements Listener{
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		TabList.setPrefix(p);
		ScoreboardManager.setBoardLOBBY(p);	
	}
}
