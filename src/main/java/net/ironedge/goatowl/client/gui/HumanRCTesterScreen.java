package net.ironedge.goatowl.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.ironedge.goatowl.world.inventory.HumanRCTesterMenu;
import net.ironedge.goatowl.network.HumanRCTesterButtonMessage;
import net.ironedge.goatowl.GoatowlMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HumanRCTesterScreen extends AbstractContainerScreen<HumanRCTesterMenu> {
	private final static HashMap<String, Object> guistate = HumanRCTesterMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_random;
	Button button_50;
	Button button_200;
	Button button_500;

	public HumanRCTesterScreen(HumanRCTesterMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("goatowl:textures/screens/human_rc_tester.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_random = Button.builder(Component.translatable("gui.goatowl.human_rc_tester.button_random"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new HumanRCTesterButtonMessage(0, x, y, z));
				HumanRCTesterButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 129, 56, 20).build();
		guistate.put("button:button_random", button_random);
		this.addRenderableWidget(button_random);
		button_50 = Button.builder(Component.translatable("gui.goatowl.human_rc_tester.button_50"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new HumanRCTesterButtonMessage(1, x, y, z));
				HumanRCTesterButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 71, this.topPos + 18, 35, 20).build();
		guistate.put("button:button_50", button_50);
		this.addRenderableWidget(button_50);
		button_200 = Button.builder(Component.translatable("gui.goatowl.human_rc_tester.button_200"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new HumanRCTesterButtonMessage(2, x, y, z));
				HumanRCTesterButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 59, 40, 20).build();
		guistate.put("button:button_200", button_200);
		this.addRenderableWidget(button_200);
		button_500 = Button.builder(Component.translatable("gui.goatowl.human_rc_tester.button_500"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new HumanRCTesterButtonMessage(3, x, y, z));
				HumanRCTesterButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 68, this.topPos + 93, 40, 20).build();
		guistate.put("button:button_500", button_500);
		this.addRenderableWidget(button_500);
	}
}
