package net.ironedge.goatowl.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.ironedge.goatowl.network.GoatowlModVariables;
import net.ironedge.goatowl.GoatowlMod;

public class DashProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intentionally_empty")), SoundSource.NEUTRAL, 100, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intentionally_empty")), SoundSource.NEUTRAL, 100, 1, false);
			}
		}
		if (entity instanceof Player) {
			if (!entity.isInWater() && !(entity instanceof Player player && player.getAbilities().flying)) {
				if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Moving) {
					if (-2 < entity.getDeltaMovement().x() * 12 && -2 < entity.getDeltaMovement().z() * 12 && 2 > entity.getDeltaMovement().x() * 12 && 2 > entity.getDeltaMovement().z() * 12) {
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 12), (-1000), (entity.getDeltaMovement().z() * 12)));
						GoatowlMod.LOGGER.info(entity.getDeltaMovement().x());
						GoatowlMod.LOGGER.info(entity.getDeltaMovement().z());
					}
				} else {
					if (world.isEmptyBlock(BlockPos.containing(x, y, z))) {
						if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).AirDashCooldown == false) {
							entity.setDeltaMovement(new Vec3((-(entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.5)), 1.5, (-(entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.5))));
							{
								boolean _setval = true;
								entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.AirDashCooldown = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = true;
								entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.JustDashed = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 100, 100);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.yes")), SoundSource.NEUTRAL, 100, 100, false);
								}
							}
						}
					} else {
						entity.setDeltaMovement(new Vec3((-(entity.getDeltaMovement().x() + entity.getLookAngle().x * 0.69)), 0.69, (-(entity.getDeltaMovement().z() + entity.getLookAngle().z * 0.69))));
						{
							boolean _setval = true;
							entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DashCooldown = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.JustDashed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		}
	}
}
