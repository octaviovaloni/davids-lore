package com.octaviovaloni.davidslore.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class QuantumQ20Block extends Block {
    public static final Settings SETTINGS = AbstractBlock.Settings.copy(Blocks.IRON_BLOCK);

    public QuantumQ20Block() {
        super(SETTINGS);
    }
}
