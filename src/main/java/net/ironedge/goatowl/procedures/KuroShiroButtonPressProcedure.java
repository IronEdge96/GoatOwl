package net.ironedge.goatowl.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.ironedge.goatowl.network.GoatowlModVariables;

public class KuroShiroButtonPressProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "KuroShiro";
			entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Rinkaku = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Classic";
			entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.KaguneStyling = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (Math.random() == 0) {
			{
				String _setval = "Kuro";
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RinkakuForm = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = "Shiro";
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RinkakuForm = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Kuro/Shiro Rinkaku"), false);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
