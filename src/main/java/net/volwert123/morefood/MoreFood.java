package net.volwert123.morefood;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.volwert123.morefood.item.MoreFoodCreativeModeTabs;
import net.volwert123.morefood.item.MoreFoodItem;

@Mod(MoreFood.MOD_ID)
public class MoreFood {
   public static final String MOD_ID = "morefood";

    public MoreFood() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MoreFoodItem.register(modEventBus);
        MoreFoodCreativeModeTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == MoreFoodCreativeModeTabs.MOREFOOD_TAB.get()){
            event.accept(MoreFoodItem.IRON_CARROT);
            event.accept(MoreFoodItem.DIAMOND_CARROT);
            event.accept(MoreFoodItem.EMERALD_CARROT);
            event.accept(MoreFoodItem.COOKED_CARROT);
            event.accept(MoreFoodItem.CARROT_PIECES);
            event.accept(MoreFoodItem.CARROT_SOUP);
            event.accept(MoreFoodItem.CARROT_BREAD);
            event.accept(MoreFoodItem.CARROT_PIE);
            event.accept(MoreFoodItem.IRON_APPLE);
            event.accept(MoreFoodItem.DIAMOND_APPLE);
            event.accept(MoreFoodItem.EMERALD_APPLE);
            event.accept(MoreFoodItem.COOKED_APPLE);
            event.accept(MoreFoodItem.APPLE_PIECES);
            event.accept(MoreFoodItem.APPLE_SOUP);
            event.accept(MoreFoodItem.APPLE_BREAD);
            event.accept(MoreFoodItem.APPLE_PIE);
            event.accept(MoreFoodItem.IRON_KELP);
            event.accept(MoreFoodItem.GOLD_KELP);
            event.accept(MoreFoodItem.DIAMOND_KELP);
            event.accept(MoreFoodItem.EMERALD_KELP);
            event.accept(MoreFoodItem.KELP_PIECES);
            event.accept(MoreFoodItem.KELP_SOUP);
            event.accept(MoreFoodItem.IRON_POTATO);
            event.accept(MoreFoodItem.GOLD_POTATO);
            event.accept(MoreFoodItem.DIAMOND_POTATO);
            event.accept(MoreFoodItem.EMERALD_POTATO);
            event.accept(MoreFoodItem.POTATO_PIECES);
            event.accept(MoreFoodItem.POTATO_SOUP);
            event.accept(MoreFoodItem.POTATO_BREAD);
            event.accept(MoreFoodItem.COOKED_PHANTOM);
            event.accept(MoreFoodItem.PHANTOM_PIECES);
            event.accept(MoreFoodItem.PHANTOM_SOUP);
            event.accept(MoreFoodItem.PUFFERFISH_PIECES);
            event.accept(MoreFoodItem.PUFFERFISH_SOUP);
            event.accept(MoreFoodItem.PUMPKING_SOUP);
            event.accept(MoreFoodItem.PUMPKING_BREAD);
            event.accept(MoreFoodItem.COOKED_BAMBOO);
            event.accept(MoreFoodItem.BAMBOO_PIECES);
            event.accept(MoreFoodItem.BAMBOO_SOUP);
            event.accept(MoreFoodItem.IRON_COOKED_RABBIT);
            event.accept(MoreFoodItem.GOLD_COOKED_RABBIT);
            event.accept(MoreFoodItem.DIAMOND_COOKED_RABBIT);
            event.accept(MoreFoodItem.EMERALD_COOKED_RABBIT);
            event.accept(MoreFoodItem.IRON_MELON_SLICE);
            event.accept(MoreFoodItem.GOLD_MELON_SLICE);
            event.accept(MoreFoodItem.DIAMOND_MELON_SLICE);
            event.accept(MoreFoodItem.EMERALD_MELON_SLICE);
            event.accept(MoreFoodItem.IRON_COOKED_CHICKEN);
            event.accept(MoreFoodItem.GOLD_COOKED_CHICKEN);
            event.accept(MoreFoodItem.DIAMOND_COOKED_CHICKEN);
            event.accept(MoreFoodItem.EMERALD_COOKED_CHICKEN);
            event.accept(MoreFoodItem.IRON_COOKED_MUTTON);
            event.accept(MoreFoodItem.GOLD_COOKED_MUTTON);
            event.accept(MoreFoodItem.DIAMOND_COOKED_MUTTON);
            event.accept(MoreFoodItem.EMERALD_COOKED_MUTTON);
            event.accept(MoreFoodItem.IRON_COOKED_PORKCHOP);
            event.accept(MoreFoodItem.GOLD_COOKED_PORKCHOP);
            event.accept(MoreFoodItem.DIAMOND_COOKED_PORKCHOP);
            event.accept(MoreFoodItem.EMERALD_COOKED_PORKCHOP);
            event.accept(MoreFoodItem.IRON_COOKED_BEEF);
            event.accept(MoreFoodItem.GOLD_COOKED_BEEF);
            event.accept(MoreFoodItem.DIAMOND_COOKED_BEEF);
            event.accept(MoreFoodItem.EMERALD_COOKED_BEEF);
        }
    }
}