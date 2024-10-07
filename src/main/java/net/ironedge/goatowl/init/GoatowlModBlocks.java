
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.ironedge.goatowl.block.QuinqueSteelBlockBlock;
import net.ironedge.goatowl.block.QuinqueFurnaceTestOnBlock;
import net.ironedge.goatowl.block.QuinqueFurnaceTestOffBlock;
import net.ironedge.goatowl.GoatowlMod;

public class GoatowlModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GoatowlMod.MODID);
	public static final RegistryObject<Block> QUINQUE_STEEL_BLOCK = REGISTRY.register("quinque_steel_block", () -> new QuinqueSteelBlockBlock());
	public static final RegistryObject<Block> QUINQUE_FURNACE_TEST_OFF = REGISTRY.register("quinque_furnace_test_off", () -> new QuinqueFurnaceTestOffBlock());
	public static final RegistryObject<Block> QUINQUE_FURNACE_TEST_ON = REGISTRY.register("quinque_furnace_test_on", () -> new QuinqueFurnaceTestOnBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
