package com.rajhab.morevanillashields_mod;

import com.rajhab.morevanillashields_mod.item.ModItems;
import com.rajhab.morevanillashields_mod.util.ModRegistries;
import com.rajhab.morevanillashields_mod.util.ModShieldDecoratorRecipe;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Special Thanks to KaupenJoe for perfect Fabric Tutorials <3. I miss Forge :(
//Thanks to StellarWind22 for code of his Fabric-Shield-Lib

public class morevanillashields implements ModInitializer {

	public static final String MOD_ID = "morevanillashields";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final SpecialRecipeSerializer<ModShieldDecoratorRecipe> MOD_SHIELD_DECORATION_SERIALIZER;
	public static final RecipeType<ModShieldDecoratorRecipe> MOD_SHIELD_DECORATION;

	static {
		MOD_SHIELD_DECORATION = Registry.register(Registries.RECIPE_TYPE, new Identifier(MOD_ID, "mod_shield_decoration"), new RecipeType<ModShieldDecoratorRecipe>() {
		});
		MOD_SHIELD_DECORATION_SERIALIZER = Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MOD_ID, "mod_shield_decoration"), new SpecialRecipeSerializer<>(ModShieldDecoratorRecipe::new));
	}

	@Override
	public void onInitialize() {

		LOGGER.info(MOD_ID + ": This mod runs without a config file. Coming Soon in next updates!");

		ModItems.registerModItems();
		ModRegistries.registerModStuffs();

		ServerLifecycleEvents.SERVER_STARTED.register(server -> {
			LOGGER.info(MOD_ID + ": This mod is now running on a server. Please report any error or bugs.");
		});

	}
}