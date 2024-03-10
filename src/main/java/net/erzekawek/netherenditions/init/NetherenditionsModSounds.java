
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.netherenditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.erzekawek.netherenditions.NetherenditionsMod;

public class NetherenditionsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NetherenditionsMod.MODID);
	public static final RegistryObject<SoundEvent> END_MUSIC_COMMON = REGISTRY.register("end.music.common", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("netherenditions", "end.music.common")));
}
