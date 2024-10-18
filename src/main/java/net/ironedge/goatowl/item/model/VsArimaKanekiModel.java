package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.VsArimaKanekiItem;

public class VsArimaKanekiModel extends GeoModel<VsArimaKanekiItem> {
	@Override
	public ResourceLocation getAnimationResource(VsArimaKanekiItem object) {
		return new ResourceLocation("goatowl", "animations/vsarimaoutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VsArimaKanekiItem object) {
		return new ResourceLocation("goatowl", "geo/vsarimaoutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VsArimaKanekiItem object) {
		return new ResourceLocation("goatowl", "textures/item/vsarimaoutfit.png");
	}
}
