package de.tebrox.utilityAPI.text;

import net.md_5.bungee.api.ChatColor;

public class ColorUtils {
    public static String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
