package me.mrlukey676.mcsquidgame.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class redlight implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(sender instanceof Player){
            if(player.hasPermission("squid.redlight")){
                Bukkit.broadcastMessage(ChatColor.RED + "Red Light!");
                Bukkit.broadcastMessage(ChatColor.RED + "빨간불!");
            }else{
                player.sendMessage(ChatColor.RED + "You lack the required permission to do this!");
            }
        }else{
            Bukkit.broadcastMessage(ChatColor.RED + "Red Light!");
            Bukkit.broadcastMessage(ChatColor.RED + "빨간불!");
        }

        return false;
    }
}
