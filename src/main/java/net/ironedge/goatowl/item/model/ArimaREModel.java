package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.ArimaREItem;

public class ArimaREModel extends GeoModel<ArimaREItem> {
	@Override
	public ResourceLocation getAnimationResource(ArimaREItem object) {
		return new ResourceLocation("goatowl", "animations/arimaoutfitre.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArimaREItem object) {
		return new ResourceLocation("goatowl", "geo/arimaoutfitre.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArimaREItem object) {
		return new ResourceLocation("goatowl", "textures/item/arimaoutfitre.png");
	}
}
