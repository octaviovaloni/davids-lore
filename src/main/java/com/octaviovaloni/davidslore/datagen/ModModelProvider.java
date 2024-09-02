package com.octaviovaloni.davidslore.datagen;

import com.octaviovaloni.davidslore.block.ModBlocks;
import com.octaviovaloni.davidslore.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUANTUM_Q20_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DAVID_ORE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DAVID_ORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUANTUM_Q20, Models.GENERATED);
    }
}
