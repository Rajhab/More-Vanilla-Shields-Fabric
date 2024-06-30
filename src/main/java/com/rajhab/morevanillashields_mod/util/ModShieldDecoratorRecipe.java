package com.rajhab.morevanillashields_mod.util;

import com.rajhab.morevanillashields_mod.item.ModItems;
import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.BannerPatternsComponent;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.BannerItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShieldDecorationRecipe;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.recipe.input.CraftingRecipeInput;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.World;

public class ModShieldDecoratorRecipe extends ShieldDecorationRecipe {

    public ModShieldDecoratorRecipe(CraftingRecipeCategory craftingRecipeCategory) {
        super(craftingRecipeCategory);
    }

    public boolean matches(CraftingRecipeInput craftingRecipeInput, World world) {
        ItemStack itemStack = ItemStack.EMPTY;
        ItemStack itemStack2 = ItemStack.EMPTY;

        for(int i = 0; i < craftingRecipeInput.getSize(); ++i) {
            ItemStack itemStack3 = craftingRecipeInput.getStackInSlot(i);
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
                            !(itemStack3.isOf(ModItems.OBSIDIAN_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.COAL_SHIELD)) &&
                            !(itemStack3.isOf(ModItems.END_CRYSTAL_SHIELD))
                    ) {
                        return false;
                    }

                    if (!itemStack.isEmpty()) {
                        return false;
                    }

                    BannerPatternsComponent bannerPatternsComponent = (BannerPatternsComponent)itemStack3.getOrDefault(DataComponentTypes.BANNER_PATTERNS, BannerPatternsComponent.DEFAULT);
                    if (!bannerPatternsComponent.layers().isEmpty()) {
                        return false;
                    }

                    itemStack = itemStack3;
                }
            }
        }

        if (!itemStack.isEmpty() && !itemStack2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ItemStack craft(CraftingRecipeInput craftingRecipeInput, RegistryWrapper.WrapperLookup wrapperLookup) {
        ItemStack itemStack = ItemStack.EMPTY;
        ItemStack itemStack2 = ItemStack.EMPTY;

        for(int i = 0; i < craftingRecipeInput.getSize(); ++i) {
            ItemStack itemStack3 = craftingRecipeInput.getStackInSlot(i);
            if (!itemStack3.isEmpty()) {
                if (itemStack3.getItem() instanceof BannerItem) {
                    itemStack = itemStack3;
                } else if ((itemStack3.isOf(ModItems.LEATHER_SHIELD)) ||
                        (itemStack3.isOf(ModItems.GOLD_SHIELD)) ||
                        (itemStack3.isOf(ModItems.DIAMOND_SHIELD)) ||
                        (itemStack3.isOf(ModItems.NETHERITE_SHIELD)) ||
                        (itemStack3.isOf(ModItems.EMERALD_SHIELD)) ||
                        (itemStack3.isOf(ModItems.AMETHYST_SHIELD)) ||
                        (itemStack3.isOf(ModItems.OBSIDIAN_SHIELD)) ||
                        (itemStack3.isOf(ModItems.COAL_SHIELD)) ||
                        (itemStack3.isOf(ModItems.END_CRYSTAL_SHIELD))
                ) {
                    itemStack2 = itemStack3.copy();
                }
            }
        }

        if (itemStack2.isEmpty()) {
            return itemStack2;
        } else {
            itemStack2.set(DataComponentTypes.BANNER_PATTERNS, (BannerPatternsComponent)itemStack.get(DataComponentTypes.BANNER_PATTERNS));
            itemStack2.set(DataComponentTypes.BASE_COLOR, ((BannerItem)itemStack.getItem()).getColor());
            return itemStack2;
        }
    }

    public boolean fits(int width, int height) {
        return width * height >= 2;
    }

    public RecipeSerializer<?> getSerializer() {
        return morevanillashields.MOD_SHIELD_DECORATION_SERIALIZER;
    }
}