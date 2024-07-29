package com.rajhab.morevanillashields_mod;

import com.rajhab.morevanillashields_mod.event.ShieldSetModelCallback;
import com.rajhab.morevanillashields_mod.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BannerBlockEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.ShieldEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.BannerPatternsComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.Objects;


public class morevanillashieldsClient implements ClientModInitializer {

    public static final EntityModelLayer leather_shield_model_layer = new EntityModelLayer(Identifier.of(morevanillashields.MOD_ID, "leather_shield"),"main");
    public static final EntityModelLayer gold_shield_model_layer = new EntityModelLayer(Identifier.of(morevanillashields.MOD_ID, "gold_shield"),"main");
    public static final EntityModelLayer diamond_shield_model_layer = new EntityModelLayer(Identifier.of(morevanillashields.MOD_ID, "diamond_shield"),"main");
    public static final EntityModelLayer netherite_shield_model_layer = new EntityModelLayer(Identifier.of(morevanillashields.MOD_ID, "netherite_shield"),"main");
    public static final EntityModelLayer emerald_shield_model_layer = new EntityModelLayer(Identifier.of(morevanillashields.MOD_ID, "emerald_shield"),"main");
    public static final EntityModelLayer amethyst_shield_model_layer = new EntityModelLayer(Identifier.of(morevanillashields.MOD_ID, "amethyst_shield"),"main");
    public static final EntityModelLayer redstone_shield_model_layer = new EntityModelLayer(Identifier.of(morevanillashields.MOD_ID, "redstone_shield"),"main");
    public static final EntityModelLayer obsidian_shield_model_layer = new EntityModelLayer(Identifier.of(morevanillashields.MOD_ID, "obsidian_shield"),"main");
    public static final EntityModelLayer coal_shield_model_layer = new EntityModelLayer(Identifier.of(morevanillashields.MOD_ID, "coal_shield"),"main");
    public static final EntityModelLayer end_crystal_shield_model_layer = new EntityModelLayer(Identifier.of(morevanillashields.MOD_ID, "end_crystal_shield"),"main");
    public static ShieldEntityModel modelLeatherShield;
    public static ShieldEntityModel modelGoldShield;
    public static ShieldEntityModel modelDiamondShield;
    public static ShieldEntityModel modelNetheriteShield;
    public static ShieldEntityModel modelEmeraldShield;
    public static ShieldEntityModel modelAmethystShield;
    public static ShieldEntityModel modelRedstoneShield;
    public static ShieldEntityModel modelObsidianShield;
    public static ShieldEntityModel modelCoalShield;
    public static ShieldEntityModel modelEndCrystalShield;

    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier LEATHER_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/leather_shield_base"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier LEATHER_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/leather_shield_base_nopattern"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier GOLD_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/gold_shield_base"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier GOLD_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/gold_shield_base_nopattern"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier DIAMOND_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/diamond_shield_base"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier DIAMOND_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/diamond_shield_base_nopattern"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier NETHERITE_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/netherite_shield_base"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier NETHERITE_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/netherite_shield_base_nopattern"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier EMERALD_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/emerald_shield_base"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier EMERALD_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/emerald_shield_base_nopattern"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier AMETHYST_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/amethyst_shield_base"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier AMETHYST_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/amethyst_shield_base_nopattern"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier REDSTONE_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/redstone_shield_base"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier REDSTONE_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/redstone_shield_base_nopattern"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier OBSIDIAN_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/obsidian_shield_base"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier OBSIDIAN_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/obsidian_shield_base_nopattern"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier COAL_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/coal_shield_base"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier COAL_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/coal_shield_base_nopattern"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier END_CRYSTAL_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/end_crystal_shield_base"));
    @SuppressWarnings("deprecation")
    public static final SpriteIdentifier END_CRYSTAL_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, Identifier.of(morevanillashields.MOD_ID, "entity/end_crystal_shield_base_nopattern"));


    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(leather_shield_model_layer, ShieldEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(gold_shield_model_layer, ShieldEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(diamond_shield_model_layer, ShieldEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(netherite_shield_model_layer, ShieldEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(emerald_shield_model_layer, ShieldEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(amethyst_shield_model_layer, ShieldEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(redstone_shield_model_layer, ShieldEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(obsidian_shield_model_layer, ShieldEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(coal_shield_model_layer, ShieldEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(end_crystal_shield_model_layer, ShieldEntityModel::getTexturedModelData);

        //Set model
        ShieldSetModelCallback.EVENT.register((loader) -> {
            modelLeatherShield = new ShieldEntityModel(loader.getModelPart(morevanillashieldsClient.leather_shield_model_layer));
            modelGoldShield = new ShieldEntityModel(loader.getModelPart(morevanillashieldsClient.gold_shield_model_layer));
            modelDiamondShield = new ShieldEntityModel(loader.getModelPart(morevanillashieldsClient.diamond_shield_model_layer));
            modelNetheriteShield = new ShieldEntityModel(loader.getModelPart(morevanillashieldsClient.netherite_shield_model_layer));
            modelEmeraldShield = new ShieldEntityModel(loader.getModelPart(morevanillashieldsClient.emerald_shield_model_layer));
            modelAmethystShield = new ShieldEntityModel(loader.getModelPart(morevanillashieldsClient.amethyst_shield_model_layer));
            modelRedstoneShield = new ShieldEntityModel(loader.getModelPart(morevanillashieldsClient.redstone_shield_model_layer));
            modelObsidianShield = new ShieldEntityModel(loader.getModelPart(morevanillashieldsClient.obsidian_shield_model_layer));
            modelCoalShield = new ShieldEntityModel(loader.getModelPart(morevanillashieldsClient.coal_shield_model_layer));
            modelEndCrystalShield = new ShieldEntityModel(loader.getModelPart(morevanillashieldsClient.end_crystal_shield_model_layer));
            return ActionResult.PASS;
        });

        ModelPredicateProviderRegistry.register(ModItems.LEATHER_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.GOLD_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.DIAMOND_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.TINTED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.BROWN_STAINED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.BLUE_STAINED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.CYAN_STAINED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.LIGHT_BLUE_STAINED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.GREEN_STAINED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.LIME_STAINED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.YELLOW_STAINED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.PINK_STAINED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.ORANGE_STAINED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.RED_STAINED_GLASS_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.NETHERITE_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.EMERALD_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.AMETHYST_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.REDSTONE_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.OBSIDIAN_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.COAL_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        ModelPredicateProviderRegistry.register(ModItems.END_CRYSTAL_SHIELD, Identifier.of("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

        //Register renderer
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.LEATHER_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelLeatherShield, LEATHER_SHIELD_BASE, LEATHER_SHIELD_BASE_NO_PATTERN);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.GOLD_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelGoldShield, GOLD_SHIELD_BASE, GOLD_SHIELD_BASE_NO_PATTERN);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.DIAMOND_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelDiamondShield, DIAMOND_SHIELD_BASE, DIAMOND_SHIELD_BASE_NO_PATTERN);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.NETHERITE_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelNetheriteShield, NETHERITE_SHIELD_BASE, NETHERITE_SHIELD_BASE_NO_PATTERN);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.EMERALD_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelEmeraldShield, EMERALD_SHIELD_BASE, EMERALD_SHIELD_BASE_NO_PATTERN);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.AMETHYST_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelAmethystShield, AMETHYST_SHIELD_BASE, AMETHYST_SHIELD_BASE_NO_PATTERN);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.REDSTONE_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelRedstoneShield, REDSTONE_SHIELD_BASE, REDSTONE_SHIELD_BASE_NO_PATTERN);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.OBSIDIAN_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelObsidianShield, OBSIDIAN_SHIELD_BASE, OBSIDIAN_SHIELD_BASE_NO_PATTERN);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.COAL_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelCoalShield, COAL_SHIELD_BASE, COAL_SHIELD_BASE_NO_PATTERN);
        });
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.END_CRYSTAL_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelEndCrystalShield, END_CRYSTAL_SHIELD_BASE, END_CRYSTAL_SHIELD_BASE_NO_PATTERN);
        });

    }

    public static void renderBanner(ItemStack stack, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, ShieldEntityModel model, SpriteIdentifier base, SpriteIdentifier base_nopattern){
        BannerPatternsComponent bannerPatternsComponent = (BannerPatternsComponent)stack.getOrDefault(DataComponentTypes.BANNER_PATTERNS, BannerPatternsComponent.DEFAULT);
        DyeColor dyeColor2 = (DyeColor)stack.get(DataComponentTypes.BASE_COLOR);
        boolean bl = !bannerPatternsComponent.layers().isEmpty() || dyeColor2 != null;
        matrices.push();
        matrices.scale(1.0F, -1.0F, -1.0F);
        SpriteIdentifier spriteIdentifier = bl ? base : base_nopattern;
        VertexConsumer vertexConsumer = spriteIdentifier.getSprite().getTextureSpecificVertexConsumer(ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, model.getLayer(spriteIdentifier.getAtlasId()), true, stack.hasGlint()));
        model.getHandle().render(matrices, vertexConsumer, light, overlay);
        if (bl) {
            BannerBlockEntityRenderer.renderCanvas(matrices, vertexConsumers, light, overlay, model.getPlate(), spriteIdentifier, false, (DyeColor) Objects.requireNonNullElse(dyeColor2, DyeColor.WHITE), bannerPatternsComponent, stack.hasGlint());
        } else {
            model.getPlate().render(matrices, vertexConsumer, light, overlay);
        }

        matrices.pop();
    }
}