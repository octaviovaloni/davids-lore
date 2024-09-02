package com.octaviovaloni.davidslore.block;

import com.octaviovaloni.davidslore.DavidsLore;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class ModBlocks {
    public static ArrayList<BlockItem> BlockItemsList = new ArrayList<>();
    //public static final Block QUANTUM_Q20_BLOCK = registerBlock("quantum_q20_block", new QuantumQ20Block());

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DavidsLore.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        BlockItem item = new BlockItem(block, new Item.Settings());
        Registry.register(Registries.ITEM, Identifier.of(DavidsLore.MOD_ID, name), item);
        BlockItemsList.add(item);
    }

    public static void registerModBlocks() {
        DavidsLore.LOGGER.info("Registering blocks for " + DavidsLore.MOD_ID + "...");
    }
}
