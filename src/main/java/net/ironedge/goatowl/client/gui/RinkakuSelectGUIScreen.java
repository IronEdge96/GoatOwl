package net.ironedge.goatowl.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.ironedge.goatowl.world.inventory.RinkakuSelectGUIMenu;
import net.ironedge.goatowl.network.RinkakuSelectGUIButtonMessage;
import net.ironedge.goatowl.GoatowlMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RinkakuSelectGUIScreen extends AbstractContainerScreen<RinkakuSelectGUIMenu> {
	private final static HashMap<String, Object> guistate = RinkakuSelectGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_rize;
	Button button_kaneki;
	Button button_kuroshiro;

	public RinkakuSelectGUIScreen(RinkakuSelectGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("goatowl:textures/screens/rinkaku_select_gui.png");

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
		button_rize = Button.builder(Component.translatable("gui.goatowl.rinkaku_select_gui.button_rize"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuSelectGUIButtonMessage(0, x, y, z));
				RinkakuSelectGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 11, 46, 20).build();
		guistate.put("button:button_rize", button_rize);
		this.addRenderableWidget(button_rize);
		button_kaneki = Button.builder(Component.translatable("gui.goatowl.rinkaku_select_gui.button_kaneki"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuSelectGUIButtonMessage(1, x, y, z));
				RinkakuSelectGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 109, this.topPos + 11, 56, 20).build();
		guistate.put("button:button_kaneki", button_kaneki);
		this.addRenderableWidget(button_kaneki);
		button_kuroshiro = Button.builder(Component.translatable("gui.goatowl.rinkaku_select_gui.button_kuroshiro"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RinkakuSelectGUIButtonMessage(2, x, y, z));
				RinkakuSelectGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 9, this.topPos + 44, 77, 20).build();
		guistate.put("button:button_kuroshiro", button_kuroshiro);
		this.addRenderableWidget(button_kuroshiro);
	}
}
