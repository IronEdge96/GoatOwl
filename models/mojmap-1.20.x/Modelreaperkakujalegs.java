
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
public class Modelreaperkakujalegs<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "reaperkakujalegs"), "main");
	private final ModelPart root;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelreaperkakujalegs(ModelPart root) {
		this.root = root;
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
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(20, 23).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32).addBox(-2.0F, 4.725F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_r1 = RightLeg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(56, 7).addBox(-1.183F, -0.984F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.3127F, 9.0F, -1.3898F, 0.1719F, -0.0302F, 0.1719F));
		PartDefinition right_leg_r2 = RightLeg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(58, 49).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.4319F, 8.8673F, -1.3965F, 0.5269F, -0.7689F, -0.1118F));
		PartDefinition right_leg_r3 = RightLeg.addOrReplaceChild("right_leg_r3", CubeListBuilder.create().texOffs(8, 56).addBox(-0.5F, -2.0F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-1.2107F, 8.1908F, -0.6245F, 0.1912F, -0.2141F, 0.0047F));
		PartDefinition right_leg_r4 = RightLeg.addOrReplaceChild("right_leg_r4", CubeListBuilder.create().texOffs(58, 49).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.4115F, 11.2879F, -1.3507F, 0.5269F, -0.7689F, -0.1118F));
		PartDefinition right_leg_r5 = RightLeg.addOrReplaceChild("right_leg_r5", CubeListBuilder.create().texOffs(8, 56).addBox(-0.5F, -2.0F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-1.1903F, 10.6114F, -0.5788F, 0.1912F, -0.2141F, 0.0047F));
		PartDefinition right_leg_r6 = RightLeg.addOrReplaceChild("right_leg_r6", CubeListBuilder.create().texOffs(58, 49).addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.3928F, 6.4982F, -1.5601F, 0.5269F, -0.7689F, -0.1118F));
		PartDefinition right_leg_r7 = RightLeg.addOrReplaceChild("right_leg_r7", CubeListBuilder.create().texOffs(8, 56).addBox(-0.5F, -2.0F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-1.1715F, 5.9718F, -0.6382F, 0.1844F, -0.3082F, 0.3554F));
		PartDefinition right_leg_r8 = RightLeg.addOrReplaceChild("right_leg_r8", CubeListBuilder.create().texOffs(56, 7).addBox(-1.183F, -0.984F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.3518F, 6.631F, -1.5535F, 0.1719F, -0.0302F, 0.1719F));
		PartDefinition right_leg_r9 = RightLeg.addOrReplaceChild("right_leg_r9", CubeListBuilder.create().texOffs(52, 47).addBox(-2.0F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.2305F, 11.3159F, -0.5609F, 0.0306F, 0.1719F, 0.1335F));
		PartDefinition right_leg_r10 = RightLeg.addOrReplaceChild("right_leg_r10", CubeListBuilder.create().texOffs(52, 47).addBox(-2.0F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.2285F, 11.4652F, -0.5605F, 0.0154F, 0.1739F, 0.045F));
		PartDefinition right_leg_r11 = RightLeg.addOrReplaceChild("right_leg_r11", CubeListBuilder.create().texOffs(52, 47).addBox(-2.0F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.2324F, 11.1668F, -0.5635F, 0.0456F, 0.1685F, 0.222F));
		PartDefinition right_leg_r12 = RightLeg.addOrReplaceChild("right_leg_r12", CubeListBuilder.create().texOffs(36, 23).addBox(-2.0F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.2217F, 11.7988F, -0.5586F, 0.0F, 0.1745F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(20, 23).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 32).mirror()
				.addBox(-2.0F, 4.725F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_r1 = LeftLeg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(56, 7).mirror().addBox(-1.817F, -0.984F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(-0.3127F, 9.0F, -1.3898F, 0.1719F, 0.0302F, -0.1719F));
		PartDefinition left_leg_r2 = LeftLeg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(58, 49).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(0.4319F, 8.8673F, -1.3965F, 0.5269F, 0.7689F, 0.1118F));
		PartDefinition left_leg_r3 = LeftLeg.addOrReplaceChild("left_leg_r3", CubeListBuilder.create().texOffs(8, 56).mirror().addBox(-0.5F, -2.0F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(1.2107F, 8.1908F, -0.6245F, 0.1912F, 0.2141F, -0.0047F));
		PartDefinition left_leg_r4 = LeftLeg.addOrReplaceChild("left_leg_r4", CubeListBuilder.create().texOffs(58, 49).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(0.4115F, 11.2879F, -1.3507F, 0.5269F, 0.7689F, 0.1118F));
		PartDefinition left_leg_r5 = LeftLeg.addOrReplaceChild("left_leg_r5", CubeListBuilder.create().texOffs(8, 56).mirror().addBox(-0.5F, -2.0F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(1.1903F, 10.6114F, -0.5788F, 0.1912F, 0.2141F, -0.0047F));
		PartDefinition left_leg_r6 = LeftLeg.addOrReplaceChild("left_leg_r6", CubeListBuilder.create().texOffs(58, 49).mirror().addBox(-0.5F, -1.0F, -0.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(0.3928F, 6.4982F, -1.5601F, 0.5269F, 0.7689F, 0.1118F));
		PartDefinition left_leg_r7 = LeftLeg.addOrReplaceChild("left_leg_r7", CubeListBuilder.create().texOffs(8, 56).mirror().addBox(-0.5F, -2.0F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(1.1715F, 5.9718F, -0.6382F, 0.1844F, 0.3082F, -0.3554F));
		PartDefinition left_leg_r8 = LeftLeg.addOrReplaceChild("left_leg_r8", CubeListBuilder.create().texOffs(56, 7).mirror().addBox(-1.817F, -0.984F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(-0.3518F, 6.631F, -1.5535F, 0.1719F, 0.0302F, -0.1719F));
		PartDefinition left_leg_r9 = LeftLeg.addOrReplaceChild("left_leg_r9", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(-1.0F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(-1.2305F, 11.3159F, -0.5609F, 0.0306F, -0.1719F, -0.1335F));
		PartDefinition left_leg_r10 = LeftLeg.addOrReplaceChild("left_leg_r10", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(-1.0F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(-1.2285F, 11.4652F, -0.5605F, 0.0154F, -0.1739F, -0.045F));
		PartDefinition left_leg_r11 = LeftLeg.addOrReplaceChild("left_leg_r11", CubeListBuilder.create().texOffs(52, 47).mirror().addBox(-1.0F, -0.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(-1.2324F, 11.1668F, -0.5635F, 0.0456F, -0.1685F, -0.222F));
		PartDefinition left_leg_r12 = LeftLeg.addOrReplaceChild("left_leg_r12", CubeListBuilder.create().texOffs(36, 23).mirror().addBox(-1.0F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(-1.2217F, 11.7988F, -0.5586F, 0.0F, -0.1745F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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
