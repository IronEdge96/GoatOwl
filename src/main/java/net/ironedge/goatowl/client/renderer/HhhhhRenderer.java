
package net.ironedge.goatowl.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.ironedge.goatowl.entity.HhhhhEntity;
import net.ironedge.goatowl.client.model.Modelkanekirinkakutestalt;

public class HhhhhRenderer extends MobRenderer<HhhhhEntity, Modelkanekirinkakutestalt<HhhhhEntity>> {
	public HhhhhRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkanekirinkakutestalt(context.bakeLayer(Modelkanekirinkakutestalt.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HhhhhEntity entity) {
		return new ResourceLocation("goatowl:textures/entities/kanekirinkakutest.png");
	}
}
