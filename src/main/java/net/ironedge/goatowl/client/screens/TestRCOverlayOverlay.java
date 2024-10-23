
package net.ironedge.goatowl.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.ironedge.goatowl.procedures.TestRCGuiProcedure;
import net.ironedge.goatowl.procedures.TestMaxRCGuiProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class TestRCOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					TestRCGuiProcedure.execute(entity), w / 2 + -163, h / 2 + 75, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					TestMaxRCGuiProcedure.execute(entity), w / 2 + -107, h / 2 + 74, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.goatowl.test_rc_overlay.label_empty"), w / 2 + -114, h / 2 + 75, -1, false);
		}
	}
}
