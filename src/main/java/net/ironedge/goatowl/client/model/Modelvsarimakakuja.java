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

import net.ironedge.goatowl.VSArimaKakujaAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelvsarimakakuja<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelvsarimakakuja"), "main");
	public final ModelPart root;
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart Tails;
	public final ModelPart Tail1;
	public final ModelPart RightTopTailSegment;
	public final ModelPart RightTopTailSegment2;
	public final ModelPart RightTopTailSegment3;
	public final ModelPart RightTopTailSegment4;
	public final ModelPart RightTopTailSegment5;
	public final ModelPart RightTopTailSegment6;
	public final ModelPart RightTopTailSegment7;
	public final ModelPart RightTopTailSegment8;
	public final ModelPart RightTopTailSegment9;
	public final ModelPart RightTopTailSegment10;
	public final ModelPart RightTopTailSegment11;
	public final ModelPart RightTopTailSegment12;
	public final ModelPart RightTopTailSegment13;
	public final ModelPart RightTopTailSegment14;
	public final ModelPart RightTopTailSegment15;
	public final ModelPart RightTopTailBlade;
	public final ModelPart Tail2;
	public final ModelPart LeftTopTailSegment;
	public final ModelPart LeftTopTailSegment2;
	public final ModelPart LeftTopTailSegment3;
	public final ModelPart LeftTopTailSegment4;
	public final ModelPart LeftTopTailSegment5;
	public final ModelPart LeftTopTailSegment6;
	public final ModelPart LeftTopTailSegment7;
	public final ModelPart LeftTopTailSegment8;
	public final ModelPart LeftTopTailSegment9;
	public final ModelPart LeftTopTailSegment10;
	public final ModelPart LeftTopTailSegment11;
	public final ModelPart LeftTopTailSegment12;
	public final ModelPart LeftTopTailSegment13;
	public final ModelPart LeftTopTailSegment14;
	public final ModelPart LeftTopTailSegment15;
	public final ModelPart LeftTopTailBlade;
	public final ModelPart Tail3;
	public final ModelPart RightBottomTailSegment;
	public final ModelPart RightBottomTailSegment2;
	public final ModelPart RightBottomTailSegment3;
	public final ModelPart RightBottomTailSegment4;
	public final ModelPart RightBottomTailSegment5;
	public final ModelPart RightBottomTailSegment6;
	public final ModelPart RightBottomTailSegment7;
	public final ModelPart RightBottomTailSegment8;
	public final ModelPart RightBottomTailSegment9;
	public final ModelPart RightBottomTailSegment10;
	public final ModelPart RightBottomTailSegment11;
	public final ModelPart RightBottomTailSegment12;
	public final ModelPart RightBottomTailSegment13;
	public final ModelPart RightBottomTailSegment14;
	public final ModelPart RightBottomTailSegment15;
	public final ModelPart RightBottomTailBlade;
	public final ModelPart Tail4;
	public final ModelPart LeftBottomTailSegment;
	public final ModelPart LeftBottomTailSegment2;
	public final ModelPart LeftBottomTailSegment3;
	public final ModelPart LeftBottomTailSegment4;
	public final ModelPart LeftBottomTailSegment5;
	public final ModelPart LeftBottomTailSegment6;
	public final ModelPart LeftBottomTailSegment7;
	public final ModelPart LeftBottomTailSegment8;
	public final ModelPart LeftBottomTailSegment9;
	public final ModelPart LeftBottomTailSegment10;
	public final ModelPart LeftBottomTailSegment11;
	public final ModelPart LeftBottomTailSegment12;
	public final ModelPart LeftBottomTailSegment13;
	public final ModelPart LeftBottomTailSegment14;
	public final ModelPart LeftBottomTailSegment15;
	public final ModelPart LeftBottomTailBlade;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelvsarimakakuja(ModelPart root) {
		this.root = root;
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tails = this.Body.getChild("Tails");
		this.Tail1 = this.Tails.getChild("Tail1");
		this.RightTopTailSegment = this.Tail1.getChild("RightTopTailSegment");
		this.RightTopTailSegment2 = this.RightTopTailSegment.getChild("RightTopTailSegment2");
		this.RightTopTailSegment3 = this.RightTopTailSegment2.getChild("RightTopTailSegment3");
		this.RightTopTailSegment4 = this.RightTopTailSegment3.getChild("RightTopTailSegment4");
		this.RightTopTailSegment5 = this.RightTopTailSegment4.getChild("RightTopTailSegment5");
		this.RightTopTailSegment6 = this.RightTopTailSegment5.getChild("RightTopTailSegment6");
		this.RightTopTailSegment7 = this.RightTopTailSegment6.getChild("RightTopTailSegment7");
		this.RightTopTailSegment8 = this.RightTopTailSegment7.getChild("RightTopTailSegment8");
		this.RightTopTailSegment9 = this.RightTopTailSegment8.getChild("RightTopTailSegment9");
		this.RightTopTailSegment10 = this.RightTopTailSegment9.getChild("RightTopTailSegment10");
		this.RightTopTailSegment11 = this.RightTopTailSegment10.getChild("RightTopTailSegment11");
		this.RightTopTailSegment12 = this.RightTopTailSegment11.getChild("RightTopTailSegment12");
		this.RightTopTailSegment13 = this.RightTopTailSegment12.getChild("RightTopTailSegment13");
		this.RightTopTailSegment14 = this.RightTopTailSegment13.getChild("RightTopTailSegment14");
		this.RightTopTailSegment15 = this.RightTopTailSegment14.getChild("RightTopTailSegment15");
		this.RightTopTailBlade = this.RightTopTailSegment15.getChild("RightTopTailBlade");
		this.Tail2 = this.Tails.getChild("Tail2");
		this.LeftTopTailSegment = this.Tail2.getChild("LeftTopTailSegment");
		this.LeftTopTailSegment2 = this.LeftTopTailSegment.getChild("LeftTopTailSegment2");
		this.LeftTopTailSegment3 = this.LeftTopTailSegment2.getChild("LeftTopTailSegment3");
		this.LeftTopTailSegment4 = this.LeftTopTailSegment3.getChild("LeftTopTailSegment4");
		this.LeftTopTailSegment5 = this.LeftTopTailSegment4.getChild("LeftTopTailSegment5");
		this.LeftTopTailSegment6 = this.LeftTopTailSegment5.getChild("LeftTopTailSegment6");
		this.LeftTopTailSegment7 = this.LeftTopTailSegment6.getChild("LeftTopTailSegment7");
		this.LeftTopTailSegment8 = this.LeftTopTailSegment7.getChild("LeftTopTailSegment8");
		this.LeftTopTailSegment9 = this.LeftTopTailSegment8.getChild("LeftTopTailSegment9");
		this.LeftTopTailSegment10 = this.LeftTopTailSegment9.getChild("LeftTopTailSegment10");
		this.LeftTopTailSegment11 = this.LeftTopTailSegment10.getChild("LeftTopTailSegment11");
		this.LeftTopTailSegment12 = this.LeftTopTailSegment11.getChild("LeftTopTailSegment12");
		this.LeftTopTailSegment13 = this.LeftTopTailSegment12.getChild("LeftTopTailSegment13");
		this.LeftTopTailSegment14 = this.LeftTopTailSegment13.getChild("LeftTopTailSegment14");
		this.LeftTopTailSegment15 = this.LeftTopTailSegment14.getChild("LeftTopTailSegment15");
		this.LeftTopTailBlade = this.LeftTopTailSegment15.getChild("LeftTopTailBlade");
		this.Tail3 = this.Tails.getChild("Tail3");
		this.RightBottomTailSegment = this.Tail3.getChild("RightBottomTailSegment");
		this.RightBottomTailSegment2 = this.RightBottomTailSegment.getChild("RightBottomTailSegment2");
		this.RightBottomTailSegment3 = this.RightBottomTailSegment2.getChild("RightBottomTailSegment3");
		this.RightBottomTailSegment4 = this.RightBottomTailSegment3.getChild("RightBottomTailSegment4");
		this.RightBottomTailSegment5 = this.RightBottomTailSegment4.getChild("RightBottomTailSegment5");
		this.RightBottomTailSegment6 = this.RightBottomTailSegment5.getChild("RightBottomTailSegment6");
		this.RightBottomTailSegment7 = this.RightBottomTailSegment6.getChild("RightBottomTailSegment7");
		this.RightBottomTailSegment8 = this.RightBottomTailSegment7.getChild("RightBottomTailSegment8");
		this.RightBottomTailSegment9 = this.RightBottomTailSegment8.getChild("RightBottomTailSegment9");
		this.RightBottomTailSegment10 = this.RightBottomTailSegment9.getChild("RightBottomTailSegment10");
		this.RightBottomTailSegment11 = this.RightBottomTailSegment10.getChild("RightBottomTailSegment11");
		this.RightBottomTailSegment12 = this.RightBottomTailSegment11.getChild("RightBottomTailSegment12");
		this.RightBottomTailSegment13 = this.RightBottomTailSegment12.getChild("RightBottomTailSegment13");
		this.RightBottomTailSegment14 = this.RightBottomTailSegment13.getChild("RightBottomTailSegment14");
		this.RightBottomTailSegment15 = this.RightBottomTailSegment14.getChild("RightBottomTailSegment15");
		this.RightBottomTailBlade = this.RightBottomTailSegment15.getChild("RightBottomTailBlade");
		this.Tail4 = this.Tails.getChild("Tail4");
		this.LeftBottomTailSegment = this.Tail4.getChild("LeftBottomTailSegment");
		this.LeftBottomTailSegment2 = this.LeftBottomTailSegment.getChild("LeftBottomTailSegment2");
		this.LeftBottomTailSegment3 = this.LeftBottomTailSegment2.getChild("LeftBottomTailSegment3");
		this.LeftBottomTailSegment4 = this.LeftBottomTailSegment3.getChild("LeftBottomTailSegment4");
		this.LeftBottomTailSegment5 = this.LeftBottomTailSegment4.getChild("LeftBottomTailSegment5");
		this.LeftBottomTailSegment6 = this.LeftBottomTailSegment5.getChild("LeftBottomTailSegment6");
		this.LeftBottomTailSegment7 = this.LeftBottomTailSegment6.getChild("LeftBottomTailSegment7");
		this.LeftBottomTailSegment8 = this.LeftBottomTailSegment7.getChild("LeftBottomTailSegment8");
		this.LeftBottomTailSegment9 = this.LeftBottomTailSegment8.getChild("LeftBottomTailSegment9");
		this.LeftBottomTailSegment10 = this.LeftBottomTailSegment9.getChild("LeftBottomTailSegment10");
		this.LeftBottomTailSegment11 = this.LeftBottomTailSegment10.getChild("LeftBottomTailSegment11");
		this.LeftBottomTailSegment12 = this.LeftBottomTailSegment11.getChild("LeftBottomTailSegment12");
		this.LeftBottomTailSegment13 = this.LeftBottomTailSegment12.getChild("LeftBottomTailSegment13");
		this.LeftBottomTailSegment14 = this.LeftBottomTailSegment13.getChild("LeftBottomTailSegment14");
		this.LeftBottomTailSegment15 = this.LeftBottomTailSegment14.getChild("LeftBottomTailSegment15");
		this.LeftBottomTailBlade = this.LeftBottomTailSegment15.getChild("LeftBottomTailBlade");
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
		PartDefinition Tail1 = Tails.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offset(-1.75F, 0.3087F, -1.8137F));
		PartDefinition RightTopTailSegment = Tail1.addOrReplaceChild("RightTopTailSegment", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightTopTailSegment2 = RightTopTailSegment.addOrReplaceChild("RightTopTailSegment2",
				CubeListBuilder.create().texOffs(127, 100).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 18).addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 108)
						.addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-1, 137).addBox(-1.5F, -2.0F, 7.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(39, 116)
						.addBox(-2.5F, -1.5F, 7.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightTopTailSegment3 = RightTopTailSegment2.addOrReplaceChild("RightTopTailSegment3",
				CubeListBuilder.create().texOffs(80, 95).addBox(-3.0F, -1.5F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 128).addBox(-2.0F, -4.0F, 1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 140)
						.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 25).addBox(-4.0F, -1.5F, 4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 9)
						.addBox(-3.0F, -5.0F, 4.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 144).addBox(-0.5F, -5.0F, 3.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 14).addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition RightTopTailSegment4 = RightTopTailSegment3.addOrReplaceChild("RightTopTailSegment4",
				CubeListBuilder.create().texOffs(84, 5).addBox(-4.0F, -1.5F, 1.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 41).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 19)
						.addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 45).addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 145)
						.addBox(-0.5F, -5.0F, 2.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 56).addBox(-3.5F, -1.5F, 4.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 85)
						.addBox(-2.0F, -4.0F, 4.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightTopTailSegment5 = RightTopTailSegment4.addOrReplaceChild("RightTopTailSegment5",
				CubeListBuilder.create().texOffs(120, 146).addBox(-1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(118, 4).addBox(-2.5F, -1.5F, 4.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 159)
						.addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 146).addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 82)
						.addBox(-3.0F, -1.5F, 2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 155).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(67, 128)
						.addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(95, 35).addBox(-3.0F, -1.5F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition RightTopTailSegment6 = RightTopTailSegment5.addOrReplaceChild("RightTopTailSegment6",
				CubeListBuilder.create().texOffs(117, 20).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(145, 123).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 45)
						.addBox(-0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 26).addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 90)
						.addBox(-1.0F, -3.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 167).addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 54)
						.addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 0).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition RightTopTailSegment7 = RightTopTailSegment6.addOrReplaceChild("RightTopTailSegment7",
				CubeListBuilder.create().texOffs(31, 82).addBox(-2.5F, -1.5F, -1.0333F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(61, 129).addBox(-1.0F, -3.0F, -1.0333F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(128, 146)
						.addBox(-1.0F, -2.5F, 0.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 160).addBox(-0.5F, -3.0F, 0.9667F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(146, 131)
						.addBox(-1.0F, -2.5F, 2.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(118, 71).addBox(-2.5F, -1.5F, 2.9667F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0333F));
		PartDefinition RightTopTailSegment8 = RightTopTailSegment7.addOrReplaceChild("RightTopTailSegment8",
				CubeListBuilder.create().texOffs(139, 30).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(163, 116).addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(147, 7)
						.addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(-1, 119).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 4.9667F));
		PartDefinition RightTopTailSegment9 = RightTopTailSegment8.addOrReplaceChild("RightTopTailSegment9",
				CubeListBuilder.create().texOffs(54, 120).addBox(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 129).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 24)
						.addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 89).addBox(-1.5F, -3.5F, 2.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition RightTopTailSegment10 = RightTopTailSegment9.addOrReplaceChild("RightTopTailSegment10",
				CubeListBuilder.create().texOffs(119, 54).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 118).addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(110, 148)
						.addBox(-1.5F, -3.0F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 140).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightTopTailSegment11 = RightTopTailSegment10.addOrReplaceChild("RightTopTailSegment11",
				CubeListBuilder.create().texOffs(-1, 71).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(105, 16).addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(95, 107)
						.addBox(-1.5F, -2.5F, -1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 148).addBox(-0.5F, -2.75F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 95)
						.addBox(-2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 136).addBox(-0.5F, -2.5F, 3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 160)
						.addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition RightTopTailSegment12 = RightTopTailSegment11.addOrReplaceChild("RightTopTailSegment12",
				CubeListBuilder.create().texOffs(128, 81).addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 147).addBox(-0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(115, 159)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 26).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(131, 3)
						.addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightTopTailSegment13 = RightTopTailSegment12.addOrReplaceChild("RightTopTailSegment13", CubeListBuilder.create().texOffs(131, 69).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(134, 120)
				.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 100).addBox(-2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition RightTopTailSegment14 = RightTopTailSegment13.addOrReplaceChild("RightTopTailSegment14", CubeListBuilder.create().texOffs(19, 131).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(148, 75)
				.addBox(-1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 60).addBox(-0.5F, 0.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightTopTailSegment15 = RightTopTailSegment14.addOrReplaceChild("RightTopTailSegment15",
				CubeListBuilder.create().texOffs(163, 64).addBox(-1.5F, -0.8333F, 2.9833F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(155, 109).addBox(-0.5F, -1.3333F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(160, 110)
						.addBox(-0.5F, -1.0833F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 103).addBox(-0.5F, -1.0833F, 0.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(147, 85)
						.addBox(-1.5F, -0.8333F, -1.0167F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(164, 157).addBox(-1.5F, -0.8333F, 1.9833F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
						.addBox(-0.5F, 1.4167F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(81, 23).addBox(-0.5F, 1.4167F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(101, 9)
						.addBox(-0.5F, 1.4167F, -1.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.6667F, 3.0167F));
		PartDefinition RightTopTailBlade = RightTopTailSegment15.addOrReplaceChild("RightTopTailBlade",
				CubeListBuilder.create().texOffs(138, 51).addBox(-0.5F, 0.75F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(170, 170).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 5)
						.addBox(-1.5F, -2.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 149).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(108, 108)
						.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(140, 101).addBox(-1.5F, -2.0F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 174)
						.addBox(-1.0F, -4.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 161).addBox(-0.5F, 1.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 143)
						.addBox(-0.5F, 1.5F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -1.5F, 5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-1.5F, -2.0F, 5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(74, 61).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(96, 87)
						.addBox(-0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(110, 41).addBox(-2.0F, -1.5F, 11.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 36)
						.addBox(-1.5F, -2.0F, 11.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(124, 160).addBox(-0.5F, -1.0F, 11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(172, 49)
						.addBox(-0.5F, 1.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(160, 80).addBox(-1.5F, -0.5F, 14.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.6667F, 3.9833F));
		PartDefinition cube_r1 = RightTopTailBlade.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 165).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.5F, 16.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r2 = RightTopTailBlade.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 150).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -0.9124F, 16.14F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r3 = RightTopTailBlade.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(164, 26).addBox(0.0F, 1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.3874F, 16.39F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r4 = RightTopTailBlade.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(172, 22).addBox(1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, 16.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r5 = RightTopTailBlade.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(98, 49).addBox(-0.5F, -1.4863F, 0.3038F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.5934F, 0.0F, 0.0F));
		PartDefinition cube_r6 = RightTopTailBlade.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(96, 94).addBox(-0.5F, -0.4339F, 0.4684F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r7 = RightTopTailBlade.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(172, 30).addBox(-0.5F, -0.8163F, -2.8605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r8 = RightTopTailBlade.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(134, 125).addBox(-1.0F, -0.8686F, -3.3457F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(88, 140).addBox(-0.5F, -1.3686F, -3.3457F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r9 = RightTopTailBlade.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(106, 41).addBox(-0.5F, -0.8163F, -3.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r10 = RightTopTailBlade.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(172, 3).addBox(-1.0F, -1.7851F, -4.0079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r11 = RightTopTailBlade.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(68, 174).addBox(-1.0F, -0.75F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 165).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.4067F, 9.4597F, -0.1833F, 0.0F, 0.0F));
		PartDefinition cube_r12 = RightTopTailBlade.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(134, 157).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(170, 56).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6965F, 12.0921F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r13 = RightTopTailBlade.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(46, 42).addBox(-0.5F, -0.25F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 71).addBox(0.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -3.1709F, 8.0385F, -0.1789F, 0.0F, 0.0F));
		PartDefinition cube_r14 = RightTopTailBlade.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(140, 80).addBox(-1.5F, -0.25F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(170, 52).addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -3.999F, 3.6067F, -0.1963F, 0.0F, 0.0F));
		PartDefinition cube_r15 = RightTopTailBlade.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(98, 132).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(158, 95).addBox(-0.5F, 0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.6967F, 0.1715F, 0.5454F, 0.0F, 0.0F));
		PartDefinition cube_r16 = RightTopTailBlade.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 157).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.7717F, 0.1965F, -0.24F, 0.0F, 0.0F));
		PartDefinition cube_r17 = RightTopTailBlade.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 171).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.6413F, 1.7175F, -0.4581F, 0.0F, 0.0F));
		PartDefinition Tail2 = Tails.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offset(1.75F, 0.3087F, -1.8137F));
		PartDefinition LeftTopTailSegment = Tail2.addOrReplaceChild("LeftTopTailSegment", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftTopTailSegment2 = LeftTopTailSegment.addOrReplaceChild("LeftTopTailSegment2",
				CubeListBuilder.create().texOffs(127, 100).mirror().addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 18).mirror()
						.addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 108).mirror().addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-1, 137).mirror()
						.addBox(-1.5F, -2.0F, 7.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 116).mirror().addBox(-2.5F, -1.5F, 7.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftTopTailSegment3 = LeftTopTailSegment2.addOrReplaceChild("LeftTopTailSegment3",
				CubeListBuilder.create().texOffs(80, 95).mirror().addBox(-3.0F, -1.5F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 128).mirror().addBox(-2.0F, -4.0F, 1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(10, 140).mirror().addBox(-2.0F, -3.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 25).mirror().addBox(-4.0F, -1.5F, 4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(20, 9).mirror().addBox(-3.0F, -5.0F, 4.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 144).mirror().addBox(-0.5F, -5.0F, 3.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 39).mirror().addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 14).mirror().addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition LeftTopTailSegment4 = LeftTopTailSegment3.addOrReplaceChild("LeftTopTailSegment4",
				CubeListBuilder.create().texOffs(84, 5).mirror().addBox(-4.0F, -1.5F, 1.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(31, 41).mirror().addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(72, 19).mirror().addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 45).mirror().addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(28, 145).mirror().addBox(-0.5F, -5.0F, 2.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 56).mirror().addBox(-3.5F, -1.5F, 4.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 85).mirror().addBox(-2.0F, -4.0F, 4.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftTopTailSegment5 = LeftTopTailSegment4.addOrReplaceChild("LeftTopTailSegment5",
				CubeListBuilder.create().texOffs(120, 146).mirror().addBox(-1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(118, 4).mirror().addBox(-2.5F, -1.5F, 4.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(32, 159).mirror().addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 146).mirror().addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(96, 82).mirror().addBox(-3.0F, -1.5F, 2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 155).mirror().addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(67, 128).mirror().addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(95, 35).mirror().addBox(-3.0F, -1.5F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition LeftTopTailSegment6 = LeftTopTailSegment5.addOrReplaceChild("LeftTopTailSegment6",
				CubeListBuilder.create().texOffs(117, 20).mirror().addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(145, 123).mirror()
						.addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 45).mirror().addBox(-0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(118, 26).mirror()
						.addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 90).mirror().addBox(-1.0F, -3.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 167).mirror()
						.addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(164, 54).mirror().addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 0).mirror()
						.addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition LeftTopTailSegment7 = LeftTopTailSegment6.addOrReplaceChild("LeftTopTailSegment7",
				CubeListBuilder.create().texOffs(31, 82).mirror().addBox(-2.5F, -1.5F, -1.0333F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(61, 129).mirror()
						.addBox(-1.0F, -3.0F, -1.0333F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(128, 146).mirror().addBox(-1.0F, -2.5F, 0.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 160)
						.mirror().addBox(-0.5F, -3.0F, 0.9667F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(146, 131).mirror().addBox(-1.0F, -2.5F, 2.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(118, 71).mirror().addBox(-2.5F, -1.5F, 2.9667F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0333F));
		PartDefinition LeftTopTailSegment8 = LeftTopTailSegment7.addOrReplaceChild("LeftTopTailSegment8",
				CubeListBuilder.create().texOffs(139, 30).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(163, 116).mirror()
						.addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(147, 7).mirror().addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-1, 119).mirror()
						.addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 4.9667F));
		PartDefinition LeftTopTailSegment9 = LeftTopTailSegment8.addOrReplaceChild("LeftTopTailSegment9",
				CubeListBuilder.create().texOffs(54, 120).mirror().addBox(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(112, 129).mirror()
						.addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 24).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 89).mirror()
						.addBox(-1.5F, -3.5F, 2.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition LeftTopTailSegment10 = LeftTopTailSegment9.addOrReplaceChild("LeftTopTailSegment10",
				CubeListBuilder.create().texOffs(119, 54).mirror().addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(13, 118).mirror()
						.addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 148).mirror().addBox(-1.5F, -3.0F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 140).mirror()
						.addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftTopTailSegment11 = LeftTopTailSegment10.addOrReplaceChild("LeftTopTailSegment11",
				CubeListBuilder.create().texOffs(-1, 71).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 16).mirror()
						.addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(95, 107).mirror().addBox(-1.5F, -2.5F, -1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(43, 148).mirror()
						.addBox(-0.5F, -2.75F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 95).mirror().addBox(-2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(164, 136).mirror()
						.addBox(-0.5F, -2.5F, 3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 160).mirror().addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition LeftTopTailSegment12 = LeftTopTailSegment11.addOrReplaceChild("LeftTopTailSegment12",
				CubeListBuilder.create().texOffs(128, 81).mirror().addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(164, 147).mirror()
						.addBox(-0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(115, 159).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 26).mirror()
						.addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(131, 3).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftTopTailSegment13 = LeftTopTailSegment12.addOrReplaceChild("LeftTopTailSegment13",
				CubeListBuilder.create().texOffs(131, 69).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(134, 120).mirror()
						.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 100).mirror().addBox(-2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition LeftTopTailSegment14 = LeftTopTailSegment13.addOrReplaceChild("LeftTopTailSegment14",
				CubeListBuilder.create().texOffs(19, 131).mirror().addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(148, 75).mirror()
						.addBox(-1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 60).mirror().addBox(-0.5F, 0.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftTopTailSegment15 = LeftTopTailSegment14.addOrReplaceChild("LeftTopTailSegment15",
				CubeListBuilder.create().texOffs(163, 64).mirror().addBox(-1.5F, -0.8333F, 2.9833F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(155, 109).mirror()
						.addBox(-0.5F, -1.3333F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(160, 110).mirror().addBox(-0.5F, -1.0833F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(152, 103).mirror().addBox(-0.5F, -1.0833F, 0.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(147, 85).mirror().addBox(-1.5F, -0.8333F, -1.0167F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(164, 157).mirror().addBox(-1.5F, -0.8333F, 1.9833F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(94, 49).mirror()
						.addBox(-0.5F, 1.4167F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(81, 23).mirror().addBox(-0.5F, 1.4167F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 9)
						.mirror().addBox(-0.5F, 1.4167F, -1.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -0.6667F, 3.0167F));
		PartDefinition LeftTopTailBlade = LeftTopTailSegment15.addOrReplaceChild("LeftTopTailBlade",
				CubeListBuilder.create().texOffs(138, 51).mirror().addBox(-0.5F, 0.75F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(170, 170).mirror()
						.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 5).mirror().addBox(-1.5F, -2.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(94, 149).mirror()
						.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(108, 108).mirror().addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 101).mirror()
						.addBox(-1.5F, -2.0F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 174).mirror().addBox(-1.0F, -4.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(164, 161).mirror()
						.addBox(-0.5F, 1.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 143).mirror().addBox(-0.5F, 1.5F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
						.addBox(-2.0F, -1.5F, 5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 0).mirror().addBox(-1.5F, -2.0F, 5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 61).mirror()
						.addBox(-1.0F, -2.0F, 5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(96, 87).mirror().addBox(-0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 41).mirror()
						.addBox(-2.0F, -1.5F, 11.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 36).mirror().addBox(-1.5F, -2.0F, 11.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(124, 160).mirror()
						.addBox(-0.5F, -1.0F, 11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(172, 49).mirror().addBox(-0.5F, 1.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(160, 80).mirror()
						.addBox(-1.5F, -0.5F, 14.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.6667F, 3.9833F));
		PartDefinition cube_r18 = LeftTopTailBlade.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(14, 165).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -0.5F, 16.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r19 = LeftTopTailBlade.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, -0.9124F, 16.14F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r20 = LeftTopTailBlade.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(164, 26).mirror().addBox(-2.0F, 1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -1.3874F, 16.39F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r21 = LeftTopTailBlade.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(172, 22).mirror().addBox(-2.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 0.0F, 16.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r22 = LeftTopTailBlade.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(98, 49).mirror().addBox(-0.5F, -1.4863F, 0.3038F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.5934F, 0.0F, 0.0F));
		PartDefinition cube_r23 = LeftTopTailBlade.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(96, 94).mirror().addBox(-0.5F, -0.4339F, 0.4684F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r24 = LeftTopTailBlade.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(172, 30).mirror().addBox(-0.5F, -0.8163F, -2.8605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r25 = LeftTopTailBlade.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(134, 125).mirror().addBox(-1.0F, -0.8686F, -3.3457F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 140)
				.mirror().addBox(-0.5F, -1.3686F, -3.3457F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r26 = LeftTopTailBlade.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(106, 41).mirror().addBox(-0.5F, -0.8163F, -3.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r27 = LeftTopTailBlade.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(172, 3).mirror().addBox(-1.0F, -1.7851F, -4.0079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r28 = LeftTopTailBlade.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(68, 174).mirror().addBox(-1.0F, -0.75F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 165).mirror()
				.addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4067F, 9.4597F, -0.1833F, 0.0F, 0.0F));
		PartDefinition cube_r29 = LeftTopTailBlade.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(134, 157).mirror().addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(170, 56).mirror()
				.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6965F, 12.0921F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r30 = LeftTopTailBlade.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(46, 42).mirror().addBox(-1.5F, -0.25F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 71).mirror()
				.addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -3.1709F, 8.0385F, -0.1789F, 0.0F, 0.0F));
		PartDefinition cube_r31 = LeftTopTailBlade.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(140, 80).mirror().addBox(-0.5F, -0.25F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(170, 52).mirror()
				.addBox(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.999F, 3.6067F, -0.1963F, 0.0F, 0.0F));
		PartDefinition cube_r32 = LeftTopTailBlade.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(98, 132).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(158, 95).mirror()
				.addBox(-0.5F, 0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.6967F, 0.1715F, 0.5454F, 0.0F, 0.0F));
		PartDefinition cube_r33 = LeftTopTailBlade.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(78, 157).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.7717F, 0.1965F, -0.24F, 0.0F, 0.0F));
		PartDefinition cube_r34 = LeftTopTailBlade.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(22, 171).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -2.6413F, 1.7175F, -0.4581F, 0.0F, 0.0F));
		PartDefinition Tail3 = Tails.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offset(-1.75F, 0.3087F, -1.8137F));
		PartDefinition RightBottomTailSegment = Tail3.addOrReplaceChild("RightBottomTailSegment", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightBottomTailSegment2 = RightBottomTailSegment.addOrReplaceChild("RightBottomTailSegment2",
				CubeListBuilder.create().texOffs(127, 100).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 18).addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 108)
						.addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-1, 137).addBox(-1.5F, -2.0F, 7.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(39, 116)
						.addBox(-2.5F, -1.5F, 7.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightBottomTailSegment3 = RightBottomTailSegment2.addOrReplaceChild("RightBottomTailSegment3",
				CubeListBuilder.create().texOffs(80, 95).addBox(-3.0F, -1.5F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 128).addBox(-2.0F, -4.0F, 1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 140)
						.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 25).addBox(-4.0F, -1.5F, 4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 9)
						.addBox(-3.0F, -5.0F, 4.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 144).addBox(-0.5F, -5.0F, 3.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 14).addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition RightBottomTailSegment4 = RightBottomTailSegment3.addOrReplaceChild("RightBottomTailSegment4",
				CubeListBuilder.create().texOffs(84, 5).addBox(-4.0F, -1.5F, 1.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 41).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 19)
						.addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 45).addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 145)
						.addBox(-0.5F, -5.0F, 2.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 56).addBox(-3.5F, -1.5F, 4.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 85)
						.addBox(-2.0F, -4.0F, 4.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightBottomTailSegment5 = RightBottomTailSegment4.addOrReplaceChild("RightBottomTailSegment5",
				CubeListBuilder.create().texOffs(120, 146).addBox(-1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(118, 4).addBox(-2.5F, -1.5F, 4.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 159)
						.addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 146).addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 82)
						.addBox(-3.0F, -1.5F, 2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 155).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(67, 128)
						.addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(95, 35).addBox(-3.0F, -1.5F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition RightBottomTailSegment6 = RightBottomTailSegment5.addOrReplaceChild("RightBottomTailSegment6",
				CubeListBuilder.create().texOffs(117, 20).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(145, 123).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 45)
						.addBox(-0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 26).addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 90)
						.addBox(-1.0F, -3.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 167).addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 54)
						.addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 0).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition RightBottomTailSegment7 = RightBottomTailSegment6.addOrReplaceChild("RightBottomTailSegment7",
				CubeListBuilder.create().texOffs(31, 82).addBox(-2.5F, -1.5F, -1.0333F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(61, 129).addBox(-1.0F, -3.0F, -1.0333F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(128, 146)
						.addBox(-1.0F, -2.5F, 0.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 160).addBox(-0.5F, -3.0F, 0.9667F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(146, 131)
						.addBox(-1.0F, -2.5F, 2.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(118, 71).addBox(-2.5F, -1.5F, 2.9667F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0333F));
		PartDefinition RightBottomTailSegment8 = RightBottomTailSegment7.addOrReplaceChild("RightBottomTailSegment8",
				CubeListBuilder.create().texOffs(139, 30).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(163, 116).addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(147, 7)
						.addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(-1, 119).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 4.9667F));
		PartDefinition RightBottomTailSegment9 = RightBottomTailSegment8.addOrReplaceChild("RightBottomTailSegment9",
				CubeListBuilder.create().texOffs(54, 120).addBox(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 129).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(86, 24)
						.addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 89).addBox(-1.5F, -3.5F, 2.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition RightBottomTailSegment10 = RightBottomTailSegment9.addOrReplaceChild("RightBottomTailSegment10",
				CubeListBuilder.create().texOffs(119, 54).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 118).addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(110, 148)
						.addBox(-1.5F, -3.0F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 140).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightBottomTailSegment11 = RightBottomTailSegment10.addOrReplaceChild("RightBottomTailSegment11",
				CubeListBuilder.create().texOffs(-1, 71).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(105, 16).addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(95, 107)
						.addBox(-1.5F, -2.5F, -1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 148).addBox(-0.5F, -2.75F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 95)
						.addBox(-2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 136).addBox(-0.5F, -2.5F, 3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 160)
						.addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition RightBottomTailSegment12 = RightBottomTailSegment11.addOrReplaceChild("RightBottomTailSegment12",
				CubeListBuilder.create().texOffs(128, 81).addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 147).addBox(-0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(115, 159)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 26).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(131, 3)
						.addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightBottomTailSegment13 = RightBottomTailSegment12.addOrReplaceChild("RightBottomTailSegment13", CubeListBuilder.create().texOffs(131, 69).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(134, 120).addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 100).addBox(-2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition RightBottomTailSegment14 = RightBottomTailSegment13.addOrReplaceChild("RightBottomTailSegment14", CubeListBuilder.create().texOffs(19, 131).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(148, 75).addBox(-1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 60).addBox(-0.5F, 0.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightBottomTailSegment15 = RightBottomTailSegment14.addOrReplaceChild("RightBottomTailSegment15",
				CubeListBuilder.create().texOffs(163, 64).addBox(-1.5F, -0.8333F, 2.9833F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(155, 109).addBox(-0.5F, -1.3333F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(160, 110)
						.addBox(-0.5F, -1.0833F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 103).addBox(-0.5F, -1.0833F, 0.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(147, 85)
						.addBox(-1.5F, -0.8333F, -1.0167F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(164, 157).addBox(-1.5F, -0.8333F, 1.9833F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 49)
						.addBox(-0.5F, 1.4167F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(81, 23).addBox(-0.5F, 1.4167F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(101, 9)
						.addBox(-0.5F, 1.4167F, -1.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.6667F, 3.0167F));
		PartDefinition RightBottomTailBlade = RightBottomTailSegment15.addOrReplaceChild("RightBottomTailBlade",
				CubeListBuilder.create().texOffs(138, 51).addBox(-0.5F, 0.75F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(170, 170).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 5)
						.addBox(-1.5F, -2.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 149).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(108, 108)
						.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(140, 101).addBox(-1.5F, -2.0F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 174)
						.addBox(-1.0F, -4.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(164, 161).addBox(-0.5F, 1.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 143)
						.addBox(-0.5F, 1.5F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -1.5F, 5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-1.5F, -2.0F, 5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(74, 61).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(96, 87)
						.addBox(-0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(110, 41).addBox(-2.0F, -1.5F, 11.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 36)
						.addBox(-1.5F, -2.0F, 11.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(124, 160).addBox(-0.5F, -1.0F, 11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(172, 49)
						.addBox(-0.5F, 1.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(160, 80).addBox(-1.5F, -0.5F, 14.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.6667F, 3.9833F));
		PartDefinition cube_r35 = RightBottomTailBlade.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(14, 165).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.5F, 16.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r36 = RightBottomTailBlade.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 150).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -0.9124F, 16.14F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r37 = RightBottomTailBlade.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(164, 26).addBox(0.0F, 1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.3874F, 16.39F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r38 = RightBottomTailBlade.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(172, 22).addBox(1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, 16.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r39 = RightBottomTailBlade.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(98, 49).addBox(-0.5F, -1.4863F, 0.3038F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.5934F, 0.0F, 0.0F));
		PartDefinition cube_r40 = RightBottomTailBlade.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(96, 94).addBox(-0.5F, -0.4339F, 0.4684F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r41 = RightBottomTailBlade.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(172, 30).addBox(-0.5F, -0.8163F, -2.8605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r42 = RightBottomTailBlade.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(134, 125).addBox(-1.0F, -0.8686F, -3.3457F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(88, 140).addBox(-0.5F, -1.3686F, -3.3457F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r43 = RightBottomTailBlade.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(106, 41).addBox(-0.5F, -0.8163F, -3.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r44 = RightBottomTailBlade.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(172, 3).addBox(-1.0F, -1.7851F, -4.0079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r45 = RightBottomTailBlade.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(68, 174).addBox(-1.0F, -0.75F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 165).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.4067F, 9.4597F, -0.1833F, 0.0F, 0.0F));
		PartDefinition cube_r46 = RightBottomTailBlade.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(134, 157).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(170, 56).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6965F, 12.0921F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r47 = RightBottomTailBlade.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(46, 42).addBox(-0.5F, -0.25F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 71).addBox(0.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -3.1709F, 8.0385F, -0.1789F, 0.0F, 0.0F));
		PartDefinition cube_r48 = RightBottomTailBlade.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(140, 80).addBox(-1.5F, -0.25F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(170, 52).addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -3.999F, 3.6067F, -0.1963F, 0.0F, 0.0F));
		PartDefinition cube_r49 = RightBottomTailBlade.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(98, 132).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(158, 95).addBox(-0.5F, 0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.6967F, 0.1715F, 0.5454F, 0.0F, 0.0F));
		PartDefinition cube_r50 = RightBottomTailBlade.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(78, 157).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.7717F, 0.1965F, -0.24F, 0.0F, 0.0F));
		PartDefinition cube_r51 = RightBottomTailBlade.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(22, 171).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.6413F, 1.7175F, -0.4581F, 0.0F, 0.0F));
		PartDefinition Tail4 = Tails.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offset(1.75F, 0.3087F, -1.8137F));
		PartDefinition LeftBottomTailSegment = Tail4.addOrReplaceChild("LeftBottomTailSegment", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftBottomTailSegment2 = LeftBottomTailSegment.addOrReplaceChild("LeftBottomTailSegment2",
				CubeListBuilder.create().texOffs(127, 100).mirror().addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 18).mirror()
						.addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 108).mirror().addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-1, 137).mirror()
						.addBox(-1.5F, -2.0F, 7.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 116).mirror().addBox(-2.5F, -1.5F, 7.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftBottomTailSegment3 = LeftBottomTailSegment2.addOrReplaceChild("LeftBottomTailSegment3",
				CubeListBuilder.create().texOffs(80, 95).mirror().addBox(-3.0F, -1.5F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 128).mirror().addBox(-2.0F, -4.0F, 1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(10, 140).mirror().addBox(-2.0F, -3.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 25).mirror().addBox(-4.0F, -1.5F, 4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(20, 9).mirror().addBox(-3.0F, -5.0F, 4.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 144).mirror().addBox(-0.5F, -5.0F, 3.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 39).mirror().addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 14).mirror().addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition LeftBottomTailSegment4 = LeftBottomTailSegment3.addOrReplaceChild("LeftBottomTailSegment4",
				CubeListBuilder.create().texOffs(84, 5).mirror().addBox(-4.0F, -1.5F, 1.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(31, 41).mirror().addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(72, 19).mirror().addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 45).mirror().addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(28, 145).mirror().addBox(-0.5F, -5.0F, 2.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 56).mirror().addBox(-3.5F, -1.5F, 4.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 85).mirror().addBox(-2.0F, -4.0F, 4.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftBottomTailSegment5 = LeftBottomTailSegment4.addOrReplaceChild("LeftBottomTailSegment5",
				CubeListBuilder.create().texOffs(120, 146).mirror().addBox(-1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(118, 4).mirror().addBox(-2.5F, -1.5F, 4.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(32, 159).mirror().addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 146).mirror().addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(96, 82).mirror().addBox(-3.0F, -1.5F, 2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(25, 155).mirror().addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(67, 128).mirror().addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(95, 35).mirror().addBox(-3.0F, -1.5F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition LeftBottomTailSegment6 = LeftBottomTailSegment5.addOrReplaceChild("LeftBottomTailSegment6",
				CubeListBuilder.create().texOffs(117, 20).mirror().addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(145, 123).mirror()
						.addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 45).mirror().addBox(-0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(118, 26).mirror()
						.addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 90).mirror().addBox(-1.0F, -3.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 167).mirror()
						.addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(164, 54).mirror().addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 0).mirror()
						.addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition LeftBottomTailSegment7 = LeftBottomTailSegment6.addOrReplaceChild("LeftBottomTailSegment7",
				CubeListBuilder.create().texOffs(31, 82).mirror().addBox(-2.5F, -1.5F, -1.0333F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(61, 129).mirror()
						.addBox(-1.0F, -3.0F, -1.0333F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(128, 146).mirror().addBox(-1.0F, -2.5F, 0.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 160)
						.mirror().addBox(-0.5F, -3.0F, 0.9667F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(146, 131).mirror().addBox(-1.0F, -2.5F, 2.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(118, 71).mirror().addBox(-2.5F, -1.5F, 2.9667F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0333F));
		PartDefinition LeftBottomTailSegment8 = LeftBottomTailSegment7.addOrReplaceChild("LeftBottomTailSegment8",
				CubeListBuilder.create().texOffs(139, 30).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(163, 116).mirror()
						.addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(147, 7).mirror().addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-1, 119).mirror()
						.addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 4.9667F));
		PartDefinition LeftBottomTailSegment9 = LeftBottomTailSegment8.addOrReplaceChild("LeftBottomTailSegment9",
				CubeListBuilder.create().texOffs(54, 120).mirror().addBox(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(112, 129).mirror()
						.addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 24).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 89).mirror()
						.addBox(-1.5F, -3.5F, 2.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition LeftBottomTailSegment10 = LeftBottomTailSegment9.addOrReplaceChild("LeftBottomTailSegment10",
				CubeListBuilder.create().texOffs(119, 54).mirror().addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(13, 118).mirror()
						.addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 148).mirror().addBox(-1.5F, -3.0F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 140).mirror()
						.addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftBottomTailSegment11 = LeftBottomTailSegment10.addOrReplaceChild("LeftBottomTailSegment11",
				CubeListBuilder.create().texOffs(-1, 71).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 16).mirror()
						.addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(95, 107).mirror().addBox(-1.5F, -2.5F, -1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(43, 148).mirror()
						.addBox(-0.5F, -2.75F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 95).mirror().addBox(-2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(164, 136).mirror()
						.addBox(-0.5F, -2.5F, 3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 160).mirror().addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition LeftBottomTailSegment12 = LeftBottomTailSegment11.addOrReplaceChild("LeftBottomTailSegment12",
				CubeListBuilder.create().texOffs(128, 81).mirror().addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(164, 147).mirror()
						.addBox(-0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(115, 159).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 26).mirror()
						.addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(131, 3).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftBottomTailSegment13 = LeftBottomTailSegment12.addOrReplaceChild("LeftBottomTailSegment13",
				CubeListBuilder.create().texOffs(131, 69).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(134, 120).mirror()
						.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 100).mirror().addBox(-2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition LeftBottomTailSegment14 = LeftBottomTailSegment13.addOrReplaceChild("LeftBottomTailSegment14",
				CubeListBuilder.create().texOffs(19, 131).mirror().addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(148, 75).mirror()
						.addBox(-1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 60).mirror().addBox(-0.5F, 0.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftBottomTailSegment15 = LeftBottomTailSegment14.addOrReplaceChild("LeftBottomTailSegment15",
				CubeListBuilder.create().texOffs(163, 64).mirror().addBox(-1.5F, -0.8333F, 2.9833F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(155, 109).mirror()
						.addBox(-0.5F, -1.3333F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(160, 110).mirror().addBox(-0.5F, -1.0833F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(152, 103).mirror().addBox(-0.5F, -1.0833F, 0.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(147, 85).mirror().addBox(-1.5F, -0.8333F, -1.0167F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(164, 157).mirror().addBox(-1.5F, -0.8333F, 1.9833F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(94, 49).mirror()
						.addBox(-0.5F, 1.4167F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(81, 23).mirror().addBox(-0.5F, 1.4167F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 9)
						.mirror().addBox(-0.5F, 1.4167F, -1.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -0.6667F, 3.0167F));
		PartDefinition LeftBottomTailBlade = LeftBottomTailSegment15.addOrReplaceChild("LeftBottomTailBlade",
				CubeListBuilder.create().texOffs(138, 51).mirror().addBox(-0.5F, 0.75F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(170, 170).mirror()
						.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 5).mirror().addBox(-1.5F, -2.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(94, 149).mirror()
						.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(108, 108).mirror().addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 101).mirror()
						.addBox(-1.5F, -2.0F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 174).mirror().addBox(-1.0F, -4.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(164, 161).mirror()
						.addBox(-0.5F, 1.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 143).mirror().addBox(-0.5F, 1.5F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
						.addBox(-2.0F, -1.5F, 5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 0).mirror().addBox(-1.5F, -2.0F, 5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 61).mirror()
						.addBox(-1.0F, -2.0F, 5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(96, 87).mirror().addBox(-0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 41).mirror()
						.addBox(-2.0F, -1.5F, 11.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 36).mirror().addBox(-1.5F, -2.0F, 11.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(124, 160).mirror()
						.addBox(-0.5F, -1.0F, 11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(172, 49).mirror().addBox(-0.5F, 1.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(160, 80).mirror()
						.addBox(-1.5F, -0.5F, 14.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.6667F, 3.9833F));
		PartDefinition cube_r52 = LeftBottomTailBlade.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(14, 165).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -0.5F, 16.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r53 = LeftBottomTailBlade.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-2.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, -0.9124F, 16.14F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r54 = LeftBottomTailBlade.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(164, 26).mirror().addBox(-2.0F, 1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -1.3874F, 16.39F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r55 = LeftBottomTailBlade.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(172, 22).mirror().addBox(-2.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 0.0F, 16.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r56 = LeftBottomTailBlade.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(98, 49).mirror().addBox(-0.5F, -1.4863F, 0.3038F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.5934F, 0.0F, 0.0F));
		PartDefinition cube_r57 = LeftBottomTailBlade.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(96, 94).mirror().addBox(-0.5F, -0.4339F, 0.4684F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r58 = LeftBottomTailBlade.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(172, 30).mirror().addBox(-0.5F, -0.8163F, -2.8605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r59 = LeftBottomTailBlade.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(134, 125).mirror().addBox(-1.0F, -0.8686F, -3.3457F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 140)
				.mirror().addBox(-0.5F, -1.3686F, -3.3457F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r60 = LeftBottomTailBlade.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(106, 41).mirror().addBox(-0.5F, -0.8163F, -3.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r61 = LeftBottomTailBlade.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(172, 3).mirror().addBox(-1.0F, -1.7851F, -4.0079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r62 = LeftBottomTailBlade.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(68, 174).mirror().addBox(-1.0F, -0.75F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 165).mirror()
				.addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4067F, 9.4597F, -0.1833F, 0.0F, 0.0F));
		PartDefinition cube_r63 = LeftBottomTailBlade.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(134, 157).mirror().addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(170, 56).mirror()
				.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6965F, 12.0921F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r64 = LeftBottomTailBlade.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(46, 42).mirror().addBox(-1.5F, -0.25F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 71).mirror()
				.addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -3.1709F, 8.0385F, -0.1789F, 0.0F, 0.0F));
		PartDefinition cube_r65 = LeftBottomTailBlade.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(140, 80).mirror().addBox(-0.5F, -0.25F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(170, 52).mirror()
				.addBox(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.999F, 3.6067F, -0.1963F, 0.0F, 0.0F));
		PartDefinition cube_r66 = LeftBottomTailBlade.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(98, 132).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(158, 95).mirror()
				.addBox(-0.5F, 0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.6967F, 0.1715F, 0.5454F, 0.0F, 0.0F));
		PartDefinition cube_r67 = LeftBottomTailBlade.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(78, 157).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.7717F, 0.1965F, -0.24F, 0.0F, 0.0F));
		PartDefinition cube_r68 = LeftBottomTailBlade.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(22, 171).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -2.6413F, 1.7175F, -0.4581F, 0.0F, 0.0F));
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
			this.animate(animationInterface.getVSArimaKakujaIdleAnimationState(), VSArimaKakujaAnimations.VSArimaKakujaIdle, pAgeInTicks);
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
