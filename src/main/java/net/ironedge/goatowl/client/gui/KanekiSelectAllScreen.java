package net.ironedge.goatowl.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.ironedge.goatowl.world.inventory.KanekiSelectAllMenu;
import net.ironedge.goatowl.network.KanekiSelectAllButtonMessage;
import net.ironedge.goatowl.GoatowlMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class KanekiSelectAllScreen extends AbstractContainerScreen<KanekiSelectAllMenu> {
	private final static HashMap<String, Object> guistate = KanekiSelectAllMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_centipede;
	Button button_oek;
	Button button_dragpm;
	ImageButton imagebutton_reaperkakujaclick;
	ImageButton imagebutton_vsarimakakujaclick;

	public KanekiSelectAllScreen(KanekiSelectAllMenu container, Inventory inventory, Component text) {
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
		button_centipede = Button.builder(Component.translatable("gui.goatowl.kaneki_select_all.button_centipede"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiSelectAllButtonMessage(0, x, y, z));
				KanekiSelectAllButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 50, this.topPos + 30, 72, 20).build();
		guistate.put("button:button_centipede", button_centipede);
		this.addRenderableWidget(button_centipede);
		button_oek = Button.builder(Component.translatable("gui.goatowl.kaneki_select_all.button_oek"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiSelectAllButtonMessage(1, x, y, z));
				KanekiSelectAllButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 76, 40, 20).build();
		guistate.put("button:button_oek", button_oek);
		this.addRenderableWidget(button_oek);
		button_dragpm = Button.builder(Component.translatable("gui.goatowl.kaneki_select_all.button_dragpm"), e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiSelectAllButtonMessage(2, x, y, z));
				KanekiSelectAllButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 56, this.topPos + 119, 56, 20).build();
		guistate.put("button:button_dragpm", button_dragpm);
		this.addRenderableWidget(button_dragpm);
		imagebutton_reaperkakujaclick = new ImageButton(this.leftPos + 123, this.topPos + 66, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_reaperkakujaclick.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiSelectAllButtonMessage(3, x, y, z));
				KanekiSelectAllButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_reaperkakujaclick", imagebutton_reaperkakujaclick);
		this.addRenderableWidget(imagebutton_reaperkakujaclick);
		imagebutton_vsarimakakujaclick = new ImageButton(this.leftPos + 13, this.topPos + 68, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_vsarimakakujaclick.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiSelectAllButtonMessage(4, x, y, z));
				KanekiSelectAllButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_vsarimakakujaclick", imagebutton_vsarimakakujaclick);
		this.addRenderableWidget(imagebutton_vsarimakakujaclick);
	}
}
