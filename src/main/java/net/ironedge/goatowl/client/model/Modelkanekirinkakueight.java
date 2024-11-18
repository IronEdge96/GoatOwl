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

import net.ironedge.goatowl.KanekiRinkakuEightAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelkanekirinkakueight<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelkanekirinkakueight"), "main");
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
	public final ModelPart RightTopTailSegment12;
	public final ModelPart RightTopTailSegment13;
	public final ModelPart RightTopTailSegment14;
	public final ModelPart RightTopTailSegment15;
	public final ModelPart RightTopTailSegment16;
	public final ModelPart RightTopTailSegment17;
	public final ModelPart RightTopTailSegment18;
	public final ModelPart RightTopTailSegment19;
	public final ModelPart RightTopTailSegment20;
	public final ModelPart RightTopTailSegment21;
	public final ModelPart RightTopTailSegment22;
	public final ModelPart Tail6;
	public final ModelPart LeftTopTailSegment12;
	public final ModelPart LeftTopTailSegment13;
	public final ModelPart LeftTopTailSegment14;
	public final ModelPart LeftTopTailSegment15;
	public final ModelPart LeftTopTailSegment16;
	public final ModelPart LeftTopTailSegment17;
	public final ModelPart LeftTopTailSegment18;
	public final ModelPart LeftTopTailSegment19;
	public final ModelPart LeftTopTailSegment20;
	public final ModelPart LeftTopTailSegment21;
	public final ModelPart LeftTopTailSegment22;
	public final ModelPart Tail7;
	public final ModelPart RightBottomTailSegment12;
	public final ModelPart RightBottomTailSegment13;
	public final ModelPart RightBottomTailSegment14;
	public final ModelPart RightBottomTailSegment15;
	public final ModelPart RightBottomTailSegment16;
	public final ModelPart RightBottomTailSegment17;
	public final ModelPart RightBottomTailSegment18;
	public final ModelPart RightBottomTailSegment19;
	public final ModelPart RightBottomTailSegment20;
	public final ModelPart RightBottomTailSegment21;
	public final ModelPart RightBottomTailSegment22;
	public final ModelPart Tail8;
	public final ModelPart LeftBottomTailSegment12;
	public final ModelPart LeftBottomTailSegment13;
	public final ModelPart LeftBottomTailSegment14;
	public final ModelPart LeftBottomTailSegment15;
	public final ModelPart LeftBottomTailSegment16;
	public final ModelPart LeftBottomTailSegment17;
	public final ModelPart LeftBottomTailSegment18;
	public final ModelPart LeftBottomTailSegment19;
	public final ModelPart LeftBottomTailSegment20;
	public final ModelPart LeftBottomTailSegment21;
	public final ModelPart LeftBottomTailSegment22;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelkanekirinkakueight(ModelPart root) {
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
		this.RightTopTailSegment12 = this.Tail5.getChild("RightTopTailSegment12");
		this.RightTopTailSegment13 = this.RightTopTailSegment12.getChild("RightTopTailSegment13");
		this.RightTopTailSegment14 = this.RightTopTailSegment13.getChild("RightTopTailSegment14");
		this.RightTopTailSegment15 = this.RightTopTailSegment14.getChild("RightTopTailSegment15");
		this.RightTopTailSegment16 = this.RightTopTailSegment15.getChild("RightTopTailSegment16");
		this.RightTopTailSegment17 = this.RightTopTailSegment16.getChild("RightTopTailSegment17");
		this.RightTopTailSegment18 = this.RightTopTailSegment17.getChild("RightTopTailSegment18");
		this.RightTopTailSegment19 = this.RightTopTailSegment18.getChild("RightTopTailSegment19");
		this.RightTopTailSegment20 = this.RightTopTailSegment19.getChild("RightTopTailSegment20");
		this.RightTopTailSegment21 = this.RightTopTailSegment20.getChild("RightTopTailSegment21");
		this.RightTopTailSegment22 = this.RightTopTailSegment21.getChild("RightTopTailSegment22");
		this.Tail6 = this.Tails.getChild("Tail6");
		this.LeftTopTailSegment12 = this.Tail6.getChild("LeftTopTailSegment12");
		this.LeftTopTailSegment13 = this.LeftTopTailSegment12.getChild("LeftTopTailSegment13");
		this.LeftTopTailSegment14 = this.LeftTopTailSegment13.getChild("LeftTopTailSegment14");
		this.LeftTopTailSegment15 = this.LeftTopTailSegment14.getChild("LeftTopTailSegment15");
		this.LeftTopTailSegment16 = this.LeftTopTailSegment15.getChild("LeftTopTailSegment16");
		this.LeftTopTailSegment17 = this.LeftTopTailSegment16.getChild("LeftTopTailSegment17");
		this.LeftTopTailSegment18 = this.LeftTopTailSegment17.getChild("LeftTopTailSegment18");
		this.LeftTopTailSegment19 = this.LeftTopTailSegment18.getChild("LeftTopTailSegment19");
		this.LeftTopTailSegment20 = this.LeftTopTailSegment19.getChild("LeftTopTailSegment20");
		this.LeftTopTailSegment21 = this.LeftTopTailSegment20.getChild("LeftTopTailSegment21");
		this.LeftTopTailSegment22 = this.LeftTopTailSegment21.getChild("LeftTopTailSegment22");
		this.Tail7 = this.Tails.getChild("Tail7");
		this.RightBottomTailSegment12 = this.Tail7.getChild("RightBottomTailSegment12");
		this.RightBottomTailSegment13 = this.RightBottomTailSegment12.getChild("RightBottomTailSegment13");
		this.RightBottomTailSegment14 = this.RightBottomTailSegment13.getChild("RightBottomTailSegment14");
		this.RightBottomTailSegment15 = this.RightBottomTailSegment14.getChild("RightBottomTailSegment15");
		this.RightBottomTailSegment16 = this.RightBottomTailSegment15.getChild("RightBottomTailSegment16");
		this.RightBottomTailSegment17 = this.RightBottomTailSegment16.getChild("RightBottomTailSegment17");
		this.RightBottomTailSegment18 = this.RightBottomTailSegment17.getChild("RightBottomTailSegment18");
		this.RightBottomTailSegment19 = this.RightBottomTailSegment18.getChild("RightBottomTailSegment19");
		this.RightBottomTailSegment20 = this.RightBottomTailSegment19.getChild("RightBottomTailSegment20");
		this.RightBottomTailSegment21 = this.RightBottomTailSegment20.getChild("RightBottomTailSegment21");
		this.RightBottomTailSegment22 = this.RightBottomTailSegment21.getChild("RightBottomTailSegment22");
		this.Tail8 = this.Tails.getChild("Tail8");
		this.LeftBottomTailSegment12 = this.Tail8.getChild("LeftBottomTailSegment12");
		this.LeftBottomTailSegment13 = this.LeftBottomTailSegment12.getChild("LeftBottomTailSegment13");
		this.LeftBottomTailSegment14 = this.LeftBottomTailSegment13.getChild("LeftBottomTailSegment14");
		this.LeftBottomTailSegment15 = this.LeftBottomTailSegment14.getChild("LeftBottomTailSegment15");
		this.LeftBottomTailSegment16 = this.LeftBottomTailSegment15.getChild("LeftBottomTailSegment16");
		this.LeftBottomTailSegment17 = this.LeftBottomTailSegment16.getChild("LeftBottomTailSegment17");
		this.LeftBottomTailSegment18 = this.LeftBottomTailSegment17.getChild("LeftBottomTailSegment18");
		this.LeftBottomTailSegment19 = this.LeftBottomTailSegment18.getChild("LeftBottomTailSegment19");
		this.LeftBottomTailSegment20 = this.LeftBottomTailSegment19.getChild("LeftBottomTailSegment20");
		this.LeftBottomTailSegment21 = this.LeftBottomTailSegment20.getChild("LeftBottomTailSegment21");
		this.LeftBottomTailSegment22 = this.LeftBottomTailSegment21.getChild("LeftBottomTailSegment22");
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
				CubeListBuilder.create().texOffs(130, 93).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.25F)).texOffs(116, 31).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition RightTopTailSegment3 = RightTopTailSegment2.addOrReplaceChild("RightTopTailSegment3",
				CubeListBuilder.create().texOffs(100, 0).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(101, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition RightTopTailSegment4 = RightTopTailSegment3.addOrReplaceChild("RightTopTailSegment4",
				CubeListBuilder.create().texOffs(40, 70).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(16, 114).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment5 = RightTopTailSegment4.addOrReplaceChild("RightTopTailSegment5",
				CubeListBuilder.create().texOffs(33, 112).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(2, 70).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment6 = RightTopTailSegment5.addOrReplaceChild("RightTopTailSegment6",
				CubeListBuilder.create().texOffs(93, 75).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(24, 51).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment7 = RightTopTailSegment6.addOrReplaceChild("RightTopTailSegment7",
				CubeListBuilder.create().texOffs(36, 91).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(45, 50).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition RightTopTailSegment8 = RightTopTailSegment7.addOrReplaceChild("RightTopTailSegment8",
				CubeListBuilder.create().texOffs(3, 50).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(2, 91).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment9 = RightTopTailSegment8.addOrReplaceChild("RightTopTailSegment9",
				CubeListBuilder.create().texOffs(35, 102).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(13, 125).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.7F));
		PartDefinition RightTopTailSegment10 = RightTopTailSegment9.addOrReplaceChild("RightTopTailSegment10",
				CubeListBuilder.create().texOffs(126, 111).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(102, 133).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment11 = RightTopTailSegment10.addOrReplaceChild("RightTopTailSegment11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition cube_r1 = RightTopTailSegment11.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.9987F, 0.2854F, -0.2657F, 0.1685F, -0.0456F));
		PartDefinition cube_r2 = RightTopTailSegment11.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.5041F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0785F, 4.2706F, 0.4472F, 0.2399F, 0.0455F));
		PartDefinition cube_r3 = RightTopTailSegment11.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.489F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0785F, 4.2706F, 0.6253F, 0.2244F, 0.0722F));
		PartDefinition cube_r4 = RightTopTailSegment11.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(92, 135).addBox(-0.511F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0382F, 4.2853F, 0.6253F, -0.2244F, -0.0722F));
		PartDefinition cube_r5 = RightTopTailSegment11.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(92, 135).addBox(-0.4959F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0382F, 4.2853F, 0.4472F, -0.2399F, -0.0455F));
		PartDefinition cube_r6 = RightTopTailSegment11.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.9987F, 0.2854F, -0.2657F, -0.1685F, 0.0456F));
		PartDefinition cube_r7 = RightTopTailSegment11.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.3072F, 0.537F, -0.4422F, 0.158F, -0.0744F));
		PartDefinition cube_r8 = RightTopTailSegment11.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.3072F, 0.537F, -0.4422F, -0.158F, 0.0744F));
		PartDefinition Tail2 = Tails.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offset(1.45F, 0.3087F, 0.1863F));
		PartDefinition LeftTopTailSegment = Tail2.addOrReplaceChild("LeftTopTailSegment", CubeListBuilder.create(), PartPose.offset(0.075F, 0.0F, 0.0F));
		PartDefinition LeftTopTailSegment2 = LeftTopTailSegment.addOrReplaceChild("LeftTopTailSegment2", CubeListBuilder.create().texOffs(130, 93).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.25F)).mirror(false)
				.texOffs(116, 31).mirror().addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.025F, 0.0F, 0.0F));
		PartDefinition LeftTopTailSegment3 = LeftTopTailSegment2.addOrReplaceChild("LeftTopTailSegment3", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 122).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition LeftTopTailSegment4 = LeftTopTailSegment3.addOrReplaceChild("LeftTopTailSegment4", CubeListBuilder.create().texOffs(40, 70).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 114).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment5 = LeftTopTailSegment4.addOrReplaceChild("LeftTopTailSegment5", CubeListBuilder.create().texOffs(33, 112).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(2, 70).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment6 = LeftTopTailSegment5.addOrReplaceChild("LeftTopTailSegment6", CubeListBuilder.create().texOffs(93, 75).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 51).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment7 = LeftTopTailSegment6.addOrReplaceChild("LeftTopTailSegment7", CubeListBuilder.create().texOffs(36, 91).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 50).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition LeftTopTailSegment8 = LeftTopTailSegment7.addOrReplaceChild("LeftTopTailSegment8", CubeListBuilder.create().texOffs(3, 50).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(2, 91).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment9 = LeftTopTailSegment8.addOrReplaceChild("LeftTopTailSegment9", CubeListBuilder.create().texOffs(35, 102).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 125).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.7F));
		PartDefinition LeftTopTailSegment10 = LeftTopTailSegment9.addOrReplaceChild("LeftTopTailSegment10",
				CubeListBuilder.create().texOffs(126, 111).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(102, 133).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment11 = LeftTopTailSegment10.addOrReplaceChild("LeftTopTailSegment11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition cube_r9 = LeftTopTailSegment11.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.9987F, 0.2854F, -0.2657F, -0.1685F, 0.0456F));
		PartDefinition cube_r10 = LeftTopTailSegment11.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(92, 135).addBox(-0.4959F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0785F, 4.2706F, 0.4472F, -0.2399F, -0.0455F));
		PartDefinition cube_r11 = LeftTopTailSegment11.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(92, 135).addBox(-0.511F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0785F, 4.2706F, 0.6253F, -0.2244F, -0.0722F));
		PartDefinition cube_r12 = LeftTopTailSegment11.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.489F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0382F, 4.2853F, 0.6253F, 0.2244F, 0.0722F));
		PartDefinition cube_r13 = LeftTopTailSegment11.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.5041F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0382F, 4.2853F, 0.4472F, 0.2399F, 0.0455F));
		PartDefinition cube_r14 = LeftTopTailSegment11.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.9987F, 0.2854F, -0.2657F, 0.1685F, -0.0456F));
		PartDefinition cube_r15 = LeftTopTailSegment11.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.3072F, 0.537F, -0.4422F, -0.158F, 0.0744F));
		PartDefinition cube_r16 = LeftTopTailSegment11.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.3072F, 0.537F, -0.4422F, 0.158F, -0.0744F));
		PartDefinition Tail3 = Tails.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offset(-1.45F, 0.3087F, 0.1863F));
		PartDefinition RightBottomTailSegment = Tail3.addOrReplaceChild("RightBottomTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition RightBottomTailSegment2 = RightBottomTailSegment.addOrReplaceChild("RightBottomTailSegment2",
				CubeListBuilder.create().texOffs(130, 82).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.25F)).texOffs(116, 21).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition RightBottomTailSegment3 = RightBottomTailSegment2.addOrReplaceChild("RightBottomTailSegment3",
				CubeListBuilder.create().texOffs(86, 97).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(88, 120).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition RightBottomTailSegment4 = RightBottomTailSegment3.addOrReplaceChild("RightBottomTailSegment4",
				CubeListBuilder.create().texOffs(65, 51).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(1, 112).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment5 = RightBottomTailSegment4.addOrReplaceChild("RightBottomTailSegment5",
				CubeListBuilder.create().texOffs(112, 111).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(65, 41).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment6 = RightBottomTailSegment5.addOrReplaceChild("RightBottomTailSegment6",
				CubeListBuilder.create().texOffs(89, 86).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(45, 40).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment7 = RightBottomTailSegment6.addOrReplaceChild("RightBottomTailSegment7",
				CubeListBuilder.create().texOffs(72, 84).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(45, 30).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.8F));
		PartDefinition RightBottomTailSegment8 = RightBottomTailSegment7.addOrReplaceChild("RightBottomTailSegment8",
				CubeListBuilder.create().texOffs(45, 20).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(55, 82).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment9 = RightBottomTailSegment8.addOrReplaceChild("RightBottomTailSegment9",
				CubeListBuilder.create().texOffs(1, 102).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(123, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.9F));
		PartDefinition RightBottomTailSegment10 = RightBottomTailSegment9.addOrReplaceChild("RightBottomTailSegment10",
				CubeListBuilder.create().texOffs(102, 133).mirror().addBox(-0.5F, -1.0F, -0.65F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(126, 111).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment11 = RightBottomTailSegment10.addOrReplaceChild("RightBottomTailSegment11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition cube_r17 = RightBottomTailSegment11.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.5041F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0785F, 4.0206F, 0.4472F, 0.2399F, 0.0455F));
		PartDefinition cube_r18 = RightBottomTailSegment11.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.489F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0785F, 4.0206F, 0.6253F, 0.2244F, 0.0722F));
		PartDefinition cube_r19 = RightBottomTailSegment11.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(92, 135).addBox(-0.511F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0382F, 4.0353F, 0.6253F, -0.2244F, -0.0722F));
		PartDefinition cube_r20 = RightBottomTailSegment11.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(92, 135).addBox(-0.4959F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0382F, 4.0353F, 0.4472F, -0.2399F, -0.0455F));
		PartDefinition cube_r21 = RightBottomTailSegment11.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.9987F, 0.0354F, -0.2657F, -0.1685F, 0.0456F));
		PartDefinition cube_r22 = RightBottomTailSegment11.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.9987F, 0.0354F, -0.2657F, 0.1685F, -0.0456F));
		PartDefinition cube_r23 = RightBottomTailSegment11.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.3072F, 0.287F, -0.4422F, 0.158F, -0.0744F));
		PartDefinition cube_r24 = RightBottomTailSegment11.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.3072F, 0.287F, -0.4422F, -0.158F, 0.0744F));
		PartDefinition Tail4 = Tails.addOrReplaceChild("Tail4", CubeListBuilder.create(), PartPose.offset(1.45F, 0.3087F, 0.1863F));
		PartDefinition LeftBottomTailSegment = Tail4.addOrReplaceChild("LeftBottomTailSegment", CubeListBuilder.create(), PartPose.offset(0.075F, 0.0F, 0.0F));
		PartDefinition LeftBottomTailSegment2 = LeftBottomTailSegment.addOrReplaceChild("LeftBottomTailSegment2", CubeListBuilder.create().texOffs(130, 82).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.25F))
				.mirror(false).texOffs(116, 21).mirror().addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.025F, 0.0F, 0.0F));
		PartDefinition LeftBottomTailSegment3 = LeftBottomTailSegment2.addOrReplaceChild("LeftBottomTailSegment3", CubeListBuilder.create().texOffs(86, 97).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(88, 120).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition LeftBottomTailSegment4 = LeftBottomTailSegment3.addOrReplaceChild("LeftBottomTailSegment4", CubeListBuilder.create().texOffs(65, 51).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(1, 112).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment5 = LeftBottomTailSegment4.addOrReplaceChild("LeftBottomTailSegment5", CubeListBuilder.create().texOffs(112, 111).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(65, 41).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment6 = LeftBottomTailSegment5.addOrReplaceChild("LeftBottomTailSegment6", CubeListBuilder.create().texOffs(89, 86).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(45, 40).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment7 = LeftBottomTailSegment6.addOrReplaceChild("LeftBottomTailSegment7", CubeListBuilder.create().texOffs(72, 84).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(45, 30).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.8F));
		PartDefinition LeftBottomTailSegment8 = LeftBottomTailSegment7.addOrReplaceChild("LeftBottomTailSegment8", CubeListBuilder.create().texOffs(45, 20).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(55, 82).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment9 = LeftBottomTailSegment8.addOrReplaceChild("LeftBottomTailSegment9", CubeListBuilder.create().texOffs(1, 102).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(123, 122).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.9F));
		PartDefinition LeftBottomTailSegment10 = LeftBottomTailSegment9.addOrReplaceChild("LeftBottomTailSegment10",
				CubeListBuilder.create().texOffs(102, 133).addBox(-0.5F, -1.0F, -0.65F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(126, 111).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment11 = LeftBottomTailSegment10.addOrReplaceChild("LeftBottomTailSegment11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition cube_r25 = LeftBottomTailSegment11.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(92, 135).addBox(-0.4959F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0785F, 4.0206F, 0.4472F, -0.2399F, -0.0455F));
		PartDefinition cube_r26 = LeftBottomTailSegment11.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(92, 135).addBox(-0.511F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0785F, 4.0206F, 0.6253F, -0.2244F, -0.0722F));
		PartDefinition cube_r27 = LeftBottomTailSegment11.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.489F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0382F, 4.0353F, 0.6253F, 0.2244F, 0.0722F));
		PartDefinition cube_r28 = LeftBottomTailSegment11.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.5041F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0382F, 4.0353F, 0.4472F, 0.2399F, 0.0455F));
		PartDefinition cube_r29 = LeftBottomTailSegment11.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.9987F, 0.0354F, -0.2657F, 0.1685F, -0.0456F));
		PartDefinition cube_r30 = LeftBottomTailSegment11.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.9987F, 0.0354F, -0.2657F, -0.1685F, 0.0456F));
		PartDefinition cube_r31 = LeftBottomTailSegment11.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.3072F, 0.287F, -0.4422F, -0.158F, 0.0744F));
		PartDefinition cube_r32 = LeftBottomTailSegment11.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.3072F, 0.287F, -0.4422F, 0.158F, -0.0744F));
		PartDefinition Tail5 = Tails.addOrReplaceChild("Tail5", CubeListBuilder.create(), PartPose.offset(-1.45F, 0.3087F, 0.1863F));
		PartDefinition RightTopTailSegment12 = Tail5.addOrReplaceChild("RightTopTailSegment12", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition RightTopTailSegment13 = RightTopTailSegment12.addOrReplaceChild("RightTopTailSegment13",
				CubeListBuilder.create().texOffs(130, 93).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.25F)).texOffs(116, 31).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition RightTopTailSegment14 = RightTopTailSegment13.addOrReplaceChild("RightTopTailSegment14",
				CubeListBuilder.create().texOffs(100, 0).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(101, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition RightTopTailSegment15 = RightTopTailSegment14.addOrReplaceChild("RightTopTailSegment15",
				CubeListBuilder.create().texOffs(40, 70).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(16, 114).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment16 = RightTopTailSegment15.addOrReplaceChild("RightTopTailSegment16",
				CubeListBuilder.create().texOffs(33, 112).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(2, 70).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment17 = RightTopTailSegment16.addOrReplaceChild("RightTopTailSegment17",
				CubeListBuilder.create().texOffs(93, 75).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(24, 51).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment18 = RightTopTailSegment17.addOrReplaceChild("RightTopTailSegment18",
				CubeListBuilder.create().texOffs(36, 91).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(45, 50).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition RightTopTailSegment19 = RightTopTailSegment18.addOrReplaceChild("RightTopTailSegment19",
				CubeListBuilder.create().texOffs(3, 50).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(2, 91).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment20 = RightTopTailSegment19.addOrReplaceChild("RightTopTailSegment20",
				CubeListBuilder.create().texOffs(35, 102).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(13, 125).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.7F));
		PartDefinition RightTopTailSegment21 = RightTopTailSegment20.addOrReplaceChild("RightTopTailSegment21",
				CubeListBuilder.create().texOffs(126, 111).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(102, 133).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightTopTailSegment22 = RightTopTailSegment21.addOrReplaceChild("RightTopTailSegment22", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition cube_r33 = RightTopTailSegment22.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.9987F, 0.2854F, -0.2657F, 0.1685F, -0.0456F));
		PartDefinition cube_r34 = RightTopTailSegment22.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.5041F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0785F, 4.2706F, 0.4472F, 0.2399F, 0.0455F));
		PartDefinition cube_r35 = RightTopTailSegment22.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.489F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0785F, 4.2706F, 0.6253F, 0.2244F, 0.0722F));
		PartDefinition cube_r36 = RightTopTailSegment22.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(92, 135).addBox(-0.511F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0382F, 4.2853F, 0.6253F, -0.2244F, -0.0722F));
		PartDefinition cube_r37 = RightTopTailSegment22.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(92, 135).addBox(-0.4959F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0382F, 4.2853F, 0.4472F, -0.2399F, -0.0455F));
		PartDefinition cube_r38 = RightTopTailSegment22.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.9987F, 0.2854F, -0.2657F, -0.1685F, 0.0456F));
		PartDefinition cube_r39 = RightTopTailSegment22.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.3072F, 0.537F, -0.4422F, 0.158F, -0.0744F));
		PartDefinition cube_r40 = RightTopTailSegment22.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.3072F, 0.537F, -0.4422F, -0.158F, 0.0744F));
		PartDefinition Tail6 = Tails.addOrReplaceChild("Tail6", CubeListBuilder.create(), PartPose.offset(1.45F, 0.3087F, 0.1863F));
		PartDefinition LeftTopTailSegment12 = Tail6.addOrReplaceChild("LeftTopTailSegment12", CubeListBuilder.create(), PartPose.offset(0.075F, 0.0F, 0.0F));
		PartDefinition LeftTopTailSegment13 = LeftTopTailSegment12.addOrReplaceChild("LeftTopTailSegment13", CubeListBuilder.create().texOffs(130, 93).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.25F)).mirror(false)
				.texOffs(116, 31).mirror().addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.025F, 0.0F, 0.0F));
		PartDefinition LeftTopTailSegment14 = LeftTopTailSegment13.addOrReplaceChild("LeftTopTailSegment14", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(101, 122).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition LeftTopTailSegment15 = LeftTopTailSegment14.addOrReplaceChild("LeftTopTailSegment15", CubeListBuilder.create().texOffs(40, 70).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 114).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment16 = LeftTopTailSegment15.addOrReplaceChild("LeftTopTailSegment16", CubeListBuilder.create().texOffs(33, 112).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(2, 70).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment17 = LeftTopTailSegment16.addOrReplaceChild("LeftTopTailSegment17", CubeListBuilder.create().texOffs(93, 75).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 51).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment18 = LeftTopTailSegment17.addOrReplaceChild("LeftTopTailSegment18", CubeListBuilder.create().texOffs(36, 91).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(45, 50).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition LeftTopTailSegment19 = LeftTopTailSegment18.addOrReplaceChild("LeftTopTailSegment19", CubeListBuilder.create().texOffs(3, 50).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(2, 91).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment20 = LeftTopTailSegment19.addOrReplaceChild("LeftTopTailSegment20", CubeListBuilder.create().texOffs(35, 102).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 125).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.7F));
		PartDefinition LeftTopTailSegment21 = LeftTopTailSegment20.addOrReplaceChild("LeftTopTailSegment21",
				CubeListBuilder.create().texOffs(126, 111).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(102, 133).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTopTailSegment22 = LeftTopTailSegment21.addOrReplaceChild("LeftTopTailSegment22", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition cube_r41 = LeftTopTailSegment22.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.9987F, 0.2854F, -0.2657F, -0.1685F, 0.0456F));
		PartDefinition cube_r42 = LeftTopTailSegment22.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(92, 135).addBox(-0.4959F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0785F, 4.2706F, 0.4472F, -0.2399F, -0.0455F));
		PartDefinition cube_r43 = LeftTopTailSegment22.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(92, 135).addBox(-0.511F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0785F, 4.2706F, 0.6253F, -0.2244F, -0.0722F));
		PartDefinition cube_r44 = LeftTopTailSegment22.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.489F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0382F, 4.2853F, 0.6253F, 0.2244F, 0.0722F));
		PartDefinition cube_r45 = LeftTopTailSegment22.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.5041F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0382F, 4.2853F, 0.4472F, 0.2399F, 0.0455F));
		PartDefinition cube_r46 = LeftTopTailSegment22.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.9987F, 0.2854F, -0.2657F, 0.1685F, -0.0456F));
		PartDefinition cube_r47 = LeftTopTailSegment22.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.3072F, 0.537F, -0.4422F, -0.158F, 0.0744F));
		PartDefinition cube_r48 = LeftTopTailSegment22.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.3072F, 0.537F, -0.4422F, 0.158F, -0.0744F));
		PartDefinition Tail7 = Tails.addOrReplaceChild("Tail7", CubeListBuilder.create(), PartPose.offset(-1.45F, 0.3087F, 0.1863F));
		PartDefinition RightBottomTailSegment12 = Tail7.addOrReplaceChild("RightBottomTailSegment12", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition RightBottomTailSegment13 = RightBottomTailSegment12.addOrReplaceChild("RightBottomTailSegment13",
				CubeListBuilder.create().texOffs(130, 82).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.25F)).texOffs(116, 21).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition RightBottomTailSegment14 = RightBottomTailSegment13.addOrReplaceChild("RightBottomTailSegment14",
				CubeListBuilder.create().texOffs(86, 97).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(88, 120).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition RightBottomTailSegment15 = RightBottomTailSegment14.addOrReplaceChild("RightBottomTailSegment15",
				CubeListBuilder.create().texOffs(65, 51).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(1, 112).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment16 = RightBottomTailSegment15.addOrReplaceChild("RightBottomTailSegment16",
				CubeListBuilder.create().texOffs(112, 111).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(65, 41).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment17 = RightBottomTailSegment16.addOrReplaceChild("RightBottomTailSegment17",
				CubeListBuilder.create().texOffs(89, 86).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(45, 40).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment18 = RightBottomTailSegment17.addOrReplaceChild("RightBottomTailSegment18",
				CubeListBuilder.create().texOffs(72, 84).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(45, 30).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.8F));
		PartDefinition RightBottomTailSegment19 = RightBottomTailSegment18.addOrReplaceChild("RightBottomTailSegment19",
				CubeListBuilder.create().texOffs(45, 20).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(55, 82).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment20 = RightBottomTailSegment19.addOrReplaceChild("RightBottomTailSegment20",
				CubeListBuilder.create().texOffs(1, 102).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(123, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.9F));
		PartDefinition RightBottomTailSegment21 = RightBottomTailSegment20.addOrReplaceChild("RightBottomTailSegment21",
				CubeListBuilder.create().texOffs(102, 133).mirror().addBox(-0.5F, -1.0F, -0.65F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(126, 111).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition RightBottomTailSegment22 = RightBottomTailSegment21.addOrReplaceChild("RightBottomTailSegment22", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition cube_r49 = RightBottomTailSegment22.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.5041F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0785F, 4.0206F, 0.4472F, 0.2399F, 0.0455F));
		PartDefinition cube_r50 = RightBottomTailSegment22.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.489F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0785F, 4.0206F, 0.6253F, 0.2244F, 0.0722F));
		PartDefinition cube_r51 = RightBottomTailSegment22.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(92, 135).addBox(-0.511F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0382F, 4.0353F, 0.6253F, -0.2244F, -0.0722F));
		PartDefinition cube_r52 = RightBottomTailSegment22.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(92, 135).addBox(-0.4959F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0382F, 4.0353F, 0.4472F, -0.2399F, -0.0455F));
		PartDefinition cube_r53 = RightBottomTailSegment22.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.9987F, 0.0354F, -0.2657F, -0.1685F, 0.0456F));
		PartDefinition cube_r54 = RightBottomTailSegment22.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.9987F, 0.0354F, -0.2657F, 0.1685F, -0.0456F));
		PartDefinition cube_r55 = RightBottomTailSegment22.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.3072F, 0.287F, -0.4422F, 0.158F, -0.0744F));
		PartDefinition cube_r56 = RightBottomTailSegment22.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.3072F, 0.287F, -0.4422F, -0.158F, 0.0744F));
		PartDefinition Tail8 = Tails.addOrReplaceChild("Tail8", CubeListBuilder.create(), PartPose.offset(1.45F, 0.3087F, 0.1863F));
		PartDefinition LeftBottomTailSegment12 = Tail8.addOrReplaceChild("LeftBottomTailSegment12", CubeListBuilder.create(), PartPose.offset(0.075F, 0.0F, 0.0F));
		PartDefinition LeftBottomTailSegment13 = LeftBottomTailSegment12.addOrReplaceChild("LeftBottomTailSegment13", CubeListBuilder.create().texOffs(130, 82).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.25F))
				.mirror(false).texOffs(116, 21).mirror().addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.025F, 0.0F, 0.0F));
		PartDefinition LeftBottomTailSegment14 = LeftBottomTailSegment13.addOrReplaceChild("LeftBottomTailSegment14", CubeListBuilder.create().texOffs(86, 97).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(88, 120).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition LeftBottomTailSegment15 = LeftBottomTailSegment14.addOrReplaceChild("LeftBottomTailSegment15", CubeListBuilder.create().texOffs(65, 51).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(1, 112).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment16 = LeftBottomTailSegment15.addOrReplaceChild("LeftBottomTailSegment16", CubeListBuilder.create().texOffs(112, 111).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(65, 41).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment17 = LeftBottomTailSegment16.addOrReplaceChild("LeftBottomTailSegment17", CubeListBuilder.create().texOffs(89, 86).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(45, 40).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment18 = LeftBottomTailSegment17.addOrReplaceChild("LeftBottomTailSegment18", CubeListBuilder.create().texOffs(72, 84).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(45, 30).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.8F));
		PartDefinition LeftBottomTailSegment19 = LeftBottomTailSegment18.addOrReplaceChild("LeftBottomTailSegment19", CubeListBuilder.create().texOffs(45, 20).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(55, 82).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment20 = LeftBottomTailSegment19.addOrReplaceChild("LeftBottomTailSegment20", CubeListBuilder.create().texOffs(1, 102).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(123, 122).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.9F));
		PartDefinition LeftBottomTailSegment21 = LeftBottomTailSegment20.addOrReplaceChild("LeftBottomTailSegment21",
				CubeListBuilder.create().texOffs(102, 133).addBox(-0.5F, -1.0F, -0.65F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(126, 111).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftBottomTailSegment22 = LeftBottomTailSegment21.addOrReplaceChild("LeftBottomTailSegment22", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition cube_r57 = LeftBottomTailSegment22.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(92, 135).addBox(-0.4959F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0785F, 4.0206F, 0.4472F, -0.2399F, -0.0455F));
		PartDefinition cube_r58 = LeftBottomTailSegment22.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(92, 135).addBox(-0.511F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9447F, 1.0785F, 4.0206F, 0.6253F, -0.2244F, -0.0722F));
		PartDefinition cube_r59 = LeftBottomTailSegment22.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.489F, -0.2762F, -0.5624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0382F, 4.0353F, 0.6253F, 0.2244F, 0.0722F));
		PartDefinition cube_r60 = LeftBottomTailSegment22.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(92, 135).mirror().addBox(-0.5041F, -0.7314F, -0.4769F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9447F, 1.0382F, 4.0353F, 0.4472F, 0.2399F, 0.0455F));
		PartDefinition cube_r61 = LeftBottomTailSegment22.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.9987F, 0.0354F, -0.2657F, 0.1685F, -0.0456F));
		PartDefinition cube_r62 = LeftBottomTailSegment22.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.9987F, 0.0354F, -0.2657F, -0.1685F, 0.0456F));
		PartDefinition cube_r63 = LeftBottomTailSegment22.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1595F, 0.3072F, 0.287F, -0.4422F, -0.158F, 0.0744F));
		PartDefinition cube_r64 = LeftBottomTailSegment22.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1595F, 0.3072F, 0.287F, -0.4422F, 0.158F, -0.0744F));
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
			this.animate(animationInterface.getKanekiIdleEightAnimationState(), KanekiRinkakuEightAnimations.KanekiIdleEight, pAgeInTicks);
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
