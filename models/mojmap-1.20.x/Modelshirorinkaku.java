
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

import net.ironedge.goatowl.ShiroRinkakuAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelshirorinkaku<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "shirorinkaku"), "main");
	private final ModelPart root;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Tails;
	private final ModelPart Tail;
	private final ModelPart LeftTailSegment;
	private final ModelPart LeftTailSegment2;
	private final ModelPart LeftTailSegment3;
	private final ModelPart LeftTailSegment4;
	private final ModelPart LeftTailSegment5;
	private final ModelPart LeftTailSegment6;
	private final ModelPart LeftTailSegment7;
	private final ModelPart LeftTailSegment8;
	private final ModelPart LeftTailSegment9;
	private final ModelPart LeftTailSegment10;
	private final ModelPart LeftTailSegment11;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelshirorinkaku(ModelPart root) {
		this.root = root;
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tails = this.Body.getChild("Tails");
		this.Tail = this.Tails.getChild("Tail");
		this.LeftTailSegment = this.Tail.getChild("LeftTailSegment");
		this.LeftTailSegment2 = this.LeftTailSegment.getChild("LeftTailSegment2");
		this.LeftTailSegment3 = this.LeftTailSegment2.getChild("LeftTailSegment3");
		this.LeftTailSegment4 = this.LeftTailSegment3.getChild("LeftTailSegment4");
		this.LeftTailSegment5 = this.LeftTailSegment4.getChild("LeftTailSegment5");
		this.LeftTailSegment6 = this.LeftTailSegment5.getChild("LeftTailSegment6");
		this.LeftTailSegment7 = this.LeftTailSegment6.getChild("LeftTailSegment7");
		this.LeftTailSegment8 = this.LeftTailSegment7.getChild("LeftTailSegment8");
		this.LeftTailSegment9 = this.LeftTailSegment8.getChild("LeftTailSegment9");
		this.LeftTailSegment10 = this.LeftTailSegment9.getChild("LeftTailSegment10");
		this.LeftTailSegment11 = this.LeftTailSegment10.getChild("LeftTailSegment11");
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
		PartDefinition Tail = Tails.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(1.55F, 0.3087F, 0.1863F));
		PartDefinition LeftTailSegment = Tail.addOrReplaceChild("LeftTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition LeftTailSegment2 = LeftTailSegment.addOrReplaceChild("LeftTailSegment2",
				CubeListBuilder.create().texOffs(65, 129).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.45F)).texOffs(116, 11).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition LeftTailSegment3 = LeftTailSegment2.addOrReplaceChild("LeftTailSegment3",
				CubeListBuilder.create().texOffs(97, 57).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(75, 118).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition LeftTailSegment4 = LeftTailSegment3.addOrReplaceChild("LeftTailSegment4",
				CubeListBuilder.create().texOffs(63, 31).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(96, 109).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTailSegment5 = LeftTailSegment4.addOrReplaceChild("LeftTailSegment5",
				CubeListBuilder.create().texOffs(108, 78).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(63, 21).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTailSegment6 = LeftTailSegment5.addOrReplaceChild("LeftTailSegment6",
				CubeListBuilder.create().texOffs(82, 46).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(42, 10).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTailSegment7 = LeftTailSegment6.addOrReplaceChild("LeftTailSegment7",
				CubeListBuilder.create().texOffs(82, 35).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(42, 0).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.8F));
		PartDefinition LeftTailSegment8 = LeftTailSegment7.addOrReplaceChild("LeftTailSegment8",
				CubeListBuilder.create().texOffs(21, 41).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(82, 24).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition LeftTailSegment9 = LeftTailSegment8.addOrReplaceChild("LeftTailSegment9",
				CubeListBuilder.create().texOffs(99, 40).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(123, 71).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTailSegment10 = LeftTailSegment9.addOrReplaceChild("LeftTailSegment10",
				CubeListBuilder.create().texOffs(116, 41).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(131, 21).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition LeftTailSegment11 = LeftTailSegment10.addOrReplaceChild("LeftTailSegment11", CubeListBuilder.create().texOffs(131, 11).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
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
			this.animate(animationInterface.getShiroRinkakuIdleAnimationState(), ShiroRinkakuAnimations.ShiroRinkakuIdle, pAgeInTicks);
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
