package me.thundercaster.duel.commands;

import me.thundercaster.duel.Duel;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;

import java.util.ArrayList;
import java.util.List;
//unfinished
public class GDuelCommand implements CommandExecutor, Listener {

    Duel plugin;

    public GDuelCommand(Duel plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender == null | args==null){
            return false;
        }

        if (sender instanceof Player p){
            if (args.length != 4){
                p.sendMessage(ChatColor.RED + "Please enter (name of teamate) (enemy) (enemy) (type of gear)");

            }


        }


        return true;
    }





    @EventHandler
    public void PlayerDamageEvent(EntityDamageByEntityEvent e){
        if (e.getDamager() instanceof Player p){
            if (e.getEntity() instanceof Player p2){



            }
        }
    }
}
