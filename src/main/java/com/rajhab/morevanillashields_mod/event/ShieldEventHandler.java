package com.rajhab.morevanillashields_mod.event;

import com.rajhab.morevanillashields_mod.item.ModItems;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import java.util.Random;

public class ShieldEventHandler {

    public static void registerEventStuff() {

        ServerLivingEntityEvents.ALLOW_DAMAGE.register((attacker, victim, source) -> {
            if (attacker instanceof LivingEntity) {

                if (isBlockingWithEndCrystalShield(attacker)) {
                        Random random = new Random();
                        if (random.nextInt(30) == 0) {
                            createExplosion((ServerWorld) attacker.getWorld(), attacker.getPos(), attacker);
                        }
                    }
            }
            return true;
        });
    }

    private static boolean isBlockingWithEndCrystalShield(LivingEntity serverLivingEntity) {
        if (serverLivingEntity.isUsingItem()) {
            return serverLivingEntity.getStackInHand(Hand.OFF_HAND).getItem() == ModItems.END_CRYSTAL_SHIELD ||
                    serverLivingEntity.getStackInHand(Hand.MAIN_HAND).getItem() == ModItems.END_CRYSTAL_SHIELD;
        }
        return false;
    }

    private static void createExplosion(ServerWorld serverWorld, Vec3d pos, LivingEntity serverLivingEntity) {
        if (!serverWorld.isClient && serverWorld instanceof ServerWorld) {
            serverWorld.createExplosion(serverLivingEntity, pos.getX(), pos.getY(), pos.getZ(), 5.0F, World.ExplosionSourceType.NONE);
        }
    }
}