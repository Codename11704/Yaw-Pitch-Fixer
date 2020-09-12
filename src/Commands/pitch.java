package Commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class pitch extends commandBase {


    public pitch(CommandSender sender, Command cmd, String label, String[] args) {
        super(sender, cmd, label, args);
    }


    //command process
    public void process() {

        if (!(sender instanceof Player)) {
            Player player = (Player) sender;

            if (args.length != 0) {
                int x = player.getLocation().getBlockX();
                int y = player.getLocation().getBlockY();
                int z = player.getLocation().getBlockZ();
                int yaw = Math.round(player.getLocation().getYaw());

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + player + " " + x + " " + y + " " + z + " " + yaw + " " + args[0]);
            }
            else {
                player.sendMessage(ChatColor.RED + "Usage /pitch (pitch)");
            }


        }

    }

}
