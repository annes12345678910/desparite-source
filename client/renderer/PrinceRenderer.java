
package net.mcreator.suggestionsannesfans.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.suggestionsannesfans.entity.PrinceEntity;
import net.mcreator.suggestionsannesfans.client.model.Modelprince;

public class PrinceRenderer extends MobRenderer<PrinceEntity, LivingEntityRenderState, Modelprince> {
	private PrinceEntity entity = null;

	public PrinceRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprince(context.bakeLayer(Modelprince.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PrinceEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("suggestionsannesfans:textures/entities/prince.png");
	}
}
