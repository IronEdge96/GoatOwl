
import org.lwjgl.system.Pointer;

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

import net.ironedge.goatowl.ReaperKakujaAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelreaperkakuja<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "reaperkakuja"), "main");
	private final ModelPart root;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart TailSegment;
	private final ModelPart TailSegment2;
	private final ModelPart TailSegment3;
	private final ModelPart TailSegment4;
	private final ModelPart Tail1;
	private final ModelPart RightTailSegment;
	private final ModelPart RightTailSegment2;
	private final ModelPart RightTailSegment3;
	private final ModelPart RightTailSegment4;
	private final ModelPart RightTailSegment5;
	private final ModelPart RightTailSegment6;
	private final ModelPart RightTailSegment7;
	private final ModelPart RightTailSegment8;
	private final ModelPart RightTailSegment9;
	private final ModelPart RightTopJaw;
	private final ModelPart RightBottomJaw;
	private final ModelPart RightTongue;
	private final ModelPart RightTongue2;
	private final ModelPart RightTongue3;
	private final ModelPart Tail2;
	private final ModelPart LeftTailSegment;
	private final ModelPart LeftTailSegment2;
	private final ModelPart LeftTailSegment3;
	private final ModelPart LeftTailSegment4;
	private final ModelPart LeftTailSegment5;
	private final ModelPart LeftTailSegment6;
	private final ModelPart LeftTailSegment7;
	private final ModelPart LeftTailSegment8;
	private final ModelPart LeftTailSegment9;
	private final ModelPart LeftTopJaw;
	private final ModelPart LeftBottomJaw;
	private final ModelPart LeftTongue;
	private final ModelPart LeftTongue2;
	private final ModelPart LeftTongue3;
	private final ModelPart RightArm;
	private final ModelPart RightHand;
	private final ModelPart Fingers;
	private final ModelPart Thumb;
	private final ModelPart ThumbDigit;
	private final ModelPart ThumbTIp;
	private final ModelPart Pointer;
	private final ModelPart PointerDigit;
	private final ModelPart PointerTip;
	private final ModelPart Index;
	private final ModelPart IndexDigit;
	private final ModelPart IndexTip;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelreaperkakuja(ModelPart root) {
		this.root = root;
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.TailSegment = this.Tail.getChild("TailSegment");
		this.TailSegment2 = this.TailSegment.getChild("TailSegment2");
		this.TailSegment3 = this.TailSegment2.getChild("TailSegment3");
		this.TailSegment4 = this.TailSegment3.getChild("TailSegment4");
		this.Tail1 = this.TailSegment4.getChild("Tail1");
		this.RightTailSegment = this.Tail1.getChild("RightTailSegment");
		this.RightTailSegment2 = this.RightTailSegment.getChild("RightTailSegment2");
		this.RightTailSegment3 = this.RightTailSegment2.getChild("RightTailSegment3");
		this.RightTailSegment4 = this.RightTailSegment3.getChild("RightTailSegment4");
		this.RightTailSegment5 = this.RightTailSegment4.getChild("RightTailSegment5");
		this.RightTailSegment6 = this.RightTailSegment5.getChild("RightTailSegment6");
		this.RightTailSegment7 = this.RightTailSegment6.getChild("RightTailSegment7");
		this.RightTailSegment8 = this.RightTailSegment7.getChild("RightTailSegment8");
		this.RightTailSegment9 = this.RightTailSegment8.getChild("RightTailSegment9");
		this.RightTopJaw = this.RightTailSegment9.getChild("RightTopJaw");
		this.RightBottomJaw = this.RightTailSegment9.getChild("RightBottomJaw");
		this.RightTongue = this.RightBottomJaw.getChild("RightTongue");
		this.RightTongue2 = this.RightTongue.getChild("RightTongue2");
		this.RightTongue3 = this.RightTongue2.getChild("RightTongue3");
		this.Tail2 = this.TailSegment4.getChild("Tail2");
		this.LeftTailSegment = this.Tail2.getChild("LeftTailSegment");
		this.LeftTailSegment2 = this.LeftTailSegment.getChild("LeftTailSegment2");
		this.LeftTailSegment3 = this.LeftTailSegment2.getChild("LeftTailSegment3");
		this.LeftTailSegment4 = this.LeftTailSegment3.getChild("LeftTailSegment4");
		this.LeftTailSegment5 = this.LeftTailSegment4.getChild("LeftTailSegment5");
		this.LeftTailSegment6 = this.LeftTailSegment5.getChild("LeftTailSegment6");
		this.LeftTailSegment7 = this.LeftTailSegment6.getChild("LeftTailSegment7");
		this.LeftTailSegment8 = this.LeftTailSegment7.getChild("LeftTailSegment8");
		this.LeftTailSegment9 = this.LeftTailSegment8.getChild("LeftTailSegment9");
		this.LeftTopJaw = this.LeftTailSegment9.getChild("LeftTopJaw");
		this.LeftBottomJaw = this.LeftTailSegment9.getChild("LeftBottomJaw");
		this.LeftTongue = this.LeftBottomJaw.getChild("LeftTongue");
		this.LeftTongue2 = this.LeftTongue.getChild("LeftTongue2");
		this.LeftTongue3 = this.LeftTongue2.getChild("LeftTongue3");
		this.RightArm = root.getChild("RightArm");
		this.RightHand = this.RightArm.getChild("RightHand");
		this.Fingers = this.RightHand.getChild("Fingers");
		this.Thumb = this.Fingers.getChild("Thumb");
		this.ThumbDigit = this.Thumb.getChild("ThumbDigit");
		this.ThumbTIp = this.ThumbDigit.getChild("ThumbTIp");
		this.Pointer = this.Fingers.getChild("Pointer");
		this.PointerDigit = this.Pointer.getChild("PointerDigit");
		this.PointerTip = this.PointerDigit.getChild("PointerTip");
		this.Index = this.Fingers.getChild("Index");
		this.IndexDigit = this.Index.getChild("IndexDigit");
		this.IndexTip = this.IndexDigit.getChild("IndexTip");
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
		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.05F, 8.3F, 2.725F));
		PartDefinition TailSegment = Tail.addOrReplaceChild("TailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition TailSegment2 = TailSegment.addOrReplaceChild("TailSegment2", CubeListBuilder.create().texOffs(20, 14).addBox(-1.0F, -0.85F, -0.875F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.15F)), PartPose.offset(0.025F, 0.0F, -0.7F));
		PartDefinition TailSegment3 = TailSegment2.addOrReplaceChild("TailSegment3", CubeListBuilder.create().texOffs(16, 32).addBox(-1.0F, -0.85F, -0.95F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 0.0F, 6.275F));
		PartDefinition TailSegment4 = TailSegment3.addOrReplaceChild("TailSegment4",
				CubeListBuilder.create().texOffs(56, 63).addBox(-1.0F, -1.0F, -1.05F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(64, 12).addBox(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).texOffs(68, 43)
						.addBox(-1.0F, -1.0F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(58, 50).addBox(-1.0F, -1.0F, 1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offset(0.0F, 0.15F, 5.1F));
		PartDefinition Tail1 = TailSegment4.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offset(-0.15F, -0.15F, 1.325F));
		PartDefinition RightTailSegment = Tail1.addOrReplaceChild("RightTailSegment", CubeListBuilder.create(), PartPose.offset(0.0F, 0.15F, -0.025F));
		PartDefinition RightTailSegment2 = RightTailSegment.addOrReplaceChild("RightTailSegment2", CubeListBuilder.create().texOffs(36, 70).addBox(-0.5F, 0.0F, 0.4982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -0.6F, -0.4F, 0.0F, 0.0F, 0.0F));
		PartDefinition RightTailSegment3 = RightTailSegment2.addOrReplaceChild("RightTailSegment3", CubeListBuilder.create().texOffs(68, 46).addBox(-0.5F, -0.5F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.5F, 2.4982F));
		PartDefinition RightTailSegment4 = RightTailSegment3.addOrReplaceChild("RightTailSegment4", CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 2.5F));
		PartDefinition RightTailSegment5 = RightTailSegment4.addOrReplaceChild("RightTailSegment5", CubeListBuilder.create().texOffs(46, 72).addBox(-0.5F, -0.5F, 0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.45F)),
				PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition RightTailSegment6 = RightTailSegment5.addOrReplaceChild("RightTailSegment6", CubeListBuilder.create().texOffs(72, 49).addBox(-0.5F, -0.5F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)),
				PartPose.offset(0.0F, 0.0F, 0.9F));
		PartDefinition RightTailSegment7 = RightTailSegment6.addOrReplaceChild("RightTailSegment7", CubeListBuilder.create().texOffs(50, 72).addBox(-0.5F, -0.5F, 0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.65F)),
				PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition RightTailSegment8 = RightTailSegment7.addOrReplaceChild("RightTailSegment8", CubeListBuilder.create().texOffs(72, 51).addBox(-0.5F, -0.5F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)),
				PartPose.offset(0.0F, 0.0F, 1.3F));
		PartDefinition cube_r1 = RightTailSegment8.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 72).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.5F, -0.45F, 2.15F, -0.0087F, 0.0F, 0.0F));
		PartDefinition RightTailSegment9 = RightTailSegment8.addOrReplaceChild("RightTailSegment9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition RightTopJaw = RightTailSegment9
				.addOrReplaceChild(
						"RightTopJaw", CubeListBuilder.create().texOffs(64, 33).addBox(-0.721F, 0.3002F, 0.3095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)).texOffs(64, 50)
								.addBox(-0.258F, 0.3002F, 0.3095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)).texOffs(64, 63).addBox(-0.508F, 0.7502F, 0.3095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(0.0085F, -0.0502F, 0.0905F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r2 = RightTopJaw.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 54).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-0.421F, 0.6002F, 1.2095F, -0.1373F, 0.014F, -0.0037F));
		PartDefinition cube_r3 = RightTopJaw.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(70, 22).addBox(-1.5F, -0.5F, 0.7471F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.2042F, -0.1301F, 2.1294F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r4 = RightTopJaw.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 69).addBox(-1.5F, -0.5F, 0.7471F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.7788F, -0.1301F, 2.1294F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r5 = RightTopJaw.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 28).addBox(-0.2636F, -0.5F, -3.2799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.375F)),
				PartPose.offsetAndRotation(0.5509F, -0.4938F, 4.0188F, 0.0873F, -0.0261F, -0.0023F));
		PartDefinition cube_r6 = RightTopJaw.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 18).addBox(-0.7364F, -0.5F, -3.2799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.375F)),
				PartPose.offsetAndRotation(-0.568F, -0.4938F, 4.0188F, 0.0873F, 0.0261F, 0.0023F));
		PartDefinition cube_r7 = RightTopJaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 58).addBox(-0.7364F, -0.5F, -2.2799F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.568F, -0.2188F, 3.1438F, 0.0873F, 0.0261F, 0.0023F));
		PartDefinition cube_r8 = RightTopJaw.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 59).addBox(-0.2636F, -0.5F, -2.2799F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.5509F, -0.2188F, 3.1438F, 0.0873F, -0.0261F, -0.0023F));
		PartDefinition cube_r9 = RightTopJaw.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 64).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.442F, 0.6002F, 1.2095F, -0.1373F, -0.014F, 0.0037F));
		PartDefinition RightBottomJaw = RightTailSegment9.addOrReplaceChild("RightBottomJaw", CubeListBuilder.create(), PartPose.offset(0.0F, -0.15F, 0.3F));
		PartDefinition cube_r10 = RightBottomJaw.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(68, 19).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(26, 59).addBox(0.8998F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.6999F, -0.5255F, 0.8514F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r11 = RightBottomJaw.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(56, 67).addBox(-0.5F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(42, 66).addBox(0.8998F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.6999F, -0.3013F, 0.813F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r12 = RightBottomJaw.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(68, 0).addBox(-0.5F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(12, 69).addBox(-0.5F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(68, 37)
						.addBox(0.8998F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(72, 14).addBox(-0.3002F, -0.5F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(56, 39)
						.addBox(0.8998F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.6999F, -1.0537F, 2.266F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r13 = RightBottomJaw.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 61).addBox(-1.3098F, -0.6146F, -1.8229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(60, 39).addBox(-1.3098F, -0.4146F, -1.8229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, -0.5679F, 2.1591F, 0.2926F, 0.0418F, 0.0126F));
		PartDefinition cube_r14 = RightBottomJaw.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(40, 12).addBox(-1.275F, -0.6146F, 0.2161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(6, 72).addBox(-0.725F, -0.6146F, 0.2161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(18, 71)
						.addBox(-0.725F, -0.4146F, 0.2161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(38, 21).addBox(-1.275F, -0.4146F, 0.2161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, -0.5679F, 2.1591F, 0.2923F, 0.0F, 0.0F));
		PartDefinition cube_r15 = RightBottomJaw.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(48, 61).addBox(0.3098F, -0.6146F, -1.8229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(40, 62).addBox(0.3098F, -0.4146F, -1.8229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, -0.5679F, 2.1591F, 0.2926F, -0.0418F, -0.0126F));
		PartDefinition cube_r16 = RightBottomJaw.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(68, 6).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.5F, -0.5686F, -0.1556F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r17 = RightBottomJaw.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(16, 68).addBox(-1.5F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.5F, -0.675F, 1.025F, 0.4363F, 0.0F, 0.0F));
		PartDefinition RightTongue = RightBottomJaw.addOrReplaceChild("RightTongue", CubeListBuilder.create(), PartPose.offset(-0.0249F, -0.103F, -0.2688F));
		PartDefinition cube_r18 = RightTongue.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(46, 37).addBox(-0.5F, -0.5F, -1.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.5F, 0.0518F, 1.0818F, 0.2618F, 0.0F, 0.0F));
		PartDefinition RightTongue2 = RightTongue.addOrReplaceChild("RightTongue2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2395F, 2.4105F));
		PartDefinition cube_r19 = RightTongue2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(48, 34).addBox(-0.5F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.5F, -0.0131F, 0.9747F, 0.0436F, 0.0F, 0.0F));
		PartDefinition RightTongue3 = RightTongue2.addOrReplaceChild("RightTongue3", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0349F, 1.2992F));
		PartDefinition cube_r20 = RightTongue3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(44, 21).addBox(-0.5F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5F, 0.0087F, -0.0748F, 0.0436F, 0.0F, 0.0F));
		PartDefinition Tail2 = TailSegment4.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offset(0.15F, -0.15F, 1.325F));
		PartDefinition LeftTailSegment = Tail2.addOrReplaceChild("LeftTailSegment", CubeListBuilder.create(), PartPose.offset(0.0F, 0.15F, -0.025F));
		PartDefinition LeftTailSegment2 = LeftTailSegment.addOrReplaceChild("LeftTailSegment2", CubeListBuilder.create().texOffs(54, 70).addBox(-0.5F, 0.0F, 0.4982F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -0.6F, -0.4F, 0.0F, 0.0F, 0.0F));
		PartDefinition LeftTailSegment3 = LeftTailSegment2.addOrReplaceChild("LeftTailSegment3", CubeListBuilder.create().texOffs(6, 69).addBox(-0.5F, -0.5F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.5F, 2.4982F));
		PartDefinition LeftTailSegment4 = LeftTailSegment3.addOrReplaceChild("LeftTailSegment4", CubeListBuilder.create().texOffs(42, 69).addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 2.5F));
		PartDefinition LeftTailSegment5 = LeftTailSegment4.addOrReplaceChild("LeftTailSegment5", CubeListBuilder.create().texOffs(72, 53).addBox(-0.5F, -0.5F, 0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.45F)), PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition LeftTailSegment6 = LeftTailSegment5.addOrReplaceChild("LeftTailSegment6", CubeListBuilder.create().texOffs(72, 55).addBox(-0.5F, -0.5F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)), PartPose.offset(0.0F, 0.0F, 0.9F));
		PartDefinition LeftTailSegment7 = LeftTailSegment6.addOrReplaceChild("LeftTailSegment7", CubeListBuilder.create().texOffs(60, 72).addBox(-0.5F, -0.5F, 0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.65F)), PartPose.offset(0.0F, 0.0F, 1.1F));
		PartDefinition LeftTailSegment8 = LeftTailSegment7.addOrReplaceChild("LeftTailSegment8", CubeListBuilder.create().texOffs(72, 62).addBox(-0.5F, -0.5F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)), PartPose.offset(0.0F, 0.0F, 1.3F));
		PartDefinition cube_r21 = LeftTailSegment8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(72, 64).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(-0.5F, -0.45F, 2.15F, -0.0087F, 0.0F, 0.0F));
		PartDefinition LeftTailSegment9 = LeftTailSegment8.addOrReplaceChild("LeftTailSegment9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition LeftTopJaw = LeftTailSegment9
				.addOrReplaceChild(
						"LeftTopJaw", CubeListBuilder.create().texOffs(8, 65).addBox(-0.279F, 0.3002F, 0.3095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)).texOffs(48, 65)
								.addBox(-0.742F, 0.3002F, 0.3095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)).texOffs(66, 58).addBox(-0.492F, 0.7502F, 0.3095F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(-0.0085F, -0.0502F, 0.0905F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r22 = LeftTopJaw.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(34, 66).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.421F, 0.6002F, 1.2095F, -0.1373F, -0.014F, 0.0037F));
		PartDefinition cube_r23 = LeftTopJaw.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 70).addBox(-0.5F, -0.5F, 0.7471F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.2042F, -0.1301F, 2.1294F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r24 = LeftTopJaw.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(24, 70).addBox(-0.5F, -0.5F, 0.7471F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.7788F, -0.1301F, 2.1294F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r25 = LeftTopJaw.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(12, 37).addBox(-0.7364F, -0.5F, -3.2799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.375F)),
				PartPose.offsetAndRotation(-0.5509F, -0.4938F, 4.0188F, 0.0873F, 0.0261F, 0.0023F));
		PartDefinition cube_r26 = LeftTopJaw.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(72, 34).addBox(-0.2636F, -0.5F, -3.2799F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.375F)),
				PartPose.offsetAndRotation(0.568F, -0.4938F, 4.0188F, 0.0873F, -0.0261F, -0.0023F));
		PartDefinition cube_r27 = LeftTopJaw.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(58, 58).addBox(-0.2636F, -0.5F, -2.2799F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.568F, -0.2188F, 3.1438F, 0.0873F, -0.0261F, -0.0023F));
		PartDefinition cube_r28 = LeftTopJaw.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(60, 17).addBox(-0.7364F, -0.5F, -2.2799F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-0.5509F, -0.2188F, 3.1438F, 0.0873F, 0.0261F, 0.0023F));
		PartDefinition cube_r29 = LeftTopJaw.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-0.442F, 0.6002F, 1.2095F, -0.1373F, 0.014F, -0.0037F));
		PartDefinition LeftBottomJaw = LeftTailSegment9.addOrReplaceChild("LeftBottomJaw", CubeListBuilder.create(), PartPose.offset(0.0F, -0.15F, 0.3F));
		PartDefinition cube_r30 = LeftBottomJaw.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(68, 29).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(34, 63).addBox(-1.8998F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.6999F, -0.5255F, 0.8514F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r31 = LeftBottomJaw.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(64, 67).addBox(-1.5F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(68, 26).addBox(-1.8998F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.6999F, -0.3013F, 0.813F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r32 = LeftBottomJaw.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(68, 3).addBox(-1.5F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(42, 72).addBox(-0.5F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(68, 40)
						.addBox(-1.8998F, -0.5F, -1.3F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(72, 32).addBox(-1.6998F, -0.5F, -0.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(64, 37)
						.addBox(-1.8998F, -0.5F, -0.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.6999F, -1.0537F, 2.266F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r33 = LeftBottomJaw.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(8, 61).addBox(0.3098F, -0.6146F, -1.8229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(60, 43).addBox(0.3098F, -0.4146F, -1.8229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, -0.5679F, 2.1591F, 0.2926F, -0.0418F, -0.0126F));
		PartDefinition cube_r34 = LeftBottomJaw.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(66, 70).addBox(-0.725F, -0.6146F, 0.2161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(72, 12).addBox(-1.275F, -0.6146F, 0.2161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(0, 72)
						.addBox(-1.275F, -0.4146F, 0.2161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).texOffs(60, 70).addBox(-0.725F, -0.4146F, 0.2161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, -0.5679F, 2.1591F, 0.2923F, 0.0F, 0.0F));
		PartDefinition cube_r35 = LeftBottomJaw.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(62, 22).addBox(-1.3098F, -0.6146F, -1.8229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)).texOffs(26, 63).addBox(-1.3098F, -0.4146F, -1.8229F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.0F, -0.5679F, 2.1591F, 0.2926F, 0.0418F, 0.0126F));
		PartDefinition cube_r36 = LeftBottomJaw.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(68, 9).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, -0.5686F, -0.1556F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r37 = LeftBottomJaw.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(68, 16).addBox(-0.5F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, -0.675F, 1.025F, 0.4363F, 0.0F, 0.0F));
		PartDefinition LeftTongue = LeftBottomJaw.addOrReplaceChild("LeftTongue", CubeListBuilder.create(), PartPose.offset(0.0249F, -0.103F, -0.2688F));
		PartDefinition cube_r38 = LeftTongue.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(40, 47).addBox(-1.5F, -0.5F, -1.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.5F, 0.0518F, 1.0818F, 0.2618F, 0.0F, 0.0F));
		PartDefinition LeftTongue2 = LeftTongue.addOrReplaceChild("LeftTongue2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2395F, 2.4105F));
		PartDefinition cube_r39 = LeftTongue2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(24, 67).addBox(-1.5F, -0.5F, -1.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.5F, -0.0131F, 0.9747F, 0.0436F, 0.0F, 0.0F));
		PartDefinition LeftTongue3 = LeftTongue2.addOrReplaceChild("LeftTongue3", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0349F, 1.2992F));
		PartDefinition cube_r40 = LeftTongue3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(12, 71).addBox(-1.5F, -0.5F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(0.5F, 0.0087F, -0.0748F, 0.0436F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 10).addBox(-3.5F, -0.95F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(-0.15F)).texOffs(0, 19).addBox(-3.5F, 3.7F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(0, 0)
						.addBox(-3.5F, 7.1F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-3.5F, 2.4F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.25F)).texOffs(20, 7)
						.addBox(-3.5F, -2.15F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.375F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition dontTouch_r1 = RightArm.addOrReplaceChild("dontTouch_r1", CubeListBuilder.create().texOffs(38, 14).addBox(-0.5101F, -1.2362F, -3.2396F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.275F)),
				PartPose.offsetAndRotation(-3.2484F, 6.1312F, 2.4272F, 1.1313F, -0.1309F, 0.0F));
		PartDefinition dontTouch_r2 = RightArm.addOrReplaceChild("dontTouch_r2", CubeListBuilder.create().texOffs(0, 37).addBox(-0.4899F, -0.5085F, -3.0527F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.275F)),
				PartPose.offsetAndRotation(-3.2484F, 6.1312F, 2.4272F, 1.2259F, -0.1309F, 0.0F));
		PartDefinition dontTouch_r3 = RightArm.addOrReplaceChild("dontTouch_r3", CubeListBuilder.create().texOffs(32, 53).addBox(-0.4899F, -1.9579F, -0.6702F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.275F)),
				PartPose.offsetAndRotation(-3.2484F, 6.1312F, 2.4272F, 0.4841F, -0.1309F, 0.0F));
		PartDefinition RightHand = RightArm.addOrReplaceChild("RightHand", CubeListBuilder.create(), PartPose.offset(-3.519F, 9.2855F, 0.2787F));
		PartDefinition Fingers = RightHand.addOrReplaceChild("Fingers", CubeListBuilder.create(), PartPose.offset(12.9053F, -13.1355F, 0.9606F));
		PartDefinition Thumb = Fingers.addOrReplaceChild("Thumb",
				CubeListBuilder.create().texOffs(16, 52).addBox(-0.15F, -0.2608F, -0.1694F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(52, 18).addBox(-0.15F, -0.2608F, -0.3444F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-9.7613F, 14.6226F, -3.6518F));
		PartDefinition ThumbDigit = Thumb.addOrReplaceChild("ThumbDigit",
				CubeListBuilder.create().texOffs(52, 41).addBox(-0.15F, -0.25F, -0.35F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(24, 53).addBox(-0.15F, -0.45F, -0.525F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(0.0F, 3.4742F, -0.0023F));
		PartDefinition ThumbTIp = ThumbDigit.addOrReplaceChild("ThumbTIp",
				CubeListBuilder.create().texOffs(56, 12).addBox(-0.15F, -0.375F, -0.55F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).texOffs(40, 57).addBox(-0.15F, -0.775F, -0.725F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(0.0F, 3.1093F, 0.0034F));
		PartDefinition Pointer = Fingers.addOrReplaceChild("Pointer",
				CubeListBuilder.create().texOffs(48, 12).addBox(-0.1751F, -0.3F, -1.2618F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(50, 47).addBox(-0.3501F, -0.4F, -1.2618F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-12.8112F, 16.0F, -2.4775F));
		PartDefinition PointerDigit = Pointer.addOrReplaceChild("PointerDigit",
				CubeListBuilder.create().texOffs(40, 51).addBox(-0.1548F, -0.3299F, -1.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(50, 28).addBox(-0.3298F, -0.6549F, -1.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(-0.2203F, 3.4299F, -0.0118F));
		PartDefinition PointerTip = PointerDigit.addOrReplaceChild("PointerTip",
				CubeListBuilder.create().texOffs(56, 34).addBox(-0.6F, -0.45F, -1.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).texOffs(0, 56).addBox(-0.775F, -0.975F, -1.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(0.2316F, 3.1054F, 0.0F));
		PartDefinition Index = Fingers.addOrReplaceChild("Index",
				CubeListBuilder.create().texOffs(0, 50).addBox(-0.1751F, -0.3F, -0.5132F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(50, 6).addBox(-0.3501F, -0.4F, -0.5132F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-12.8112F, 16.0F, -0.2511F));
		PartDefinition IndexDigit = Index.addOrReplaceChild("IndexDigit",
				CubeListBuilder.create().texOffs(8, 52).addBox(-0.1548F, -0.3299F, -0.525F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).texOffs(50, 0).addBox(-0.3298F, -0.6549F, -0.525F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offset(-0.2203F, 3.4299F, 0.0118F));
		PartDefinition IndexTip = IndexDigit.addOrReplaceChild("IndexTip",
				CubeListBuilder.create().texOffs(56, 53).addBox(-0.6F, -0.45F, -0.525F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.55F)).texOffs(48, 53).addBox(-0.775F, -0.975F, -0.525F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.65F)),
				PartPose.offset(0.2316F, 3.1054F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(20, 23).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(-2.0F, 4.725F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_r1 = RightLeg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(48, 58).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.2179F, 10.392F, 1.8451F, -0.1745F, 0.0F, -0.1745F));
		PartDefinition right_leg_r2 = RightLeg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(12, 40).addBox(-0.5F, -0.984F, -1.183F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.6035F, 9.6329F, -0.4339F, -0.1745F, 0.0F, 0.1745F));
		PartDefinition right_leg_r3 = RightLeg.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(52, 24).addBox(-1.183F, -0.984F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.6482F, 9.0344F, -1.4479F, 0.1719F, -0.0302F, 0.1719F));
		PartDefinition right_leg_r4 = RightLeg.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(32, 41).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-1.6348F, 10.9945F, 0.1074F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition right_leg_r5 = RightLeg.addOrReplaceChild("right_leg_r5", CubeListBuilder.create().texOffs(22, 40).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-1.6348F, 8.5911F, 0.0019F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition right_leg_r6 = RightLeg.addOrReplaceChild("right_leg_r6", CubeListBuilder.create().texOffs(40, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-1.6348F, 6.1877F, -0.1036F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition right_leg_r7 = RightLeg.addOrReplaceChild("right_leg_r7", CubeListBuilder.create().texOffs(58, 3).addBox(-1.183F, -0.984F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.6482F, 6.631F, -1.5535F, 0.1719F, -0.0302F, 0.1719F));
		PartDefinition right_leg_r8 = RightLeg.addOrReplaceChild("right_leg_r8", CubeListBuilder.create().texOffs(58, 30).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.2149F, 5.6023F, 1.6167F, -0.1745F, 0.0F, -0.1745F));
		PartDefinition right_leg_r9 = RightLeg.addOrReplaceChild("right_leg_r9", CubeListBuilder.create().texOffs(58, 27).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.2179F, 7.9886F, 1.7396F, -0.1745F, 0.0F, -0.1745F));
		PartDefinition right_leg_r10 = RightLeg.addOrReplaceChild("right_leg_r10", CubeListBuilder.create().texOffs(40, 6).addBox(-0.5F, -0.984F, -1.183F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.6035F, 7.2295F, -0.5395F, -0.1745F, 0.0F, 0.1745F));
		PartDefinition right_leg_r11 = RightLeg.addOrReplaceChild("right_leg_r11", CubeListBuilder.create().texOffs(36, 28).addBox(-2.0F, -0.5F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.2217F, 11.7988F, -0.5586F, 0.0F, 0.1745F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 23).addBox(-2.0F, 4.725F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r1 = LeftLeg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(58, 9).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.2179F, 10.392F, 1.8451F, -0.1745F, 0.0F, 0.1745F));
		PartDefinition left_leg_r2 = LeftLeg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(10, 46).addBox(-0.5F, -0.984F, -1.183F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-1.6035F, 9.6329F, -0.4339F, -0.1745F, 0.0F, -0.1745F));
		PartDefinition left_leg_r3 = LeftLeg.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(58, 0).addBox(-2.817F, -0.984F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.6482F, 9.0344F, -1.4479F, 0.1719F, 0.0302F, -0.1719F));
		PartDefinition left_leg_r4 = LeftLeg.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(30, 47).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.6348F, 10.9945F, 0.1074F, 0.1745F, 0.0F, 0.1745F));
		PartDefinition left_leg_r5 = LeftLeg.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.6348F, 8.5911F, 0.0019F, 0.1745F, 0.0F, 0.1745F));
		PartDefinition left_leg_r6 = LeftLeg.addOrReplaceChild("left_leg_r6", CubeListBuilder.create().texOffs(20, 46).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.6348F, 6.1877F, -0.1036F, 0.1745F, 0.0F, 0.1745F));
		PartDefinition left_leg_r7 = LeftLeg.addOrReplaceChild("left_leg_r7", CubeListBuilder.create().texOffs(8, 58).addBox(-2.817F, -0.984F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.6482F, 6.631F, -1.5535F, 0.1719F, 0.0302F, -0.1719F));
		PartDefinition left_leg_r8 = LeftLeg.addOrReplaceChild("left_leg_r8", CubeListBuilder.create().texOffs(58, 47).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.2149F, 5.6023F, 1.6167F, -0.1745F, 0.0F, 0.1745F));
		PartDefinition left_leg_r9 = LeftLeg.addOrReplaceChild("left_leg_r9", CubeListBuilder.create().texOffs(58, 6).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.2179F, 7.9886F, 1.7396F, -0.1745F, 0.0F, 0.1745F));
		PartDefinition left_leg_r10 = LeftLeg.addOrReplaceChild("left_leg_r10", CubeListBuilder.create().texOffs(42, 41).addBox(-0.5F, -0.984F, -1.183F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-1.6035F, 7.2295F, -0.5395F, -0.1745F, 0.0F, -0.1745F));
		PartDefinition left_leg_r11 = LeftLeg.addOrReplaceChild("left_leg_r11", CubeListBuilder.create().texOffs(32, 37).addBox(-2.0F, -0.5F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.2217F, 11.7988F, -0.5586F, 0.0F, -0.1745F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		if (pEntity instanceof AnimationInterface animationInterface) {
			this.animate(animationInterface.getReaperKakujaIdleAnimationState(), ReaperKakujaAnimations.ReaperKakujaIdle, pAgeInTicks);
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
