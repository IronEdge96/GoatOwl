/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.ironedge.goatowl as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.ironedge.goatowl;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.AnimationState;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public interface AnimationInterface {
	//Rize Animations
	AnimationState getRizeIdleFourAnimationState();

	AnimationState getRizeIdleSixAnimationState();

	//Kaneki Animations
	AnimationState getKanekiIdleFourAnimationState();

	AnimationState getKanekiIdleThreeAnimationState();

	AnimationState getKanekiIdleSixAnimationState();

	AnimationState getKanekiIdleEightAnimationState();

	AnimationState getKanekiIdleBladeAnimationState();

	AnimationState getKanekiIdleClawAnimationState();

	//Kuro/Shiro Animations
	AnimationState getKuroRinkakuIdleAnimationState();

	AnimationState getShiroRinkakuIdleAnimationState();

	//Kakuja Animations
	//Kaneki
	AnimationState getReaperKakujaIdleAnimationState();

	AnimationState VSArimaKakujaRinkakuIdleAnimationState();
	AnimationState VSArimaKakujaClawIdleAnimationState();

}
