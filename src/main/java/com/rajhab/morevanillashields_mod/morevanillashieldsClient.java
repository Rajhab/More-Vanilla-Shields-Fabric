package com.rajhab.morevanillashields_mod;

import com.mojang.datafixers.util.Pair;
import com.rajhab.morevanillashields_mod.item.ModItems;
import com.rajhab.morevanillashields_mod.util.ModModelPredicateProvider;
import com.rajhab.morevanillashields_mod.util.ShieldSetModelCallback;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.block.entity.BannerBlockEntity;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BannerBlockEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.ShieldEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.List;

public class morevanillashieldsClient implements ClientModInitializer {

    public static final EntityModelLayer leather_shield_model_layer = new EntityModelLayer(new Identifier("morevanillashields", "leather_shield"), "main");
    public static ShieldEntityModel modelLeatherShield;

    public static final SpriteIdentifier LEATHER_SHIELD_BASE = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, new Identifier("morevanillashields", "entity/leather_shield_base"));
    public static final SpriteIdentifier LEATHER_SHIELD_BASE_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, new Identifier("morevanillashields", "entity/leather_shield_base_no_pattern"));

    public static DyeColor getColor(ItemStack stack) {
        return DyeColor.byId(stack.getOrCreateSubNbt("BlockEntityTag").getInt("Base"));
    }

    @Override
    public void onInitializeClient() {

        ModModelPredicateProvider.registerModModels();

        EntityModelLayerRegistry.registerModelLayer(leather_shield_model_layer, ShieldEntityModel::getTexturedModelData);

        ShieldSetModelCallback.EVENT.register((loader -> {
            modelLeatherShield = new ShieldEntityModel(loader.getModelPart(leather_shield_model_layer));
            return ActionResult.PASS;
        }));

        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.LEATHER_SHIELD, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            renderBanner(stack, matrices, vertexConsumers, light, overlay, modelLeatherShield, LEATHER_SHIELD_BASE, LEATHER_SHIELD_BASE_NO_PATTERN);
        });

    }


    public static void renderBanner(ItemStack stack, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, ShieldEntityModel model, SpriteIdentifier base, SpriteIdentifier base_nopattern){
        boolean bl = stack.getSubNbt("BlockEntityTag") != null;
        matrices.push();
        matrices.scale(1.0F, -1.0F, -1.0F);
        SpriteIdentifier spriteIdentifier = bl ? base : base_nopattern;
        VertexConsumer vertexConsumer = spriteIdentifier.getSprite().getTextureSpecificVertexConsumer(ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, model.getLayer(spriteIdentifier.getAtlasId()), true, stack.hasGlint()));
        model.getHandle().render(matrices, vertexConsumer, light, overlay, 1.0F, 1.0F, 1.0F, 1.0F);
        if (bl) {
            List<Pair<RegistryEntry<BannerPattern>, DyeColor>> list = BannerBlockEntity.getPatternsFromNbt(getColor(stack), BannerBlockEntity.getPatternListNbt(stack));
            BannerBlockEntityRenderer.renderCanvas(matrices, vertexConsumers, light, overlay, model.getPlate(), spriteIdentifier, false, list, stack.hasGlint());
        } else {
            model.getPlate().render(matrices, vertexConsumer, light, overlay, 1.0F, 1.0F, 1.0F, 1.0F);
        }
        matrices.pop();
    }
}

