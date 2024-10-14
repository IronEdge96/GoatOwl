
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.ironedge.goatowl.client.renderer.HhhhhRenderer;
import net.ironedge.goatowl.client.renderer.AaaaaaaaaaaaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GoatowlModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GoatowlModEntities.HHHHH.get(), HhhhhRenderer::new);
		event.registerEntityRenderer(GoatowlModEntities.AAAAAAAAAAAA.get(), AaaaaaaaaaaaRenderer::new);
	}
}
