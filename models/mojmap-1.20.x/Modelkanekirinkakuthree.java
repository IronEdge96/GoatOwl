
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

import net.ironedge.goatowl.KanekiRinkakuThreeAnimations;
import net.ironedge.goatowl.AnimationInterface;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelkanekirinkakuthree<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "kanekirinkakuthree"), "main");
	private final ModelPart root;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Tails;
	private final ModelPart Tail1;
	private final ModelPart TopTailSegment;
	private final ModelPart TopTailSegment2;
	private final ModelPart TopTailSegment3;
	private final ModelPart TopTailSegment4;
	private final ModelPart TopTailSegment5;
	private final ModelPart TopTailSegment6;
	private final ModelPart TopTailSegment7;
	private final ModelPart TopTailSegment8;
	private final ModelPart TopTailSegment9;
	private final ModelPart TopTailSegment10;
	private final ModelPart TopTailSegment11;
	private final ModelPart Tail2;
	private final ModelPart RightBottomTailSegment;
	private final ModelPart RightBottomTailSegment2;
	private final ModelPart RightBottomTailSegment3;
	private final ModelPart RightBottomTailSegment4;
	private final ModelPart RightBottomTailSegment5;
	private final ModelPart RightBottomTailSegment6;
	private final ModelPart RightBottomTailSegment7;
	private final ModelPart RightBottomTailSegment8;
	private final ModelPart RightBottomTailSegment9;
	private final ModelPart RightBottomTailSegment10;
	private final ModelPart RightBottomTailSegment11;
	private final ModelPart Tail3;
	private final ModelPart LeftBottomTailSegment;
	private final ModelPart LeftBottomTailSegment2;
	private final ModelPart LeftBottomTailSegment3;
	private final ModelPart LeftBottomTailSegment4;
	private final ModelPart LeftBottomTailSegment5;
	private final ModelPart LeftBottomTailSegment6;
	private final ModelPart LeftBottomTailSegment7;
	private final ModelPart LeftBottomTailSegment8;
	private final ModelPart LeftBottomTailSegment9;
	private final ModelPart LeftBottomTailSegment10;
	private final ModelPart LeftBottomTailSegment11;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelkanekirinkakuthree(ModelPart root) {
		this.root = root;
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tails = this.Body.getChild("Tails");
		this.Tail1 = this.Tails.getChild("Tail1");
		this.TopTailSegment = this.Tail1.getChild("TopTailSegment");
		this.TopTailSegment2 = this.TopTailSegment.getChild("TopTailSegment2");
		this.TopTailSegment3 = this.TopTailSegment2.getChild("TopTailSegment3");
		this.TopTailSegment4 = this.TopTailSegment3.getChild("TopTailSegment4");
		this.TopTailSegment5 = this.TopTailSegment4.getChild("TopTailSegment5");
		this.TopTailSegment6 = this.TopTailSegment5.getChild("TopTailSegment6");
		this.TopTailSegment7 = this.TopTailSegment6.getChild("TopTailSegment7");
		this.TopTailSegment8 = this.TopTailSegment7.getChild("TopTailSegment8");
		this.TopTailSegment9 = this.TopTailSegment8.getChild("TopTailSegment9");
		this.TopTailSegment10 = this.TopTailSegment9.getChild("TopTailSegment10");
		this.TopTailSegment11 = this.TopTailSegment10.getChild("TopTailSegment11");
		this.Tail2 = this.Tails.getChild("Tail2");
		this.RightBottomTailSegment = this.Tail2.getChild("RightBottomTailSegment");
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
		this.Tail3 = this.Tails.getChild("Tail3");
		this.LeftBottomTailSegment = this.Tail3.getChild("LeftBottomTailSegment");
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
		PartDefinition Tail1 = Tails.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offset(0.05F, 0.3087F, 0.1863F));
		PartDefinition TopTailSegment = Tail1.addOrReplaceChild("TopTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
		PartDefinition TopTailSegment2 = TopTailSegment.addOrReplaceChild("TopTailSegment2",
				CubeListBuilder.create().texOffs(130, 93).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.45F)).texOffs(116, 31).addBox(-1.5F, -0.5F, 0.025F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.025F, 0.0F, 0.0F));
		PartDefinition TopTailSegment3 = TopTailSegment2.addOrReplaceChild("TopTailSegment3",
				CubeListBuilder.create().texOffs(99, 0).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(101, 122).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.775F));
		PartDefinition TopTailSegment4 = TopTailSegment3.addOrReplaceChild("TopTailSegment4",
				CubeListBuilder.create().texOffs(38, 70).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(15, 114).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition TopTailSegment5 = TopTailSegment4.addOrReplaceChild("TopTailSegment5",
				CubeListBuilder.create().texOffs(32, 112).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 70).addBox(-2.5F, -0.5F, -0.25F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition TopTailSegment6 = TopTailSegment5.addOrReplaceChild("TopTailSegment6",
				CubeListBuilder.create().texOffs(91, 75).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(21, 51).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition TopTailSegment7 = TopTailSegment6.addOrReplaceChild("TopTailSegment7",
				CubeListBuilder.create().texOffs(34, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(42, 50).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.75F));
		PartDefinition TopTailSegment8 = TopTailSegment7.addOrReplaceChild("TopTailSegment8",
				CubeListBuilder.create().texOffs(0, 50).addBox(-3.0F, -0.5F, -0.25F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(0, 91).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition TopTailSegment9 = TopTailSegment8.addOrReplaceChild("TopTailSegment9",
				CubeListBuilder.create().texOffs(34, 102).addBox(-2.0F, -0.5F, -0.25F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(13, 125).addBox(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.7F));
		PartDefinition TopTailSegment10 = TopTailSegment9.addOrReplaceChild("TopTailSegment10",
				CubeListBuilder.create().texOffs(126, 111).addBox(-1.5F, -0.5F, -0.25F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)).texOffs(102, 133).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 8.5F));
		PartDefinition TopTailSegment11 = TopTailSegment10.addOrReplaceChild("TopTailSegment11", CubeListBuilder.create().texOffs(90, 133).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 0.0F, 4.5F));
		PartDefinition Tail2 = Tails.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offset(-1.45F, 0.3087F, 0.1863F));
		PartDefinition RightBottomTailSegment = Tail2.addOrReplaceChild("RightBottomTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
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
		PartDefinition Tail3 = Tails.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offset(1.55F, 0.3087F, 0.1863F));
		PartDefinition LeftBottomTailSegment = Tail3.addOrReplaceChild("LeftBottomTailSegment", CubeListBuilder.create(), PartPose.offset(-0.075F, 0.0F, 0.0F));
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
			this.animate(animationInterface.getKanekiIdleThreeAnimationState(), KanekiRinkakuThreeAnimations.KanekiIdleThree, pAgeInTicks);
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
