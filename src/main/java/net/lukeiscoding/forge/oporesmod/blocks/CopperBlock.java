package net.lukeiscoding.forge.oporesmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

 /* Copyright (C) 2021 Luke Is Coding

        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU General Public License as published by
        the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.

        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU General Public License for more details.

        You should have received a copy of the GNU General Public License
        along with this program.  If not, see <https://www.gnu.org/licenses/>. */

public class CopperBlock extends Block {

    public CopperBlock() {
        super(AbstractBlock.Properties.of(Material.METAL)
                .strength(12.0f, 15.5f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.METAL));
    }
}
