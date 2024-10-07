package net.ironedge.goatowl.init;

import software.bernie.geckolib.animatable.GeoItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.Minecraft;

import net.ironedge.goatowl.item.TestJuuzouJasonItem;
import net.ironedge.goatowl.item.TestDemonYamadaItem;
import net.ironedge.goatowl.item.TestBokusatsuItem;
import net.ironedge.goatowl.item.TestAyumiItem;
import net.ironedge.goatowl.item.TestAusItem;
import net.ironedge.goatowl.item.TestAmatsuItem;

@Mod.EventBusSubscriber
public class ItemAnimationFactory {
	public static void disableUseAnim(String hand) {
		ItemInHandRenderer renderer = Minecraft.getInstance().gameRenderer.itemInHandRenderer;
		if (renderer != null) {
			if (hand.equals("right")) {
				renderer.mainHandHeight = 1F;
				renderer.oMainHandHeight = 1F;
			}
			if (hand.equals("left")) {
				renderer.offHandHeight = 1F;
				renderer.oOffHandHeight = 1F;
			}
		}
	}

	@SubscribeEvent
	public static void animatedItems(TickEvent.PlayerTickEvent event) {
		String animation = "";
		ItemStack mainhandItem = event.player.getMainHandItem().copy();
		ItemStack offhandItem = event.player.getOffhandItem().copy();
		if (event.phase == TickEvent.Phase.START && (mainhandItem.getItem() instanceof GeoItem || offhandItem.getItem() instanceof GeoItem)) {
			if (mainhandItem.getItem() instanceof TestAmatsuItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestAmatsuItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof TestAmatsuItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestAmatsuItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof TestAusItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestAusItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof TestAusItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestAusItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof TestAyumiItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestAyumiItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof TestAyumiItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestAyumiItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof TestBokusatsuItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestBokusatsuItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof TestBokusatsuItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestBokusatsuItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof TestDemonYamadaItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestDemonYamadaItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof TestDemonYamadaItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestDemonYamadaItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
			if (mainhandItem.getItem() instanceof TestJuuzouJasonItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestJuuzouJasonItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
						disableUseAnim("right");
					}
				}
			}
			if (offhandItem.getItem() instanceof TestJuuzouJasonItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((TestJuuzouJasonItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
						disableUseAnim("left");
					}
				}
			}
		}
	}
}
