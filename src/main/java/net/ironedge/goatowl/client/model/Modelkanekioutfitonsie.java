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
public class Modelkanekioutfitonsie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelkanekioutfitonsie"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelkanekioutfitonsie(ModelPart root) {
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
		PartDefinition Body = partdefinition
				.addOrReplaceChild(
						"Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -0.5F, -2.5F, 9.0F, 13.0F, 5.0F, new CubeDeformation(-0.4F)).texOffs(24, 26).addBox(-0.5F, -1.55F, -2.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
								.texOffs(20, 26).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.35F)).texOffs(20, 18).addBox(-2.5F, -1.65F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition dontTouch_r1 = Body.addOrReplaceChild("dontTouch_r1",
				CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).texOffs(28, 0).addBox(-0.5F, -0.625F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)),
				PartPose.offsetAndRotation(0.0976F, -0.9125F, -1.9587F, -0.1309F, 0.0F, -0.2618F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 18).addBox(-3.5F, -2.55F, -2.5F, 5.0F, 12.0F, 5.0F, new CubeDeformation(-0.4F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.5F, -2.55F, -2.5F, 5.0F, 12.0F, 5.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));
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
