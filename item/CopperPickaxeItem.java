
package net.mcreator.suggestionsannesfans.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CopperPickaxeItem extends Item {
	public CopperPickaxeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).durability(150));
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isCombineRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 3.5f;
	}
}
