
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.ironedge.goatowl.world.inventory.QuinqueFurnaceGUITestMenu;
import net.ironedge.goatowl.GoatowlMod;

public class GoatowlModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GoatowlMod.MODID);
	public static final RegistryObject<MenuType<QuinqueFurnaceGUITestMenu>> QUINQUE_FURNACE_GUI_TEST = REGISTRY.register("quinque_furnace_gui_test", () -> IForgeMenuType.create(QuinqueFurnaceGUITestMenu::new));
}
