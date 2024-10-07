package net.ironedge.goatowl.procedures;

import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;
import net.minecraft.client.player.AbstractClientPlayer;

import net.ironedge.goatowl.network.GoatowlModVariables;
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
public class InsaneTickProcedure {
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
		if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Insane) {
			if (!(entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Moving || !entity.isShiftKeyDown() || !entity.isSprinting()) {
				if (entity.getPersistentData().getDouble("InsaneIdle") == 0) {
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("goatowl", "player_animation"));
							if (animation != null && !animation.isActive()) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("goatowl", "animation.insaneidle"))));
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
										GoatowlMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.GoatowlModAnimationMessage(Component.literal("animation.insaneidle"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
								}
							}
						}
					}
				} else {
					if (world.isClientSide()) {
						if (entity instanceof AbstractClientPlayer player) {
							var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("goatowl", "player_animation"));
							if (animation != null && !animation.isActive()) {
								animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("goatowl", "animation.insaneidle2"))));
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
										GoatowlMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.GoatowlModAnimationMessage(Component.literal("animation.insaneidle2"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
								}
							}
						}
					}
				}
			}
		}
	}
}
