package net.andrewcg.cweastermod;

import net.andrewcg.cweastermod.block.ModBlocks;
import net.andrewcg.cweastermod.item.ModItemGroups;
import net.andrewcg.cweastermod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CWEasterMod implements ModInitializer {

	public static final String MOD_ID = "cw-eastermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}