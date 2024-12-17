package net.ironedge.goatowl.procedures;

import net.minecraft.world.entity.Entity;

import net.ironedge.goatowl.network.GoatowlModVariables;

public class ReawakenedClawClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Claw";
			entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.KakujaExtra = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
