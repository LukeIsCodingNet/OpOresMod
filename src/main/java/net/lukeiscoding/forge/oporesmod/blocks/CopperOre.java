package net.lukeiscoding.forge.oporesmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CopperOre extends Block {

    public CopperOre() {
        super(AbstractBlock.Properties.of(Material.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE)
                .strength(9.5f, 8.6f));
    }
}
