package net.ironedge.goatowl.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.ironedge.goatowl.network.GoatowlModVariables;
import net.ironedge.goatowl.GoatowlMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DeclaredInsaneProcedure {
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
		if (entity.getPersistentData().getDouble("Innocents") > 40) {
			if (entity.getPersistentData().getDouble("InsanityPrint") == 0) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) <= entity.getPersistentData().getDouble("Sanity")) {
					GoatowlMod.LOGGER.info(entity.getPersistentData().getDouble("Sanity"));
				}
			}
			if (entity.getPersistentData().getDouble("InsanityPrint") == 0) {
				entity.getPersistentData().putDouble("InsanityPrint", 100);
			} else {
				entity.getPersistentData().putDouble("InsanityPrint", (entity.getPersistentData().getDouble("InsanityCheck") - 1));
			}
			if (entity.getPersistentData().getDouble("Sanity") >= 2 && !(entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Insane) {
				if (entity.getPersistentData().getDouble("InsanityCheck") == 0) {
					if (Mth.nextInt(RandomSource.create(), 1, 10) <= entity.getPersistentData().getDouble("Sanity")) {
						{
							boolean _setval = true;
							entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Insane = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("goatowl:insane_adv"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
						entity.getPersistentData().putDouble("InsaneIdle", Math.random());
						entity.getPersistentData().putDouble("InsaneWalk", Math.random());
						entity.getPersistentData().putDouble("InsaneRun", Math.random());
					}
				}
				if (entity.getPersistentData().getDouble("InsanityCheck") == 0) {
					entity.getPersistentData().putDouble("InsanityCheck", 1200);
				} else {
					entity.getPersistentData().putDouble("InsanityCheck", (entity.getPersistentData().getDouble("InsanityCheck") - 1));
				}
			}
		}
	}
}
