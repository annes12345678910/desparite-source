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
public class Modelelephant extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "modelelephant"), "main");
	public final ModelPart rightfrontleg;
	public final ModelPart leftfrontleg;
	public final ModelPart leftbackleg;
	public final ModelPart rightbackleg;
	public final ModelPart bone;
	public final ModelPart bb_main;

	public Modelelephant(ModelPart root) {
		super(root);
		this.rightfrontleg = root.getChild("rightfrontleg");
		this.leftfrontleg = root.getChild("leftfrontleg");
		this.leftbackleg = root.getChild("leftbackleg");
		this.rightbackleg = root.getChild("rightbackleg");
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rightfrontleg = partdefinition.addOrReplaceChild("rightfrontleg", CubeListBuilder.create().texOffs(30, 45).addBox(-5.0F, -3.0F, -7.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition leftfrontleg = partdefinition.addOrReplaceChild("leftfrontleg", CubeListBuilder.create().texOffs(30, 45).addBox(-5.0F, -3.0F, -7.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 24.0F, 0.0F));
		PartDefinition leftbackleg = partdefinition.addOrReplaceChild("leftbackleg", CubeListBuilder.create().texOffs(30, 45).addBox(-5.0F, -3.0F, -7.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 24.0F, 10.0F));
		PartDefinition rightbackleg = partdefinition.addOrReplaceChild("rightbackleg", CubeListBuilder.create().texOffs(30, 45).addBox(-5.0F, -3.0F, -7.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 10.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 22).addBox(-17.0F, -4.0F, -3.0F, 12.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(38, 22).addBox(-13.0F, 1.0F, -6.0F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(11.0F, 12.0F, -11.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 40).addBox(-5.0F, -3.9389F, 0.5666F, 7.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 35).addBox(-24.0F, -3.9389F, 0.5666F, 7.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -11.0F, -7.0F, 10.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, 0.0611F, 0.5666F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 6.0F, 0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.leftfrontleg.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rightbackleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.bone.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bone.xRot = headPitch / (180F / (float) Math.PI);
		this.rightfrontleg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftbackleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
