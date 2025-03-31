
package net.mcreator.suggestionsannesfans.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.suggestionsannesfans.entity.QueenEntity;
import net.mcreator.suggestionsannesfans.client.model.Modelprincess;

import com.mojang.blaze3d.vertex.PoseStack;

public class QueenRenderer extends MobRenderer<QueenEntity, LivingEntityRenderState, Modelprincess> {
	private QueenEntity entity = null;

	public QueenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprincess(context.bakeLayer(Modelprincess.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(QueenEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("suggestionsannesfans:textures/entities/texture2.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(2f, 2f, 2f);
	}
}
