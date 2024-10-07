package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.TestAmatsuItem;

public class TestAmatsuItemModel extends GeoModel<TestAmatsuItem> {
	@Override
	public ResourceLocation getAnimationResource(TestAmatsuItem animatable) {
		return new ResourceLocation("goatowl", "animations/amatsu.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestAmatsuItem animatable) {
		return new ResourceLocation("goatowl", "geo/amatsu.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestAmatsuItem animatable) {
		return new ResourceLocation("goatowl", "textures/item/amatsu.png");
	}
}
