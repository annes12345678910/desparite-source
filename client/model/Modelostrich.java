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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelostrich extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "modelostrich"), "main");
	public final ModelPart leftleg;
	public final ModelPart rightleg;
	public final ModelPart head2;
	public final ModelPart jaw;
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart bb_main;

	public Modelostrich(ModelPart root) {
		super(root);
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
		this.head2 = root.getChild("head2");
		this.jaw = this.head2.getChild("jaw");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offset(-17.0F, 16.0F, 1.0F));
		PartDefinition cube_r1 = leftleg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(8, 28).addBox(-1.0284F, 0.0F, -0.6989F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0F, -1.0F, -1.0F, -3.1416F, 1.5272F, -3.1416F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset(-17.0F, 16.0F, 1.0F));
		PartDefinition cube_r2 = rightleg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 28).addBox(-2.1583F, 0.0F, -0.7453F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -1.0F, -2.0F, -3.1416F, 1.5272F, -3.1416F));
		PartDefinition head2 = partdefinition.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, -5.0F));
		PartDefinition cube_r3 = head2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 27).addBox(12.5483F, -19.7807F, -4.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 1.0F, 21.0F, 1.6978F, 1.2191F, 1.6901F));
		PartDefinition cube_r4 = head2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 12).addBox(26.0F, -12.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
				.addBox(22.0F, -13.0F, -4.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(21.0F, -12.0F, -3.0F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 1.0F, 21.0F, -3.1416F, 1.5272F, -3.1416F));
		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(11.0F, -8.0F, 6.0F));
		PartDefinition cube_r5 = jaw.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 32).addBox(-0.1061F, -1.0F, -1.137F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, -1.0F, -11.0F, -3.1416F, 1.5272F, -3.1416F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(-17.0F, 16.0F, 1.0F));
		PartDefinition cube_r6 = leftarm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 23).addBox(-8.9373F, -1.0F, 0.1286F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.0F, -4.0F, -5.0F, -3.1416F, 1.5272F, -3.1416F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(-17.0F, 16.0F, 1.0F));
		PartDefinition cube_r7 = rightarm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 23).addBox(-8.2F, -1.0F, -1.8335F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, -4.0F, -4.0F, -3.1416F, 1.5272F, -3.1416F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 12).addBox(4.1671F, 0.5868F, -5.0F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -9.0F, 16.0F, -1.6579F, 1.0456F, -1.6462F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(10.0F, -5.0F, -5.0F, 11.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -9.0F, 16.0F, -3.1416F, 1.5272F, -3.1416F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.jaw.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.head2.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head2.xRot = headPitch / (180F / (float) Math.PI);
		this.leftarm.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
