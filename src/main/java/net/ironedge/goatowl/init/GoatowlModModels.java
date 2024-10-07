
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.ironedge.goatowl.client.model.Modelkanekirinkakutestalt;
import net.ironedge.goatowl.client.model.Modelkanekioutfitcollar;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GoatowlModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelkanekioutfitcollar.LAYER_LOCATION, Modelkanekioutfitcollar::createBodyLayer);
		event.registerLayerDefinition(Modelkanekirinkakutestalt.LAYER_LOCATION, Modelkanekirinkakutestalt::createBodyLayer);
	}
}
