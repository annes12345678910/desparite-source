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
public class Modelprince extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "modelprince"), "main");
	public final ModelPart head;
	public final ModelPart rl;
	public final ModelPart ll;
	public final ModelPart la;
	public final ModelPart ra;
	public final ModelPart bb_main;

	public Modelprince(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.rl = root.getChild("rl");
		this.ll = root.getChild("ll");
		this.la = root.getChild("la");
		this.ra = root.getChild("ra");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -30.0F, -3.0F, 9.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 13).addBox(-2.0F, -7.0F, -3.0F, 9.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -24.0F, 7.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition rl = partdefinition.addOrReplaceChild("rl", CubeListBuilder.create().texOffs(18, 17).addBox(-9.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 24.0F, 0.0F));
		PartDefinition ll = partdefinition.addOrReplaceChild("ll", CubeListBuilder.create().texOffs(18, 17).addBox(-4.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 24.0F, 0.0F));
		PartDefinition la = partdefinition.addOrReplaceChild("la", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -21.0F, -1.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 24.0F, 0.0F));
		PartDefinition ra = partdefinition.addOrReplaceChild("ra", CubeListBuilder.create().texOffs(0, 28).addBox(-10.0F, -21.0F, -1.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 24.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -23.0F, -1.0F, 7.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.ll.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.la.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rl.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.ra.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
