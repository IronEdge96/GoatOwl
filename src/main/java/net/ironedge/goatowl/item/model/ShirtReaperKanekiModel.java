package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.ShirtReaperKanekiItem;

public class ShirtReaperKanekiModel extends GeoModel<ShirtReaperKanekiItem> {
	@Override
	public ResourceLocation getAnimationResource(ShirtReaperKanekiItem object) {
		return new ResourceLocation("goatowl", "animations/blackreapershirt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShirtReaperKanekiItem object) {
		return new ResourceLocation("goatowl", "geo/blackreapershirt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShirtReaperKanekiItem object) {
		return new ResourceLocation("goatowl", "textures/item/blackreapershirt.png");
	}
}
