package net.ironedge.goatowl.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.ironedge.goatowl.world.inventory.KakakhouSelectGUIMenu;
import net.ironedge.goatowl.network.KakakhouSelectGUIButtonMessage;
import net.ironedge.goatowl.GoatowlMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class KakakhouSelectGUIScreen extends AbstractContainerScreen<KakakhouSelectGUIMenu> {
	private final static HashMap<String, Object> guistate = KakakhouSelectGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_koukaku;
	Button button_ukaku;
	Button button_rinkaku;
	Button button_bikaku;
	Button button_chimera;

	public KakakhouSelectGUIScreen(KakakhouSelectGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

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
		button_koukaku = Button.builder(Component.translatable("gui.goatowl.kakakhou_select_gui.button_koukaku"), e -> {
		}).bounds(this.leftPos + 52, this.topPos + 16, 67, 20).build();
		guistate.put("button:button_koukaku", button_koukaku);
		this.addRenderableWidget(button_koukaku);
		button_ukaku = Button.builder(Component.translatable("gui.goatowl.kakakhou_select_gui.button_ukaku"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KakakhouSelectGUIButtonMessage(1, x, y, z));
				KakakhouSelectGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 61, this.topPos + 43, 51, 20).build();
		guistate.put("button:button_ukaku", button_ukaku);
		this.addRenderableWidget(button_ukaku);
		button_rinkaku = Button.builder(Component.translatable("gui.goatowl.kakakhou_select_gui.button_rinkaku"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KakakhouSelectGUIButtonMessage(2, x, y, z));
				KakakhouSelectGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 55, this.topPos + 69, 61, 20).build();
		guistate.put("button:button_rinkaku", button_rinkaku);
		this.addRenderableWidget(button_rinkaku);
		button_bikaku = Button.builder(Component.translatable("gui.goatowl.kakakhou_select_gui.button_bikaku"), e -> {
		}).bounds(this.leftPos + 58, this.topPos + 97, 56, 20).build();
		guistate.put("button:button_bikaku", button_bikaku);
		this.addRenderableWidget(button_bikaku);
		button_chimera = Button.builder(Component.translatable("gui.goatowl.kakakhou_select_gui.button_chimera"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KakakhouSelectGUIButtonMessage(4, x, y, z));
				KakakhouSelectGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 115, this.topPos + 146, 61, 20).build();
		guistate.put("button:button_chimera", button_chimera);
		this.addRenderableWidget(button_chimera);
	}
}
