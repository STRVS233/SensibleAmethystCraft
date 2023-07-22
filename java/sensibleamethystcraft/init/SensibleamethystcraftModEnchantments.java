package sensibleamethystcraft.init;
import sensibleamethystcraft.enchantment.CrystallizationEnchantment;
import sensibleamethystcraft.SensibleamethystcraftMod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.enchantment.Enchantment;

public class SensibleamethystcraftModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SensibleamethystcraftMod.MODID);
	public static final RegistryObject<Enchantment> CRYSTALLIZATION = REGISTRY.register("crystallization", () -> new CrystallizationEnchantment());
}