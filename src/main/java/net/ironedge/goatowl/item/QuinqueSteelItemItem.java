
package net.ironedge.goatowl.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class QuinqueSteelItemItem extends Item {
	public QuinqueSteelItemItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
