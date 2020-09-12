package Commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class YAW extends commandBase{

    public YAW(CommandSender sender, Command cmd, String label, String[] args) {
       super(sender,cmd, label, args);
    }


    //command process
    public void process() {

        if (!(sender instanceof Player)) {
            Player player = (Player) sender;
            if (args.length != 0) {


                int x = player.getLocation().getBlockX();
                int y = player.getLocation().getBlockY();
                int z = player.getLocation().getBlockZ();
                int pitch = Math.round(player.getLocation().getPitch());

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + sender + " " + x + " " + y + " " + z + " " + args[0] + " " + pitch);

            }
            else {
                player.sendMessage(ChatColor.RED + "Usage /yaw (yaw)");
            }

        }



    }


}
