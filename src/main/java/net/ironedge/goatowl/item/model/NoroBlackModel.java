package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.NoroBlackItem;

public class NoroBlackModel extends GeoModel<NoroBlackItem> {
	@Override
	public ResourceLocation getAnimationResource(NoroBlackItem object) {
		return new ResourceLocation("goatowl", "animations/norooutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NoroBlackItem object) {
		return new ResourceLocation("goatowl", "geo/norooutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NoroBlackItem object) {
		return new ResourceLocation("goatowl", "textures/item/norooutfitblack.png");
	}
}
