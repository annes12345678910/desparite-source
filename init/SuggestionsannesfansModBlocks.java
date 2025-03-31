
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.suggestionsannesfans.block.TermiteMoundBlock;
import net.mcreator.suggestionsannesfans.block.SculkPortalBlock;
import net.mcreator.suggestionsannesfans.block.SculkLiqBlock;
import net.mcreator.suggestionsannesfans.block.SarcophagusFeetBlock;
import net.mcreator.suggestionsannesfans.block.SarcophagusBlock;
import net.mcreator.suggestionsannesfans.block.RicePlantBlock;
import net.mcreator.suggestionsannesfans.SuggestionsannesfansMod;

import java.util.function.Function;

public class SuggestionsannesfansModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SuggestionsannesfansMod.MODID);
	public static final DeferredBlock<Block> RICE_PLANT = register("rice_plant", RicePlantBlock::new);
	public static final DeferredBlock<Block> SARCOPHAGUS = register("sarcophagus", SarcophagusBlock::new);
	public static final DeferredBlock<Block> SARCOPHAGUS_FEET = register("sarcophagus_feet", SarcophagusFeetBlock::new);
	public static final DeferredBlock<Block> SCULK_LIQ = register("sculk_liq", SculkLiqBlock::new);
	public static final DeferredBlock<Block> SCULK_PORTAL = register("sculk_portal", SculkPortalBlock::new);
	public static final DeferredBlock<Block> TERMITE_MOUND = register("termite_mound", TermiteMoundBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			RicePlantBlock.blockColorLoad(event);
		}
	}
}
