package sensibleamethystcraft.init;
import sensibleamethystcraft.potion.CryztMobEffect;
import sensibleamethystcraft.SensibleamethystcraftMod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.effect.MobEffect;

public class SensibleamethystcraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SensibleamethystcraftMod.MODID);
	public static final RegistryObject<MobEffect> CRYZT = REGISTRY.register("cryzt", () -> new CryztMobEffect());
}