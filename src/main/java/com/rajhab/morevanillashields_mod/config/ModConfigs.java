package com.rajhab.morevanillashields_mod.config;

import com.mojang.datafixers.util.Pair;
import com.rajhab.morevanillashields_mod.morevanillashields;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int LEATHER_SHIELD_DURABILITY;
    public static int GOLD_SHIELD_DURABILITY;
    public static int DIAMOND_SHIELD_DURABILITY;
    public static int GLASS_SHIELD_DURABILITY;
    public static int TINTED_GLASS_SHIELD_DURABILITY;
    public static int BROWN_STAINED_GLASS_SHIELD_DURABILITY;
    public static int BLUE_STAINED_GLASS_SHIELD_DURABILITY;
    public static int CYAN_STAINED_GLASS_SHIELD_DURABILITY;
    public static int LIGHT_BLUE_STAINED_GLASS_SHIELD_DURABILITY;
    public static int GREEN_STAINED_GLASS_SHIELD_DURABILITY;
    public static int LIME_STAINED_GLASS_SHIELD_DURABILITY;
    public static int YELLOW_STAINED_GLASS_SHIELD_DURABILITY;
    public static int PINK_STAINED_GLASS_SHIELD_DURABILITY;
    public static int ORANGE_STAINED_GLASS_SHIELD_DURABILITY;
    public static int RED_STAINED_GLASS_SHIELD_DURABILITY;
    public static int NETHERITE_SHIELD_DURABILITY;
    public static int EMERALD_SHIELD_DURABILITY;
    public static int AMETHYST_SHIELD_DURABILITY;
    public static int OBSIDIAN_SHIELD_DURABILITY;
    public static int COAL_SHIELD_DURABILITY;
    public static int END_CRYSTAL_SHIELD_DURABILITY;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(morevanillashields.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("leatherShieldDurability", 196), "");
        configs.addKeyValuePair(new Pair<>("goldShieldDurability", 322), "");
        configs.addKeyValuePair(new Pair<>("diamondShieldDurability", 512), "");
        configs.addKeyValuePair(new Pair<>("glassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("tintedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("brownStainedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("blueStainedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("cyanStainedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("lightBlueStainedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("greenStainedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("limeStainedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("yellowStainedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("pinkStainedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("orangeStainedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("redStainedGlassShieldDurability", 300), "");
        configs.addKeyValuePair(new Pair<>("netheriteShieldDurability", 2042), "");
        configs.addKeyValuePair(new Pair<>("emeraldShieldDurability", 512), "");
        configs.addKeyValuePair(new Pair<>("amethystShieldDurability", 432), "");
        configs.addKeyValuePair(new Pair<>("obsidianShieldDurability", 610), "");
        configs.addKeyValuePair(new Pair<>("coalShieldDurability", 268), "");
        configs.addKeyValuePair(new Pair<>("endCrystalShieldDurability", 750), "");
    }

    private static void assignConfigs() {
        LEATHER_SHIELD_DURABILITY = CONFIG.getOrDefault("leatherShieldDurability", 196);
        GOLD_SHIELD_DURABILITY = CONFIG.getOrDefault("goldShieldDurability", 322);
        DIAMOND_SHIELD_DURABILITY = CONFIG.getOrDefault("diamondShieldDurability", 512);
        GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("glassShieldDurability", 300);
        TINTED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("tintedGlassShieldDurability", 300);
        BROWN_STAINED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("brownStainedGlassShieldDurability", 300);
        BLUE_STAINED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("blueStainedGlassShieldDurability", 300);
        CYAN_STAINED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("cyanStainedGlassShieldDurability", 300);
        LIGHT_BLUE_STAINED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("lightBlueStainedGlassShieldDurability", 300);
        GREEN_STAINED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("greenStainedGlassShieldDurability", 300);
        LIME_STAINED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("limeStainedGlassShieldDurability", 300);
        YELLOW_STAINED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("yellowStainedGlassShieldDurability", 300);
        PINK_STAINED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("pinkStainedGlassShieldDurability", 300);
        ORANGE_STAINED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("orangeStainedGlassShieldDurability", 300);
        RED_STAINED_GLASS_SHIELD_DURABILITY = CONFIG.getOrDefault("redStainedGlassShieldDurability", 300);
        NETHERITE_SHIELD_DURABILITY = CONFIG.getOrDefault("netheriteShieldDurability", 2042);
        EMERALD_SHIELD_DURABILITY = CONFIG.getOrDefault("emeraldShieldDurability", 512);
        AMETHYST_SHIELD_DURABILITY = CONFIG.getOrDefault("amethystShieldDurability", 432);
        OBSIDIAN_SHIELD_DURABILITY = CONFIG.getOrDefault("obsidianShieldDurability", 610);
        COAL_SHIELD_DURABILITY = CONFIG.getOrDefault("coalShieldDurability", 268);
        END_CRYSTAL_SHIELD_DURABILITY = CONFIG.getOrDefault("endCrystalShieldDurability", 750);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}
