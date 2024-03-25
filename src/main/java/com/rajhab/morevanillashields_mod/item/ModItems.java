package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.morevanillashields;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {

    public static final Item LEATHER_SHIELD = registerItem("leather_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(196).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.leather_shield").append("196").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item GOLD_SHIELD = registerItem("gold_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(322).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.gold_shield").append("322").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item DIAMOND_SHIELD = registerItem("diamond_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.diamond_shield").append("512").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item GLASS_SHIELD = registerItem("glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item TINTED_GLASS_SHIELD = registerItem("tinted_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.tinted_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item BROWN_STAINED_GLASS_SHIELD = registerItem("brown_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.brown_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item BLUE_STAINED_GLASS_SHIELD = registerItem("blue_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.blue_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item CYAN_STAINED_GLASS_SHIELD = registerItem("cyan_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.cyan_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item LIGHT_BLUE_STAINED_GLASS_SHIELD = registerItem("light_blue_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.light_blue_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item GREEN_STAINED_GLASS_SHIELD = registerItem("green_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.green_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item LIME_STAINED_GLASS_SHIELD = registerItem("lime_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.lime_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item YELLOW_STAINED_GLASS_SHIELD = registerItem("yellow_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.yellow_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item PINK_STAINED_GLASS_SHIELD = registerItem("pink_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.pink_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item ORANGE_STAINED_GLASS_SHIELD = registerItem("orange_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.orange_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item RED_STAINED_GLASS_SHIELD = registerItem("red_stained_glass_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(300).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.red_stained_glass_shield").append("300").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item NETHERITE_SHIELD = registerItem("netherite_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(2042).group(ItemGroup.COMBAT)){

                @Override
                public boolean isFireproof() {
                    return true;
                }

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.netherite_shield").append("2042").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item EMERALD_SHIELD = registerItem("emerald_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.emerald_shield").append("512").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item AMETHYST_SHIELD = registerItem("amethyst_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(432).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.amethyst_shield").append("432").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item OBSIDIAN_SHIELD = registerItem("obsidian_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(610).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.obsidian_shield").append("610").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item COAL_SHIELD = registerItem("coal_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(268).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.coal_shield").append("268").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }
            });

    public static final Item END_CRYSTAL_SHIELD = registerItem("end_crystal_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(750).group(ItemGroup.COMBAT)){

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.moditems.end_crystal_shield").append("750").formatted(Formatting.DARK_AQUA));
                    } else {
                        tooltip.add(new TranslatableText("item.moditems.shift").formatted(Formatting.LIGHT_PURPLE));
                    }
                }

                @Override
                public boolean hasGlint(ItemStack stack) {
                    return true;
                }

            });


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(morevanillashields.MOD_ID, name), item);
    }

    public static void registerModItems() {
        morevanillashields.LOGGER.info("Registering Mod Items for " + morevanillashields.MOD_ID);
    }
}
