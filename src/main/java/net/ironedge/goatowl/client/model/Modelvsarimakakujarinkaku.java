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
public class Modelvsarimakakujarinkaku<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelvsarimakakujarinkaku"), "main");
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

	public Modelvsarimakakujarinkaku(ModelPart root) {
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
				CubeListBuilder.create().texOffs(52, 17).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 45)
						.addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 5).addBox(-1.5F, -2.0F, 7.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 25)
						.addBox(-2.5F, -1.5F, 7.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightTopTailSegment3 = RightTopTailSegment2.addOrReplaceChild("RightTopTailSegment3",
				CubeListBuilder.create().texOffs(0, 55).addBox(-3.0F, -1.5F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 67).addBox(-2.0F, -4.0F, 1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 35)
						.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 21).addBox(-4.0F, -1.5F, 4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-3.0F, -5.0F, 4.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 75).addBox(-0.5F, -5.0F, 3.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 20).addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition RightTopTailSegment4 = RightTopTailSegment3.addOrReplaceChild("RightTopTailSegment4",
				CubeListBuilder.create().texOffs(16, 47).addBox(-4.0F, -1.5F, 1.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 9).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 26).addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 75)
						.addBox(-0.5F, -5.0F, 2.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 0).addBox(-3.5F, -1.5F, 4.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 40)
						.addBox(-2.0F, -4.0F, 4.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightTopTailSegment5 = RightTopTailSegment4.addOrReplaceChild("RightTopTailSegment5",
				CubeListBuilder.create().texOffs(76, 77).addBox(-1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 12).addBox(-2.5F, -1.5F, 4.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 55)
						.addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 77).addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-3.0F, -1.5F, 2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 67).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 57)
						.addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 14).addBox(-3.0F, -1.5F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition RightTopTailSegment6 = RightTopTailSegment5.addOrReplaceChild("RightTopTailSegment6",
				CubeListBuilder.create().texOffs(0, 49).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 67).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 51)
						.addBox(-0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 71)
						.addBox(-1.0F, -3.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 79).addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 84)
						.addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 41).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition RightTopTailSegment7 = RightTopTailSegment6.addOrReplaceChild("RightTopTailSegment7",
				CubeListBuilder.create().texOffs(28, 26).addBox(-2.5F, -1.5F, -1.0333F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 50).addBox(-1.0F, -3.0F, -1.0333F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 5)
						.addBox(-1.0F, -2.5F, 0.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 83).addBox(-0.5F, -3.0F, 0.9667F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 79)
						.addBox(-1.0F, -2.5F, 2.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 66).addBox(-2.5F, -1.5F, 2.9667F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0333F));
		PartDefinition RightTopTailSegment8 = RightTopTailSegment7.addOrReplaceChild("RightTopTailSegment8",
				CubeListBuilder.create().texOffs(66, 17).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 79).addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 67)
						.addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 5).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 4.9667F));
		PartDefinition RightTopTailSegment9 = RightTopTailSegment8.addOrReplaceChild("RightTopTailSegment9",
				CubeListBuilder.create().texOffs(58, 66).addBox(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 71).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 11)
						.addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 50).addBox(-1.5F, -3.5F, 2.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition RightTopTailSegment10 = RightTopTailSegment9.addOrReplaceChild("RightTopTailSegment10",
				CubeListBuilder.create().texOffs(16, 51).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 51).addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 79)
						.addBox(-1.5F, -3.0F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 75).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightTopTailSegment11 = RightTopTailSegment10.addOrReplaceChild("RightTopTailSegment11",
				CubeListBuilder.create().texOffs(0, 42).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 42).addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 42)
						.addBox(-1.5F, -2.5F, -1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 71).addBox(-0.5F, -2.75F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(-2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 84).addBox(-0.5F, -2.5F, 3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 84)
						.addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition RightTopTailSegment12 = RightTopTailSegment11.addOrReplaceChild("RightTopTailSegment12",
				CubeListBuilder.create().texOffs(72, 45).addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 76).addBox(-0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 59)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 84).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 53)
						.addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightTopTailSegment13 = RightTopTailSegment12.addOrReplaceChild("RightTopTailSegment13", CubeListBuilder.create().texOffs(58, 60).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 66)
				.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 26).addBox(-2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition RightTopTailSegment14 = RightTopTailSegment13.addOrReplaceChild("RightTopTailSegment14", CubeListBuilder.create().texOffs(18, 37).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 71)
				.addBox(-1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 7).addBox(-0.5F, 0.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightTopTailSegment15 = RightTopTailSegment14.addOrReplaceChild("RightTopTailSegment15",
				CubeListBuilder.create().texOffs(56, 79).addBox(-1.5F, -0.8333F, 2.9833F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 55).addBox(-0.5F, -1.3333F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 31)
						.addBox(-0.5F, -1.0833F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 40).addBox(-0.5F, -1.0833F, 0.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 71)
						.addBox(-1.5F, -0.8333F, -1.0167F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(84, 66).addBox(-1.5F, -0.8333F, 1.9833F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 5)
						.addBox(-0.5F, 1.4167F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 86).addBox(-0.5F, 1.4167F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 45)
						.addBox(-0.5F, 1.4167F, -1.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.6667F, 3.0167F));
		PartDefinition RightTopTailBlade = RightTopTailSegment15.addOrReplaceChild("RightTopTailBlade",
				CubeListBuilder.create().texOffs(40, 86).addBox(-0.5F, 0.75F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 86).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(-1.5F, -2.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 12).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 61)
						.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(76, 22).addBox(-1.5F, -2.0F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(88, 58)
						.addBox(-1.0F, -4.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 82).addBox(-0.5F, 1.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 41)
						.addBox(-0.5F, 1.5F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -1.5F, 5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 7)
						.addBox(-1.5F, -2.0F, 5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 33).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 31)
						.addBox(-0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 24).addBox(-2.0F, -1.5F, 11.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(82, 63)
						.addBox(-1.5F, -2.0F, 11.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 35).addBox(-0.5F, -1.0F, 11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(88, 22)
						.addBox(-0.5F, 1.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 0).addBox(-1.5F, -0.5F, 14.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.6667F, 3.9833F));
		PartDefinition cube_r1 = RightTopTailBlade.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.5F, 16.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r2 = RightTopTailBlade.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 17).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -0.9124F, 16.14F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r3 = RightTopTailBlade.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(86, 8).addBox(0.0F, 1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.3874F, 16.39F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r4 = RightTopTailBlade.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(86, 31).addBox(1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, 16.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r5 = RightTopTailBlade.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 60).addBox(-0.5F, -1.4863F, 0.3038F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.5934F, 0.0F, 0.0F));
		PartDefinition cube_r6 = RightTopTailBlade.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 38).addBox(-0.5F, -0.4339F, 0.4684F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r7 = RightTopTailBlade.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(84, 86).addBox(-0.5F, -0.8163F, -2.8605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r8 = RightTopTailBlade.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(74, 30).addBox(-1.0F, -0.8686F, -3.3457F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 77).addBox(-0.5F, -1.3686F, -3.3457F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r9 = RightTopTailBlade.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 5).addBox(-0.5F, -0.8163F, -3.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r10 = RightTopTailBlade.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 86).addBox(-1.0F, -1.7851F, -4.0079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r11 = RightTopTailBlade.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(88, 70).addBox(-1.0F, -0.75F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 31).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.4067F, 9.4597F, -0.1833F, 0.0F, 0.0F));
		PartDefinition cube_r12 = RightTopTailBlade.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(82, 50).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 86).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6965F, 12.0921F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r13 = RightTopTailBlade.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(28, 33).addBox(-0.5F, -0.25F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 60).addBox(0.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -3.1709F, 8.0385F, -0.1789F, 0.0F, 0.0F));
		PartDefinition cube_r14 = RightTopTailBlade.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 75).addBox(-1.5F, -0.25F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 4).addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -3.999F, 3.6067F, -0.1963F, 0.0F, 0.0F));
		PartDefinition cube_r15 = RightTopTailBlade.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(28, 57).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 5).addBox(-0.5F, 0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.6967F, 0.1715F, 0.5454F, 0.0F, 0.0F));
		PartDefinition cube_r16 = RightTopTailBlade.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.7717F, 0.1965F, -0.24F, 0.0F, 0.0F));
		PartDefinition cube_r17 = RightTopTailBlade.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(86, 26).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.6413F, 1.7175F, -0.4581F, 0.0F, 0.0F));
		PartDefinition Tail2 = Tails.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offset(1.75F, 0.3087F, -1.8137F));
		PartDefinition LeftTopTailSegment = Tail2.addOrReplaceChild("LeftTopTailSegment", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftTopTailSegment2 = LeftTopTailSegment.addOrReplaceChild("LeftTopTailSegment2",
				CubeListBuilder.create().texOffs(52, 17).mirror().addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 0).mirror().addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(60, 45).mirror().addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 5).mirror().addBox(-1.5F, -2.0F, 7.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(46, 25).mirror().addBox(-2.5F, -1.5F, 7.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftTopTailSegment3 = LeftTopTailSegment2.addOrReplaceChild("LeftTopTailSegment3",
				CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-3.0F, -1.5F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 67).mirror().addBox(-2.0F, -4.0F, 1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(74, 35).mirror().addBox(-2.0F, -3.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 21).mirror().addBox(-4.0F, -1.5F, 4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 9).mirror().addBox(-3.0F, -5.0F, 4.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 75).mirror().addBox(-0.5F, -5.0F, 3.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 21).mirror().addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 20).mirror().addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition LeftTopTailSegment4 = LeftTopTailSegment3.addOrReplaceChild("LeftTopTailSegment4",
				CubeListBuilder.create().texOffs(16, 47).mirror().addBox(-4.0F, -1.5F, 1.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 9).mirror().addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 37).mirror().addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 26).mirror().addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(52, 75).mirror().addBox(-0.5F, -5.0F, 2.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 0).mirror().addBox(-3.5F, -1.5F, 4.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(48, 40).mirror().addBox(-2.0F, -4.0F, 4.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftTopTailSegment5 = LeftTopTailSegment4.addOrReplaceChild("LeftTopTailSegment5",
				CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 12).mirror().addBox(-2.5F, -1.5F, 4.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(82, 55).mirror().addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 77).mirror().addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(56, 0).mirror().addBox(-3.0F, -1.5F, 2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 67).mirror().addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(16, 57).mirror().addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 14).mirror().addBox(-3.0F, -1.5F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition LeftTopTailSegment6 = LeftTopTailSegment5.addOrReplaceChild("LeftTopTailSegment6",
				CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 67).mirror().addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(44, 51).mirror().addBox(-0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 32).mirror().addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(20, 71).mirror().addBox(-1.0F, -3.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 79).mirror().addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(56, 84).mirror().addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 41).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition LeftTopTailSegment7 = LeftTopTailSegment6.addOrReplaceChild("LeftTopTailSegment7",
				CubeListBuilder.create().texOffs(28, 26).mirror().addBox(-2.5F, -1.5F, -1.0333F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 50).mirror()
						.addBox(-1.0F, -3.0F, -1.0333F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 5).mirror().addBox(-1.0F, -2.5F, 0.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 83)
						.mirror().addBox(-0.5F, -3.0F, 0.9667F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 79).mirror().addBox(-1.0F, -2.5F, 2.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(14, 66).mirror().addBox(-2.5F, -1.5F, 2.9667F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0333F));
		PartDefinition LeftTopTailSegment8 = LeftTopTailSegment7.addOrReplaceChild("LeftTopTailSegment8",
				CubeListBuilder.create().texOffs(66, 17).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 79).mirror().addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(46, 67).mirror().addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 5).mirror().addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 4.9667F));
		PartDefinition LeftTopTailSegment9 = LeftTopTailSegment8.addOrReplaceChild("LeftTopTailSegment9",
				CubeListBuilder.create().texOffs(58, 66).mirror().addBox(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 71).mirror().addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(50, 11).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 50).mirror().addBox(-1.5F, -3.5F, 2.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition LeftTopTailSegment10 = LeftTopTailSegment9.addOrReplaceChild("LeftTopTailSegment10",
				CubeListBuilder.create().texOffs(16, 51).mirror().addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 51).mirror().addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(36, 79).mirror().addBox(-1.5F, -3.0F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 75).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftTopTailSegment11 = LeftTopTailSegment10.addOrReplaceChild("LeftTopTailSegment11",
				CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 42).mirror().addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(34, 42).mirror().addBox(-1.5F, -2.5F, -1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(56, 71).mirror().addBox(-0.5F, -2.75F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(72, 0).mirror().addBox(-2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 84).mirror().addBox(-0.5F, -2.5F, 3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(26, 84).mirror().addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition LeftTopTailSegment12 = LeftTopTailSegment11.addOrReplaceChild("LeftTopTailSegment12",
				CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 76).mirror().addBox(-0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(72, 59).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 84).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(60, 53).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftTopTailSegment13 = LeftTopTailSegment12.addOrReplaceChild(
				"LeftTopTailSegment13", CubeListBuilder.create().texOffs(58, 60).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 66).mirror()
						.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 26).mirror().addBox(-2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition LeftTopTailSegment14 = LeftTopTailSegment13.addOrReplaceChild(
				"LeftTopTailSegment14", CubeListBuilder.create().texOffs(18, 37).mirror().addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 71).mirror()
						.addBox(-1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 7).mirror().addBox(-0.5F, 0.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftTopTailSegment15 = LeftTopTailSegment14.addOrReplaceChild("LeftTopTailSegment15",
				CubeListBuilder.create().texOffs(56, 79).mirror().addBox(-1.5F, -0.8333F, 2.9833F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 55).mirror()
						.addBox(-0.5F, -1.3333F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 31).mirror().addBox(-0.5F, -1.0833F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 40)
						.mirror().addBox(-0.5F, -1.0833F, 0.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 71).mirror().addBox(-1.5F, -0.8333F, -1.0167F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(84, 66).mirror().addBox(-1.5F, -0.8333F, 1.9833F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 5).mirror().addBox(-0.5F, 1.4167F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(34, 86).mirror().addBox(-0.5F, 1.4167F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 45).mirror()
						.addBox(-0.5F, 1.4167F, -1.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -0.6667F, 3.0167F));
		PartDefinition LeftTopTailBlade = LeftTopTailSegment15.addOrReplaceChild("LeftTopTailBlade",
				CubeListBuilder.create().texOffs(40, 86).mirror().addBox(-0.5F, 0.75F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 86).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(20, 7).mirror().addBox(-1.5F, -2.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(80, 12).mirror().addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(28, 61).mirror().addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 22).mirror().addBox(-1.5F, -2.0F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(88, 58).mirror().addBox(-1.0F, -4.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 82).mirror().addBox(-0.5F, 1.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(86, 41).mirror().addBox(-0.5F, 1.5F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(-2.0F, -1.5F, 5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(32, 7).mirror().addBox(-1.5F, -2.0F, 5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 33).mirror().addBox(-1.0F, -2.0F, 5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(60, 31).mirror().addBox(-0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 24).mirror().addBox(-2.0F, -1.5F, 11.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(82, 63).mirror().addBox(-1.5F, -2.0F, 11.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 35).mirror().addBox(-0.5F, -1.0F, 11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(88, 22).mirror().addBox(-0.5F, 1.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 0).mirror().addBox(-1.5F, -0.5F, 14.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.6667F, 3.9833F));
		PartDefinition cube_r18 = LeftTopTailBlade.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -0.5F, 16.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r19 = LeftTopTailBlade.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(80, 17).mirror().addBox(-2.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, -0.9124F, 16.14F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r20 = LeftTopTailBlade.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(86, 8).mirror().addBox(-2.0F, 1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -1.3874F, 16.39F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r21 = LeftTopTailBlade.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(86, 31).mirror().addBox(-2.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 0.0F, 16.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r22 = LeftTopTailBlade.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 60).mirror().addBox(-0.5F, -1.4863F, 0.3038F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.5934F, 0.0F, 0.0F));
		PartDefinition cube_r23 = LeftTopTailBlade.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(60, 38).mirror().addBox(-0.5F, -0.4339F, 0.4684F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r24 = LeftTopTailBlade.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(84, 86).mirror().addBox(-0.5F, -0.8163F, -2.8605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r25 = LeftTopTailBlade.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-1.0F, -0.8686F, -3.3457F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 77).mirror()
				.addBox(-0.5F, -1.3686F, -3.3457F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r26 = LeftTopTailBlade.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(42, 5).mirror().addBox(-0.5F, -0.8163F, -3.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r27 = LeftTopTailBlade.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(46, 86).mirror().addBox(-1.0F, -1.7851F, -4.0079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r28 = LeftTopTailBlade.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(-1.0F, -0.75F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 31).mirror()
				.addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4067F, 9.4597F, -0.1833F, 0.0F, 0.0F));
		PartDefinition cube_r29 = LeftTopTailBlade.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(82, 50).mirror().addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 86).mirror()
				.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6965F, 12.0921F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r30 = LeftTopTailBlade.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(28, 33).mirror().addBox(-1.5F, -0.25F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 60).mirror()
				.addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -3.1709F, 8.0385F, -0.1789F, 0.0F, 0.0F));
		PartDefinition cube_r31 = LeftTopTailBlade.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.5F, -0.25F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 4).mirror()
				.addBox(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.999F, 3.6067F, -0.1963F, 0.0F, 0.0F));
		PartDefinition cube_r32 = LeftTopTailBlade.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(28, 57).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 5).mirror()
				.addBox(-0.5F, 0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.6967F, 0.1715F, 0.5454F, 0.0F, 0.0F));
		PartDefinition cube_r33 = LeftTopTailBlade.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.7717F, 0.1965F, -0.24F, 0.0F, 0.0F));
		PartDefinition cube_r34 = LeftTopTailBlade.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(86, 26).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -2.6413F, 1.7175F, -0.4581F, 0.0F, 0.0F));
		PartDefinition Tail3 = Tails.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offset(-1.75F, 0.3087F, -1.8137F));
		PartDefinition RightBottomTailSegment = Tail3.addOrReplaceChild("RightBottomTailSegment", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightBottomTailSegment2 = RightBottomTailSegment.addOrReplaceChild("RightBottomTailSegment2",
				CubeListBuilder.create().texOffs(52, 17).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 45)
						.addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 5).addBox(-1.5F, -2.0F, 7.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 25)
						.addBox(-2.5F, -1.5F, 7.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightBottomTailSegment3 = RightBottomTailSegment2.addOrReplaceChild("RightBottomTailSegment3",
				CubeListBuilder.create().texOffs(0, 55).addBox(-3.0F, -1.5F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 67).addBox(-2.0F, -4.0F, 1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 35)
						.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 21).addBox(-4.0F, -1.5F, 4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-3.0F, -5.0F, 4.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 75).addBox(-0.5F, -5.0F, 3.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 20).addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition RightBottomTailSegment4 = RightBottomTailSegment3.addOrReplaceChild("RightBottomTailSegment4",
				CubeListBuilder.create().texOffs(16, 47).addBox(-4.0F, -1.5F, 1.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 9).addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 26).addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 75)
						.addBox(-0.5F, -5.0F, 2.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 0).addBox(-3.5F, -1.5F, 4.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 40)
						.addBox(-2.0F, -4.0F, 4.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightBottomTailSegment5 = RightBottomTailSegment4.addOrReplaceChild("RightBottomTailSegment5",
				CubeListBuilder.create().texOffs(76, 77).addBox(-1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 12).addBox(-2.5F, -1.5F, 4.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 55)
						.addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 77).addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-3.0F, -1.5F, 2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 67).addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 57)
						.addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 14).addBox(-3.0F, -1.5F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition RightBottomTailSegment6 = RightBottomTailSegment5.addOrReplaceChild("RightBottomTailSegment6",
				CubeListBuilder.create().texOffs(0, 49).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 67).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 51)
						.addBox(-0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 71)
						.addBox(-1.0F, -3.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 79).addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 84)
						.addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 41).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition RightBottomTailSegment7 = RightBottomTailSegment6.addOrReplaceChild("RightBottomTailSegment7",
				CubeListBuilder.create().texOffs(28, 26).addBox(-2.5F, -1.5F, -1.0333F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(74, 50).addBox(-1.0F, -3.0F, -1.0333F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 5)
						.addBox(-1.0F, -2.5F, 0.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 83).addBox(-0.5F, -3.0F, 0.9667F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 79)
						.addBox(-1.0F, -2.5F, 2.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 66).addBox(-2.5F, -1.5F, 2.9667F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0333F));
		PartDefinition RightBottomTailSegment8 = RightBottomTailSegment7.addOrReplaceChild("RightBottomTailSegment8",
				CubeListBuilder.create().texOffs(66, 17).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 79).addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 67)
						.addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 5).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 4.9667F));
		PartDefinition RightBottomTailSegment9 = RightBottomTailSegment8.addOrReplaceChild("RightBottomTailSegment9",
				CubeListBuilder.create().texOffs(58, 66).addBox(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 71).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 11)
						.addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 50).addBox(-1.5F, -3.5F, 2.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition RightBottomTailSegment10 = RightBottomTailSegment9.addOrReplaceChild("RightBottomTailSegment10",
				CubeListBuilder.create().texOffs(16, 51).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 51).addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 79)
						.addBox(-1.5F, -3.0F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 75).addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightBottomTailSegment11 = RightBottomTailSegment10.addOrReplaceChild("RightBottomTailSegment11",
				CubeListBuilder.create().texOffs(0, 42).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 42).addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 42)
						.addBox(-1.5F, -2.5F, -1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 71).addBox(-0.5F, -2.75F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(-2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 84).addBox(-0.5F, -2.5F, 3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 84)
						.addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition RightBottomTailSegment12 = RightBottomTailSegment11.addOrReplaceChild("RightBottomTailSegment12",
				CubeListBuilder.create().texOffs(72, 45).addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 76).addBox(-0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 59)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 84).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 53)
						.addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightBottomTailSegment13 = RightBottomTailSegment12.addOrReplaceChild("RightBottomTailSegment13", CubeListBuilder.create().texOffs(58, 60).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 66)
				.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 26).addBox(-2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition RightBottomTailSegment14 = RightBottomTailSegment13.addOrReplaceChild("RightBottomTailSegment14", CubeListBuilder.create().texOffs(18, 37).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 71)
				.addBox(-1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 7).addBox(-0.5F, 0.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition RightBottomTailSegment15 = RightBottomTailSegment14.addOrReplaceChild("RightBottomTailSegment15",
				CubeListBuilder.create().texOffs(56, 79).addBox(-1.5F, -0.8333F, 2.9833F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 55).addBox(-0.5F, -1.3333F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 31)
						.addBox(-0.5F, -1.0833F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 40).addBox(-0.5F, -1.0833F, 0.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 71)
						.addBox(-1.5F, -0.8333F, -1.0167F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(84, 66).addBox(-1.5F, -0.8333F, 1.9833F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 5)
						.addBox(-0.5F, 1.4167F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 86).addBox(-0.5F, 1.4167F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 45)
						.addBox(-0.5F, 1.4167F, -1.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.6667F, 3.0167F));
		PartDefinition RightBottomTailBlade = RightBottomTailSegment15.addOrReplaceChild("RightBottomTailBlade",
				CubeListBuilder.create().texOffs(40, 86).addBox(-0.5F, 0.75F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 86).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
						.addBox(-1.5F, -2.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 12).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 61)
						.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(76, 22).addBox(-1.5F, -2.0F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(88, 58)
						.addBox(-1.0F, -4.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 82).addBox(-0.5F, 1.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 41)
						.addBox(-0.5F, 1.5F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -1.5F, 5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(32, 7)
						.addBox(-1.5F, -2.0F, 5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 33).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 31)
						.addBox(-0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 24).addBox(-2.0F, -1.5F, 11.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(82, 63)
						.addBox(-1.5F, -2.0F, 11.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 35).addBox(-0.5F, -1.0F, 11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(88, 22)
						.addBox(-0.5F, 1.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 0).addBox(-1.5F, -0.5F, 14.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.6667F, 3.9833F));
		PartDefinition cube_r35 = RightBottomTailBlade.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.5F, 16.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r36 = RightBottomTailBlade.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(80, 17).addBox(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -0.9124F, 16.14F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r37 = RightBottomTailBlade.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(86, 8).addBox(0.0F, 1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.3874F, 16.39F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r38 = RightBottomTailBlade.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(86, 31).addBox(1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.0F, 16.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r39 = RightBottomTailBlade.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(44, 60).addBox(-0.5F, -1.4863F, 0.3038F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.5934F, 0.0F, 0.0F));
		PartDefinition cube_r40 = RightBottomTailBlade.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(60, 38).addBox(-0.5F, -0.4339F, 0.4684F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r41 = RightBottomTailBlade.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(84, 86).addBox(-0.5F, -0.8163F, -2.8605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r42 = RightBottomTailBlade.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(74, 30).addBox(-1.0F, -0.8686F, -3.3457F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 77).addBox(-0.5F, -1.3686F, -3.3457F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r43 = RightBottomTailBlade.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(42, 5).addBox(-0.5F, -0.8163F, -3.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r44 = RightBottomTailBlade.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(46, 86).addBox(-1.0F, -1.7851F, -4.0079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r45 = RightBottomTailBlade.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(88, 70).addBox(-1.0F, -0.75F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 31).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.4067F, 9.4597F, -0.1833F, 0.0F, 0.0F));
		PartDefinition cube_r46 = RightBottomTailBlade.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(82, 50).addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 86).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6965F, 12.0921F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r47 = RightBottomTailBlade.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(28, 33).addBox(-0.5F, -0.25F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 60).addBox(0.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -3.1709F, 8.0385F, -0.1789F, 0.0F, 0.0F));
		PartDefinition cube_r48 = RightBottomTailBlade.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(0, 75).addBox(-1.5F, -0.25F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 4).addBox(-1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -3.999F, 3.6067F, -0.1963F, 0.0F, 0.0F));
		PartDefinition cube_r49 = RightBottomTailBlade.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(28, 57).addBox(-0.5F, -0.5F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 5).addBox(-0.5F, 0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.6967F, 0.1715F, 0.5454F, 0.0F, 0.0F));
		PartDefinition cube_r50 = RightBottomTailBlade.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.7717F, 0.1965F, -0.24F, 0.0F, 0.0F));
		PartDefinition cube_r51 = RightBottomTailBlade.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(86, 26).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.6413F, 1.7175F, -0.4581F, 0.0F, 0.0F));
		PartDefinition Tail4 = Tails.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offset(1.75F, 0.3087F, -1.8137F));
		PartDefinition LeftBottomTailSegment = Tail4.addOrReplaceChild("LeftBottomTailSegment", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftBottomTailSegment2 = LeftBottomTailSegment.addOrReplaceChild("LeftBottomTailSegment2",
				CubeListBuilder.create().texOffs(52, 17).mirror().addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(20, 0).mirror().addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(60, 45).mirror().addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 5).mirror().addBox(-1.5F, -2.0F, 7.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(46, 25).mirror().addBox(-2.5F, -1.5F, 7.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftBottomTailSegment3 = LeftBottomTailSegment2.addOrReplaceChild("LeftBottomTailSegment3",
				CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-3.0F, -1.5F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 67).mirror().addBox(-2.0F, -4.0F, 1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(74, 35).mirror().addBox(-2.0F, -3.0F, 0.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 21).mirror().addBox(-4.0F, -1.5F, 4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 9).mirror().addBox(-3.0F, -5.0F, 4.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 75).mirror().addBox(-0.5F, -5.0F, 3.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 21).mirror().addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 20).mirror().addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition LeftBottomTailSegment4 = LeftBottomTailSegment3.addOrReplaceChild("LeftBottomTailSegment4",
				CubeListBuilder.create().texOffs(16, 47).mirror().addBox(-4.0F, -1.5F, 1.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 9).mirror().addBox(-3.0F, -5.0F, 0.0F, 6.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 37).mirror().addBox(-3.5F, -1.5F, 2.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 26).mirror().addBox(-2.5F, -4.5F, 2.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(52, 75).mirror().addBox(-0.5F, -5.0F, 2.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 0).mirror().addBox(-3.5F, -1.5F, 4.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(48, 40).mirror().addBox(-2.0F, -4.0F, 4.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftBottomTailSegment5 = LeftBottomTailSegment4.addOrReplaceChild("LeftBottomTailSegment5",
				CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-1.0F, -2.5F, 4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 12).mirror().addBox(-2.5F, -1.5F, 4.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(82, 55).mirror().addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 77).mirror().addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(56, 0).mirror().addBox(-3.0F, -1.5F, 2.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 67).mirror().addBox(-0.5F, -3.5F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(16, 57).mirror().addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 14).mirror().addBox(-3.0F, -1.5F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition LeftBottomTailSegment6 = LeftBottomTailSegment5.addOrReplaceChild("LeftBottomTailSegment6",
				CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 67).mirror().addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(44, 51).mirror().addBox(-0.5F, -3.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 32).mirror().addBox(-2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(20, 71).mirror().addBox(-1.0F, -3.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 79).mirror().addBox(-0.5F, -3.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(56, 84).mirror().addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 41).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition LeftBottomTailSegment7 = LeftBottomTailSegment6.addOrReplaceChild("LeftBottomTailSegment7",
				CubeListBuilder.create().texOffs(28, 26).mirror().addBox(-2.5F, -1.5F, -1.0333F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(74, 50).mirror()
						.addBox(-1.0F, -3.0F, -1.0333F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 5).mirror().addBox(-1.0F, -2.5F, 0.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 83)
						.mirror().addBox(-0.5F, -3.0F, 0.9667F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 79).mirror().addBox(-1.0F, -2.5F, 2.9667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(14, 66).mirror().addBox(-2.5F, -1.5F, 2.9667F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0333F));
		PartDefinition LeftBottomTailSegment8 = LeftBottomTailSegment7.addOrReplaceChild("LeftBottomTailSegment8",
				CubeListBuilder.create().texOffs(66, 17).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 79).mirror().addBox(-1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(46, 67).mirror().addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 5).mirror().addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 4.9667F));
		PartDefinition LeftBottomTailSegment9 = LeftBottomTailSegment8.addOrReplaceChild("LeftBottomTailSegment9",
				CubeListBuilder.create().texOffs(58, 66).mirror().addBox(-2.5F, -1.5F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 71).mirror().addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(50, 11).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 50).mirror().addBox(-1.5F, -3.5F, 2.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition LeftBottomTailSegment10 = LeftBottomTailSegment9.addOrReplaceChild("LeftBottomTailSegment10",
				CubeListBuilder.create().texOffs(16, 51).mirror().addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 51).mirror().addBox(-1.5F, -3.5F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(36, 79).mirror().addBox(-1.5F, -3.0F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 75).mirror().addBox(-2.5F, -1.5F, 2.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftBottomTailSegment11 = LeftBottomTailSegment10.addOrReplaceChild("LeftBottomTailSegment11",
				CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 42).mirror().addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(34, 42).mirror().addBox(-1.5F, -2.5F, -1.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(56, 71).mirror().addBox(-0.5F, -2.75F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(72, 0).mirror().addBox(-2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 84).mirror().addBox(-0.5F, -2.5F, 3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(26, 84).mirror().addBox(-1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition LeftBottomTailSegment12 = LeftBottomTailSegment11.addOrReplaceChild("LeftBottomTailSegment12",
				CubeListBuilder.create().texOffs(72, 45).mirror().addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 76).mirror().addBox(-0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(72, 59).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 84).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(60, 53).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftBottomTailSegment13 = LeftBottomTailSegment12.addOrReplaceChild(
				"LeftBottomTailSegment13", CubeListBuilder.create().texOffs(58, 60).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(72, 66).mirror()
						.addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 26).mirror().addBox(-2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition LeftBottomTailSegment14 = LeftBottomTailSegment13.addOrReplaceChild(
				"LeftBottomTailSegment14", CubeListBuilder.create().texOffs(18, 37).mirror().addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 71).mirror()
						.addBox(-1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(28, 7).mirror().addBox(-0.5F, 0.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition LeftBottomTailSegment15 = LeftBottomTailSegment14.addOrReplaceChild("LeftBottomTailSegment15",
				CubeListBuilder.create().texOffs(56, 79).mirror().addBox(-1.5F, -0.8333F, 2.9833F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 55).mirror()
						.addBox(-0.5F, -1.3333F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 31).mirror().addBox(-0.5F, -1.0833F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 40)
						.mirror().addBox(-0.5F, -1.0833F, 0.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 71).mirror().addBox(-1.5F, -0.8333F, -1.0167F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(84, 66).mirror().addBox(-1.5F, -0.8333F, 1.9833F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(38, 5).mirror().addBox(-0.5F, 1.4167F, 1.9833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(34, 86).mirror().addBox(-0.5F, 1.4167F, 2.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 45).mirror()
						.addBox(-0.5F, 1.4167F, -1.0167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -0.6667F, 3.0167F));
		PartDefinition LeftBottomTailBlade = LeftBottomTailSegment15.addOrReplaceChild("LeftBottomTailBlade",
				CubeListBuilder.create().texOffs(40, 86).mirror().addBox(-0.5F, 0.75F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 86).mirror().addBox(-1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(20, 7).mirror().addBox(-1.5F, -2.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(80, 12).mirror().addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(28, 61).mirror().addBox(-2.0F, -1.5F, 2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(76, 22).mirror().addBox(-1.5F, -2.0F, 2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(88, 58).mirror().addBox(-1.0F, -4.0F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 82).mirror().addBox(-0.5F, 1.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(86, 41).mirror().addBox(-0.5F, 1.5F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(-2.0F, -1.5F, 5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(32, 7).mirror().addBox(-1.5F, -2.0F, 5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 33).mirror().addBox(-1.0F, -2.0F, 5.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(60, 31).mirror().addBox(-0.5F, 1.0F, 5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(62, 24).mirror().addBox(-2.0F, -1.5F, 11.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(82, 63).mirror().addBox(-1.5F, -2.0F, 11.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 35).mirror().addBox(-0.5F, -1.0F, 11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(88, 22).mirror().addBox(-0.5F, 1.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(84, 0).mirror().addBox(-1.5F, -0.5F, 14.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(0.0F, 0.6667F, 3.9833F));
		PartDefinition cube_r52 = LeftBottomTailBlade.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -0.5F, 16.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r53 = LeftBottomTailBlade.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(80, 17).mirror().addBox(-2.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, -0.9124F, 16.14F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r54 = LeftBottomTailBlade.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(86, 8).mirror().addBox(-2.0F, 1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -1.3874F, 16.39F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r55 = LeftBottomTailBlade.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(86, 31).mirror().addBox(-2.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 0.0F, 16.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r56 = LeftBottomTailBlade.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(44, 60).mirror().addBox(-0.5F, -1.4863F, 0.3038F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.5934F, 0.0F, 0.0F));
		PartDefinition cube_r57 = LeftBottomTailBlade.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(60, 38).mirror().addBox(-0.5F, -0.4339F, 0.4684F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r58 = LeftBottomTailBlade.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(84, 86).mirror().addBox(-0.5F, -0.8163F, -2.8605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r59 = LeftBottomTailBlade.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-1.0F, -0.8686F, -3.3457F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(66, 77)
				.mirror().addBox(-0.5F, -1.3686F, -3.3457F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r60 = LeftBottomTailBlade.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(42, 5).mirror().addBox(-0.5F, -0.8163F, -3.8605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r61 = LeftBottomTailBlade.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(46, 86).mirror().addBox(-1.0F, -1.7851F, -4.0079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 2.5431F, 21.4791F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r62 = LeftBottomTailBlade.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(-1.0F, -0.75F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 31).mirror()
				.addBox(-0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4067F, 9.4597F, -0.1833F, 0.0F, 0.0F));
		PartDefinition cube_r63 = LeftBottomTailBlade.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(82, 50).mirror().addBox(-1.0F, -0.75F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 86).mirror()
				.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.6965F, 12.0921F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r64 = LeftBottomTailBlade.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(28, 33).mirror().addBox(-1.5F, -0.25F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 60).mirror()
				.addBox(-1.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -3.1709F, 8.0385F, -0.1789F, 0.0F, 0.0F));
		PartDefinition cube_r65 = LeftBottomTailBlade.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.5F, -0.25F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 4).mirror()
				.addBox(0.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.999F, 3.6067F, -0.1963F, 0.0F, 0.0F));
		PartDefinition cube_r66 = LeftBottomTailBlade.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(28, 57).mirror().addBox(-0.5F, -0.5F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 5).mirror()
				.addBox(-0.5F, 0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.6967F, 0.1715F, 0.5454F, 0.0F, 0.0F));
		PartDefinition cube_r67 = LeftBottomTailBlade.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -4.7717F, 0.1965F, -0.24F, 0.0F, 0.0F));
		PartDefinition cube_r68 = LeftBottomTailBlade.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(86, 26).mirror().addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -2.6413F, 1.7175F, -0.4581F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		if (pEntity instanceof AnimationInterface animationInterface) {
			this.animate(animationInterface.VSArimaKakujaRinkakuIdleAnimationState(), VSArimaKakujaAnimations.VSArimaKakujaRinkakuIdle, pAgeInTicks);
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
