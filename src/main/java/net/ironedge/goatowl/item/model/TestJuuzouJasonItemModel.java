package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.TestJuuzouJasonItem;

public class TestJuuzouJasonItemModel extends GeoModel<TestJuuzouJasonItem> {
	@Override
	public ResourceLocation getAnimationResource(TestJuuzouJasonItem animatable) {
		return new ResourceLocation("goatowl", "animations/juuzoujason.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestJuuzouJasonItem animatable) {
		return new ResourceLocation("goatowl", "geo/juuzoujason.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestJuuzouJasonItem animatable) {
		return new ResourceLocation("goatowl", "textures/item/juuzoujason.png");
	}
}
