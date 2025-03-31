
package net.mcreator.suggestionsannesfans.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.suggestionsannesfans.init.SuggestionsannesfansModFluids;

public class SculkLiqItem extends BucketItem {
	public SculkLiqItem(Item.Properties properties) {
		super(SuggestionsannesfansModFluids.SCULK_LIQ.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
