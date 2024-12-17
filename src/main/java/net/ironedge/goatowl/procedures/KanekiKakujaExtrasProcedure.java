package net.ironedge.goatowl.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.ironedge.goatowl.network.GoatowlModVariables;
import net.ironedge.goatowl.client.model.Modelvsarimakakujaclaw;
import net.ironedge.goatowl.client.model.Modelreaperkakujalegs;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class KanekiKakujaExtrasProcedure {
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
		if (entity instanceof Player && ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakuja).equals("Kaneki")
				&& ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakahou).equals("Rinkaku")) {
			if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).RcCells > 0 && !entity.isSwimming() && !entity.isUnderWater()) {
				if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KakujaSpawned) {
					{
						double _setval = (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ActiveKagune + 4;
						entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.ActiveKagune = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).Kakuja).equals("Kaneki")) {
						if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KakujaLevel == 1) {
							if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KakujaForm).equals("Centipede")) {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("CENTIPEDE"), false);
							} else if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KakujaForm).equals("Incomplete Centipede")) {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("CENTIPEDE(ALT)"), false);
							}
						} else if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KakujaLevel == 2) {
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 0.5 * (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
								if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 8);
								}
								if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 9);
								}
								if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
									if (ResourceLocation.tryParse("goatowl:textures/entities/reaperkakuja.png") != null) {
										_texture = new ResourceLocation("goatowl:textures/entities/reaperkakuja.png");
									}
									Modelreaperkakujalegs newModel = new Modelreaperkakujalegs(context.bakeLayer(Modelreaperkakujalegs.LAYER_LOCATION));
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
						} else if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KakujaLevel == 3) {
							if (((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KakujaExtra).equals("Claw")) {
								if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
									if (ResourceLocation.tryParse("goatowl:textures/entities/vsarimakakujaclaw.png") != null) {
										_texture = new ResourceLocation("goatowl:textures/entities/vsarimakakujaclaw.png");
									}
									Modelvsarimakakujaclaw newModel = new Modelvsarimakakujaclaw(context.bakeLayer(Modelvsarimakakujaclaw.LAYER_LOCATION));
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
							if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 0.25 * (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
								if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 8);
								}
								if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 9);
								}
								if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
									ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
									if (ResourceLocation.tryParse("goatowl:textures/entities/reaperkakuja.png") != null) {
										_texture = new ResourceLocation("goatowl:textures/entities/reaperkakuja.png");
									}
									Modelreaperkakujalegs newModel = new Modelreaperkakujalegs(context.bakeLayer(Modelreaperkakujalegs.LAYER_LOCATION));
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
						} else if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KakujaLevel == 4) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("ONE-EYED KING"), false);
						} else if ((entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).KakujaLevel == 5) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("DRAGON"), false);
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
						capability.KakujaSpawned = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GoatowlModVariables.PlayerVariables())).ActiveKagune - 4;
					entity.getCapability(GoatowlModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ActiveKagune = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have a Kakuja"), false);
		}
	}
}
