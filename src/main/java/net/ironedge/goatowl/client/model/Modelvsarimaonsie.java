package net.ironedge.goatowl.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelvsarimaonsie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelvsarimaonsie"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelvsarimaonsie(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(28, 0).addBox(-2.5F, -1.65F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F)).texOffs(0, 0).addBox(-4.5F, -0.5F, -2.5F, 9.0F, 13.0F, 5.0F, new CubeDeformation(-0.4F)).texOffs(0, 41)
						.addBox(-0.5F, 9.55F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(0, 41).addBox(-0.5F, 9.55F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition dontTouch_r1 = Body.addOrReplaceChild("dontTouch_r1",
				CubeListBuilder.create().texOffs(24, 41).addBox(-0.5F, -1.25F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(28, 41).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(40, 20)
						.addBox(-0.5F, -1.25F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).texOffs(32, 41).addBox(-0.5F, -1.25F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-4.0455F, 10.4359F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition dontTouch_r2 = Body.addOrReplaceChild("dontTouch_r2",
				CubeListBuilder.create().texOffs(40, 14).addBox(-0.5F, -1.25F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.2F)).texOffs(12, 41).addBox(-0.5F, -1.25F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(16, 41)
						.addBox(-0.5F, -1.25F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(20, 41).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(4.0455F, 10.4359F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition dontTouch_r3 = Body.addOrReplaceChild("dontTouch_r3", CubeListBuilder.create().texOffs(28, 8).mirror().addBox(-0.5F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false).texOffs(28, 8).mirror()
				.addBox(-0.5F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-4.075F, 11.2F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition dontTouch_r4 = Body.addOrReplaceChild("dontTouch_r4", CubeListBuilder.create().texOffs(28, 8).addBox(-0.5F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(4.075F, 11.2F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition dontTouch_r5 = Body.addOrReplaceChild("dontTouch_r5",
				CubeListBuilder.create().texOffs(4, 41).addBox(-0.5F, -2.0F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(4, 41).addBox(-0.5F, -2.0F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-2.0F, 11.45F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition dontTouch_r6 = Body.addOrReplaceChild("dontTouch_r6",
				CubeListBuilder.create().texOffs(8, 41).addBox(-0.5F, -2.0F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(8, 41).addBox(-0.5F, -2.0F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(2.0F, 11.45F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition dontTouch_r7 = Body.addOrReplaceChild("dontTouch_r7",
				CubeListBuilder.create().texOffs(40, 30).addBox(-3.4904F, -1.8259F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(40, 28).addBox(-3.4904F, -1.8259F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-0.5184F, 11.3606F, -0.05F, 0.0F, 0.0F, 0.0873F));
		PartDefinition dontTouch_r8 = Body.addOrReplaceChild("dontTouch_r8",
				CubeListBuilder.create().texOffs(40, 32).addBox(-0.5096F, -1.8259F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).texOffs(40, 26).addBox(-0.5096F, -1.8259F, -2.4F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.5184F, 11.3606F, -0.05F, 0.0F, 0.0F, -0.0873F));
		PartDefinition dontTouch_r9 = Body.addOrReplaceChild("dontTouch_r9",
				CubeListBuilder.create().texOffs(28, 35).addBox(-0.5F, -2.0F, 0.5F, 5.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(0, 35).addBox(-0.5F, -2.0F, -2.7F, 5.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.0056F, 11.6804F, 0.1F, 0.0F, 0.0F, -0.0873F));
		PartDefinition dontTouch_r10 = Body.addOrReplaceChild("dontTouch_r10",
				CubeListBuilder.create().texOffs(40, 8).addBox(-4.5F, -2.0F, 0.5F, 5.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(14, 35).addBox(-4.5F, -2.0F, -2.7F, 5.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.0056F, 11.6804F, 0.1F, 0.0F, 0.0F, 0.0873F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 18).addBox(-3.5F, -2.55F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(-0.4F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(20, 18).addBox(-1.5F, -2.55F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(-0.4F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
