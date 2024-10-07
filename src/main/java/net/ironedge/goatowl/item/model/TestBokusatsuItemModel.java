package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.TestBokusatsuItem;

public class TestBokusatsuItemModel extends GeoModel<TestBokusatsuItem> {
	@Override
	public ResourceLocation getAnimationResource(TestBokusatsuItem animatable) {
		return new ResourceLocation("goatowl", "animations/bokusatsuno2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestBokusatsuItem animatable) {
		return new ResourceLocation("goatowl", "geo/bokusatsuno2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestBokusatsuItem animatable) {
		return new ResourceLocation("goatowl", "textures/item/bokusatsuno2.png");
	}
}
