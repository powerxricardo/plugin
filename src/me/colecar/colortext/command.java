/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.colecar.colortext;

/**
 *
 * @author 3770
 */

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String arg2, String[] args) {
        if(sender instanceof Player) {
            sender.sendMessage("player sent message");
            return true;
        } else {
            sender.sendMessage("Console sent message");
            return true;
        }
    }
    
}
