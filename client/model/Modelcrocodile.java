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
public class Modelcrocodile extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "modelcrocodile"), "main");
	public final ModelPart head;
	public final ModelPart lower;
	public final ModelPart upper;
	public final ModelPart lfl;
	public final ModelPart lbl;
	public final ModelPart rbl;
	public final ModelPart rlf;
	public final ModelPart tail;
	public final ModelPart bb_main;

	public Modelcrocodile(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.lower = this.head.getChild("lower");
		this.upper = this.head.getChild("upper");
		this.lfl = root.getChild("lfl");
		this.lbl = root.getChild("lbl");
		this.rbl = root.getChild("rbl");
		this.rlf = root.getChild("rlf");
		this.tail = root.getChild("tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -7.0F));
		PartDefinition lower = head.addOrReplaceChild("lower", CubeListBuilder.create().texOffs(0, 17).addBox(-5.0F, 0.0F, -10.75F, 6.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -3.0F, -12.75F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r1 = lower.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 41).addBox(-0.9962F, -1.0F, 0.1745F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition cube_r2 = lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(4, 41).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 0.0F, -6.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r3 = lower.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(6, 41).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 0.0F, -8.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r4 = lower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 41).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 0.0F, -10.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r5 = lower.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 41).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 0.0F, -12.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r6 = lower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 41).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 0.0F, -4.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r7 = lower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(40, 16).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, 0.0F, -4.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r8 = lower.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 15).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, 0.0F, -6.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r9 = lower.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 14).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, 0.0F, -8.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r10 = lower.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 13).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, 0.0F, -10.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r11 = lower.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 12).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, 0.0F, -12.75F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r12 = lower.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 41).addBox(-0.9962F, -1.0F, 0.1745F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition upper = head.addOrReplaceChild("upper", CubeListBuilder.create().texOffs(34, 17).addBox(-3.0F, -4.0F, -1.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -3.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r13 = upper.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(14, 41).addBox(-1.5699F, -2.0F, 9.9588F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 41).addBox(1.4272F, -2.0F, 9.828F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -0.0436F, -3.1416F));
		PartDefinition cube_r14 = upper.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(18, 41).addBox(6.0F, -2.0F, -2.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 41).addBox(4.0F, -2.0F, -2.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 41)
						.addBox(2.0F, -2.0F, -2.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 41).addBox(0.0F, -2.0F, -2.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 41)
						.addBox(8.0F, -2.0F, -2.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 41).addBox(8.0F, -2.0F, 2.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 41)
						.addBox(6.0F, -2.0F, 2.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 41).addBox(4.0F, -2.0F, 2.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(2.0F, -2.0F, 2.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 42).addBox(0.0F, -2.0F, 2.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 3.1416F));
		PartDefinition cube_r15 = upper.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 29).addBox(-3.0F, -1.0F, -1.0F, 6.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition lfl = partdefinition.addOrReplaceChild("lfl", CubeListBuilder.create().texOffs(34, 38).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 24.0F, -7.0F));
		PartDefinition lbl = partdefinition.addOrReplaceChild("lbl", CubeListBuilder.create().texOffs(40, 6).addBox(7.0F, -4.0F, 9.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 24.0F, -7.0F));
		PartDefinition rbl = partdefinition.addOrReplaceChild("rbl", CubeListBuilder.create().texOffs(40, 38).addBox(7.0F, -4.0F, 9.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.0F, 24.0F, -7.0F));
		PartDefinition rlf = partdefinition.addOrReplaceChild("rlf", CubeListBuilder.create().texOffs(40, 0).addBox(7.0F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 24.0F, -7.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(34, 32).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 23).addBox(-1.0F, -2.0F, 3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 5.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -5.0F, -9.0F, 6.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.lfl.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.tail.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.upper.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.lbl.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rbl.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rlf.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
