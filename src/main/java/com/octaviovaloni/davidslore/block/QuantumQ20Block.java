package com.octaviovaloni.davidslore.block;

import com.octaviovaloni.davidslore.DavidsLore;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

public class QuantumQ20Block extends Block {
    public static final Settings SETTINGS = AbstractBlock.Settings.copy(Blocks.IRON_BLOCK);

    public QuantumQ20Block() {
        super(SETTINGS);
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        DavidsLore.LOGGER.info("Se rompio el bloque");
    }


}
