package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.PrisonerKanekiItem;

public class PrisonerKanekiModel extends GeoModel<PrisonerKanekiItem> {
	@Override
	public ResourceLocation getAnimationResource(PrisonerKanekiItem object) {
		return new ResourceLocation("goatowl", "animations/prisoneroutfit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PrisonerKanekiItem object) {
		return new ResourceLocation("goatowl", "geo/prisoneroutfit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PrisonerKanekiItem object) {
		return new ResourceLocation("goatowl", "textures/item/prisoneroutfit.png");
	}
}
