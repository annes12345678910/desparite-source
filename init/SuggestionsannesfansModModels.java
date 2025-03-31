
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.suggestionsannesfans.client.model.Modeltermitequeen;
import net.mcreator.suggestionsannesfans.client.model.Modeltermiteking;
import net.mcreator.suggestionsannesfans.client.model.Modeltermite;
import net.mcreator.suggestionsannesfans.client.model.Modelprincess;
import net.mcreator.suggestionsannesfans.client.model.Modelprince;
import net.mcreator.suggestionsannesfans.client.model.Modelpenguin;
import net.mcreator.suggestionsannesfans.client.model.Modelostrich;
import net.mcreator.suggestionsannesfans.client.model.Modelelephant;
import net.mcreator.suggestionsannesfans.client.model.Modelcrocodile;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SuggestionsannesfansModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltermitequeen.LAYER_LOCATION, Modeltermitequeen::createBodyLayer);
		event.registerLayerDefinition(Modelostrich.LAYER_LOCATION, Modelostrich::createBodyLayer);
		event.registerLayerDefinition(Modeltermite.LAYER_LOCATION, Modeltermite::createBodyLayer);
		event.registerLayerDefinition(Modeltermiteking.LAYER_LOCATION, Modeltermiteking::createBodyLayer);
		event.registerLayerDefinition(Modelcrocodile.LAYER_LOCATION, Modelcrocodile::createBodyLayer);
		event.registerLayerDefinition(Modelprince.LAYER_LOCATION, Modelprince::createBodyLayer);
		event.registerLayerDefinition(Modelelephant.LAYER_LOCATION, Modelelephant::createBodyLayer);
		event.registerLayerDefinition(Modelpenguin.LAYER_LOCATION, Modelpenguin::createBodyLayer);
		event.registerLayerDefinition(Modelprincess.LAYER_LOCATION, Modelprincess::createBodyLayer);
	}
}
