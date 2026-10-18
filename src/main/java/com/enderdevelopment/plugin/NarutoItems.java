package com.enderdevelopment.plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class NarutoItems {
    private final JavaPlugin plugin;

    public NarutoItems(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void giveRasenganScroll(Player player) {
        ItemStack rasenganScroll = new ItemStack(Material.PAPER);
        ItemMeta meta = rasenganScroll.getItemMeta();
        meta.setDisplayName("Rasengan Scroll");
        meta.setLore(Arrays.asList("Right-click to cast Rasengan"));
        rasenganScroll.setItemMeta(meta);
        player.getInventory().addItem(rasenganScroll);
    }

    public void giveChidoriScroll(Player player) {
        ItemStack chidoriScroll = new ItemStack(Material.PAPER);
        ItemMeta meta = chidoriScroll.getItemMeta();
        meta.setDisplayName("Chidori Scroll");
        meta.setLore(Arrays.asList("Right-click to cast Chidori"));
        chidoriScroll.setItemMeta(meta);
        player.getInventory().addItem(chidoriScroll);
    }

    public void giveShadowCloneScroll(Player player) {
        ItemStack shadowCloneScroll = new ItemStack(Material.PAPER);
        ItemMeta meta = shadowCloneScroll.getItemMeta();
        meta.setDisplayName("Shadow Clone Scroll");
        meta.setLore(Arrays.asList("Right-click to cast Shadow Clone"));
        shadowCloneScroll.setItemMeta(meta);
        player.getInventory().addItem(shadowCloneScroll);
    }
}