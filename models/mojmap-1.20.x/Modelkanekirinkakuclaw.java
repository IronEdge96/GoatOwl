
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

import net.ironedge.goatowl.KanekiRinkakuClawAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelkanekirinkakuclaw<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "kanekirinkakuclaw"), "main");
	private final ModelPart root;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Tails;
	private final ModelPart Claw;
	private final ModelPart ClawSegment;
	private final ModelPart ClawSegment2;
	private final ModelPart ClawSegment3;
	private final ModelPart ClawSegment4;
	private final ModelPart ClawSegment5;
	private final ModelPart ClawSegment6;
	private final ModelPart ClawSegment7;
	private final ModelPart FingerMiddleSegment;
	private final ModelPart FingerMiddleSegment2;
	private final ModelPart FingerMiddleSegment3;
	private final ModelPart FingerMiddleSegment4;
	private final ModelPart FingerRightSegment;
	private final ModelPart FingerRightSegment2;
	private final ModelPart FingerRightSegment3;
	private final ModelPart FingerRightSegment4;
	private final ModelPart FingerLeftSegment;
	private final ModelPart FingerLeftSegment2;
	private final ModelPart FingerLeftSegment3;
	private final ModelPart FingerLeftSegment4;
	private final ModelPart Tendon;
	private final ModelPart TendonSegment;
	private final ModelPart TendonSegment2;
	private final ModelPart TendonSegment3;
	private final ModelPart TendonSegment4;
	private final ModelPart TendonSegment5;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelkanekirinkakuclaw(ModelPart root) {
		this.root = root;
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tails = this.Body.getChild("Tails");
		this.Claw = this.Tails.getChild("Claw");
		this.ClawSegment = this.Claw.getChild("ClawSegment");
		this.ClawSegment2 = this.ClawSegment.getChild("ClawSegment2");
		this.ClawSegment3 = this.ClawSegment2.getChild("ClawSegment3");
		this.ClawSegment4 = this.ClawSegment3.getChild("ClawSegment4");
		this.ClawSegment5 = this.ClawSegment4.getChild("ClawSegment5");
		this.ClawSegment6 = this.ClawSegment5.getChild("ClawSegment6");
		this.ClawSegment7 = this.ClawSegment6.getChild("ClawSegment7");
		this.FingerMiddleSegment = this.ClawSegment7.getChild("FingerMiddleSegment");
		this.FingerMiddleSegment2 = this.FingerMiddleSegment.getChild("FingerMiddleSegment2");
		this.FingerMiddleSegment3 = this.FingerMiddleSegment2.getChild("FingerMiddleSegment3");
		this.FingerMiddleSegment4 = this.FingerMiddleSegment3.getChild("FingerMiddleSegment4");
		this.FingerRightSegment = this.ClawSegment7.getChild("FingerRightSegment");
		this.FingerRightSegment2 = this.FingerRightSegment.getChild("FingerRightSegment2");
		this.FingerRightSegment3 = this.FingerRightSegment2.getChild("FingerRightSegment3");
		this.FingerRightSegment4 = this.FingerRightSegment3.getChild("FingerRightSegment4");
		this.FingerLeftSegment = this.ClawSegment7.getChild("FingerLeftSegment");
		this.FingerLeftSegment2 = this.FingerLeftSegment.getChild("FingerLeftSegment2");
		this.FingerLeftSegment3 = this.FingerLeftSegment2.getChild("FingerLeftSegment3");
		this.FingerLeftSegment4 = this.FingerLeftSegment3.getChild("FingerLeftSegment4");
		this.Tendon = this.Tails.getChild("Tendon");
		this.TendonSegment = this.Tendon.getChild("TendonSegment");
		this.TendonSegment2 = this.TendonSegment.getChild("TendonSegment2");
		this.TendonSegment3 = this.TendonSegment2.getChild("TendonSegment3");
		this.TendonSegment4 = this.TendonSegment3.getChild("TendonSegment4");
		this.TendonSegment5 = this.TendonSegment4.getChild("TendonSegment5");
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
		PartDefinition Claw = Tails.addOrReplaceChild("Claw", CubeListBuilder.create(), PartPose.offset(0.05F, 0.3087F, 0.1863F));
		PartDefinition ClawSegment = Claw.addOrReplaceChild("ClawSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition ClawSegment2 = ClawSegment.addOrReplaceChild("ClawSegment2",
				CubeListBuilder.create().texOffs(130, 93).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.7F)).texOffs(116, 31).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition ClawSegment3 = ClawSegment2.addOrReplaceChild("ClawSegment3",
				CubeListBuilder.create().texOffs(99, 0).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)).texOffs(101, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition ClawSegment4 = ClawSegment3.addOrReplaceChild("ClawSegment4",
				CubeListBuilder.create().texOffs(38, 70).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.75F)).texOffs(15, 114).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.75F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition ClawSegment5 = ClawSegment4.addOrReplaceChild("ClawSegment5",
				CubeListBuilder.create().texOffs(32, 112).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(1.0F)).texOffs(0, 70).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition ClawSegment6 = ClawSegment5.addOrReplaceChild("ClawSegment6",
				CubeListBuilder.create().texOffs(91, 75).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(1.0F)).texOffs(21, 51).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition ClawSegment7 = ClawSegment6.addOrReplaceChild("ClawSegment7",
				CubeListBuilder.create().texOffs(34, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(1.0F)).texOffs(42, 50).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition FingerMiddleSegment = ClawSegment7.addOrReplaceChild("FingerMiddleSegment",
				CubeListBuilder.create().texOffs(0, 50).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.75F)).texOffs(0, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.75F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.5F, 0.0F, 0.3054F, 0.0F));
		PartDefinition FingerMiddleSegment2 = FingerMiddleSegment.addOrReplaceChild("FingerMiddleSegment2",
				CubeListBuilder.create().texOffs(34, 102).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)).texOffs(13, 125).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 8.7F));
		PartDefinition FingerMiddleSegment3 = FingerMiddleSegment2.addOrReplaceChild("FingerMiddleSegment3",
				CubeListBuilder.create().texOffs(126, 111).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(102, 133).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition FingerMiddleSegment4 = FingerMiddleSegment3.addOrReplaceChild("FingerMiddleSegment4", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition FingerRightSegment = ClawSegment7.addOrReplaceChild("FingerRightSegment",
				CubeListBuilder.create().texOffs(0, 50).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.75F)).texOffs(0, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.75F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 8.5F, 0.0F, -0.3927F, 0.0F));
		PartDefinition FingerRightSegment2 = FingerRightSegment.addOrReplaceChild("FingerRightSegment2",
				CubeListBuilder.create().texOffs(34, 102).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)).texOffs(13, 125).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 8.7F));
		PartDefinition FingerRightSegment3 = FingerRightSegment2.addOrReplaceChild("FingerRightSegment3",
				CubeListBuilder.create().texOffs(126, 111).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(102, 133).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition FingerRightSegment4 = FingerRightSegment3.addOrReplaceChild("FingerRightSegment4", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition FingerLeftSegment = ClawSegment7.addOrReplaceChild("FingerLeftSegment", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.75F)).mirror(false).texOffs(0, 91)
				.mirror().addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 8.5F, 0.0F, 1.2654F, 0.0F));
		PartDefinition FingerLeftSegment2 = FingerLeftSegment.addOrReplaceChild("FingerLeftSegment2", CubeListBuilder.create().texOffs(34, 102).mirror().addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.5F)).mirror(false)
				.texOffs(13, 125).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.7F));
		PartDefinition FingerLeftSegment3 = FingerLeftSegment2.addOrReplaceChild("FingerLeftSegment3", CubeListBuilder.create().texOffs(126, 111).mirror().addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false)
				.texOffs(102, 133).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition FingerLeftSegment4 = FingerLeftSegment3.addOrReplaceChild("FingerLeftSegment4", CubeListBuilder.create().texOffs(90, 133).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition Tendon = Tails.addOrReplaceChild("Tendon", CubeListBuilder.create(), PartPose.offset(-1.95F, 0.3087F, 0.1863F));
		PartDefinition TendonSegment = Tendon.addOrReplaceChild("TendonSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition TendonSegment2 = TendonSegment.addOrReplaceChild("TendonSegment2",
				CubeListBuilder.create().texOffs(130, 93).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.1F)).texOffs(116, 31).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(0.025F, 0.0F, -1.0F));
		PartDefinition TendonSegment3 = TendonSegment2.addOrReplaceChild("TendonSegment3",
				CubeListBuilder.create().texOffs(99, 0).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F)).texOffs(101, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(0.0F, 0.0F, 7.775F));
		PartDefinition TendonSegment4 = TendonSegment3.addOrReplaceChild("TendonSegment4",
				CubeListBuilder.create().texOffs(38, 70).addBox(-2.1F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.15F)).texOffs(15, 114).addBox(-1.1F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.15F)),
				PartPose.offset(0.0F, 0.0F, 7.5F));
		PartDefinition TendonSegment5 = TendonSegment4.addOrReplaceChild("TendonSegment5",
				CubeListBuilder.create().texOffs(37, 117).addBox(-1.1F, -1.0F, -0.2F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.15F)).texOffs(5, 75).addBox(-2.1F, -0.5F, 0.05F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)),
				PartPose.offset(0.0F, 0.0F, 8.0F));
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
			this.animate(animationInterface.getKanekiIdleClawAnimationState(), KanekiRinkakuClawAnimations.KanekiIdleClaw, pAgeInTicks);
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
