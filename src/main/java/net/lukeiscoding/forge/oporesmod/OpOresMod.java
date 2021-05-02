package net.lukeiscoding.forge.oporesmod;

import net.lukeiscoding.forge.oporesmod.blocks.blockitems.RegisterBlockItems;
import net.lukeiscoding.forge.oporesmod.registry.RegisterBlocks;
import net.lukeiscoding.forge.oporesmod.registry.RegisterItems;
import net.lukeiscoding.forge.oporesmod.world.OreGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

@Mod(OpOresMod.MOD_ID)
public class OpOresMod {

    // create a mod id.
    public static final String MOD_ID = "oporesmod";

    // create a logger.
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public OpOresMod() {
        // call the event listeners.
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::forgeSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        // call the registerItems method to register the items.
        RegisterItems.registerItems();

        // call the registerBlocks method to register the blocks.
        RegisterBlocks.registerBlocks();

        // call the registerBlockItems method to register the block items.
        RegisterBlockItems.registerBlockItems();

        // add a event listener to the Minecraft Forge event bus to generate ores.
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

    // register event listeners.

    private void forgeSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Op Ores Mod has been initialized!");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("The client has been initialized!");
    }
}
