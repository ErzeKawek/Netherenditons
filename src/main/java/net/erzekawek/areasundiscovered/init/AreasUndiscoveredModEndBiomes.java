package net.erzekawek.areasundiscovered.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.erzekawek.areasundiscovered.endbiomes.TheEndBiomes;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AreasUndiscoveredModEndBiomes {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("areas_undiscovered:xloris_forest")), 0.7d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("areas_undiscovered:xloris_forest")), ResourceKey.create(Registries.BIOME, new ResourceLocation("areas_undiscovered:sparse_xloris_forest")), 0.7d);
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("areas_undiscovered:endothermic_highlands")), 0.6d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("areas_undiscovered:endothermic_highlands")), ResourceKey.create(Registries.BIOME, new ResourceLocation("areas_undiscovered:endothermic_midlands")),
					0.6d);
			TheEndBiomes.addBarrensBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("areas_undiscovered:endothermic_highlands")), ResourceKey.create(Registries.BIOME, new ResourceLocation("areas_undiscovered:endothermic_barrens")),
					0.6d);
		});
	}
}
