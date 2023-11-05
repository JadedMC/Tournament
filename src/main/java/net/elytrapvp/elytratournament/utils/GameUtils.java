package net.elytrapvp.elytratournament.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class GameUtils {

    /**
     * Get the health of a player, formatted, and in percent form.
     * @param player Player to get health of.
     * @return Formatted health of player.
     */
    public static String getFormattedHealth(Player player) {
        int percent = MathUtils.percent(player.getHealth(), 20.0);
        ChatColor color;

        if(percent < 25) {
            color = ChatColor.RED;
        }
        else if(percent < 50) {
            color = ChatColor.GOLD;
        }
        else if(percent < 75) {
            color = ChatColor.YELLOW;
        }
        else {
            color = ChatColor.GREEN;
        }

        return "" + color + percent + "%";
    }

}
