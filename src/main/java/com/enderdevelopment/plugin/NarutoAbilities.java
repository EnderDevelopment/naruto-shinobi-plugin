package com.enderdevelopment.plugin;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionEffect;

public class NarutoAbilities {
    private final JavaPlugin plugin;

    public NarutoAbilities(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void applyRasengan(Player player) {
        // Apply Rasengan effect
        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 2));
        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 1));
        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 1));
        player.sendMessage("Rasengan activated!");
    }

    public void applyChidori(Player player) {
        // Apply Chidori effect
        player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 200, 1));
        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 1));
        player.sendMessage("Chidori activated!");
    }

    public void applyShadowClone(Player player) {
        // Apply Shadow Clone effect
        player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 200, 1));
        player.sendMessage("Shadow Clone activated!");
    }
}