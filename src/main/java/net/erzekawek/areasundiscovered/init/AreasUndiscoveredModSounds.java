
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.areasundiscovered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.erzekawek.areasundiscovered.AreasUndiscoveredMod;

public class AreasUndiscoveredModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AreasUndiscoveredMod.MODID);
	public static final RegistryObject<SoundEvent> ENDER = REGISTRY.register("ender", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("areas_undiscovered", "ender")));
	public static final RegistryObject<SoundEvent> ROUND_UP_TO_THE_INEVITABLE_END = REGISTRY.register("round_up_to_the_inevitable_end",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("areas_undiscovered", "round_up_to_the_inevitable_end")));
	public static final RegistryObject<SoundEvent> DESOLATE = REGISTRY.register("desolate", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("areas_undiscovered", "desolate")));
}
