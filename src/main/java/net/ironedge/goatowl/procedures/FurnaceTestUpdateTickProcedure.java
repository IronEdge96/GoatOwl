package net.ironedge.goatowl.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FurnaceTestUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FurnaceTestFuelProcedure.execute(world, x, y, z);
		FurnaceTestSmeltProcedure.execute(world, x, y, z);
	}
}
