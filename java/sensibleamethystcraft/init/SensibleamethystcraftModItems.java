package sensibleamethystcraft.init;
import it.unimi.dsi.fastutil.longs.Long2BooleanAVLTreeMap;
import sensibleamethystcraft.item.HighpurityamethystItem;
import sensibleamethystcraft.item.AmethystSwordItem;
import sensibleamethystcraft.item.AmethystShovelItem;
import sensibleamethystcraft.item.AmethystPickaxeItem;
import sensibleamethystcraft.item.AmethystHoeItem;
import sensibleamethystcraft.item.AmethystAxeItem;
import sensibleamethystcraft.SensibleamethystcraftMod;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;

public class SensibleamethystcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SensibleamethystcraftMod.MODID);
	public static final RegistryObject<Item> HIGHPURITYAMETHYST = REGISTRY.register("highpurityamethyst", () -> new HighpurityamethystItem());
	public static final RegistryObject<Item> AMETHYST_AXE = REGISTRY.register("amethyst_axe", () -> new AmethystAxeItem());
	public static final RegistryObject<Item> AMETHYST_PICKAXE = REGISTRY.register("amethyst_pickaxe", () -> new AmethystPickaxeItem());
	public static final RegistryObject<Item> AMETHYST_SWORD = REGISTRY.register("amethyst_sword", () -> new AmethystSwordItem());
	public static final RegistryObject<Item> AMETHYST_SHOVEL = REGISTRY.register("amethyst_shovel", () -> new AmethystShovelItem());
	public static final RegistryObject<Item> AMETHYST_HOE = REGISTRY.register("amethyst_hoe", () -> new AmethystHoeItem());
}
