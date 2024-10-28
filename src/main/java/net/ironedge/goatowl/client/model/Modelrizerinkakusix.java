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

import net.ironedge.goatowl.RizeRinkakuSixAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelrizerinkakusix<T extends Entity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelrizerinkakusix"), "main");
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
	public final ModelPart Tail5;
	public final ModelPart RightMiddleTailSegment;
	public final ModelPart RightMiddleTailSegment2;
	public final ModelPart RightMiddleTailSegment3;
	public final ModelPart RightMiddleTailSegment4;
	public final ModelPart RightMiddleTailSegment5;
	public final ModelPart RightMiddleTailSegment6;
	public final ModelPart RightMiddleTailSegment7;
	public final ModelPart RightMiddleTailSegment8;
	public final ModelPart RightMiddleTailSegment9;
	public final ModelPart RightMiddleTailSegment10;
	public final ModelPart RightMiddleTailSegment11;
	public final ModelPart Tail6;
	public final ModelPart LeftMiddleTailSegment;
	public final ModelPart LeftMiddleTailSegment2;
	public final ModelPart LeftMiddleTailSegment3;
	public final ModelPart LeftMiddleTailSegment4;
	public final ModelPart LeftMiddleTailSegment5;
	public final ModelPart LeftMiddleTailSegment6;
	public final ModelPart LeftMiddleTailSegment7;
	public final ModelPart LeftMiddleTailSegment8;
	public final ModelPart LeftMiddleTailSegment9;
	public final ModelPart LeftMiddleTailSegment10;
	public final ModelPart LeftMiddleTailSegment11;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelrizerinkakusix(ModelPart root) {
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
		this.Tail5 = this.Tails.getChild("Tail5");
		this.RightMiddleTailSegment = this.Tail5.getChild("RightMiddleTailSegment");
		this.RightMiddleTailSegment2 = this.RightMiddleTailSegment.getChild("RightMiddleTailSegment2");
		this.RightMiddleTailSegment3 = this.RightMiddleTailSegment2.getChild("RightMiddleTailSegment3");
		this.RightMiddleTailSegment4 = this.RightMiddleTailSegment3.getChild("RightMiddleTailSegment4");
		this.RightMiddleTailSegment5 = this.RightMiddleTailSegment4.getChild("RightMiddleTailSegment5");
		this.RightMiddleTailSegment6 = this.RightMiddleTailSegment5.getChild("RightMiddleTailSegment6");
		this.RightMiddleTailSegment7 = this.RightMiddleTailSegment6.getChild("RightMiddleTailSegment7");
		this.RightMiddleTailSegment8 = this.RightMiddleTailSegment7.getChild("RightMiddleTailSegment8");
		this.RightMiddleTailSegment9 = this.RightMiddleTailSegment8.getChild("RightMiddleTailSegment9");
		this.RightMiddleTailSegment10 = this.RightMiddleTailSegment9.getChild("RightMiddleTailSegment10");
		this.RightMiddleTailSegment11 = this.RightMiddleTailSegment10.getChild("RightMiddleTailSegment11");
		this.Tail6 = this.Tails.getChild("Tail6");
		this.LeftMiddleTailSegment = this.Tail6.getChild("LeftMiddleTailSegment");
		this.LeftMiddleTailSegment2 = this.LeftMiddleTailSegment.getChild("LeftMiddleTailSegment2");
		this.LeftMiddleTailSegment3 = this.LeftMiddleTailSegment2.getChild("LeftMiddleTailSegment3");
		this.LeftMiddleTailSegment4 = this.LeftMiddleTailSegment3.getChild("LeftMiddleTailSegment4");
		this.LeftMiddleTailSegment5 = this.LeftMiddleTailSegment4.getChild("LeftMiddleTailSegment5");
		this.LeftMiddleTailSegment6 = this.LeftMiddleTailSegment5.getChild("LeftMiddleTailSegment6");
		this.LeftMiddleTailSegment7 = this.LeftMiddleTailSegment6.getChild("LeftMiddleTailSegment7");
		this.LeftMiddleTailSegment8 = this.LeftMiddleTailSegment7.getChild("LeftMiddleTailSegment8");
		this.LeftMiddleTailSegment9 = this.LeftMiddleTailSegment8.getChild("LeftMiddleTailSegment9");
		this.LeftMiddleTailSegment10 = this.LeftMiddleTailSegment9.getChild("LeftMiddleTailSegment10");
		this.LeftMiddleTailSegment11 = this.LeftMiddleTailSegment10.getChild("LeftMiddleTailSegment11");
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
		PartDefinition Tail1 = Tails.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offset(-1.45F, 0.3087F, 0.1863F));
		PartDefinition RightTopTailSegment = Tail1.addOrReplaceChild("RightTopTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition RightTopTailSegment2 = RightTopTailSegment.addOrReplaceChild("RightTopTailSegment2",
				CubeListBuilder.create().texOffs(130, 93).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.45F)).texOffs(116, 31).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition RightTopTailSegment3 = RightTopTailSegment2.addOrReplaceChild("RightTopTailSegment3",
				CubeListBuilder.create().texOffs(99, 0).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(101, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition RightTopTailSegment4 = RightTopTailSegment3.addOrReplaceChild("RightTopTailSegment4",
				CubeListBuilder.create().texOffs(38, 70).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(15, 114).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment5 = RightTopTailSegment4.addOrReplaceChild("RightTopTailSegment5",
				CubeListBuilder.create().texOffs(32, 112).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 70).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment6 = RightTopTailSegment5.addOrReplaceChild("RightTopTailSegment6",
				CubeListBuilder.create().texOffs(91, 75).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(21, 51).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment7 = RightTopTailSegment6.addOrReplaceChild("RightTopTailSegment7",
				CubeListBuilder.create().texOffs(34, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(42, 50).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition RightTopTailSegment8 = RightTopTailSegment7.addOrReplaceChild("RightTopTailSegment8",
				CubeListBuilder.create().texOffs(0, 50).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment9 = RightTopTailSegment8.addOrReplaceChild("RightTopTailSegment9",
				CubeListBuilder.create().texOffs(34, 102).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(13, 125).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.7F));
		PartDefinition RightTopTailSegment10 = RightTopTailSegment9.addOrReplaceChild("RightTopTailSegment10",
				CubeListBuilder.create().texOffs(126, 111).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(102, 133).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment11 = RightTopTailSegment10.addOrReplaceChild("RightTopTailSegment11", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition Tail2 = Tails.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offset(1.55F, 0.3087F, 0.1863F));
		PartDefinition LeftTopTailSegment = Tail2.addOrReplaceChild("LeftTopTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition LeftTopTailSegment2 = LeftTopTailSegment.addOrReplaceChild("LeftTopTailSegment2",
				CubeListBuilder.create().texOffs(65, 129).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.45F)).texOffs(116, 11).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition LeftTopTailSegment3 = LeftTopTailSegment2.addOrReplaceChild("LeftTopTailSegment3",
				CubeListBuilder.create().texOffs(97, 57).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(75, 118).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition LeftTopTailSegment4 = LeftTopTailSegment3.addOrReplaceChild("LeftTopTailSegment4",
				CubeListBuilder.create().texOffs(63, 31).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(96, 109).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment5 = LeftTopTailSegment4.addOrReplaceChild("LeftTopTailSegment5",
				CubeListBuilder.create().texOffs(108, 78).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(63, 21).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment6 = LeftTopTailSegment5.addOrReplaceChild("LeftTopTailSegment6",
				CubeListBuilder.create().texOffs(82, 46).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(42, 10).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment7 = LeftTopTailSegment6.addOrReplaceChild("LeftTopTailSegment7",
				CubeListBuilder.create().texOffs(82, 35).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(42, 0).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.8F));
		PartDefinition LeftTopTailSegment8 = LeftTopTailSegment7.addOrReplaceChild("LeftTopTailSegment8",
				CubeListBuilder.create().texOffs(21, 41).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(82, 24).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition LeftTopTailSegment9 = LeftTopTailSegment8.addOrReplaceChild("LeftTopTailSegment9",
				CubeListBuilder.create().texOffs(99, 40).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(123, 71).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment10 = LeftTopTailSegment9.addOrReplaceChild("LeftTopTailSegment10",
				CubeListBuilder.create().texOffs(116, 41).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(131, 21).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment11 = LeftTopTailSegment10.addOrReplaceChild("LeftTopTailSegment11", CubeListBuilder.create().texOffs(131, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition Tail3 = Tails.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offset(-1.45F, 0.3087F, 0.1863F));
		PartDefinition RightBottomTailSegment = Tail3.addOrReplaceChild("RightBottomTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition RightBottomTailSegment2 = RightBottomTailSegment.addOrReplaceChild("RightBottomTailSegment2",
				CubeListBuilder.create().texOffs(130, 82).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.45F)).texOffs(116, 21).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition RightBottomTailSegment3 = RightBottomTailSegment2.addOrReplaceChild("RightBottomTailSegment3",
				CubeListBuilder.create().texOffs(85, 97).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(88, 120).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition RightBottomTailSegment4 = RightBottomTailSegment3.addOrReplaceChild("RightBottomTailSegment4",
				CubeListBuilder.create().texOffs(63, 51).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 112).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment5 = RightBottomTailSegment4.addOrReplaceChild("RightBottomTailSegment5",
				CubeListBuilder.create().texOffs(111, 111).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(63, 41).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment6 = RightBottomTailSegment5.addOrReplaceChild("RightBottomTailSegment6",
				CubeListBuilder.create().texOffs(87, 86).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(42, 40).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment7 = RightBottomTailSegment6.addOrReplaceChild("RightBottomTailSegment7",
				CubeListBuilder.create().texOffs(70, 84).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(42, 30).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.8F));
		PartDefinition RightBottomTailSegment8 = RightBottomTailSegment7.addOrReplaceChild("RightBottomTailSegment8",
				CubeListBuilder.create().texOffs(42, 20).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(53, 82).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment9 = RightBottomTailSegment8.addOrReplaceChild("RightBottomTailSegment9",
				CubeListBuilder.create().texOffs(0, 102).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(123, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.9F));
		PartDefinition RightBottomTailSegment10 = RightBottomTailSegment9.addOrReplaceChild("RightBottomTailSegment10",
				CubeListBuilder.create().texOffs(114, 122).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(83, 131).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment11 = RightBottomTailSegment10.addOrReplaceChild("RightBottomTailSegment11", CubeListBuilder.create().texOffs(131, 31).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition Tail4 = Tails.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offset(1.55F, 0.3087F, 0.1863F));
		PartDefinition LeftBottomTailSegment = Tail4.addOrReplaceChild("LeftBottomTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition LeftBottomTailSegment2 = LeftBottomTailSegment.addOrReplaceChild("LeftBottomTailSegment2",
				CubeListBuilder.create().texOffs(129, 41).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.45F)).texOffs(116, 1).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition LeftBottomTailSegment3 = LeftBottomTailSegment2.addOrReplaceChild("LeftBottomTailSegment3",
				CubeListBuilder.create().texOffs(68, 95).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(117, 100).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition LeftBottomTailSegment4 = LeftBottomTailSegment3.addOrReplaceChild("LeftBottomTailSegment4",
				CubeListBuilder.create().texOffs(63, 11).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(108, 67).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment5 = LeftBottomTailSegment4.addOrReplaceChild("LeftBottomTailSegment5",
				CubeListBuilder.create().texOffs(81, 107).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(63, 1).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment6 = LeftBottomTailSegment5.addOrReplaceChild("LeftBottomTailSegment6",
				CubeListBuilder.create().texOffs(17, 82).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 40).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment7 = LeftBottomTailSegment6.addOrReplaceChild("LeftBottomTailSegment7",
				CubeListBuilder.create().texOffs(82, 13).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(21, 31).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.8F));
		PartDefinition LeftBottomTailSegment8 = LeftBottomTailSegment7.addOrReplaceChild("LeftBottomTailSegment8",
				CubeListBuilder.create().texOffs(0, 30).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(82, 2).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment9 = LeftBottomTailSegment8.addOrReplaceChild("LeftBottomTailSegment9",
				CubeListBuilder.create().texOffs(99, 30).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(123, 60).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.9F));
		PartDefinition LeftBottomTailSegment10 = LeftBottomTailSegment9.addOrReplaceChild("LeftBottomTailSegment10",
				CubeListBuilder.create().texOffs(114, 60).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(131, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment11 = LeftBottomTailSegment10.addOrReplaceChild("LeftBottomTailSegment11", CubeListBuilder.create().texOffs(76, 129).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition Tail5 = Tails.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offset(-1.45F, 0.3087F, 0.1863F));
		PartDefinition RightMiddleTailSegment = Tail5.addOrReplaceChild("RightMiddleTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition RightMiddleTailSegment2 = RightMiddleTailSegment.addOrReplaceChild("RightMiddleTailSegment2",
				CubeListBuilder.create().texOffs(54, 127).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.45F)).texOffs(114, 50).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition RightMiddleTailSegment3 = RightMiddleTailSegment2.addOrReplaceChild("RightMiddleTailSegment3",
				CubeListBuilder.create().texOffs(51, 93).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(117, 89).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition RightMiddleTailSegment4 = RightMiddleTailSegment3.addOrReplaceChild("RightMiddleTailSegment4",
				CubeListBuilder.create().texOffs(61, 61).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(66, 105).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightMiddleTailSegment5 = RightMiddleTailSegment4.addOrReplaceChild("RightMiddleTailSegment5",
				CubeListBuilder.create().texOffs(51, 103).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(19, 61).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightMiddleTailSegment6 = RightMiddleTailSegment5.addOrReplaceChild("RightMiddleTailSegment6",
				CubeListBuilder.create().texOffs(80, 62).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(21, 21).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightMiddleTailSegment7 = RightMiddleTailSegment6.addOrReplaceChild("RightMiddleTailSegment7",
				CubeListBuilder.create().texOffs(36, 80).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(21, 11).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition RightMiddleTailSegment8 = RightMiddleTailSegment7.addOrReplaceChild("RightMiddleTailSegment8",
				CubeListBuilder.create().texOffs(21, 1).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 80).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightMiddleTailSegment9 = RightMiddleTailSegment8.addOrReplaceChild("RightMiddleTailSegment9",
				CubeListBuilder.create().texOffs(99, 20).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(30, 123).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightMiddleTailSegment10 = RightMiddleTailSegment9.addOrReplaceChild("RightMiddleTailSegment10",
				CubeListBuilder.create().texOffs(104, 89).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(129, 52).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightMiddleTailSegment11 = RightMiddleTailSegment10.addOrReplaceChild("RightMiddleTailSegment11", CubeListBuilder.create().texOffs(26, 125).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition Tail6 = Tails.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offset(1.45F, 0.3087F, 0.1863F));
		PartDefinition LeftMiddleTailSegment = Tail6.addOrReplaceChild("LeftMiddleTailSegment", CubeListBuilder.create(), PartPose.offset(0.075F, 0.0F, 0.0F));
		PartDefinition LeftMiddleTailSegment2 = LeftMiddleTailSegment.addOrReplaceChild("LeftMiddleTailSegment2",
				CubeListBuilder.create().texOffs(43, 125).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.45F)).texOffs(47, 114).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-0.025F, 0.0F, 0.0F));
		PartDefinition LeftMiddleTailSegment3 = LeftMiddleTailSegment2.addOrReplaceChild("LeftMiddleTailSegment3",
				CubeListBuilder.create().texOffs(17, 93).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(62, 116).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition LeftMiddleTailSegment4 = LeftMiddleTailSegment3.addOrReplaceChild("LeftMiddleTailSegment4",
				CubeListBuilder.create().texOffs(42, 60).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(17, 103).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftMiddleTailSegment5 = LeftMiddleTailSegment4.addOrReplaceChild("LeftMiddleTailSegment5",
				CubeListBuilder.create().texOffs(102, 98).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 60).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftMiddleTailSegment6 = LeftMiddleTailSegment5.addOrReplaceChild("LeftMiddleTailSegment6",
				CubeListBuilder.create().texOffs(74, 73).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 20).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftMiddleTailSegment7 = LeftMiddleTailSegment6.addOrReplaceChild("LeftMiddleTailSegment7",
				CubeListBuilder.create().texOffs(57, 71).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 10).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition LeftMiddleTailSegment8 = LeftMiddleTailSegment7.addOrReplaceChild("LeftMiddleTailSegment8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(19, 71).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftMiddleTailSegment9 = LeftMiddleTailSegment8.addOrReplaceChild("LeftMiddleTailSegment9",
				CubeListBuilder.create().texOffs(99, 10).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 123).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftMiddleTailSegment10 = LeftMiddleTailSegment9.addOrReplaceChild("LeftMiddleTailSegment10",
				CubeListBuilder.create().texOffs(101, 68).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(108, 50).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftMiddleTailSegment11 = LeftMiddleTailSegment10.addOrReplaceChild("LeftMiddleTailSegment11", CubeListBuilder.create().texOffs(38, 61).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
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
			this.animate(animationInterface.getRizeIdleSixAnimationState(), RizeRinkakuSixAnimations.RizeIdleSix, pAgeInTicks);
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
