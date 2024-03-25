package com.rajhab.morevanillashields_mod;

import com.rajhab.morevanillashields_mod.config.ModConfigs;
import com.rajhab.morevanillashields_mod.item.ModItems;
import com.rajhab.morevanillashields_mod.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Special Thanks to KaupenJoe for perfect Fabric Tutorials <3. I miss Forge :(

public class morevanillashields implements ModInitializer {

	public static final String MOD_ID = "morevanillashields";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info(MOD_ID + ": This mod runs without a config file. Coming Soon in next updates!");

		ModConfigs.registerConfigs();
		ModItems.registerModItems();
		ModRegistries.registerModStuffs();

		ServerLifecycleEvents.SERVER_STARTED.register(server -> {
			LOGGER.info(MOD_ID + ": This mod is now running on a server. Please report any error or bugs.");
		});

	}
}