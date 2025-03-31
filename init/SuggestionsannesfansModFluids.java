
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.suggestionsannesfans.fluid.SculkLiqFluid;
import net.mcreator.suggestionsannesfans.SuggestionsannesfansMod;

public class SuggestionsannesfansModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, SuggestionsannesfansMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> SCULK_LIQ = REGISTRY.register("sculk_liq", () -> new SculkLiqFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_SCULK_LIQ = REGISTRY.register("flowing_sculk_liq", () -> new SculkLiqFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SCULK_LIQ.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SCULK_LIQ.get(), RenderType.translucent());
		}
	}
}
