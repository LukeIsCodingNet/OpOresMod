package net.lukeiscoding.forge.oporesmod.tools;

import net.lukeiscoding.forge.oporesmod.registry.RegisterItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

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

public enum OpOresModItemTier implements IItemTier {

    /**
     * @param HarvestLevel
     * 0 = wood or gold
     * 1 = stone
     * 2 = iron
     * 3 = diamond
     */

    // swords...
    RUBY_SWORD(3, 2000, 3.5f, 12.0f, 40, () -> {
        return Ingredient.of(RegisterItems.RUBY_SWORD.get());
    }),

    // pickaxes
    COPPER_PICKAXE(2, 700, 15.0f, 8.0f, 60, () -> {
        return Ingredient.of(RegisterItems.COPPER_PICKAXE.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantabillity;
    private final Supplier<Ingredient> repairMaterial;

    OpOresModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantabillity, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantabillity = enchantabillity;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantabillity;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
