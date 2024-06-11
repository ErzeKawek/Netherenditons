
package net.erzekawek.areasundiscovered.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AshesItem extends Item {
	public AshesItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
