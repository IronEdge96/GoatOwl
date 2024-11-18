
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ironedge.goatowl.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.ironedge.goatowl.network.UkakuKeyMessage;
import net.ironedge.goatowl.network.RinkakuKeyMessage;
import net.ironedge.goatowl.network.DashKeyMessage;
import net.ironedge.goatowl.GoatowlMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GoatowlModKeyMappings {
	public static final KeyMapping RINKAKU_KEY = new KeyMapping("key.goatowl.rinkaku_key", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuKeyMessage(0, 0));
				RinkakuKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				RINKAKU_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - RINKAKU_KEY_LASTPRESS);
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuKeyMessage(1, dt));
				RinkakuKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping KAKUJA_KEY = new KeyMapping("key.goatowl.kakuja_key", GLFW.GLFW_KEY_K, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KakujaKeyMessage(0, 0));
				KakujaKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping UKAKU_KEY = new KeyMapping("key.goatowl.ukaku_key", GLFW.GLFW_KEY_U, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new UkakuKeyMessage(0, 0));
				UkakuKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DASH_KEY = new KeyMapping("key.goatowl.dash_key", GLFW.GLFW_KEY_LEFT_CONTROL, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new DashKeyMessage(0, 0));
				DashKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long RINKAKU_KEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(RINKAKU_KEY);
		event.register(KAKUJA_KEY);
		event.register(UKAKU_KEY);
		event.register(DASH_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				RINKAKU_KEY.consumeClick();
				KAKUJA_KEY.consumeClick();
				UKAKU_KEY.consumeClick();
				DASH_KEY.consumeClick();
			}
		}
	}
}
