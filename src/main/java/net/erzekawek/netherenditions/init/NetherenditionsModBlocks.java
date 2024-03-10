
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.netherenditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.erzekawek.netherenditions.block.XlorisWoodBlock;
import net.erzekawek.netherenditions.block.XlorisTrapdoorBlock;
import net.erzekawek.netherenditions.block.XlorisStairsBlock;
import net.erzekawek.netherenditions.block.XlorisSlabBlock;
import net.erzekawek.netherenditions.block.XlorisPressurePlateBlock;
import net.erzekawek.netherenditions.block.XlorisPlanksBlock;
import net.erzekawek.netherenditions.block.XlorisLogBlock;
import net.erzekawek.netherenditions.block.XlorisLeavesBlock;
import net.erzekawek.netherenditions.block.XlorisJellyBlock;
import net.erzekawek.netherenditions.block.XlorisGrassBlock;
import net.erzekawek.netherenditions.block.XlorisFenceGateBlock;
import net.erzekawek.netherenditions.block.XlorisFenceBlock;
import net.erzekawek.netherenditions.block.XlorisEndlyumBlock;
import net.erzekawek.netherenditions.block.XlorisDoorBlock;
import net.erzekawek.netherenditions.block.XlorisButtonBlock;
import net.erzekawek.netherenditions.block.EnderDesertBarbsBlock;
import net.erzekawek.netherenditions.NetherenditionsMod;

public class NetherenditionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NetherenditionsMod.MODID);
	public static final RegistryObject<Block> XLORIS_ENDLYUM = REGISTRY.register("xloris_endlyum", () -> new XlorisEndlyumBlock());
	public static final RegistryObject<Block> XLORIS_WOOD = REGISTRY.register("xloris_wood", () -> new XlorisWoodBlock());
	public static final RegistryObject<Block> XLORIS_STEM = REGISTRY.register("xloris_stem", () -> new XlorisLogBlock());
	public static final RegistryObject<Block> XLORIS_LEAVES = REGISTRY.register("xloris_leaves", () -> new XlorisLeavesBlock());
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
	public static final RegistryObject<Block> XLORIS_GRASS = REGISTRY.register("xloris_grass", () -> new XlorisGrassBlock());
	public static final RegistryObject<Block> ENDER_DESERT_BARBS = REGISTRY.register("ender_desert_barbs", () -> new EnderDesertBarbsBlock());
}
