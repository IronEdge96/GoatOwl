
package net.ironedge.goatowl.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.ironedge.goatowl.entity.AaaaaaaaaaaaEntity;
import net.ironedge.goatowl.client.model.Modelayatotestukaku;

public class AaaaaaaaaaaaRenderer extends MobRenderer<AaaaaaaaaaaaEntity, Modelayatotestukaku<AaaaaaaaaaaaEntity>> {
	public AaaaaaaaaaaaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelayatotestukaku(context.bakeLayer(Modelayatotestukaku.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AaaaaaaaaaaaEntity entity) {
		return new ResourceLocation("goatowl:textures/entities/ayato.png");
	}
}
