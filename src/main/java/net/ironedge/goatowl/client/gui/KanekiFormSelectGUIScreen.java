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

import net.ironedge.goatowl.world.inventory.KanekiFormSelectGUIMenu;
import net.ironedge.goatowl.procedures.KanekiSelectDisplayProcedure;
import net.ironedge.goatowl.network.KanekiFormSelectGUIButtonMessage;
import net.ironedge.goatowl.GoatowlMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class KanekiFormSelectGUIScreen extends AbstractContainerScreen<KanekiFormSelectGUIMenu> {
	private final static HashMap<String, Object> guistate = KanekiFormSelectGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_kakuja;
	ImageButton imagebutton_rizerinkakuform4;
	ImageButton imagebutton_rizerinkakuform6;
	ImageButton imagebutton_kanekirinkaku3;
	ImageButton imagebutton_kanekirinkaku8;
	ImageButton imagebutton_kanekirinkakuclaw;
	ImageButton imagebutton_kanekirinkakublade;
	ImageButton imagebutton_kagunestyling;

	public KanekiFormSelectGUIScreen(KanekiFormSelectGUIMenu container, Inventory inventory, Component text) {
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
		button_kakuja = Button.builder(Component.translatable("gui.goatowl.kaneki_form_select_gui.button_kakuja"), e -> {
		}).bounds(this.leftPos + 60, this.topPos + 79, 56, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (KanekiSelectDisplayProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_kakuja", button_kakuja);
		this.addRenderableWidget(button_kakuja);
		imagebutton_rizerinkakuform4 = new ImageButton(this.leftPos + 141, this.topPos + 70, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_rizerinkakuform4.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiFormSelectGUIButtonMessage(1, x, y, z));
				KanekiFormSelectGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rizerinkakuform4", imagebutton_rizerinkakuform4);
		this.addRenderableWidget(imagebutton_rizerinkakuform4);
		imagebutton_rizerinkakuform6 = new ImageButton(this.leftPos + 141, this.topPos + 133, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_rizerinkakuform6.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiFormSelectGUIButtonMessage(2, x, y, z));
				KanekiFormSelectGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rizerinkakuform6", imagebutton_rizerinkakuform6);
		this.addRenderableWidget(imagebutton_rizerinkakuform6);
		imagebutton_kanekirinkaku3 = new ImageButton(this.leftPos + 69, this.topPos + -2, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_kanekirinkaku3.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiFormSelectGUIButtonMessage(3, x, y, z));
				KanekiFormSelectGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kanekirinkaku3", imagebutton_kanekirinkaku3);
		this.addRenderableWidget(imagebutton_kanekirinkaku3);
		imagebutton_kanekirinkaku8 = new ImageButton(this.leftPos + 69, this.topPos + 133, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_kanekirinkaku8.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiFormSelectGUIButtonMessage(4, x, y, z));
				KanekiFormSelectGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kanekirinkaku8", imagebutton_kanekirinkaku8);
		this.addRenderableWidget(imagebutton_kanekirinkaku8);
		imagebutton_kanekirinkakuclaw = new ImageButton(this.leftPos + -3, this.topPos + 70, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_kanekirinkakuclaw.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiFormSelectGUIButtonMessage(5, x, y, z));
				KanekiFormSelectGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kanekirinkakuclaw", imagebutton_kanekirinkakuclaw);
		this.addRenderableWidget(imagebutton_kanekirinkakuclaw);
		imagebutton_kanekirinkakublade = new ImageButton(this.leftPos + -3, this.topPos + 133, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_kanekirinkakublade.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiFormSelectGUIButtonMessage(6, x, y, z));
				KanekiFormSelectGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kanekirinkakublade", imagebutton_kanekirinkakublade);
		this.addRenderableWidget(imagebutton_kanekirinkakublade);
		imagebutton_kagunestyling = new ImageButton(this.leftPos + 231, this.topPos + 133, 64, 64, 0, 0, 64, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_kagunestyling.png"), 64, 128, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new KanekiFormSelectGUIButtonMessage(7, x, y, z));
				KanekiFormSelectGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kagunestyling", imagebutton_kagunestyling);
		this.addRenderableWidget(imagebutton_kagunestyling);
	}
}
