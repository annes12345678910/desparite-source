
package net.mcreator.suggestionsannesfans.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.suggestionsannesfans.entity.ElephantEntity;
import net.mcreator.suggestionsannesfans.client.model.Modelelephant;

import com.mojang.blaze3d.vertex.PoseStack;

public class ElephantRenderer extends MobRenderer<ElephantEntity, LivingEntityRenderState, Modelelephant> {
	private ElephantEntity entity = null;

	public ElephantRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelephant(context.bakeLayer(Modelelephant.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ElephantEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("suggestionsannesfans:textures/entities/elephant.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(3f, 3f, 3f);
	}
}
