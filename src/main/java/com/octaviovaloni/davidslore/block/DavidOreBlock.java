package com.octaviovaloni.davidslore.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class DavidOreBlock extends Block {
    public static final Settings SETTINGS = Settings.copy(Blocks.IRON_ORE);

    public DavidOreBlock() {
        super(SETTINGS);
    }
}
