package sensibleamethystcraft.item;
import sensibleamethystcraft.procedures.AmethystToolsProcedure;
import sensibleamethystcraft.init.SensibleamethystcraftModItems;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import java.util.List;

public class AmethystPickaxeItem extends PickaxeItem {
	public AmethystPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 18;
			}
			public float getSpeed() {
				return 7f;
			}
			public float getAttackDamageBonus() {
				return 4f;
			}
			public int getLevel() {
				return 8;
			}
			public int getEnchantmentValue() {
				return 5;
			}
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SensibleamethystcraftModItems.HIGHPURITYAMETHYST.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.translatable("item_des.sensibleamethystcraft.amethyst_pickaxe"));
	}
	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		AmethystToolsProcedure.execute(itemstack);
	}
}