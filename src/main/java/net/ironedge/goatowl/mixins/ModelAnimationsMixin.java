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
	@Unique
	private AnimationState rizeidlefourAnimationState = new AnimationState();
	@Unique
	private AnimationState rizeidlethreeAnimationState = new AnimationState();
	@Unique
	private AnimationState rizeidlesixAnimationState = new AnimationState();

	protected ModelAnimationsMixin(EntityType<? extends LivingEntity> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	@Inject(method = "tick()V", at = @At("HEAD"))
	public void tick(CallbackInfo ci) {
		if (this.level().isClientSide) {
			rizeidlefourAnimationState.startIfStopped(this.tickCount);
			rizeidlethreeAnimationState.startIfStopped(this.tickCount);
			rizeidlesixAnimationState.startIfStopped(this.tickCount);
			//rizeidlefourAnimationStat.animateWhen(!this.isFreezing(), this.tickCount);
			//rizeidlefourAnimationStat.animateWhen(this.isFreezing(), this.tickCount); 
		}
	}

	@Override
	@Unique
	public AnimationState getRizeIdleFourAnimationState() {
		return rizeidlefourAnimationState;
	}

	@Override
	@Unique
	public AnimationState getRizeIdleThreeAnimationState() {
		return rizeidlethreeAnimationState;
	}

	@Override
	@Unique
	public AnimationState getRizeIdleSixAnimationState() {
		return rizeidlesixAnimationState;
	}
}
