
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

import net.ironedge.goatowl.item.TestJuuzouJasonItem;
import net.ironedge.goatowl.item.TestDemonYamadaItem;
import net.ironedge.goatowl.item.TestBokusatsuItem;
import net.ironedge.goatowl.item.TestAyumiItem;
import net.ironedge.goatowl.item.TestAusItem;
import net.ironedge.goatowl.item.TestAmatsuItem;
import net.ironedge.goatowl.item.QuinqueSteelItemItem;
import net.ironedge.goatowl.item.PrisonerKanekiItem;
import net.ironedge.goatowl.item.NoroItem;
import net.ironedge.goatowl.item.InsaneAdvItemItem;
import net.ironedge.goatowl.item.GoatKanekiItem;
import net.ironedge.goatowl.item.DefaultKanekiItem;
import net.ironedge.goatowl.item.CentipedeKanekiItem;
import net.ironedge.goatowl.item.AyatoS1Item;
import net.ironedge.goatowl.item.AyatoReItem;
import net.ironedge.goatowl.item.AltKanekiItem;
import net.ironedge.goatowl.GoatowlMod;

public class GoatowlModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GoatowlMod.MODID);
	public static final RegistryObject<DefaultKanekiItem> DEFAULT_KANEKI_CHESTPLATE = REGISTRY.register("default_kaneki_chestplate", () -> new DefaultKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<DefaultKanekiItem> DEFAULT_KANEKI_LEGGINGS = REGISTRY.register("default_kaneki_leggings", () -> new DefaultKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<DefaultKanekiItem> DEFAULT_KANEKI_BOOTS = REGISTRY.register("default_kaneki_boots", () -> new DefaultKanekiItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<PrisonerKanekiItem> PRISONER_KANEKI_CHESTPLATE = REGISTRY.register("prisoner_kaneki_chestplate", () -> new PrisonerKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<PrisonerKanekiItem> PRISONER_KANEKI_LEGGINGS = REGISTRY.register("prisoner_kaneki_leggings", () -> new PrisonerKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<CentipedeKanekiItem> CENTIPEDE_KANEKI_CHESTPLATE = REGISTRY.register("centipede_kaneki_chestplate", () -> new CentipedeKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<CentipedeKanekiItem> CENTIPEDE_KANEKI_LEGGINGS = REGISTRY.register("centipede_kaneki_leggings", () -> new CentipedeKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<CentipedeKanekiItem> CENTIPEDE_KANEKI_BOOTS = REGISTRY.register("centipede_kaneki_boots", () -> new CentipedeKanekiItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<AltKanekiItem> ALT_KANEKI_CHESTPLATE = REGISTRY.register("alt_kaneki_chestplate", () -> new AltKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<AltKanekiItem> ALT_KANEKI_LEGGINGS = REGISTRY.register("alt_kaneki_leggings", () -> new AltKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<AltKanekiItem> ALT_KANEKI_BOOTS = REGISTRY.register("alt_kaneki_boots", () -> new AltKanekiItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<GoatKanekiItem> GOAT_KANEKI_HELMET = REGISTRY.register("goat_kaneki_helmet", () -> new GoatKanekiItem(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<GoatKanekiItem> GOAT_KANEKI_CHESTPLATE = REGISTRY.register("goat_kaneki_chestplate", () -> new GoatKanekiItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<GoatKanekiItem> GOAT_KANEKI_LEGGINGS = REGISTRY.register("goat_kaneki_leggings", () -> new GoatKanekiItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<GoatKanekiItem> GOAT_KANEKI_BOOTS = REGISTRY.register("goat_kaneki_boots", () -> new GoatKanekiItem(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<Item> INSANE_ADV_ITEM = REGISTRY.register("insane_adv_item", () -> new InsaneAdvItemItem());
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

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
