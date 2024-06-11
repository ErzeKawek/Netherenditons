
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.areasundiscovered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.erzekawek.areasundiscovered.potion.MiteInfestationMobEffect;
import net.erzekawek.areasundiscovered.AreasUndiscoveredMod;

public class AreasUndiscoveredModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AreasUndiscoveredMod.MODID);
	public static final RegistryObject<MobEffect> MITE_INFESTATION = REGISTRY.register("mite_infestation", () -> new MiteInfestationMobEffect());
}
