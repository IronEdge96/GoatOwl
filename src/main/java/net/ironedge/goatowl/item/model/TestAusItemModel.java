package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.TestAusItem;

public class TestAusItemModel extends GeoModel<TestAusItem> {
	@Override
	public ResourceLocation getAnimationResource(TestAusItem animatable) {
		return new ResourceLocation("goatowl", "animations/aus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestAusItem animatable) {
		return new ResourceLocation("goatowl", "geo/aus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestAusItem animatable) {
		return new ResourceLocation("goatowl", "textures/item/aus.png");
	}
}
