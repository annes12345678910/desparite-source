
package net.mcreator.suggestionsannesfans.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.suggestionsannesfans.init.SuggestionsannesfansModFluids;

public class SculkLiqBlock extends LiquidBlock {
	public SculkLiqBlock(BlockBehaviour.Properties properties) {
		super(SuggestionsannesfansModFluids.SCULK_LIQ.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
