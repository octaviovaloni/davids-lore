package com.octaviovaloni.davidslore;

import com.octaviovaloni.davidslore.block.ModBlocks;
import com.octaviovaloni.davidslore.item.ModItemGroups;
import com.octaviovaloni.davidslore.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class DavidsLore implements ModInitializer {
	public static final String MOD_ID = "davidslore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starting David's Lore mod...");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}