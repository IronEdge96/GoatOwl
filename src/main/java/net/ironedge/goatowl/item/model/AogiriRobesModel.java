package net.ironedge.goatowl.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.ironedge.goatowl.item.AogiriRobesItem;

public class AogiriRobesModel extends GeoModel<AogiriRobesItem> {
	@Override
	public ResourceLocation getAnimationResource(AogiriRobesItem object) {
		return new ResourceLocation("goatowl", "animations/aogirirobes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AogiriRobesItem object) {
		return new ResourceLocation("goatowl", "geo/aogirirobes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AogiriRobesItem object) {
		return new ResourceLocation("goatowl", "textures/item/aogirirobes.png");
	}
}
