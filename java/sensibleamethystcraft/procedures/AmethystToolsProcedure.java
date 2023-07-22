package sensibleamethystcraft.procedures;
import sensibleamethystcraft.init.SensibleamethystcraftModEnchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class AmethystToolsProcedure {
	public static void execute(ItemStack itemstack) {
		if ((EnchantmentHelper.getItemEnchantmentLevel(SensibleamethystcraftModEnchantments.CRYSTALLIZATION.get(), itemstack) != 0) == false) {
			itemstack.enchant(SensibleamethystcraftModEnchantments.CRYSTALLIZATION.get(), 1);
		}
	}
}
