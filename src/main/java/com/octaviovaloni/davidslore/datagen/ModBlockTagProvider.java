package com.octaviovaloni.davidslore.datagen;

import com.octaviovaloni.davidslore.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.lang.reflect.Field;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // Pickaxe Mineable
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.QUANTUM_Q20_BLOCK)
                .add(ModBlocks.DAVID_ORE_BLOCK);

        // Needs diamond/iron/stone tool setter
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.QUANTUM_Q20_BLOCK)
                .add(ModBlocks.DAVID_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

    }
}
