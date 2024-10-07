package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.CentipedeKanekiItem;

public class CentipedeKanekiModel extends GeoModel<CentipedeKanekiItem> {
	@Override
	public ResourceLocation getAnimationResource(CentipedeKanekiItem object) {
		return new ResourceLocation("goatowl", "animations/centipedeoutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CentipedeKanekiItem object) {
		return new ResourceLocation("goatowl", "geo/centipedeoutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CentipedeKanekiItem object) {
		return new ResourceLocation("goatowl", "textures/item/centipedeoutfit.png");
	}
}
