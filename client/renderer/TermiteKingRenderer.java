
package net.mcreator.suggestionsannesfans.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.suggestionsannesfans.entity.TermiteKingEntity;
import net.mcreator.suggestionsannesfans.client.model.Modeltermiteking;

import com.mojang.blaze3d.vertex.PoseStack;

public class TermiteKingRenderer extends MobRenderer<TermiteKingEntity, LivingEntityRenderState, Modeltermiteking> {
	private TermiteKingEntity entity = null;

	public TermiteKingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltermiteking(context.bakeLayer(Modeltermiteking.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TermiteKingEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("suggestionsannesfans:textures/entities/termiteking.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}
}
