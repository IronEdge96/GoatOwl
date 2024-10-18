package net.ironedge.goatowl.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.ironedge.goatowl.network.GoatowlModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AbilityCooldownsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("TestTimer") == 0) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 10, 5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 10, 5, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("TestTimer") == 0) {
			entity.getPersistentData().putDouble("TestTimer", 1200);
		} else {
			entity.getPersistentData().putDouble("TestTimer", (entity.getPersistentData().getDouble("TestTimer") - 1));
		}
		if (entity.getPersistentData().getDouble("GoatOwlDashTimer") == 0) {
			{
				boolean _setval = false;
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DashCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.NEUTRAL, 10, 5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bell.use")), SoundSource.NEUTRAL, 10, 5, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("GoatOwlDashTimer") == 0) {
			entity.getPersistentData().putDouble("GoatOwlDashTimer", 50);
		} else {
			entity.getPersistentData().putDouble("GoatOwlDashTimer", (entity.getPersistentData().getDouble("TestTimer") - 1));
		}
		if (entity.getPersistentData().getDouble("GoatOwlAirDashTimer") == 0) {
			{
				boolean _setval = false;
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AirDashCooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bell")), SoundSource.NEUTRAL, 10, 5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bell")), SoundSource.NEUTRAL, 10, 5, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("GoatOwlAirDashTimer") == 0) {
			entity.getPersistentData().putDouble("GoatOwlAirDashTimer", 600);
		} else {
			entity.getPersistentData().putDouble("GoatOwlAirDashTimer", (entity.getPersistentData().getDouble("TestTimer") - 1));
		}
		if (entity.getPersistentData().getDouble("GoatOwlJustDashed") == 0) {
			{
				boolean _setval = false;
				entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.JustDashed = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bell")), SoundSource.NEUTRAL, 10, 5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bell")), SoundSource.NEUTRAL, 10, 5, false);
				}
			}
		}
		if (entity.getPersistentData().getDouble("GoatOwlJustDashed") == 0) {
			entity.getPersistentData().putDouble("GoatOwlJustDashed", 20);
		} else {
			entity.getPersistentData().putDouble("GoatOwlJustDashed", (entity.getPersistentData().getDouble("TestTimer") - 1));
		}
	}
}
