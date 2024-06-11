
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.areasundiscovered.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.erzekawek.areasundiscovered.AreasUndiscoveredMod;

public class AreasUndiscoveredModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AreasUndiscoveredMod.MODID);
	public static final RegistryObject<CreativeModeTab> AREAS_UNDISCOVERED_INTERDIMENSIONAL = REGISTRY.register("areas_undiscovered_interdimensional", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.areas_undiscovered.areas_undiscovered_interdimensional")).icon(() -> new ItemStack(AreasUndiscoveredModItems.RHONDENITE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AreasUndiscoveredModItems.ASHES.get());
				tabData.accept(AreasUndiscoveredModBlocks.ASH_BLOCK.get().asItem());
			})

			.build());
	public static final RegistryObject<CreativeModeTab> AREAS_UNDISCOVERED_BLOCKS = REGISTRY.register("areas_undiscovered_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.areas_undiscovered.areas_undiscovered_blocks")).icon(() -> new ItemStack(AreasUndiscoveredModBlocks.THERIAN_NYLIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AreasUndiscoveredModBlocks.METAL_SPONGE.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.SOAKED_METAL_SPONGE.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.LARGE_THERIAN_FLOWER.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.LARGE_SOUL_THERIAN_FLOWER.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_WOOD.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_LOG.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_WART.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_PLANKS.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_STAIRS.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_SLAB.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_FENCE.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_FENCE_GATE.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_PRESSURE_PLATE.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_BUTTON.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.STRIPPED_THERIAN_STEM.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.STRIPPED_THERIAN_HYPHAE.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_DOOR.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_TRAPDOOR.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_MOSS.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_NYLIUM.get().asItem());
				tabData.accept(AreasUndiscoveredModItems.ROUND_UP_TO_THE_INEVITABLE_END.get());
				tabData.accept(AreasUndiscoveredModBlocks.THERIAN_BLINTLIGHT.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.BLINTCORE.get().asItem());
				tabData.accept(AreasUndiscoveredModItems.RHONDENITE.get());
				tabData.accept(AreasUndiscoveredModItems.PURIFIED_RHONDENITE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> AREAS_UNDISCOVERED_END_BLOCKS_AND_ITEMS = REGISTRY.register("areas_undiscovered_end_blocks_and_items", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.areas_undiscovered.areas_undiscovered_end_blocks_and_items")).icon(() -> new ItemStack(AreasUndiscoveredModBlocks.XLORIS_ENDLYUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_ENDLYUM.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_WOOD.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.STRIPPED_XLORIS_WOOD.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_STEM.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.STRIPPED_XLORIS_LOG.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_LEAVES.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_PLANKS.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_STAIRS.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_SLAB.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_FENCE.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_FENCE_GATE.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_PRESSURE_PLATE.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_BUTTON.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_DOOR.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_TRAPDOOR.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_JELLY.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.XLORIS_GRASS.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.BLYAMOROUS_CRYSTAL_BLOCK.get().asItem());
				tabData.accept(AreasUndiscoveredModItems.BLYAMOROUS.get());
				tabData.accept(AreasUndiscoveredModBlocks.BLYAMOROUS_CLUSTER.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.ICE_CRYSTAL.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.BUDDING_BLYAMOROUS_CRYSTAL.get().asItem());
				tabData.accept(AreasUndiscoveredModBlocks.BLUE_ICE_CRYSTAL.get().asItem());
			})

			.build());
}
