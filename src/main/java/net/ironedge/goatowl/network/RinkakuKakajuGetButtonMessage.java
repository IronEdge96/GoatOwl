
package net.ironedge.goatowl.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.ironedge.goatowl.world.inventory.RinkakuKakajuGetMenu;
import net.ironedge.goatowl.procedures.KanekiKakujaGetProcedure;
import net.ironedge.goatowl.procedures.KakujaAllPressedProcedure;
import net.ironedge.goatowl.procedures.Kakuja5PressedProcedure;
import net.ironedge.goatowl.procedures.Kakuja4PressedProcedure;
import net.ironedge.goatowl.procedures.Kakuja3PressedProcedure;
import net.ironedge.goatowl.procedures.Kakuja2PressedProcedure;
import net.ironedge.goatowl.procedures.Kakuja1PressedProcedure;
import net.ironedge.goatowl.GoatowlMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RinkakuKakajuGetButtonMessage {
	private final int buttonID, x, y, z;

	public RinkakuKakajuGetButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public RinkakuKakajuGetButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(RinkakuKakajuGetButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(RinkakuKakajuGetButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = RinkakuKakajuGetMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			KanekiKakujaGetProcedure.execute(entity);
		}
		if (buttonID == 1) {

			Kakuja1PressedProcedure.execute(entity);
		}
		if (buttonID == 2) {

			Kakuja2PressedProcedure.execute(entity);
		}
		if (buttonID == 3) {

			Kakuja3PressedProcedure.execute(entity);
		}
		if (buttonID == 4) {

			Kakuja4PressedProcedure.execute(entity);
		}
		if (buttonID == 5) {

			Kakuja5PressedProcedure.execute(entity);
		}
		if (buttonID == 6) {

			KakujaAllPressedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GoatowlMod.addNetworkMessage(RinkakuKakajuGetButtonMessage.class, RinkakuKakajuGetButtonMessage::buffer, RinkakuKakajuGetButtonMessage::new, RinkakuKakajuGetButtonMessage::handler);
	}
}
