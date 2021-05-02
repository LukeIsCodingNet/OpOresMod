package net.lukeiscoding.forge.oporesmod.registry;

import net.lukeiscoding.forge.oporesmod.blocks.blockitems.RegisterBlockItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

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

public class RegisterItemGroups {

    public static final ItemGroup OP_ORES_ITEMS = new ItemGroup("op_ores_mod_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterItems.RUBY.get());
        }
    };

    public static final ItemGroup OP_ORES_SWORDS = new ItemGroup("op_ores_mod_swords") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterItems.RUBY_SWORD.get());
        }
    };

    public static final ItemGroup OP_ORES_TOOLS = new ItemGroup("op_ores_mod_tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterItems.COPPER_PICKAXE.get());
        }
    };

    public static final ItemGroup OP_ORES_BLOCKS = new ItemGroup("op_ores_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegisterBlockItems.RUBY_BLOCK_ITEM.get());
        }
    };
}
