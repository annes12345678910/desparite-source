
package net.mcreator.suggestionsannesfans.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.suggestionsannesfans.entity.CrocodileEntity;
import net.mcreator.suggestionsannesfans.client.model.Modelcrocodile;

import com.mojang.blaze3d.vertex.PoseStack;

public class CrocodileRenderer extends MobRenderer<CrocodileEntity, LivingEntityRenderState, Modelcrocodile> {
	private CrocodileEntity entity = null;

	public CrocodileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrocodile(context.bakeLayer(Modelcrocodile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CrocodileEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("suggestionsannesfans:textures/entities/croc.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(2f, 2f, 2f);
	}
}
