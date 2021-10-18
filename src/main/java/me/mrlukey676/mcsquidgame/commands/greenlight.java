package me.mrlukey676.mcsquidgame.commands;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class greenlight implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(sender instanceof Player){
            if(player.hasPermission("squid.greenlight")){
                Bukkit.broadcastMessage(ChatColor.GREEN + "Green Light!");
                Bukkit.broadcastMessage(ChatColor.GREEN + "초록불!");
            }else{
                player.sendMessage(ChatColor.RED + "You lack the required permission to do this!");
            }
        }else{
            Bukkit.broadcastMessage(ChatColor.GREEN + "Green Light!");
            Bukkit.broadcastMessage(ChatColor.GREEN + "초록불!");
        }

        return false;
    }
}
