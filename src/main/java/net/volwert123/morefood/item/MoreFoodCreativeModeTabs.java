package net.volwert123.morefood.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.morefood.MoreFood;
public class MoreFoodCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreFood.MOD_ID);

    public static RegistryObject<CreativeModeTab> MOREFOOD_TAB = CREATIVE_MODE_TABS.register("morefood_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(MoreFoodItems.COOKED_CARROT.get()))
            .title(Component.literal("More Food")).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
