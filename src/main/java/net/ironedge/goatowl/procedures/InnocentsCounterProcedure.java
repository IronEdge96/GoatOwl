package net.ironedge.goatowl.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.ironedge.goatowl.GoatowlMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InnocentsCounterProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (entity instanceof Mob && !(entity instanceof Monster)) {
				sourceentity.getPersistentData().putDouble("Innocents", (sourceentity.getPersistentData().getDouble("Innocents") + 1));
				GoatowlMod.LOGGER.info(sourceentity.getPersistentData().getDouble("Innocents"));
			}
		}
	}
}
