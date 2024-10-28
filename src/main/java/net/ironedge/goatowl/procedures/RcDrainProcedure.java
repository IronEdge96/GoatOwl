package net.ironedge.goatowl.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.ironedge.goatowl.network.GoatowlModVariables;
import net.ironedge.goatowl.GoatowlMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RcDrainProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RinkakuSpawned
				|| (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).UkakuSpawned) {
			if (entity.getPersistentData().getDouble("RCDrainTimer") == 0) {
				entity.getPersistentData().putDouble("RCDrainTimer", 20);
			} else {
				entity.getPersistentData().putDouble("RCDrainTimer", (entity.getPersistentData().getDouble("RCDrainTimer") - 1));
			}
			if (entity.getPersistentData().getDouble("RCDrainTimer") == 0) {
				if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells > 0) {
					{
						double _setval = (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells
								- (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ActiveKagune;
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RcCells = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else {
			if (entity.getPersistentData().getDouble("RCAddTimer") == 0) {
				entity.getPersistentData().putDouble("RCAddTimer", 100);
			} else {
				entity.getPersistentData().putDouble("RCAddTimer", (entity.getPersistentData().getDouble("RCDrainTimer") - 1));
			}
			if (entity.getPersistentData().getDouble("RCAddTimer") == 0) {
				if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells < (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new GoatowlModVariables.PlayerVariables())).MaxRcCells) {
					{
						double _setval = (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells + 2;
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RcCells = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		GoatowlMod.LOGGER.info((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ActiveKagune);
	}
}
