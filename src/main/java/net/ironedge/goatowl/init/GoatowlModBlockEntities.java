
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.ironedge.goatowl.block.entity.QuinqueFurnaceTestOnBlockEntity;
import net.ironedge.goatowl.block.entity.QuinqueFurnaceTestOffBlockEntity;
import net.ironedge.goatowl.GoatowlMod;

public class GoatowlModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GoatowlMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> QUINQUE_FURNACE_TEST_OFF = register("quinque_furnace_test_off", GoatowlModBlocks.QUINQUE_FURNACE_TEST_OFF, QuinqueFurnaceTestOffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> QUINQUE_FURNACE_TEST_ON = register("quinque_furnace_test_on", GoatowlModBlocks.QUINQUE_FURNACE_TEST_ON, QuinqueFurnaceTestOnBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
