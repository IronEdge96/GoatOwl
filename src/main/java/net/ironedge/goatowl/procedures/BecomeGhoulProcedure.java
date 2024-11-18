package net.ironedge.goatowl.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.ironedge.goatowl.network.GoatowlModVariables;

public class BecomeGhoulProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.RinkakuSpawned = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = false;
			entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.UkakuSpawned = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ActiveKagune = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player) {
			if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Ghoul")
					|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Half-Ghoul")
					|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Quinx")) {
				if (Mth.nextInt(RandomSource.create(), 1, 4) == 1) {
					{
						String _setval = "Koukaku";
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Kakahou = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 2) {
					{
						String _setval = "Ukaku";
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Kakahou = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 3) {
					{
						String _setval = "Rinkaku";
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Kakahou = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = "Bikaku";
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Kakahou = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
					{
						boolean _setval = true;
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Chimera = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You were born with a Chimera Kakahou"), false);
				}
				if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Chimera == true) {
					if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
						if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Koukaku")) {
							if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
								{
									String _setval = "Ukaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
								{
									String _setval = "Rinkaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								{
									String _setval = "Bikaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
							if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
								if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Ukaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Rinkaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Bikaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Rinkaku")) {
											{
												String _setval = "Bikaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Rinkaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Rinkaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Ukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Bikaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Ukaku")) {
											{
												String _setval = "Bikaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Ukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Bikaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Ukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Rinkaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Rinkaku")) {
											{
												String _setval = "Bikaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Rinkaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								}
							}
						} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Ukaku")) {
							if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
								{
									String _setval = "Koukaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
								{
									String _setval = "Rinkaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								{
									String _setval = "Bikaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
							if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
								if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Koukaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Rinkaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Bikaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Rinkaku")) {
											{
												String _setval = "Bikaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Rinkaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Rinkaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Koukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Bikaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Koukaku")) {
											{
												String _setval = "Bikaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Koukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Bikaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Koukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Rinkaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Koukaku")) {
											{
												String _setval = "Rinkaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Koukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								}
							}
						} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Rinkaku")) {
							if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
								{
									String _setval = "Koukaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
								{
									String _setval = "Ukaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								{
									String _setval = "Bikaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
							if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
								if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Koukaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Ukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Bikaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Ukaku")) {
											{
												String _setval = "Bikaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Ukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Ukaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Koukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Bikaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Koukaku")) {
											{
												String _setval = "Bikaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Koukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Bikaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Koukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Ukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Koukaku")) {
											{
												String _setval = "Ukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Koukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								}
							}
						} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Bikaku")) {
							if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
								{
									String _setval = "Koukaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
								{
									String _setval = "Ukaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								{
									String _setval = "Rinkaku";
									entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ChimeraKakhou1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							}
							if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
								if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Koukaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Ukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Rinkaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Ukaku")) {
											{
												String _setval = "Rinkaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Ukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Ukaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Koukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Rinkaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Koukaku")) {
											{
												String _setval = "Rinkaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Koukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Rinkaku")) {
									if (Math.random() == 1) {
										{
											String _setval = "Koukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										{
											String _setval = "Ukaku";
											entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.ChimeraKakahou2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									}
									if (Mth.nextInt(RandomSource.create(), 1, 65) == 1) {
										if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Koukaku")) {
											{
												String _setval = "Ukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											{
												String _setval = "Koukaku";
												entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.ChimeraKakahou3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
									}
								}
							}
						}
					}
				}
				if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Koukaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Koukaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Koukaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou3).equals("Koukaku")) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You were born with a Koukaku Kakahou"), false);
				} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Ukaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Ukaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Ukaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou3).equals("Ukaku")) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You were born with a Ukaku Kakahou"), false);
				} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Rinkaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Rinkaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Rinkaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou3).equals("Rinkaku")) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You were born with a Rinkaku Kakahou"), false);
				} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Bikaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Bikaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Bikaku")
						|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou3).equals("Bikaku")) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You were born with a Bikaku Kakahou"), false);
				}
				GetKakuganProcedure.execute(entity);
			} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Human")
					|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Half-Human")) {
				{
					String _setval = "None";
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Kakahou = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChimeraKakhou1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChimeraKakahou2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "None";
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ChimeraKakahou3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
