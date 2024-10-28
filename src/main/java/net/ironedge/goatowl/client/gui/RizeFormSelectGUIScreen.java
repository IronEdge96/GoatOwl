package net.ironedge.goatowl.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.ironedge.goatowl.world.inventory.RizeFormSelectGUIMenu;
import net.ironedge.goatowl.network.RizeFormSelectGUIButtonMessage;
import net.ironedge.goatowl.GoatowlMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RizeFormSelectGUIScreen extends AbstractContainerScreen<RizeFormSelectGUIMenu> {
	private final static HashMap<String, Object> guistate = RizeFormSelectGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_rizerinkakuform3;
	ImageButton imagebutton_rizerinkakuform4;
	ImageButton imagebutton_rizerinkakuform6;

	public RizeFormSelectGUIScreen(RizeFormSelectGUIMenu container, Inventory inventory, Component text) {
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
		imagebutton_rizerinkakuform3 = new ImageButton(this.leftPos + 24, this.topPos + 97, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_rizerinkakuform3.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RizeFormSelectGUIButtonMessage(0, x, y, z));
				RizeFormSelectGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rizerinkakuform3", imagebutton_rizerinkakuform3);
		this.addRenderableWidget(imagebutton_rizerinkakuform3);
		imagebutton_rizerinkakuform4 = new ImageButton(this.leftPos + 69, this.topPos + 16, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_rizerinkakuform4.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RizeFormSelectGUIButtonMessage(1, x, y, z));
				RizeFormSelectGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rizerinkakuform4", imagebutton_rizerinkakuform4);
		this.addRenderableWidget(imagebutton_rizerinkakuform4);
		imagebutton_rizerinkakuform6 = new ImageButton(this.leftPos + 123, this.topPos + 97, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_rizerinkakuform6.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new RizeFormSelectGUIButtonMessage(2, x, y, z));
				RizeFormSelectGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rizerinkakuform6", imagebutton_rizerinkakuform6);
		this.addRenderableWidget(imagebutton_rizerinkakuform6);
	}
}
