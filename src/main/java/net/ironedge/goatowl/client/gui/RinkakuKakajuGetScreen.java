package net.ironedge.goatowl.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.ironedge.goatowl.world.inventory.RinkakuKakajuGetMenu;
import net.ironedge.goatowl.network.RinkakuKakajuGetButtonMessage;
import net.ironedge.goatowl.GoatowlMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RinkakuKakajuGetScreen extends AbstractContainerScreen<RinkakuKakajuGetMenu> {
	private final static HashMap<String, Object> guistate = RinkakuKakajuGetMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_kaneki;
	Button button_1;
	Button button_2;
	Button button_3;
	Button button_4;
	Button button_5;
	Button button_all;

	public RinkakuKakajuGetScreen(RinkakuKakajuGetMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("goatowl:textures/screens/rinkaku_kakaju_get.png");

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
		button_kaneki = Button.builder(Component.translatable("gui.goatowl.rinkaku_kakaju_get.button_kaneki"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuKakajuGetButtonMessage(0, x, y, z));
				RinkakuKakajuGetButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 3, 56, 20).build();
		guistate.put("button:button_kaneki", button_kaneki);
		this.addRenderableWidget(button_kaneki);
		button_1 = Button.builder(Component.translatable("gui.goatowl.rinkaku_kakaju_get.button_1"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuKakajuGetButtonMessage(1, x, y, z));
				RinkakuKakajuGetButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 143, this.topPos + 60, 30, 20).build();
		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);
		button_2 = Button.builder(Component.translatable("gui.goatowl.rinkaku_kakaju_get.button_2"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuKakajuGetButtonMessage(2, x, y, z));
				RinkakuKakajuGetButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 143, this.topPos + 79, 30, 20).build();
		guistate.put("button:button_2", button_2);
		this.addRenderableWidget(button_2);
		button_3 = Button.builder(Component.translatable("gui.goatowl.rinkaku_kakaju_get.button_3"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuKakajuGetButtonMessage(3, x, y, z));
				RinkakuKakajuGetButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 143, this.topPos + 98, 30, 20).build();
		guistate.put("button:button_3", button_3);
		this.addRenderableWidget(button_3);
		button_4 = Button.builder(Component.translatable("gui.goatowl.rinkaku_kakaju_get.button_4"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuKakajuGetButtonMessage(4, x, y, z));
				RinkakuKakajuGetButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 143, this.topPos + 118, 30, 20).build();
		guistate.put("button:button_4", button_4);
		this.addRenderableWidget(button_4);
		button_5 = Button.builder(Component.translatable("gui.goatowl.rinkaku_kakaju_get.button_5"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuKakajuGetButtonMessage(5, x, y, z));
				RinkakuKakajuGetButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 143, this.topPos + 137, 30, 20).build();
		guistate.put("button:button_5", button_5);
		this.addRenderableWidget(button_5);
		button_all = Button.builder(Component.translatable("gui.goatowl.rinkaku_kakaju_get.button_all"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuKakajuGetButtonMessage(6, x, y, z));
				RinkakuKakajuGetButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 175, this.topPos + 144, 40, 20).build();
		guistate.put("button:button_all", button_all);
		this.addRenderableWidget(button_all);
	}
}
