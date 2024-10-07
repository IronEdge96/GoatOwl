package net.ironedge.goatowl.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.ironedge.goatowl.network.GoatowlModVariables;
import net.ironedge.goatowl.GoatowlMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MoveCheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		GoatowlMod.queueServerWork(2, () -> {
			if (entity.getX() != (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).XPos
					|| entity.getZ() != (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ZPos) {
				GoatowlMod.LOGGER.info("Moving");
				{
					boolean _setval = true;
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Moving = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				GoatowlMod.LOGGER.info("Idle");
				{
					boolean _setval = false;
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Moving = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			{
				double _setval = entity.getX();
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.XPos = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.getZ();
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ZPos = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		});
	}
}
