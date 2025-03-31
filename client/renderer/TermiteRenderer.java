
package net.mcreator.suggestionsannesfans.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.suggestionsannesfans.entity.TermiteEntity;
import net.mcreator.suggestionsannesfans.client.model.Modeltermite;

public class TermiteRenderer extends MobRenderer<TermiteEntity, LivingEntityRenderState, Modeltermite> {
	private TermiteEntity entity = null;

	public TermiteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltermite(context.bakeLayer(Modeltermite.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TermiteEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("suggestionsannesfans:textures/entities/termite.png");
	}
}
