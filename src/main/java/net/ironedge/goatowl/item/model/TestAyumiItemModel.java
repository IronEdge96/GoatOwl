package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.TestAyumiItem;

public class TestAyumiItemModel extends GeoModel<TestAyumiItem> {
	@Override
	public ResourceLocation getAnimationResource(TestAyumiItem animatable) {
		return new ResourceLocation("goatowl", "animations/ayumihogi.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestAyumiItem animatable) {
		return new ResourceLocation("goatowl", "geo/ayumihogi.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestAyumiItem animatable) {
		return new ResourceLocation("goatowl", "textures/item/ayumihogi.png");
	}
}
