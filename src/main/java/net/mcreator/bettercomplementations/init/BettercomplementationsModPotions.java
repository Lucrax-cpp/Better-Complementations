/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettercomplementations.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.bettercomplementations.BettercomplementationsMod;

public class BettercomplementationsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, BettercomplementationsMod.MODID);
	public static final DeferredHolder<Potion, Potion> BLESSED_WATER = REGISTRY.register("blessed_water", () -> new Potion("blessed_water", new MobEffectInstance(MobEffects.NIGHT_VISION, 300, 0, false, true),
			new MobEffectInstance(MobEffects.ABSORPTION, 300, 1, false, true), new MobEffectInstance(MobEffects.HEALTH_BOOST, 300, 1, false, true)));
}