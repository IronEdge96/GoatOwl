package net.ironedge.goatowl.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.ironedge.goatowl.network.GoatowlModVariables;

public class KakujaKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KakujaSpawned) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Kakuja Spawned"), false);
			{
				boolean _setval = true;
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KakujaSpawned = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Kakuja Despawned"), false);
			{
				boolean _setval = false;
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KakujaSpawned = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
