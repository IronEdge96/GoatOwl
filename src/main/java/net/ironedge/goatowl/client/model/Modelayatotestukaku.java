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
public class Modelayatotestukaku<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelayatotestukaku"), "main");
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
	public final ModelPart LeftWingTop;
	public final ModelPart LeftWingTop2;
	public final ModelPart LeftWingTop3;
	public final ModelPart LeftWingTop4;
	public final ModelPart LeftWingTop5;
	public final ModelPart LeftWingTop6;
	public final ModelPart LeftWingTop7;
	public final ModelPart LeftWingTop8;
	public final ModelPart LeftWingTop9;
	public final ModelPart LeftWingTop10;
	public final ModelPart LeftWingTop11;
	public final ModelPart LeftWingTop12;
	public final ModelPart LeftWingTop13;
	public final ModelPart LeftWingTop14;
	public final ModelPart LeftWingTop15;
	public final ModelPart LeftWingTop16;
	public final ModelPart LeftWingTop17;
	public final ModelPart LeftWingTop18;
	public final ModelPart LeftWingTop19;
	public final ModelPart LeftWingTop20;
	public final ModelPart LeftWingTop21;
	public final ModelPart LeftWingTop22;
	public final ModelPart LeftWingTop23;
	public final ModelPart LeftWingTop24;
	public final ModelPart LeftWingTop25;
	public final ModelPart LeftWingTop26;
	public final ModelPart LeftWingTop27;
	public final ModelPart LeftWingTop28;
	public final ModelPart LeftWingTop29;
	public final ModelPart LeftWingTop30;
	public final ModelPart LeftWingBottom;
	public final ModelPart LeftWingBottom2;
	public final ModelPart LeftWingBottom3;
	public final ModelPart LeftWingBottom4;
	public final ModelPart LeftWingBottom5;
	public final ModelPart LeftWingBottom6;
	public final ModelPart LeftWingBottom7;
	public final ModelPart LeftWingBottom8;
	public final ModelPart LeftWingBottom9;
	public final ModelPart LeftWingBottom10;
	public final ModelPart LeftWingBottom11;
	public final ModelPart LeftWingBottom12;
	public final ModelPart LeftWingBottom13;
	public final ModelPart LeftWingBottom14;
	public final ModelPart LeftWingBottom15;
	public final ModelPart LeftWingBottom16;
	public final ModelPart LeftWingBottom17;
	public final ModelPart LeftWingBottom18;
	public final ModelPart LeftWingBottom19;
	public final ModelPart LeftWingBottom20;
	public final ModelPart LeftWingBottom21;
	public final ModelPart LeftWingBottom22;
	public final ModelPart LeftWingBottom23;
	public final ModelPart LeftWingBottom24;
	public final ModelPart LeftWingBottom25;
	public final ModelPart LeftWingBottom26;
	public final ModelPart LeftWingBottom27;
	public final ModelPart LeftWingBottom28;
	public final ModelPart LeftWingBottom29;
	public final ModelPart LeftWingBottom30;
	public final ModelPart LeftWingCore;
	public final ModelPart LeftCoreTop;
	public final ModelPart LeftCoreTopFar;
	public final ModelPart LeftCoreMiddle;
	public final ModelPart LeftCoreMiddleFar;
	public final ModelPart LeftCoreBottom;
	public final ModelPart LeftCoreFront;
	public final ModelPart RightWing;
	public final ModelPart RightPinkTop;
	public final ModelPart RightPinkTop2;
	public final ModelPart RightPinkTop3;
	public final ModelPart RightPinkTop4;
	public final ModelPart RightPinkTop5;
	public final ModelPart RightPinkTop6;
	public final ModelPart RightPinkTop7;
	public final ModelPart RightPinkTop8;
	public final ModelPart RightPinkTop9;
	public final ModelPart RightPinkTop10;
	public final ModelPart RightPinkTop11;
	public final ModelPart RightPinkTop12;
	public final ModelPart RightPinkTop13;
	public final ModelPart RightPinkTop14;
	public final ModelPart RightPinkTop15;
	public final ModelPart RightPinkTop16;
	public final ModelPart RightPinkTop17;
	public final ModelPart RightPinkTop18;
	public final ModelPart RightPinkTop19;
	public final ModelPart RightPinkTop20;
	public final ModelPart RightPinkTop21;
	public final ModelPart RightPinkTop22;
	public final ModelPart RightPinkTop23;
	public final ModelPart RightPinkTop24;
	public final ModelPart RightPinkTop25;
	public final ModelPart RightPinkTop26;
	public final ModelPart RightPinkTop27;
	public final ModelPart RightPinkTop28;
	public final ModelPart RightPinkTop29;
	public final ModelPart RightPinkTop30;
	public final ModelPart RightPinkTop31;
	public final ModelPart RightPinkTop32;
	public final ModelPart RightPinkTop33;
	public final ModelPart RightPinkTop34;
	public final ModelPart RightPinkTop35;
	public final ModelPart RightPinkTop36;
	public final ModelPart RightPinkTop37;
	public final ModelPart RightWingPinkBottom;
	public final ModelPart RightWingPinkBottom2;
	public final ModelPart RightWingPinkBottom3;
	public final ModelPart RightWingPinkBottom4;
	public final ModelPart RightWingPinkBottom5;
	public final ModelPart RightWingPinkBottom6;
	public final ModelPart RightWingPinkBottom7;
	public final ModelPart RightWingPinkBottom8;
	public final ModelPart RightWingPinkBottom9;
	public final ModelPart RightWingPinkBottom10;
	public final ModelPart RightWingPinkBottom11;
	public final ModelPart RightWingPinkBottom12;
	public final ModelPart RightWingPinkBottom13;
	public final ModelPart RightWingPinkBottom14;
	public final ModelPart RightWingPinkBottom15;
	public final ModelPart RightWingPinkBottom16;
	public final ModelPart RightWingPinkBottom17;
	public final ModelPart RightWingPinkBottom18;
	public final ModelPart RightWingPinkBottom19;
	public final ModelPart RightWingPinkBottom20;
	public final ModelPart RightWingPinkBottom21;
	public final ModelPart RightWingPinkBottom22;
	public final ModelPart RightWingPinkBottom23;
	public final ModelPart RightWingPinkBottom24;
	public final ModelPart RightWingPinkBottom25;
	public final ModelPart RightWingPinkBottom26;
	public final ModelPart RightWingPinkBottom27;
	public final ModelPart RightWingPinkBottom28;
	public final ModelPart RightWingPinkBottom29;
	public final ModelPart RightWingPinkBottom30;
	public final ModelPart RightWingPinkBottom31;
	public final ModelPart RightWingPinkBottom32;
	public final ModelPart RightWingPinkBottom33;
	public final ModelPart RightWingPinkBottom34;
	public final ModelPart RightWingPinkBottom35;
	public final ModelPart RightWingPinkBottom36;
	public final ModelPart RightWingPinkBottom37;
	public final ModelPart RightWingTop;
	public final ModelPart RightWingTop2;
	public final ModelPart RightWingTop3;
	public final ModelPart RightWingTop4;
	public final ModelPart RightWingTop5;
	public final ModelPart RightWingTop6;
	public final ModelPart RightWingTop7;
	public final ModelPart RightWingTop8;
	public final ModelPart RightWingTop9;
	public final ModelPart RightWingTop10;
	public final ModelPart RightWingTop11;
	public final ModelPart RightWingTop12;
	public final ModelPart RightWingTop13;
	public final ModelPart RightWingTop14;
	public final ModelPart RightWingTop15;
	public final ModelPart RightWingTop16;
	public final ModelPart RightWingTop17;
	public final ModelPart RightWingTop18;
	public final ModelPart RightWingTop19;
	public final ModelPart RightWingTop20;
	public final ModelPart RightWingTop21;
	public final ModelPart RightWingTop22;
	public final ModelPart RightWingTop23;
	public final ModelPart RightWingTop24;
	public final ModelPart RightWingTop25;
	public final ModelPart RightWingTop26;
	public final ModelPart RightWingTop27;
	public final ModelPart RightWingTop28;
	public final ModelPart RightWingTop29;
	public final ModelPart RightWingTop30;
	public final ModelPart RightWingBottom;
	public final ModelPart RightWingBottom2;
	public final ModelPart RightWingBottom3;
	public final ModelPart RightWingBottom4;
	public final ModelPart RightWingBottom5;
	public final ModelPart RightWingBottom6;
	public final ModelPart RightWingBottom7;
	public final ModelPart RightWingBottom8;
	public final ModelPart RightWingBottom9;
	public final ModelPart RightWingBottom10;
	public final ModelPart RightWingBottom11;
	public final ModelPart RightWingBottom12;
	public final ModelPart RightWingBottom13;
	public final ModelPart RightWingBottom14;
	public final ModelPart RightWingBottom15;
	public final ModelPart RightWingBottom16;
	public final ModelPart RightWingBottom17;
	public final ModelPart RightWingBottom18;
	public final ModelPart RightWingBottom19;
	public final ModelPart RightWingBottom20;
	public final ModelPart RightWingBottom21;
	public final ModelPart RightWingBottom22;
	public final ModelPart RightWingBottom23;
	public final ModelPart RightWingBottom24;
	public final ModelPart RightWingBottom25;
	public final ModelPart RightWingBottom26;
	public final ModelPart RightWingBottom27;
	public final ModelPart RightWingBottom28;
	public final ModelPart RightWingBottom29;
	public final ModelPart RightWingBottom30;
	public final ModelPart RightWingCore;
	public final ModelPart RightCoreTop;
	public final ModelPart RightCoreTopFar;
	public final ModelPart RightCoreMiddle;
	public final ModelPart RightCoreMiddleFar;
	public final ModelPart RightCoreBottom;
	public final ModelPart RightCoreFront;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelayatotestukaku(ModelPart root) {
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
		this.LeftWingTop = this.LeftWing.getChild("LeftWingTop");
		this.LeftWingTop2 = this.LeftWingTop.getChild("LeftWingTop2");
		this.LeftWingTop3 = this.LeftWingTop2.getChild("LeftWingTop3");
		this.LeftWingTop4 = this.LeftWingTop3.getChild("LeftWingTop4");
		this.LeftWingTop5 = this.LeftWingTop4.getChild("LeftWingTop5");
		this.LeftWingTop6 = this.LeftWingTop5.getChild("LeftWingTop6");
		this.LeftWingTop7 = this.LeftWingTop6.getChild("LeftWingTop7");
		this.LeftWingTop8 = this.LeftWingTop7.getChild("LeftWingTop8");
		this.LeftWingTop9 = this.LeftWingTop8.getChild("LeftWingTop9");
		this.LeftWingTop10 = this.LeftWingTop9.getChild("LeftWingTop10");
		this.LeftWingTop11 = this.LeftWingTop10.getChild("LeftWingTop11");
		this.LeftWingTop12 = this.LeftWingTop11.getChild("LeftWingTop12");
		this.LeftWingTop13 = this.LeftWingTop12.getChild("LeftWingTop13");
		this.LeftWingTop14 = this.LeftWingTop13.getChild("LeftWingTop14");
		this.LeftWingTop15 = this.LeftWingTop14.getChild("LeftWingTop15");
		this.LeftWingTop16 = this.LeftWingTop15.getChild("LeftWingTop16");
		this.LeftWingTop17 = this.LeftWingTop16.getChild("LeftWingTop17");
		this.LeftWingTop18 = this.LeftWingTop17.getChild("LeftWingTop18");
		this.LeftWingTop19 = this.LeftWingTop18.getChild("LeftWingTop19");
		this.LeftWingTop20 = this.LeftWingTop19.getChild("LeftWingTop20");
		this.LeftWingTop21 = this.LeftWingTop20.getChild("LeftWingTop21");
		this.LeftWingTop22 = this.LeftWingTop21.getChild("LeftWingTop22");
		this.LeftWingTop23 = this.LeftWingTop22.getChild("LeftWingTop23");
		this.LeftWingTop24 = this.LeftWingTop23.getChild("LeftWingTop24");
		this.LeftWingTop25 = this.LeftWingTop24.getChild("LeftWingTop25");
		this.LeftWingTop26 = this.LeftWingTop25.getChild("LeftWingTop26");
		this.LeftWingTop27 = this.LeftWingTop26.getChild("LeftWingTop27");
		this.LeftWingTop28 = this.LeftWingTop27.getChild("LeftWingTop28");
		this.LeftWingTop29 = this.LeftWingTop28.getChild("LeftWingTop29");
		this.LeftWingTop30 = this.LeftWingTop29.getChild("LeftWingTop30");
		this.LeftWingBottom = this.LeftWing.getChild("LeftWingBottom");
		this.LeftWingBottom2 = this.LeftWingBottom.getChild("LeftWingBottom2");
		this.LeftWingBottom3 = this.LeftWingBottom2.getChild("LeftWingBottom3");
		this.LeftWingBottom4 = this.LeftWingBottom3.getChild("LeftWingBottom4");
		this.LeftWingBottom5 = this.LeftWingBottom4.getChild("LeftWingBottom5");
		this.LeftWingBottom6 = this.LeftWingBottom5.getChild("LeftWingBottom6");
		this.LeftWingBottom7 = this.LeftWingBottom6.getChild("LeftWingBottom7");
		this.LeftWingBottom8 = this.LeftWingBottom7.getChild("LeftWingBottom8");
		this.LeftWingBottom9 = this.LeftWingBottom8.getChild("LeftWingBottom9");
		this.LeftWingBottom10 = this.LeftWingBottom9.getChild("LeftWingBottom10");
		this.LeftWingBottom11 = this.LeftWingBottom10.getChild("LeftWingBottom11");
		this.LeftWingBottom12 = this.LeftWingBottom11.getChild("LeftWingBottom12");
		this.LeftWingBottom13 = this.LeftWingBottom12.getChild("LeftWingBottom13");
		this.LeftWingBottom14 = this.LeftWingBottom13.getChild("LeftWingBottom14");
		this.LeftWingBottom15 = this.LeftWingBottom14.getChild("LeftWingBottom15");
		this.LeftWingBottom16 = this.LeftWingBottom15.getChild("LeftWingBottom16");
		this.LeftWingBottom17 = this.LeftWingBottom16.getChild("LeftWingBottom17");
		this.LeftWingBottom18 = this.LeftWingBottom17.getChild("LeftWingBottom18");
		this.LeftWingBottom19 = this.LeftWingBottom18.getChild("LeftWingBottom19");
		this.LeftWingBottom20 = this.LeftWingBottom19.getChild("LeftWingBottom20");
		this.LeftWingBottom21 = this.LeftWingBottom20.getChild("LeftWingBottom21");
		this.LeftWingBottom22 = this.LeftWingBottom21.getChild("LeftWingBottom22");
		this.LeftWingBottom23 = this.LeftWingBottom22.getChild("LeftWingBottom23");
		this.LeftWingBottom24 = this.LeftWingBottom23.getChild("LeftWingBottom24");
		this.LeftWingBottom25 = this.LeftWingBottom24.getChild("LeftWingBottom25");
		this.LeftWingBottom26 = this.LeftWingBottom25.getChild("LeftWingBottom26");
		this.LeftWingBottom27 = this.LeftWingBottom26.getChild("LeftWingBottom27");
		this.LeftWingBottom28 = this.LeftWingBottom27.getChild("LeftWingBottom28");
		this.LeftWingBottom29 = this.LeftWingBottom28.getChild("LeftWingBottom29");
		this.LeftWingBottom30 = this.LeftWingBottom29.getChild("LeftWingBottom30");
		this.LeftWingCore = this.LeftWing.getChild("LeftWingCore");
		this.LeftCoreTop = this.LeftWingCore.getChild("LeftCoreTop");
		this.LeftCoreTopFar = this.LeftCoreTop.getChild("LeftCoreTopFar");
		this.LeftCoreMiddle = this.LeftWingCore.getChild("LeftCoreMiddle");
		this.LeftCoreMiddleFar = this.LeftCoreMiddle.getChild("LeftCoreMiddleFar");
		this.LeftCoreBottom = this.LeftWingCore.getChild("LeftCoreBottom");
		this.LeftCoreFront = this.LeftWingCore.getChild("LeftCoreFront");
		this.RightWing = this.Body.getChild("RightWing");
		this.RightPinkTop = this.RightWing.getChild("RightPinkTop");
		this.RightPinkTop2 = this.RightPinkTop.getChild("RightPinkTop2");
		this.RightPinkTop3 = this.RightPinkTop2.getChild("RightPinkTop3");
		this.RightPinkTop4 = this.RightPinkTop3.getChild("RightPinkTop4");
		this.RightPinkTop5 = this.RightPinkTop4.getChild("RightPinkTop5");
		this.RightPinkTop6 = this.RightPinkTop5.getChild("RightPinkTop6");
		this.RightPinkTop7 = this.RightPinkTop6.getChild("RightPinkTop7");
		this.RightPinkTop8 = this.RightPinkTop7.getChild("RightPinkTop8");
		this.RightPinkTop9 = this.RightPinkTop8.getChild("RightPinkTop9");
		this.RightPinkTop10 = this.RightPinkTop9.getChild("RightPinkTop10");
		this.RightPinkTop11 = this.RightPinkTop10.getChild("RightPinkTop11");
		this.RightPinkTop12 = this.RightPinkTop11.getChild("RightPinkTop12");
		this.RightPinkTop13 = this.RightPinkTop12.getChild("RightPinkTop13");
		this.RightPinkTop14 = this.RightPinkTop13.getChild("RightPinkTop14");
		this.RightPinkTop15 = this.RightPinkTop14.getChild("RightPinkTop15");
		this.RightPinkTop16 = this.RightPinkTop15.getChild("RightPinkTop16");
		this.RightPinkTop17 = this.RightPinkTop16.getChild("RightPinkTop17");
		this.RightPinkTop18 = this.RightPinkTop17.getChild("RightPinkTop18");
		this.RightPinkTop19 = this.RightPinkTop18.getChild("RightPinkTop19");
		this.RightPinkTop20 = this.RightPinkTop19.getChild("RightPinkTop20");
		this.RightPinkTop21 = this.RightPinkTop20.getChild("RightPinkTop21");
		this.RightPinkTop22 = this.RightPinkTop21.getChild("RightPinkTop22");
		this.RightPinkTop23 = this.RightPinkTop22.getChild("RightPinkTop23");
		this.RightPinkTop24 = this.RightPinkTop23.getChild("RightPinkTop24");
		this.RightPinkTop25 = this.RightPinkTop24.getChild("RightPinkTop25");
		this.RightPinkTop26 = this.RightPinkTop25.getChild("RightPinkTop26");
		this.RightPinkTop27 = this.RightPinkTop26.getChild("RightPinkTop27");
		this.RightPinkTop28 = this.RightPinkTop27.getChild("RightPinkTop28");
		this.RightPinkTop29 = this.RightPinkTop28.getChild("RightPinkTop29");
		this.RightPinkTop30 = this.RightPinkTop29.getChild("RightPinkTop30");
		this.RightPinkTop31 = this.RightPinkTop30.getChild("RightPinkTop31");
		this.RightPinkTop32 = this.RightPinkTop31.getChild("RightPinkTop32");
		this.RightPinkTop33 = this.RightPinkTop32.getChild("RightPinkTop33");
		this.RightPinkTop34 = this.RightPinkTop33.getChild("RightPinkTop34");
		this.RightPinkTop35 = this.RightPinkTop34.getChild("RightPinkTop35");
		this.RightPinkTop36 = this.RightPinkTop35.getChild("RightPinkTop36");
		this.RightPinkTop37 = this.RightPinkTop36.getChild("RightPinkTop37");
		this.RightWingPinkBottom = this.RightWing.getChild("RightWingPinkBottom");
		this.RightWingPinkBottom2 = this.RightWingPinkBottom.getChild("RightWingPinkBottom2");
		this.RightWingPinkBottom3 = this.RightWingPinkBottom2.getChild("RightWingPinkBottom3");
		this.RightWingPinkBottom4 = this.RightWingPinkBottom3.getChild("RightWingPinkBottom4");
		this.RightWingPinkBottom5 = this.RightWingPinkBottom4.getChild("RightWingPinkBottom5");
		this.RightWingPinkBottom6 = this.RightWingPinkBottom5.getChild("RightWingPinkBottom6");
		this.RightWingPinkBottom7 = this.RightWingPinkBottom6.getChild("RightWingPinkBottom7");
		this.RightWingPinkBottom8 = this.RightWingPinkBottom7.getChild("RightWingPinkBottom8");
		this.RightWingPinkBottom9 = this.RightWingPinkBottom8.getChild("RightWingPinkBottom9");
		this.RightWingPinkBottom10 = this.RightWingPinkBottom9.getChild("RightWingPinkBottom10");
		this.RightWingPinkBottom11 = this.RightWingPinkBottom10.getChild("RightWingPinkBottom11");
		this.RightWingPinkBottom12 = this.RightWingPinkBottom11.getChild("RightWingPinkBottom12");
		this.RightWingPinkBottom13 = this.RightWingPinkBottom12.getChild("RightWingPinkBottom13");
		this.RightWingPinkBottom14 = this.RightWingPinkBottom13.getChild("RightWingPinkBottom14");
		this.RightWingPinkBottom15 = this.RightWingPinkBottom14.getChild("RightWingPinkBottom15");
		this.RightWingPinkBottom16 = this.RightWingPinkBottom15.getChild("RightWingPinkBottom16");
		this.RightWingPinkBottom17 = this.RightWingPinkBottom16.getChild("RightWingPinkBottom17");
		this.RightWingPinkBottom18 = this.RightWingPinkBottom17.getChild("RightWingPinkBottom18");
		this.RightWingPinkBottom19 = this.RightWingPinkBottom18.getChild("RightWingPinkBottom19");
		this.RightWingPinkBottom20 = this.RightWingPinkBottom19.getChild("RightWingPinkBottom20");
		this.RightWingPinkBottom21 = this.RightWingPinkBottom20.getChild("RightWingPinkBottom21");
		this.RightWingPinkBottom22 = this.RightWingPinkBottom21.getChild("RightWingPinkBottom22");
		this.RightWingPinkBottom23 = this.RightWingPinkBottom22.getChild("RightWingPinkBottom23");
		this.RightWingPinkBottom24 = this.RightWingPinkBottom23.getChild("RightWingPinkBottom24");
		this.RightWingPinkBottom25 = this.RightWingPinkBottom24.getChild("RightWingPinkBottom25");
		this.RightWingPinkBottom26 = this.RightWingPinkBottom25.getChild("RightWingPinkBottom26");
		this.RightWingPinkBottom27 = this.RightWingPinkBottom26.getChild("RightWingPinkBottom27");
		this.RightWingPinkBottom28 = this.RightWingPinkBottom27.getChild("RightWingPinkBottom28");
		this.RightWingPinkBottom29 = this.RightWingPinkBottom28.getChild("RightWingPinkBottom29");
		this.RightWingPinkBottom30 = this.RightWingPinkBottom29.getChild("RightWingPinkBottom30");
		this.RightWingPinkBottom31 = this.RightWingPinkBottom30.getChild("RightWingPinkBottom31");
		this.RightWingPinkBottom32 = this.RightWingPinkBottom31.getChild("RightWingPinkBottom32");
		this.RightWingPinkBottom33 = this.RightWingPinkBottom32.getChild("RightWingPinkBottom33");
		this.RightWingPinkBottom34 = this.RightWingPinkBottom33.getChild("RightWingPinkBottom34");
		this.RightWingPinkBottom35 = this.RightWingPinkBottom34.getChild("RightWingPinkBottom35");
		this.RightWingPinkBottom36 = this.RightWingPinkBottom35.getChild("RightWingPinkBottom36");
		this.RightWingPinkBottom37 = this.RightWingPinkBottom36.getChild("RightWingPinkBottom37");
		this.RightWingTop = this.RightWing.getChild("RightWingTop");
		this.RightWingTop2 = this.RightWingTop.getChild("RightWingTop2");
		this.RightWingTop3 = this.RightWingTop2.getChild("RightWingTop3");
		this.RightWingTop4 = this.RightWingTop3.getChild("RightWingTop4");
		this.RightWingTop5 = this.RightWingTop4.getChild("RightWingTop5");
		this.RightWingTop6 = this.RightWingTop5.getChild("RightWingTop6");
		this.RightWingTop7 = this.RightWingTop6.getChild("RightWingTop7");
		this.RightWingTop8 = this.RightWingTop7.getChild("RightWingTop8");
		this.RightWingTop9 = this.RightWingTop8.getChild("RightWingTop9");
		this.RightWingTop10 = this.RightWingTop9.getChild("RightWingTop10");
		this.RightWingTop11 = this.RightWingTop10.getChild("RightWingTop11");
		this.RightWingTop12 = this.RightWingTop11.getChild("RightWingTop12");
		this.RightWingTop13 = this.RightWingTop12.getChild("RightWingTop13");
		this.RightWingTop14 = this.RightWingTop13.getChild("RightWingTop14");
		this.RightWingTop15 = this.RightWingTop14.getChild("RightWingTop15");
		this.RightWingTop16 = this.RightWingTop15.getChild("RightWingTop16");
		this.RightWingTop17 = this.RightWingTop16.getChild("RightWingTop17");
		this.RightWingTop18 = this.RightWingTop17.getChild("RightWingTop18");
		this.RightWingTop19 = this.RightWingTop18.getChild("RightWingTop19");
		this.RightWingTop20 = this.RightWingTop19.getChild("RightWingTop20");
		this.RightWingTop21 = this.RightWingTop20.getChild("RightWingTop21");
		this.RightWingTop22 = this.RightWingTop21.getChild("RightWingTop22");
		this.RightWingTop23 = this.RightWingTop22.getChild("RightWingTop23");
		this.RightWingTop24 = this.RightWingTop23.getChild("RightWingTop24");
		this.RightWingTop25 = this.RightWingTop24.getChild("RightWingTop25");
		this.RightWingTop26 = this.RightWingTop25.getChild("RightWingTop26");
		this.RightWingTop27 = this.RightWingTop26.getChild("RightWingTop27");
		this.RightWingTop28 = this.RightWingTop27.getChild("RightWingTop28");
		this.RightWingTop29 = this.RightWingTop28.getChild("RightWingTop29");
		this.RightWingTop30 = this.RightWingTop29.getChild("RightWingTop30");
		this.RightWingBottom = this.RightWing.getChild("RightWingBottom");
		this.RightWingBottom2 = this.RightWingBottom.getChild("RightWingBottom2");
		this.RightWingBottom3 = this.RightWingBottom2.getChild("RightWingBottom3");
		this.RightWingBottom4 = this.RightWingBottom3.getChild("RightWingBottom4");
		this.RightWingBottom5 = this.RightWingBottom4.getChild("RightWingBottom5");
		this.RightWingBottom6 = this.RightWingBottom5.getChild("RightWingBottom6");
		this.RightWingBottom7 = this.RightWingBottom6.getChild("RightWingBottom7");
		this.RightWingBottom8 = this.RightWingBottom7.getChild("RightWingBottom8");
		this.RightWingBottom9 = this.RightWingBottom8.getChild("RightWingBottom9");
		this.RightWingBottom10 = this.RightWingBottom9.getChild("RightWingBottom10");
		this.RightWingBottom11 = this.RightWingBottom10.getChild("RightWingBottom11");
		this.RightWingBottom12 = this.RightWingBottom11.getChild("RightWingBottom12");
		this.RightWingBottom13 = this.RightWingBottom12.getChild("RightWingBottom13");
		this.RightWingBottom14 = this.RightWingBottom13.getChild("RightWingBottom14");
		this.RightWingBottom15 = this.RightWingBottom14.getChild("RightWingBottom15");
		this.RightWingBottom16 = this.RightWingBottom15.getChild("RightWingBottom16");
		this.RightWingBottom17 = this.RightWingBottom16.getChild("RightWingBottom17");
		this.RightWingBottom18 = this.RightWingBottom17.getChild("RightWingBottom18");
		this.RightWingBottom19 = this.RightWingBottom18.getChild("RightWingBottom19");
		this.RightWingBottom20 = this.RightWingBottom19.getChild("RightWingBottom20");
		this.RightWingBottom21 = this.RightWingBottom20.getChild("RightWingBottom21");
		this.RightWingBottom22 = this.RightWingBottom21.getChild("RightWingBottom22");
		this.RightWingBottom23 = this.RightWingBottom22.getChild("RightWingBottom23");
		this.RightWingBottom24 = this.RightWingBottom23.getChild("RightWingBottom24");
		this.RightWingBottom25 = this.RightWingBottom24.getChild("RightWingBottom25");
		this.RightWingBottom26 = this.RightWingBottom25.getChild("RightWingBottom26");
		this.RightWingBottom27 = this.RightWingBottom26.getChild("RightWingBottom27");
		this.RightWingBottom28 = this.RightWingBottom27.getChild("RightWingBottom28");
		this.RightWingBottom29 = this.RightWingBottom28.getChild("RightWingBottom29");
		this.RightWingBottom30 = this.RightWingBottom29.getChild("RightWingBottom30");
		this.RightWingCore = this.RightWing.getChild("RightWingCore");
		this.RightCoreTop = this.RightWingCore.getChild("RightCoreTop");
		this.RightCoreTopFar = this.RightCoreTop.getChild("RightCoreTopFar");
		this.RightCoreMiddle = this.RightWingCore.getChild("RightCoreMiddle");
		this.RightCoreMiddleFar = this.RightCoreMiddle.getChild("RightCoreMiddleFar");
		this.RightCoreBottom = this.RightWingCore.getChild("RightCoreBottom");
		this.RightCoreFront = this.RightWingCore.getChild("RightCoreFront");
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
		PartDefinition LeftWingTop = LeftWing.addOrReplaceChild("LeftWingTop", CubeListBuilder.create().texOffs(16, 9).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.024F, -4.1F, 0.0F));
		PartDefinition LeftWingTop2 = LeftWingTop.addOrReplaceChild("LeftWingTop2", CubeListBuilder.create().texOffs(72, 36).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop3 = LeftWingTop2.addOrReplaceChild("LeftWingTop3", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop4 = LeftWingTop3.addOrReplaceChild("LeftWingTop4", CubeListBuilder.create().texOffs(6, 17).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop5 = LeftWingTop4.addOrReplaceChild("LeftWingTop5", CubeListBuilder.create().texOffs(22, 0).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop6 = LeftWingTop5.addOrReplaceChild("LeftWingTop6", CubeListBuilder.create().texOffs(22, 18).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop7 = LeftWingTop6.addOrReplaceChild("LeftWingTop7", CubeListBuilder.create().texOffs(12, 27).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop8 = LeftWingTop7.addOrReplaceChild("LeftWingTop8", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop9 = LeftWingTop8.addOrReplaceChild("LeftWingTop9", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop10 = LeftWingTop9.addOrReplaceChild("LeftWingTop10", CubeListBuilder.create().texOffs(42, 72).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop11 = LeftWingTop10.addOrReplaceChild("LeftWingTop11", CubeListBuilder.create().texOffs(34, 18).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop12 = LeftWingTop11.addOrReplaceChild("LeftWingTop12", CubeListBuilder.create().texOffs(34, 0).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop13 = LeftWingTop12.addOrReplaceChild("LeftWingTop13", CubeListBuilder.create().texOffs(28, 18).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop14 = LeftWingTop13.addOrReplaceChild("LeftWingTop14", CubeListBuilder.create().texOffs(24, 36).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop15 = LeftWingTop14.addOrReplaceChild("LeftWingTop15", CubeListBuilder.create().texOffs(6, 35).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop16 = LeftWingTop15.addOrReplaceChild("LeftWingTop16", CubeListBuilder.create().texOffs(18, 36).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop17 = LeftWingTop16.addOrReplaceChild("LeftWingTop17", CubeListBuilder.create().texOffs(46, 0).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop18 = LeftWingTop17.addOrReplaceChild("LeftWingTop18", CubeListBuilder.create().texOffs(48, 72).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop19 = LeftWingTop18.addOrReplaceChild("LeftWingTop19", CubeListBuilder.create().texOffs(12, 45).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop20 = LeftWingTop19.addOrReplaceChild("LeftWingTop20", CubeListBuilder.create().texOffs(42, 36).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop21 = LeftWingTop20.addOrReplaceChild("LeftWingTop21", CubeListBuilder.create().texOffs(40, 18).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop22 = LeftWingTop21.addOrReplaceChild("LeftWingTop22", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop23 = LeftWingTop22.addOrReplaceChild("LeftWingTop23", CubeListBuilder.create().texOffs(36, 36).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop24 = LeftWingTop23.addOrReplaceChild("LeftWingTop24", CubeListBuilder.create().texOffs(30, 36).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop25 = LeftWingTop24.addOrReplaceChild("LeftWingTop25", CubeListBuilder.create().texOffs(46, 18).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop26 = LeftWingTop25.addOrReplaceChild("LeftWingTop26", CubeListBuilder.create().texOffs(54, 72).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop27 = LeftWingTop26.addOrReplaceChild("LeftWingTop27", CubeListBuilder.create().texOffs(52, 0).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop28 = LeftWingTop27.addOrReplaceChild("LeftWingTop28", CubeListBuilder.create().texOffs(48, 36).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop29 = LeftWingTop28.addOrReplaceChild("LeftWingTop29", CubeListBuilder.create().texOffs(30, 72).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingTop30 = LeftWingTop29.addOrReplaceChild("LeftWingTop30", CubeListBuilder.create().texOffs(52, 18).addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom = LeftWing.addOrReplaceChild("LeftWingBottom", CubeListBuilder.create().texOffs(0, 53).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.024F, -4.1F, 0.0F));
		PartDefinition LeftWingBottom2 = LeftWingBottom.addOrReplaceChild("LeftWingBottom2", CubeListBuilder.create().texOffs(72, 54).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom3 = LeftWingBottom2.addOrReplaceChild("LeftWingBottom3", CubeListBuilder.create().texOffs(6, 53).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom4 = LeftWingBottom3.addOrReplaceChild("LeftWingBottom4", CubeListBuilder.create().texOffs(18, 54).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom5 = LeftWingBottom4.addOrReplaceChild("LeftWingBottom5", CubeListBuilder.create().texOffs(24, 54).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom6 = LeftWingBottom5.addOrReplaceChild("LeftWingBottom6", CubeListBuilder.create().texOffs(30, 54).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom7 = LeftWingBottom6.addOrReplaceChild("LeftWingBottom7", CubeListBuilder.create().texOffs(36, 54).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom8 = LeftWingBottom7.addOrReplaceChild("LeftWingBottom8", CubeListBuilder.create().texOffs(54, 36).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom9 = LeftWingBottom8.addOrReplaceChild("LeftWingBottom9", CubeListBuilder.create().texOffs(42, 54).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom10 = LeftWingBottom9.addOrReplaceChild("LeftWingBottom10", CubeListBuilder.create().texOffs(60, 72).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom11 = LeftWingBottom10.addOrReplaceChild("LeftWingBottom11", CubeListBuilder.create().texOffs(48, 54).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom12 = LeftWingBottom11.addOrReplaceChild("LeftWingBottom12", CubeListBuilder.create().texOffs(54, 54).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom13 = LeftWingBottom12.addOrReplaceChild("LeftWingBottom13", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom14 = LeftWingBottom13.addOrReplaceChild("LeftWingBottom14", CubeListBuilder.create().texOffs(58, 18).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom15 = LeftWingBottom14.addOrReplaceChild("LeftWingBottom15", CubeListBuilder.create().texOffs(60, 36).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom16 = LeftWingBottom15.addOrReplaceChild("LeftWingBottom16", CubeListBuilder.create().texOffs(60, 54).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom17 = LeftWingBottom16.addOrReplaceChild("LeftWingBottom17", CubeListBuilder.create().texOffs(12, 63).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom18 = LeftWingBottom17.addOrReplaceChild("LeftWingBottom18", CubeListBuilder.create().texOffs(66, 72).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom19 = LeftWingBottom18.addOrReplaceChild("LeftWingBottom19", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom20 = LeftWingBottom19.addOrReplaceChild("LeftWingBottom20", CubeListBuilder.create().texOffs(64, 18).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom21 = LeftWingBottom20.addOrReplaceChild("LeftWingBottom21", CubeListBuilder.create().texOffs(66, 36).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom22 = LeftWingBottom21.addOrReplaceChild("LeftWingBottom22", CubeListBuilder.create().texOffs(66, 54).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom23 = LeftWingBottom22.addOrReplaceChild("LeftWingBottom23", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom24 = LeftWingBottom23.addOrReplaceChild("LeftWingBottom24", CubeListBuilder.create().texOffs(70, 18).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom25 = LeftWingBottom24.addOrReplaceChild("LeftWingBottom25", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom26 = LeftWingBottom25.addOrReplaceChild("LeftWingBottom26", CubeListBuilder.create().texOffs(72, 72).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom27 = LeftWingBottom26.addOrReplaceChild("LeftWingBottom27", CubeListBuilder.create().texOffs(6, 71).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom28 = LeftWingBottom27.addOrReplaceChild("LeftWingBottom28", CubeListBuilder.create().texOffs(18, 72).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom29 = LeftWingBottom28.addOrReplaceChild("LeftWingBottom29", CubeListBuilder.create().texOffs(36, 72).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingBottom30 = LeftWingBottom29.addOrReplaceChild("LeftWingBottom30", CubeListBuilder.create().texOffs(24, 72).addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftWingCore = LeftWing.addOrReplaceChild("LeftWingCore", CubeListBuilder.create().texOffs(92, 4).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.325F)), PartPose.offset(0.024F, -1.1193F, 6.0702F));
		PartDefinition hexadecagon_r1 = LeftWingCore.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(92, 4).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.325F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = LeftWingCore.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(92, 4).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.325F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = LeftWingCore.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(92, 4).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.325F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition LeftCoreTop = LeftWingCore.addOrReplaceChild("LeftCoreTop", CubeListBuilder.create(), PartPose.offset(0.0F, -2.1885F, 2.0259F));
		PartDefinition cube_r1 = LeftCoreTop.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -0.5251F, -1.4435F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.3015F, 0.8412F, -2.6673F, 0.0F, 0.0F));
		PartDefinition cube_r2 = LeftCoreTop.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(92, 10).addBox(-0.5F, -0.4477F, -1.4472F, 1.0F, 1.0F, 2.8F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.3015F, 0.8412F, -2.7415F, 0.0F, 0.0F));
		PartDefinition cube_r3 = LeftCoreTop.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(92, 10).addBox(-0.5F, -0.5238F, -1.4538F, 1.0F, 1.0F, 2.8F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.3015F, 0.8412F, -2.6673F, 0.0F, 0.0F));
		PartDefinition cube_r4 = LeftCoreTop.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 10).addBox(-0.5F, -0.478F, -1.3919F, 1.0F, 1.0F, 2.8F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.7134F, 0.0541F, -1.8775F, 0.0F, 0.0F));
		PartDefinition cube_r5 = LeftCoreTop.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(92, 10).addBox(-0.5F, -0.522F, -1.4081F, 1.0F, 1.0F, 2.8F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.6955F, 0.0786F, -1.8034F, 0.0F, 0.0F));
		PartDefinition cube_r6 = LeftCoreTop.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.5269F, -0.6131F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r7 = LeftCoreTop.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.5769F, -0.6131F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r8 = LeftCoreTop.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.5769F, -0.4881F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r9 = LeftCoreTop.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.3519F, -0.5881F, 0.6545F, 0.0F, 0.0F));
		PartDefinition LeftCoreTopFar = LeftCoreTop.addOrReplaceChild("LeftCoreTopFar", CubeListBuilder.create(), PartPose.offset(0.0F, -2.4189F, 6.1104F));
		PartDefinition cube_r10 = LeftCoreTopFar.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.0766F, 0.293F, 0.9324F, 0.0F, 0.0F));
		PartDefinition cube_r11 = LeftCoreTopFar.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(90, 80).addBox(-0.5F, -0.5184F, -2.4981F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.2272F, -0.1022F, 0.2343F, 0.0F, 0.0F));
		PartDefinition LeftCoreMiddle = LeftWingCore.addOrReplaceChild("LeftCoreMiddle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1437F, 2.7733F));
		PartDefinition cube_r12 = LeftCoreMiddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.4633F, -4.9773F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.1981F, -1.1433F, 3.1185F, 0.0F, 0.0F));
		PartDefinition cube_r13 = LeftCoreMiddle.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, -0.6955F, -4.971F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.1981F, -1.1433F, -3.1211F, 0.0F, 0.0F));
		PartDefinition cube_r14 = LeftCoreMiddle.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.5646F, -0.1221F, 3.0399F, 0.0F, 0.0F));
		PartDefinition cube_r15 = LeftCoreMiddle.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.2229F, 0.9357F, -2.8069F, 0.0F, 0.0F));
		PartDefinition cube_r16 = LeftCoreMiddle.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.0465F, 0.7951F, -3.1211F, 0.0F, 0.0F));
		PartDefinition cube_r17 = LeftCoreMiddle.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.367F, -0.1297F, 3.1185F, 0.0F, 0.0F));
		PartDefinition cube_r18 = LeftCoreMiddle.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.267F, 0.1953F, 3.1185F, 0.0F, 0.0F));
		PartDefinition cube_r19 = LeftCoreMiddle.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.1465F, 1.4451F, -3.1211F, 0.0F, 0.0F));
		PartDefinition cube_r20 = LeftCoreMiddle.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.1535F, 0.5201F, 3.1185F, 0.0F, 0.0F));
		PartDefinition cube_r21 = LeftCoreMiddle.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.3825F, -0.4759F, 2.9876F, 0.0F, 0.0F));
		PartDefinition cube_r22 = LeftCoreMiddle.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(18, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.298F, 0.1346F, 2.9003F, 0.0F, 0.0F));
		PartDefinition cube_r23 = LeftCoreMiddle.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.2785F, 0.5201F, 2.9003F, 0.0F, 0.0F));
		PartDefinition cube_r24 = LeftCoreMiddle.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(90, 90).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.2055F, 1.9399F, 2.813F, 0.0F, 0.0F));
		PartDefinition cube_r25 = LeftCoreMiddle.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(90, 80).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.1055F, 1.9399F, 2.813F, 0.0F, 0.0F));
		PartDefinition LeftCoreMiddleFar = LeftCoreMiddle.addOrReplaceChild("LeftCoreMiddleFar", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1169F, 4.9468F));
		PartDefinition cube_r26 = LeftCoreMiddleFar.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.525F, -1.76F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.0403F, 0.4386F, 0.0074F, 0.0F, 0.0F));
		PartDefinition cube_r27 = LeftCoreMiddleFar.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.4767F, -1.763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.0403F, 0.4386F, -0.0362F, 0.0F, 0.0F));
		PartDefinition cube_r28 = LeftCoreMiddleFar.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(12, 17).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.116F, 0.3231F, -1.319F, 0.0F, 0.0F));
		PartDefinition cube_r29 = LeftCoreMiddleFar.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(12, 17).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, 0.059F, 0.3231F, -1.6245F, 0.0F, 0.0F));
		PartDefinition LeftCoreBottom = LeftWingCore.addOrReplaceChild("LeftCoreBottom", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6129F, 1.334F));
		PartDefinition cube_r30 = LeftCoreBottom.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.4758F, -1.5104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.3914F, -0.324F, 2.2892F, 0.0F, 0.0F));
		PartDefinition cube_r31 = LeftCoreBottom.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5131F, -1.5077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.3221F, -0.4026F, 2.4201F, 0.0F, 0.0F));
		PartDefinition LeftCoreFront = LeftWingCore.addOrReplaceChild("LeftCoreFront", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0246F, -2.5235F));
		PartDefinition cube_r32 = LeftCoreFront.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(92, 0).addBox(-0.498F, -0.4401F, -0.2686F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(-0.002F, -0.0157F, -0.5865F, 0.0596F, 0.0F, 0.0F));
		PartDefinition cube_r33 = LeftCoreFront.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(92, 0).addBox(-0.498F, -0.4401F, -0.2686F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(-0.002F, 0.2343F, -0.5865F, 0.0378F, 0.0F, 0.0F));
		PartDefinition cube_r34 = LeftCoreFront.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(92, 21).addBox(-0.5019F, -0.5F, -0.35F, 1.0F, 1.0F, 1.7F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0019F, -0.0862F, -0.0207F, 0.0596F, 0.0F, 0.0F));
		PartDefinition cube_r35 = LeftCoreFront.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(92, 21).addBox(-0.5019F, -0.5F, -0.35F, 1.0F, 1.0F, 1.7F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0019F, -0.0862F, -0.0207F, 0.1905F, 0.0F, 0.0F));
		PartDefinition cube_r36 = LeftCoreFront.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(90, 80).addBox(-0.5025F, -0.6864F, -1.2379F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0025F, 0.3655F, -0.6414F, 0.0596F, 0.0F, 0.0F));
		PartDefinition cube_r37 = LeftCoreFront.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(92, 14).addBox(-0.5019F, -0.5F, -1.35F, 1.0F, 1.0F, 2.7F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0019F, -0.2112F, -0.0207F, 0.1687F, 0.0F, 0.0F));
		PartDefinition cube_r38 = LeftCoreFront.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(92, 14).addBox(-0.5019F, -0.5F, -1.35F, 1.0F, 1.0F, 2.7F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0019F, -0.2112F, 0.0793F, 0.3432F, 0.0F, 0.0F));
		PartDefinition cube_r39 = LeftCoreFront.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(90, 85).addBox(-0.5019F, -0.5F, -1.35F, 1.0F, 1.0F, 3.7F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0019F, -0.0612F, -0.0207F, 0.3476F, 0.0F, 0.0F));
		PartDefinition cube_r40 = LeftCoreFront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0F, -0.034F, -0.9906F, 0.3432F, 0.0F, 0.0F));
		PartDefinition cube_r41 = LeftCoreFront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(92, 18).addBox(-0.5025F, -0.6864F, -1.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(0.0025F, 0.2655F, -0.9414F, 0.2123F, 0.0F, 0.0F));
		PartDefinition cube_r42 = LeftCoreFront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(90, 80).addBox(-0.498F, -0.4401F, -2.2686F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.425F)),
				PartPose.offsetAndRotation(-0.002F, 0.2843F, 0.0885F, -0.0495F, 0.0F, 0.0F));
		PartDefinition RightWing = Body.addOrReplaceChild("RightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 2.75F, 1.575F, -0.3423F, -0.9466F, 0.5712F));
		PartDefinition RightPinkTop = RightWing.addOrReplaceChild("RightPinkTop", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-0.024F, -3.85F, 1.35F));
		PartDefinition RightPinkTop2 = RightPinkTop.addOrReplaceChild("RightPinkTop2", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop3 = RightPinkTop2.addOrReplaceChild("RightPinkTop3", CubeListBuilder.create().texOffs(78, 20).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop4 = RightPinkTop3.addOrReplaceChild("RightPinkTop4", CubeListBuilder.create().texOffs(78, 40).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop5 = RightPinkTop4.addOrReplaceChild("RightPinkTop5", CubeListBuilder.create().texOffs(78, 60).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop6 = RightPinkTop5.addOrReplaceChild("RightPinkTop6", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop7 = RightPinkTop6.addOrReplaceChild("RightPinkTop7", CubeListBuilder.create().texOffs(80, 20).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop8 = RightPinkTop7.addOrReplaceChild("RightPinkTop8", CubeListBuilder.create().texOffs(80, 40).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop9 = RightPinkTop8.addOrReplaceChild("RightPinkTop9", CubeListBuilder.create().texOffs(80, 60).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop10 = RightPinkTop9.addOrReplaceChild("RightPinkTop10", CubeListBuilder.create().texOffs(78, 80).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop11 = RightPinkTop10.addOrReplaceChild("RightPinkTop11", CubeListBuilder.create().texOffs(80, 80).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop12 = RightPinkTop11.addOrReplaceChild("RightPinkTop12", CubeListBuilder.create().texOffs(12, 81).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop13 = RightPinkTop12.addOrReplaceChild("RightPinkTop13", CubeListBuilder.create().texOffs(14, 81).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop14 = RightPinkTop13.addOrReplaceChild("RightPinkTop14", CubeListBuilder.create().texOffs(16, 81).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop15 = RightPinkTop14.addOrReplaceChild("RightPinkTop15", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop16 = RightPinkTop15.addOrReplaceChild("RightPinkTop16", CubeListBuilder.create().texOffs(82, 20).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop17 = RightPinkTop16.addOrReplaceChild("RightPinkTop17", CubeListBuilder.create().texOffs(82, 40).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop18 = RightPinkTop17.addOrReplaceChild("RightPinkTop18", CubeListBuilder.create().texOffs(82, 60).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop19 = RightPinkTop18.addOrReplaceChild("RightPinkTop19", CubeListBuilder.create().texOffs(82, 80).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop20 = RightPinkTop19.addOrReplaceChild("RightPinkTop20", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop21 = RightPinkTop20.addOrReplaceChild("RightPinkTop21", CubeListBuilder.create().texOffs(84, 20).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop22 = RightPinkTop21.addOrReplaceChild("RightPinkTop22", CubeListBuilder.create().texOffs(84, 40).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop23 = RightPinkTop22.addOrReplaceChild("RightPinkTop23", CubeListBuilder.create().texOffs(84, 60).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop24 = RightPinkTop23.addOrReplaceChild("RightPinkTop24", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop25 = RightPinkTop24.addOrReplaceChild("RightPinkTop25", CubeListBuilder.create().texOffs(84, 80).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop26 = RightPinkTop25.addOrReplaceChild("RightPinkTop26", CubeListBuilder.create().texOffs(86, 20).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop27 = RightPinkTop26.addOrReplaceChild("RightPinkTop27", CubeListBuilder.create().texOffs(86, 40).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop28 = RightPinkTop27.addOrReplaceChild("RightPinkTop28", CubeListBuilder.create().texOffs(86, 60).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop29 = RightPinkTop28.addOrReplaceChild("RightPinkTop29", CubeListBuilder.create().texOffs(86, 80).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop30 = RightPinkTop29.addOrReplaceChild("RightPinkTop30", CubeListBuilder.create().texOffs(88, 0).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop31 = RightPinkTop30.addOrReplaceChild("RightPinkTop31", CubeListBuilder.create().texOffs(88, 20).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop32 = RightPinkTop31.addOrReplaceChild("RightPinkTop32", CubeListBuilder.create().texOffs(88, 40).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop33 = RightPinkTop32.addOrReplaceChild("RightPinkTop33", CubeListBuilder.create().texOffs(88, 60).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop34 = RightPinkTop33.addOrReplaceChild("RightPinkTop34", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop35 = RightPinkTop34.addOrReplaceChild("RightPinkTop35", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop36 = RightPinkTop35.addOrReplaceChild("RightPinkTop36", CubeListBuilder.create().texOffs(2, 89).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightPinkTop37 = RightPinkTop36.addOrReplaceChild("RightPinkTop37", CubeListBuilder.create().texOffs(4, 89).mirror().addBox(0.0F, -19.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom = RightWing.addOrReplaceChild("RightWingPinkBottom", CubeListBuilder.create().texOffs(6, 89).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-0.024F, -3.85F, 1.35F));
		PartDefinition RightWingPinkBottom2 = RightWingPinkBottom.addOrReplaceChild("RightWingPinkBottom2", CubeListBuilder.create().texOffs(8, 89).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom3 = RightWingPinkBottom2.addOrReplaceChild("RightWingPinkBottom3", CubeListBuilder.create().texOffs(10, 89).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom4 = RightWingPinkBottom3.addOrReplaceChild("RightWingPinkBottom4", CubeListBuilder.create().texOffs(90, 0).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom5 = RightWingPinkBottom4.addOrReplaceChild("RightWingPinkBottom5", CubeListBuilder.create().texOffs(18, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom6 = RightWingPinkBottom5.addOrReplaceChild("RightWingPinkBottom6", CubeListBuilder.create().texOffs(20, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom7 = RightWingPinkBottom6.addOrReplaceChild("RightWingPinkBottom7", CubeListBuilder.create().texOffs(90, 20).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom8 = RightWingPinkBottom7.addOrReplaceChild("RightWingPinkBottom8", CubeListBuilder.create().texOffs(22, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom9 = RightWingPinkBottom8.addOrReplaceChild("RightWingPinkBottom9", CubeListBuilder.create().texOffs(24, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom10 = RightWingPinkBottom9.addOrReplaceChild("RightWingPinkBottom10", CubeListBuilder.create().texOffs(26, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom11 = RightWingPinkBottom10.addOrReplaceChild("RightWingPinkBottom11", CubeListBuilder.create().texOffs(28, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom12 = RightWingPinkBottom11.addOrReplaceChild("RightWingPinkBottom12", CubeListBuilder.create().texOffs(30, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom13 = RightWingPinkBottom12.addOrReplaceChild("RightWingPinkBottom13", CubeListBuilder.create().texOffs(32, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom14 = RightWingPinkBottom13.addOrReplaceChild("RightWingPinkBottom14", CubeListBuilder.create().texOffs(34, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom15 = RightWingPinkBottom14.addOrReplaceChild("RightWingPinkBottom15", CubeListBuilder.create().texOffs(36, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom16 = RightWingPinkBottom15.addOrReplaceChild("RightWingPinkBottom16", CubeListBuilder.create().texOffs(38, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom17 = RightWingPinkBottom16.addOrReplaceChild("RightWingPinkBottom17", CubeListBuilder.create().texOffs(40, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom18 = RightWingPinkBottom17.addOrReplaceChild("RightWingPinkBottom18", CubeListBuilder.create().texOffs(90, 40).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom19 = RightWingPinkBottom18.addOrReplaceChild("RightWingPinkBottom19", CubeListBuilder.create().texOffs(42, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom20 = RightWingPinkBottom19.addOrReplaceChild("RightWingPinkBottom20", CubeListBuilder.create().texOffs(44, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom21 = RightWingPinkBottom20.addOrReplaceChild("RightWingPinkBottom21", CubeListBuilder.create().texOffs(46, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom22 = RightWingPinkBottom21.addOrReplaceChild("RightWingPinkBottom22", CubeListBuilder.create().texOffs(48, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom23 = RightWingPinkBottom22.addOrReplaceChild("RightWingPinkBottom23", CubeListBuilder.create().texOffs(50, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom24 = RightWingPinkBottom23.addOrReplaceChild("RightWingPinkBottom24", CubeListBuilder.create().texOffs(52, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom25 = RightWingPinkBottom24.addOrReplaceChild("RightWingPinkBottom25", CubeListBuilder.create().texOffs(54, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom26 = RightWingPinkBottom25.addOrReplaceChild("RightWingPinkBottom26", CubeListBuilder.create().texOffs(56, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom27 = RightWingPinkBottom26.addOrReplaceChild("RightWingPinkBottom27", CubeListBuilder.create().texOffs(58, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom28 = RightWingPinkBottom27.addOrReplaceChild("RightWingPinkBottom28", CubeListBuilder.create().texOffs(60, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom29 = RightWingPinkBottom28.addOrReplaceChild("RightWingPinkBottom29", CubeListBuilder.create().texOffs(90, 60).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom30 = RightWingPinkBottom29.addOrReplaceChild("RightWingPinkBottom30", CubeListBuilder.create().texOffs(62, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom31 = RightWingPinkBottom30.addOrReplaceChild("RightWingPinkBottom31", CubeListBuilder.create().texOffs(64, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom32 = RightWingPinkBottom31.addOrReplaceChild("RightWingPinkBottom32", CubeListBuilder.create().texOffs(66, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom33 = RightWingPinkBottom32.addOrReplaceChild("RightWingPinkBottom33", CubeListBuilder.create().texOffs(68, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom34 = RightWingPinkBottom33.addOrReplaceChild("RightWingPinkBottom34", CubeListBuilder.create().texOffs(70, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom35 = RightWingPinkBottom34.addOrReplaceChild("RightWingPinkBottom35", CubeListBuilder.create().texOffs(72, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom36 = RightWingPinkBottom35.addOrReplaceChild("RightWingPinkBottom36", CubeListBuilder.create().texOffs(74, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingPinkBottom37 = RightWingPinkBottom36.addOrReplaceChild("RightWingPinkBottom37", CubeListBuilder.create().texOffs(76, 90).mirror().addBox(0.0F, 0.0F, 0.0F, 0.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition RightWingTop = RightWing.addOrReplaceChild("RightWingTop", CubeListBuilder.create().texOffs(16, 9).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(-0.024F, -4.1F, 0.0F));
		PartDefinition RightWingTop2 = RightWingTop.addOrReplaceChild("RightWingTop2", CubeListBuilder.create().texOffs(72, 36).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop3 = RightWingTop2.addOrReplaceChild("RightWingTop3", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop4 = RightWingTop3.addOrReplaceChild("RightWingTop4", CubeListBuilder.create().texOffs(6, 17).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop5 = RightWingTop4.addOrReplaceChild("RightWingTop5", CubeListBuilder.create().texOffs(22, 0).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop6 = RightWingTop5.addOrReplaceChild("RightWingTop6", CubeListBuilder.create().texOffs(22, 18).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop7 = RightWingTop6.addOrReplaceChild("RightWingTop7", CubeListBuilder.create().texOffs(12, 27).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop8 = RightWingTop7.addOrReplaceChild("RightWingTop8", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop9 = RightWingTop8.addOrReplaceChild("RightWingTop9", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop10 = RightWingTop9.addOrReplaceChild("RightWingTop10", CubeListBuilder.create().texOffs(42, 72).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop11 = RightWingTop10.addOrReplaceChild("RightWingTop11", CubeListBuilder.create().texOffs(34, 18).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop12 = RightWingTop11.addOrReplaceChild("RightWingTop12", CubeListBuilder.create().texOffs(34, 0).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop13 = RightWingTop12.addOrReplaceChild("RightWingTop13", CubeListBuilder.create().texOffs(28, 18).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop14 = RightWingTop13.addOrReplaceChild("RightWingTop14", CubeListBuilder.create().texOffs(24, 36).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop15 = RightWingTop14.addOrReplaceChild("RightWingTop15", CubeListBuilder.create().texOffs(6, 35).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop16 = RightWingTop15.addOrReplaceChild("RightWingTop16", CubeListBuilder.create().texOffs(18, 36).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop17 = RightWingTop16.addOrReplaceChild("RightWingTop17", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop18 = RightWingTop17.addOrReplaceChild("RightWingTop18", CubeListBuilder.create().texOffs(48, 72).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop19 = RightWingTop18.addOrReplaceChild("RightWingTop19", CubeListBuilder.create().texOffs(12, 45).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop20 = RightWingTop19.addOrReplaceChild("RightWingTop20", CubeListBuilder.create().texOffs(42, 36).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop21 = RightWingTop20.addOrReplaceChild("RightWingTop21", CubeListBuilder.create().texOffs(40, 18).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop22 = RightWingTop21.addOrReplaceChild("RightWingTop22", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop23 = RightWingTop22.addOrReplaceChild("RightWingTop23", CubeListBuilder.create().texOffs(36, 36).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop24 = RightWingTop23.addOrReplaceChild("RightWingTop24", CubeListBuilder.create().texOffs(30, 36).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop25 = RightWingTop24.addOrReplaceChild("RightWingTop25", CubeListBuilder.create().texOffs(46, 18).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop26 = RightWingTop25.addOrReplaceChild("RightWingTop26", CubeListBuilder.create().texOffs(54, 72).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop27 = RightWingTop26.addOrReplaceChild("RightWingTop27", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop28 = RightWingTop27.addOrReplaceChild("RightWingTop28", CubeListBuilder.create().texOffs(48, 36).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop29 = RightWingTop28.addOrReplaceChild("RightWingTop29", CubeListBuilder.create().texOffs(30, 72).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingTop30 = RightWingTop29.addOrReplaceChild("RightWingTop30", CubeListBuilder.create().texOffs(52, 18).mirror().addBox(-0.5F, -15.55F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom = RightWing.addOrReplaceChild("RightWingBottom", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(-0.024F, -4.1F, 0.0F));
		PartDefinition RightWingBottom2 = RightWingBottom.addOrReplaceChild("RightWingBottom2", CubeListBuilder.create().texOffs(72, 54).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom3 = RightWingBottom2.addOrReplaceChild("RightWingBottom3", CubeListBuilder.create().texOffs(6, 53).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom4 = RightWingBottom3.addOrReplaceChild("RightWingBottom4", CubeListBuilder.create().texOffs(18, 54).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom5 = RightWingBottom4.addOrReplaceChild("RightWingBottom5", CubeListBuilder.create().texOffs(24, 54).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom6 = RightWingBottom5.addOrReplaceChild("RightWingBottom6", CubeListBuilder.create().texOffs(30, 54).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom7 = RightWingBottom6.addOrReplaceChild("RightWingBottom7", CubeListBuilder.create().texOffs(36, 54).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom8 = RightWingBottom7.addOrReplaceChild("RightWingBottom8", CubeListBuilder.create().texOffs(54, 36).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom9 = RightWingBottom8.addOrReplaceChild("RightWingBottom9", CubeListBuilder.create().texOffs(42, 54).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom10 = RightWingBottom9.addOrReplaceChild("RightWingBottom10", CubeListBuilder.create().texOffs(60, 72).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom11 = RightWingBottom10.addOrReplaceChild("RightWingBottom11", CubeListBuilder.create().texOffs(48, 54).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom12 = RightWingBottom11.addOrReplaceChild("RightWingBottom12", CubeListBuilder.create().texOffs(54, 54).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom13 = RightWingBottom12.addOrReplaceChild("RightWingBottom13", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom14 = RightWingBottom13.addOrReplaceChild("RightWingBottom14", CubeListBuilder.create().texOffs(58, 18).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom15 = RightWingBottom14.addOrReplaceChild("RightWingBottom15", CubeListBuilder.create().texOffs(60, 36).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom16 = RightWingBottom15.addOrReplaceChild("RightWingBottom16", CubeListBuilder.create().texOffs(60, 54).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom17 = RightWingBottom16.addOrReplaceChild("RightWingBottom17", CubeListBuilder.create().texOffs(12, 63).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom18 = RightWingBottom17.addOrReplaceChild("RightWingBottom18", CubeListBuilder.create().texOffs(66, 72).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom19 = RightWingBottom18.addOrReplaceChild("RightWingBottom19", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom20 = RightWingBottom19.addOrReplaceChild("RightWingBottom20", CubeListBuilder.create().texOffs(64, 18).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom21 = RightWingBottom20.addOrReplaceChild("RightWingBottom21", CubeListBuilder.create().texOffs(66, 36).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom22 = RightWingBottom21.addOrReplaceChild("RightWingBottom22", CubeListBuilder.create().texOffs(66, 54).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom23 = RightWingBottom22.addOrReplaceChild("RightWingBottom23", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom24 = RightWingBottom23.addOrReplaceChild("RightWingBottom24", CubeListBuilder.create().texOffs(70, 18).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom25 = RightWingBottom24.addOrReplaceChild("RightWingBottom25", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom26 = RightWingBottom25.addOrReplaceChild("RightWingBottom26", CubeListBuilder.create().texOffs(72, 72).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom27 = RightWingBottom26.addOrReplaceChild("RightWingBottom27", CubeListBuilder.create().texOffs(6, 71).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom28 = RightWingBottom27.addOrReplaceChild("RightWingBottom28", CubeListBuilder.create().texOffs(18, 72).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom29 = RightWingBottom28.addOrReplaceChild("RightWingBottom29", CubeListBuilder.create().texOffs(36, 72).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingBottom30 = RightWingBottom29.addOrReplaceChild("RightWingBottom30", CubeListBuilder.create().texOffs(24, 72).mirror().addBox(-0.5F, -0.45F, -0.45F, 1.0F, 16.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightWingCore = RightWing.addOrReplaceChild("RightWingCore", CubeListBuilder.create().texOffs(92, 4).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.325F)).mirror(false),
				PartPose.offset(-0.024F, -1.1193F, 6.0702F));
		PartDefinition hexadecagon_r4 = RightWingCore.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(92, 4).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.325F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r5 = RightWingCore.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(92, 4).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.325F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r6 = RightWingCore.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(92, 4).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.325F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition RightCoreTop = RightWingCore.addOrReplaceChild("RightCoreTop", CubeListBuilder.create(), PartPose.offset(0.0F, -2.1885F, 2.0259F));
		PartDefinition cube_r43 = RightCoreTop.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.5F, -0.5251F, -1.4435F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.3015F, 0.8412F, -2.6673F, 0.0F, 0.0F));
		PartDefinition cube_r44 = RightCoreTop.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(92, 10).mirror().addBox(-0.5F, -0.4477F, -1.4472F, 1.0F, 1.0F, 2.8F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.3015F, 0.8412F, -2.7415F, 0.0F, 0.0F));
		PartDefinition cube_r45 = RightCoreTop.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(92, 10).mirror().addBox(-0.5F, -0.5238F, -1.4538F, 1.0F, 1.0F, 2.8F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.3015F, 0.8412F, -2.6673F, 0.0F, 0.0F));
		PartDefinition cube_r46 = RightCoreTop.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(92, 10).mirror().addBox(-0.5F, -0.478F, -1.3919F, 1.0F, 1.0F, 2.8F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.7134F, 0.0541F, -1.8775F, 0.0F, 0.0F));
		PartDefinition cube_r47 = RightCoreTop.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(92, 10).mirror().addBox(-0.5F, -0.522F, -1.4081F, 1.0F, 1.0F, 2.8F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.6955F, 0.0786F, -1.8034F, 0.0F, 0.0F));
		PartDefinition cube_r48 = RightCoreTop.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.5269F, -0.6131F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r49 = RightCoreTop.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.5769F, -0.6131F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r50 = RightCoreTop.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.5769F, -0.4881F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r51 = RightCoreTop.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.3519F, -0.5881F, 0.6545F, 0.0F, 0.0F));
		PartDefinition RightCoreTopFar = RightCoreTop.addOrReplaceChild("RightCoreTopFar", CubeListBuilder.create(), PartPose.offset(0.0F, -2.4189F, 6.1104F));
		PartDefinition cube_r52 = RightCoreTopFar.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0766F, 0.293F, 0.9324F, 0.0F, 0.0F));
		PartDefinition cube_r53 = RightCoreTopFar.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(90, 80).mirror().addBox(-0.5F, -0.5184F, -2.4981F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.2272F, -0.1022F, 0.2343F, 0.0F, 0.0F));
		PartDefinition RightCoreMiddle = RightWingCore.addOrReplaceChild("RightCoreMiddle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1437F, 2.7733F));
		PartDefinition cube_r54 = RightCoreMiddle.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.4633F, -4.9773F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.1981F, -1.1433F, 3.1185F, 0.0F, 0.0F));
		PartDefinition cube_r55 = RightCoreMiddle.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-0.5F, -0.6955F, -4.971F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.1981F, -1.1433F, -3.1211F, 0.0F, 0.0F));
		PartDefinition cube_r56 = RightCoreMiddle.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.5646F, -0.1221F, 3.0399F, 0.0F, 0.0F));
		PartDefinition cube_r57 = RightCoreMiddle.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.2229F, 0.9357F, -2.8069F, 0.0F, 0.0F));
		PartDefinition cube_r58 = RightCoreMiddle.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0465F, 0.7951F, -3.1211F, 0.0F, 0.0F));
		PartDefinition cube_r59 = RightCoreMiddle.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.367F, -0.1297F, 3.1185F, 0.0F, 0.0F));
		PartDefinition cube_r60 = RightCoreMiddle.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.267F, 0.1953F, 3.1185F, 0.0F, 0.0F));
		PartDefinition cube_r61 = RightCoreMiddle.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1465F, 1.4451F, -3.1211F, 0.0F, 0.0F));
		PartDefinition cube_r62 = RightCoreMiddle.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.1535F, 0.5201F, 3.1185F, 0.0F, 0.0F));
		PartDefinition cube_r63 = RightCoreMiddle.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.3825F, -0.4759F, 2.9876F, 0.0F, 0.0F));
		PartDefinition cube_r64 = RightCoreMiddle.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(18, 0).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.298F, 0.1346F, 2.9003F, 0.0F, 0.0F));
		PartDefinition cube_r65 = RightCoreMiddle.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.2785F, 0.5201F, 2.9003F, 0.0F, 0.0F));
		PartDefinition cube_r66 = RightCoreMiddle.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(90, 90).mirror().addBox(-0.5F, -1.5F, 1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.2055F, 1.9399F, 2.813F, 0.0F, 0.0F));
		PartDefinition cube_r67 = RightCoreMiddle.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(90, 80).mirror().addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1055F, 1.9399F, 2.813F, 0.0F, 0.0F));
		PartDefinition RightCoreMiddleFar = RightCoreMiddle.addOrReplaceChild("RightCoreMiddleFar", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1169F, 4.9468F));
		PartDefinition cube_r68 = RightCoreMiddleFar.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.525F, -1.76F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0403F, 0.4386F, 0.0074F, 0.0F, 0.0F));
		PartDefinition cube_r69 = RightCoreMiddleFar.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.4767F, -1.763F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0403F, 0.4386F, -0.0362F, 0.0F, 0.0F));
		PartDefinition cube_r70 = RightCoreMiddleFar.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(12, 17).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.116F, 0.3231F, -1.319F, 0.0F, 0.0F));
		PartDefinition cube_r71 = RightCoreMiddleFar.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(12, 17).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.059F, 0.3231F, -1.6245F, 0.0F, 0.0F));
		PartDefinition RightCoreBottom = RightWingCore.addOrReplaceChild("RightCoreBottom", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6129F, 1.334F));
		PartDefinition cube_r72 = RightCoreBottom.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.4758F, -1.5104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.3914F, -0.324F, 2.2892F, 0.0F, 0.0F));
		PartDefinition cube_r73 = RightCoreBottom.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5131F, -1.5077F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.3221F, -0.4026F, 2.4201F, 0.0F, 0.0F));
		PartDefinition RightCoreFront = RightWingCore.addOrReplaceChild("RightCoreFront", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0246F, -2.5235F));
		PartDefinition cube_r74 = RightCoreFront.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.502F, -0.4401F, -0.2686F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.002F, -0.0157F, -0.5865F, 0.0596F, 0.0F, 0.0F));
		PartDefinition cube_r75 = RightCoreFront.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(92, 0).mirror().addBox(-0.502F, -0.4401F, -0.2686F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.002F, 0.2343F, -0.5865F, 0.0378F, 0.0F, 0.0F));
		PartDefinition cube_r76 = RightCoreFront.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(92, 21).mirror().addBox(-0.4981F, -0.5F, -0.35F, 1.0F, 1.0F, 1.7F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(-0.0019F, -0.0862F, -0.0207F, 0.0596F, 0.0F, 0.0F));
		PartDefinition cube_r77 = RightCoreFront.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(92, 21).mirror().addBox(-0.4981F, -0.5F, -0.35F, 1.0F, 1.0F, 1.7F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(-0.0019F, -0.0862F, -0.0207F, 0.1905F, 0.0F, 0.0F));
		PartDefinition cube_r78 = RightCoreFront.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(90, 80).mirror().addBox(-0.4975F, -0.6864F, -1.2379F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(-0.0025F, 0.3655F, -0.6414F, 0.0596F, 0.0F, 0.0F));
		PartDefinition cube_r79 = RightCoreFront.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(-0.4981F, -0.5F, -1.35F, 1.0F, 1.0F, 2.7F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(-0.0019F, -0.2112F, -0.0207F, 0.1687F, 0.0F, 0.0F));
		PartDefinition cube_r80 = RightCoreFront.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(92, 14).mirror().addBox(-0.4981F, -0.5F, -1.35F, 1.0F, 1.0F, 2.7F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(-0.0019F, -0.2112F, 0.0793F, 0.3432F, 0.0F, 0.0F));
		PartDefinition cube_r81 = RightCoreFront.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(90, 85).mirror().addBox(-0.4981F, -0.5F, -1.35F, 1.0F, 1.0F, 3.7F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(-0.0019F, -0.0612F, -0.0207F, 0.3476F, 0.0F, 0.0F));
		PartDefinition cube_r82 = RightCoreFront.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.034F, -0.9906F, 0.3432F, 0.0F, 0.0F));
		PartDefinition cube_r83 = RightCoreFront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(92, 18).mirror().addBox(-0.4975F, -0.6864F, -1.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(-0.0025F, 0.2655F, -0.9414F, 0.2123F, 0.0F, 0.0F));
		PartDefinition cube_r84 = RightCoreFront.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(90, 80).mirror().addBox(-0.502F, -0.4401F, -2.2686F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.425F)).mirror(false),
				PartPose.offsetAndRotation(0.002F, 0.2843F, 0.0885F, -0.0495F, 0.0F, 0.0F));
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
