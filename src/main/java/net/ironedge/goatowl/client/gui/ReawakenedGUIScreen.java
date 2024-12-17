package net.ironedge.goatowl.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.ironedge.goatowl.world.inventory.ReawakenedGUIMenu;
import net.ironedge.goatowl.network.ReawakenedGUIButtonMessage;
import net.ironedge.goatowl.GoatowlMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ReawakenedGUIScreen extends AbstractContainerScreen<ReawakenedGUIMenu> {
	private final static HashMap<String, Object> guistate = ReawakenedGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_vsarimakakujaclawclick;
	ImageButton imagebutton_vsarimakakujaclick;
	ImageButton imagebutton_vsarimakakujarinkakuclick;
	ImageButton imagebutton_vsarimakanekikakujarinkakuclick;

	public ReawakenedGUIScreen(ReawakenedGUIMenu container, Inventory inventory, Component text) {
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
		imagebutton_vsarimakakujaclawclick = new ImageButton(this.leftPos + -1, this.topPos + 67, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_vsarimakakujaclawclick.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new ReawakenedGUIButtonMessage(0, x, y, z));
				ReawakenedGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_vsarimakakujaclawclick", imagebutton_vsarimakakujaclawclick);
		this.addRenderableWidget(imagebutton_vsarimakakujaclawclick);
		imagebutton_vsarimakakujaclick = new ImageButton(this.leftPos + 71, this.topPos + 68, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_vsarimakakujaclick.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new ReawakenedGUIButtonMessage(1, x, y, z));
				ReawakenedGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_vsarimakakujaclick", imagebutton_vsarimakakujaclick);
		this.addRenderableWidget(imagebutton_vsarimakakujaclick);
		imagebutton_vsarimakakujarinkakuclick = new ImageButton(this.leftPos + 70, this.topPos + -1, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_vsarimakakujarinkakuclick.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new ReawakenedGUIButtonMessage(2, x, y, z));
				ReawakenedGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_vsarimakakujarinkakuclick", imagebutton_vsarimakakujarinkakuclick);
		this.addRenderableWidget(imagebutton_vsarimakakujarinkakuclick);
		imagebutton_vsarimakanekikakujarinkakuclick = new ImageButton(this.leftPos + 71, this.topPos + 135, 32, 32, 0, 0, 32, new ResourceLocation("goatowl:textures/screens/atlas/imagebutton_vsarimakanekikakujarinkakuclick.png"), 32, 64, e -> {
			if (true) {
				GoatowlMod.PACKET_HANDLER.sendToServer(new ReawakenedGUIButtonMessage(3, x, y, z));
				ReawakenedGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_vsarimakanekikakujarinkakuclick", imagebutton_vsarimakanekikakujarinkakuclick);
		this.addRenderableWidget(imagebutton_vsarimakanekikakujarinkakuclick);
	}
}
