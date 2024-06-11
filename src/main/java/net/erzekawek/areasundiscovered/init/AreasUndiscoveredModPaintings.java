
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.areasundiscovered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.erzekawek.areasundiscovered.AreasUndiscoveredMod;

public class AreasUndiscoveredModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, AreasUndiscoveredMod.MODID);
	public static final RegistryObject<PaintingVariant> MAGNET_PAINTING = REGISTRY.register("magnet_painting", () -> new PaintingVariant(64, 64));
}
