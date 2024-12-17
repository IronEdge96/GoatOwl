package net.ironedge.goatowl.procedures;

import net.minecraft.world.entity.Entity;

import net.ironedge.goatowl.network.GoatowlModVariables;

public class KakujaKeyOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.KakujaGUI = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
