
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
import net.ironedge.goatowl.client.gui.UkakuKakajuGetScreen;
import net.ironedge.goatowl.client.gui.RizeFormSelectGUIScreen;
import net.ironedge.goatowl.client.gui.RinkakuSelectGUIScreen;
import net.ironedge.goatowl.client.gui.RinkakuKakajuGetScreen;
import net.ironedge.goatowl.client.gui.QuinqueFurnaceGUITestScreen;
import net.ironedge.goatowl.client.gui.KuroShiroFormSelectGUIScreen;
import net.ironedge.goatowl.client.gui.KoukakuKakujaGetScreen;
import net.ironedge.goatowl.client.gui.KanekiSelectAllScreen;
import net.ironedge.goatowl.client.gui.KanekiFormSelectGUIScreen;
import net.ironedge.goatowl.client.gui.KakakhouSelectGUIScreen;
import net.ironedge.goatowl.client.gui.HumanRCTesterScreen;
import net.ironedge.goatowl.client.gui.HalfHumanRCTesterScreen;
import net.ironedge.goatowl.client.gui.HalfGhoulRCTesterScreen;
import net.ironedge.goatowl.client.gui.GhoulRCTesterScreen;
import net.ironedge.goatowl.client.gui.ChimeraSelectScreen;
import net.ironedge.goatowl.client.gui.BikakuKakujaGetScreen;

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
			MenuScreens.register(GoatowlModMenus.KANEKI_FORM_SELECT_GUI.get(), KanekiFormSelectGUIScreen::new);
			MenuScreens.register(GoatowlModMenus.KURO_SHIRO_FORM_SELECT_GUI.get(), KuroShiroFormSelectGUIScreen::new);
			MenuScreens.register(GoatowlModMenus.RINKAKU_KAKAJU_GET.get(), RinkakuKakajuGetScreen::new);
			MenuScreens.register(GoatowlModMenus.UKAKU_KAKAJU_GET.get(), UkakuKakajuGetScreen::new);
			MenuScreens.register(GoatowlModMenus.KOUKAKU_KAKUJA_GET.get(), KoukakuKakujaGetScreen::new);
			MenuScreens.register(GoatowlModMenus.BIKAKU_KAKUJA_GET.get(), BikakuKakujaGetScreen::new);
			MenuScreens.register(GoatowlModMenus.KANEKI_SELECT_ALL.get(), KanekiSelectAllScreen::new);
		});
	}
}
