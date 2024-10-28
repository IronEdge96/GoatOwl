
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.ironedge.goatowl.client.model.Modelvsarimaonsie;
import net.ironedge.goatowl.client.model.Modelrizerinkakuthree;
import net.ironedge.goatowl.client.model.Modelrizerinkakusix;
import net.ironedge.goatowl.client.model.Modelrizerinkaku;
import net.ironedge.goatowl.client.model.Modelnorooutfitcloak;
import net.ironedge.goatowl.client.model.Modelkanekioutfitonsie;
import net.ironedge.goatowl.client.model.Modelkanekioutfitcollar;
import net.ironedge.goatowl.client.model.Modelkakuganright;
import net.ironedge.goatowl.client.model.Modelkakuganleft;
import net.ironedge.goatowl.client.model.Modelkakuganfaceright;
import net.ironedge.goatowl.client.model.Modelkakuganfaceleft;
import net.ironedge.goatowl.client.model.Modelgoatoutfittank;
import net.ironedge.goatowl.client.model.Modelgoatoutfitcloak;
import net.ironedge.goatowl.client.model.Modelblackreaperoutfitcloak;
import net.ironedge.goatowl.client.model.Modelayatotestukaku;
import net.ironedge.goatowl.client.model.Modelaogirirobeshood;
import net.ironedge.goatowl.client.model.Modelaogirirobescloak;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GoatowlModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelgoatoutfitcloak.LAYER_LOCATION, Modelgoatoutfitcloak::createBodyLayer);
		event.registerLayerDefinition(Modelvsarimaonsie.LAYER_LOCATION, Modelvsarimaonsie::createBodyLayer);
		event.registerLayerDefinition(Modelrizerinkaku.LAYER_LOCATION, Modelrizerinkaku::createBodyLayer);
		event.registerLayerDefinition(Modelkakuganfaceright.LAYER_LOCATION, Modelkakuganfaceright::createBodyLayer);
		event.registerLayerDefinition(Modelkakuganleft.LAYER_LOCATION, Modelkakuganleft::createBodyLayer);
		event.registerLayerDefinition(Modelkakuganfaceleft.LAYER_LOCATION, Modelkakuganfaceleft::createBodyLayer);
		event.registerLayerDefinition(Modelblackreaperoutfitcloak.LAYER_LOCATION, Modelblackreaperoutfitcloak::createBodyLayer);
		event.registerLayerDefinition(Modelaogirirobescloak.LAYER_LOCATION, Modelaogirirobescloak::createBodyLayer);
		event.registerLayerDefinition(Modelnorooutfitcloak.LAYER_LOCATION, Modelnorooutfitcloak::createBodyLayer);
		event.registerLayerDefinition(Modelgoatoutfittank.LAYER_LOCATION, Modelgoatoutfittank::createBodyLayer);
		event.registerLayerDefinition(Modelrizerinkakusix.LAYER_LOCATION, Modelrizerinkakusix::createBodyLayer);
		event.registerLayerDefinition(Modelkanekioutfitonsie.LAYER_LOCATION, Modelkanekioutfitonsie::createBodyLayer);
		event.registerLayerDefinition(Modelrizerinkakuthree.LAYER_LOCATION, Modelrizerinkakuthree::createBodyLayer);
		event.registerLayerDefinition(Modelkakuganright.LAYER_LOCATION, Modelkakuganright::createBodyLayer);
		event.registerLayerDefinition(Modelkanekioutfitcollar.LAYER_LOCATION, Modelkanekioutfitcollar::createBodyLayer);
		event.registerLayerDefinition(Modelayatotestukaku.LAYER_LOCATION, Modelayatotestukaku::createBodyLayer);
		event.registerLayerDefinition(Modelaogirirobeshood.LAYER_LOCATION, Modelaogirirobeshood::createBodyLayer);
	}
}
