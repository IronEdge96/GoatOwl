package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.TestGraveRobberItem;

public class TestGraveRobberItemModel extends GeoModel<TestGraveRobberItem> {
	@Override
	public ResourceLocation getAnimationResource(TestGraveRobberItem animatable) {
		return new ResourceLocation("goatowl", "animations/graverobber.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestGraveRobberItem animatable) {
		return new ResourceLocation("goatowl", "geo/graverobber.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestGraveRobberItem animatable) {
		return new ResourceLocation("goatowl", "textures/item/graverobber.png");
	}
}
