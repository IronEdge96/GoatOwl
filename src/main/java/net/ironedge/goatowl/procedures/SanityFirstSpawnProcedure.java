package net.ironedge.goatowl.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;

import net.ironedge.goatowl.network.GoatowlModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SanityFirstSpawnProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).NewSpawned) {
			entity.getPersistentData().putDouble("Sanity", 0);
			entity.getPersistentData().putDouble("Innocents", 0);
			{
				boolean _setval = true;
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.NewSpawned = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
