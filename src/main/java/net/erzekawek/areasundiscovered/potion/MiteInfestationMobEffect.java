
package net.erzekawek.areasundiscovered.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.erzekawek.areasundiscovered.procedures.MiteInfestationOnEffectActiveTickProcedure;
import net.erzekawek.areasundiscovered.procedures.MiteInfestationEffectStartedappliedProcedure;
import net.erzekawek.areasundiscovered.procedures.MiteInfestationEffectExpiresProcedure;

public class MiteInfestationMobEffect extends MobEffect {
	public MiteInfestationMobEffect() {
		super(MobEffectCategory.HARMFUL, -12570797);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		MiteInfestationEffectStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MiteInfestationOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		MiteInfestationEffectExpiresProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
