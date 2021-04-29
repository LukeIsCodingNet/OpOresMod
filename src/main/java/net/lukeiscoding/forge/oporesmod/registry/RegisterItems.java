package net.lukeiscoding.forge.oporesmod.registry;

import net.lukeiscoding.forge.oporesmod.OpOresMod;
import net.lukeiscoding.forge.oporesmod.items.BaseItem;
import net.lukeiscoding.forge.oporesmod.tools.OpOresModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
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

public class RegisterItems {

    // create a deferred register to register items.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpOresMod.MOD_ID);

    // create a method to call in the main mod class to register items.
    public static void registerItems() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // items...
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", BaseItem::new);
    public static final RegistryObject<Item> RUBY_NUGGET = ITEMS.register("ruby_nugget", BaseItem::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", BaseItem::new);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", BaseItem::new);

    // swords...
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(OpOresModItemTier.RUBY_SWORD, 0, 0, new Item.Properties().tab(RegisterItemGroups.OP_ORES_SWORDS).setNoRepair())
    );
}
