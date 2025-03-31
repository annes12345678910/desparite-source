
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.suggestionsannesfans.client.renderer.TermiteRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.TermiteQueenRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.TermiteKingRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.ShrimpRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.QueenRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.PrincessRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.PrinceRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.PigeonRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.PenguinRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.OstrichRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.KingRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.ElephantRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.CrocodileRenderer;
import net.mcreator.suggestionsannesfans.client.renderer.BlueCatFishRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SuggestionsannesfansModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SuggestionsannesfansModEntities.BLUE_CAT_FISH.get(), BlueCatFishRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.PIGEON.get(), PigeonRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.SHRIMP.get(), ShrimpRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.BEAM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.PRINCESS.get(), PrincessRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.QUEEN.get(), QueenRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.PRINCE.get(), PrinceRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.KING.get(), KingRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.CROCODILE.get(), CrocodileRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.OSTRICH.get(), OstrichRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.TERMITE.get(), TermiteRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.TERMITE_QUEEN.get(), TermiteQueenRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.PENGUIN.get(), PenguinRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.TERMITE_KING.get(), TermiteKingRenderer::new);
		event.registerEntityRenderer(SuggestionsannesfansModEntities.ELEPHANT.get(), ElephantRenderer::new);
	}
}
