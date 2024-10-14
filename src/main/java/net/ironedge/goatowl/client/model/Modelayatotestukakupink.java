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
public class Modelayatotestukakupink<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelayatotestukakupink"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart LeftWing;
	public final ModelPart LeftPinkTop;
	public final ModelPart LeftPinkTop2;
	public final ModelPart LeftPinkTop3;
	public final ModelPart LeftPinkTop4;
	public final ModelPart LeftPinkTop5;
	public final ModelPart LeftPinkTop6;
	public final ModelPart LeftPinkTop7;
	public final ModelPart LeftPinkTop8;
	public final ModelPart LeftPinkTop9;
	public final ModelPart LeftPinkTop10;
	public final ModelPart LeftPinkTop11;
	public final ModelPart LeftPinkTop12;
	public final ModelPart LeftPinkTop13;
	public final ModelPart LeftPinkTop14;
	public final ModelPart LeftPinkTop15;
	public final ModelPart LeftPinkTop16;
	public final ModelPart LeftPinkTop17;
	public final ModelPart LeftPinkTop18;
	public final ModelPart LeftPinkTop19;
	public final ModelPart LeftPinkTop20;
	public final ModelPart LeftPinkTop21;
	public final ModelPart LeftPinkTop22;
	public final ModelPart LeftPinkTop23;
	public final ModelPart LeftPinkTop24;
	public final ModelPart LeftPinkTop25;
	public final ModelPart LeftPinkTop26;
	public final ModelPart LeftPinkTop27;
	public final ModelPart LeftPinkTop28;
	public final ModelPart LeftPinkTop29;
	public final ModelPart LeftPinkTop30;
	public final ModelPart LeftPinkTop31;
	public final ModelPart LeftPinkTop32;
	public final ModelPart LeftPinkTop33;
	public final ModelPart LeftPinkTop34;
	public final ModelPart LeftPinkTop35;
	public final ModelPart LeftPinkTop36;
	public final ModelPart LeftPinkTop37;
	public final ModelPart LeftWingPinkBottom;
	public final ModelPart LeftWingPinkBottom2;
	public final ModelPart LeftWingPinkBottom3;
	public final ModelPart LeftWingPinkBottom4;
	public final ModelPart LeftWingPinkBottom5;
	public final ModelPart LeftWingPinkBottom6;
	public final ModelPart LeftWingPinkBottom7;
	public final ModelPart LeftWingPinkBottom8;
	public final ModelPart LeftWingPinkBottom9;
	public final ModelPart LeftWingPinkBottom10;
	public final ModelPart LeftWingPinkBottom11;
	public final ModelPart LeftWingPinkBottom12;
	public final ModelPart LeftWingPinkBottom13;
	public final ModelPart LeftWingPinkBottom14;
	public final ModelPart LeftWingPinkBottom15;
	public final ModelPart LeftWingPinkBottom16;
	public final ModelPart LeftWingPinkBottom17;
	public final ModelPart LeftWingPinkBottom18;
	public final ModelPart LeftWingPinkBottom19;
	public final ModelPart LeftWingPinkBottom20;
	public final ModelPart LeftWingPinkBottom21;
	public final ModelPart LeftWingPinkBottom22;
	public final ModelPart LeftWingPinkBottom23;
	public final ModelPart LeftWingPinkBottom24;
	public final ModelPart LeftWingPinkBottom25;
	public final ModelPart LeftWingPinkBottom26;
	public final ModelPart LeftWingPinkBottom27;
	public final ModelPart LeftWingPinkBottom28;
	public final ModelPart LeftWingPinkBottom29;
	public final ModelPart LeftWingPinkBottom30;
	public final ModelPart LeftWingPinkBottom31;
	public final ModelPart LeftWingPinkBottom32;
	public final ModelPart LeftWingPinkBottom33;
	public final ModelPart LeftWingPinkBottom34;
	public final ModelPart LeftWingPinkBottom35;
	public final ModelPart LeftWingPinkBottom36;
	public final ModelPart LeftWingPinkBottom37;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelayatotestukakupink(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftWing = this.Body.getChild("LeftWing");
		this.LeftPinkTop = this.LeftWing.getChild("LeftPinkTop");
		this.LeftPinkTop2 = this.LeftPinkTop.getChild("LeftPinkTop2");
		this.LeftPinkTop3 = this.LeftPinkTop2.getChild("LeftPinkTop3");
		this.LeftPinkTop4 = this.LeftPinkTop3.getChild("LeftPinkTop4");
		this.LeftPinkTop5 = this.LeftPinkTop4.getChild("LeftPinkTop5");
		this.LeftPinkTop6 = this.LeftPinkTop5.getChild("LeftPinkTop6");
		this.LeftPinkTop7 = this.LeftPinkTop6.getChild("LeftPinkTop7");
		this.LeftPinkTop8 = this.LeftPinkTop7.getChild("LeftPinkTop8");
		this.LeftPinkTop9 = this.LeftPinkTop8.getChild("LeftPinkTop9");
		this.LeftPinkTop10 = this.LeftPinkTop9.getChild("LeftPinkTop10");
		this.LeftPinkTop11 = this.LeftPinkTop10.getChild("LeftPinkTop11");
		this.LeftPinkTop12 = this.LeftPinkTop11.getChild("LeftPinkTop12");
		this.LeftPinkTop13 = this.LeftPinkTop12.getChild("LeftPinkTop13");
		this.LeftPinkTop14 = this.LeftPinkTop13.getChild("LeftPinkTop14");
		this.LeftPinkTop15 = this.LeftPinkTop14.getChild("LeftPinkTop15");
		this.LeftPinkTop16 = this.LeftPinkTop15.getChild("LeftPinkTop16");
		this.LeftPinkTop17 = this.LeftPinkTop16.getChild("LeftPinkTop17");
		this.LeftPinkTop18 = this.LeftPinkTop17.getChild("LeftPinkTop18");
		this.LeftPinkTop19 = this.LeftPinkTop18.getChild("LeftPinkTop19");
		this.LeftPinkTop20 = this.LeftPinkTop19.getChild("LeftPinkTop20");
		this.LeftPinkTop21 = this.LeftPinkTop20.getChild("LeftPinkTop21");
		this.LeftPinkTop22 = this.LeftPinkTop21.getChild("LeftPinkTop22");
		this.LeftPinkTop23 = this.LeftPinkTop22.getChild("LeftPinkTop23");
		this.LeftPinkTop24 = this.LeftPinkTop23.getChild("LeftPinkTop24");
		this.LeftPinkTop25 = this.LeftPinkTop24.getChild("LeftPinkTop25");
		this.LeftPinkTop26 = this.LeftPinkTop25.getChild("LeftPinkTop26");
		this.LeftPinkTop27 = this.LeftPinkTop26.getChild("LeftPinkTop27");
		this.LeftPinkTop28 = this.LeftPinkTop27.getChild("LeftPinkTop28");
		this.LeftPinkTop29 = this.LeftPinkTop28.getChild("LeftPinkTop29");
		this.LeftPinkTop30 = this.LeftPinkTop29.getChild("LeftPinkTop30");
		this.LeftPinkTop31 = this.LeftPinkTop30.getChild("LeftPinkTop31");
		this.LeftPinkTop32 = this.LeftPinkTop31.getChild("LeftPinkTop32");
		this.LeftPinkTop33 = this.LeftPinkTop32.getChild("LeftPinkTop33");
		this.LeftPinkTop34 = this.LeftPinkTop33.getChild("LeftPinkTop34");
		this.LeftPinkTop35 = this.LeftPinkTop34.getChild("LeftPinkTop35");
		this.LeftPinkTop36 = this.LeftPinkTop35.getChild("LeftPinkTop36");
		this.LeftPinkTop37 = this.LeftPinkTop36.getChild("LeftPinkTop37");
		this.LeftWingPinkBottom = this.LeftWing.getChild("LeftWingPinkBottom");
		this.LeftWingPinkBottom2 = this.LeftWingPinkBottom.getChild("LeftWingPinkBottom2");
		this.LeftWingPinkBottom3 = this.LeftWingPinkBottom2.getChild("LeftWingPinkBottom3");
		this.LeftWingPinkBottom4 = this.LeftWingPinkBottom3.getChild("LeftWingPinkBottom4");
		this.LeftWingPinkBottom5 = this.LeftWingPinkBottom4.getChild("LeftWingPinkBottom5");
		this.LeftWingPinkBottom6 = this.LeftWingPinkBottom5.getChild("LeftWingPinkBottom6");
		this.LeftWingPinkBottom7 = this.LeftWingPinkBottom6.getChild("LeftWingPinkBottom7");
		this.LeftWingPinkBottom8 = this.LeftWingPinkBottom7.getChild("LeftWingPinkBottom8");
		this.LeftWingPinkBottom9 = this.LeftWingPinkBottom8.getChild("LeftWingPinkBottom9");
		this.LeftWingPinkBottom10 = this.LeftWingPinkBottom9.getChild("LeftWingPinkBottom10");
		this.LeftWingPinkBottom11 = this.LeftWingPinkBottom10.getChild("LeftWingPinkBottom11");
		this.LeftWingPinkBottom12 = this.LeftWingPinkBottom11.getChild("LeftWingPinkBottom12");
		this.LeftWingPinkBottom13 = this.LeftWingPinkBottom12.getChild("LeftWingPinkBottom13");
		this.LeftWingPinkBottom14 = this.LeftWingPinkBottom13.getChild("LeftWingPinkBottom14");
		this.LeftWingPinkBottom15 = this.LeftWingPinkBottom14.getChild("LeftWingPinkBottom15");
		this.LeftWingPinkBottom16 = this.LeftWingPinkBottom15.getChild("LeftWingPinkBottom16");
		this.LeftWingPinkBottom17 = this.LeftWingPinkBottom16.getChild("LeftWingPinkBottom17");
		this.LeftWingPinkBottom18 = this.LeftWingPinkBottom17.getChild("LeftWingPinkBottom18");
		this.LeftWingPinkBottom19 = this.LeftWingPinkBottom18.getChild("LeftWingPinkBottom19");
		this.LeftWingPinkBottom20 = this.LeftWingPinkBottom19.getChild("LeftWingPinkBottom20");
		this.LeftWingPinkBottom21 = this.LeftWingPinkBottom20.getChild("LeftWingPinkBottom21");
		this.LeftWingPinkBottom22 = this.LeftWingPinkBottom21.getChild("LeftWingPinkBottom22");
		this.LeftWingPinkBottom23 = this.LeftWingPinkBottom22.getChild("LeftWingPinkBottom23");
		this.LeftWingPinkBottom24 = this.LeftWingPinkBottom23.getChild("LeftWingPinkBottom24");
		this.LeftWingPinkBottom25 = this.LeftWingPinkBottom24.getChild("LeftWingPinkBottom25");
		this.LeftWingPinkBottom26 = this.LeftWingPinkBottom25.getChild("LeftWingPinkBottom26");
		this.LeftWingPinkBottom27 = this.LeftWingPinkBottom26.getChild("LeftWingPinkBottom27");
		this.LeftWingPinkBottom28 = this.LeftWingPinkBottom27.getChild("LeftWingPinkBottom28");
		this.LeftWingPinkBottom29 = this.LeftWingPinkBottom28.getChild("LeftWingPinkBottom29");
		this.LeftWingPinkBottom30 = this.LeftWingPinkBottom29.getChild("LeftWingPinkBottom30");
		this.LeftWingPinkBottom31 = this.LeftWingPinkBottom30.getChild("LeftWingPinkBottom31");
		this.LeftWingPinkBottom32 = this.LeftWingPinkBottom31.getChild("LeftWingPinkBottom32");
		this.LeftWingPinkBottom33 = this.LeftWingPinkBottom32.getChild("LeftWingPinkBottom33");
		this.LeftWingPinkBottom34 = this.LeftWingPinkBottom33.getChild("LeftWingPinkBottom34");
		this.LeftWingPinkBottom35 = this.LeftWingPinkBottom34.getChild("LeftWingPinkBottom35");
		this.LeftWingPinkBottom36 = this.LeftWingPinkBottom35.getChild("LeftWingPinkBottom36");
		this.LeftWingPinkBottom37 = this.LeftWingPinkBottom36.getChild("LeftWingPinkBottom37");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftWing = Body.addOrReplaceChild("LeftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 2.75F, 1.575F, -0.3423F, 0.9466F, -0.5712F));
		PartDefinition LeftPinkTop = LeftWing.addOrReplaceChild("LeftPinkTop", CubeListBuilder.create().texOffs(76, 0).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.024F, -3.85F, 1.35F));
		PartDefinition LeftPinkTop2 = LeftPinkTop.addOrReplaceChild("LeftPinkTop2", CubeListBuilder.create().texOffs(78, 0).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop3 = LeftPinkTop2.addOrReplaceChild("LeftPinkTop3", CubeListBuilder.create().texOffs(78, 20).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop4 = LeftPinkTop3.addOrReplaceChild("LeftPinkTop4", CubeListBuilder.create().texOffs(78, 40).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop5 = LeftPinkTop4.addOrReplaceChild("LeftPinkTop5", CubeListBuilder.create().texOffs(78, 60).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop6 = LeftPinkTop5.addOrReplaceChild("LeftPinkTop6", CubeListBuilder.create().texOffs(80, 0).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop7 = LeftPinkTop6.addOrReplaceChild("LeftPinkTop7", CubeListBuilder.create().texOffs(80, 20).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop8 = LeftPinkTop7.addOrReplaceChild("LeftPinkTop8", CubeListBuilder.create().texOffs(80, 40).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop9 = LeftPinkTop8.addOrReplaceChild("LeftPinkTop9", CubeListBuilder.create().texOffs(80, 60).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop10 = LeftPinkTop9.addOrReplaceChild("LeftPinkTop10", CubeListBuilder.create().texOffs(78, 80).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop11 = LeftPinkTop10.addOrReplaceChild("LeftPinkTop11", CubeListBuilder.create().texOffs(80, 80).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop12 = LeftPinkTop11.addOrReplaceChild("LeftPinkTop12", CubeListBuilder.create().texOffs(12, 81).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop13 = LeftPinkTop12.addOrReplaceChild("LeftPinkTop13", CubeListBuilder.create().texOffs(14, 81).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop14 = LeftPinkTop13.addOrReplaceChild("LeftPinkTop14", CubeListBuilder.create().texOffs(16, 81).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop15 = LeftPinkTop14.addOrReplaceChild("LeftPinkTop15", CubeListBuilder.create().texOffs(82, 0).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop16 = LeftPinkTop15.addOrReplaceChild("LeftPinkTop16", CubeListBuilder.create().texOffs(82, 20).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop17 = LeftPinkTop16.addOrReplaceChild("LeftPinkTop17", CubeListBuilder.create().texOffs(82, 40).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop18 = LeftPinkTop17.addOrReplaceChild("LeftPinkTop18", CubeListBuilder.create().texOffs(82, 60).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop19 = LeftPinkTop18.addOrReplaceChild("LeftPinkTop19", CubeListBuilder.create().texOffs(82, 80).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop20 = LeftPinkTop19.addOrReplaceChild("LeftPinkTop20", CubeListBuilder.create().texOffs(84, 0).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop21 = LeftPinkTop20.addOrReplaceChild("LeftPinkTop21", CubeListBuilder.create().texOffs(84, 20).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop22 = LeftPinkTop21.addOrReplaceChild("LeftPinkTop22", CubeListBuilder.create().texOffs(84, 40).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop23 = LeftPinkTop22.addOrReplaceChild("LeftPinkTop23", CubeListBuilder.create().texOffs(84, 60).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop24 = LeftPinkTop23.addOrReplaceChild("LeftPinkTop24", CubeListBuilder.create().texOffs(86, 0).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop25 = LeftPinkTop24.addOrReplaceChild("LeftPinkTop25", CubeListBuilder.create().texOffs(84, 80).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop26 = LeftPinkTop25.addOrReplaceChild("LeftPinkTop26", CubeListBuilder.create().texOffs(86, 20).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop27 = LeftPinkTop26.addOrReplaceChild("LeftPinkTop27", CubeListBuilder.create().texOffs(86, 40).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop28 = LeftPinkTop27.addOrReplaceChild("LeftPinkTop28", CubeListBuilder.create().texOffs(86, 60).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop29 = LeftPinkTop28.addOrReplaceChild("LeftPinkTop29", CubeListBuilder.create().texOffs(86, 80).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop30 = LeftPinkTop29.addOrReplaceChild("LeftPinkTop30", CubeListBuilder.create().texOffs(88, 0).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop31 = LeftPinkTop30.addOrReplaceChild("LeftPinkTop31", CubeListBuilder.create().texOffs(88, 20).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop32 = LeftPinkTop31.addOrReplaceChild("LeftPinkTop32", CubeListBuilder.create().texOffs(88, 40).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop33 = LeftPinkTop32.addOrReplaceChild("LeftPinkTop33", CubeListBuilder.create().texOffs(88, 60).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop34 = LeftPinkTop33.addOrReplaceChild("LeftPinkTop34", CubeListBuilder.create().texOffs(88, 80).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop35 = LeftPinkTop34.addOrReplaceChild("LeftPinkTop35", CubeListBuilder.create().texOffs(0, 89).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop36 = LeftPinkTop35.addOrReplaceChild("LeftPinkTop36", CubeListBuilder.create().texOffs(2, 89).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftPinkTop37 = LeftPinkTop36.addOrReplaceChild("LeftPinkTop37", CubeListBuilder.create().texOffs(4, 89).addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom = LeftWing.addOrReplaceChild("LeftWingPinkBottom", CubeListBuilder.create().texOffs(6, 89).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.024F, -3.85F, 1.35F));
		PartDefinition LeftWingPinkBottom2 = LeftWingPinkBottom.addOrReplaceChild("LeftWingPinkBottom2", CubeListBuilder.create().texOffs(8, 89).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom3 = LeftWingPinkBottom2.addOrReplaceChild("LeftWingPinkBottom3", CubeListBuilder.create().texOffs(10, 89).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom4 = LeftWingPinkBottom3.addOrReplaceChild("LeftWingPinkBottom4", CubeListBuilder.create().texOffs(90, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom5 = LeftWingPinkBottom4.addOrReplaceChild("LeftWingPinkBottom5", CubeListBuilder.create().texOffs(18, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom6 = LeftWingPinkBottom5.addOrReplaceChild("LeftWingPinkBottom6", CubeListBuilder.create().texOffs(20, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom7 = LeftWingPinkBottom6.addOrReplaceChild("LeftWingPinkBottom7", CubeListBuilder.create().texOffs(90, 20).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom8 = LeftWingPinkBottom7.addOrReplaceChild("LeftWingPinkBottom8", CubeListBuilder.create().texOffs(22, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom9 = LeftWingPinkBottom8.addOrReplaceChild("LeftWingPinkBottom9", CubeListBuilder.create().texOffs(24, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom10 = LeftWingPinkBottom9.addOrReplaceChild("LeftWingPinkBottom10", CubeListBuilder.create().texOffs(26, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom11 = LeftWingPinkBottom10.addOrReplaceChild("LeftWingPinkBottom11", CubeListBuilder.create().texOffs(28, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom12 = LeftWingPinkBottom11.addOrReplaceChild("LeftWingPinkBottom12", CubeListBuilder.create().texOffs(30, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom13 = LeftWingPinkBottom12.addOrReplaceChild("LeftWingPinkBottom13", CubeListBuilder.create().texOffs(32, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom14 = LeftWingPinkBottom13.addOrReplaceChild("LeftWingPinkBottom14", CubeListBuilder.create().texOffs(34, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom15 = LeftWingPinkBottom14.addOrReplaceChild("LeftWingPinkBottom15", CubeListBuilder.create().texOffs(36, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom16 = LeftWingPinkBottom15.addOrReplaceChild("LeftWingPinkBottom16", CubeListBuilder.create().texOffs(38, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom17 = LeftWingPinkBottom16.addOrReplaceChild("LeftWingPinkBottom17", CubeListBuilder.create().texOffs(40, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom18 = LeftWingPinkBottom17.addOrReplaceChild("LeftWingPinkBottom18", CubeListBuilder.create().texOffs(90, 40).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom19 = LeftWingPinkBottom18.addOrReplaceChild("LeftWingPinkBottom19", CubeListBuilder.create().texOffs(42, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom20 = LeftWingPinkBottom19.addOrReplaceChild("LeftWingPinkBottom20", CubeListBuilder.create().texOffs(44, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom21 = LeftWingPinkBottom20.addOrReplaceChild("LeftWingPinkBottom21", CubeListBuilder.create().texOffs(46, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom22 = LeftWingPinkBottom21.addOrReplaceChild("LeftWingPinkBottom22", CubeListBuilder.create().texOffs(48, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom23 = LeftWingPinkBottom22.addOrReplaceChild("LeftWingPinkBottom23", CubeListBuilder.create().texOffs(50, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom24 = LeftWingPinkBottom23.addOrReplaceChild("LeftWingPinkBottom24", CubeListBuilder.create().texOffs(52, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom25 = LeftWingPinkBottom24.addOrReplaceChild("LeftWingPinkBottom25", CubeListBuilder.create().texOffs(54, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom26 = LeftWingPinkBottom25.addOrReplaceChild("LeftWingPinkBottom26", CubeListBuilder.create().texOffs(56, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom27 = LeftWingPinkBottom26.addOrReplaceChild("LeftWingPinkBottom27", CubeListBuilder.create().texOffs(58, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom28 = LeftWingPinkBottom27.addOrReplaceChild("LeftWingPinkBottom28", CubeListBuilder.create().texOffs(60, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom29 = LeftWingPinkBottom28.addOrReplaceChild("LeftWingPinkBottom29", CubeListBuilder.create().texOffs(90, 60).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom30 = LeftWingPinkBottom29.addOrReplaceChild("LeftWingPinkBottom30", CubeListBuilder.create().texOffs(62, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom31 = LeftWingPinkBottom30.addOrReplaceChild("LeftWingPinkBottom31", CubeListBuilder.create().texOffs(64, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom32 = LeftWingPinkBottom31.addOrReplaceChild("LeftWingPinkBottom32", CubeListBuilder.create().texOffs(66, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom33 = LeftWingPinkBottom32.addOrReplaceChild("LeftWingPinkBottom33", CubeListBuilder.create().texOffs(68, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom34 = LeftWingPinkBottom33.addOrReplaceChild("LeftWingPinkBottom34", CubeListBuilder.create().texOffs(70, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom35 = LeftWingPinkBottom34.addOrReplaceChild("LeftWingPinkBottom35", CubeListBuilder.create().texOffs(72, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom36 = LeftWingPinkBottom35.addOrReplaceChild("LeftWingPinkBottom36", CubeListBuilder.create().texOffs(74, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftWingPinkBottom37 = LeftWingPinkBottom36.addOrReplaceChild("LeftWingPinkBottom37", CubeListBuilder.create().texOffs(76, 90).addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
