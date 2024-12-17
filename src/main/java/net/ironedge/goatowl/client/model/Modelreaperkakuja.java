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
import net.minecraft.client.model.HierarchicalModel;

import net.ironedge.goatowl.ReaperKakujaAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelreaperkakuja<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelreaperkakuja"), "main");
	public final ModelPart root;
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart RightHand;
	public final ModelPart Fingers;
	public final ModelPart Thumb;
	public final ModelPart ThumbDigit;
	public final ModelPart ThumbTIp;
	public final ModelPart Pointer;
	public final ModelPart PointerDigit;
	public final ModelPart PointerTip;
	public final ModelPart Index;
	public final ModelPart IndexDigit;
	public final ModelPart IndexTip;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelreaperkakuja(ModelPart root) {
		this.root = root;
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.RightHand = this.RightArm.getChild("RightHand");
		this.Fingers = this.RightHand.getChild("Fingers");
		this.Thumb = this.Fingers.getChild("Thumb");
		this.ThumbDigit = this.Thumb.getChild("ThumbDigit");
		this.ThumbTIp = this.ThumbDigit.getChild("ThumbTIp");
		this.Pointer = this.Fingers.getChild("Pointer");
		this.PointerDigit = this.Pointer.getChild("PointerDigit");
		this.PointerTip = this.PointerDigit.getChild("PointerTip");
		this.Index = this.Fingers.getChild("Index");
		this.IndexDigit = this.Index.getChild("IndexDigit");
		this.IndexTip = this.IndexDigit.getChild("IndexTip");
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
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 10).addBox(-3.5F, -0.95F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(-0.15F)).texOffs(0, 19).addBox(-3.5F, 3.7F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(0, 0)
						.addBox(-3.5F, 7.1F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-3.5F, 2.4F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)).texOffs(20, 7)
						.addBox(-3.5F, -2.4F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.375F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition dontTouch_r1 = RightArm.addOrReplaceChild("dontTouch_r1", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5101F, -1.2362F, -3.2396F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.275F)),
				PartPose.offsetAndRotation(-3.2484F, 6.1312F, 2.4272F, 1.1313F, -0.1309F, 0.0F));
		PartDefinition dontTouch_r2 = RightArm.addOrReplaceChild("dontTouch_r2", CubeListBuilder.create().texOffs(32, 32).addBox(-0.4899F, -0.5085F, -3.0527F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.275F)),
				PartPose.offsetAndRotation(-3.2484F, 6.1312F, 2.4272F, 1.2259F, -0.1309F, 0.0F));
		PartDefinition dontTouch_r3 = RightArm.addOrReplaceChild("dontTouch_r3", CubeListBuilder.create().texOffs(26, 45).addBox(-0.4899F, -1.9579F, -0.6702F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.275F)),
				PartPose.offsetAndRotation(-3.2484F, 6.1312F, 2.4272F, 0.4841F, -0.1309F, 0.0F));
		PartDefinition RightHand = RightArm.addOrReplaceChild("RightHand", CubeListBuilder.create(), PartPose.offset(-3.519F, 9.2855F, 0.2787F));
		PartDefinition Fingers = RightHand.addOrReplaceChild("Fingers", CubeListBuilder.create(), PartPose.offset(12.9053F, -13.1355F, 0.9606F));
		PartDefinition Thumb = Fingers.addOrReplaceChild("Thumb",
				CubeListBuilder.create().texOffs(18, 43).addBox(-0.15F, -0.2608F, -0.1694F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(44, 31).addBox(-0.15F, -0.2608F, -0.3444F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-9.7613F, 14.6226F, -3.6518F));
		PartDefinition ThumbDigit = Thumb.addOrReplaceChild("ThumbDigit",
				CubeListBuilder.create().texOffs(44, 37).addBox(-0.15F, -0.25F, -0.35F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(44, 43).addBox(-0.15F, -0.45F, -0.525F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 3.4742F, -0.0023F));
		PartDefinition ThumbTIp = ThumbDigit.addOrReplaceChild("ThumbTIp",
				CubeListBuilder.create().texOffs(46, 17).addBox(-0.15F, -0.375F, -0.55F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).texOffs(48, 5).addBox(-0.15F, -0.775F, -0.725F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(0.0F, 3.1093F, 0.0034F));
		PartDefinition Pointer = Fingers.addOrReplaceChild("Pointer",
				CubeListBuilder.create().texOffs(20, 37).addBox(-0.1751F, -0.3F, -1.2618F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(40, 6).addBox(-0.3501F, -0.4F, -1.2618F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-12.8112F, 16.0F, -2.4775F));
		PartDefinition PointerDigit = Pointer.addOrReplaceChild("PointerDigit",
				CubeListBuilder.create().texOffs(10, 41).addBox(-0.1548F, -0.3299F, -1.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(40, 0).addBox(-0.3298F, -0.6549F, -1.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(-0.2203F, 3.4299F, -0.0118F));
		PartDefinition PointerTip = PointerDigit.addOrReplaceChild("PointerTip",
				CubeListBuilder.create().texOffs(8, 47).addBox(-0.6F, -0.45F, -1.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).texOffs(46, 12).addBox(-0.775F, -0.975F, -1.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(0.2316F, 3.1054F, 0.0F));
		PartDefinition Index = Fingers.addOrReplaceChild("Index",
				CubeListBuilder.create().texOffs(38, 14).addBox(-0.1751F, -0.3F, -0.5132F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(36, 39).addBox(-0.3501F, -0.4F, -0.5132F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-12.8112F, 16.0F, -0.2511F));
		PartDefinition IndexDigit = Index.addOrReplaceChild("IndexDigit",
				CubeListBuilder.create().texOffs(0, 43).addBox(-0.1548F, -0.3299F, -0.525F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(28, 39).addBox(-0.3298F, -0.6549F, -0.525F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(-0.2203F, 3.4299F, 0.0118F));
		PartDefinition IndexTip = IndexDigit.addOrReplaceChild("IndexTip",
				CubeListBuilder.create().texOffs(48, 0).addBox(-0.6F, -0.45F, -0.525F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).texOffs(34, 45).addBox(-0.775F, -0.975F, -0.525F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(0.2316F, 3.1054F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		if (pEntity instanceof AnimationInterface animationInterface) {
			this.animate(animationInterface.getReaperKakujaIdleAnimationState(), ReaperKakujaAnimations.ReaperKakujaIdle, pAgeInTicks);
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
