package com.craft4plus.minigames;

import com.craft4plus.main.Main;
import com.craft4plus.minigames.survivalgames.SGPlayerDetection;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class LegacyPvP implements Listener {

	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent event) {
		if ((event.getDamager() instanceof Player)) {
			Player player = (Player) event.getDamager();
			AttributeInstance instance = player.getAttribute(Attribute.GENERIC_ATTACK_SPEED);
			if ((Main.sw.getCurrentGameTracker().isInGame(player.getUniqueId())) || (SGPlayerDetection.InSGGame(player))) {
				if (player.getInventory().getItemInMainHand().getType() == Material.DIAMOND_AXE) {
					event.setDamage(event.getDamage() - 6.0D + 3.0D);
				} else if (player.getInventory().getItemInMainHand().getType() == Material.IRON_AXE) {
					event.setDamage(event.getDamage() - 6.0D + 2.5D);
				} else if (player.getInventory().getItemInMainHand().getType() == Material.STONE_AXE) {
					event.setDamage(event.getDamage() - 6.0D + 2.0D);
				} else if ((player.getInventory().getItemInMainHand().getType() == Material.GOLD_AXE)
						|| (player.getInventory().getItemInMainHand().getType() == Material.WOOD_AXE)) {
					event.setDamage(event.getDamage() - 4.0D + 1.5D);
				} else if (player.getInventory().getItemInMainHand().getType() == Material.DIAMOND_SPADE) {
					event.setDamage(event.getDamage() - 2.5D + 2.0D);
				} else if (player.getInventory().getItemInMainHand().getType() == Material.STONE_SPADE) {
					event.setDamage(event.getDamage() - 0.75D + 1.25D);
				}
				instance.setBaseValue(18.0D);
			} else {
				instance.setBaseValue(4.0D);
			}

		}

	}

	@EventHandler
	public void onWorldChange(PlayerChangedWorldEvent event) {
		Player player = (Player) event.getPlayer();
		AttributeInstance instance = player.getAttribute(Attribute.GENERIC_ATTACK_SPEED);
		if ((Main.sw.getCurrentGameTracker().isInGame(player.getUniqueId()))) {
			instance.setBaseValue(18.0D);
		} else {
			instance.setBaseValue(4.0D);
		}

	}

}