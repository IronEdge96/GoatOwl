package net.ironedge.goatowl.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.ironedge.goatowl.network.GoatowlModVariables;

public class RCStatSetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double RandomRace = 0;
		if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Human")) {
			if (Mth.nextInt(RandomSource.create(), 1, 80) == 1) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) != 8) {
					{
						double _setval = Mth.nextInt(RandomSource.create(), 200, 500);
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRcCells = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = Mth.nextInt(RandomSource.create(), 50, 200);
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRcCells = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Half-Human")) {
			if (Mth.nextInt(RandomSource.create(), 1, 4) != 4) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) != 10) {
					{
						double _setval = Mth.nextInt(RandomSource.create(), 200, 500);
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRcCells = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = Mth.nextInt(RandomSource.create(), 50, 200);
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRcCells = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				{
					double _setval = Mth.nextInt(RandomSource.create(), 500, 750);
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxRcCells = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Ghoul")) {
			if (Mth.nextInt(RandomSource.create(), 1, 80) == 1) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) != 8) {
					{
						double _setval = Mth.nextInt(RandomSource.create(), 1000, 8000);
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRcCells = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = Mth.nextInt(RandomSource.create(), 850, 1000);
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRcCells = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Half-Ghoul")) {
			if (Mth.nextInt(RandomSource.create(), 1, 4) != 10) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) != 64) {
					{
						double _setval = Mth.nextInt(RandomSource.create(), 1000, 8000);
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRcCells = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = Mth.nextInt(RandomSource.create(), 8000, 10000);
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.MaxRcCells = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				{
					double _setval = Mth.nextInt(RandomSource.create(), 850, 1000);
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxRcCells = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		{
			double _setval = (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).MaxRcCells;
			entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.RcCells = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
