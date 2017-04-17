/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.colecar.colortext;

import org.bukkit.plugin.java.JavaPlugin;
/**
 *
 * @author 3770
 */
public class main extends JavaPlugin{
    
    @Override
    public void onEnable(){
        getLogger().info("YouTube tutorial EP 1 Enabled");
        getCommand("message").setExecutor(new command());
    }
    
    @Override
    public void onDisable(){
        getLogger().info("YouTube tutorial EP 1 Disabled");

    }
    
    
    
    
    
    
}
