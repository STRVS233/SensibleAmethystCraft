package sensibleamethystcraft.init;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SensibleamethystcraftModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("sensibleamethystcraft", "sensibleamethystcraft"),
				builder -> builder.title(Component.translatable("item_group.sensibleamethystcraft.sensibleamethystcraft")).icon(() -> new ItemStack(Items.AMETHYST_SHARD)).displayItems((parameters, tabData) -> {
					tabData.accept(SensibleamethystcraftModItems.HIGHPURITYAMETHYST.get());
					tabData.accept(SensibleamethystcraftModItems.AMETHYST_AXE.get());
					tabData.accept(SensibleamethystcraftModItems.AMETHYST_PICKAXE.get());
					tabData.accept(SensibleamethystcraftModItems.AMETHYST_SWORD.get());
					tabData.accept(SensibleamethystcraftModItems.AMETHYST_SHOVEL.get());
					tabData.accept(SensibleamethystcraftModItems.AMETHYST_HOE.get());
				})
		);
	}
}