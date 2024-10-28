package net.ironedge.goatowl.procedures;

import net.minecraft.world.entity.Entity;

import net.ironedge.goatowl.network.GoatowlModVariables;

public class RCTester50Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 50;
			entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MaxRcCells = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).MaxRcCells;
			entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.RcCells = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
