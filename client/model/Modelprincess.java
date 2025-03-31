package net.mcreator.suggestionsannesfans.client.model;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelprincess extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "modelprincess"), "main");
	public final ModelPart dress;
	public final ModelPart rl;
	public final ModelPart ll;
	public final ModelPart bb_main;

	public Modelprincess(ModelPart root) {
		super(root);
		this.dress = root.getChild("dress");
		this.rl = root.getChild("rl");
		this.ll = root.getChild("ll");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition dress = partdefinition.addOrReplaceChild("dress", CubeListBuilder.create(), PartPose.offset(4.0F, -6.0F, 3.0F));
		PartDefinition cube_r1 = dress.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 20).addBox(-1.0F, -13.0F, 1.0F, 16.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 22.0F, 7.0F, 2.7236F, -0.0374F, 3.1326F));
		PartDefinition cube_r2 = dress.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 20).addBox(-1.0F, -13.0F, 1.0F, 16.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.0F, 23.0F, 3.0F, -0.6415F, 1.4868F, -0.2681F));
		PartDefinition cube_r3 = dress.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 20).addBox(-1.0F, -13.0F, 1.0F, 16.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 22.0F, -18.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r4 = dress.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(43, 20).addBox(-1.0F, -13.0F, 1.0F, 16.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 22.0F, -16.0F, -0.5276F, -1.1954F, -0.0382F));
		PartDefinition rl = partdefinition.addOrReplaceChild("rl", CubeListBuilder.create().texOffs(0, 18).addBox(-11.0F, 0.0F, -2.0F, 4.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-11.0F, 14.0F, -6.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(78, 15).addBox(-10.0F, -24.0F, -6.0F, 11.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 8.0F, 0.0F));
		PartDefinition cube_r5 = rl.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(87, 48).addBox(-1.0F, -13.0F, -1.0F, 0.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -13.0F, 8.75F, 1.5708F, -1.2654F, -1.6144F));
		PartDefinition cube_r6 = rl.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(87, 48).addBox(-1.0F, -13.0F, -1.0F, 0.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -12.0F, -5.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r7 = rl.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(87, 48).addBox(-1.0F, -13.0F, -1.0F, 0.0F, 13.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.75F, -13.0F, -5.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition ll = partdefinition.addOrReplaceChild("ll",
				CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 14.0F, -6.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 8.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(12, 38).addBox(-7.0F, -30.0F, -7.0F, 14.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 0).addBox(-8.0F, -3.0F, -1.0F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -26.0F, 1.0F, 1.6144F, 0.0F, -1.5708F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 0).addBox(-8.0F, -3.0F, -1.0F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -26.0F, 1.0F, 1.6144F, 0.0F, -1.5708F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.ll.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rl.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
