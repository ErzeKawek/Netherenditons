
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.areasundiscovered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.erzekawek.areasundiscovered.block.XlorisWoodBlock;
import net.erzekawek.areasundiscovered.block.XlorisTrapdoorBlock;
import net.erzekawek.areasundiscovered.block.XlorisStairsBlock;
import net.erzekawek.areasundiscovered.block.XlorisSlabBlock;
import net.erzekawek.areasundiscovered.block.XlorisPressurePlateBlock;
import net.erzekawek.areasundiscovered.block.XlorisPlanksBlock;
import net.erzekawek.areasundiscovered.block.XlorisLogBlock;
import net.erzekawek.areasundiscovered.block.XlorisLeavesBlock;
import net.erzekawek.areasundiscovered.block.XlorisJellyBlock;
import net.erzekawek.areasundiscovered.block.XlorisGrassBlock;
import net.erzekawek.areasundiscovered.block.XlorisFenceGateBlock;
import net.erzekawek.areasundiscovered.block.XlorisFenceBlock;
import net.erzekawek.areasundiscovered.block.XlorisEndlyumBlock;
import net.erzekawek.areasundiscovered.block.XlorisDoorBlock;
import net.erzekawek.areasundiscovered.block.XlorisButtonBlock;
import net.erzekawek.areasundiscovered.block.TherianWoodBlock;
import net.erzekawek.areasundiscovered.block.TherianWartBlock;
import net.erzekawek.areasundiscovered.block.TherianTrapdoorBlock;
import net.erzekawek.areasundiscovered.block.TherianStairsBlock;
import net.erzekawek.areasundiscovered.block.TherianSlabBlock;
import net.erzekawek.areasundiscovered.block.TherianPressurePlateBlock;
import net.erzekawek.areasundiscovered.block.TherianPlanksBlock;
import net.erzekawek.areasundiscovered.block.TherianNyliumBlock;
import net.erzekawek.areasundiscovered.block.TherianMossBlock;
import net.erzekawek.areasundiscovered.block.TherianLogBlock;
import net.erzekawek.areasundiscovered.block.TherianFenceGateBlock;
import net.erzekawek.areasundiscovered.block.TherianFenceBlock;
import net.erzekawek.areasundiscovered.block.TherianDoorBlock;
import net.erzekawek.areasundiscovered.block.TherianButtonBlock;
import net.erzekawek.areasundiscovered.block.TherianBlintlightBlock;
import net.erzekawek.areasundiscovered.block.StrippedXlorisWoodBlock;
import net.erzekawek.areasundiscovered.block.StrippedXlorisLogBlock;
import net.erzekawek.areasundiscovered.block.StrippedTherianStemBlock;
import net.erzekawek.areasundiscovered.block.StrippedTherianHyphaeBlock;
import net.erzekawek.areasundiscovered.block.SoakedMetalSpongeBlock;
import net.erzekawek.areasundiscovered.block.MetalSpongeBlock;
import net.erzekawek.areasundiscovered.block.LargeTherianFlowerBlock;
import net.erzekawek.areasundiscovered.block.LargeSoulTherianFlowerBlock;
import net.erzekawek.areasundiscovered.block.IceCrystalBlock;
import net.erzekawek.areasundiscovered.block.EnderDesertBarbsBlock;
import net.erzekawek.areasundiscovered.block.BuddingBlyamorousCrystalBlock;
import net.erzekawek.areasundiscovered.block.BlyamorousCrystalBlockBlock;
import net.erzekawek.areasundiscovered.block.BlyamorousClusterBlock;
import net.erzekawek.areasundiscovered.block.BlueIceCrystalBlock;
import net.erzekawek.areasundiscovered.block.BlintcoreBlock;
import net.erzekawek.areasundiscovered.block.AshBlockBlock;
import net.erzekawek.areasundiscovered.block.ActivatedBlintcoreBlock;
import net.erzekawek.areasundiscovered.AreasUndiscoveredMod;

public class AreasUndiscoveredModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AreasUndiscoveredMod.MODID);
	public static final RegistryObject<Block> XLORIS_ENDLYUM = REGISTRY.register("xloris_endlyum", () -> new XlorisEndlyumBlock());
	public static final RegistryObject<Block> XLORIS_WOOD = REGISTRY.register("xloris_wood", () -> new XlorisWoodBlock());
	public static final RegistryObject<Block> XLORIS_STEM = REGISTRY.register("xloris_stem", () -> new XlorisLogBlock());
	public static final RegistryObject<Block> XLORIS_PLANKS = REGISTRY.register("xloris_planks", () -> new XlorisPlanksBlock());
	public static final RegistryObject<Block> XLORIS_STAIRS = REGISTRY.register("xloris_stairs", () -> new XlorisStairsBlock());
	public static final RegistryObject<Block> XLORIS_SLAB = REGISTRY.register("xloris_slab", () -> new XlorisSlabBlock());
	public static final RegistryObject<Block> XLORIS_FENCE = REGISTRY.register("xloris_fence", () -> new XlorisFenceBlock());
	public static final RegistryObject<Block> XLORIS_FENCE_GATE = REGISTRY.register("xloris_fence_gate", () -> new XlorisFenceGateBlock());
	public static final RegistryObject<Block> XLORIS_PRESSURE_PLATE = REGISTRY.register("xloris_pressure_plate", () -> new XlorisPressurePlateBlock());
	public static final RegistryObject<Block> XLORIS_BUTTON = REGISTRY.register("xloris_button", () -> new XlorisButtonBlock());
	public static final RegistryObject<Block> XLORIS_DOOR = REGISTRY.register("xloris_door", () -> new XlorisDoorBlock());
	public static final RegistryObject<Block> XLORIS_TRAPDOOR = REGISTRY.register("xloris_trapdoor", () -> new XlorisTrapdoorBlock());
	public static final RegistryObject<Block> XLORIS_JELLY = REGISTRY.register("xloris_jelly", () -> new XlorisJellyBlock());
	public static final RegistryObject<Block> ENDER_DESERT_BARBS = REGISTRY.register("ender_desert_barbs", () -> new EnderDesertBarbsBlock());
	public static final RegistryObject<Block> XLORIS_GRASS = REGISTRY.register("xloris_grass", () -> new XlorisGrassBlock());
	public static final RegistryObject<Block> XLORIS_LEAVES = REGISTRY.register("xloris_leaves", () -> new XlorisLeavesBlock());
	public static final RegistryObject<Block> METAL_SPONGE = REGISTRY.register("metal_sponge", () -> new MetalSpongeBlock());
	public static final RegistryObject<Block> SOAKED_METAL_SPONGE = REGISTRY.register("soaked_metal_sponge", () -> new SoakedMetalSpongeBlock());
	public static final RegistryObject<Block> STRIPPED_XLORIS_LOG = REGISTRY.register("stripped_xloris_log", () -> new StrippedXlorisLogBlock());
	public static final RegistryObject<Block> STRIPPED_XLORIS_WOOD = REGISTRY.register("stripped_xloris_wood", () -> new StrippedXlorisWoodBlock());
	public static final RegistryObject<Block> LARGE_THERIAN_FLOWER = REGISTRY.register("large_therian_flower", () -> new LargeTherianFlowerBlock());
	public static final RegistryObject<Block> LARGE_SOUL_THERIAN_FLOWER = REGISTRY.register("large_soul_therian_flower", () -> new LargeSoulTherianFlowerBlock());
	public static final RegistryObject<Block> THERIAN_WOOD = REGISTRY.register("therian_wood", () -> new TherianWoodBlock());
	public static final RegistryObject<Block> THERIAN_LOG = REGISTRY.register("therian_log", () -> new TherianLogBlock());
	public static final RegistryObject<Block> THERIAN_PLANKS = REGISTRY.register("therian_planks", () -> new TherianPlanksBlock());
	public static final RegistryObject<Block> THERIAN_STAIRS = REGISTRY.register("therian_stairs", () -> new TherianStairsBlock());
	public static final RegistryObject<Block> THERIAN_SLAB = REGISTRY.register("therian_slab", () -> new TherianSlabBlock());
	public static final RegistryObject<Block> THERIAN_FENCE = REGISTRY.register("therian_fence", () -> new TherianFenceBlock());
	public static final RegistryObject<Block> THERIAN_FENCE_GATE = REGISTRY.register("therian_fence_gate", () -> new TherianFenceGateBlock());
	public static final RegistryObject<Block> THERIAN_PRESSURE_PLATE = REGISTRY.register("therian_pressure_plate", () -> new TherianPressurePlateBlock());
	public static final RegistryObject<Block> THERIAN_BUTTON = REGISTRY.register("therian_button", () -> new TherianButtonBlock());
	public static final RegistryObject<Block> THERIAN_WART = REGISTRY.register("therian_wart", () -> new TherianWartBlock());
	public static final RegistryObject<Block> STRIPPED_THERIAN_STEM = REGISTRY.register("stripped_therian_stem", () -> new StrippedTherianStemBlock());
	public static final RegistryObject<Block> STRIPPED_THERIAN_HYPHAE = REGISTRY.register("stripped_therian_hyphae", () -> new StrippedTherianHyphaeBlock());
	public static final RegistryObject<Block> THERIAN_DOOR = REGISTRY.register("therian_door", () -> new TherianDoorBlock());
	public static final RegistryObject<Block> THERIAN_TRAPDOOR = REGISTRY.register("therian_trapdoor", () -> new TherianTrapdoorBlock());
	public static final RegistryObject<Block> THERIAN_MOSS = REGISTRY.register("therian_moss", () -> new TherianMossBlock());
	public static final RegistryObject<Block> THERIAN_NYLIUM = REGISTRY.register("therian_nylium", () -> new TherianNyliumBlock());
	public static final RegistryObject<Block> BLYAMOROUS_CRYSTAL_BLOCK = REGISTRY.register("blyamorous_crystal_block", () -> new BlyamorousCrystalBlockBlock());
	public static final RegistryObject<Block> BLYAMOROUS_CLUSTER = REGISTRY.register("blyamorous_cluster", () -> new BlyamorousClusterBlock());
	public static final RegistryObject<Block> ICE_CRYSTAL = REGISTRY.register("ice_crystal", () -> new IceCrystalBlock());
	public static final RegistryObject<Block> BUDDING_BLYAMOROUS_CRYSTAL = REGISTRY.register("budding_blyamorous_crystal", () -> new BuddingBlyamorousCrystalBlock());
	public static final RegistryObject<Block> THERIAN_BLINTLIGHT = REGISTRY.register("therian_blintlight", () -> new TherianBlintlightBlock());
	public static final RegistryObject<Block> BLINTCORE = REGISTRY.register("blintcore", () -> new BlintcoreBlock());
	public static final RegistryObject<Block> ACTIVATED_BLINTCORE = REGISTRY.register("activated_blintcore", () -> new ActivatedBlintcoreBlock());
	public static final RegistryObject<Block> BLUE_ICE_CRYSTAL = REGISTRY.register("blue_ice_crystal", () -> new BlueIceCrystalBlock());
	public static final RegistryObject<Block> ASH_BLOCK = REGISTRY.register("ash_block", () -> new AshBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
