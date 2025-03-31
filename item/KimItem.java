
package net.mcreator.suggestionsannesfans.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class KimItem extends Item {
	public KimItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).build()));
	}
}
