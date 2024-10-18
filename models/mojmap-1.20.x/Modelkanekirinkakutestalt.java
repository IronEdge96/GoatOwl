
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

import net.ironedge.goatowl.client.model.Modelkanekirinkakutestalt;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelkanekirinkakutestalt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "kanekirinkakutestalt"), "main");
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Body;
	private final ModelPart Tails;
	private final ModelPart TailA;
	private final ModelPart TopTailSegmentA;
	private final ModelPart TopTailSegmentB;
	private final ModelPart TopTailSegmentC;
	private final ModelPart TopTailSegmentD;
	private final ModelPart TopTailSegmentE;
	private final ModelPart TopTailSegmentF;
	private final ModelPart TopTailSegmentG;
	private final ModelPart TopTailSegmentH;
	private final ModelPart TopTailSegmentI;
	private final ModelPart TopTailSegmentJ;
	private final ModelPart TopTailSegmentK;
	private final ModelPart TailB;
	private final ModelPart MiddleTailSegmentA;
	private final ModelPart MiddleTailSegmentB;
	private final ModelPart MiddleTailSegmentC;
	private final ModelPart MiddleTailSegmentD;
	private final ModelPart MiddleTailSegmentE;
	private final ModelPart MiddleTailSegmentF;
	private final ModelPart MiddleTailSegmentG;
	private final ModelPart MiddleTailSegmentH;
	private final ModelPart MiddleTailSegmentI;
	private final ModelPart MiddleTailSegmentJ;
	private final ModelPart MiddleTailSegmentK;
	private final ModelPart TailC;
	private final ModelPart BottomTailSegmentA;
	private final ModelPart BottomTailSegmentB;
	private final ModelPart BottomTailSegmentC;
	private final ModelPart BottomTailSegmentD;
	private final ModelPart BottomTailSegmentE;
	private final ModelPart BottomTailSegmentF;
	private final ModelPart BottomTailSegmentG;
	private final ModelPart BottomTailSegmentH;
	private final ModelPart BottomTailSegmentI;
	private final ModelPart BottomTailSegmentJ;
	private final ModelPart BottomTailSegmentK;

	public Modelkanekirinkakutestalt(ModelPart root) {
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Body = root.getChild("Body");
		this.Tails = this.Body.getChild("Tails");
		this.TailA = this.Tails.getChild("TailA");
		this.TopTailSegmentA = this.TailA.getChild("TopTailSegmentA");
		this.TopTailSegmentB = this.TopTailSegmentA.getChild("TopTailSegmentB");
		this.TopTailSegmentC = this.TopTailSegmentB.getChild("TopTailSegmentC");
		this.TopTailSegmentD = this.TopTailSegmentC.getChild("TopTailSegmentD");
		this.TopTailSegmentE = this.TopTailSegmentD.getChild("TopTailSegmentE");
		this.TopTailSegmentF = this.TopTailSegmentE.getChild("TopTailSegmentF");
		this.TopTailSegmentG = this.TopTailSegmentF.getChild("TopTailSegmentG");
		this.TopTailSegmentH = this.TopTailSegmentG.getChild("TopTailSegmentH");
		this.TopTailSegmentI = this.TopTailSegmentH.getChild("TopTailSegmentI");
		this.TopTailSegmentJ = this.TopTailSegmentI.getChild("TopTailSegmentJ");
		this.TopTailSegmentK = this.TopTailSegmentJ.getChild("TopTailSegmentK");
		this.TailB = this.Tails.getChild("TailB");
		this.MiddleTailSegmentA = this.TailB.getChild("MiddleTailSegmentA");
		this.MiddleTailSegmentB = this.MiddleTailSegmentA.getChild("MiddleTailSegmentB");
		this.MiddleTailSegmentC = this.MiddleTailSegmentB.getChild("MiddleTailSegmentC");
		this.MiddleTailSegmentD = this.MiddleTailSegmentC.getChild("MiddleTailSegmentD");
		this.MiddleTailSegmentE = this.MiddleTailSegmentD.getChild("MiddleTailSegmentE");
		this.MiddleTailSegmentF = this.MiddleTailSegmentE.getChild("MiddleTailSegmentF");
		this.MiddleTailSegmentG = this.MiddleTailSegmentF.getChild("MiddleTailSegmentG");
		this.MiddleTailSegmentH = this.MiddleTailSegmentG.getChild("MiddleTailSegmentH");
		this.MiddleTailSegmentI = this.MiddleTailSegmentH.getChild("MiddleTailSegmentI");
		this.MiddleTailSegmentJ = this.MiddleTailSegmentI.getChild("MiddleTailSegmentJ");
		this.MiddleTailSegmentK = this.MiddleTailSegmentJ.getChild("MiddleTailSegmentK");
		this.TailC = this.Tails.getChild("TailC");
		this.BottomTailSegmentA = this.TailC.getChild("BottomTailSegmentA");
		this.BottomTailSegmentB = this.BottomTailSegmentA.getChild("BottomTailSegmentB");
		this.BottomTailSegmentC = this.BottomTailSegmentB.getChild("BottomTailSegmentC");
		this.BottomTailSegmentD = this.BottomTailSegmentC.getChild("BottomTailSegmentD");
		this.BottomTailSegmentE = this.BottomTailSegmentD.getChild("BottomTailSegmentE");
		this.BottomTailSegmentF = this.BottomTailSegmentE.getChild("BottomTailSegmentF");
		this.BottomTailSegmentG = this.BottomTailSegmentF.getChild("BottomTailSegmentG");
		this.BottomTailSegmentH = this.BottomTailSegmentG.getChild("BottomTailSegmentH");
		this.BottomTailSegmentI = this.BottomTailSegmentH.getChild("BottomTailSegmentI");
		this.BottomTailSegmentJ = this.BottomTailSegmentI.getChild("BottomTailSegmentJ");
		this.BottomTailSegmentK = this.BottomTailSegmentJ.getChild("BottomTailSegmentK");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Tails = Body.addOrReplaceChild("Tails", CubeListBuilder.create(), PartPose.offset(0.0F, 7.9913F, 2.5387F));
		PartDefinition TailA = Tails.addOrReplaceChild("TailA", CubeListBuilder.create(), PartPose.offset(0.05F, 0.3087F, 0.1863F));
		PartDefinition TopTailSegmentA = TailA.addOrReplaceChild("TopTailSegmentA", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.075F, 0.0F, -0.75F, 0.473F, 0.3453F, -1.4247F));
		PartDefinition cube_r1 = TopTailSegmentA.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 103).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.675F, 0.0F, -0.225F, 0.0325F, 0.05F, 0.1355F));
		PartDefinition cube_r2 = TopTailSegmentA.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(57, 103).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.725F, 0.0F, -0.225F, 0.0325F, -0.05F, -0.1355F));
		PartDefinition cube_r3 = TopTailSegmentA.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(68, 104).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.4488F, 0.0417F, -0.2769F, -0.0417F, 0.0116F, 0.1315F));
		PartDefinition cube_r4 = TopTailSegmentA.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(103, 104).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.3988F, 0.0417F, -0.2769F, -0.0417F, -0.0116F, -0.1315F));
		PartDefinition cube_r5 = TopTailSegmentA.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 108).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.075F, 0.1523F, -1.7311F, 0.0F, -0.0004F, -0.0436F));
		PartDefinition cube_r6 = TopTailSegmentA.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 62).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.525F, -0.0273F, -1.7311F, 0.0086F, -0.0854F, -0.2189F));
		PartDefinition cube_r7 = TopTailSegmentA.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(107, 49).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.575F, 0.0523F, -1.7311F, -0.0086F, -0.0854F, 0.2189F));
		PartDefinition cube_r8 = TopTailSegmentA.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(108, 0).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.625F, 0.0523F, -1.7311F, -0.0086F, 0.0854F, -0.2189F));
		PartDefinition cube_r9 = TopTailSegmentA.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 71).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.575F, -0.0273F, -1.7311F, 0.0086F, 0.0854F, 0.2189F));
		PartDefinition cube_r10 = TopTailSegmentA.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(107, 29).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.075F, -0.1273F, -1.7311F, 0.0F, -0.0004F, 0.0436F));
		PartDefinition TopTailSegmentB = TopTailSegmentA.addOrReplaceChild("TopTailSegmentB", CubeListBuilder.create().texOffs(52, 80).addBox(-1.0F, -1.0F, -0.825F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.025F, -0.25F, 4.5F, -0.0046F, 0.6512F, -0.4346F));
		PartDefinition cube_r11 = TopTailSegmentB.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 0).addBox(-1.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.0668F, 0.1014F, 3.475F, 0.0873F, 0.0698F, 0.2182F));
		PartDefinition cube_r12 = TopTailSegmentB.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(73, 1).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.425F, 3.675F, 0.0262F, 0.0F, 0.1745F));
		PartDefinition cube_r13 = TopTailSegmentB.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(73, 11).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, -0.45F, 3.675F, -0.0262F, 0.0F, -0.1745F));
		PartDefinition cube_r14 = TopTailSegmentB.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(73, 21).addBox(-0.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.1F, 3.525F, -0.0873F, 0.0F, -0.0436F));
		PartDefinition cube_r15 = TopTailSegmentB.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(15, 52).addBox(-0.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0668F, 0.1014F, 3.475F, 0.0873F, -0.0698F, -0.2182F));
		PartDefinition cube_r16 = TopTailSegmentB.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(73, 31).addBox(-1.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.1F, 3.525F, -0.0873F, 0.0F, 0.0436F));
		PartDefinition TopTailSegmentC = TopTailSegmentB.addOrReplaceChild("TopTailSegmentC", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.25F, 8.275F, 0.8152F, 0.1158F, 0.5481F));
		PartDefinition cube_r17 = TopTailSegmentC.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(90, 96).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, 0.0523F, 2.2439F, -0.0085F, 0.0417F, -0.2185F));
		PartDefinition cube_r18 = TopTailSegmentC.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(96, 80).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, 0.1523F, 2.2439F, 0.0F, -0.0004F, -0.0436F));
		PartDefinition cube_r19 = TopTailSegmentC.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(80, 94).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.7F, 0.0523F, 2.2439F, -0.0085F, -0.0417F, 0.2185F));
		PartDefinition cube_r20 = TopTailSegmentC.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(98, 2).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, -0.1273F, 2.2439F, 0.0F, -0.0004F, 0.0436F));
		PartDefinition cube_r21 = TopTailSegmentC.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(34, 93).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.8F, -0.0273F, 2.2439F, 0.0085F, -0.0417F, -0.2185F));
		PartDefinition cube_r22 = TopTailSegmentC.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 93).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, -0.0273F, 2.2439F, 0.0085F, 0.0417F, 0.2185F));
		PartDefinition cube_r23 = TopTailSegmentC.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.4238F, 0.0417F, 3.6981F, -0.0417F, 0.0116F, 0.1315F));
		PartDefinition cube_r24 = TopTailSegmentC.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(30, 30).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, 3.75F, 0.0326F, 0.0808F, -0.1312F));
		PartDefinition cube_r25 = TopTailSegmentC.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(45, 11).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 3.75F, 0.0326F, -0.0808F, 0.1312F));
		PartDefinition cube_r26 = TopTailSegmentC.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(45, 1).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.4238F, 0.0417F, 3.6981F, -0.0417F, -0.0116F, -0.1315F));
		PartDefinition TopTailSegmentD = TopTailSegmentC.addOrReplaceChild("TopTailSegmentD", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.0F, -0.8F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.4F, 0.334F, 0.4988F, -0.0923F));
		PartDefinition cube_r27 = TopTailSegmentD.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(26, 80).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, 0.5F, 3.7F, 0.0175F, -0.0873F, -0.1309F));
		PartDefinition cube_r28 = TopTailSegmentD.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(73, 61).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, 0.5F, 3.7F, 0.0175F, 0.0873F, 0.1309F));
		PartDefinition cube_r29 = TopTailSegmentD.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(73, 41).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, -0.5F, 3.7F, -0.0175F, -0.0873F, 0.1309F));
		PartDefinition cube_r30 = TopTailSegmentD.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(73, 51).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, -0.5F, 3.7F, -0.0175F, 0.0873F, -0.1309F));
		PartDefinition cube_r31 = TopTailSegmentD.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(91, 70).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.8509F, 0.0666F, 3.8946F, -0.0695F, -0.0261F, 0.1314F));
		PartDefinition cube_r32 = TopTailSegmentD.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(15, 32).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.1107F, 0.0076F, 3.8916F, 0.0092F, 0.0446F, -0.0879F));
		PartDefinition cube_r33 = TopTailSegmentD.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(15, 42).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.1107F, 0.0076F, 3.8916F, 0.0092F, -0.0446F, 0.0879F));
		PartDefinition cube_r34 = TopTailSegmentD.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(11, 92).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.8509F, 0.0666F, 3.8946F, -0.0695F, 0.0261F, -0.1314F));
		PartDefinition TopTailSegmentE = TopTailSegmentD.addOrReplaceChild("TopTailSegmentE", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 8.5F, 0.0F, 0.3054F, 0.0F));
		PartDefinition cube_r35 = TopTailSegmentE.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(30, 40).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.8976F, 0.0483F, 0.0298F, -0.1382F));
		PartDefinition cube_r36 = TopTailSegmentE.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.8976F, 0.0483F, -0.0298F, 0.1382F));
		PartDefinition cube_r37 = TopTailSegmentE.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 51).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.7517F, -0.0584F, 0.0145F, 0.0823F));
		PartDefinition cube_r38 = TopTailSegmentE.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(45, 51).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.7517F, -0.0584F, -0.0145F, -0.0823F));
		PartDefinition cube_r39 = TopTailSegmentE.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(22, 90).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.4999F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r40 = TopTailSegmentE.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(39, 71).addBox(-2.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 0.2F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r41 = TopTailSegmentE.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 71).addBox(0.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 0.2F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r42 = TopTailSegmentE.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(86, 60).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.4999F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r43 = TopTailSegmentE.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(67, 71).addBox(-2.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 0.2F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r44 = TopTailSegmentE.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.4999F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r45 = TopTailSegmentE.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(50, 91).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.4999F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r46 = TopTailSegmentE.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(13, 72).addBox(0.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 0.2F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition TopTailSegmentF = TopTailSegmentE.addOrReplaceChild("TopTailSegmentF", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 9.1F, 0.3085F, 0.2301F, 0.0182F));
		PartDefinition cube_r47 = TopTailSegmentF.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(45, 41).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.6517F, -0.0584F, 0.0145F, 0.0823F));
		PartDefinition cube_r48 = TopTailSegmentF.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(30, 10).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.7976F, 0.0483F, 0.0298F, -0.1382F));
		PartDefinition cube_r49 = TopTailSegmentF.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(86, 20).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.3999F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r50 = TopTailSegmentF.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(41, 61).addBox(0.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 0.1F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r51 = TopTailSegmentF.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(13, 62).addBox(-2.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 0.1F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r52 = TopTailSegmentF.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(86, 30).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.3999F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r53 = TopTailSegmentF.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(86, 40).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.3999F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r54 = TopTailSegmentF.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(26, 70).addBox(-2.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 0.1F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r55 = TopTailSegmentF.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(54, 70).addBox(0.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 0.1F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition cube_r56 = TopTailSegmentF.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(86, 50).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.3999F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r57 = TopTailSegmentF.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(30, 20).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.7976F, 0.0483F, -0.0298F, 0.1382F));
		PartDefinition cube_r58 = TopTailSegmentF.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(30, 50).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.6517F, -0.0584F, -0.0145F, -0.0823F));
		PartDefinition TopTailSegmentG = TopTailSegmentF.addOrReplaceChild("TopTailSegmentG", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 8.95F, 0.2303F, 0.3884F, 0.0406F));
		PartDefinition cube_r59 = TopTailSegmentG.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(45, 21).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.7017F, -0.0584F, 0.0145F, 0.0823F));
		PartDefinition cube_r60 = TopTailSegmentG.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(15, 22).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.8476F, 0.0483F, 0.0298F, -0.1382F));
		PartDefinition cube_r61 = TopTailSegmentG.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(74, 83).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.4499F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r62 = TopTailSegmentG.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(60, 40).addBox(0.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 0.15F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r63 = TopTailSegmentG.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(60, 50).addBox(-2.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 0.15F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r64 = TopTailSegmentG.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(85, 84).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.4499F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r65 = TopTailSegmentG.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.4499F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r66 = TopTailSegmentG.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(60, 60).addBox(-2.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 0.15F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r67 = TopTailSegmentG.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 61).addBox(0.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 0.15F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition cube_r68 = TopTailSegmentG.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(86, 10).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.4499F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r69 = TopTailSegmentG.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(30, 0).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.8476F, 0.0483F, -0.0298F, 0.1382F));
		PartDefinition cube_r70 = TopTailSegmentG.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(45, 31).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.7017F, -0.0584F, -0.0145F, -0.0823F));
		PartDefinition TopTailSegmentH = TopTailSegmentG.addOrReplaceChild("TopTailSegmentH", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 9.4F, 0.2225F, 0.215F, 0.0289F));
		PartDefinition cube_r71 = TopTailSegmentH.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 11).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.4983F, 0.0584F, 0.0145F, -0.0823F));
		PartDefinition cube_r72 = TopTailSegmentH.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(15, 12).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.3524F, -0.0483F, 0.0298F, 0.1382F));
		PartDefinition cube_r73 = TopTailSegmentH.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.7501F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r74 = TopTailSegmentH.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(60, 10).addBox(-2.5005F, 0.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 7.05F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition cube_r75 = TopTailSegmentH.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(60, 20).addBox(0.5005F, 0.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 7.05F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r76 = TopTailSegmentH.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(11, 82).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.7501F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r77 = TopTailSegmentH.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(39, 82).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.7501F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r78 = TopTailSegmentH.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(28, 60).addBox(0.5005F, -1.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 7.05F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r79 = TopTailSegmentH.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(60, 30).addBox(-2.5005F, -1.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 7.05F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r80 = TopTailSegmentH.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(63, 82).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.7501F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r81 = TopTailSegmentH.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 21).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.3524F, -0.0483F, -0.0298F, -0.1382F));
		PartDefinition cube_r82 = TopTailSegmentH.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(15, 2).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.4983F, 0.0584F, -0.0145F, 0.0823F));
		PartDefinition TopTailSegmentI = TopTailSegmentH.addOrReplaceChild("TopTailSegmentI", CubeListBuilder.create().texOffs(97, 60).addBox(-1.5F, -1.0F, -0.65F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.95F, 0.2612F, -0.2699F, 0.1488F));
		PartDefinition cube_r83 = TopTailSegmentI.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(97, 12).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.1107F, 0.0076F, 3.6584F, -0.0092F, -0.0446F, -0.0879F));
		PartDefinition cube_r84 = TopTailSegmentI.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(44, 92).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.8509F, 0.0666F, 3.6554F, 0.0695F, 0.0261F, 0.1314F));
		PartDefinition cube_r85 = TopTailSegmentI.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(102, 68).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, 0.5F, 3.85F, -0.0175F, -0.0873F, 0.1309F));
		PartDefinition cube_r86 = TopTailSegmentI.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(20, 103).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, 0.5F, 3.85F, -0.0175F, 0.0873F, -0.1309F));
		PartDefinition cube_r87 = TopTailSegmentI.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(46, 101).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, -0.5F, 3.85F, 0.0175F, 0.0873F, 0.1309F));
		PartDefinition cube_r88 = TopTailSegmentI.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(10, 102).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, -0.5F, 3.85F, 0.0175F, -0.0873F, -0.1309F));
		PartDefinition cube_r89 = TopTailSegmentI.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(100, 90).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.1107F, 0.0076F, 3.6584F, -0.0092F, 0.0446F, 0.0879F));
		PartDefinition cube_r90 = TopTailSegmentI.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(107, 19).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.8509F, 0.0666F, 3.6554F, 0.0695F, -0.0261F, -0.1314F));
		PartDefinition TopTailSegmentJ = TopTailSegmentI.addOrReplaceChild("TopTailSegmentJ", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, 6.4F, -0.2165F, -0.0457F, -0.0189F));
		PartDefinition cube_r91 = TopTailSegmentJ.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(79, 105).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, 2.8F, -0.0326F, -0.0808F, -0.1312F));
		PartDefinition cube_r92 = TopTailSegmentJ.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(106, 75).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.4238F, 0.0417F, 2.8519F, 0.0417F, -0.0116F, 0.1315F));
		PartDefinition cube_r93 = TopTailSegmentJ.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(106, 81).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.4238F, 0.0417F, 2.8519F, 0.0417F, 0.0116F, -0.1315F));
		PartDefinition cube_r94 = TopTailSegmentJ.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.8F, -0.0273F, 4.306F, -0.0085F, 0.0417F, -0.2185F));
		PartDefinition cube_r95 = TopTailSegmentJ.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(42, 108).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.7F, 0.0523F, 4.306F, 0.0085F, 0.0417F, 0.2185F));
		PartDefinition cube_r96 = TopTailSegmentJ.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(10, 109).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, 0.1523F, 4.306F, 0.0F, 0.0004F, -0.0436F));
		PartDefinition cube_r97 = TopTailSegmentJ.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(109, 12).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, 0.0523F, 4.306F, 0.0085F, -0.0417F, -0.2185F));
		PartDefinition cube_r98 = TopTailSegmentJ.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(22, 82).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, -0.0273F, 4.306F, -0.0085F, -0.0417F, 0.2185F));
		PartDefinition cube_r99 = TopTailSegmentJ.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(107, 39).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, -0.1273F, 4.306F, 0.0F, 0.0004F, 0.0436F));
		PartDefinition cube_r100 = TopTailSegmentJ.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(90, 106).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 2.8F, -0.0326F, 0.0808F, 0.1312F));
		PartDefinition TopTailSegmentK = TopTailSegmentJ.addOrReplaceChild("TopTailSegmentK", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1244F, 0.2614F, 4.2924F, -0.2338F, -0.3861F, 0.0605F));
		PartDefinition cube_r101 = TopTailSegmentK.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(100, 97).addBox(-0.7581F, -0.5811F, -3.498F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, 0.1757F, 2.5074F, 0.0863F, -0.0106F, 0.1742F));
		PartDefinition cube_r102 = TopTailSegmentK.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 93).addBox(-0.7523F, -0.4621F, -3.4998F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, 0.1757F, 2.5074F, 0.0611F, 0.0F, 0.0F));
		PartDefinition cube_r103 = TopTailSegmentK.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(54, 61).addBox(-0.7523F, -0.5379F, -3.4998F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, -0.1735F, 2.5074F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r104 = TopTailSegmentK.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 101).addBox(-0.7581F, -0.4189F, -3.498F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, -0.1735F, 2.5074F, -0.0692F, -0.0076F, -0.1744F));
		PartDefinition cube_r105 = TopTailSegmentK.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(97, 20).addBox(-1.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0576F, 0.09F, 1.3076F, -0.038F, 0.1111F, 0.1839F));
		PartDefinition cube_r106 = TopTailSegmentK.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(97, 40).addBox(-1.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.1244F, 0.0886F, 1.2076F, 0.0283F, 0.1316F, 0.0461F));
		PartDefinition cube_r107 = TopTailSegmentK.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(97, 30).addBox(0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.1912F, 0.09F, 1.3076F, -0.038F, -0.1111F, -0.1839F));
		PartDefinition cube_r108 = TopTailSegmentK.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(97, 50).addBox(0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.1244F, 0.0886F, 1.2076F, 0.0283F, -0.1316F, -0.0461F));
		PartDefinition TailB = Tails.addOrReplaceChild("TailB", CubeListBuilder.create(), PartPose.offset(0.05F, 0.3087F, 0.1863F));
		PartDefinition MiddleTailSegmentA = TailB.addOrReplaceChild("MiddleTailSegmentA", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.075F, 0.0F, 0.75F, 0.7298F, 0.1468F, -1.0783F));
		PartDefinition cube_r109 = MiddleTailSegmentA.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(30, 103).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.675F, 0.0F, -0.225F, 0.0325F, 0.05F, 0.1355F));
		PartDefinition cube_r110 = MiddleTailSegmentA.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(57, 103).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.725F, 0.0F, -0.225F, 0.0325F, -0.05F, -0.1355F));
		PartDefinition cube_r111 = MiddleTailSegmentA.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(68, 104).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.4488F, 0.0417F, -0.2769F, -0.0417F, 0.0116F, 0.1315F));
		PartDefinition cube_r112 = MiddleTailSegmentA.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(103, 104).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.3988F, 0.0417F, -0.2769F, -0.0417F, -0.0116F, -0.1315F));
		PartDefinition cube_r113 = MiddleTailSegmentA.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 108).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.075F, 0.1523F, -1.7311F, 0.0F, -0.0004F, -0.0436F));
		PartDefinition cube_r114 = MiddleTailSegmentA.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(26, 62).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.525F, -0.0273F, -1.7311F, 0.0086F, -0.0854F, -0.2189F));
		PartDefinition cube_r115 = MiddleTailSegmentA.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(107, 49).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.575F, 0.0523F, -1.7311F, -0.0086F, -0.0854F, 0.2189F));
		PartDefinition cube_r116 = MiddleTailSegmentA.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(108, 0).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.625F, 0.0523F, -1.7311F, -0.0086F, 0.0854F, -0.2189F));
		PartDefinition cube_r117 = MiddleTailSegmentA.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(52, 71).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.575F, -0.0273F, -1.7311F, 0.0086F, 0.0854F, 0.2189F));
		PartDefinition cube_r118 = MiddleTailSegmentA.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(107, 29).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.075F, -0.1273F, -1.7311F, 0.0F, -0.0004F, 0.0436F));
		PartDefinition MiddleTailSegmentB = MiddleTailSegmentA.addOrReplaceChild("MiddleTailSegmentB", CubeListBuilder.create().texOffs(52, 80).addBox(-1.0F, -1.0F, -0.825F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.025F, -0.5F, 4.5F, 0.5805F, 0.0088F, -0.2537F));
		PartDefinition cube_r119 = MiddleTailSegmentB.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(60, 0).addBox(-1.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.0668F, 0.1014F, 3.475F, 0.0873F, 0.0698F, 0.2182F));
		PartDefinition cube_r120 = MiddleTailSegmentB.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(73, 1).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.425F, 3.675F, 0.0262F, 0.0F, 0.1745F));
		PartDefinition cube_r121 = MiddleTailSegmentB.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(73, 11).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, -0.45F, 3.675F, -0.0262F, 0.0F, -0.1745F));
		PartDefinition cube_r122 = MiddleTailSegmentB.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(73, 21).addBox(-0.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.1F, 3.525F, -0.0873F, 0.0F, -0.0436F));
		PartDefinition cube_r123 = MiddleTailSegmentB.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(15, 52).addBox(-0.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0668F, 0.1014F, 3.475F, 0.0873F, -0.0698F, -0.2182F));
		PartDefinition cube_r124 = MiddleTailSegmentB.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(73, 31).addBox(-1.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.1F, 3.525F, -0.0873F, 0.0F, 0.0436F));
		PartDefinition MiddleTailSegmentC = MiddleTailSegmentB.addOrReplaceChild("MiddleTailSegmentC", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, -0.25F, 8.275F, 0.6149F, 0.1071F, -0.2301F));
		PartDefinition cube_r125 = MiddleTailSegmentC.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(90, 96).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, 0.0523F, 2.2439F, -0.0085F, 0.0417F, -0.2185F));
		PartDefinition cube_r126 = MiddleTailSegmentC.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(96, 80).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, 0.1523F, 2.2439F, 0.0F, -0.0004F, -0.0436F));
		PartDefinition cube_r127 = MiddleTailSegmentC.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(80, 94).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.7F, 0.0523F, 2.2439F, -0.0085F, -0.0417F, 0.2185F));
		PartDefinition cube_r128 = MiddleTailSegmentC.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(98, 2).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, -0.1273F, 2.2439F, 0.0F, -0.0004F, 0.0436F));
		PartDefinition cube_r129 = MiddleTailSegmentC.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(34, 93).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.8F, -0.0273F, 2.2439F, 0.0085F, -0.0417F, -0.2185F));
		PartDefinition cube_r130 = MiddleTailSegmentC.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(62, 93).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, -0.0273F, 2.2439F, 0.0085F, 0.0417F, 0.2185F));
		PartDefinition cube_r131 = MiddleTailSegmentC.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.4238F, 0.0417F, 3.6981F, -0.0417F, 0.0116F, 0.1315F));
		PartDefinition cube_r132 = MiddleTailSegmentC.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(30, 30).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, 3.75F, 0.0326F, 0.0808F, -0.1312F));
		PartDefinition cube_r133 = MiddleTailSegmentC.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(45, 11).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 3.75F, 0.0326F, -0.0808F, 0.1312F));
		PartDefinition cube_r134 = MiddleTailSegmentC.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(45, 1).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.4238F, 0.0417F, 3.6981F, -0.0417F, -0.0116F, -0.1315F));
		PartDefinition MiddleTailSegmentD = MiddleTailSegmentC.addOrReplaceChild("MiddleTailSegmentD", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.0F, -0.8F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 8.4F, 0.7025F, 0.3419F, -0.0288F));
		PartDefinition cube_r135 = MiddleTailSegmentD.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(26, 80).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, 0.5F, 3.7F, 0.0175F, -0.0873F, -0.1309F));
		PartDefinition cube_r136 = MiddleTailSegmentD.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(73, 61).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, 0.5F, 3.7F, 0.0175F, 0.0873F, 0.1309F));
		PartDefinition cube_r137 = MiddleTailSegmentD.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(73, 41).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, -0.5F, 3.7F, -0.0175F, -0.0873F, 0.1309F));
		PartDefinition cube_r138 = MiddleTailSegmentD.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(73, 51).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, -0.5F, 3.7F, -0.0175F, 0.0873F, -0.1309F));
		PartDefinition cube_r139 = MiddleTailSegmentD.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(91, 70).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.8509F, 0.0666F, 3.8946F, -0.0695F, -0.0261F, 0.1314F));
		PartDefinition cube_r140 = MiddleTailSegmentD.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(15, 32).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.1107F, 0.0076F, 3.8916F, 0.0092F, 0.0446F, -0.0879F));
		PartDefinition cube_r141 = MiddleTailSegmentD.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(15, 42).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.1107F, 0.0076F, 3.8916F, 0.0092F, -0.0446F, 0.0879F));
		PartDefinition cube_r142 = MiddleTailSegmentD.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(11, 92).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.8509F, 0.0666F, 3.8946F, -0.0695F, 0.0261F, -0.1314F));
		PartDefinition MiddleTailSegmentE = MiddleTailSegmentD.addOrReplaceChild("MiddleTailSegmentE", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 8.5F, 0.725F, 0.4079F, 0.0325F));
		PartDefinition cube_r143 = MiddleTailSegmentE.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(30, 40).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.8976F, 0.0483F, 0.0298F, -0.1382F));
		PartDefinition cube_r144 = MiddleTailSegmentE.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.8976F, 0.0483F, -0.0298F, 0.1382F));
		PartDefinition cube_r145 = MiddleTailSegmentE.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(0, 51).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.7517F, -0.0584F, 0.0145F, 0.0823F));
		PartDefinition cube_r146 = MiddleTailSegmentE.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(45, 51).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.7517F, -0.0584F, -0.0145F, -0.0823F));
		PartDefinition cube_r147 = MiddleTailSegmentE.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(22, 90).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.4999F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r148 = MiddleTailSegmentE.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(39, 71).addBox(-2.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 0.2F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r149 = MiddleTailSegmentE.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(0, 71).addBox(0.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 0.2F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r150 = MiddleTailSegmentE.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(86, 60).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.4999F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r151 = MiddleTailSegmentE.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(67, 71).addBox(-2.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 0.2F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r152 = MiddleTailSegmentE.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.4999F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r153 = MiddleTailSegmentE.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(50, 91).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.4999F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r154 = MiddleTailSegmentE.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(13, 72).addBox(0.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 0.2F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition MiddleTailSegmentF = MiddleTailSegmentE.addOrReplaceChild("MiddleTailSegmentF", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 9.1F, 0.1922F, 0.4293F, -0.2246F));
		PartDefinition cube_r155 = MiddleTailSegmentF.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(45, 41).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.6517F, -0.0584F, 0.0145F, 0.0823F));
		PartDefinition cube_r156 = MiddleTailSegmentF.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(30, 10).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.7976F, 0.0483F, 0.0298F, -0.1382F));
		PartDefinition cube_r157 = MiddleTailSegmentF.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(86, 20).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.3999F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r158 = MiddleTailSegmentF.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(41, 61).addBox(0.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 0.1F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r159 = MiddleTailSegmentF.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(13, 62).addBox(-2.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 0.1F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r160 = MiddleTailSegmentF.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(86, 30).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.3999F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r161 = MiddleTailSegmentF.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(86, 40).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.3999F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r162 = MiddleTailSegmentF.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(26, 70).addBox(-2.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 0.1F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r163 = MiddleTailSegmentF.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(54, 70).addBox(0.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 0.1F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition cube_r164 = MiddleTailSegmentF.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(86, 50).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.3999F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r165 = MiddleTailSegmentF.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(30, 20).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.7976F, 0.0483F, -0.0298F, 0.1382F));
		PartDefinition cube_r166 = MiddleTailSegmentF.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(30, 50).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.6517F, -0.0584F, -0.0145F, -0.0823F));
		PartDefinition MiddleTailSegmentG = MiddleTailSegmentF.addOrReplaceChild("MiddleTailSegmentG", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, 8.95F, -0.2618F, 0.0F, -0.2182F));
		PartDefinition cube_r167 = MiddleTailSegmentG.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(45, 21).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.7017F, -0.0584F, 0.0145F, 0.0823F));
		PartDefinition cube_r168 = MiddleTailSegmentG.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(15, 22).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.8476F, 0.0483F, 0.0298F, -0.1382F));
		PartDefinition cube_r169 = MiddleTailSegmentG.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(74, 83).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.4499F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r170 = MiddleTailSegmentG.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(60, 40).addBox(0.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 0.15F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r171 = MiddleTailSegmentG.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(60, 50).addBox(-2.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 0.15F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r172 = MiddleTailSegmentG.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(85, 84).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.4499F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r173 = MiddleTailSegmentG.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.4499F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r174 = MiddleTailSegmentG.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(60, 60).addBox(-2.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 0.15F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r175 = MiddleTailSegmentG.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 61).addBox(0.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 0.15F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition cube_r176 = MiddleTailSegmentG.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(86, 10).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.4499F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r177 = MiddleTailSegmentG.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(30, 0).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.8476F, 0.0483F, -0.0298F, 0.1382F));
		PartDefinition cube_r178 = MiddleTailSegmentG.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(45, 31).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.7017F, -0.0584F, -0.0145F, -0.0823F));
		PartDefinition MiddleTailSegmentH = MiddleTailSegmentG.addOrReplaceChild("MiddleTailSegmentH", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, 9.4F, -0.176F, -0.1289F, 0.1974F));
		PartDefinition cube_r179 = MiddleTailSegmentH.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 11).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.4983F, 0.0584F, 0.0145F, -0.0823F));
		PartDefinition cube_r180 = MiddleTailSegmentH.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(15, 12).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.3524F, -0.0483F, 0.0298F, 0.1382F));
		PartDefinition cube_r181 = MiddleTailSegmentH.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.7501F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r182 = MiddleTailSegmentH.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(60, 10).addBox(-2.5005F, 0.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 7.05F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition cube_r183 = MiddleTailSegmentH.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(60, 20).addBox(0.5005F, 0.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 7.05F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r184 = MiddleTailSegmentH.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(11, 82).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.7501F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r185 = MiddleTailSegmentH.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(39, 82).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.7501F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r186 = MiddleTailSegmentH.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(28, 60).addBox(0.5005F, -1.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 7.05F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r187 = MiddleTailSegmentH.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(60, 30).addBox(-2.5005F, -1.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 7.05F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r188 = MiddleTailSegmentH.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(63, 82).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.7501F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r189 = MiddleTailSegmentH.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 21).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.3524F, -0.0483F, -0.0298F, -0.1382F));
		PartDefinition cube_r190 = MiddleTailSegmentH.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(15, 2).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.4983F, 0.0584F, -0.0145F, 0.0823F));
		PartDefinition MiddleTailSegmentI = MiddleTailSegmentH.addOrReplaceChild("MiddleTailSegmentI", CubeListBuilder.create().texOffs(97, 60).addBox(-1.5F, -1.0F, -0.65F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, 9.2F, -0.2182F, 0.0F, 0.2182F));
		PartDefinition cube_r191 = MiddleTailSegmentI.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(97, 12).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.1107F, 0.0076F, 3.6584F, -0.0092F, -0.0446F, -0.0879F));
		PartDefinition cube_r192 = MiddleTailSegmentI.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(44, 92).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.8509F, 0.0666F, 3.6554F, 0.0695F, 0.0261F, 0.1314F));
		PartDefinition cube_r193 = MiddleTailSegmentI.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(102, 68).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, 0.5F, 3.85F, -0.0175F, -0.0873F, 0.1309F));
		PartDefinition cube_r194 = MiddleTailSegmentI.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(20, 103).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, 0.5F, 3.85F, -0.0175F, 0.0873F, -0.1309F));
		PartDefinition cube_r195 = MiddleTailSegmentI.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(46, 101).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, -0.5F, 3.85F, 0.0175F, 0.0873F, 0.1309F));
		PartDefinition cube_r196 = MiddleTailSegmentI.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(10, 102).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, -0.5F, 3.85F, 0.0175F, -0.0873F, -0.1309F));
		PartDefinition cube_r197 = MiddleTailSegmentI.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(100, 90).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.1107F, 0.0076F, 3.6584F, -0.0092F, 0.0446F, 0.0879F));
		PartDefinition cube_r198 = MiddleTailSegmentI.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(107, 19).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.8509F, 0.0666F, 3.6554F, 0.0695F, -0.0261F, -0.1314F));
		PartDefinition MiddleTailSegmentJ = MiddleTailSegmentI.addOrReplaceChild("MiddleTailSegmentJ", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, 6.4F, -0.3054F, 0.0F, 0.2618F));
		PartDefinition cube_r199 = MiddleTailSegmentJ.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(79, 105).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, 2.8F, -0.0326F, -0.0808F, -0.1312F));
		PartDefinition cube_r200 = MiddleTailSegmentJ.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(106, 75).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.4238F, 0.0417F, 2.8519F, 0.0417F, -0.0116F, 0.1315F));
		PartDefinition cube_r201 = MiddleTailSegmentJ.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(106, 81).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.4238F, 0.0417F, 2.8519F, 0.0417F, 0.0116F, -0.1315F));
		PartDefinition cube_r202 = MiddleTailSegmentJ.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.8F, -0.0273F, 4.306F, -0.0085F, 0.0417F, -0.2185F));
		PartDefinition cube_r203 = MiddleTailSegmentJ.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(42, 108).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.7F, 0.0523F, 4.306F, 0.0085F, 0.0417F, 0.2185F));
		PartDefinition cube_r204 = MiddleTailSegmentJ.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(10, 109).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, 0.1523F, 4.306F, 0.0F, 0.0004F, -0.0436F));
		PartDefinition cube_r205 = MiddleTailSegmentJ.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(109, 12).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, 0.0523F, 4.306F, 0.0085F, -0.0417F, -0.2185F));
		PartDefinition cube_r206 = MiddleTailSegmentJ.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(22, 82).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, -0.0273F, 4.306F, -0.0085F, -0.0417F, 0.2185F));
		PartDefinition cube_r207 = MiddleTailSegmentJ.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(107, 39).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, -0.1273F, 4.306F, 0.0F, 0.0004F, 0.0436F));
		PartDefinition cube_r208 = MiddleTailSegmentJ.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(90, 106).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 2.8F, -0.0326F, 0.0808F, 0.1312F));
		PartDefinition MiddleTailSegmentK = MiddleTailSegmentJ.addOrReplaceChild("MiddleTailSegmentK", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1244F, 0.2614F, 4.5424F, -0.2394F, 0.0564F, 0.319F));
		PartDefinition cube_r209 = MiddleTailSegmentK.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(100, 97).addBox(-0.7581F, -0.5811F, -3.498F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, 0.1757F, 2.5074F, 0.0863F, -0.0106F, 0.1742F));
		PartDefinition cube_r210 = MiddleTailSegmentK.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(72, 93).addBox(-0.7523F, -0.4621F, -3.4998F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, 0.1757F, 2.5074F, 0.0611F, 0.0F, 0.0F));
		PartDefinition cube_r211 = MiddleTailSegmentK.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(54, 61).addBox(-0.7523F, -0.5379F, -3.4998F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, -0.1735F, 2.5074F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r212 = MiddleTailSegmentK.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 101).addBox(-0.7581F, -0.4189F, -3.498F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, -0.1735F, 2.5074F, -0.0692F, -0.0076F, -0.1744F));
		PartDefinition cube_r213 = MiddleTailSegmentK.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(97, 20).addBox(-1.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0576F, 0.09F, 1.3076F, -0.038F, 0.1111F, 0.1839F));
		PartDefinition cube_r214 = MiddleTailSegmentK.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(97, 40).addBox(-1.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.1244F, 0.0886F, 1.2076F, 0.0283F, 0.1316F, 0.0461F));
		PartDefinition cube_r215 = MiddleTailSegmentK.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(97, 30).addBox(0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.1912F, 0.09F, 1.3076F, -0.038F, -0.1111F, -0.1839F));
		PartDefinition cube_r216 = MiddleTailSegmentK.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(97, 50).addBox(0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.1244F, 0.0886F, 1.2076F, 0.0283F, -0.1316F, -0.0461F));
		PartDefinition TailC = Tails.addOrReplaceChild("TailC", CubeListBuilder.create(), PartPose.offset(0.05F, 0.3087F, 0.1863F));
		PartDefinition BottomTailSegmentA = TailC.addOrReplaceChild("BottomTailSegmentA", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.075F, 0.0F, 0.75F, -0.3927F, 0.0F, 0.7418F));
		PartDefinition cube_r217 = BottomTailSegmentA.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(30, 103).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.675F, 0.0F, -0.225F, 0.0325F, 0.05F, 0.1355F));
		PartDefinition cube_r218 = BottomTailSegmentA.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(57, 103).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.725F, 0.0F, -0.225F, 0.0325F, -0.05F, -0.1355F));
		PartDefinition cube_r219 = BottomTailSegmentA.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(68, 104).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.4488F, 0.0417F, -0.2769F, -0.0417F, 0.0116F, 0.1315F));
		PartDefinition cube_r220 = BottomTailSegmentA.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(103, 104).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.3988F, 0.0417F, -0.2769F, -0.0417F, -0.0116F, -0.1315F));
		PartDefinition cube_r221 = BottomTailSegmentA.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(0, 108).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.075F, 0.1523F, -1.7311F, 0.0F, -0.0004F, -0.0436F));
		PartDefinition cube_r222 = BottomTailSegmentA.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(26, 62).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.525F, -0.0273F, -1.7311F, 0.0086F, -0.0854F, -0.2189F));
		PartDefinition cube_r223 = BottomTailSegmentA.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(107, 49).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.575F, 0.0523F, -1.7311F, -0.0086F, -0.0854F, 0.2189F));
		PartDefinition cube_r224 = BottomTailSegmentA.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(108, 0).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.625F, 0.0523F, -1.7311F, -0.0086F, 0.0854F, -0.2189F));
		PartDefinition cube_r225 = BottomTailSegmentA.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(52, 71).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.575F, -0.0273F, -1.7311F, 0.0086F, 0.0854F, 0.2189F));
		PartDefinition cube_r226 = BottomTailSegmentA.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(107, 29).addBox(-0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.075F, -0.1273F, -1.7311F, 0.0F, -0.0004F, 0.0436F));
		PartDefinition BottomTailSegmentB = BottomTailSegmentA.addOrReplaceChild("BottomTailSegmentB", CubeListBuilder.create().texOffs(52, 80).addBox(-1.0F, -1.0F, -0.825F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.025F, 0.0F, 4.5F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r227 = BottomTailSegmentB.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(60, 0).addBox(-1.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.0668F, 0.1014F, 3.475F, 0.0873F, 0.0698F, 0.2182F));
		PartDefinition cube_r228 = BottomTailSegmentB.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(73, 1).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.425F, 3.675F, 0.0262F, 0.0F, 0.1745F));
		PartDefinition cube_r229 = BottomTailSegmentB.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(73, 11).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, -0.45F, 3.675F, -0.0262F, 0.0F, -0.1745F));
		PartDefinition cube_r230 = BottomTailSegmentB.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(73, 21).addBox(-0.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.1F, 3.525F, -0.0873F, 0.0F, -0.0436F));
		PartDefinition cube_r231 = BottomTailSegmentB.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(15, 52).addBox(-0.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0668F, 0.1014F, 3.475F, 0.0873F, -0.0698F, -0.2182F));
		PartDefinition cube_r232 = BottomTailSegmentB.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(73, 31).addBox(-1.5F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.1F, 3.525F, -0.0873F, 0.0F, 0.0436F));
		PartDefinition BottomTailSegmentC = BottomTailSegmentB.addOrReplaceChild("BottomTailSegmentC", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 8.275F, -0.7341F, -0.4011F, 0.1766F));
		PartDefinition cube_r233 = BottomTailSegmentC.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(90, 96).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, 0.0523F, 2.2439F, -0.0085F, 0.0417F, -0.2185F));
		PartDefinition cube_r234 = BottomTailSegmentC.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(96, 80).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, 0.1523F, 2.2439F, 0.0F, -0.0004F, -0.0436F));
		PartDefinition cube_r235 = BottomTailSegmentC.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(80, 94).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.7F, 0.0523F, 2.2439F, -0.0085F, -0.0417F, 0.2185F));
		PartDefinition cube_r236 = BottomTailSegmentC.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(98, 2).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, -0.1273F, 2.2439F, 0.0F, -0.0004F, 0.0436F));
		PartDefinition cube_r237 = BottomTailSegmentC.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(34, 93).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.8F, -0.0273F, 2.2439F, 0.0085F, -0.0417F, -0.2185F));
		PartDefinition cube_r238 = BottomTailSegmentC.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(62, 93).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, -0.0273F, 2.2439F, 0.0085F, 0.0417F, 0.2185F));
		PartDefinition cube_r239 = BottomTailSegmentC.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.4238F, 0.0417F, 3.6981F, -0.0417F, 0.0116F, 0.1315F));
		PartDefinition cube_r240 = BottomTailSegmentC.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(30, 30).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, 3.75F, 0.0326F, 0.0808F, -0.1312F));
		PartDefinition cube_r241 = BottomTailSegmentC.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(45, 11).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 3.75F, 0.0326F, -0.0808F, 0.1312F));
		PartDefinition cube_r242 = BottomTailSegmentC.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(45, 1).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.4238F, 0.0417F, 3.6981F, -0.0417F, -0.0116F, -0.1315F));
		PartDefinition BottomTailSegmentD = BottomTailSegmentC.addOrReplaceChild("BottomTailSegmentD", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.0F, -0.8F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.4F, -0.5816F, -0.2316F, 0.1231F));
		PartDefinition cube_r243 = BottomTailSegmentD.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(26, 80).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, 0.5F, 3.7F, 0.0175F, -0.0873F, -0.1309F));
		PartDefinition cube_r244 = BottomTailSegmentD.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(73, 61).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, 0.5F, 3.7F, 0.0175F, 0.0873F, 0.1309F));
		PartDefinition cube_r245 = BottomTailSegmentD.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(73, 41).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, -0.5F, 3.7F, -0.0175F, -0.0873F, 0.1309F));
		PartDefinition cube_r246 = BottomTailSegmentD.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(73, 51).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, -0.5F, 3.7F, -0.0175F, 0.0873F, -0.1309F));
		PartDefinition cube_r247 = BottomTailSegmentD.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(91, 70).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.8509F, 0.0666F, 3.8946F, -0.0695F, -0.0261F, 0.1314F));
		PartDefinition cube_r248 = BottomTailSegmentD.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(15, 32).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.1107F, 0.0076F, 3.8916F, 0.0092F, 0.0446F, -0.0879F));
		PartDefinition cube_r249 = BottomTailSegmentD.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(15, 42).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.1107F, 0.0076F, 3.8916F, 0.0092F, -0.0446F, 0.0879F));
		PartDefinition cube_r250 = BottomTailSegmentD.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(11, 92).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.8509F, 0.0666F, 3.8946F, -0.0695F, 0.0261F, -0.1314F));
		PartDefinition BottomTailSegmentE = BottomTailSegmentD.addOrReplaceChild("BottomTailSegmentE", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 8.5F, -0.3946F, 0.0668F, -0.0562F));
		PartDefinition cube_r251 = BottomTailSegmentE.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(30, 40).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.8976F, 0.0483F, 0.0298F, -0.1382F));
		PartDefinition cube_r252 = BottomTailSegmentE.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.8976F, 0.0483F, -0.0298F, 0.1382F));
		PartDefinition cube_r253 = BottomTailSegmentE.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(0, 51).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.7517F, -0.0584F, 0.0145F, 0.0823F));
		PartDefinition cube_r254 = BottomTailSegmentE.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(45, 51).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.7517F, -0.0584F, -0.0145F, -0.0823F));
		PartDefinition cube_r255 = BottomTailSegmentE.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(22, 90).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.4999F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r256 = BottomTailSegmentE.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(39, 71).addBox(-2.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 0.2F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r257 = BottomTailSegmentE.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 71).addBox(0.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 0.2F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r258 = BottomTailSegmentE.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(86, 60).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.4999F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r259 = BottomTailSegmentE.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(67, 71).addBox(-2.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 0.2F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r260 = BottomTailSegmentE.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.4999F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r261 = BottomTailSegmentE.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(50, 91).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.4999F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r262 = BottomTailSegmentE.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(13, 72).addBox(0.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 0.2F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition BottomTailSegmentF = BottomTailSegmentE.addOrReplaceChild("BottomTailSegmentF", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 9.1F, -0.1776F, 0.1412F, 0.0086F));
		PartDefinition cube_r263 = BottomTailSegmentF.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(45, 41).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.6517F, -0.0584F, 0.0145F, 0.0823F));
		PartDefinition cube_r264 = BottomTailSegmentF.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(30, 10).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.7976F, 0.0483F, 0.0298F, -0.1382F));
		PartDefinition cube_r265 = BottomTailSegmentF.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(86, 20).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.3999F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r266 = BottomTailSegmentF.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(41, 61).addBox(0.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 0.1F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r267 = BottomTailSegmentF.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(13, 62).addBox(-2.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 0.1F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r268 = BottomTailSegmentF.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(86, 30).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.3999F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r269 = BottomTailSegmentF.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(86, 40).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.3999F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r270 = BottomTailSegmentF.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(26, 70).addBox(-2.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 0.1F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r271 = BottomTailSegmentF.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(54, 70).addBox(0.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 0.1F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition cube_r272 = BottomTailSegmentF.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(86, 50).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.3999F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r273 = BottomTailSegmentF.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(30, 20).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.7976F, 0.0483F, -0.0298F, 0.1382F));
		PartDefinition cube_r274 = BottomTailSegmentF.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(30, 50).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.6517F, -0.0584F, -0.0145F, -0.0823F));
		PartDefinition BottomTailSegmentG = BottomTailSegmentF.addOrReplaceChild("BottomTailSegmentG", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 8.95F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r275 = BottomTailSegmentG.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(45, 21).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.7017F, -0.0584F, 0.0145F, 0.0823F));
		PartDefinition cube_r276 = BottomTailSegmentG.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(15, 22).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.8476F, 0.0483F, 0.0298F, -0.1382F));
		PartDefinition cube_r277 = BottomTailSegmentG.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(74, 83).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.4499F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r278 = BottomTailSegmentG.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(60, 40).addBox(0.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 0.15F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r279 = BottomTailSegmentG.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(60, 50).addBox(-2.5005F, 0.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 0.15F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r280 = BottomTailSegmentG.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(85, 84).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.4499F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r281 = BottomTailSegmentG.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.4499F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r282 = BottomTailSegmentG.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(60, 60).addBox(-2.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 0.15F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r283 = BottomTailSegmentG.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(0, 61).addBox(0.5005F, -1.25F, -1.1F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 0.15F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition cube_r284 = BottomTailSegmentG.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(86, 10).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.4499F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r285 = BottomTailSegmentG.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(30, 0).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.8476F, 0.0483F, -0.0298F, 0.1382F));
		PartDefinition cube_r286 = BottomTailSegmentG.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(45, 31).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.7017F, -0.0584F, -0.0145F, -0.0823F));
		PartDefinition BottomTailSegmentH = BottomTailSegmentG.addOrReplaceChild("BottomTailSegmentH", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 9.4F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r287 = BottomTailSegmentH.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(0, 11).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4492F, 0.0729F, 3.4983F, 0.0584F, 0.0145F, -0.0823F));
		PartDefinition cube_r288 = BottomTailSegmentH.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(15, 12).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.3248F, 0.0334F, 3.3524F, -0.0483F, 0.0298F, 0.1382F));
		PartDefinition cube_r289 = BottomTailSegmentH.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, 1.1F, 3.7501F, -0.0226F, 0.0843F, -0.2628F));
		PartDefinition cube_r290 = BottomTailSegmentH.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(60, 10).addBox(-2.5005F, 0.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, -0.15F, 7.05F, 0.0164F, -0.0869F, -0.0876F));
		PartDefinition cube_r291 = BottomTailSegmentH.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(60, 20).addBox(0.5005F, 0.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, -0.15F, 7.05F, 0.0164F, 0.0869F, 0.0876F));
		PartDefinition cube_r292 = BottomTailSegmentH.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(11, 82).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, 1.1F, 3.7501F, -0.0226F, -0.0843F, 0.2628F));
		PartDefinition cube_r293 = BottomTailSegmentH.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(39, 82).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.4075F, -1.0F, 3.7501F, 0.0226F, -0.0843F, -0.2628F));
		PartDefinition cube_r294 = BottomTailSegmentH.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(28, 60).addBox(0.5005F, -1.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0005F, 0.25F, 7.05F, -0.0164F, 0.0869F, -0.0876F));
		PartDefinition cube_r295 = BottomTailSegmentH.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(60, 30).addBox(-2.5005F, -1.25F, -7.9F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0005F, 0.25F, 7.05F, -0.0164F, -0.0869F, 0.0876F));
		PartDefinition cube_r296 = BottomTailSegmentH.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(63, 82).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4075F, -1.0F, 3.7501F, 0.0226F, 0.0843F, 0.2628F));
		PartDefinition cube_r297 = BottomTailSegmentH.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 21).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.3248F, 0.0334F, 3.3524F, -0.0483F, -0.0298F, -0.1382F));
		PartDefinition cube_r298 = BottomTailSegmentH.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(15, 2).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.4492F, 0.0729F, 3.4983F, 0.0584F, -0.0145F, 0.0823F));
		PartDefinition BottomTailSegmentI = BottomTailSegmentH.addOrReplaceChild("BottomTailSegmentI", CubeListBuilder.create().texOffs(97, 60).addBox(-1.5F, -1.0F, -0.65F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 9.2F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r299 = BottomTailSegmentI.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(97, 12).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.1107F, 0.0076F, 3.6584F, -0.0092F, -0.0446F, -0.0879F));
		PartDefinition cube_r300 = BottomTailSegmentI.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(44, 92).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.8509F, 0.0666F, 3.6554F, 0.0695F, 0.0261F, 0.1314F));
		PartDefinition cube_r301 = BottomTailSegmentI.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(102, 68).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, 0.5F, 3.85F, -0.0175F, -0.0873F, 0.1309F));
		PartDefinition cube_r302 = BottomTailSegmentI.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(20, 103).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, 0.5F, 3.85F, -0.0175F, 0.0873F, -0.1309F));
		PartDefinition cube_r303 = BottomTailSegmentI.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(46, 101).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9F, -0.5F, 3.85F, 0.0175F, 0.0873F, 0.1309F));
		PartDefinition cube_r304 = BottomTailSegmentI.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(10, 102).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9F, -0.5F, 3.85F, 0.0175F, -0.0873F, -0.1309F));
		PartDefinition cube_r305 = BottomTailSegmentI.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(100, 90).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.1107F, 0.0076F, 3.6584F, -0.0092F, 0.0446F, 0.0879F));
		PartDefinition cube_r306 = BottomTailSegmentI.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(107, 19).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.8509F, 0.0666F, 3.6554F, 0.0695F, -0.0261F, -0.1314F));
		PartDefinition BottomTailSegmentJ = BottomTailSegmentI.addOrReplaceChild("BottomTailSegmentJ", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 6.4F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r307 = BottomTailSegmentJ.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(79, 105).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, 2.8F, -0.0326F, -0.0808F, -0.1312F));
		PartDefinition cube_r308 = BottomTailSegmentJ.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(106, 75).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.4238F, 0.0417F, 2.8519F, 0.0417F, -0.0116F, 0.1315F));
		PartDefinition cube_r309 = BottomTailSegmentJ.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(106, 81).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.4238F, 0.0417F, 2.8519F, 0.0417F, 0.0116F, -0.1315F));
		PartDefinition cube_r310 = BottomTailSegmentJ.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(50, 81).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.8F, -0.0273F, 4.306F, -0.0085F, 0.0417F, -0.2185F));
		PartDefinition cube_r311 = BottomTailSegmentJ.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(42, 108).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.7F, 0.0523F, 4.306F, 0.0085F, 0.0417F, 0.2185F));
		PartDefinition cube_r312 = BottomTailSegmentJ.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(10, 109).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, 0.1523F, 4.306F, 0.0F, 0.0004F, -0.0436F));
		PartDefinition cube_r313 = BottomTailSegmentJ.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(109, 12).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, 0.0523F, 4.306F, 0.0085F, -0.0417F, -0.2185F));
		PartDefinition cube_r314 = BottomTailSegmentJ.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(22, 82).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.8F, -0.0273F, 4.306F, -0.0085F, -0.0417F, 0.2185F));
		PartDefinition cube_r315 = BottomTailSegmentJ.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(107, 39).addBox(-0.5F, -1.0F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1F, -0.1273F, 4.306F, 0.0F, 0.0004F, 0.0436F));
		PartDefinition cube_r316 = BottomTailSegmentJ.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(90, 106).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, 2.8F, -0.0326F, 0.0808F, 0.1312F));
		PartDefinition BottomTailSegmentK = BottomTailSegmentJ.addOrReplaceChild("BottomTailSegmentK", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1244F, 0.0114F, 4.5424F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r317 = BottomTailSegmentK.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(100, 97).addBox(-0.7581F, -0.5811F, -3.498F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, 0.1757F, 2.5074F, 0.0863F, -0.0106F, 0.1742F));
		PartDefinition cube_r318 = BottomTailSegmentK.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(72, 93).addBox(-0.7523F, -0.4621F, -3.4998F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, 0.1757F, 2.5074F, 0.0611F, 0.0F, 0.0F));
		PartDefinition cube_r319 = BottomTailSegmentK.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(54, 61).addBox(-0.7523F, -0.5379F, -3.4998F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, -0.1735F, 2.5074F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r320 = BottomTailSegmentK.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(0, 101).addBox(-0.7581F, -0.4189F, -3.498F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.1233F, -0.1735F, 2.5074F, -0.0692F, -0.0076F, -0.1744F));
		PartDefinition cube_r321 = BottomTailSegmentK.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(97, 20).addBox(-1.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0576F, 0.09F, 1.3076F, -0.038F, 0.1111F, 0.1839F));
		PartDefinition cube_r322 = BottomTailSegmentK.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(97, 40).addBox(-1.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.1244F, 0.0886F, 1.2076F, 0.0283F, 0.1316F, 0.0461F));
		PartDefinition cube_r323 = BottomTailSegmentK.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(97, 30).addBox(0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.1912F, 0.09F, 1.3076F, -0.038F, -0.1111F, -0.1839F));
		PartDefinition cube_r324 = BottomTailSegmentK.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(97, 50).addBox(0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.1244F, 0.0886F, 1.2076F, 0.0283F, -0.1316F, -0.0461F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
