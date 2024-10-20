package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.BlackReaperKanekiItem;

public class BlackReaperKanekiModel extends GeoModel<BlackReaperKanekiItem> {
	@Override
	public ResourceLocation getAnimationResource(BlackReaperKanekiItem object) {
		return new ResourceLocation("goatowl", "animations/blackreaperoutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlackReaperKanekiItem object) {
		return new ResourceLocation("goatowl", "geo/blackreaperoutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlackReaperKanekiItem object) {
		return new ResourceLocation("goatowl", "textures/item/blackreaperoutfit.png");
	}
}
