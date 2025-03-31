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
public class Modeltermitequeen extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "modeltermitequeen"), "main");
	public final ModelPart backrightleg;
	public final ModelPart backrightleg2;
	public final ModelPart backrightleg3;
	public final ModelPart backrightleg4;
	public final ModelPart backrightleg5;
	public final ModelPart backrightleg6;
	public final ModelPart head;
	public final ModelPart bb_main;

	public Modeltermitequeen(ModelPart root) {
		super(root);
		this.backrightleg = root.getChild("backrightleg");
		this.backrightleg2 = root.getChild("backrightleg2");
		this.backrightleg3 = root.getChild("backrightleg3");
		this.backrightleg4 = root.getChild("backrightleg4");
		this.backrightleg5 = root.getChild("backrightleg5");
		this.backrightleg6 = root.getChild("backrightleg6");
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition backrightleg = partdefinition.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, -1.0F));
		PartDefinition cube_r1 = backrightleg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 24).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 4.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition backrightleg2 = partdefinition.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 3.0F));
		PartDefinition cube_r2 = backrightleg2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 24).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition backrightleg3 = partdefinition.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offset(2.0F, 22.0F, 3.0F));
		PartDefinition cube_r3 = backrightleg3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 24).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition backrightleg4 = partdefinition.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offset(2.0F, 22.0F, -1.0F));
		PartDefinition cube_r4 = backrightleg4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 24).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 2.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition backrightleg5 = partdefinition.addOrReplaceChild("backrightleg5", CubeListBuilder.create(), PartPose.offset(4.0F, 22.0F, -1.0F));
		PartDefinition cube_r5 = backrightleg5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 24).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition backrightleg6 = partdefinition.addOrReplaceChild("backrightleg6", CubeListBuilder.create(), PartPose.offset(4.0F, 22.0F, 3.0F));
		PartDefinition cube_r6 = backrightleg6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 24).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, -4.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-1.0F, 22.0F, -2.0F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 31).addBox(-4.0F, -2.0F, -5.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -1.0F, -5.0F, -0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 24).addBox(0.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.0F, 3.0F, 10.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, -4.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 3.0F, 0.0F, 1.5708F, 0.0F));
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
		this.backrightleg6.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.backrightleg5.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.backrightleg4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.backrightleg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.backrightleg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.backrightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
