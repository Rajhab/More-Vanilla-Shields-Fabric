package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.config.ModConfigs;
import com.rajhab.morevanillashields_mod.morevanillashields;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

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


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(morevanillashields.MOD_ID, name), item);
    }

    public static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(LEATHER_SHIELD);
        entries.add(GOLD_SHIELD);
        entries.add(DIAMOND_SHIELD);
        entries.add(GLASS_SHIELD);
        entries.add(TINTED_GLASS_SHIELD);
        entries.add(BROWN_STAINED_GLASS_SHIELD);
        entries.add(BLUE_STAINED_GLASS_SHIELD);
        entries.add(CYAN_STAINED_GLASS_SHIELD);
        entries.add(LIGHT_BLUE_STAINED_GLASS_SHIELD);
        entries.add(GREEN_STAINED_GLASS_SHIELD);
        entries.add(YELLOW_STAINED_GLASS_SHIELD);
        entries.add(PINK_STAINED_GLASS_SHIELD);
        entries.add(ORANGE_STAINED_GLASS_SHIELD);
        entries.add(RED_STAINED_GLASS_SHIELD);
        entries.add(NETHERITE_SHIELD);
        entries.add(EMERALD_SHIELD);
        entries.add(AMETHYST_SHIELD);
        entries.add(OBSIDIAN_SHIELD);
        entries.add(COAL_SHIELD);
        entries.add(END_CRYSTAL_SHIELD);
    }

    public static void registerModItems() {
        morevanillashields.LOGGER.info("Registering Mod Items for " + morevanillashields.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::itemGroupIngredients);
    }
}
