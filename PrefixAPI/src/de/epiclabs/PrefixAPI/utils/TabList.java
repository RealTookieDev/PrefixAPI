package de.epiclabs.PrefixAPI.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class TabList {
    static Scoreboard scoreboard;

	public static void loadTablist(){
        scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
		
        scoreboard.registerNewTeam("a").setPrefix("§4§lOwner §8● §7");
        scoreboard.registerNewTeam("b").setPrefix("§c§lAdmin §8● §7");
        scoreboard.registerNewTeam("c").setPrefix("§bDev §8● §7");
        scoreboard.registerNewTeam("d").setPrefix("§bScript §8● §7");
        scoreboard.registerNewTeam("e").setPrefix("§9SrMod §8● §7");
        scoreboard.registerNewTeam("f").setPrefix("§9Mod §8● §7");
        scoreboard.registerNewTeam("g").setPrefix("§3Support §8● §7");
        scoreboard.registerNewTeam("h").setPrefix("§eBuilder §8● §7");
        scoreboard.registerNewTeam("i").setPrefix("§5YT §8● §7");
        scoreboard.registerNewTeam("j").setPrefix("§5JrYT §8● §7");
        scoreboard.registerNewTeam("k").setPrefix("§dLegend §8● §7");
        scoreboard.registerNewTeam("l").setPrefix("§aUltra §8● §7");
        scoreboard.registerNewTeam("m").setPrefix("§2Hero §8● §7");
        scoreboard.registerNewTeam("n").setPrefix("§6Gold §8● §7");
        scoreboard.registerNewTeam("o").setPrefix("§7");
        
       
	}
    public static void setPrefix(Player p) {

        String team = "";
        if(PermissionsEx.getUser(p).inGroup("Owner")) {
            team = "a";
        } else if(PermissionsEx.getUser(p).inGroup("Admin")) {
            team = "b";
        } else if(PermissionsEx.getUser(p).inGroup("Developer")) {
            team = "c";
        } else if(PermissionsEx.getUser(p).inGroup("Script")) {
            team = "d";
        } else if(PermissionsEx.getUser(p).inGroup("SrModerator")) {
            team = "e";
        } else if(PermissionsEx.getUser(p).inGroup("Moderator")) {
            team = "f";
        } else if(PermissionsEx.getUser(p).inGroup("Supporter")) {
            team = "g";
        } else if(PermissionsEx.getUser(p).inGroup("Builder")) {
            team = "h";
        } else if(PermissionsEx.getUser(p).inGroup("YouTuber")) {
            team = "i";
        } else if(PermissionsEx.getUser(p).inGroup("JrYouTuber")) {
            team = "j";
        } else if(PermissionsEx.getUser(p).inGroup("Legend")) {
            team = "k";
        } else if(PermissionsEx.getUser(p).inGroup("Ultra")) {
            team = "l";
        } else if(PermissionsEx.getUser(p).inGroup("Hero")) {
            team = "m";
        } else if(PermissionsEx.getUser(p).inGroup("Gold") || PermissionsEx.getUser(p).inGroup("Premium")) {
            team = "n";
        } else {
            team = "o";
        }
        
        scoreboard.getTeam(team).addPlayer(p);
        p.setDisplayName(scoreboard.getTeam(team).getPrefix() + p.getName());
        
        for(Player a : Bukkit.getOnlinePlayers()) {
		            a.setScoreboard(scoreboard);
        }
    }
}
