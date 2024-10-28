
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.ironedge.goatowl.client.gui.UkakuSelectGUIScreen;
import net.ironedge.goatowl.client.gui.RizeFormSelectGUIScreen;
import net.ironedge.goatowl.client.gui.RinkakuSelectGUIScreen;
import net.ironedge.goatowl.client.gui.QuinqueFurnaceGUITestScreen;
import net.ironedge.goatowl.client.gui.KakakhouSelectGUIScreen;
import net.ironedge.goatowl.client.gui.HumanRCTesterScreen;
import net.ironedge.goatowl.client.gui.HalfHumanRCTesterScreen;
import net.ironedge.goatowl.client.gui.HalfGhoulRCTesterScreen;
import net.ironedge.goatowl.client.gui.GhoulRCTesterScreen;
import net.ironedge.goatowl.client.gui.ChimeraSelectScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GoatowlModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(GoatowlModMenus.QUINQUE_FURNACE_GUI_TEST.get(), QuinqueFurnaceGUITestScreen::new);
			MenuScreens.register(GoatowlModMenus.KAKAKHOU_SELECT_GUI.get(), KakakhouSelectGUIScreen::new);
			MenuScreens.register(GoatowlModMenus.RINKAKU_SELECT_GUI.get(), RinkakuSelectGUIScreen::new);
			MenuScreens.register(GoatowlModMenus.UKAKU_SELECT_GUI.get(), UkakuSelectGUIScreen::new);
			MenuScreens.register(GoatowlModMenus.CHIMERA_SELECT.get(), ChimeraSelectScreen::new);
			MenuScreens.register(GoatowlModMenus.HUMAN_RC_TESTER.get(), HumanRCTesterScreen::new);
			MenuScreens.register(GoatowlModMenus.GHOUL_RC_TESTER.get(), GhoulRCTesterScreen::new);
			MenuScreens.register(GoatowlModMenus.HALF_HUMAN_RC_TESTER.get(), HalfHumanRCTesterScreen::new);
			MenuScreens.register(GoatowlModMenus.HALF_GHOUL_RC_TESTER.get(), HalfGhoulRCTesterScreen::new);
			MenuScreens.register(GoatowlModMenus.RIZE_FORM_SELECT_GUI.get(), RizeFormSelectGUIScreen::new);
		});
	}
}
