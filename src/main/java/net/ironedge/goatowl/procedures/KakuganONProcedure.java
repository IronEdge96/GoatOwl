package net.ironedge.goatowl.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.ironedge.goatowl.network.GoatowlModVariables;
import net.ironedge.goatowl.client.model.Modelkakuganright;
import net.ironedge.goatowl.client.model.Modelkakuganleft;
import net.ironedge.goatowl.client.model.Modelkakuganfaceright;
import net.ironedge.goatowl.client.model.Modelkakuganfaceleft;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class KakuganONProcedure {
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
		if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Ghoul")
				|| ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Race).equals("Half-Ghoul")) {
			if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ActiveKagune > 0) {
				if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells <= (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new GoatowlModVariables.PlayerVariables())).MaxRcCells
						&& (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells > 0.55
								* (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).MaxRcCells) {
					if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Both")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganleft newModel = new Modelkakuganleft(context.bakeLayer(Modelkakuganleft.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganright newModel = new Modelkakuganright(context.bakeLayer(Modelkakuganright.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Left")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganleft newModel = new Modelkakuganleft(context.bakeLayer(Modelkakuganleft.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Right")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganright newModel = new Modelkakuganright(context.bakeLayer(Modelkakuganright.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					}
				} else if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells <= 0.5
						* (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).MaxRcCells
						&& (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells > 0.25
								* (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).MaxRcCells) {
					if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Both")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganleft newModel = new Modelkakuganleft(context.bakeLayer(Modelkakuganleft.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganface.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakuganface.png");
							}
							Modelkakuganfaceleft newModel = new Modelkakuganfaceleft(context.bakeLayer(Modelkakuganfaceleft.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganright newModel = new Modelkakuganright(context.bakeLayer(Modelkakuganright.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganface.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakuganface.png");
							}
							Modelkakuganfaceright newModel = new Modelkakuganfaceright(context.bakeLayer(Modelkakuganfaceright.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Left")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganleft newModel = new Modelkakuganleft(context.bakeLayer(Modelkakuganleft.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganface.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakuganface.png");
							}
							Modelkakuganfaceleft newModel = new Modelkakuganfaceleft(context.bakeLayer(Modelkakuganfaceleft.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Right")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganright newModel = new Modelkakuganright(context.bakeLayer(Modelkakuganright.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganface.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakuganface.png");
							}
							Modelkakuganfaceright newModel = new Modelkakuganfaceright(context.bakeLayer(Modelkakuganfaceright.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					}
				} else if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells <= 0.25
						* (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).MaxRcCells) {
					if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Both")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganleft newModel = new Modelkakuganleft(context.bakeLayer(Modelkakuganleft.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganfacefar.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakuganfacefar.png");
							}
							Modelkakuganfaceleft newModel = new Modelkakuganfaceleft(context.bakeLayer(Modelkakuganfaceleft.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganright newModel = new Modelkakuganright(context.bakeLayer(Modelkakuganright.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganfacefar.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakuganfacefar.png");
							}
							Modelkakuganfaceright newModel = new Modelkakuganfaceright(context.bakeLayer(Modelkakuganfaceright.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Left")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganleft newModel = new Modelkakuganleft(context.bakeLayer(Modelkakuganleft.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganfacefar.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakuganfacefar.png");
							}
							Modelkakuganfaceleft newModel = new Modelkakuganfaceleft(context.bakeLayer(Modelkakuganfaceleft.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Right")) {
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
							}
							Modelkakuganright newModel = new Modelkakuganright(context.bakeLayer(Modelkakuganright.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
						if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
							ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
							if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganfacefar.png") != null) {
								_texture = new ResourceLocation("goatowl:textures/entities/kakuganfacefar.png");
							}
							Modelkakuganfaceright newModel = new Modelkakuganfaceright(context.bakeLayer(Modelkakuganfaceright.LAYER_LOCATION));
							newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
							newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
							newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
							newModel.RightArm.copyFrom(_pr.getModel().rightArm);
							newModel.Body.copyFrom(_pr.getModel().body);
							newModel.Head.copyFrom(_pr.getModel().head);
							poseStack.pushPose();
							poseStack.scale(0.9375F, 0.9375F, 0.9375F);
							new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
									_evt.getMultiBufferSource(), _evt.getPackedLight());
							poseStack.popPose();
						}
					}
				}
			} else if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells <= 0.25
					* (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).MaxRcCells) {
				if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Both")) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
							_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
						}
						Modelkakuganleft newModel = new Modelkakuganleft(context.bakeLayer(Modelkakuganleft.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganfacefar.png") != null) {
							_texture = new ResourceLocation("goatowl:textures/entities/kakuganfacefar.png");
						}
						Modelkakuganfaceleft newModel = new Modelkakuganfaceleft(context.bakeLayer(Modelkakuganfaceleft.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
							_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
						}
						Modelkakuganright newModel = new Modelkakuganright(context.bakeLayer(Modelkakuganright.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganfacefar.png") != null) {
							_texture = new ResourceLocation("goatowl:textures/entities/kakuganfacefar.png");
						}
						Modelkakuganfaceright newModel = new Modelkakuganfaceright(context.bakeLayer(Modelkakuganfaceright.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Left")) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
							_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
						}
						Modelkakuganleft newModel = new Modelkakuganleft(context.bakeLayer(Modelkakuganleft.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganfacefar.png") != null) {
							_texture = new ResourceLocation("goatowl:textures/entities/kakuganfacefar.png");
						}
						Modelkakuganfaceleft newModel = new Modelkakuganfaceleft(context.bakeLayer(Modelkakuganfaceleft.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakugan).equals("Right")) {
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("goatowl:textures/entities/kakugan.png") != null) {
							_texture = new ResourceLocation("goatowl:textures/entities/kakugan.png");
						}
						Modelkakuganright newModel = new Modelkakuganright(context.bakeLayer(Modelkakuganright.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
					if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
						ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
						if (ResourceLocation.tryParse("goatowl:textures/entities/kakuganfacefar.png") != null) {
							_texture = new ResourceLocation("goatowl:textures/entities/kakuganfacefar.png");
						}
						Modelkakuganfaceright newModel = new Modelkakuganfaceright(context.bakeLayer(Modelkakuganfaceright.LAYER_LOCATION));
						newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
						newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
						newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
						newModel.RightArm.copyFrom(_pr.getModel().rightArm);
						newModel.Body.copyFrom(_pr.getModel().body);
						newModel.Head.copyFrom(_pr.getModel().head);
						poseStack.pushPose();
						poseStack.scale(0.9375F, 0.9375F, 0.9375F);
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
								_evt.getMultiBufferSource(), _evt.getPackedLight());
						poseStack.popPose();
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 1, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 1, 1));
			}
		}
	}
}
