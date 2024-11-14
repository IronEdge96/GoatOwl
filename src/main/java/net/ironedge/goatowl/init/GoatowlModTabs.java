
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.ironedge.goatowl.GoatowlMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GoatowlModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GoatowlMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(GoatowlModItems.PRISONER_KANEKI_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.PRISONER_KANEKI_LEGGINGS.get());
			tabData.accept(GoatowlModItems.DEFAULT_KANEKI_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.DEFAULT_KANEKI_LEGGINGS.get());
			tabData.accept(GoatowlModItems.DEFAULT_KANEKI_BOOTS.get());
			tabData.accept(GoatowlModItems.GOAT_KANEKI_HELMET.get());
			tabData.accept(GoatowlModItems.GOAT_KANEKI_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.GOAT_KANEKI_LEGGINGS.get());
			tabData.accept(GoatowlModItems.GOAT_KANEKI_BOOTS.get());
			tabData.accept(GoatowlModItems.NORO_HELMET.get());
			tabData.accept(GoatowlModItems.NORO_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.NORO_LEGGINGS.get());
			tabData.accept(GoatowlModItems.NORO_BOOTS.get());
			tabData.accept(GoatowlModItems.AYATO_RE_HELMET.get());
			tabData.accept(GoatowlModItems.AYATO_RE_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.AYATO_RE_LEGGINGS.get());
			tabData.accept(GoatowlModItems.AYATO_RE_BOOTS.get());
			tabData.accept(GoatowlModItems.AYATO_S_1_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.AYATO_S_1_LEGGINGS.get());
			tabData.accept(GoatowlModItems.AYATO_S_1_BOOTS.get());
			tabData.accept(GoatowlModBlocks.QUINQUE_STEEL_BLOCK.get().asItem());
			tabData.accept(GoatowlModItems.QUINQUE_STEEL_ITEM.get());
			tabData.accept(GoatowlModBlocks.QUINQUE_FURNACE_TEST_OFF.get().asItem());
			tabData.accept(GoatowlModItems.TEST_AMATSU.get());
			tabData.accept(GoatowlModItems.TEST_AUS.get());
			tabData.accept(GoatowlModItems.TEST_AYUMI.get());
			tabData.accept(GoatowlModItems.TEST_BOKUSATSU.get());
			tabData.accept(GoatowlModItems.TEST_DEMON_YAMADA.get());
			tabData.accept(GoatowlModItems.TEST_JUUZOU_JASON.get());
			tabData.accept(GoatowlModItems.NORO_BLACK_HELMET.get());
			tabData.accept(GoatowlModItems.NORO_BLACK_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.NORO_BLACK_LEGGINGS.get());
			tabData.accept(GoatowlModItems.NORO_BLACK_BOOTS.get());
			tabData.accept(GoatowlModItems.AOGIRI_ROBES_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.AOGIRI_ROBES_LEGGINGS.get());
			tabData.accept(GoatowlModItems.AOGIRI_ROBES_BOOTS.get());
			tabData.accept(GoatowlModItems.BLACK_REAPER_KANEKI_HELMET.get());
			tabData.accept(GoatowlModItems.BLACK_REAPER_KANEKI_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.BLACK_REAPER_KANEKI_LEGGINGS.get());
			tabData.accept(GoatowlModItems.BLACK_REAPER_KANEKI_BOOTS.get());
			tabData.accept(GoatowlModItems.VS_ARIMA_KANEKI_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.VS_ARIMA_KANEKI_LEGGINGS.get());
			tabData.accept(GoatowlModItems.VS_ARIMA_KANEKI_BOOTS.get());
			tabData.accept(GoatowlModItems.SHIRT_REAPER_KANEKI_HELMET.get());
			tabData.accept(GoatowlModItems.SHIRT_REAPER_KANEKI_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.SHIRT_REAPER_KANEKI_LEGGINGS.get());
			tabData.accept(GoatowlModItems.SHIRT_REAPER_KANEKI_BOOTS.get());
			tabData.accept(GoatowlModItems.RACE_TEST_ITEM.get());
			tabData.accept(GoatowlModItems.KAKAHOU_TESTER_ITEM.get());
			tabData.accept(GoatowlModItems.RC_LEVEL_TESTER.get());
			tabData.accept(GoatowlModItems.TEST_KAKUGAN.get());
			tabData.accept(GoatowlModItems.ARIMA_RE_HELMET.get());
			tabData.accept(GoatowlModItems.ARIMA_RE_CHESTPLATE.get());
			tabData.accept(GoatowlModItems.ARIMA_RE_LEGGINGS.get());
			tabData.accept(GoatowlModItems.ARIMA_RE_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(GoatowlModItems.HHHHH_SPAWN_EGG.get());
			tabData.accept(GoatowlModItems.AAAAAAAAAAAA_SPAWN_EGG.get());
		}
	}
}
