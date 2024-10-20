package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.GoatKanekiItem;

public class GoatKanekiModel extends GeoModel<GoatKanekiItem> {
	@Override
	public ResourceLocation getAnimationResource(GoatKanekiItem object) {
		return new ResourceLocation("goatowl", "animations/goatoutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoatKanekiItem object) {
		return new ResourceLocation("goatowl", "geo/goatoutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoatKanekiItem object) {
		return new ResourceLocation("goatowl", "textures/item/goatoutfit.png");
	}
}
