package com.octaviovaloni.davidslore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

import java.util.List;

public class QuantumQ20 extends Item {
    public static final Settings SETTINGS = new Settings()
            .rarity(Rarity.UNCOMMON);

    public QuantumQ20() {
        super(SETTINGS);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.davidslore.quantum_q20").formatted(Formatting.WHITE));
    }
}
