package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.TestSilverSkullItem;

public class TestSilverSkullItemModel extends GeoModel<TestSilverSkullItem> {
	@Override
	public ResourceLocation getAnimationResource(TestSilverSkullItem animatable) {
		return new ResourceLocation("goatowl", "animations/silverskull.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestSilverSkullItem animatable) {
		return new ResourceLocation("goatowl", "geo/silverskull.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestSilverSkullItem animatable) {
		return new ResourceLocation("goatowl", "textures/item/silverskull.png");
	}
}
