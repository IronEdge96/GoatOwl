
package net.ironedge.goatowl.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.ironedge.goatowl.world.inventory.ReawakenedGUIMenu;
import net.ironedge.goatowl.procedures.ReawakenedResetClickedProcedure;
import net.ironedge.goatowl.procedures.ReawakenedClawClickedProcedure;
import net.ironedge.goatowl.procedures.ReawakedClassicClickedProcedure;
import net.ironedge.goatowl.procedures.ReawakedBaseClickedProcedure;
import net.ironedge.goatowl.GoatowlMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReawakenedGUIButtonMessage {
	private final int buttonID, x, y, z;

	public ReawakenedGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ReawakenedGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ReawakenedGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ReawakenedGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = ReawakenedGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ReawakenedClawClickedProcedure.execute(entity);
		}
		if (buttonID == 1) {

			ReawakenedResetClickedProcedure.execute(entity);
		}
		if (buttonID == 2) {

			ReawakedBaseClickedProcedure.execute(entity);
		}
		if (buttonID == 3) {

			ReawakedClassicClickedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GoatowlMod.addNetworkMessage(ReawakenedGUIButtonMessage.class, ReawakenedGUIButtonMessage::buffer, ReawakenedGUIButtonMessage::new, ReawakenedGUIButtonMessage::handler);
	}
}
