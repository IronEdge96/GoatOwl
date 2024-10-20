package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.DefaultKanekiItem;

public class DefaultKanekiModel extends GeoModel<DefaultKanekiItem> {
	@Override
	public ResourceLocation getAnimationResource(DefaultKanekiItem object) {
		return new ResourceLocation("goatowl", "animations/kanekioutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DefaultKanekiItem object) {
		return new ResourceLocation("goatowl", "geo/kanekioutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DefaultKanekiItem object) {
		return new ResourceLocation("goatowl", "textures/item/kanekioutfit.png");
	}
}
