package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.TestDemonYamadaItem;

public class TestDemonYamadaItemModel extends GeoModel<TestDemonYamadaItem> {
	@Override
	public ResourceLocation getAnimationResource(TestDemonYamadaItem animatable) {
		return new ResourceLocation("goatowl", "animations/demonyamada.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestDemonYamadaItem animatable) {
		return new ResourceLocation("goatowl", "geo/demonyamada.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestDemonYamadaItem animatable) {
		return new ResourceLocation("goatowl", "textures/item/demonyamada.png");
	}
}
