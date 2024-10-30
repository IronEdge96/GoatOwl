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

import net.ironedge.goatowl.KanekiRinkakuBladeAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelkanekirinkakublade<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelkanekirinkakublade"), "main");
	public final ModelPart root;
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart Tails;
	public final ModelPart Tail;
	public final ModelPart BladeSegment;
	public final ModelPart BladeSegment2;
	public final ModelPart BladeSegment3;
	public final ModelPart BladeSegment4;
	public final ModelPart BladeSegment5;
	public final ModelPart BladeSegment6;
	public final ModelPart BladeSegment7;
	public final ModelPart BladeSegment8;
	public final ModelPart BladeSegment9;
	public final ModelPart BladeSegment10;
	public final ModelPart BladeSegment11;
	public final ModelPart BladeSegment12;
	public final ModelPart BladeSegment13;
	public final ModelPart BladeSegment14;
	public final ModelPart BladeSegment15;
	public final ModelPart BladeSegment16;
	public final ModelPart BladeSegment17;
	public final ModelPart BladeSegment18;
	public final ModelPart BladeSegment19;
	public final ModelPart BladeSegment20;
	public final ModelPart BladeSegment21;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelkanekirinkakublade(ModelPart root) {
		this.root = root;
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tails = this.Body.getChild("Tails");
		this.Tail = this.Tails.getChild("Tail");
		this.BladeSegment = this.Tail.getChild("BladeSegment");
		this.BladeSegment2 = this.BladeSegment.getChild("BladeSegment2");
		this.BladeSegment3 = this.BladeSegment2.getChild("BladeSegment3");
		this.BladeSegment4 = this.BladeSegment3.getChild("BladeSegment4");
		this.BladeSegment5 = this.BladeSegment4.getChild("BladeSegment5");
		this.BladeSegment6 = this.BladeSegment5.getChild("BladeSegment6");
		this.BladeSegment7 = this.BladeSegment6.getChild("BladeSegment7");
		this.BladeSegment8 = this.BladeSegment7.getChild("BladeSegment8");
		this.BladeSegment9 = this.BladeSegment8.getChild("BladeSegment9");
		this.BladeSegment10 = this.BladeSegment9.getChild("BladeSegment10");
		this.BladeSegment11 = this.BladeSegment10.getChild("BladeSegment11");
		this.BladeSegment12 = this.BladeSegment11.getChild("BladeSegment12");
		this.BladeSegment13 = this.BladeSegment12.getChild("BladeSegment13");
		this.BladeSegment14 = this.BladeSegment13.getChild("BladeSegment14");
		this.BladeSegment15 = this.BladeSegment14.getChild("BladeSegment15");
		this.BladeSegment16 = this.BladeSegment15.getChild("BladeSegment16");
		this.BladeSegment17 = this.BladeSegment16.getChild("BladeSegment17");
		this.BladeSegment18 = this.BladeSegment17.getChild("BladeSegment18");
		this.BladeSegment19 = this.BladeSegment18.getChild("BladeSegment19");
		this.BladeSegment20 = this.BladeSegment19.getChild("BladeSegment20");
		this.BladeSegment21 = this.BladeSegment20.getChild("BladeSegment21");
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
		PartDefinition Tail = Tails.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.05F, 0.3087F, -0.0637F));
		PartDefinition BladeSegment = Tail.addOrReplaceChild("BladeSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition BladeSegment2 = BladeSegment.addOrReplaceChild("BladeSegment2",
				CubeListBuilder.create().texOffs(48, 119).addBox(1.5F, -0.875F, 0.5F, 3.0F, 2.0F, 19.0F, new CubeDeformation(0.5F)).texOffs(0, 100).addBox(0.5F, -0.525F, 0.25F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.025F, 0.125F, -1.475F));
		PartDefinition BladeSegment3 = BladeSegment2.addOrReplaceChild("BladeSegment3",
				CubeListBuilder.create().texOffs(48, 160).addBox(1.5F, -0.875F, 0.5F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.5F)).texOffs(24, 160).addBox(0.5F, -0.525F, 0.25F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 20.0F));
		PartDefinition BladeSegment4 = BladeSegment3.addOrReplaceChild("BladeSegment4",
				CubeListBuilder.create().texOffs(92, 119).addBox(1.5F, -0.875F, 0.5F, 3.0F, 2.0F, 19.0F, new CubeDeformation(0.5F)).texOffs(100, 99).addBox(0.5F, -0.525F, 0.25F, 5.0F, 1.0F, 19.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 8.0F));
		PartDefinition BladeSegment5 = BladeSegment4.addOrReplaceChild("BladeSegment5",
				CubeListBuilder.create().texOffs(144, 157).addBox(0.0F, -0.4F, 0.275F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(0, 160).addBox(1.0F, -1.0F, 0.525F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.125F, 19.975F));
		PartDefinition BladeSegment6 = BladeSegment5.addOrReplaceChild("BladeSegment6",
				CubeListBuilder.create().texOffs(50, 79).addBox(0.0F, -0.4F, 0.275F, 6.0F, 1.0F, 19.0F, new CubeDeformation(0.5F)).texOffs(110, 0).addBox(1.0F, -1.0F, 0.525F, 4.0F, 2.0F, 19.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition BladeSegment7 = BladeSegment6.addOrReplaceChild("BladeSegment7",
				CubeListBuilder.create().texOffs(80, 140).addBox(0.0F, -0.4F, 0.25F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.5F)).texOffs(152, 57).addBox(1.0F, -1.0F, 0.5F, 4.0F, 2.0F, 13.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 20.025F));
		PartDefinition BladeSegment8 = BladeSegment7.addOrReplaceChild("BladeSegment8",
				CubeListBuilder.create().texOffs(110, 21).addBox(1.0F, -1.0F, 0.525F, 4.0F, 2.0F, 19.0F, new CubeDeformation(0.5F)).texOffs(50, 99).addBox(0.0F, -0.4F, 0.275F, 6.0F, 1.0F, 19.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 13.975F));
		PartDefinition BladeSegment9 = BladeSegment8.addOrReplaceChild("BladeSegment9", CubeListBuilder.create().texOffs(116, 157).mirror().addBox(-3.5F, -1.0F, 0.525F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.5F)).mirror(false).texOffs(156, 32)
				.mirror().addBox(-4.5F, -0.4F, 0.275F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(3.5F, 0.0F, 20.0F));
		PartDefinition BladeSegment10 = BladeSegment9.addOrReplaceChild("BladeSegment10", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-4.0F, -1.0F, 0.525F, 6.0F, 2.0F, 19.0F, new CubeDeformation(0.5F)).mirror(false).texOffs(56, 39)
				.mirror().addBox(-5.0F, -0.4F, 0.275F, 8.0F, 1.0F, 19.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(0.5F, 0.0F, 9.0F));
		PartDefinition BladeSegment11 = BladeSegment10.addOrReplaceChild("BladeSegment11", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-3.0F, -1.0F, 1.525F, 7.0F, 2.0F, 19.0F, new CubeDeformation(0.5F)).mirror(false).texOffs(0, 19)
				.mirror().addBox(-4.0F, -0.4F, 1.275F, 9.0F, 1.0F, 19.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(-2.0F, 0.0F, 19.0F));
		PartDefinition BladeSegment12 = BladeSegment11.addOrReplaceChild("BladeSegment12", CubeListBuilder.create().texOffs(148, 78).mirror().addBox(-3.5F, -0.4F, 2.275F, 9.0F, 1.0F, 11.0F, new CubeDeformation(0.5F)).mirror(false).texOffs(80, 154)
				.mirror().addBox(-2.5F, -1.0F, 2.525F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(-0.5F, 0.0F, 19.0F));
		PartDefinition BladeSegment13 = BladeSegment12.addOrReplaceChild("BladeSegment13", CubeListBuilder.create().texOffs(110, 42).mirror().addBox(-3.25F, -0.4F, 1.275F, 10.0F, 1.0F, 11.0F, new CubeDeformation(0.5F)).mirror(false).texOffs(148, 106)
				.mirror().addBox(-2.25F, -1.0F, 1.525F, 8.0F, 2.0F, 11.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(-1.25F, 0.0F, 13.0F));
		PartDefinition BladeSegment14 = BladeSegment13.addOrReplaceChild("BladeSegment14",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -0.4F, 0.275F, 11.0F, 1.0F, 18.0F, new CubeDeformation(0.5F)).texOffs(56, 19).addBox(-3.5F, -1.0F, 0.525F, 9.0F, 2.0F, 18.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.25F, 0.0F, 13.0F));
		PartDefinition BladeSegment15 = BladeSegment14.addOrReplaceChild("BladeSegment15",
				CubeListBuilder.create().texOffs(52, 59).addBox(-3.5F, -1.0F, -56.475F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.5F)).texOffs(0, 39).addBox(-4.5F, -0.4F, -56.725F, 10.0F, 1.0F, 18.0F, new CubeDeformation(0.5F)),
				PartPose.offset(1.0F, 0.0F, 76.0F));
		PartDefinition BladeSegment16 = BladeSegment15.addOrReplaceChild("BladeSegment16",
				CubeListBuilder.create().texOffs(58, 0).addBox(-3.5F, -0.4F, -56.725F, 8.0F, 1.0F, 18.0F, new CubeDeformation(0.5F)).texOffs(100, 79).addBox(-2.5F, -1.0F, -56.475F, 6.0F, 2.0F, 18.0F, new CubeDeformation(0.5F)),
				PartPose.offset(1.0F, 0.0F, 19.0F));
		PartDefinition BladeSegment17 = BladeSegment16.addOrReplaceChild("BladeSegment17",
				CubeListBuilder.create().texOffs(104, 59).addBox(-2.0F, -0.4F, -56.725F, 6.0F, 1.0F, 18.0F, new CubeDeformation(0.5F)).texOffs(0, 120).addBox(-1.0F, -1.0F, -56.475F, 4.0F, 2.0F, 18.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.5F, 0.0F, 19.0F));
		PartDefinition BladeSegment18 = BladeSegment17.addOrReplaceChild("BladeSegment18",
				CubeListBuilder.create().texOffs(40, 140).addBox(0.0F, -1.0F, -52.5F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.5F)).texOffs(136, 138).addBox(-1.0F, -0.4F, -52.75F, 4.0F, 1.0F, 18.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 15.025F));
		PartDefinition BladeSegment19 = BladeSegment18.addOrReplaceChild("BladeSegment19",
				CubeListBuilder.create().texOffs(136, 119).addBox(-1.0F, -0.4F, -33.75F, 4.0F, 1.0F, 18.0F, new CubeDeformation(0.5F)).texOffs(0, 140).addBox(0.0F, -1.0F, -33.5F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition BladeSegment20 = BladeSegment19.addOrReplaceChild("BladeSegment20",
				CubeListBuilder.create().texOffs(152, 42).addBox(-1.0F, -0.4F, -14.75F, 4.0F, 1.0F, 14.0F, new CubeDeformation(0.5F)).texOffs(156, 0).addBox(0.0F, -1.0F, -14.5F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition BladeSegment21 = BladeSegment20.addOrReplaceChild("BladeSegment21",
				CubeListBuilder.create().texOffs(148, 90).addBox(0.0F, -0.4F, 0.25F, 3.0F, 1.0F, 15.0F, new CubeDeformation(0.5F)).texOffs(156, 16).addBox(0.0F, -1.0F, 0.5F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
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
			this.animate(animationInterface.getKanekiIdleBladeAnimationState(), KanekiRinkakuBladeAnimations.KanekiIdleBlade, pAgeInTicks);
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
