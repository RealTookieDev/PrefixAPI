package de.epiclabs.PrefixAPI.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;


import ru.tehkode.permissions.bukkit.PermissionsEx;

public class LISTENER_AsyncPlayerChatEvent implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e){
		Player player = e.getPlayer();
		
		String msg = e.getMessage().replaceAll( "%", "%%" );

            if( PermissionsEx.getUser(player).inGroup("Owner")) {
                e.setFormat("§4§lOwner §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Admin")) {
                e.setFormat("§c§lAdmin §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Developer")) {
                e.setFormat("§b§lDeveloper §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Scripter")) {
                e.setFormat("§b§lScripter §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("SrModerator")) {
                e.setFormat("§9§lSrModerator §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Moderator")) {
                e.setFormat("§9§lModerator §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Supporter")) {
                e.setFormat("§3§lSupporter §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Builder")) {
                e.setFormat("§e§lBuilder §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("YouTuber")) {
                e.setFormat("§5YouTuber §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("JrYouTuber")) {
                e.setFormat("§5JrYouTuber §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Legend")) {
                e.setFormat("§dLegend §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Ultra")) {
                e.setFormat("§aUltra §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Hero")) {
                e.setFormat("§2Hero §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Gold")) {
                e.setFormat("§6Gold §8● §7" + player.getName() + " §8» §7" + msg);
            } else if(PermissionsEx.getUser(player).inGroup("Spieler")) {
            	e.setFormat("§7Spieler §8● §7" + player.getName() + " §8» §7" + msg);
            }
	}

}
