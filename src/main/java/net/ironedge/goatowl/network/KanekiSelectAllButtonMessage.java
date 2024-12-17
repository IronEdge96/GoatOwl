
package net.ironedge.goatowl.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.ironedge.goatowl.world.inventory.KanekiSelectAllMenu;
import net.ironedge.goatowl.procedures.ReawakenedClickedProcedure;
import net.ironedge.goatowl.procedures.ReaperClickedProcedure;
import net.ironedge.goatowl.procedures.OEKClickedProcedure;
import net.ironedge.goatowl.procedures.DragonClickedProcedure;
import net.ironedge.goatowl.procedures.CentipedeClickedProcedure;
import net.ironedge.goatowl.GoatowlMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KanekiSelectAllButtonMessage {
	private final int buttonID, x, y, z;

	public KanekiSelectAllButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public KanekiSelectAllButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(KanekiSelectAllButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(KanekiSelectAllButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = KanekiSelectAllMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CentipedeClickedProcedure.execute(entity);
		}
		if (buttonID == 1) {

			OEKClickedProcedure.execute(entity);
		}
		if (buttonID == 2) {

			DragonClickedProcedure.execute(entity);
		}
		if (buttonID == 3) {

			ReaperClickedProcedure.execute(entity);
		}
		if (buttonID == 4) {

			ReawakenedClickedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GoatowlMod.addNetworkMessage(KanekiSelectAllButtonMessage.class, KanekiSelectAllButtonMessage::buffer, KanekiSelectAllButtonMessage::new, KanekiSelectAllButtonMessage::handler);
	}
}
