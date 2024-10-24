package net.ironedge.goatowl.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.ironedge.goatowl.GoatowlMod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GoatowlModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		GoatowlMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.DashCooldown = original.DashCooldown;
			clone.AirDashCooldown = original.AirDashCooldown;
			clone.JustDashed = original.JustDashed;
			clone.JoinedWorld = original.JoinedWorld;
			clone.MaxRcCells = original.MaxRcCells;
			clone.Race = original.Race;
			if (!event.isWasDeath()) {
				clone.RinkakuSpawned = original.RinkakuSpawned;
				clone.KakujaSpawned = original.KakujaSpawned;
				clone.XPos = original.XPos;
				clone.ZPos = original.ZPos;
				clone.Moving = original.Moving;
				clone.UkakuSpawned = original.UkakuSpawned;
				clone.RcCells = original.RcCells;
				clone.RinkakuGUI = original.RinkakuGUI;
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("goatowl", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean RinkakuSpawned = false;
		public boolean KakujaSpawned = false;
		public double XPos = 0;
		public double ZPos = 0;
		public boolean Moving = false;
		public boolean UkakuSpawned = false;
		public boolean DashCooldown = false;
		public boolean AirDashCooldown = false;
		public boolean JustDashed = false;
		public boolean JoinedWorld = false;
		public double RcCells = 0;
		public double MaxRcCells = 0;
		public String Race = "\"\"";
		public boolean RinkakuGUI = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				GoatowlMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("RinkakuSpawned", RinkakuSpawned);
			nbt.putBoolean("KakujaSpawned", KakujaSpawned);
			nbt.putDouble("XPos", XPos);
			nbt.putDouble("ZPos", ZPos);
			nbt.putBoolean("Moving", Moving);
			nbt.putBoolean("UkakuSpawned", UkakuSpawned);
			nbt.putBoolean("DashCooldown", DashCooldown);
			nbt.putBoolean("AirDashCooldown", AirDashCooldown);
			nbt.putBoolean("JustDashed", JustDashed);
			nbt.putBoolean("JoinedWorld", JoinedWorld);
			nbt.putDouble("RcCells", RcCells);
			nbt.putDouble("MaxRcCells", MaxRcCells);
			nbt.putString("Race", Race);
			nbt.putBoolean("RinkakuGUI", RinkakuGUI);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			RinkakuSpawned = nbt.getBoolean("RinkakuSpawned");
			KakujaSpawned = nbt.getBoolean("KakujaSpawned");
			XPos = nbt.getDouble("XPos");
			ZPos = nbt.getDouble("ZPos");
			Moving = nbt.getBoolean("Moving");
			UkakuSpawned = nbt.getBoolean("UkakuSpawned");
			DashCooldown = nbt.getBoolean("DashCooldown");
			AirDashCooldown = nbt.getBoolean("AirDashCooldown");
			JustDashed = nbt.getBoolean("JustDashed");
			JoinedWorld = nbt.getBoolean("JoinedWorld");
			RcCells = nbt.getDouble("RcCells");
			MaxRcCells = nbt.getDouble("MaxRcCells");
			Race = nbt.getString("Race");
			RinkakuGUI = nbt.getBoolean("RinkakuGUI");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GoatowlMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.RinkakuSpawned = message.data.RinkakuSpawned;
					variables.KakujaSpawned = message.data.KakujaSpawned;
					variables.XPos = message.data.XPos;
					variables.ZPos = message.data.ZPos;
					variables.Moving = message.data.Moving;
					variables.UkakuSpawned = message.data.UkakuSpawned;
					variables.DashCooldown = message.data.DashCooldown;
					variables.AirDashCooldown = message.data.AirDashCooldown;
					variables.JustDashed = message.data.JustDashed;
					variables.JoinedWorld = message.data.JoinedWorld;
					variables.RcCells = message.data.RcCells;
					variables.MaxRcCells = message.data.MaxRcCells;
					variables.Race = message.data.Race;
					variables.RinkakuGUI = message.data.RinkakuGUI;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
