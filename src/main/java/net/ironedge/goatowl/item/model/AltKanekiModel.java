package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.AltKanekiItem;

public class AltKanekiModel extends GeoModel<AltKanekiItem> {
	@Override
	public ResourceLocation getAnimationResource(AltKanekiItem object) {
		return new ResourceLocation("goatowl", "animations/kanekioutfitvar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltKanekiItem object) {
		return new ResourceLocation("goatowl", "geo/kanekioutfitvar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltKanekiItem object) {
		return new ResourceLocation("goatowl", "textures/item/kanekioutfitvar.png");
	}
}
