package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.AyatoS1Item;

public class AyatoS1Model extends GeoModel<AyatoS1Item> {
	@Override
	public ResourceLocation getAnimationResource(AyatoS1Item object) {
		return new ResourceLocation("goatowl", "animations/ayatoogoutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AyatoS1Item object) {
		return new ResourceLocation("goatowl", "geo/ayatoogoutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AyatoS1Item object) {
		return new ResourceLocation("goatowl", "textures/item/ayatoogoutfit.png");
	}
}
