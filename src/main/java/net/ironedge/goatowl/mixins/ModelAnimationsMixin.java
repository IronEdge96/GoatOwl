package net.ironedge.goatowl.mixins;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AnimationState;

import net.ironedge.goatowl.AnimationInterface;

@Mixin(Player.class)
public abstract class ModelAnimationsMixin extends LivingEntity implements AnimationInterface {
	//Rinkaku Animations
	//Rize
	@Unique
	private AnimationState rizeidlefourAnimationState = new AnimationState();
	@Unique
	private AnimationState rizeidlesixAnimationState = new AnimationState();
	//Kaneki
	@Unique
	private AnimationState kanekiidlefourAnimationState = new AnimationState();
	@Unique
	private AnimationState kanekiidlethreeAnimationState = new AnimationState();
	@Unique
	private AnimationState kanekiidlesixAnimationState = new AnimationState();
	@Unique
	private AnimationState kanekiidleeightAnimationState = new AnimationState();
	@Unique
	private AnimationState kanekiidlebladeAnimationState = new AnimationState();
	@Unique
	private AnimationState kanekiidleclawAnimationState = new AnimationState();
	//Kuro and Shiro
	@Unique
	private AnimationState kurorinkakuidleAnimationState = new AnimationState();
	@Unique
	private AnimationState shirorinkakuidleAnimationState = new AnimationState();
	//Kakuja
	//Kaneki
	@Unique
	private AnimationState reaperkakujaidleAnimationState = new AnimationState();
	@Unique
	private AnimationState reaperkakujarinkakuidleAnimationState = new AnimationState();
	@Unique
	private AnimationState vsarimakakujarinkakuidleAnimationState = new AnimationState();
	@Unique
	private AnimationState vsarimakakujaclawidleAnimationState = new AnimationState();

	protected ModelAnimationsMixin(EntityType<? extends LivingEntity> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	@Inject(method = "tick()V", at = @At("HEAD"))
	public void tick(CallbackInfo ci) {
		if (this.level().isClientSide) {
			rizeidlefourAnimationState.startIfStopped(this.tickCount);
			rizeidlesixAnimationState.startIfStopped(this.tickCount);
			kanekiidlefourAnimationState.startIfStopped(this.tickCount);
			kanekiidlethreeAnimationState.startIfStopped(this.tickCount);
			kanekiidlesixAnimationState.startIfStopped(this.tickCount);
			kanekiidleeightAnimationState.startIfStopped(this.tickCount);
			kanekiidlebladeAnimationState.startIfStopped(this.tickCount);
			kanekiidleclawAnimationState.startIfStopped(this.tickCount);
			kurorinkakuidleAnimationState.startIfStopped(this.tickCount);
			shirorinkakuidleAnimationState.startIfStopped(this.tickCount);
			reaperkakujaidleAnimationState.startIfStopped(this.tickCount);
			reaperkakujarinkakuidleAnimationState.startIfStopped(this.tickCount);
			vsarimakakujarinkakuidleAnimationState.startIfStopped(this.tickCount);
			vsarimakakujaclawidleAnimationState.startIfStopped(this.tickCount);
			//rizeidlefourAnimationStat.animateWhen(!this.isFreezing(), this.tickCount);
			//rizeidlefourAnimationStat.animateWhen(this.isFreezing(), this.tickCount); 
		}
	}

	//Rinkaku
	//Rize
	@Override
	@Unique
	public AnimationState getRizeIdleFourAnimationState() {
		return rizeidlefourAnimationState;
	}

	@Override
	@Unique
	public AnimationState getRizeIdleSixAnimationState() {
		return rizeidlesixAnimationState;
	}

	//Kaneki
	@Override
	@Unique
	public AnimationState getKanekiIdleFourAnimationState() {
		return kanekiidlefourAnimationState;
	}

	@Override
	@Unique
	public AnimationState getKanekiIdleThreeAnimationState() {
		return kanekiidlethreeAnimationState;
	}

	@Override
	@Unique
	public AnimationState getKanekiIdleSixAnimationState() {
		return kanekiidlesixAnimationState;
	}

	@Override
	@Unique
	public AnimationState getKanekiIdleEightAnimationState() {
		return kanekiidleeightAnimationState;
	}

	@Override
	@Unique
	public AnimationState getKanekiIdleBladeAnimationState() {
		return kanekiidlebladeAnimationState;
	}

	@Override
	@Unique
	public AnimationState getKanekiIdleClawAnimationState() {
		return kanekiidleclawAnimationState;
	}

	//Kuro and Shiro
	@Override
	@Unique
	public AnimationState getKuroRinkakuIdleAnimationState() {
		return kurorinkakuidleAnimationState;
	}

	@Override
	@Unique
	public AnimationState getShiroRinkakuIdleAnimationState() {
		return shirorinkakuidleAnimationState;
	}

	//Kakuja
	//Kaneki
	@Override
	@Unique
	public AnimationState getReaperKakujaIdleAnimationState() {
		return reaperkakujaidleAnimationState;
	}

	@Override
	@Unique
	public AnimationState getReaperKakujaRinkakuIdleAnimationState() {
		return reaperkakujarinkakuidleAnimationState;
	}

	@Override
	@Unique
	public AnimationState getVSArimaKakujaRinkakuIdleAnimationState() {
		return vsarimakakujarinkakuidleAnimationState;
	}

	@Override
	@Unique
	public AnimationState getVSArimaKakujaClawIdleAnimationState() {
		return vsarimakakujaclawidleAnimationState;
	}
}
