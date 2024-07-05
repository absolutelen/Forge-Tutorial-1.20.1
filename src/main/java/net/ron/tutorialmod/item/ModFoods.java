package net.ron.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties DIAMOND_ACORN = new FoodProperties.Builder().nutrition(8).fast()
            .saturationMod(1.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200,3), 1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION,1200,2),1.0f).effect(new MobEffectInstance(MobEffects.ABSORPTION,1200,10),1.0f).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,1200,1),1.0f).build();

    public static final FoodProperties CRACKED_DIAMOND_ACORN = new FoodProperties.Builder().nutrition(6).fast()
                .saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600,2), 1.0f).effect(new MobEffectInstance(MobEffects.REGENERATION,600,1),1.0f).effect(new MobEffectInstance(MobEffects.ABSORPTION,600,2),1.0f).build();

    public static final FoodProperties ACORN = new FoodProperties.Builder().nutrition(4).fast()
            .saturationMod(0.6f).build();


}