package com.rajhab.morevanillashields_mod.mixin;

import com.rajhab.morevanillashields_mod.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.explosion.Explosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(method = "damage", at = @At("HEAD"))
    public void onDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        LivingEntity livingEntity = (LivingEntity) (Object) this;

            if (isBlockingWithEndCrystalShield(livingEntity)) {
                Random random = new Random();
                if (random.nextInt(10) == 0) {
                    createExplosion((ServerWorld) livingEntity.getWorld(), livingEntity.getPos(), livingEntity);
                }
            }
    }

    private boolean isBlockingWithEndCrystalShield(LivingEntity livingEntity) {
        if (livingEntity.isUsingItem()) {
            return livingEntity.getStackInHand(Hand.OFF_HAND).getItem() == ModItems.END_CRYSTAL_SHIELD ||
                    livingEntity.getStackInHand(Hand.MAIN_HAND).getItem() == ModItems.END_CRYSTAL_SHIELD;
        }
        return false;
    }

    private void createExplosion(ServerWorld serverWorld, Vec3d pos, LivingEntity livingEntity) {
        if (!serverWorld.isClient && serverWorld instanceof ServerWorld) {
            serverWorld.createExplosion(livingEntity, pos.getX(), pos.getY(), pos.getZ(), 5.0F, Explosion.DestructionType.NONE);

            applyShieldDamage(livingEntity);
        }
    }

    private void applyShieldDamage(LivingEntity livingEntity) {
        ItemStack mainHandStack = livingEntity.getStackInHand(Hand.MAIN_HAND);
        ItemStack offHandStack = livingEntity.getStackInHand(Hand.OFF_HAND);

        if (mainHandStack.getItem() == ModItems.END_CRYSTAL_SHIELD) {
            damageShield(mainHandStack);
        }
        if (offHandStack.getItem() == ModItems.END_CRYSTAL_SHIELD) {
            damageShield(offHandStack);
        }
    }

    private void damageShield(ItemStack shield) {
        int fixedDamageAmount = 175;
        shield.damage(fixedDamageAmount, new Random(), null);
    }
}