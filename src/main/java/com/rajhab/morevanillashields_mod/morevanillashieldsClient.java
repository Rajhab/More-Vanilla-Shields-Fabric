package com.rajhab.morevanillashields_mod;

import com.rajhab.morevanillashields_mod.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;

public class morevanillashieldsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ModModelPredicateProvider.registerModModels();

    }
}
