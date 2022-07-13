package qqoopp.montistudio.spigottutorial;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpigotTutorial extends JavaPlugin {

    /* Runs when plugin is loaded on the server
     * (When the server is starting)
     */
    @Override
    public void onEnable() {
        System.out.print("Spigot Tutorial Plugin is on enabled!");
    }

    /* Runs when plugin is unloaded on the server
     * (When the server is closing)
     */
    @Override
    public void onDisable() {
        System.out.print("Spigot Tutorial Plugin is on enabled!");
    }
}
