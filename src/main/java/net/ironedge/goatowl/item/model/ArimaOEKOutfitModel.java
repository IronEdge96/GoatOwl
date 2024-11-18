package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.ArimaOEKOutfitItem;

public class ArimaOEKOutfitModel extends GeoModel<ArimaOEKOutfitItem> {
	@Override
	public ResourceLocation getAnimationResource(ArimaOEKOutfitItem object) {
		return new ResourceLocation("goatowl", "animations/arimaoekoutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArimaOEKOutfitItem object) {
		return new ResourceLocation("goatowl", "geo/arimaoekoutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArimaOEKOutfitItem object) {
		return new ResourceLocation("goatowl", "textures/item/arimaoekoutfit.png");
	}
}
