package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.morevanillashields;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;

import java.util.List;
import java.util.Random;

public class ModItems {

    public static final Item LEATHER_SHIELD = registerItem("leather_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(196)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.leather_shield").append("196").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item GOLD_SHIELD = registerItem("gold_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(322)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.gold_shield").append("322").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item DIAMOND_SHIELD = registerItem("diamond_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(512)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.diamond_shield").append("512").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item GLASS_SHIELD = registerItem("glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item TINTED_GLASS_SHIELD = registerItem("tinted_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.tinted_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item BROWN_STAINED_GLASS_SHIELD = registerItem("brown_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.brown_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item BLUE_STAINED_GLASS_SHIELD = registerItem("blue_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.blue_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item CYAN_STAINED_GLASS_SHIELD = registerItem("cyan_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.cyan_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item LIGHT_BLUE_STAINED_GLASS_SHIELD = registerItem("light_blue_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.light_blue_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item GREEN_STAINED_GLASS_SHIELD = registerItem("green_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.green_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item LIME_STAINED_GLASS_SHIELD = registerItem("lime_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.lime_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item YELLOW_STAINED_GLASS_SHIELD = registerItem("yellow_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.yellow_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item PINK_STAINED_GLASS_SHIELD = registerItem("pink_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.pink_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item ORANGE_STAINED_GLASS_SHIELD = registerItem("orange_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.orange_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item RED_STAINED_GLASS_SHIELD = registerItem("red_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.red_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item NETHERITE_SHIELD = registerItem("netherite_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(2042)){

                @Override
                public boolean isFireproof() {
                    return true;
                }

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.netherite_shield").append("2042").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item EMERALD_SHIELD = registerItem("emerald_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(512)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.emerald_shield").append("512").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item AMETHYST_SHIELD = registerItem("amethyst_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(432)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.amethyst_shield").append("432").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item OBSIDIAN_SHIELD = registerItem("obsidian_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(610)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.obsidian_shield").append("610").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item COAL_SHIELD = registerItem("coal_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(268)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.coal_shield").append("268").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item END_CRYSTAL_SHIELD = registerItem("end_crystal_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(750)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.end_crystal_shield").append("750").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }

                @Override
                public boolean hasGlint(ItemStack stack) {
                    return true;
                }

            });

    public static final Item REDSTONE_SHIELD = registerItem("redstone_shield",
            new ShieldItem(new Item.Settings().maxDamage(250)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("item.moditems.redstone_shield").append("250").append(Text.translatable("item.moditems.redstone_shield.particles_enabled")).formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(Text.translatable("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }

                    super.appendTooltip(stack, world, tooltip, context);
                }

                @Override
                public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {

                    float pAlpha = 1;
                    float yaw = -user.getYaw();
                    float pitch = -user.getPitch();

                    double offsetX = 0.5 * Math.sin(Math.toRadians(yaw));
                    double offsetY = 0.5 * Math.sin(Math.toRadians(pitch));
                    double offsetZ = 0.5 * Math.cos(Math.toRadians(yaw));

                    Vector3d offsetVector = new Vector3d(0.0, 0.0, 0.0);

                    offsetVector.rotateX(-pitch * Math.PI / 180.0);
                    offsetVector.rotateZ(-yaw * Math.PI / 180.0);

                    offsetX += offsetVector.x;
                    offsetY += offsetVector.y;
                    offsetZ += offsetVector.z;

                    Random rand = new Random();

                    if (!world.isClient) {

                        ServerWorld pServerLevel = (ServerWorld) world;

                        for (double countparticles = 0; countparticles <= 1; ++countparticles) {
                            pServerLevel.spawnParticles(
                                    new DustParticleEffect(DustParticleEffect.RED, pAlpha),
                                    (user.getX() + offsetX) + (rand.nextDouble() - 0.5D),
                                    (user.getY() + offsetY) + (rand.nextDouble() + 0.5D),
                                    (user.getZ() + offsetZ) + (rand.nextDouble() - 0.5D),
                                    1,
                                    0.0,
                                    0.0,
                                    0.0,
                                    1.0
                            );
                        }
                    }

                    //world.createExplosion(user, user.getX(), user.getY() + 1, user.getZ() + 1, 0.1F, World.ExplosionSourceType.TNT);
                }
            });


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(morevanillashields.MOD_ID, name), item);
    }

    public static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.addAfter(Items.SHIELD, LEATHER_SHIELD);
        entries.addAfter(LEATHER_SHIELD, GOLD_SHIELD);
        entries.addAfter(GOLD_SHIELD, DIAMOND_SHIELD);
        entries.addAfter(DIAMOND_SHIELD, NETHERITE_SHIELD);
        entries.addAfter(NETHERITE_SHIELD, EMERALD_SHIELD);
        entries.addAfter(EMERALD_SHIELD, AMETHYST_SHIELD);
        entries.addAfter(AMETHYST_SHIELD, REDSTONE_SHIELD);
        entries.addAfter(REDSTONE_SHIELD, OBSIDIAN_SHIELD);
        entries.addAfter(OBSIDIAN_SHIELD, COAL_SHIELD);
        entries.addAfter(COAL_SHIELD, END_CRYSTAL_SHIELD);
        entries.addAfter(END_CRYSTAL_SHIELD, GLASS_SHIELD);
        entries.addAfter(GLASS_SHIELD, TINTED_GLASS_SHIELD);
        entries.addAfter(TINTED_GLASS_SHIELD, BROWN_STAINED_GLASS_SHIELD);
        entries.addAfter(BROWN_STAINED_GLASS_SHIELD, BLUE_STAINED_GLASS_SHIELD);
        entries.addAfter(BLUE_STAINED_GLASS_SHIELD, CYAN_STAINED_GLASS_SHIELD);
        entries.addAfter(CYAN_STAINED_GLASS_SHIELD, LIGHT_BLUE_STAINED_GLASS_SHIELD);
        entries.addAfter(LIGHT_BLUE_STAINED_GLASS_SHIELD, GREEN_STAINED_GLASS_SHIELD);
        entries.addAfter(GREEN_STAINED_GLASS_SHIELD, YELLOW_STAINED_GLASS_SHIELD);
        entries.addAfter(YELLOW_STAINED_GLASS_SHIELD, PINK_STAINED_GLASS_SHIELD);
        entries.addAfter(PINK_STAINED_GLASS_SHIELD, ORANGE_STAINED_GLASS_SHIELD);
        entries.addAfter(ORANGE_STAINED_GLASS_SHIELD, RED_STAINED_GLASS_SHIELD);
    }

    public static void registerModItems() {
        morevanillashields.LOGGER.info("Registering Mod Items for " + morevanillashields.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::itemGroupIngredients);
    }
}
