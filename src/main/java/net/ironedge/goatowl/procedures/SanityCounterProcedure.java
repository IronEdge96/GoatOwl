package net.ironedge.goatowl.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SanityCounterProcedure {
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
		if (entity.getPersistentData().getDouble("Innocents") <= 260 && entity.getPersistentData().getDouble("Sanity") == 0) {
			entity.getPersistentData().putDouble("Sanity", 1);
		} else {
			if (entity.getPersistentData().getDouble("Innocents") <= 455 && entity.getPersistentData().getDouble("Sanity") == 1) {
				entity.getPersistentData().putDouble("Sanity", 2);
			} else {
				if (entity.getPersistentData().getDouble("Innocents") <= 855 && entity.getPersistentData().getDouble("Sanity") == 2) {
					entity.getPersistentData().putDouble("Sanity", 3);
				} else {
					if (entity.getPersistentData().getDouble("Innocents") <= 1200 && entity.getPersistentData().getDouble("Sanity") == 3) {
						entity.getPersistentData().putDouble("Sanity", 4);
					} else {
						if (entity.getPersistentData().getDouble("Innocents") > 1200 && entity.getPersistentData().getDouble("Sanity") == 4) {
							entity.getPersistentData().putDouble("Sanity", 5);
						}
					}
				}
			}
		}
	}
}
