package com.craft4plus.tips;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.connorlinfoot.bountifulapi.BountifulAPI;
import com.craft4plus.listeners.PlayerJoin;
import com.craft4plus.main.Main;

import net.md_5.bungee.api.ChatColor;

public class Tips {
	
	static List<String> listCrafter = new ArrayList<String>(); // List of Crafter Tips
	static List<String> listMiner = new ArrayList<String>(); // List of Miner Tips
	static List<String> listWarrior = new ArrayList<String>(); // List of Warrior Tips
	
	public static void addValues() {		
		// Add Crafter Tips to the list
		listCrafter.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Sell items in the Survival Shop to get coins!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listCrafter.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "You can get the Miner Rank using 10,000 in-game coins!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listCrafter.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "There are huge Creative Plots available!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listCrafter.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "There are plenty of Minigames available!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listCrafter.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Join Discord to chat with other players! discord.craft4plus.ml" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listCrafter.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Need help with the server? Tell us on Discord!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listCrafter.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Want to chat with your mates only? Use one of the Chat Chanels!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listCrafter.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Hard to get resources in SkyBlock? Use the shop!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listCrafter.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "mcMMO is available! Use it to gain amazing advantages." + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listCrafter.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Want a map of the server? Visit map.craft4plus.ml" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		
		// Add Miner Tips to the list
		listMiner.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Sell items in the Survival Shop to get coins!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listMiner.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "You can get the Warrior Rank using 20,000 in-game coins!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listMiner.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "There are huge Creative Plots available!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listMiner.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "There are plenty of Minigames available!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listMiner.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Join Discord to chat with other players! discord.craft4plus.ml" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listMiner.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Need help with the server? Tell us on Discord!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listMiner.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Want to chat with your mates only? Use one of the Chat Chanels!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listMiner.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Hard to get resources in SkyBlock? Use the shop!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listMiner.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "mcMMO is available! Use it to gain amazing advantages." + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listMiner.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Want a map of the server? Visit map.craft4plus.ml" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		
		// Add Warrior Tips to the list
		listWarrior.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Sell items in the Survival Shop to get coins!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
	//	listWarrior.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "You can get the Warrior Rank using 10,000 in-game coins!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listWarrior.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "There are huge Creative Plots available!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listWarrior.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "There are plenty of Minigames available!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listWarrior.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Join Discord to chat with other players! discord.craft4plus.ml" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listWarrior.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Need help with the server? Tell us on Discord!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listWarrior.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Want to chat with your mates only? Use one of the Chat Chanels!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listWarrior.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Hard to get resources in SkyBlock? Use the shop!" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listWarrior.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "mcMMO is available! Use it to gain amazing advantages." + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		listWarrior.add(ChatColor.BLUE + "" + ChatColor.MAGIC + "|||" + ChatColor.RESET + " " + ChatColor.RED + ChatColor.BOLD + "Want a map of the server? Visit map.craft4plus.ml" + ChatColor.RESET + "" + ChatColor.BLUE + " " + ChatColor.MAGIC + "|||");
		
	}

	public static void showTips() {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.instance, new Runnable() { //Schedule a repeating task
			@Override
			public void run() {

				for (Player player : Bukkit.getServer().getOnlinePlayers()) { // For every player on the server

					if ((!PlayerJoin.JustJoined(player)) && (!player.isOp())) { // Check if they are not OP and are not in the just joined list.

						if (player.hasPermission("c4p.rank.crafter")) { // Check for permission.
							String TipsCrafter = listCrafter.get(new Random().nextInt(listCrafter.size())); // Pick a random Crafter Tip.
							BountifulAPI.sendActionBar(player, TipsCrafter, 100); // Show Crafter Tips.
						} else {
							if (player.hasPermission("c4p.rank.miner")) { // Check for permission.
								String TipsMiner = listMiner.get(new Random().nextInt(listMiner.size())); // Pick a random Miner Tip.
								BountifulAPI.sendActionBar(player, TipsMiner, 100); // Show Miner Tips.
							} else {
								if (player.hasPermission("c4p.rank.warrior")) { // Check for permission.
									String TipsWarrior = listWarrior.get(new Random().nextInt(listWarrior.size())); // Pick a random Warrior Tip.
									BountifulAPI.sendActionBar(player, TipsWarrior, 100); // Show Warrior Tips.
								}
						}

					}
				}
			}
			}
		}, 0L, 1200L);
	}		
}