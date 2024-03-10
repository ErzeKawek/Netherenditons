
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.netherenditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.erzekawek.netherenditions.NetherenditionsMod;

public class NetherenditionsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NetherenditionsMod.MODID);
	public static final RegistryObject<CreativeModeTab> NETHERENDITIONS_BLOCKS = REGISTRY.register("netherenditions_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.netherenditions.netherenditions_blocks")).icon(() -> new ItemStack(NetherenditionsModBlocks.XLORIS_ENDLYUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NetherenditionsModBlocks.XLORIS_ENDLYUM.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_WOOD.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_STEM.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_LEAVES.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_PLANKS.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_STAIRS.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_SLAB.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_FENCE.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_FENCE_GATE.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_PRESSURE_PLATE.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_BUTTON.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_DOOR.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_TRAPDOOR.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_JELLY.get().asItem());
				tabData.accept(NetherenditionsModBlocks.XLORIS_GRASS.get().asItem());
				tabData.accept(NetherenditionsModBlocks.ENDER_DESERT_BARBS.get().asItem());
			})

					.build());
}
