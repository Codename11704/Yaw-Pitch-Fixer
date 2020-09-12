package me.Codename_S.YAWPITCH;

import Commands.YAW;
import Commands.pitch;
import Commands.yawpitch;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("yaw")) {
            new YAW(sender,cmd, label, args);
            return true;
        }

        if (label.equalsIgnoreCase("yaw")) {
            new pitch(sender,cmd, label, args);
            return true;
        }

        if (label.equalsIgnoreCase("yaw")) {
            new yawpitch(sender,cmd, label, args);
            return true;
        }


        return false;
    }




}
