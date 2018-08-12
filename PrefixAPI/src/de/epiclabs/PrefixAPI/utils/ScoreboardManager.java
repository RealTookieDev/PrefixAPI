package de.epiclabs.PrefixAPI.utils;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Team;

import de.epiclabs.PrefixAPI.main.Main;
import net.minecraft.server.v1_8_R3.IScoreboardCriteria;
import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PacketPlayOutScoreboardDisplayObjective;
import net.minecraft.server.v1_8_R3.PacketPlayOutScoreboardObjective;
import net.minecraft.server.v1_8_R3.PacketPlayOutScoreboardScore;
import net.minecraft.server.v1_8_R3.Scoreboard;
import net.minecraft.server.v1_8_R3.ScoreboardObjective;
import net.minecraft.server.v1_8_R3.ScoreboardScore;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ScoreboardManager {
	
	public static void setBoardLOBBY(Player p) {
        Scoreboard scoreboard = new Scoreboard();
        ScoreboardObjective obj = scoreboard.registerObjective("zagd", IScoreboardCriteria.b);
        obj.setDisplayName("§8§l« §2§lEPICLABS §8§l»");
        PacketPlayOutScoreboardObjective createPacket = new PacketPlayOutScoreboardObjective(obj, 0);
        PacketPlayOutScoreboardDisplayObjective display = new PacketPlayOutScoreboardDisplayObjective(1, obj);

        ScoreboardScore s1 = new ScoreboardScore(scoreboard, obj, "§7§2                      ");
        ScoreboardScore s2 = new ScoreboardScore(scoreboard, obj, "§b✦ §8▏  §7Dein Name");
        ScoreboardScore s3 = new ScoreboardScore(scoreboard, obj, "§8➥  §6" + p.getName());
        ScoreboardScore s4 = new ScoreboardScore(scoreboard, obj, "§7§0 ");
        ScoreboardScore s5 = new ScoreboardScore(scoreboard, obj, "§a❁ §8▏  §7Dein Rang");
        ScoreboardScore s6 = null;
        if(PermissionsEx.getUser(p).inGroup("Owner")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §4§lOwner");
        }else if(PermissionsEx.getUser(p).inGroup("Admin")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §c§lAdministrator");
        }else if(PermissionsEx.getUser(p).inGroup("Scripter")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §bScripter");
        }else if(PermissionsEx.getUser(p).inGroup("Developer")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §bDeveloper");
        }else if(PermissionsEx.getUser(p).inGroup("SrModerator")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §9SrModerator");
        }else if(PermissionsEx.getUser(p).inGroup("Moderator")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §9Moderator");
        }else if(PermissionsEx.getUser(p).inGroup("Supporter")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §3Supporter");
        }else if(PermissionsEx.getUser(p).inGroup("Builder")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §eBuilder");
        }else if(PermissionsEx.getUser(p).inGroup("YouTuber")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §5YouTuber");
        }else if(PermissionsEx.getUser(p).inGroup("JrYouTuber")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §5JrYouTuber");
        }else if(PermissionsEx.getUser(p).inGroup("Legend")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §dLegend");
        }else if(PermissionsEx.getUser(p).inGroup("Ultra")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §aUltra");
        }else if(PermissionsEx.getUser(p).inGroup("Hero")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §2Hero");
        }else if(PermissionsEx.getUser(p).inGroup("Gold")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §6Gold");
        }else if(PermissionsEx.getUser(p).inGroup("Spieler")){
        	s6 = new ScoreboardScore(scoreboard, obj, "§8➥  §7Spieler");
        }
        UUID uuid = null;
        ScoreboardScore s7 = new ScoreboardScore(scoreboard, obj, "§7§9    ");
        ScoreboardScore s8 = new ScoreboardScore(scoreboard, obj, "§9✸ §8▏  §7Deine Coins");
        ScoreboardScore s9 = new ScoreboardScore(scoreboard, obj, "§8➥  §6");
        ScoreboardScore s10 = new ScoreboardScore(scoreboard, obj, "§7§9 ");
        ScoreboardScore s11 = new ScoreboardScore(scoreboard, obj, "§c✎ §8▏  §7TeamSpeak");
        ScoreboardScore s12 = new ScoreboardScore(scoreboard, obj, "§8➥  §6EpicLabs.de");
        ScoreboardScore s13 = new ScoreboardScore(scoreboard, obj, "§0 ");

        s1.setScore(11);
        s2.setScore(10);
        s3.setScore(9);
        s4.setScore(8);
        s5.setScore(7);
        s6.setScore(6);
        s7.setScore(5);
        s8.setScore(4);
        s9.setScore(3);
        s10.setScore(2);
        s11.setScore(1);
        s12.setScore(0);
        s13.setScore(-1);

        PacketPlayOutScoreboardObjective removePacket = new PacketPlayOutScoreboardObjective(obj, 1);
        PacketPlayOutScoreboardScore pa1 = new PacketPlayOutScoreboardScore(s1);
        PacketPlayOutScoreboardScore pa2 = new PacketPlayOutScoreboardScore(s2);
        PacketPlayOutScoreboardScore pa3 = new PacketPlayOutScoreboardScore(s3);
        PacketPlayOutScoreboardScore pa4 = new PacketPlayOutScoreboardScore(s4);
        PacketPlayOutScoreboardScore pa5 = new PacketPlayOutScoreboardScore(s5);
        PacketPlayOutScoreboardScore pa6 = new PacketPlayOutScoreboardScore(s6);
        PacketPlayOutScoreboardScore pa7 = new PacketPlayOutScoreboardScore(s7);
        PacketPlayOutScoreboardScore pa8 = new PacketPlayOutScoreboardScore(s8);
        PacketPlayOutScoreboardScore pa9 = new PacketPlayOutScoreboardScore(s9);
        PacketPlayOutScoreboardScore pa10 = new PacketPlayOutScoreboardScore(s10);
        PacketPlayOutScoreboardScore pa11 = new PacketPlayOutScoreboardScore(s11);
        PacketPlayOutScoreboardScore pa12 = new PacketPlayOutScoreboardScore(s12);
        PacketPlayOutScoreboardScore pa13 = new PacketPlayOutScoreboardScore(s13);

        sendPacket(removePacket, p);
        sendPacket(createPacket, p);
        sendPacket(display, p);

        sendPacket(pa1, p);
        sendPacket(pa2, p);
        sendPacket(pa3, p);
        sendPacket(pa4, p);
        sendPacket(pa5, p);
        sendPacket(pa6, p);
        sendPacket(pa7, p);
        sendPacket(pa8, p);
        sendPacket(pa9, p);
        sendPacket(pa10, p);
        sendPacket(pa11, p);
        sendPacket(pa12, p);
        sendPacket(pa13, p);
    }

    private static void sendPacket(Packet packet, Player p) {
        ((CraftPlayer )p).getHandle().playerConnection.sendPacket(packet);
    }
    
    public static org.bukkit.scoreboard.Scoreboard board;

    public static Team getTeamNormal(org.bukkit.scoreboard.Scoreboard board, Player p){

        if( PermissionsEx.getUser(p).inGroup("Owner")){
            return board.getTeam("a");
        }else if(PermissionsEx.getUser(p).inGroup("Admin")){
            return board.getTeam("b");
        }else if( PermissionsEx.getUser(p).inGroup("Developer")){
            return board.getTeam("c");
        }else if(PermissionsEx.getUser(p).inGroup("Scripter")){
            return board.getTeam("d");
        }else if(PermissionsEx.getUser(p).inGroup("SrModerator")){
            return board.getTeam("e");
        }else if(PermissionsEx.getUser(p).inGroup("Moderator")){
            return board.getTeam("f");
        }else if(PermissionsEx.getUser(p).inGroup("Supporter")){
            return board.getTeam("g");
        }else if(PermissionsEx.getUser(p).inGroup("Builder")){
            return board.getTeam("h");
        }else if(PermissionsEx.getUser(p).inGroup("YouTuber")){
            return board.getTeam("i");
        }else if(PermissionsEx.getUser(p).inGroup("JrYouTuber")){
            return board.getTeam("j");
        }else if(PermissionsEx.getUser(p).inGroup("Legend")){
            return board.getTeam("k");
        }else if(PermissionsEx.getUser(p).inGroup("Ultra")){
            return board.getTeam("l");
        }else if(PermissionsEx.getUser(p).inGroup("Hero")){
            return board.getTeam("m");
        }else if(PermissionsEx.getUser(p).inGroup("Gold")){
            return board.getTeam("n");
        }
        return board.getTeam("o");
    }
	
	
	public static void setStandardTablist(Player p){

	        board = Bukkit.getScoreboardManager().getNewScoreboard();

	        Team Owner = board.registerNewTeam("a");
	        Team Admin = board.registerNewTeam("b");
	        Team Dev = board.registerNewTeam("c");
	        Team Script = board.registerNewTeam("d");
	        Team SrMod = board.registerNewTeam("e");
	        Team Mod = board.registerNewTeam("f");
	        Team Supporter = board.registerNewTeam("g");
	        Team Builder = board.registerNewTeam("h");
	        Team YouTuber = board.registerNewTeam("i");
	        Team JrYouTuber = board.registerNewTeam("j");
	        Team Legend = board.registerNewTeam("k");
	        Team Ultra = board.registerNewTeam("l");
	        Team Hero = board.registerNewTeam("m");
	        Team Gold = board.registerNewTeam("n");
	        Team Spieler = board.registerNewTeam("o");

	        Spieler.setPrefix("§7");
	        Gold.setPrefix("§6Gold §8● §7");
	        Hero.setPrefix("§2Hero §8● §7");
	        Ultra.setPrefix("§aUltra §8● §7");
	        Legend.setPrefix("§dLegend §8● §7");
	        JrYouTuber.setPrefix("§5JrYT §8● §7");
	        YouTuber.setPrefix("§5YT §8● §7");
	        Builder.setPrefix("§eBuilder §8● §7");
	        Supporter.setPrefix("§3Support §8● §7");
	        Mod.setPrefix("§9Mod §8● §7");
	        SrMod.setPrefix("§9SrMod §8● §7");
	        Script.setPrefix("§bScript §8● §7");
	        Dev.setPrefix("§bDev §8● §7");
	        Admin.setPrefix("§c§lAdmin §8● §7");
	        Owner.setPrefix("§4§lOwner §8● §7");


	        for (Player all : Bukkit.getOnlinePlayers()) {
	            Team playerTeam = ScoreboardManager.getTeamNormal(board, all);
	            if (playerTeam.hasEntry(all.getName())) continue;
	            playerTeam.addEntry(all.getName());
	        }
	        
	        p.setScoreboard( Bukkit.getScoreboardManager().getNewScoreboard() );
	        p.setScoreboard( board );

	}

}
