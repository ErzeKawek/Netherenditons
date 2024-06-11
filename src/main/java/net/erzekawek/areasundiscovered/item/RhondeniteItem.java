
package net.erzekawek.areasundiscovered.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RhondeniteItem extends Item {
	public RhondeniteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
