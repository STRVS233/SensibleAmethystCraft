package sensibleamethystcraft.potion;
import sensibleamethystcraft.procedures.CryzltProcedure;
import sensibleamethystcraft.procedures.CryendProcedure;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CryztMobEffect extends MobEffect {
	public CryztMobEffect() {
		super(MobEffectCategory.HARMFUL, -3394561);
	}
	@Override
	public String getDescriptionId() {
		return "effect.sensibleamethystcraft.cryzt";
	}
	@Override
	public boolean isInstantenous() {
		return true;
	}
	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CryzltProcedure.execute(entity);
	}
	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		CryendProcedure.execute(entity);
	}
	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}