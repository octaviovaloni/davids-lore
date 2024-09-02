package com.octaviovaloni.davidslore.datagen;

import com.octaviovaloni.davidslore.block.ModBlocks;
import com.octaviovaloni.davidslore.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //addDrop(ModBlocks.BLOCK);

        //addDrop(ModBlocks.BLOCK, oreDrops(ModItems.WITH_SILK_TOUCH, ModItems.NO_SILK_TOUCH));
    }
}
