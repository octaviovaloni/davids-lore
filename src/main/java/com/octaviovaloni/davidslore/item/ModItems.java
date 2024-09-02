package com.octaviovaloni.davidslore.item;

import com.octaviovaloni.davidslore.DavidsLore;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class ModItems {
    public static ArrayList<Item> ItemsList = new ArrayList<>();
    //public static final Item DAVID_ORE = registerItem("david_ore", new DavidOre());

    public static Item registerItem(String name, Item item) {
        Identifier itemID = Identifier.of(DavidsLore.MOD_ID, name);
        ItemsList.add(item);
        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static void registerModItems() {
        DavidsLore.LOGGER.info("Registering items for " + DavidsLore.MOD_ID + "...");
    }
}
