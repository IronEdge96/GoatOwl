package net.ironedge.goatowl.procedures;

import net.minecraft.world.entity.Entity;

import net.ironedge.goatowl.network.GoatowlModVariables;

public class UkakuGetProcProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Ukaku")
				|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Ukaku")
				|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Ukaku")
				|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou3).equals("Ukaku")) {
			{
				String _setval = "Ayato";
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Ukaku = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
