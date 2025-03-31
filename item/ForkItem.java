
package net.mcreator.suggestionsannesfans.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.suggestionsannesfans.procedures.ForkLivingEntityIsHitWithItemProcedure;

public class ForkItem extends Item {
	public ForkItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ForkLivingEntityIsHitWithItemProcedure.execute(entity, sourceentity);
		return retval;
	}
}
