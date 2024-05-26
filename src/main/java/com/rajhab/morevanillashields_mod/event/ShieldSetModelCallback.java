package com.rajhab.morevanillashields_mod.event;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.util.ActionResult;

public interface ShieldSetModelCallback {

/* Code from StellarWind22 from Fabric-Shield-Lib */

    Event<ShieldSetModelCallback> EVENT = EventFactory.createArrayBacked(ShieldSetModelCallback.class,
            (listeners) -> (loader) -> {
                for (ShieldSetModelCallback listener : listeners) {
                    ActionResult result = listener.setModel(loader);

                    if (result != ActionResult.PASS) {
                        return result;
                    }
                }

                return ActionResult.PASS;
            });

    ActionResult setModel(EntityModelLoader loader);
}
