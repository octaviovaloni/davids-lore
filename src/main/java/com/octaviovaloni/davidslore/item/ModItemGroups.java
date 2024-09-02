package com.octaviovaloni.davidslore.item;

import com.octaviovaloni.davidslore.DavidsLore;
import com.octaviovaloni.davidslore.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DAVID_LORE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of("david_lore_items"),
            FabricItemGroup.builder()
                    //.icon(() -> new ItemStack(ModItems.DAVID_ORE))
                    .displayName(Text.translatable("itemgroup."  + DavidsLore.MOD_ID + ".david_lore_items"))
                    .entries((displayContext, entries) -> {
                        // Adds every item saved in ItemsList to the item group
                        for (Item item : ModItems.ItemsList) {
                            entries.add(item);
                        }
                    })
                    .build()
    );
    public static final ItemGroup DAVID_LORE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of("david_lore_blocks"),
            FabricItemGroup.builder()
                    //.icon(() -> new ItemStack(ModBlocks.QUANTUM_Q20_BLOCK.asItem()))
                    .displayName(Text.translatable("itemgroup."+ DavidsLore.MOD_ID +".david_lore_blocks"))
                    .entries((displayContext, entries) -> {
                        // Adds every BlockItem saved in BlockItemsList to the item group
                        for (BlockItem item : ModBlocks.BlockItemsList) {
                            entries.add(item);
                        }
                    })
                    .build()
    );

    public static void registerItemGroups() {
        DavidsLore.LOGGER.info("Registering item groups for " + DavidsLore.MOD_ID + "...");
    }
}
