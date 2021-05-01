package net.lukeiscoding.forge.oporesmod.blocks.blockitems;

import net.lukeiscoding.forge.oporesmod.OpOresMod;
import net.lukeiscoding.forge.oporesmod.registry.RegisterBlocks;
import net.lukeiscoding.forge.oporesmod.registry.RegisterItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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

public class RegisterBlockItems {

    // create a deferred register to register block items.
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpOresMod.MOD_ID);

    // create a method to call in the main mod class to register block items.
    public static void registerBlockItems() {
        BLOCK_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = BLOCK_ITEMS.register("ruby_block", () ->
            new BlockItem(RegisterBlocks.RUBY_BLOCK.get(), new Item.Properties().tab(RegisterItemGroups.OP_ORES_BLOCKS))
    );

    public static final RegistryObject<Item> RUBY_ORE_ITEM = BLOCK_ITEMS.register("ruby_ore", () ->
            new BlockItem(RegisterBlocks.RUBY_ORE.get(), new Item.Properties().tab(RegisterItemGroups.OP_ORES_BLOCKS))
    );

    public static final RegistryObject<BlockItem> NETHER_STAR_ORE_ITEM = BLOCK_ITEMS.register("nether_star_ore", () ->
            new BlockItem(RegisterBlocks.NETHER_STAR_ORE.get(), new Item.Properties().tab(RegisterItemGroups.OP_ORES_BLOCKS))
    );

    public static final RegistryObject<BlockItem> COPPER_BLOCK_ITEM = BLOCK_ITEMS.register("copper_block", () ->
            new BlockItem(RegisterBlocks.COPPER_BLOCK.get(), new Item.Properties().tab(RegisterItemGroups.OP_ORES_BLOCKS))
    );

    public static final RegistryObject<BlockItem> COPPER_ORE_BLOCK = BLOCK_ITEMS.register("copper_ore", () ->
            new BlockItem(RegisterBlocks.COPPER_ORE.get(), new Item.Properties().tab(RegisterItemGroups.OP_ORES_BLOCKS))
    );
}
