package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.AyatoReItem;

public class AyatoReModel extends GeoModel<AyatoReItem> {
	@Override
	public ResourceLocation getAnimationResource(AyatoReItem object) {
		return new ResourceLocation("goatowl", "animations/ayatoreoutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AyatoReItem object) {
		return new ResourceLocation("goatowl", "geo/ayatoreoutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AyatoReItem object) {
		return new ResourceLocation("goatowl", "textures/item/ayatoreoutfit.png");
	}
}
