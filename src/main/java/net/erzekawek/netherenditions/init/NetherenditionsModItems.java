
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.erzekawek.netherenditions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.erzekawek.netherenditions.NetherenditionsMod;

public class NetherenditionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NetherenditionsMod.MODID);
	public static final RegistryObject<Item> XLORIS_ENDLYUM = block(NetherenditionsModBlocks.XLORIS_ENDLYUM);
	public static final RegistryObject<Item> XLORIS_WOOD = block(NetherenditionsModBlocks.XLORIS_WOOD);
	public static final RegistryObject<Item> XLORIS_STEM = block(NetherenditionsModBlocks.XLORIS_STEM);
	public static final RegistryObject<Item> XLORIS_LEAVES = block(NetherenditionsModBlocks.XLORIS_LEAVES);
	public static final RegistryObject<Item> XLORIS_PLANKS = block(NetherenditionsModBlocks.XLORIS_PLANKS);
	public static final RegistryObject<Item> XLORIS_STAIRS = block(NetherenditionsModBlocks.XLORIS_STAIRS);
	public static final RegistryObject<Item> XLORIS_SLAB = block(NetherenditionsModBlocks.XLORIS_SLAB);
	public static final RegistryObject<Item> XLORIS_FENCE = block(NetherenditionsModBlocks.XLORIS_FENCE);
	public static final RegistryObject<Item> XLORIS_FENCE_GATE = block(NetherenditionsModBlocks.XLORIS_FENCE_GATE);
	public static final RegistryObject<Item> XLORIS_PRESSURE_PLATE = block(NetherenditionsModBlocks.XLORIS_PRESSURE_PLATE);
	public static final RegistryObject<Item> XLORIS_BUTTON = block(NetherenditionsModBlocks.XLORIS_BUTTON);
	public static final RegistryObject<Item> XLORIS_DOOR = doubleBlock(NetherenditionsModBlocks.XLORIS_DOOR);
	public static final RegistryObject<Item> XLORIS_TRAPDOOR = block(NetherenditionsModBlocks.XLORIS_TRAPDOOR);
	public static final RegistryObject<Item> XLORIS_JELLY = block(NetherenditionsModBlocks.XLORIS_JELLY);
	public static final RegistryObject<Item> XLORIS_GRASS = block(NetherenditionsModBlocks.XLORIS_GRASS);
	public static final RegistryObject<Item> ENDER_DESERT_BARBS = block(NetherenditionsModBlocks.ENDER_DESERT_BARBS);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
