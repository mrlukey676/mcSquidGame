package me.mrlukey676.mcsquidgame;

import me.mrlukey676.mcsquidgame.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class McSquidGame extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic.
        System.out.println("[SQUIDGAME] Successfully loaded MC Squid Game Plugin.");
        getCommand("redlight").setExecutor(new redlight());
        getCommand("greenlight").setExecutor(new greenlight());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[SQUIDGAME] Thanks for playing!");
    }
}
