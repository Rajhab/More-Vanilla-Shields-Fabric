package com.rajhab.morevanillashields_mod.util;

import com.rajhab.morevanillashields_mod.item.ModItems;
import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.BannerItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShieldDecorationRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModShieldDecoratorRecipe extends ShieldDecorationRecipe {

    public ModShieldDecoratorRecipe(Identifier identifier, CraftingRecipeCategory craftingRecipeCategory) {
        super(identifier, craftingRecipeCategory);
    }

    @Override
    public boolean matches(CraftingInventory craftingInventory, World world) {
        ItemStack itemStack = ItemStack.EMPTY;
        ItemStack itemStack2 = ItemStack.EMPTY;

        for (int i = 0; i < craftingInventory.size(); ++i) {
            ItemStack itemStack3 = craftingInventory.getStack(i);
            if (!itemStack3.isEmpty()) {
                if (itemStack3.getItem() instanceof BannerItem) {
                    if (!itemStack2.isEmpty()) {
                        return false;
                    }

                    itemStack2 = itemStack3;
                } else {

                    if (!(itemStack3.isOf(ModItems.LEATHER_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.GOLD_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.DIAMOND_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.NETHERITE_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.EMERALD_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.AMETHYST_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.REDSTONE_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.OBSIDIAN_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.COAL_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.END_CRYSTAL_SHIELD))
                    ) {
                        return false;
                    }

                    if (!itemStack.isEmpty()) {
                        return false;
                    }

                    if (itemStack3.getSubNbt("BlockEntityTag") != null) {
                        return false;
                    }

                    itemStack = itemStack3;
                }
            }
        }

        return !itemStack.isEmpty() && !itemStack2.isEmpty();
    }


    @Override
    public ItemStack craft(CraftingInventory craftingInventory, DynamicRegistryManager dynamicRegistryManager) {
        ItemStack itemStack = ItemStack.EMPTY;
        ItemStack itemStack2 = ItemStack.EMPTY;

        for (int i = 0; i < craftingInventory.size(); ++i) {
            ItemStack itemStack3 = craftingInventory.getStack(i);
            if (!itemStack3.isEmpty()) {
                if (itemStack3.getItem() instanceof BannerItem) {
                    itemStack = itemStack3;
                } else if ((itemStack3.isOf(ModItems.LEATHER_SHIELD)) ||
                        (itemStack3.isOf(ModItems.GOLD_SHIELD)) ||
                        (itemStack3.isOf(ModItems.DIAMOND_SHIELD)) ||
                        (itemStack3.isOf(ModItems.NETHERITE_SHIELD)) ||
                        (itemStack3.isOf(ModItems.EMERALD_SHIELD)) ||
                        (itemStack3.isOf(ModItems.AMETHYST_SHIELD)) ||
                        (itemStack3.isOf(ModItems.REDSTONE_SHIELD)) ||
                        (itemStack3.isOf(ModItems.OBSIDIAN_SHIELD)) ||
                        (itemStack3.isOf(ModItems.COAL_SHIELD)) ||
                        (itemStack3.isOf(ModItems.END_CRYSTAL_SHIELD))
                ) {
                    itemStack2 = itemStack3.copy();
                }
            }
        }

        if (!itemStack2.isEmpty()) {
            NbtCompound nbtCompound = itemStack.getSubNbt("BlockEntityTag");
            NbtCompound nbtCompound2 = nbtCompound == null ? new NbtCompound() : nbtCompound.copy();
            nbtCompound2.putInt("Base", ((BannerItem) itemStack.getItem()).getColor().getId());
            itemStack2.setSubNbt("BlockEntityTag", nbtCompound2);
        }
        return itemStack2;
    }

    public boolean fits(int width, int height) {
        return width * height >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return morevanillashields.MOD_SHIELD_DECORATION_SERIALIZER;
    }
}