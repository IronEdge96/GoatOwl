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

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelvsarimakakuja<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelvsarimakakuja"), "main");
	public final ModelPart root;
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart Carapace;
	public final ModelPart RightArm;
	public final ModelPart RighttThumb;
	public final ModelPart RightPointer;
	public final ModelPart RightIndex;
	public final ModelPart RightShoulderPad;
	public final ModelPart LeftArm;
	public final ModelPart LefttThumb;
	public final ModelPart LeftPointer;
	public final ModelPart LeftIndex;
	public final ModelPart LeftShoulderPad;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelvsarimakakuja(ModelPart root) {
		this.root = root;
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Carapace = this.Body.getChild("Carapace");
		this.RightArm = root.getChild("RightArm");
		this.RighttThumb = this.RightArm.getChild("RighttThumb");
		this.RightPointer = this.RightArm.getChild("RightPointer");
		this.RightIndex = this.RightArm.getChild("RightIndex");
		this.RightShoulderPad = this.RightArm.getChild("RightShoulderPad");
		this.LeftArm = root.getChild("LeftArm");
		this.LefttThumb = this.LeftArm.getChild("LefttThumb");
		this.LeftPointer = this.LeftArm.getChild("LeftPointer");
		this.LeftIndex = this.LeftArm.getChild("LeftIndex");
		this.LeftShoulderPad = this.LeftArm.getChild("LeftShoulderPad");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Carapace = Body.addOrReplaceChild("Carapace", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.25F));
		PartDefinition shoulderpad_r1 = Carapace.addOrReplaceChild("shoulderpad_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-7.5F, -1.0F, -0.5F, 11.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(5.6257F, 2.4686F, 2.4648F, -0.025F, 0.0357F, -0.5677F));
		PartDefinition shoulderpad_r2 = Carapace.addOrReplaceChild("shoulderpad_r2", CubeListBuilder.create().texOffs(0, 22).addBox(-7.5F, -1.0F, -0.5F, 10.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(6.1562F, 4.1611F, 2.3224F, -0.0202F, 0.0387F, -0.4367F));
		PartDefinition shoulderpad_r3 = Carapace.addOrReplaceChild("shoulderpad_r3", CubeListBuilder.create().texOffs(0, 19).addBox(-7.0F, -1.0F, -0.5F, 10.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(5.6026F, 5.2114F, 2.2899F, -0.0184F, 0.0395F, -0.3931F));
		PartDefinition shoulderpad_r4 = Carapace.addOrReplaceChild("shoulderpad_r4", CubeListBuilder.create().texOffs(16, 3).addBox(-8.0F, -1.0F, -0.5F, 11.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(5.8559F, 3.2328F, 2.3955F, -0.0218F, 0.0378F, -0.4804F));
		PartDefinition shoulderpad_r5 = Carapace.addOrReplaceChild("shoulderpad_r5", CubeListBuilder.create().texOffs(16, 9).addBox(-2.5F, -1.0F, -0.5F, 10.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-6.1562F, 4.1611F, 2.3224F, -0.0202F, -0.0387F, 0.4367F));
		PartDefinition shoulderpad_r6 = Carapace.addOrReplaceChild("shoulderpad_r6", CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, -1.0F, -0.5F, 11.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-5.6257F, 2.4686F, 2.4648F, -0.025F, -0.0357F, 0.5677F));
		PartDefinition shoulderpad_r7 = Carapace.addOrReplaceChild("shoulderpad_r7", CubeListBuilder.create().texOffs(16, 0).addBox(-3.0F, -1.0F, -0.5F, 11.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-5.8559F, 3.2328F, 2.3955F, -0.0218F, -0.0378F, 0.4804F));
		PartDefinition shoulderpad_r8 = Carapace.addOrReplaceChild("shoulderpad_r8", CubeListBuilder.create().texOffs(16, 6).addBox(-3.0F, -1.0F, -0.5F, 10.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-5.6026F, 5.2114F, 2.2899F, -0.0184F, -0.0395F, 0.3931F));
		PartDefinition torso_r1 = Carapace.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(4, 45).addBox(-1.3567F, -0.928F, -0.5119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(1.3819F, 5.169F, 1.6005F, -0.0437F, 0.0436F, -0.0019F));
		PartDefinition torso_r2 = Carapace.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(44, 8).addBox(0.1F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(2.5663F, 6.0446F, 1.5598F, -0.0531F, 0.2075F, -0.2273F));
		PartDefinition torso_r3 = Carapace.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(36, 38).addBox(-2.55F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(3.0186F, 4.9217F, 1.5258F, -0.0426F, 0.0342F, -0.2198F));
		PartDefinition torso_r4 = Carapace.addOrReplaceChild("torso_r4", CubeListBuilder.create().texOffs(44, 5).addBox(-0.2F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(2.7015F, 4.9913F, 1.509F, -0.0432F, 0.1649F, -0.2255F));
		PartDefinition torso_r5 = Carapace.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(34, 41).addBox(-1.3507F, -1.172F, -0.5127F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(1.4237F, 6.6499F, 1.5906F, -0.0437F, 0.0436F, -0.0019F));
		PartDefinition torso_r6 = Carapace.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(46, 45).addBox(0.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(2.496F, 6.8261F, 1.5263F, -0.0622F, 0.1823F, -0.6646F));
		PartDefinition torso_r7 = Carapace.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(40, 3).addBox(-2.1F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(2.5783F, 6.7623F, 1.5164F, -0.0612F, 0.0081F, -0.6538F));
		PartDefinition torso_r8 = Carapace.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(40, 0).addBox(-2.3F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(2.8627F, 5.9784F, 1.5406F, -0.052F, 0.0332F, -0.2181F));
		PartDefinition torso_r9 = Carapace.addOrReplaceChild("torso_r9", CubeListBuilder.create().texOffs(42, 37).addBox(-1.5269F, 0.011F, -0.5051F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(1.3002F, 8.643F, 1.5954F, -0.0615F, 0.0054F, -0.6973F));
		PartDefinition torso_r10 = Carapace.addOrReplaceChild("torso_r10", CubeListBuilder.create().texOffs(38, 6).addBox(-0.7686F, -2.1965F, -0.4949F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(1.3002F, 8.643F, 1.5954F, -0.052F, 0.0332F, -0.2181F));
		PartDefinition torso_r11 = Carapace.addOrReplaceChild("torso_r11", CubeListBuilder.create().texOffs(18, 40).addBox(-1.2434F, -1.7233F, -0.5287F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(1.1196F, 8.0822F, 1.6538F, -0.0437F, 0.0436F, -0.0019F));
		PartDefinition torso_r12 = Carapace.addOrReplaceChild("torso_r12", CubeListBuilder.create().texOffs(10, 40).addBox(-1.2434F, -1.7233F, -0.5287F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(1.1196F, 7.4072F, 1.7288F, -0.0437F, 0.0436F, -0.0019F));
		PartDefinition torso_r13 = Carapace.addOrReplaceChild("torso_r13", CubeListBuilder.create().texOffs(36, 20).addBox(-1.9987F, -0.1045F, -0.5051F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(1.7358F, 7.7534F, 1.6547F, -0.0615F, 0.0054F, -0.6973F));
		PartDefinition torso_r14 = Carapace.addOrReplaceChild("torso_r14", CubeListBuilder.create().texOffs(34, 15).addBox(-1.2403F, -1.0811F, -0.4949F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(1.6358F, 7.7534F, 1.6547F, -0.052F, 0.0332F, -0.2181F));
		PartDefinition torso_r15 = Carapace.addOrReplaceChild("torso_r15", CubeListBuilder.create().texOffs(44, 33).addBox(0.3567F, -0.928F, -0.5119F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-1.3819F, 5.169F, 1.6005F, -0.0437F, -0.0436F, 0.0019F));
		PartDefinition torso_r16 = Carapace.addOrReplaceChild("torso_r16", CubeListBuilder.create().texOffs(0, 43).addBox(-1.1F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-2.5663F, 6.0446F, 1.5598F, -0.0531F, -0.2075F, 0.2273F));
		PartDefinition torso_r17 = Carapace.addOrReplaceChild("torso_r17", CubeListBuilder.create().texOffs(38, 34).addBox(0.55F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-3.0186F, 4.9217F, 1.5258F, -0.0426F, -0.0342F, 0.2198F));
		PartDefinition torso_r18 = Carapace.addOrReplaceChild("torso_r18", CubeListBuilder.create().texOffs(42, 42).addBox(-0.8F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-2.7015F, 4.9913F, 1.509F, -0.0432F, -0.1649F, 0.2255F));
		PartDefinition torso_r19 = Carapace.addOrReplaceChild("torso_r19", CubeListBuilder.create().texOffs(30, 41).addBox(0.3507F, -1.172F, -0.5127F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-1.4237F, 6.6499F, 1.5906F, -0.0437F, -0.0436F, 0.0019F));
		PartDefinition torso_r20 = Carapace.addOrReplaceChild("torso_r20", CubeListBuilder.create().texOffs(46, 14).addBox(-1.1F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-2.496F, 6.8261F, 1.5263F, -0.0622F, -0.1823F, 0.6646F));
		PartDefinition torso_r21 = Carapace.addOrReplaceChild("torso_r21", CubeListBuilder.create().texOffs(38, 10).addBox(0.1F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-2.5783F, 6.7623F, 1.5164F, -0.0612F, -0.0081F, 0.6538F));
		PartDefinition torso_r22 = Carapace.addOrReplaceChild("torso_r22", CubeListBuilder.create().texOffs(0, 40).addBox(0.3F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-2.8627F, 5.9784F, 1.5406F, -0.052F, -0.0332F, 0.2181F));
		PartDefinition torso_r23 = Carapace.addOrReplaceChild("torso_r23", CubeListBuilder.create().texOffs(42, 16).addBox(-0.4731F, 0.011F, -0.5051F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.3002F, 8.643F, 1.5954F, -0.0615F, -0.0054F, 0.6973F));
		PartDefinition torso_r24 = Carapace.addOrReplaceChild("torso_r24", CubeListBuilder.create().texOffs(18, 36).addBox(-1.2314F, -2.1965F, -0.4949F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.3002F, 8.643F, 1.5954F, -0.052F, -0.0332F, 0.2181F));
		PartDefinition torso_r25 = Carapace.addOrReplaceChild("torso_r25", CubeListBuilder.create().texOffs(14, 40).addBox(0.2434F, -1.7233F, -0.5287F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.1196F, 8.0822F, 1.6538F, -0.0437F, -0.0436F, 0.0019F));
		PartDefinition torso_r26 = Carapace.addOrReplaceChild("torso_r26", CubeListBuilder.create().texOffs(6, 40).addBox(0.2434F, -1.7233F, -0.5287F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.1196F, 7.4072F, 1.7288F, -0.0437F, -0.0436F, 0.0019F));
		PartDefinition torso_r27 = Carapace.addOrReplaceChild("torso_r27", CubeListBuilder.create().texOffs(36, 18).addBox(-1.0013F, -0.1045F, -0.5051F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.7358F, 7.7534F, 1.6547F, -0.0615F, -0.0054F, 0.6973F));
		PartDefinition torso_r28 = Carapace.addOrReplaceChild("torso_r28", CubeListBuilder.create().texOffs(34, 12).addBox(-1.7597F, -1.0811F, -0.4949F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.6358F, 7.7534F, 1.6547F, -0.052F, -0.0332F, 0.2181F));
		PartDefinition torso_r29 = Carapace.addOrReplaceChild("torso_r29", CubeListBuilder.create().texOffs(44, 30).addBox(-0.9087F, -1.1119F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.0897F, 4.3989F, 1.5532F, -0.4233F, -0.3897F, -0.7006F));
		PartDefinition torso_r30 = Carapace.addOrReplaceChild("torso_r30", CubeListBuilder.create().texOffs(50, 0).addBox(-0.4474F, -0.9692F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.0F, 4.4156F, 1.5425F, -0.2145F, -0.5293F, -1.1634F));
		PartDefinition torso_r31 = Carapace.addOrReplaceChild("torso_r31", CubeListBuilder.create().texOffs(44, 27).addBox(-0.0913F, -1.1119F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-0.0897F, 4.3989F, 1.5532F, -0.4233F, 0.3897F, 0.7006F));
		PartDefinition torso_r32 = Carapace.addOrReplaceChild("torso_r32", CubeListBuilder.create().texOffs(48, 49).addBox(-0.5526F, -0.9692F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.0F, 4.4156F, 1.5425F, -0.2145F, 0.5293F, 1.1634F));
		PartDefinition torso_r33 = Carapace.addOrReplaceChild("torso_r33", CubeListBuilder.create().texOffs(44, 49).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.0F, 3.9467F, 1.8412F, -0.4233F, -0.3897F, -0.7006F));
		PartDefinition torso_r34 = Carapace.addOrReplaceChild("torso_r34", CubeListBuilder.create().texOffs(46, 39).addBox(-0.9087F, -1.1119F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.125F)),
				PartPose.offsetAndRotation(0.0747F, 3.7516F, 1.6014F, -0.4233F, -0.3897F, -0.7006F));
		PartDefinition torso_r35 = Carapace.addOrReplaceChild("torso_r35", CubeListBuilder.create().texOffs(0, 51).addBox(-0.4474F, -0.9692F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)),
				PartPose.offsetAndRotation(0.0F, 3.7656F, 1.5925F, -0.2145F, -0.5293F, -1.1634F));
		PartDefinition torso_r36 = Carapace.addOrReplaceChild("torso_r36", CubeListBuilder.create().texOffs(20, 46).addBox(-0.0913F, -1.1119F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.125F)),
				PartPose.offsetAndRotation(-0.0747F, 3.7516F, 1.6014F, -0.4233F, 0.3897F, 0.7006F));
		PartDefinition torso_r37 = Carapace.addOrReplaceChild("torso_r37", CubeListBuilder.create().texOffs(50, 46).addBox(-0.5526F, -0.9692F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)),
				PartPose.offsetAndRotation(0.0F, 3.7656F, 1.5925F, -0.2145F, 0.5293F, 1.1634F));
		PartDefinition torso_r38 = Carapace.addOrReplaceChild("torso_r38", CubeListBuilder.create().texOffs(20, 49).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)),
				PartPose.offsetAndRotation(0.0F, 3.2967F, 1.8912F, -0.4233F, -0.3897F, -0.7006F));
		PartDefinition torso_r39 = Carapace.addOrReplaceChild("torso_r39", CubeListBuilder.create().texOffs(50, 44).addBox(-0.4474F, -0.9692F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.8656F, 1.5925F, -0.2145F, -0.5293F, -1.1634F));
		PartDefinition torso_r40 = Carapace.addOrReplaceChild("torso_r40", CubeListBuilder.create().texOffs(46, 11).addBox(-0.9087F, -1.1119F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0598F, 2.8544F, 1.5996F, -0.4233F, -0.3897F, -0.7006F));
		PartDefinition torso_r41 = Carapace.addOrReplaceChild("torso_r41", CubeListBuilder.create().texOffs(46, 0).addBox(-0.0913F, -1.1119F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.0598F, 2.8544F, 1.5996F, -0.4233F, 0.3897F, 0.7006F));
		PartDefinition torso_r42 = Carapace.addOrReplaceChild("torso_r42", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.3967F, 1.8912F, -0.4233F, -0.3897F, -0.7006F));
		PartDefinition torso_r43 = Carapace.addOrReplaceChild("torso_r43", CubeListBuilder.create().texOffs(50, 42).addBox(-0.5526F, -0.9692F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.8656F, 1.5925F, -0.2145F, 0.5293F, 1.1634F));
		PartDefinition torso_r44 = Carapace.addOrReplaceChild("torso_r44", CubeListBuilder.create().texOffs(50, 40).addBox(-0.4474F, -0.9692F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.075F)),
				PartPose.offsetAndRotation(0.0F, 1.9656F, 1.5925F, -0.2145F, -0.5293F, -1.1634F));
		PartDefinition torso_r45 = Carapace.addOrReplaceChild("torso_r45", CubeListBuilder.create().texOffs(0, 46).addBox(-0.9087F, -1.1119F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.075F)),
				PartPose.offsetAndRotation(0.0448F, 1.9572F, 1.5978F, -0.4233F, -0.3897F, -0.7006F));
		PartDefinition torso_r46 = Carapace.addOrReplaceChild("torso_r46", CubeListBuilder.create().texOffs(42, 45).addBox(-0.0913F, -1.1119F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.075F)),
				PartPose.offsetAndRotation(-0.0448F, 1.9572F, 1.5978F, -0.4233F, 0.3897F, 0.7006F));
		PartDefinition torso_r47 = Carapace.addOrReplaceChild("torso_r47", CubeListBuilder.create().texOffs(40, 50).addBox(-0.5526F, -0.9692F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.075F)),
				PartPose.offsetAndRotation(0.0F, 1.9656F, 1.5925F, -0.2145F, 0.5293F, 1.1634F));
		PartDefinition torso_r48 = Carapace.addOrReplaceChild("torso_r48", CubeListBuilder.create().texOffs(40, 48).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.075F)),
				PartPose.offsetAndRotation(0.0F, 1.4967F, 1.8912F, -0.4233F, -0.3897F, -0.7006F));
		PartDefinition torso_r49 = Carapace.addOrReplaceChild("torso_r49", CubeListBuilder.create().texOffs(38, 45).addBox(-0.9087F, -1.1119F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0598F, 1.2544F, 1.5996F, -0.4233F, -0.3897F, -0.7006F));
		PartDefinition torso_r50 = Carapace.addOrReplaceChild("torso_r50", CubeListBuilder.create().texOffs(50, 38).addBox(-0.4474F, -0.9692F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 1.2656F, 1.5925F, -0.2145F, -0.5293F, -1.1634F));
		PartDefinition torso_r51 = Carapace.addOrReplaceChild("torso_r51", CubeListBuilder.create().texOffs(34, 45).addBox(-0.0913F, -1.1119F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.0598F, 1.2544F, 1.5996F, -0.4233F, 0.3897F, 0.7006F));
		PartDefinition torso_r52 = Carapace.addOrReplaceChild("torso_r52", CubeListBuilder.create().texOffs(36, 50).addBox(-0.5526F, -0.9692F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 1.2656F, 1.5925F, -0.2145F, 0.5293F, 1.1634F));
		PartDefinition torso_r53 = Carapace.addOrReplaceChild("torso_r53", CubeListBuilder.create().texOffs(48, 36).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.7967F, 1.8912F, -0.4233F, -0.3897F, -0.7006F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(24, 12).addBox(-3.0F, -0.375F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.125F)).texOffs(0, 0).addBox(-3.0F, 1.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.125F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition right_arm_r1 = RightArm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(22, 19).addBox(0.0F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(-2.0258F, 0.1193F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition RighttThumb = RightArm.addOrReplaceChild("RighttThumb", CubeListBuilder.create(), PartPose.offset(-1.0571F, 9.596F, -1.9655F));
		PartDefinition left_arm_r1 = RighttThumb.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(24, 50).addBox(0.5695F, -1.5695F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.0095F, -0.1085F, 0.0429F, 0.0F, 0.0F, -0.8727F));
		PartDefinition left_arm_r2 = RighttThumb.addOrReplaceChild("left_arm_r2",
				CubeListBuilder.create().texOffs(26, 45).addBox(-0.5F, -1.8625F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).texOffs(16, 45).addBox(-0.5F, -0.8625F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(50, 13)
						.addBox(-0.5F, 0.5125F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(12, 50).addBox(-0.5F, 0.3375F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.0095F, -0.1085F, 0.0429F, 0.0F, 0.0F, -0.0873F));
		PartDefinition left_arm_r3 = RighttThumb.addOrReplaceChild("left_arm_r3", CubeListBuilder.create().texOffs(16, 50).addBox(-0.7563F, -0.7563F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.0095F, -0.1085F, 0.0429F, 0.0F, 0.0F, 0.6981F));
		PartDefinition left_arm_r4 = RighttThumb.addOrReplaceChild("left_arm_r4", CubeListBuilder.create().texOffs(26, 42).addBox(-0.5F, 1.0061F, -0.6478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.0095F, -0.3585F, 0.0429F, 0.1304F, -0.0114F, -0.0865F));
		PartDefinition left_arm_r5 = RighttThumb.addOrReplaceChild("left_arm_r5", CubeListBuilder.create().texOffs(28, 50).addBox(-0.5F, 0.3375F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)),
				PartPose.offsetAndRotation(-0.0095F, 0.1415F, 0.0429F, 0.0F, 0.0F, -0.0873F));
		PartDefinition RightPointer = RightArm.addOrReplaceChild("RightPointer", CubeListBuilder.create(), PartPose.offset(-2.9429F, 9.596F, -1.0095F));
		PartDefinition right_arm_r2 = RightPointer.addOrReplaceChild("right_arm_r2", CubeListBuilder.create().texOffs(50, 11).addBox(-0.675F, -1.5695F, -1.5695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0429F, -0.1085F, 0.0095F, -0.8727F, 0.0F, 0.0F));
		PartDefinition right_arm_r3 = RightPointer.addOrReplaceChild("right_arm_r3",
				CubeListBuilder.create().texOffs(12, 45).addBox(-0.625F, -1.8625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).texOffs(8, 45).addBox(-0.675F, -0.8625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(4, 50)
						.addBox(-0.475F, 0.5125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(50, 2).addBox(-0.325F, 0.3375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0429F, -0.1085F, 0.0095F, -0.0873F, 0.0F, 0.0F));
		PartDefinition right_arm_r4 = RightPointer.addOrReplaceChild("right_arm_r4", CubeListBuilder.create().texOffs(8, 50).addBox(-0.575F, -0.7563F, -0.2437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0429F, -0.1085F, 0.0095F, 0.6981F, 0.0F, 0.0F));
		PartDefinition right_arm_r5 = RightPointer.addOrReplaceChild("right_arm_r5", CubeListBuilder.create().texOffs(44, 18).addBox(-0.6478F, 1.0061F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0429F, -0.3585F, 0.0095F, -0.0865F, -0.0114F, -0.1304F));
		PartDefinition right_arm_r6 = RightPointer.addOrReplaceChild("right_arm_r6", CubeListBuilder.create().texOffs(32, 50).addBox(-0.325F, 0.3375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)),
				PartPose.offsetAndRotation(0.0429F, 0.1415F, 0.0095F, -0.0873F, 0.0F, 0.0F));
		PartDefinition RightIndex = RightArm.addOrReplaceChild("RightIndex", CubeListBuilder.create(), PartPose.offset(-2.9429F, 9.596F, 1.0095F));
		PartDefinition right_arm_r7 = RightIndex.addOrReplaceChild("right_arm_r7", CubeListBuilder.create().texOffs(50, 11).addBox(-0.675F, -1.5695F, 0.5695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0429F, -0.1085F, -0.0095F, 0.8727F, 0.0F, 0.0F));
		PartDefinition right_arm_r8 = RightIndex.addOrReplaceChild("right_arm_r8",
				CubeListBuilder.create().texOffs(12, 45).addBox(-0.625F, -1.8625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).texOffs(8, 45).addBox(-0.675F, -0.8625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(4, 50)
						.addBox(-0.475F, 0.5125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(50, 2).addBox(-0.325F, 0.3375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0429F, -0.1085F, -0.0095F, 0.0873F, 0.0F, 0.0F));
		PartDefinition right_arm_r9 = RightIndex.addOrReplaceChild("right_arm_r9", CubeListBuilder.create().texOffs(8, 50).addBox(-0.575F, -0.7563F, -0.7563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0429F, -0.1085F, -0.0095F, -0.6981F, 0.0F, 0.0F));
		PartDefinition right_arm_r10 = RightIndex.addOrReplaceChild("right_arm_r10", CubeListBuilder.create().texOffs(44, 18).addBox(-0.6478F, 1.0061F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0429F, -0.3585F, -0.0095F, 0.0865F, 0.0114F, -0.1304F));
		PartDefinition right_arm_r11 = RightIndex.addOrReplaceChild("right_arm_r11", CubeListBuilder.create().texOffs(32, 50).addBox(-0.325F, 0.3375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)),
				PartPose.offsetAndRotation(0.0429F, 0.1415F, -0.0095F, 0.0873F, 0.0F, 0.0F));
		PartDefinition RightShoulderPad = RightArm.addOrReplaceChild("RightShoulderPad", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition shoulderpad_r9 = RightShoulderPad.addOrReplaceChild("shoulderpad_r9", CubeListBuilder.create().texOffs(44, 24).addBox(-0.6432F, 1.0961F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2655F, 0.0996F, -2.2784F, -0.0097F, 0.218F, -0.0447F));
		PartDefinition shoulderpad_r10 = RightShoulderPad.addOrReplaceChild("shoulderpad_r10", CubeListBuilder.create().texOffs(36, 48).addBox(-0.9511F, 2.0359F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3052F, -0.1757F, -2.2696F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r11 = RightShoulderPad.addOrReplaceChild("shoulderpad_r11", CubeListBuilder.create().texOffs(48, 34).addBox(-0.9511F, 2.0359F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2883F, -0.0772F, -2.2733F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r12 = RightShoulderPad.addOrReplaceChild("shoulderpad_r12", CubeListBuilder.create().texOffs(48, 32).addBox(-0.9511F, 2.0359F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2713F, 0.0213F, -2.2771F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r13 = RightShoulderPad.addOrReplaceChild("shoulderpad_r13", CubeListBuilder.create().texOffs(32, 48).addBox(-0.9511F, 2.0359F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2544F, 0.1198F, -2.2808F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r14 = RightShoulderPad.addOrReplaceChild("shoulderpad_r14", CubeListBuilder.create().texOffs(38, 28).addBox(-0.9511F, 1.0359F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.1582F, 0.1024F, -2.3022F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r15 = RightShoulderPad.addOrReplaceChild("shoulderpad_r15", CubeListBuilder.create().texOffs(38, 25).addBox(-5.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(1.3797F, 2.1926F, 2.6053F, -0.025F, -0.0357F, 0.0F));
		PartDefinition shoulderpad_r16 = RightShoulderPad.addOrReplaceChild("shoulderpad_r16", CubeListBuilder.create().texOffs(12, 36).addBox(-5.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(1.3012F, 0.7423F, 2.6708F, -0.025F, -0.0357F, 0.0F));
		PartDefinition shoulderpad_r17 = RightShoulderPad.addOrReplaceChild("shoulderpad_r17", CubeListBuilder.create().texOffs(6, 36).addBox(-5.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(1.1764F, -0.5077F, 2.726F, -0.025F, -0.0357F, 0.0F));
		PartDefinition shoulderpad_r18 = RightShoulderPad.addOrReplaceChild("shoulderpad_r18", CubeListBuilder.create().texOffs(38, 31).addBox(-5.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(1.0553F, -1.2574F, 2.7684F, -0.025F, -0.0357F, 0.0F));
		PartDefinition shoulderpad_r19 = RightShoulderPad.addOrReplaceChild("shoulderpad_r19", CubeListBuilder.create().texOffs(8, 31).addBox(-0.4249F, 1.0052F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3965F, 0.196F, 1.4351F, 0.0F, 0.0873F, -0.0436F));
		PartDefinition shoulderpad_r20 = RightShoulderPad.addOrReplaceChild("shoulderpad_r20",
				CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)).texOffs(0, 31).addBox(-0.5F, -1.0F, -3.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.325F, 2.2F, 0.5F, 0.0F, 0.0F, -0.0436F));
		PartDefinition shoulderpad_r21 = RightShoulderPad.addOrReplaceChild("shoulderpad_r21", CubeListBuilder.create().texOffs(38, 41).addBox(-0.6777F, -0.9068F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2684F, 0.1496F, -2.3547F, -0.0097F, 0.218F, -0.0447F));
		PartDefinition shoulderpad_r22 = RightShoulderPad.addOrReplaceChild("shoulderpad_r22", CubeListBuilder.create().texOffs(48, 30).addBox(-0.7645F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3652F, -0.1154F, -2.3333F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r23 = RightShoulderPad.addOrReplaceChild("shoulderpad_r23", CubeListBuilder.create().texOffs(48, 28).addBox(-0.7645F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3991F, -0.3124F, -2.3258F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r24 = RightShoulderPad.addOrReplaceChild("shoulderpad_r24", CubeListBuilder.create().texOffs(28, 48).addBox(-0.7645F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.4216F, -1.0191F, -2.3208F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r25 = RightShoulderPad.addOrReplaceChild("shoulderpad_r25", CubeListBuilder.create().texOffs(48, 26).addBox(-0.7645F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.4047F, -0.9206F, -2.3245F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r26 = RightShoulderPad.addOrReplaceChild("shoulderpad_r26", CubeListBuilder.create().texOffs(48, 24).addBox(-0.7645F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3821F, -0.2139F, -2.3295F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r27 = RightShoulderPad.addOrReplaceChild("shoulderpad_r27", CubeListBuilder.create().texOffs(46, 3).addBox(-0.7645F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3482F, -0.0169F, -2.337F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r28 = RightShoulderPad.addOrReplaceChild("shoulderpad_r28", CubeListBuilder.create().texOffs(24, 48).addBox(-0.7645F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3313F, 0.0815F, -2.3408F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r29 = RightShoulderPad.addOrReplaceChild("shoulderpad_r29", CubeListBuilder.create().texOffs(48, 22).addBox(-0.7645F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3143F, 0.18F, -2.3445F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r30 = RightShoulderPad.addOrReplaceChild("shoulderpad_r30", CubeListBuilder.create().texOffs(42, 39).addBox(-0.7645F, 0.0456F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2182F, 0.1626F, -2.3659F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r31 = RightShoulderPad.addOrReplaceChild("shoulderpad_r31", CubeListBuilder.create().texOffs(30, 38).addBox(-0.7645F, -0.9544F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.122F, 0.1453F, -2.3872F, -0.0097F, 0.218F, -0.0447F));
		PartDefinition shoulderpad_r32 = RightShoulderPad.addOrReplaceChild("shoulderpad_r32", CubeListBuilder.create().texOffs(24, 39).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-2.9006F, 0.6147F, -2.4363F, -0.0573F, 0.2106F, -0.2679F));
		PartDefinition shoulderpad_r33 = RightShoulderPad.addOrReplaceChild("shoulderpad_r33", CubeListBuilder.create().texOffs(16, 30).addBox(-0.4594F, -0.9977F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3965F, 0.246F, 1.4851F, 0.0F, 0.0873F, -0.0436F));
		PartDefinition shoulderpad_r34 = RightShoulderPad.addOrReplaceChild("shoulderpad_r34",
				CubeListBuilder.create().texOffs(32, 29).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.45F)).texOffs(8, 25).addBox(-0.5F, -1.5F, -3.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.425F, 0.75F, 0.5F, 0.0F, 0.0F, -0.0436F));
		PartDefinition shoulderpad_r35 = RightShoulderPad.addOrReplaceChild("shoulderpad_r35", CubeListBuilder.create().texOffs(22, 42).addBox(-0.7372F, -2.4109F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2713F, 0.3996F, -2.4318F, -0.0097F, 0.218F, -0.0447F));
		PartDefinition shoulderpad_r36 = RightShoulderPad.addOrReplaceChild("shoulderpad_r36", CubeListBuilder.create().texOffs(48, 20).addBox(-0.5779F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.4509F, -0.0624F, -2.392F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r37 = RightShoulderPad.addOrReplaceChild("shoulderpad_r37", CubeListBuilder.create().texOffs(48, 18).addBox(-0.5779F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.4339F, 0.0361F, -2.3957F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r38 = RightShoulderPad.addOrReplaceChild("shoulderpad_r38", CubeListBuilder.create().texOffs(48, 16).addBox(-0.5779F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.417F, 0.1346F, -2.3995F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r39 = RightShoulderPad.addOrReplaceChild("shoulderpad_r39", CubeListBuilder.create().texOffs(16, 48).addBox(-0.5779F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.4F, 0.2331F, -2.4033F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r40 = RightShoulderPad.addOrReplaceChild("shoulderpad_r40", CubeListBuilder.create().texOffs(12, 48).addBox(-0.5779F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3831F, 0.3315F, -2.407F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r41 = RightShoulderPad.addOrReplaceChild("shoulderpad_r41", CubeListBuilder.create().texOffs(20, 51).addBox(-0.45F, -0.45F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.5893F, -0.6431F, -2.4125F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r42 = RightShoulderPad.addOrReplaceChild("shoulderpad_r42", CubeListBuilder.create().texOffs(48, 9).addBox(-0.5779F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.4734F, -0.7691F, -2.387F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r43 = RightShoulderPad.addOrReplaceChild("shoulderpad_r43", CubeListBuilder.create().texOffs(8, 48).addBox(-0.5779F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3661F, 0.43F, -2.4108F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r44 = RightShoulderPad.addOrReplaceChild("shoulderpad_r44", CubeListBuilder.create().texOffs(30, 45).addBox(-0.5779F, -1.4446F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.27F, 0.4126F, -2.4321F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r45 = RightShoulderPad.addOrReplaceChild("shoulderpad_r45", CubeListBuilder.create().texOffs(42, 12).addBox(-0.5779F, -2.4446F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.1738F, 0.3953F, -2.4534F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r46 = RightShoulderPad.addOrReplaceChild("shoulderpad_r46", CubeListBuilder.create().texOffs(24, 35).addBox(-0.5779F, -2.4446F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.0865F, 0.3707F, -2.4728F, -0.0536F, 0.2116F, -0.25F));
		PartDefinition shoulderpad_r47 = RightShoulderPad.addOrReplaceChild("shoulderpad_r47", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5188F, -2.5018F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3965F, 0.496F, 1.5351F, 0.0F, 0.0873F, -0.0436F));
		PartDefinition shoulderpad_r48 = RightShoulderPad.addOrReplaceChild("shoulderpad_r48",
				CubeListBuilder.create().texOffs(16, 25).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.45F)).texOffs(22, 24).addBox(-0.5F, -1.5F, -3.35F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.55F, -0.5F, 0.5F, 0.0F, 0.0F, -0.0436F));
		PartDefinition shoulderpad_r49 = RightShoulderPad.addOrReplaceChild("shoulderpad_r49", CubeListBuilder.create().texOffs(48, 7).addBox(-0.5926F, -1.9554F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2983F, 0.3672F, -2.4932F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r50 = RightShoulderPad.addOrReplaceChild("shoulderpad_r50", CubeListBuilder.create().texOffs(48, 5).addBox(-0.5926F, -1.9554F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2813F, 0.4657F, -2.4969F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r51 = RightShoulderPad.addOrReplaceChild("shoulderpad_r51", CubeListBuilder.create().texOffs(4, 48).addBox(-0.5926F, -1.9554F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2644F, 0.5642F, -2.5007F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r52 = RightShoulderPad.addOrReplaceChild("shoulderpad_r52", CubeListBuilder.create().texOffs(46, 47).addBox(-0.5926F, -1.9554F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2474F, 0.6626F, -2.5044F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r53 = RightShoulderPad.addOrReplaceChild("shoulderpad_r53", CubeListBuilder.create().texOffs(44, 21).addBox(-0.5926F, -2.9554F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.1513F, 0.6453F, -2.5257F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r54 = RightShoulderPad.addOrReplaceChild("shoulderpad_r54", CubeListBuilder.create().texOffs(38, 22).addBox(-0.5926F, -2.9554F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.0551F, 0.6279F, -2.5471F, -0.0385F, 0.2148F, -0.1787F));
		PartDefinition shoulderpad_r55 = RightShoulderPad.addOrReplaceChild("shoulderpad_r55", CubeListBuilder.create().texOffs(46, 42).addBox(-0.8184F, -2.9154F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.2488F, 0.6496F, -2.5041F, -0.0097F, 0.218F, -0.0447F));
		PartDefinition shoulderpad_r56 = RightShoulderPad.addOrReplaceChild("shoulderpad_r56", CubeListBuilder.create().texOffs(30, 24).addBox(-0.5751F, -3.0052F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.3965F, 0.746F, 1.5851F, 0.0F, 0.0873F, -0.0436F));
		PartDefinition shoulderpad_r57 = RightShoulderPad.addOrReplaceChild("shoulderpad_r57",
				CubeListBuilder.create().texOffs(32, 34).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)).texOffs(24, 30).addBox(-0.5F, -1.0F, -3.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-3.65F, -1.25F, 0.5F, 0.0F, 0.0F, -0.0436F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 12).mirror().addBox(2.0F, -0.375F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.125F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(-1.0F, 1.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.125F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition left_arm_r6 = LeftArm.addOrReplaceChild("left_arm_r6", CubeListBuilder.create().texOffs(22, 19).mirror().addBox(-3.0F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.125F)).mirror(false),
				PartPose.offsetAndRotation(2.0258F, 0.1193F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition LefttThumb = LeftArm.addOrReplaceChild("LefttThumb", CubeListBuilder.create(), PartPose.offset(1.0571F, 9.596F, -1.9655F));
		PartDefinition right_arm_r12 = LefttThumb.addOrReplaceChild("right_arm_r12", CubeListBuilder.create().texOffs(24, 50).mirror().addBox(-1.5695F, -1.5695F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(0.0095F, -0.1085F, 0.0429F, 0.0F, 0.0F, 0.8727F));
		PartDefinition right_arm_r13 = LefttThumb.addOrReplaceChild("right_arm_r13",
				CubeListBuilder.create().texOffs(26, 45).mirror().addBox(-0.5F, -1.8625F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false).texOffs(16, 45).mirror()
						.addBox(-0.5F, -0.8625F, -0.675F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(50, 13).mirror().addBox(-0.5F, 0.5125F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(12, 50)
						.mirror().addBox(-0.5F, 0.3375F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(0.0095F, -0.1085F, 0.0429F, 0.0F, 0.0F, 0.0873F));
		PartDefinition right_arm_r14 = LefttThumb.addOrReplaceChild("right_arm_r14", CubeListBuilder.create().texOffs(16, 50).mirror().addBox(-0.2437F, -0.7563F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(0.0095F, -0.1085F, 0.0429F, 0.0F, 0.0F, -0.6981F));
		PartDefinition right_arm_r15 = LefttThumb.addOrReplaceChild("right_arm_r15", CubeListBuilder.create().texOffs(26, 42).mirror().addBox(-0.5F, 1.0061F, -0.6478F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(0.0095F, -0.3585F, 0.0429F, 0.1304F, 0.0114F, 0.0865F));
		PartDefinition right_arm_r16 = LefttThumb.addOrReplaceChild("right_arm_r16", CubeListBuilder.create().texOffs(28, 50).mirror().addBox(-0.5F, 0.3375F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)).mirror(false),
				PartPose.offsetAndRotation(0.0095F, 0.1415F, 0.0429F, 0.0F, 0.0F, 0.0873F));
		PartDefinition LeftPointer = LeftArm.addOrReplaceChild("LeftPointer", CubeListBuilder.create(), PartPose.offset(2.9429F, 9.596F, -1.0095F));
		PartDefinition left_arm_r7 = LeftPointer.addOrReplaceChild("left_arm_r7", CubeListBuilder.create().texOffs(50, 11).mirror().addBox(-0.325F, -1.5695F, -1.5695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(-0.0429F, -0.1085F, 0.0095F, -0.8727F, 0.0F, 0.0F));
		PartDefinition left_arm_r8 = LeftPointer.addOrReplaceChild("left_arm_r8",
				CubeListBuilder.create().texOffs(12, 45).mirror().addBox(-0.375F, -1.8625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false).texOffs(8, 45).mirror()
						.addBox(-0.325F, -0.8625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(4, 50).mirror().addBox(-0.525F, 0.5125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(50, 2)
						.mirror().addBox(-0.675F, 0.3375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-0.0429F, -0.1085F, 0.0095F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_arm_r9 = LeftPointer.addOrReplaceChild("left_arm_r9", CubeListBuilder.create().texOffs(8, 50).mirror().addBox(-0.425F, -0.7563F, -0.2437F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(-0.0429F, -0.1085F, 0.0095F, 0.6981F, 0.0F, 0.0F));
		PartDefinition left_arm_r10 = LeftPointer.addOrReplaceChild("left_arm_r10", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-0.3522F, 1.0061F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(-0.0429F, -0.3585F, 0.0095F, -0.0865F, 0.0114F, 0.1304F));
		PartDefinition left_arm_r11 = LeftPointer.addOrReplaceChild("left_arm_r11", CubeListBuilder.create().texOffs(32, 50).mirror().addBox(-0.675F, 0.3375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)).mirror(false),
				PartPose.offsetAndRotation(-0.0429F, 0.1415F, 0.0095F, -0.0873F, 0.0F, 0.0F));
		PartDefinition LeftIndex = LeftArm.addOrReplaceChild("LeftIndex", CubeListBuilder.create(), PartPose.offset(2.9429F, 9.596F, 1.0095F));
		PartDefinition left_arm_r12 = LeftIndex.addOrReplaceChild("left_arm_r12", CubeListBuilder.create().texOffs(50, 11).mirror().addBox(-0.325F, -1.5695F, 0.5695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false),
				PartPose.offsetAndRotation(-0.0429F, -0.1085F, -0.0095F, 0.8727F, 0.0F, 0.0F));
		PartDefinition left_arm_r13 = LeftIndex.addOrReplaceChild("left_arm_r13",
				CubeListBuilder.create().texOffs(12, 45).mirror().addBox(-0.375F, -1.8625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false).texOffs(8, 45).mirror()
						.addBox(-0.325F, -0.8625F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false).texOffs(4, 50).mirror().addBox(-0.525F, 0.5125F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(50, 2)
						.mirror().addBox(-0.675F, 0.3375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-0.0429F, -0.1085F, -0.0095F, 0.0873F, 0.0F, 0.0F));
		PartDefinition left_arm_r14 = LeftIndex.addOrReplaceChild("left_arm_r14", CubeListBuilder.create().texOffs(8, 50).mirror().addBox(-0.425F, -0.7563F, -0.7563F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(-0.0429F, -0.1085F, -0.0095F, -0.6981F, 0.0F, 0.0F));
		PartDefinition left_arm_r15 = LeftIndex.addOrReplaceChild("left_arm_r15", CubeListBuilder.create().texOffs(44, 18).mirror().addBox(-0.3522F, 1.0061F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(-0.0429F, -0.3585F, -0.0095F, 0.0865F, -0.0114F, 0.1304F));
		PartDefinition left_arm_r16 = LeftIndex.addOrReplaceChild("left_arm_r16", CubeListBuilder.create().texOffs(32, 50).mirror().addBox(-0.675F, 0.3375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)).mirror(false),
				PartPose.offsetAndRotation(-0.0429F, 0.1415F, -0.0095F, 0.0873F, 0.0F, 0.0F));
		PartDefinition LeftShoulderPad = LeftArm.addOrReplaceChild("LeftShoulderPad", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition shoulderpad_r58 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r58", CubeListBuilder.create().texOffs(44, 24).mirror().addBox(-0.3568F, 1.0961F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2655F, 0.0996F, -2.2784F, -0.0097F, -0.218F, 0.0447F));
		PartDefinition shoulderpad_r59 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r59", CubeListBuilder.create().texOffs(36, 48).mirror().addBox(-0.0489F, 2.0359F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3052F, -0.1757F, -2.2696F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r60 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r60", CubeListBuilder.create().texOffs(48, 34).mirror().addBox(-0.0489F, 2.0359F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2883F, -0.0772F, -2.2733F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r61 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r61", CubeListBuilder.create().texOffs(48, 32).mirror().addBox(-0.0489F, 2.0359F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2713F, 0.0213F, -2.2771F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r62 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r62", CubeListBuilder.create().texOffs(32, 48).mirror().addBox(-0.0489F, 2.0359F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2544F, 0.1198F, -2.2808F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r63 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r63", CubeListBuilder.create().texOffs(38, 28).mirror().addBox(-1.0489F, 1.0359F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.1582F, 0.1024F, -2.3022F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r64 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r64", CubeListBuilder.create().texOffs(38, 25).mirror().addBox(3.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(-1.3797F, 2.1926F, 2.6053F, -0.025F, 0.0357F, 0.0F));
		PartDefinition shoulderpad_r65 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r65", CubeListBuilder.create().texOffs(12, 36).mirror().addBox(3.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(-1.3012F, 0.7423F, 2.6708F, -0.025F, 0.0357F, 0.0F));
		PartDefinition shoulderpad_r66 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r66", CubeListBuilder.create().texOffs(6, 36).mirror().addBox(3.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(-1.1764F, -0.5077F, 2.726F, -0.025F, 0.0357F, 0.0F));
		PartDefinition shoulderpad_r67 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r67", CubeListBuilder.create().texOffs(38, 31).mirror().addBox(3.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(-1.0553F, -1.2574F, 2.7684F, -0.025F, 0.0357F, 0.0F));
		PartDefinition shoulderpad_r68 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r68", CubeListBuilder.create().texOffs(8, 31).mirror().addBox(-0.5751F, 1.0052F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3965F, 0.196F, 1.4351F, 0.0F, -0.0873F, 0.0436F));
		PartDefinition shoulderpad_r69 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r69", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false).texOffs(0, 31)
				.mirror().addBox(-0.5F, -1.0F, -3.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(3.325F, 2.2F, 0.5F, 0.0F, 0.0F, 0.0436F));
		PartDefinition shoulderpad_r70 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r70", CubeListBuilder.create().texOffs(38, 41).mirror().addBox(-0.3223F, -0.9068F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2684F, 0.1496F, -2.3547F, -0.0097F, -0.218F, 0.0447F));
		PartDefinition shoulderpad_r71 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r71", CubeListBuilder.create().texOffs(48, 30).mirror().addBox(-0.2355F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3652F, -0.1154F, -2.3333F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r72 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r72", CubeListBuilder.create().texOffs(48, 28).mirror().addBox(-0.2355F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3991F, -0.3124F, -2.3258F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r73 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r73", CubeListBuilder.create().texOffs(28, 48).mirror().addBox(-0.2355F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.4216F, -1.0191F, -2.3208F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r74 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r74", CubeListBuilder.create().texOffs(48, 26).mirror().addBox(-0.2355F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.4047F, -0.9206F, -2.3245F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r75 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r75", CubeListBuilder.create().texOffs(48, 24).mirror().addBox(-0.2355F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3821F, -0.2139F, -2.3295F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r76 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r76", CubeListBuilder.create().texOffs(46, 3).mirror().addBox(-0.2355F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3482F, -0.0169F, -2.337F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r77 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r77", CubeListBuilder.create().texOffs(24, 48).mirror().addBox(-0.2355F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3313F, 0.0815F, -2.3408F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r78 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r78", CubeListBuilder.create().texOffs(48, 22).mirror().addBox(-0.2355F, 1.0456F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3143F, 0.18F, -2.3445F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r79 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r79", CubeListBuilder.create().texOffs(42, 39).mirror().addBox(-0.2355F, 0.0456F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2182F, 0.1626F, -2.3659F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r80 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r80", CubeListBuilder.create().texOffs(30, 38).mirror().addBox(-1.2355F, -0.9544F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.122F, 0.1453F, -2.3872F, -0.0097F, -0.218F, 0.0447F));
		PartDefinition shoulderpad_r81 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r81", CubeListBuilder.create().texOffs(24, 39).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(2.9006F, 0.6147F, -2.4363F, -0.0573F, -0.2106F, 0.2679F));
		PartDefinition shoulderpad_r82 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r82", CubeListBuilder.create().texOffs(16, 30).mirror().addBox(-0.5406F, -0.9977F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3965F, 0.246F, 1.4851F, 0.0F, -0.0873F, 0.0436F));
		PartDefinition shoulderpad_r83 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r83", CubeListBuilder.create().texOffs(32, 29).mirror().addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false).texOffs(8, 25)
				.mirror().addBox(-0.5F, -1.5F, -3.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(3.425F, 0.75F, 0.5F, 0.0F, 0.0F, 0.0436F));
		PartDefinition shoulderpad_r84 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r84", CubeListBuilder.create().texOffs(22, 42).mirror().addBox(-0.2628F, -2.4109F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2713F, 0.3996F, -2.4318F, -0.0097F, -0.218F, 0.0447F));
		PartDefinition shoulderpad_r85 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r85", CubeListBuilder.create().texOffs(48, 20).mirror().addBox(-0.4221F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.4509F, -0.0624F, -2.392F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r86 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r86", CubeListBuilder.create().texOffs(48, 18).mirror().addBox(-0.4221F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.4339F, 0.0361F, -2.3957F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r87 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r87", CubeListBuilder.create().texOffs(48, 16).mirror().addBox(-0.4221F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.417F, 0.1346F, -2.3995F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r88 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r88", CubeListBuilder.create().texOffs(16, 48).mirror().addBox(-0.4221F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.4F, 0.2331F, -2.4033F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r89 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r89", CubeListBuilder.create().texOffs(12, 48).mirror().addBox(-0.4221F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3831F, 0.3315F, -2.407F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r90 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r90", CubeListBuilder.create().texOffs(20, 51).mirror().addBox(-0.55F, -0.45F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.5893F, -0.6431F, -2.4125F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r91 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r91", CubeListBuilder.create().texOffs(48, 9).mirror().addBox(-0.4221F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.4734F, -0.7691F, -2.387F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r92 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r92", CubeListBuilder.create().texOffs(8, 48).mirror().addBox(-0.4221F, -0.4446F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3661F, 0.43F, -2.4108F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r93 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r93", CubeListBuilder.create().texOffs(30, 45).mirror().addBox(-0.4221F, -1.4446F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.27F, 0.4126F, -2.4321F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r94 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r94", CubeListBuilder.create().texOffs(42, 12).mirror().addBox(-0.4221F, -2.4446F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.1738F, 0.3953F, -2.4534F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r95 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r95", CubeListBuilder.create().texOffs(24, 35).mirror().addBox(-1.4221F, -2.4446F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.0865F, 0.3707F, -2.4728F, -0.0536F, -0.2116F, 0.25F));
		PartDefinition shoulderpad_r96 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r96", CubeListBuilder.create().texOffs(0, 25).mirror().addBox(-0.4812F, -2.5018F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3965F, 0.496F, 1.5351F, 0.0F, -0.0873F, 0.0436F));
		PartDefinition shoulderpad_r97 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r97", CubeListBuilder.create().texOffs(16, 25).mirror().addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false).texOffs(22, 24)
				.mirror().addBox(-0.5F, -1.5F, -3.35F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(3.55F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0436F));
		PartDefinition shoulderpad_r98 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r98", CubeListBuilder.create().texOffs(48, 7).mirror().addBox(-0.4074F, -1.9554F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2983F, 0.3672F, -2.4932F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r99 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r99", CubeListBuilder.create().texOffs(48, 5).mirror().addBox(-0.4074F, -1.9554F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2813F, 0.4657F, -2.4969F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r100 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r100", CubeListBuilder.create().texOffs(4, 48).mirror().addBox(-0.4074F, -1.9554F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2644F, 0.5642F, -2.5007F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r101 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r101", CubeListBuilder.create().texOffs(46, 47).mirror().addBox(-0.4074F, -1.9554F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2474F, 0.6626F, -2.5044F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r102 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r102", CubeListBuilder.create().texOffs(44, 21).mirror().addBox(-0.4074F, -2.9554F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.1513F, 0.6453F, -2.5257F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r103 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r103", CubeListBuilder.create().texOffs(38, 22).mirror().addBox(-1.4074F, -2.9554F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.0551F, 0.6279F, -2.5471F, -0.0385F, -0.2148F, 0.1787F));
		PartDefinition shoulderpad_r104 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r104", CubeListBuilder.create().texOffs(46, 42).mirror().addBox(-0.1816F, -2.9154F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.2488F, 0.6496F, -2.5041F, -0.0097F, -0.218F, 0.0447F));
		PartDefinition shoulderpad_r105 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r105", CubeListBuilder.create().texOffs(30, 24).mirror().addBox(-0.4249F, -3.0052F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F)).mirror(false),
				PartPose.offsetAndRotation(3.3965F, 0.746F, 1.5851F, 0.0F, -0.0873F, 0.0436F));
		PartDefinition shoulderpad_r106 = LeftShoulderPad.addOrReplaceChild("shoulderpad_r106", CubeListBuilder.create().texOffs(32, 34).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)).mirror(false).texOffs(24, 30)
				.mirror().addBox(-0.5F, -1.0F, -3.4F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F)).mirror(false), PartPose.offsetAndRotation(3.65F, -1.25F, 0.5F, 0.0F, 0.0F, 0.0436F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
