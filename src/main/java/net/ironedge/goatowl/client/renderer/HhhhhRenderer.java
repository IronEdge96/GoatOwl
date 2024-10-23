
package net.ironedge.goatowl.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.ironedge.goatowl.entity.HhhhhEntity;
import net.ironedge.goatowl.client.model.Modelrizerinkaku;

public class HhhhhRenderer extends MobRenderer<HhhhhEntity, Modelrizerinkaku<HhhhhEntity>> {
	public HhhhhRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrizerinkaku(context.bakeLayer(Modelrizerinkaku.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HhhhhEntity entity) {
		return new ResourceLocation("goatowl:textures/entities/rizerinkaku.png");
	}
}
