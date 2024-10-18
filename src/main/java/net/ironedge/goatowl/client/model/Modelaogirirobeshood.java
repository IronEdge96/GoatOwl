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
public class Modelaogirirobeshood<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("goatowl", "modelaogirirobeshood"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelaogirirobeshood(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -8.75F, -2.1F, 9.0F, 8.0F, 6.4F, new CubeDeformation(-0.2F)).texOffs(0, 14).addBox(-3.5F, -1.5217F, -2.1F, 7.0F, 2.0F, 6.4F, new CubeDeformation(-0.2F)).texOffs(14, 40)
						.addBox(3.5F, -8.2F, -4.7F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(30, 39).addBox(0.0F, -8.2F, -4.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(40, 22)
						.addBox(2.0F, -8.2F, -4.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(14, 40).mirror().addBox(-4.5F, -8.2F, -4.7F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(40, 22).mirror()
						.addBox(-4.0F, -8.2F, -4.7F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(30, 39).mirror().addBox(-3.0F, -8.2F, -4.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false).texOffs(0, 22)
						.addBox(-4.5F, -8.75F, -4.7F, 9.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).texOffs(30, 31).addBox(3.849F, -2.9767F, -1.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 26)
						.addBox(3.849F, -2.9767F, -4.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 26).mirror().addBox(-4.849F, -2.9767F, -4.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 31).mirror()
						.addBox(-4.849F, -2.9767F, -1.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition dontTouch_r1 = Head.addOrReplaceChild("dontTouch_r1", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-0.5F, -3.0F, -1.5F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.3715F, -2.8284F, -0.4F, 0.0F, 0.0F, 0.3011F));
		PartDefinition dontTouch_r2 = Head.addOrReplaceChild("dontTouch_r2", CubeListBuilder.create().texOffs(42, 12).mirror().addBox(-0.525F, -0.9F, -0.5125F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.4283F, -5.7815F, -3.9875F, 0.0F, 0.0F, 0.3011F));
		PartDefinition dontTouch_r3 = Head.addOrReplaceChild("dontTouch_r3", CubeListBuilder.create().texOffs(16, 26).mirror().addBox(-0.7501F, -0.9999F, -3.55F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.6452F, -0.6399F, -0.95F, 0.0F, 0.0F, -0.6544F));
		PartDefinition dontTouch_r4 = Head.addOrReplaceChild("dontTouch_r4", CubeListBuilder.create().texOffs(42, 39).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.4986F, 0.9492F, -2.6162F, 0.3398F, 0.1467F, -1.0564F));
		PartDefinition dontTouch_r5 = Head.addOrReplaceChild("dontTouch_r5", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3031F, 0.9347F, -2.0379F, 0.3669F, 0.0403F, -0.7687F));
		PartDefinition dontTouch_r6 = Head.addOrReplaceChild("dontTouch_r6", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-0.286F, 0.1401F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.438F, 1.6327F, -2.2959F, 0.3669F, 0.0403F, -0.9432F));
		PartDefinition dontTouch_r7 = Head.addOrReplaceChild("dontTouch_r7", CubeListBuilder.create().texOffs(42, 39).mirror().addBox(-0.3612F, -2.6517F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.438F, 1.6327F, -2.2959F, 0.3398F, 0.1467F, -1.2309F));
		PartDefinition dontTouch_r8 = Head.addOrReplaceChild("dontTouch_r8", CubeListBuilder.create().texOffs(30, 43).mirror().addBox(-1.267F, -0.9299F, -0.4481F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.1919F, -0.0584F, -3.5278F, -0.1624F, 0.0722F, -1.2384F));
		PartDefinition dontTouch_r9 = Head.addOrReplaceChild("dontTouch_r9", CubeListBuilder.create().texOffs(26, 14).mirror().addBox(-0.7501F, -0.9999F, -3.55F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.3543F, 0.4591F, -0.1774F, 0.0F, 0.0F, -1.2309F));
		PartDefinition dontTouch_r10 = Head.addOrReplaceChild("dontTouch_r10", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-0.7501F, -0.9999F, -3.55F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.1332F, -0.5349F, -0.75F, 0.0F, 0.0F, -1.0564F));
		PartDefinition dontTouch_r11 = Head.addOrReplaceChild("dontTouch_r11", CubeListBuilder.create().texOffs(36, 43).addBox(-0.7507F, -1.1154F, -0.4481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1611F, -0.0176F, 2.8248F, 0.5433F, 0.0842F, 1.094F));
		PartDefinition dontTouch_r12 = Head.addOrReplaceChild("dontTouch_r12", CubeListBuilder.create().texOffs(30, 0).addBox(-1.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2128F, -0.6373F, 1.2014F, -0.2182F, 0.0F, 1.4055F));
		PartDefinition dontTouch_r13 = Head.addOrReplaceChild("dontTouch_r13", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.8914F, -0.6087F, 1.1F, 0.0F, 0.0F, 0.4799F));
		PartDefinition dontTouch_r14 = Head.addOrReplaceChild("dontTouch_r14", CubeListBuilder.create().texOffs(30, 31).mirror().addBox(-1.0F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.4469F, -0.7922F, 1.1F, 0.0F, 0.0F, 0.9162F));
		PartDefinition dontTouch_r15 = Head.addOrReplaceChild("dontTouch_r15", CubeListBuilder.create().texOffs(30, 31).addBox(0.0F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4469F, -0.7922F, 1.1F, 0.0F, 0.0F, -0.9162F));
		PartDefinition dontTouch_r16 = Head.addOrReplaceChild("dontTouch_r16", CubeListBuilder.create().texOffs(36, 43).mirror().addBox(-0.2493F, -1.1154F, -0.4481F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.1611F, -0.0176F, 2.8248F, 0.5433F, -0.0842F, -1.094F));
		PartDefinition dontTouch_r17 = Head.addOrReplaceChild("dontTouch_r17", CubeListBuilder.create().texOffs(0, 35).addBox(0.0F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8914F, -0.6087F, 1.1F, 0.0F, 0.0F, -0.4799F));
		PartDefinition dontTouch_r18 = Head.addOrReplaceChild("dontTouch_r18", CubeListBuilder.create().texOffs(6, 43).mirror().addBox(-1.267F, -0.9299F, -0.5519F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.1818F, -0.0516F, 2.1163F, 0.206F, -0.0722F, -1.2384F));
		PartDefinition dontTouch_r19 = Head.addOrReplaceChild("dontTouch_r19", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-1.5F, -2.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2128F, -0.6373F, 1.2014F, -0.2182F, 0.0F, -1.4055F));
		PartDefinition dontTouch_r20 = Head.addOrReplaceChild("dontTouch_r20", CubeListBuilder.create().texOffs(25, 23).mirror().addBox(-1.0F, -1.2501F, 0.05F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5044F, 1.1141F, -2.1653F, 0.0F, 0.0F, -1.3618F));
		PartDefinition dontTouch_r21 = Head.addOrReplaceChild("dontTouch_r21", CubeListBuilder.create().texOffs(25, 23).addBox(-1.0F, -1.2501F, 0.05F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5044F, 1.1141F, -2.1653F, 0.0F, 0.0F, 1.3618F));
		PartDefinition dontTouch_r22 = Head.addOrReplaceChild("dontTouch_r22", CubeListBuilder.create().texOffs(16, 31).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3715F, -2.8284F, -0.4F, 0.0F, 0.0F, -0.3011F));
		PartDefinition dontTouch_r23 = Head.addOrReplaceChild("dontTouch_r23", CubeListBuilder.create().texOffs(22, 40).mirror().addBox(-2.8F, -4.9F, -0.5625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.1567F, -3.8593F, -3.9375F, 0.0F, 0.0F, 1.1127F));
		PartDefinition dontTouch_r24 = Head.addOrReplaceChild("dontTouch_r24", CubeListBuilder.create().texOffs(0, 43).addBox(-0.714F, 0.1401F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.438F, 1.6327F, -2.2959F, 0.3669F, -0.0403F, 0.9432F));
		PartDefinition dontTouch_r25 = Head.addOrReplaceChild("dontTouch_r25", CubeListBuilder.create().texOffs(42, 39).addBox(-0.6388F, -2.6517F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.438F, 1.6327F, -2.2959F, 0.3398F, -0.1467F, 1.2309F));
		PartDefinition dontTouch_r26 = Head.addOrReplaceChild("dontTouch_r26", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3031F, 0.9347F, -2.0379F, 0.3669F, -0.0403F, 0.7687F));
		PartDefinition dontTouch_r27 = Head.addOrReplaceChild("dontTouch_r27", CubeListBuilder.create().texOffs(42, 39).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4986F, 0.9492F, -2.6162F, 0.3398F, -0.1467F, 1.0564F));
		PartDefinition dontTouch_r28 = Head.addOrReplaceChild("dontTouch_r28", CubeListBuilder.create().texOffs(16, 26).addBox(-0.2499F, -0.9999F, -3.55F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6452F, -0.6399F, -0.95F, 0.0F, 0.0F, 0.6544F));
		PartDefinition dontTouch_r29 = Head.addOrReplaceChild("dontTouch_r29", CubeListBuilder.create().texOffs(26, 14).addBox(-1.2499F, -0.9999F, -3.55F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3543F, 0.4591F, -0.1774F, 0.0F, 0.0F, 1.2309F));
		PartDefinition dontTouch_r30 = Head.addOrReplaceChild("dontTouch_r30", CubeListBuilder.create().texOffs(0, 26).addBox(-0.2499F, -0.9999F, -3.55F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1332F, -0.5349F, -0.75F, 0.0F, 0.0F, 1.0564F));
		PartDefinition dontTouch_r31 = Head.addOrReplaceChild("dontTouch_r31", CubeListBuilder.create().texOffs(6, 43).addBox(-0.733F, -0.9299F, -0.5519F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1818F, -0.0516F, 2.1163F, 0.206F, 0.0722F, 1.2384F));
		PartDefinition dontTouch_r32 = Head.addOrReplaceChild("dontTouch_r32", CubeListBuilder.create().texOffs(30, 43).addBox(-0.733F, -0.9299F, -0.4481F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1919F, -0.0584F, -3.5278F, -0.1624F, -0.0722F, 1.2384F));
		PartDefinition dontTouch_r33 = Head.addOrReplaceChild("dontTouch_r33", CubeListBuilder.create().texOffs(42, 12).addBox(-0.475F, -0.9F, -0.5125F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4283F, -5.7815F, -3.9875F, 0.0F, 0.0F, -0.3011F));
		PartDefinition dontTouch_r34 = Head.addOrReplaceChild("dontTouch_r34", CubeListBuilder.create().texOffs(22, 40).addBox(1.8F, -4.9F, -0.5625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1567F, -3.8593F, -3.9375F, 0.0F, 0.0F, -1.1127F));
		PartDefinition dontTouch_r35 = Head.addOrReplaceChild("dontTouch_r35", CubeListBuilder.create().texOffs(42, 19).addBox(-3.5F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.0774F, 0.251F, 2.7355F, -0.5301F, 0.1622F, 0.1077F));
		PartDefinition dontTouch_r36 = Head.addOrReplaceChild("dontTouch_r36", CubeListBuilder.create().texOffs(40, 27).addBox(-0.5F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0774F, 0.251F, 2.7355F, -0.5301F, -0.1622F, -0.1077F));
		PartDefinition dontTouch_r37 = Head.addOrReplaceChild("dontTouch_r37", CubeListBuilder.create().texOffs(30, 9).addBox(-3.5F, 0.05F, 1.2F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, -1.6665F, 1.6269F, -0.5236F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
