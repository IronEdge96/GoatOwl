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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelarimaoutfitrecloak<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelarimaoutfitrecloak"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelarimaoutfitrecloak(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 22).addBox(-2.884F, 4.7326F, 1.558F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(12, 7).addBox(2.316F, 4.7326F, -2.542F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition dontTouch_r1 = LeftLeg.addOrReplaceChild("dontTouch_r1", CubeListBuilder.create().texOffs(0, 7).addBox(-0.0562F, -5.4375F, -2.2625F, 1.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(2.3175F, 4.4844F, -0.2611F, 0.0F, 0.0F, -0.1309F));
		PartDefinition dontTouch_r2 = LeftLeg.addOrReplaceChild("dontTouch_r2", CubeListBuilder.create().texOffs(24, 18).addBox(-1.0562F, -5.4375F, 1.5875F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2054F, 4.3983F, -0.1121F, 0.0F, 0.0F, -0.1309F));
		PartDefinition dontTouch_r3 = LeftLeg.addOrReplaceChild("dontTouch_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-3.725F, -5.0625F, -2.35F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(1.4F, 3.5125F, -0.125F, 0.0F, 0.0F, -0.0436F));
		PartDefinition dontTouch_r4 = LeftLeg.addOrReplaceChild("dontTouch_r4", CubeListBuilder.create().texOffs(12, 15).addBox(-4.275F, -5.8375F, 1.6F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.55F, 4.9125F, -0.125F, 0.0F, 0.0F, -0.0436F));
		PartDefinition dontTouch_r5 = LeftLeg.addOrReplaceChild("dontTouch_r5", CubeListBuilder.create().texOffs(20, 0).addBox(-1.9562F, 7.7076F, -1.4812F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2009F, -3.0986F, -1.3276F, 0.0F, -0.0873F, 0.0F));
		PartDefinition dontTouch_r6 = LeftLeg.addOrReplaceChild("dontTouch_r6", CubeListBuilder.create().texOffs(24, 4).addBox(-3.4312F, -2.2174F, -1.4812F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3179F, 1.0924F, -1.1938F, 0.0F, -0.0873F, 0.0F));
		PartDefinition dontTouch_r7 = LeftLeg.addOrReplaceChild("dontTouch_r7", CubeListBuilder.create().texOffs(14, 22).addBox(-1.725F, -5.7875F, 0.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8959F, 4.5707F, -2.6427F, 0.0044F, -0.0873F, -0.1309F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-3.116F, 4.7326F, 1.558F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false).texOffs(12, 7).mirror()
				.addBox(-3.316F, 4.7326F, -2.542F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition dontTouch_r8 = RightLeg.addOrReplaceChild("dontTouch_r8", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-0.9438F, -5.4375F, -2.2625F, 1.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-2.3175F, 4.4844F, -0.2611F, 0.0F, 0.0F, 0.1309F));
		PartDefinition dontTouch_r9 = RightLeg.addOrReplaceChild("dontTouch_r9", CubeListBuilder.create().texOffs(24, 18).mirror().addBox(-0.9438F, -5.4375F, 1.5875F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2054F, 4.3983F, -0.1121F, 0.0F, 0.0F, 0.1309F));
		PartDefinition dontTouch_r10 = RightLeg.addOrReplaceChild("dontTouch_r10", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.275F, -5.0625F, -2.35F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-1.4F, 3.5125F, -0.125F, 0.0F, 0.0F, 0.0436F));
		PartDefinition dontTouch_r11 = RightLeg.addOrReplaceChild("dontTouch_r11", CubeListBuilder.create().texOffs(12, 15).mirror().addBox(-0.725F, -5.8375F, 1.6F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.55F, 4.9125F, -0.125F, 0.0F, 0.0F, 0.0436F));
		PartDefinition dontTouch_r12 = RightLeg.addOrReplaceChild("dontTouch_r12", CubeListBuilder.create().texOffs(0, 18).addBox(-4.0438F, 7.7076F, -1.4812F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1259F, -3.0986F, -1.3276F, 0.0F, 0.0873F, 0.0F));
		PartDefinition dontTouch_r13 = RightLeg.addOrReplaceChild("dontTouch_r13", CubeListBuilder.create().texOffs(24, 11).addBox(0.4312F, -2.2174F, -1.4812F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3179F, 1.0924F, -1.1938F, 0.0F, 0.0873F, 0.0F));
		PartDefinition dontTouch_r14 = RightLeg.addOrReplaceChild("dontTouch_r14", CubeListBuilder.create().texOffs(14, 22).mirror().addBox(-2.275F, -5.7875F, 0.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8959F, 4.5707F, -2.6427F, 0.0044F, 0.0873F, 0.1309F));
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
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
