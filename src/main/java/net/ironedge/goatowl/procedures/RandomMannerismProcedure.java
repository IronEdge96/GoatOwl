package net.ironedge.goatowl.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;
import net.minecraft.core.BlockPos;
import net.minecraft.client.player.AbstractClientPlayer;

import net.ironedge.goatowl.GoatowlMod;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Iterator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

@Mod.EventBusSubscriber
public class RandomMannerismProcedure {
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
		if (entity.getPersistentData().getDouble("Mannerism") == 1) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
				if (entity.getPersistentData().getDouble("RandomEmote") == 0) {
					if (!entity.isSprinting() || entity.getDeltaMovement().x() > 0 || entity.getDeltaMovement().y() > 0 || entity.getDeltaMovement().z() > 0) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_crack")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.egg_crack")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (world.isClientSide()) {
							if (entity instanceof AbstractClientPlayer player) {
								var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("goatowl", "player_animation"));
								if (animation != null && !animation.isActive()) {
									animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("goatowl", "animation.kanekisnap"))));
								}
							}
						}
						if (!world.isClientSide()) {
							if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
								List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
								synchronized (connections) {
									Iterator<Connection> iterator = connections.iterator();
									while (iterator.hasNext()) {
										Connection connection = iterator.next();
										if (!connection.isConnecting() && connection.isConnected())
											GoatowlMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.GoatowlModAnimationMessage(Component.literal("animation.kanekisnap"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
									}
								}
							}
						}
					}
				}
				if (entity.getPersistentData().getDouble("RandomEmote") == 0) {
					entity.getPersistentData().putDouble("RandomEmote", (500 / entity.getPersistentData().getDouble("Sanity")));
				} else {
					entity.getPersistentData().putDouble("RandomEmote", (entity.getPersistentData().getDouble("RandomEmote") - 1));
				}
			}
		} else if (entity.getPersistentData().getDouble("Mannerism") == 0) {
			if (entity.getPersistentData().getDouble("MannerismChance") == 0) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) == 1) {
					entity.getPersistentData().putDouble("Mannerism", 1);
				}
			}
			if (entity.getPersistentData().getDouble("MannerismChance") == 0) {
				entity.getPersistentData().putDouble("MannerismChance", (60000 / entity.getPersistentData().getDouble("Sanity")));
			} else {
				entity.getPersistentData().putDouble("MannerismChance", (entity.getPersistentData().getDouble("RandomEmote") - 1));
			}
		}
	}
}
