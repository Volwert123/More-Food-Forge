package net.volwert123.morefood.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.volwert123.morefood.MoreFood;

@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreFoodCreativeModeTabs {
    public static CreativeModeTab MORE_FOOD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        MORE_FOOD_TAB = event.registerCreativeModeTab(new ResourceLocation(MoreFood.MOD_ID,"more_food_tab"),
                builder -> builder.icon(() -> new ItemStack(MoreFoodItem.COOKED_CARROT.get()))
                        .title(Component.literal("More Food")));
    }
}
