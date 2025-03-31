
package net.mcreator.suggestionsannesfans.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.suggestionsannesfans.entity.TermiteQueenEntity;
import net.mcreator.suggestionsannesfans.client.model.Modeltermitequeen;

public class TermiteQueenRenderer extends MobRenderer<TermiteQueenEntity, LivingEntityRenderState, Modeltermitequeen> {
	private TermiteQueenEntity entity = null;

	public TermiteQueenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltermitequeen(context.bakeLayer(Modeltermitequeen.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TermiteQueenEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("suggestionsannesfans:textures/entities/termitequeen.png");
	}
}
