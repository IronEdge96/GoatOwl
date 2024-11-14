
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ArmorItem;

import net.ironedge.goatowl.item.VsArimaKanekiItem;
import net.ironedge.goatowl.item.TestKakuganItem;
import net.ironedge.goatowl.item.TestJuuzouJasonItem;
import net.ironedge.goatowl.item.TestDemonYamadaItem;
import net.ironedge.goatowl.item.TestBokusatsuItem;
import net.ironedge.goatowl.item.TestAyumiItem;
import net.ironedge.goatowl.item.TestAusItem;
import net.ironedge.goatowl.item.TestAmatsuItem;
import net.ironedge.goatowl.item.ShirtReaperKanekiItem;
import net.ironedge.goatowl.item.RaceTestItemItem;
import net.ironedge.goatowl.item.RCLevelTesterItem;
import net.ironedge.goatowl.item.QuinqueSteelItemItem;
import net.ironedge.goatowl.item.PrisonerKanekiItem;
import net.ironedge.goatowl.item.NoroItem;
import net.ironedge.goatowl.item.NoroBlackItem;
import net.ironedge.goatowl.item.KakahouTesterItemItem;
import net.ironedge.goatowl.item.GoatKanekiItem;
import net.ironedge.goatowl.item.DefaultKanekiItem;
import net.ironedge.goatowl.item.BlackReaperKanekiItem;
import net.ironedge.goatowl.item.AyatoS1Item;
import net.ironedge.goatowl.item.AyatoReItem;
import net.ironedge.goatowl.item.ArimaREItem;
import net.ironedge.goatowl.item.AogiriRobesItem;
import net.ironedge.goatowl.GoatowlMod;

public class GoatowlModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GoatowlMod.MODID);
	public static final RegistryObject<DefaultKanekiItem> DEFAULT_KANEKI_CHESTPLATE = REGISTRY.register("default_kaneki_chestplate", () -> new DefaultKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<DefaultKanekiItem> DEFAULT_KANEKI_LEGGINGS = REGISTRY.register("default_kaneki_leggings", () -> new DefaultKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<DefaultKanekiItem> DEFAULT_KANEKI_BOOTS = REGISTRY.register("default_kaneki_boots", () -> new DefaultKanekiItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<PrisonerKanekiItem> PRISONER_KANEKI_CHESTPLATE = REGISTRY.register("prisoner_kaneki_chestplate", () -> new PrisonerKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<PrisonerKanekiItem> PRISONER_KANEKI_LEGGINGS = REGISTRY.register("prisoner_kaneki_leggings", () -> new PrisonerKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<GoatKanekiItem> GOAT_KANEKI_HELMET = REGISTRY.register("goat_kaneki_helmet", () -> new GoatKanekiItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<GoatKanekiItem> GOAT_KANEKI_CHESTPLATE = REGISTRY.register("goat_kaneki_chestplate", () -> new GoatKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<GoatKanekiItem> GOAT_KANEKI_LEGGINGS = REGISTRY.register("goat_kaneki_leggings", () -> new GoatKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<GoatKanekiItem> GOAT_KANEKI_BOOTS = REGISTRY.register("goat_kaneki_boots", () -> new GoatKanekiItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<NoroItem> NORO_HELMET = REGISTRY.register("noro_helmet", () -> new NoroItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<NoroItem> NORO_CHESTPLATE = REGISTRY.register("noro_chestplate", () -> new NoroItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<NoroItem> NORO_LEGGINGS = REGISTRY.register("noro_leggings", () -> new NoroItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<NoroItem> NORO_BOOTS = REGISTRY.register("noro_boots", () -> new NoroItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<AyatoReItem> AYATO_RE_HELMET = REGISTRY.register("ayato_re_helmet", () -> new AyatoReItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<AyatoReItem> AYATO_RE_CHESTPLATE = REGISTRY.register("ayato_re_chestplate", () -> new AyatoReItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<AyatoReItem> AYATO_RE_LEGGINGS = REGISTRY.register("ayato_re_leggings", () -> new AyatoReItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<AyatoReItem> AYATO_RE_BOOTS = REGISTRY.register("ayato_re_boots", () -> new AyatoReItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<AyatoS1Item> AYATO_S_1_CHESTPLATE = REGISTRY.register("ayato_s_1_chestplate", () -> new AyatoS1Item(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<AyatoS1Item> AYATO_S_1_LEGGINGS = REGISTRY.register("ayato_s_1_leggings", () -> new AyatoS1Item(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<AyatoS1Item> AYATO_S_1_BOOTS = REGISTRY.register("ayato_s_1_boots", () -> new AyatoS1Item(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<Item> QUINQUE_STEEL_BLOCK = block(GoatowlModBlocks.QUINQUE_STEEL_BLOCK);
	public static final RegistryObject<Item> QUINQUE_STEEL_ITEM = REGISTRY.register("quinque_steel_item", () -> new QuinqueSteelItemItem());
	public static final RegistryObject<Item> QUINQUE_FURNACE_TEST_OFF = block(GoatowlModBlocks.QUINQUE_FURNACE_TEST_OFF);
	public static final RegistryObject<Item> QUINQUE_FURNACE_TEST_ON = block(GoatowlModBlocks.QUINQUE_FURNACE_TEST_ON);
	public static final RegistryObject<Item> HHHHH_SPAWN_EGG = REGISTRY.register("hhhhh_spawn_egg", () -> new ForgeSpawnEggItem(GoatowlModEntities.HHHHH, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TEST_AMATSU = REGISTRY.register("test_amatsu", () -> new TestAmatsuItem());
	public static final RegistryObject<Item> TEST_AUS = REGISTRY.register("test_aus", () -> new TestAusItem());
	public static final RegistryObject<Item> TEST_AYUMI = REGISTRY.register("test_ayumi", () -> new TestAyumiItem());
	public static final RegistryObject<Item> TEST_BOKUSATSU = REGISTRY.register("test_bokusatsu", () -> new TestBokusatsuItem());
	public static final RegistryObject<Item> TEST_DEMON_YAMADA = REGISTRY.register("test_demon_yamada", () -> new TestDemonYamadaItem());
	public static final RegistryObject<Item> TEST_JUUZOU_JASON = REGISTRY.register("test_juuzou_jason", () -> new TestJuuzouJasonItem());
	public static final RegistryObject<Item> AAAAAAAAAAAA_SPAWN_EGG = REGISTRY.register("aaaaaaaaaaaa_spawn_egg", () -> new ForgeSpawnEggItem(GoatowlModEntities.AAAAAAAAAAAA, -1, -1, new Item.Properties()));
	public static final RegistryObject<NoroBlackItem> NORO_BLACK_HELMET = REGISTRY.register("noro_black_helmet", () -> new NoroBlackItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<NoroBlackItem> NORO_BLACK_CHESTPLATE = REGISTRY.register("noro_black_chestplate", () -> new NoroBlackItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<NoroBlackItem> NORO_BLACK_LEGGINGS = REGISTRY.register("noro_black_leggings", () -> new NoroBlackItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<NoroBlackItem> NORO_BLACK_BOOTS = REGISTRY.register("noro_black_boots", () -> new NoroBlackItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<AogiriRobesItem> AOGIRI_ROBES_CHESTPLATE = REGISTRY.register("aogiri_robes_chestplate", () -> new AogiriRobesItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<AogiriRobesItem> AOGIRI_ROBES_LEGGINGS = REGISTRY.register("aogiri_robes_leggings", () -> new AogiriRobesItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<AogiriRobesItem> AOGIRI_ROBES_BOOTS = REGISTRY.register("aogiri_robes_boots", () -> new AogiriRobesItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<BlackReaperKanekiItem> BLACK_REAPER_KANEKI_HELMET = REGISTRY.register("black_reaper_kaneki_helmet", () -> new BlackReaperKanekiItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<BlackReaperKanekiItem> BLACK_REAPER_KANEKI_CHESTPLATE = REGISTRY.register("black_reaper_kaneki_chestplate", () -> new BlackReaperKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<BlackReaperKanekiItem> BLACK_REAPER_KANEKI_LEGGINGS = REGISTRY.register("black_reaper_kaneki_leggings", () -> new BlackReaperKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<BlackReaperKanekiItem> BLACK_REAPER_KANEKI_BOOTS = REGISTRY.register("black_reaper_kaneki_boots", () -> new BlackReaperKanekiItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<VsArimaKanekiItem> VS_ARIMA_KANEKI_CHESTPLATE = REGISTRY.register("vs_arima_kaneki_chestplate", () -> new VsArimaKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<VsArimaKanekiItem> VS_ARIMA_KANEKI_LEGGINGS = REGISTRY.register("vs_arima_kaneki_leggings", () -> new VsArimaKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<VsArimaKanekiItem> VS_ARIMA_KANEKI_BOOTS = REGISTRY.register("vs_arima_kaneki_boots", () -> new VsArimaKanekiItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<ShirtReaperKanekiItem> SHIRT_REAPER_KANEKI_HELMET = REGISTRY.register("shirt_reaper_kaneki_helmet", () -> new ShirtReaperKanekiItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<ShirtReaperKanekiItem> SHIRT_REAPER_KANEKI_CHESTPLATE = REGISTRY.register("shirt_reaper_kaneki_chestplate", () -> new ShirtReaperKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<ShirtReaperKanekiItem> SHIRT_REAPER_KANEKI_LEGGINGS = REGISTRY.register("shirt_reaper_kaneki_leggings", () -> new ShirtReaperKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<ShirtReaperKanekiItem> SHIRT_REAPER_KANEKI_BOOTS = REGISTRY.register("shirt_reaper_kaneki_boots", () -> new ShirtReaperKanekiItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<Item> RACE_TEST_ITEM = REGISTRY.register("race_test_item", () -> new RaceTestItemItem());
	public static final RegistryObject<Item> KAKAHOU_TESTER_ITEM = REGISTRY.register("kakahou_tester_item", () -> new KakahouTesterItemItem());
	public static final RegistryObject<Item> RC_LEVEL_TESTER = REGISTRY.register("rc_level_tester", () -> new RCLevelTesterItem());
	public static final RegistryObject<Item> TEST_KAKUGAN = REGISTRY.register("test_kakugan", () -> new TestKakuganItem());
	public static final RegistryObject<ArimaREItem> ARIMA_RE_HELMET = REGISTRY.register("arima_re_helmet", () -> new ArimaREItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<ArimaREItem> ARIMA_RE_CHESTPLATE = REGISTRY.register("arima_re_chestplate", () -> new ArimaREItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<ArimaREItem> ARIMA_RE_LEGGINGS = REGISTRY.register("arima_re_leggings", () -> new ArimaREItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<ArimaREItem> ARIMA_RE_BOOTS = REGISTRY.register("arima_re_boots", () -> new ArimaREItem(ArmorItem.Type.BOOTS, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
