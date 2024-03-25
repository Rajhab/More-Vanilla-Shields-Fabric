package com.rajhab.morevanillashields_mod.util;


import com.rajhab.morevanillashields_mod.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class ModModelPredicateProvider {

    public static void registerModModels() {

        ModelPredicateProviderRegistry.register(ModItems.LEATHER_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.GOLD_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.DIAMOND_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.TINTED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.BROWN_STAINED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.BLUE_STAINED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.CYAN_STAINED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.LIGHT_BLUE_STAINED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.GREEN_STAINED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.LIME_STAINED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.YELLOW_STAINED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.PINK_STAINED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.ORANGE_STAINED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.RED_STAINED_GLASS_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.NETHERITE_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.EMERALD_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.AMETHYST_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.OBSIDIAN_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.COAL_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.END_CRYSTAL_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
}
