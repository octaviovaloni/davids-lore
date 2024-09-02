package com.octaviovaloni.davidslore.datagen;

import com.octaviovaloni.davidslore.block.ModBlocks;
import com.octaviovaloni.davidslore.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // Quantum Q20
        offerSmelting(exporter,
                List.of(ModItems.DAVID_ORE),
                RecipeCategory.MISC,
                ModItems.QUANTUM_Q20,
                0.7f, // Experience
                200, // Cook Time
                "quantum_q20"); // Group name
        offerBlasting(exporter,
                List.of(ModItems.DAVID_ORE),
                RecipeCategory.MISC,
                ModItems.QUANTUM_Q20,
                0.7f, // Experience
                100, // Cook Time
                "quantum_q20"); // Group name

        // Quantum Q20 Block
        offerReversibleCompactingRecipes(exporter, RecipeCategory.DECORATIONS, ModItems.QUANTUM_Q20, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUANTUM_Q20_BLOCK);

    }
}
