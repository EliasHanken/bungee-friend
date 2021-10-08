package me.streafe.bungeefriend;

import net.md_5.bungee.api.plugin.Plugin;

public class BungeeFriend extends Plugin {

    public void onEnable(){
        getLogger().info("Bungee Friend v"+getProxy().getVersion()+" loaded");
    }


}
