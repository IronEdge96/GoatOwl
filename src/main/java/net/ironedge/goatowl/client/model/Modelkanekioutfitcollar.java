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
public class Modelkanekioutfitcollar<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelkanekioutfitcollar"), "main");
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelkanekioutfitcollar(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -1.8F, -4.875F, 10.0F, 1.0F, 10.0F, new CubeDeformation(-0.1F)).texOffs(0, 11).addBox(-5.0F, 0.1F, -4.9F, 10.0F, 1.0F, 10.0F, new CubeDeformation(-0.3F)),
				PartPose.offset(0.0F, -0.75F, 0.0F));
		PartDefinition head_r1 = Head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(28, 28).addBox(-4.3462F, -3.1205F, -4.6139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.3473F, 0.125F, -1.5708F, 1.405F, -1.789F));
		PartDefinition head_r2 = Head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(4, 28).addBox(3.3462F, -3.1205F, -4.6139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.3473F, 0.625F, 1.5708F, 1.405F, 1.3526F));
		PartDefinition head_r3 = Head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(18, 25).addBox(-4.5F, -2.3605F, -4.6139F, 8.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.0122F, 0.2925F, -0.0506F, 0.0F, 1.5708F, -0.2182F));
		PartDefinition head_r4 = Head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(0, 28).addBox(-4.3462F, -3.1205F, -4.6139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.3473F, 0.625F, 1.5708F, -1.405F, -1.3526F));
		PartDefinition head_r5 = Head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(0, 25).addBox(-3.5F, -2.3605F, -4.6139F, 8.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0122F, 0.2925F, -0.0506F, 0.0F, -1.5708F, 0.2182F));
		PartDefinition head_r6 = Head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(24, 28).addBox(3.3462F, -3.1205F, -4.6139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.3473F, 0.125F, -1.5708F, -1.405F, 1.789F));
		PartDefinition head_r7 = Head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(12, 28).addBox(-4.3462F, -3.1205F, 3.6139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.2135F, 0.3473F, 0.125F, -0.2153F, -0.0357F, -0.1619F));
		PartDefinition head_r8 = Head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(20, 28).addBox(3.3462F, -3.1205F, 3.6139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.2135F, 0.3473F, 0.125F, -0.2153F, 0.0357F, 0.1619F));
		PartDefinition head_r9 = Head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(0, 22).addBox(-4.5F, -2.3605F, 3.6139F, 9.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.0379F, 0.2925F, 0.1372F, -0.2182F, 0.0F, 0.0F));
		PartDefinition head_r10 = Head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(16, 28).addBox(-4.3462F, -3.1205F, -4.6139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.2135F, 0.3473F, 0.125F, 0.2153F, 0.0357F, -0.1619F));
		PartDefinition head_r11 = Head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(8, 28).addBox(3.3462F, -3.1205F, -4.6139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.2135F, 0.3473F, 0.125F, 0.2153F, -0.0357F, 0.1619F));
		PartDefinition head_r12 = Head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(20, 22).addBox(-5.5F, -2.3605F, -4.6139F, 9.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.9621F, 0.2925F, 0.1128F, 0.2182F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
