
package net.erzekawek.areasundiscovered.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlyamorousItem extends Item {
	public BlyamorousItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
