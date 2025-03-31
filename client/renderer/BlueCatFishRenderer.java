
package net.mcreator.suggestionsannesfans.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CodModel;

import net.mcreator.suggestionsannesfans.entity.BlueCatFishEntity;

public class BlueCatFishRenderer extends MobRenderer<BlueCatFishEntity, LivingEntityRenderState, CodModel> {
	private BlueCatFishEntity entity = null;

	public BlueCatFishRenderer(EntityRendererProvider.Context context) {
		super(context, new CodModel(context.bakeLayer(ModelLayers.COD)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BlueCatFishEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("suggestionsannesfans:textures/entities/bluecatfish.png");
	}
}
