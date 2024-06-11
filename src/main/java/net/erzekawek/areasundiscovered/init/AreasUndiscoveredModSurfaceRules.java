package net.erzekawek.areasundiscovered.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.erzekawek.areasundiscovered.mixins.NoiseGeneratorSettingsAccess;

@Mod.EventBusSubscriber
public class AreasUndiscoveredModSurfaceRules {
	@SubscribeEvent
	public static void init(ServerAboutToStartEvent event) {
		LevelStem levelStem = event.getServer().registryAccess().registryOrThrow(Registries.LEVEL_STEM).get(LevelStem.END);
		ChunkGenerator chunkGenerator = levelStem.generator();
		boolean hasEndBiomes = chunkGenerator.getBiomeSource().possibleBiomes().stream().anyMatch(biomeHolder -> biomeHolder.unwrapKey().orElseThrow().location().getNamespace().equals("areas_undiscovered"));
		if (hasEndBiomes) {
			if (chunkGenerator instanceof NoiseBasedChunkGenerator generator) {
				NoiseGeneratorSettings noiseGeneratorSettings = generator.settings.value();
				registerSurfaceRules(new ResourceLocation("areas_undiscovered:xloris_forest"), noiseGeneratorSettings, AreasUndiscoveredModBlocks.XLORIS_ENDLYUM.get().defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(new ResourceLocation("areas_undiscovered:sparse_xloris_forest"), noiseGeneratorSettings, AreasUndiscoveredModBlocks.XLORIS_ENDLYUM.get().defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(new ResourceLocation("areas_undiscovered:endothermic_highlands"), noiseGeneratorSettings, Blocks.SNOW_BLOCK.defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(new ResourceLocation("areas_undiscovered:endothermic_midlands"), noiseGeneratorSettings, Blocks.SNOW_BLOCK.defaultBlockState(), Blocks.END_STONE.defaultBlockState());
				registerSurfaceRules(new ResourceLocation("areas_undiscovered:endothermic_barrens"), noiseGeneratorSettings, Blocks.SNOW_BLOCK.defaultBlockState(), Blocks.END_STONE.defaultBlockState());
			}
		}
	}

	public static void registerSurfaceRules(ResourceLocation biome, NoiseGeneratorSettings noiseGeneratorSettings, BlockState groundBlock, BlockState undergroundBlock) {
		((NoiseGeneratorSettingsAccess) (Object) noiseGeneratorSettings).addSurfaceRule(SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ResourceKey.create(Registries.BIOME, biome)),
				SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(groundBlock)), SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.state(undergroundBlock)))), noiseGeneratorSettings.surfaceRule()));
	}
}
