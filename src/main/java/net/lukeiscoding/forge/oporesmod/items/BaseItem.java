package net.lukeiscoding.forge.oporesmod.items;

import net.lukeiscoding.forge.oporesmod.registry.RegisterItemGroups;
import net.minecraft.item.Item;

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

public class BaseItem extends Item {

    public BaseItem() {
        super(new Item.Properties().tab(RegisterItemGroups.OP_ORES_ITEMS));
    }
}
