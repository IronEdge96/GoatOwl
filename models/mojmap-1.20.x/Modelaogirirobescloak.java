// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelaogirirobescloak<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "aogirirobescloak"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelaogirirobescloak(ModelPart root) {
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

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(22, 16)
				.mirror().addBox(-3.6366F, 8.6986F, 1.5754F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(10, 16).mirror()
				.addBox(-3.6366F, 8.6986F, -2.5246F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition dontTouch_r1 = RightLeg.addOrReplaceChild("dontTouch_r1",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-0.9438F, -4.4375F, -2.2625F, 1.0F, 9.0F, 5.0F, new CubeDeformation(-0.1F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.1175F, 4.4844F, -0.2611F, 0.0F, 0.0F, 0.1309F));

		PartDefinition dontTouch_r2 = RightLeg.addOrReplaceChild("dontTouch_r2",
				CubeListBuilder.create().texOffs(22, 20).mirror()
						.addBox(-0.9438F, -4.4375F, 1.5875F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0054F, 4.3983F, -0.1121F, 0.0F, 0.0F, 0.1309F));

		PartDefinition dontTouch_r3 = RightLeg.addOrReplaceChild("dontTouch_r3",
				CubeListBuilder.create().texOffs(12, 0).mirror()
						.addBox(-1.275F, -5.0625F, -2.35F, 5.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-1.4F, 4.5125F, -0.125F, 0.0F, 0.0F, 0.0436F));

		PartDefinition dontTouch_r4 = RightLeg.addOrReplaceChild("dontTouch_r4",
				CubeListBuilder.create().texOffs(12, 6).mirror()
						.addBox(-0.725F, -4.8375F, 1.6F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.85F, 4.9125F, -0.125F, 0.0F, 0.0F, 0.0436F));

		PartDefinition dontTouch_r5 = RightLeg.addOrReplaceChild("dontTouch_r5",
				CubeListBuilder.create().texOffs(0, 24).mirror()
						.addBox(-3.0438F, 7.7076F, -1.4812F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1803F, 0.8674F, -1.2352F, 0.0F, 0.0873F, 0.0F));

		PartDefinition dontTouch_r6 = RightLeg.addOrReplaceChild("dontTouch_r6",
				CubeListBuilder.create().texOffs(22, 20).mirror()
						.addBox(0.4312F, -1.2174F, -1.4812F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2929F, 1.0924F, -1.1938F, 0.0F, 0.0873F, 0.0F));

		PartDefinition dontTouch_r7 = RightLeg.addOrReplaceChild("dontTouch_r7",
				CubeListBuilder.create().texOffs(0, 14).mirror()
						.addBox(-2.275F, -4.7875F, 0.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6959F, 4.5707F, -2.6427F, 0.0044F, 0.0873F, 0.1309F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(22, 16)
				.addBox(-2.3634F, 8.6986F, 1.5754F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(10, 16)
				.addBox(2.6366F, 8.6986F, -2.5246F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition dontTouch_r8 = LeftLeg.addOrReplaceChild("dontTouch_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.0562F, -4.4375F, -2.2625F, 1.0F, 9.0F, 5.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(2.1175F, 4.4844F, -0.2611F, 0.0F, 0.0F, -0.1309F));

		PartDefinition dontTouch_r9 = LeftLeg.addOrReplaceChild("dontTouch_r9",
				CubeListBuilder.create().texOffs(22, 20).addBox(-1.0562F, -4.4375F, 1.5875F, 2.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0054F, 4.3983F, -0.1121F, 0.0F, 0.0F, -0.1309F));

		PartDefinition dontTouch_r10 = LeftLeg.addOrReplaceChild("dontTouch_r10",
				CubeListBuilder.create().texOffs(12, 0).addBox(-3.725F, -5.0625F, -2.35F, 5.0F, 1.0F, 5.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(1.4F, 4.5125F, -0.125F, 0.0F, 0.0F, -0.0436F));

		PartDefinition dontTouch_r11 = LeftLeg.addOrReplaceChild("dontTouch_r11",
				CubeListBuilder.create().texOffs(12, 6).addBox(-4.275F, -4.8375F, 1.6F, 5.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.85F, 4.9125F, -0.125F, 0.0F, 0.0F, -0.0436F));

		PartDefinition dontTouch_r12 = LeftLeg.addOrReplaceChild("dontTouch_r12",
				CubeListBuilder.create().texOffs(0, 24).addBox(-1.9562F, 7.7076F, -1.4812F, 5.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1803F, 0.8674F, -1.2352F, 0.0F, -0.0873F, 0.0F));

		PartDefinition dontTouch_r13 = LeftLeg.addOrReplaceChild("dontTouch_r13",
				CubeListBuilder.create().texOffs(22, 20).addBox(-2.4312F, -1.2174F, -1.4812F, 2.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2929F, 1.0924F, -1.1938F, 0.0F, -0.0873F, 0.0F));

		PartDefinition dontTouch_r14 = LeftLeg.addOrReplaceChild("dontTouch_r14",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.725F, -4.7875F, 0.0F, 4.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6959F, 4.5707F, -2.6427F, 0.0044F, -0.0873F, -0.1309F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}