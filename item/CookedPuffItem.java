
package net.mcreator.suggestionsannesfans.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedPuffItem extends Item {
	public CookedPuffItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.3f).build()));
	}
}
