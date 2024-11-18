package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.TestGinkuiItem;

public class TestGinkuiItemModel extends GeoModel<TestGinkuiItem> {
	@Override
	public ResourceLocation getAnimationResource(TestGinkuiItem animatable) {
		return new ResourceLocation("goatowl", "animations/ginkui.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestGinkuiItem animatable) {
		return new ResourceLocation("goatowl", "geo/ginkui.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestGinkuiItem animatable) {
		return new ResourceLocation("goatowl", "textures/item/ginkui.png");
	}
}
