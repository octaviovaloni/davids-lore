package com.octaviovaloni.davidslore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

import java.util.List;

public class DavidOre extends Item {
    public static final Settings SETTINGS = new Item.Settings()
            .rarity(Rarity.COMMON);

    public DavidOre() {
        super(SETTINGS);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.davidslore.david_ore").formatted(Formatting.WHITE));
    }
}
