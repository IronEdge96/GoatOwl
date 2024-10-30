
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.ironedge.goatowl.world.inventory.UkakuSelectGUIMenu;
import net.ironedge.goatowl.world.inventory.RizeFormSelectGUIMenu;
import net.ironedge.goatowl.world.inventory.RinkakuSelectGUIMenu;
import net.ironedge.goatowl.world.inventory.QuinqueFurnaceGUITestMenu;
import net.ironedge.goatowl.world.inventory.KuroShiroFormSelectGUIMenu;
import net.ironedge.goatowl.world.inventory.KanekiFormSelectGUIMenu;
import net.ironedge.goatowl.world.inventory.KakakhouSelectGUIMenu;
import net.ironedge.goatowl.world.inventory.HumanRCTesterMenu;
import net.ironedge.goatowl.world.inventory.HalfHumanRCTesterMenu;
import net.ironedge.goatowl.world.inventory.HalfGhoulRCTesterMenu;
import net.ironedge.goatowl.world.inventory.GhoulRCTesterMenu;
import net.ironedge.goatowl.world.inventory.ChimeraSelectMenu;
import net.ironedge.goatowl.GoatowlMod;

public class GoatowlModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GoatowlMod.MODID);
	public static final RegistryObject<MenuType<QuinqueFurnaceGUITestMenu>> QUINQUE_FURNACE_GUI_TEST = REGISTRY.register("quinque_furnace_gui_test", () -> IForgeMenuType.create(QuinqueFurnaceGUITestMenu::new));
	public static final RegistryObject<MenuType<KakakhouSelectGUIMenu>> KAKAKHOU_SELECT_GUI = REGISTRY.register("kakakhou_select_gui", () -> IForgeMenuType.create(KakakhouSelectGUIMenu::new));
	public static final RegistryObject<MenuType<RinkakuSelectGUIMenu>> RINKAKU_SELECT_GUI = REGISTRY.register("rinkaku_select_gui", () -> IForgeMenuType.create(RinkakuSelectGUIMenu::new));
	public static final RegistryObject<MenuType<UkakuSelectGUIMenu>> UKAKU_SELECT_GUI = REGISTRY.register("ukaku_select_gui", () -> IForgeMenuType.create(UkakuSelectGUIMenu::new));
	public static final RegistryObject<MenuType<ChimeraSelectMenu>> CHIMERA_SELECT = REGISTRY.register("chimera_select", () -> IForgeMenuType.create(ChimeraSelectMenu::new));
	public static final RegistryObject<MenuType<HumanRCTesterMenu>> HUMAN_RC_TESTER = REGISTRY.register("human_rc_tester", () -> IForgeMenuType.create(HumanRCTesterMenu::new));
	public static final RegistryObject<MenuType<GhoulRCTesterMenu>> GHOUL_RC_TESTER = REGISTRY.register("ghoul_rc_tester", () -> IForgeMenuType.create(GhoulRCTesterMenu::new));
	public static final RegistryObject<MenuType<HalfHumanRCTesterMenu>> HALF_HUMAN_RC_TESTER = REGISTRY.register("half_human_rc_tester", () -> IForgeMenuType.create(HalfHumanRCTesterMenu::new));
	public static final RegistryObject<MenuType<HalfGhoulRCTesterMenu>> HALF_GHOUL_RC_TESTER = REGISTRY.register("half_ghoul_rc_tester", () -> IForgeMenuType.create(HalfGhoulRCTesterMenu::new));
	public static final RegistryObject<MenuType<RizeFormSelectGUIMenu>> RIZE_FORM_SELECT_GUI = REGISTRY.register("rize_form_select_gui", () -> IForgeMenuType.create(RizeFormSelectGUIMenu::new));
	public static final RegistryObject<MenuType<KanekiFormSelectGUIMenu>> KANEKI_FORM_SELECT_GUI = REGISTRY.register("kaneki_form_select_gui", () -> IForgeMenuType.create(KanekiFormSelectGUIMenu::new));
	public static final RegistryObject<MenuType<KuroShiroFormSelectGUIMenu>> KURO_SHIRO_FORM_SELECT_GUI = REGISTRY.register("kuro_shiro_form_select_gui", () -> IForgeMenuType.create(KuroShiroFormSelectGUIMenu::new));
}
