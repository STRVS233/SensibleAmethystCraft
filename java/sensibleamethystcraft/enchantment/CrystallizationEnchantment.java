package sensibleamethystcraft.enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

public class CrystallizationEnchantment extends Enchantment {
	public CrystallizationEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}
	@Override
	public int getMaxLevel() {
		return 5;
	}
	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 1;
	}
	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}