
package net.erzekawek.areasundiscovered.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class RoundUpToTheInevitableEndItem extends RecordItem {
	public RoundUpToTheInevitableEndItem() {
		super(12, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("areas_undiscovered:round_up_to_the_inevitable_end")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 420);
	}
}
