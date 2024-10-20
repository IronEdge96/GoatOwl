package net.ironedge.goatowl.init;

import software.bernie.geckolib.animatable.GeoItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.ironedge.goatowl.item.VsArimaKanekiItem;
import net.ironedge.goatowl.item.ShirtReaperKanekiItem;
import net.ironedge.goatowl.item.PrisonerKanekiItem;
import net.ironedge.goatowl.item.NoroItem;
import net.ironedge.goatowl.item.NoroBlackItem;
import net.ironedge.goatowl.item.GoatKanekiItem;
import net.ironedge.goatowl.item.DefaultKanekiItem;
import net.ironedge.goatowl.item.BlackReaperKanekiItem;
import net.ironedge.goatowl.item.AyatoS1Item;
import net.ironedge.goatowl.item.AyatoReItem;
import net.ironedge.goatowl.item.AogiriRobesItem;

@Mod.EventBusSubscriber
public class ArmorAnimationFactory {
	@SubscribeEvent
	public static void animatedArmors(TickEvent.PlayerTickEvent event) {
		String animation = "";
		if (event.phase == TickEvent.Phase.END) {
			if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() != (ItemStack.EMPTY).getItem() && event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof GeoItem) {
				if (!event.player.getItemBySlot(EquipmentSlot.HEAD).getOrCreateTag().getString("geckoAnim").equals("")) {
					animation = event.player.getItemBySlot(EquipmentSlot.HEAD).getOrCreateTag().getString("geckoAnim");
					event.player.getItemBySlot(EquipmentSlot.HEAD).getOrCreateTag().putString("geckoAnim", "");
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof DefaultKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof PrisonerKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof GoatKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof NoroItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof AyatoReItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof AyatoS1Item animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof NoroBlackItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof AogiriRobesItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof BlackReaperKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof VsArimaKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof ShirtReaperKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
				}
			}
			if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() != (ItemStack.EMPTY).getItem() && event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof GeoItem) {
				if (!event.player.getItemBySlot(EquipmentSlot.CHEST).getOrCreateTag().getString("geckoAnim").equals("")) {
					animation = event.player.getItemBySlot(EquipmentSlot.CHEST).getOrCreateTag().getString("geckoAnim");
					event.player.getItemBySlot(EquipmentSlot.CHEST).getOrCreateTag().putString("geckoAnim", "");
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof DefaultKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof PrisonerKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof GoatKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof NoroItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof AyatoReItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof AyatoS1Item animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof NoroBlackItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof AogiriRobesItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof BlackReaperKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof VsArimaKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof ShirtReaperKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
				}
			}
			if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() != (ItemStack.EMPTY).getItem() && event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof GeoItem) {
				if (!event.player.getItemBySlot(EquipmentSlot.LEGS).getOrCreateTag().getString("geckoAnim").equals("")) {
					animation = event.player.getItemBySlot(EquipmentSlot.LEGS).getOrCreateTag().getString("geckoAnim");
					event.player.getItemBySlot(EquipmentSlot.LEGS).getOrCreateTag().putString("geckoAnim", "");
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof DefaultKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof PrisonerKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof GoatKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof NoroItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof AyatoReItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof AyatoS1Item animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof NoroBlackItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof AogiriRobesItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof BlackReaperKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof VsArimaKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof ShirtReaperKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
				}
			}
			if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() != (ItemStack.EMPTY).getItem() && event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof GeoItem) {
				if (!event.player.getItemBySlot(EquipmentSlot.FEET).getOrCreateTag().getString("geckoAnim").equals("")) {
					animation = event.player.getItemBySlot(EquipmentSlot.FEET).getOrCreateTag().getString("geckoAnim");
					event.player.getItemBySlot(EquipmentSlot.FEET).getOrCreateTag().putString("geckoAnim", "");
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof DefaultKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof PrisonerKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof GoatKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof NoroItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof AyatoReItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof AyatoS1Item animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof NoroBlackItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof AogiriRobesItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof BlackReaperKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof VsArimaKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
					if (event.player.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof ShirtReaperKanekiItem animatable && event.player.level().isClientSide())
						animatable.animationprocedure = animation;
				}
			}
		}
	}
}
