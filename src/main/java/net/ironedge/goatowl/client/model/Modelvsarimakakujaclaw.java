package net.ironedge.goatowl.client.model;

import org.lwjgl.system.Pointer;

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

import net.ironedge.goatowl.VSArimaKakujaAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelvsarimakakujaclaw<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelvsarimakakujaclaw"), "main");
	public final ModelPart root;
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart Claw;
	public final ModelPart RightHand;
	public final ModelPart Fingers;
	public final ModelPart Thumb;
	public final ModelPart ThumbDigit;
	public final ModelPart Pointer;
	public final ModelPart PointerDigit;
	public final ModelPart Index;
	public final ModelPart IndexDigit;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelvsarimakakujaclaw(ModelPart root) {
		this.root = root;
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.Claw = this.RightArm.getChild("Claw");
		this.RightHand = this.Claw.getChild("RightHand");
		this.Fingers = this.RightHand.getChild("Fingers");
		this.Thumb = this.Fingers.getChild("Thumb");
		this.ThumbDigit = this.Thumb.getChild("ThumbDigit");
		this.Pointer = this.Fingers.getChild("Pointer");
		this.PointerDigit = this.Pointer.getChild("PointerDigit");
		this.Index = this.Fingers.getChild("Index");
		this.IndexDigit = this.Index.getChild("IndexDigit");
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
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition Claw = RightArm.addOrReplaceChild("Claw", CubeListBuilder.create().texOffs(0, 19).addBox(-2.5F, -0.2583F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)).texOffs(0, 10)
				.addBox(-2.5F, 1.2917F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(0, 0).addBox(-2.5F, 4.1917F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 2.9083F, 0.0F));
		PartDefinition RightHand = Claw.addOrReplaceChild("RightHand", CubeListBuilder.create(), PartPose.offset(-2.519F, 6.3772F, 0.2787F));
		PartDefinition Fingers = RightHand.addOrReplaceChild("Fingers", CubeListBuilder.create(), PartPose.offset(12.9053F, -13.1355F, 0.9606F));
		PartDefinition Thumb = Fingers.addOrReplaceChild("Thumb",
				CubeListBuilder.create().texOffs(28, 6).addBox(-1.0025F, -1.5917F, -0.0833F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(28, 24).addBox(-1.0025F, -0.5917F, -0.2583F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-8.9088F, 15.9535F, -3.7378F));
		PartDefinition cube_r1 = Thumb.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.475F)),
				PartPose.offsetAndRotation(0.005F, -0.3417F, 0.5167F, 0.0F, 0.0F, 0.7854F));
		PartDefinition ThumbDigit = Thumb.addOrReplaceChild(
				"ThumbDigit", CubeListBuilder.create().texOffs(28, 12).addBox(-1.0F, -0.3421F, -0.3642F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(28, 18).addBox(-1.0F, -0.5421F, -0.5392F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F))
						.texOffs(28, 29).addBox(-1.0F, 2.6421F, -0.5608F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)).texOffs(16, 30).addBox(-1.0F, 2.2421F, -0.7358F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(-0.0025F, 2.2355F, 0.098F));
		PartDefinition Pointer = Fingers.addOrReplaceChild("Pointer",
				CubeListBuilder.create().texOffs(20, 5).addBox(-0.1083F, -1.25F, -0.9975F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(0, 26).addBox(-0.2833F, -0.35F, -0.9975F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-12.878F, 15.95F, -2.7418F));
		PartDefinition cube_r2 = Pointer.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.475F)),
				PartPose.offsetAndRotation(0.4917F, -0.1F, -0.005F, 0.7854F, 0.0F, 0.0F));
		PartDefinition PointerDigit = Pointer.addOrReplaceChild(
				"PointerDigit", CubeListBuilder.create().texOffs(8, 26).addBox(-0.3557F, -0.4551F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(20, 24).addBox(-0.5307F, -0.7801F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F))
						.texOffs(24, 33).addBox(-0.5693F, 2.5301F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)).texOffs(32, 33).addBox(-0.7443F, 2.0051F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(0.0473F, 3.6051F, 0.0025F));
		PartDefinition Index = Fingers.addOrReplaceChild("Index",
				CubeListBuilder.create().texOffs(20, 5).addBox(-0.1083F, -1.25F, -0.9975F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(20, 18).addBox(-0.2833F, -0.35F, -0.9975F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-12.878F, 15.95F, 0.2332F));
		PartDefinition cube_r3 = Index.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 34).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.475F)),
				PartPose.offsetAndRotation(0.4917F, -0.1F, -0.005F, 0.7854F, 0.0F, 0.0F));
		PartDefinition IndexDigit = Index.addOrReplaceChild(
				"IndexDigit", CubeListBuilder.create().texOffs(8, 26).addBox(-0.3557F, -0.4801F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(20, 12).addBox(-0.5307F, -0.8051F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F))
						.texOffs(0, 32).addBox(-0.5693F, 2.5051F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)).texOffs(8, 32).addBox(-0.7443F, 1.9801F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(0.0473F, 3.6301F, 0.0025F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		if (pEntity instanceof AnimationInterface animationInterface) {
			this.animate(animationInterface.VSArimaKakujaClawIdleAnimationState(), VSArimaKakujaAnimations.VSArimaKakujaClawIdle, pAgeInTicks);
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
