package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.NoroItem;

public class NoroModel extends GeoModel<NoroItem> {
	@Override
	public ResourceLocation getAnimationResource(NoroItem object) {
		return new ResourceLocation("goatowl", "animations/norooutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NoroItem object) {
		return new ResourceLocation("goatowl", "geo/norooutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NoroItem object) {
		return new ResourceLocation("goatowl", "textures/item/norooutfit.png");
	}
}
