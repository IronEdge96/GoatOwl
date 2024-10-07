
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.ironedge.goatowl.client.gui.QuinqueFurnaceGUITestScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GoatowlModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(GoatowlModMenus.QUINQUE_FURNACE_GUI_TEST.get(), QuinqueFurnaceGUITestScreen::new);
		});
	}
}
