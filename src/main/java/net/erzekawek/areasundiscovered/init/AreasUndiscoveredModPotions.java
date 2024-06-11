
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.areasundiscovered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.erzekawek.areasundiscovered.AreasUndiscoveredMod;

public class AreasUndiscoveredModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, AreasUndiscoveredMod.MODID);
	public static final RegistryObject<Potion> MITE_INFESTATION_POTION = REGISTRY.register("mite_infestation_potion", () -> new Potion(new MobEffectInstance(AreasUndiscoveredModMobEffects.MITE_INFESTATION.get(), 3600, 1, false, true)));
}
