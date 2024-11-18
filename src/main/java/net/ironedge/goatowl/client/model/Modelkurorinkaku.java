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
import net.minecraft.client.model.HierarchicalModel;

import net.ironedge.goatowl.KuroRinkakuAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelkurorinkaku<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelkurorinkaku"), "main");
	public final ModelPart root;
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart Tails;
	public final ModelPart Tail;
	public final ModelPart RightTailSegment;
	public final ModelPart RightTailSegment2;
	public final ModelPart RightTailSegment3;
	public final ModelPart RightTailSegment4;
	public final ModelPart RightTailSegment5;
	public final ModelPart RightTailSegment6;
	public final ModelPart RightTailSegment7;
	public final ModelPart RightTailSegment8;
	public final ModelPart RightTailSegment9;
	public final ModelPart RightTailSegment10;
	public final ModelPart RightTailSegment11;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelkurorinkaku(ModelPart root) {
		this.root = root;
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tails = this.Body.getChild("Tails");
		this.Tail = this.Tails.getChild("Tail");
		this.RightTailSegment = this.Tail.getChild("RightTailSegment");
		this.RightTailSegment2 = this.RightTailSegment.getChild("RightTailSegment2");
		this.RightTailSegment3 = this.RightTailSegment2.getChild("RightTailSegment3");
		this.RightTailSegment4 = this.RightTailSegment3.getChild("RightTailSegment4");
		this.RightTailSegment5 = this.RightTailSegment4.getChild("RightTailSegment5");
		this.RightTailSegment6 = this.RightTailSegment5.getChild("RightTailSegment6");
		this.RightTailSegment7 = this.RightTailSegment6.getChild("RightTailSegment7");
		this.RightTailSegment8 = this.RightTailSegment7.getChild("RightTailSegment8");
		this.RightTailSegment9 = this.RightTailSegment8.getChild("RightTailSegment9");
		this.RightTailSegment10 = this.RightTailSegment9.getChild("RightTailSegment10");
		this.RightTailSegment11 = this.RightTailSegment10.getChild("RightTailSegment11");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Tails = Body.addOrReplaceChild("Tails", CubeListBuilder.create(), PartPose.offset(0.0F, 7.9913F, 2.5387F));
		PartDefinition Tail = Tails.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-1.45F, 0.3087F, 0.1863F));
		PartDefinition RightTailSegment = Tail.addOrReplaceChild("RightTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition RightTailSegment2 = RightTailSegment.addOrReplaceChild("RightTailSegment2",
				CubeListBuilder.create().texOffs(130, 93).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.45F)).texOffs(116, 31).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition RightTailSegment3 = RightTailSegment2.addOrReplaceChild("RightTailSegment3",
				CubeListBuilder.create().texOffs(99, 0).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(101, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition RightTailSegment4 = RightTailSegment3.addOrReplaceChild("RightTailSegment4",
				CubeListBuilder.create().texOffs(38, 70).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(15, 114).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTailSegment5 = RightTailSegment4.addOrReplaceChild("RightTailSegment5",
				CubeListBuilder.create().texOffs(32, 112).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 70).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTailSegment6 = RightTailSegment5.addOrReplaceChild("RightTailSegment6",
				CubeListBuilder.create().texOffs(91, 75).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(21, 51).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTailSegment7 = RightTailSegment6.addOrReplaceChild("RightTailSegment7",
				CubeListBuilder.create().texOffs(34, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(42, 50).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition RightTailSegment8 = RightTailSegment7.addOrReplaceChild("RightTailSegment8",
				CubeListBuilder.create().texOffs(0, 50).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTailSegment9 = RightTailSegment8.addOrReplaceChild("RightTailSegment9",
				CubeListBuilder.create().texOffs(34, 102).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(13, 125).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.7F));
		PartDefinition RightTailSegment10 = RightTailSegment9.addOrReplaceChild("RightTailSegment10",
				CubeListBuilder.create().texOffs(126, 111).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(102, 133).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTailSegment11 = RightTailSegment10.addOrReplaceChild("RightTailSegment11", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		if (pEntity instanceof AnimationInterface animationInterface) {
			this.animate(animationInterface.getKuroRinkakuIdleAnimationState(), KuroRinkakuAnimations.KuroRinkakuIdle, pAgeInTicks);
		}
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return this.root;
	}
}
