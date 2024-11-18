package net.ironedge.goatowl.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.ironedge.goatowl.network.GoatowlModVariables;
import net.ironedge.goatowl.client.model.Modelshirorinkaku;
import net.ironedge.goatowl.client.model.Modelkurorinkaku;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class KuroShiroRinkakuProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		Entity _evtEntity = _evt.getEntity();
		PlayerRenderer _pr = null;
		PoseStack poseStack = _evt.getPoseStack();
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
			com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
					(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getModelName().equals("slim") : false), _texture);
			_pr = emptyRenderer;
			emptyRenderer.clearLayers();
			emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
		}
		if (entity instanceof Player && (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Rinkaku")
				|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakhou1).equals("Rinkaku")
				|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou2).equals("Rinkaku")
				|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ChimeraKakahou3).equals("Rinkaku"))) {
			if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells > 0 && !entity.isSwimming() && !entity.isUnderWater()) {
				if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RinkakuSpawned) {
					if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Rinkaku).equals("KuroShiro")) {
						if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KaguneStyling).equals("Classic")) {
							if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RinkakuForm).equals("Kuro")) {
								if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
									if (ResourceLocation.tryParse("goatowl:textures/entities/rizerinkaku.png") != null) {
										_texture = new ResourceLocation("goatowl:textures/entities/rizerinkaku.png");
									}
									Modelkurorinkaku newModel = new Modelkurorinkaku(context.bakeLayer(Modelkurorinkaku.LAYER_LOCATION));
									newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
									newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
									newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
									newModel.RightArm.copyFrom(_pr.getModel().rightArm);
									newModel.Body.copyFrom(_pr.getModel().body);
									newModel.Head.copyFrom(_pr.getModel().head);
									poseStack.pushPose();
									poseStack.scale(0.9375F, 0.9375F, 0.9375F);
									new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(),
											_evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
									poseStack.popPose();
								}
							} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RinkakuForm).equals("Shiro")) {
								if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
									if (ResourceLocation.tryParse("goatowl:textures/entities/rizerinkaku.png") != null) {
										_texture = new ResourceLocation("goatowl:textures/entities/rizerinkaku.png");
									}
									Modelshirorinkaku newModel = new Modelshirorinkaku(context.bakeLayer(Modelshirorinkaku.LAYER_LOCATION));
									newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
									newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
									newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
									newModel.RightArm.copyFrom(_pr.getModel().rightArm);
									newModel.Body.copyFrom(_pr.getModel().body);
									newModel.Head.copyFrom(_pr.getModel().head);
									poseStack.pushPose();
									poseStack.scale(0.9375F, 0.9375F, 0.9375F);
									new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(),
											_evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
									poseStack.popPose();
								}
							}
						} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KaguneStyling).equals(":RE")) {
							if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RinkakuForm).equals("Kuro")) {
								if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
									if (ResourceLocation.tryParse("goatowl:textures/entities/rizerinkakure.png") != null) {
										_texture = new ResourceLocation("goatowl:textures/entities/rizerinkakure.png");
									}
									Modelkurorinkaku newModel = new Modelkurorinkaku(context.bakeLayer(Modelkurorinkaku.LAYER_LOCATION));
									newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
									newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
									newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
									newModel.RightArm.copyFrom(_pr.getModel().rightArm);
									newModel.Body.copyFrom(_pr.getModel().body);
									newModel.Head.copyFrom(_pr.getModel().head);
									poseStack.pushPose();
									poseStack.scale(0.9375F, 0.9375F, 0.9375F);
									new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(),
											_evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
									poseStack.popPose();
								}
							} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RinkakuForm).equals("Shiro")) {
								if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
									if (ResourceLocation.tryParse("goatowl:textures/entities/rizerinkakure.png") != null) {
										_texture = new ResourceLocation("goatowl:textures/entities/rizerinkakure.png");
									}
									Modelshirorinkaku newModel = new Modelshirorinkaku(context.bakeLayer(Modelshirorinkaku.LAYER_LOCATION));
									newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
									newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
									newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
									newModel.RightArm.copyFrom(_pr.getModel().rightArm);
									newModel.Body.copyFrom(_pr.getModel().body);
									newModel.Head.copyFrom(_pr.getModel().head);
									poseStack.pushPose();
									poseStack.scale(0.9375F, 0.9375F, 0.9375F);
									new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(),
											_evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
									poseStack.popPose();
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Broken"), false);
					}
				}
			} else {
				{
					boolean _setval = false;
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.RinkakuSpawned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ActiveKagune - 1;
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ActiveKagune = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have a Rinkaku"), false);
		}
	}
}
