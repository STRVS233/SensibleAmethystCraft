package sensibleamethystcraft.procedures;
import sensibleamethystcraft.init.SensibleamethystcraftModMobEffects;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

public class CryzltProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SensibleamethystcraftModMobEffects.CRYZT.get())) {
			entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
			{
				Entity _entToDamage = entity;
				_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DROWN)),
						(float) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(SensibleamethystcraftModMobEffects.CRYZT.get()) ? _livEnt.getEffect(SensibleamethystcraftModMobEffects.CRYZT.get()).getAmplifier() : 0) / 80));
			}
			{
				Entity _entToDamage = entity;
				_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)),
						(float) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(SensibleamethystcraftModMobEffects.CRYZT.get()) ? _livEnt.getEffect(SensibleamethystcraftModMobEffects.CRYZT.get()).getAmplifier() : 0) / 100));
			}
		}
	}
}