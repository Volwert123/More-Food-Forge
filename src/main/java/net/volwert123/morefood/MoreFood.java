package net.volwert123.morefood;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.volwert123.morefood.block.MoreFoodBlocks;
import net.volwert123.morefood.item.MoreFoodCreativeModeTabs;
import net.volwert123.morefood.item.MoreFoodItems;

@Mod(MoreFood.MOD_ID)
public class MoreFood {
   public static final String MOD_ID = "morefood";

    public MoreFood() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MoreFoodBlocks.register(modEventBus);
        MoreFoodCreativeModeTabs.register(modEventBus);
        MoreFoodItems.register(modEventBus);
        MoreFoodCreativeModeTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == MoreFoodCreativeModeTabs.MOREFOOD_TAB.get()){
            event.accept(MoreFoodItems.IRON_CARROT);
            event.accept(MoreFoodItems.DIAMOND_CARROT);
            event.accept(MoreFoodItems.EMERALD_CARROT);
            event.accept(MoreFoodItems.COOKED_CARROT);
            event.accept(MoreFoodItems.CARROT_PIECES);
            event.accept(MoreFoodItems.CARROT_SOUP);
            event.accept(MoreFoodItems.CARROT_BREAD);
            event.accept(MoreFoodItems.CARROT_PIE);
            event.accept(MoreFoodItems.IRON_APPLE);
            event.accept(MoreFoodItems.DIAMOND_APPLE);
            event.accept(MoreFoodItems.EMERALD_APPLE);
            event.accept(MoreFoodItems.COOKED_APPLE);
            event.accept(MoreFoodItems.APPLE_PIECES);
            event.accept(MoreFoodItems.APPLE_SOUP);
            event.accept(MoreFoodItems.APPLE_BREAD);
            event.accept(MoreFoodItems.APPLE_PIE);
            event.accept(MoreFoodItems.IRON_KELP);
            event.accept(MoreFoodItems.GOLD_KELP);
            event.accept(MoreFoodItems.DIAMOND_KELP);
            event.accept(MoreFoodItems.EMERALD_KELP);
            event.accept(MoreFoodItems.KELP_PIECES);
            event.accept(MoreFoodItems.KELP_SOUP);
            event.accept(MoreFoodItems.IRON_POTATO);
            event.accept(MoreFoodItems.GOLD_POTATO);
            event.accept(MoreFoodItems.DIAMOND_POTATO);
            event.accept(MoreFoodItems.EMERALD_POTATO);
            event.accept(MoreFoodItems.POTATO_PIECES);
            event.accept(MoreFoodItems.POTATO_SOUP);
            event.accept(MoreFoodItems.POTATO_BREAD);
            event.accept(MoreFoodItems.COOKED_PHANTOM);
            event.accept(MoreFoodItems.PHANTOM_PIECES);
            event.accept(MoreFoodItems.PHANTOM_SOUP);
            event.accept(MoreFoodItems.PUFFERFISH_PIECES);
            event.accept(MoreFoodItems.PUFFERFISH_SOUP);
            event.accept(MoreFoodItems.PUMPKING_SOUP);
            event.accept(MoreFoodItems.PUMPKING_BREAD);
            event.accept(MoreFoodItems.COOKED_BAMBOO);
            event.accept(MoreFoodItems.BAMBOO_PIECES);
            event.accept(MoreFoodItems.BAMBOO_SOUP);
            event.accept(MoreFoodItems.IRON_COOKED_RABBIT);
            event.accept(MoreFoodItems.GOLD_COOKED_RABBIT);
            event.accept(MoreFoodItems.DIAMOND_COOKED_RABBIT);
            event.accept(MoreFoodItems.EMERALD_COOKED_RABBIT);
            event.accept(MoreFoodItems.IRON_MELON_SLICE);
            event.accept(MoreFoodItems.GOLD_MELON_SLICE);
            event.accept(MoreFoodItems.DIAMOND_MELON_SLICE);
            event.accept(MoreFoodItems.EMERALD_MELON_SLICE);
            event.accept(MoreFoodItems.IRON_COOKED_CHICKEN);
            event.accept(MoreFoodItems.GOLD_COOKED_CHICKEN);
            event.accept(MoreFoodItems.DIAMOND_COOKED_CHICKEN);
            event.accept(MoreFoodItems.EMERALD_COOKED_CHICKEN);
            event.accept(MoreFoodItems.IRON_COOKED_MUTTON);
            event.accept(MoreFoodItems.GOLD_COOKED_MUTTON);
            event.accept(MoreFoodItems.DIAMOND_COOKED_MUTTON);
            event.accept(MoreFoodItems.EMERALD_COOKED_MUTTON);
            event.accept(MoreFoodItems.IRON_COOKED_PORKCHOP);
            event.accept(MoreFoodItems.GOLD_COOKED_PORKCHOP);
            event.accept(MoreFoodItems.DIAMOND_COOKED_PORKCHOP);
            event.accept(MoreFoodItems.EMERALD_COOKED_PORKCHOP);
            event.accept(MoreFoodItems.IRON_COOKED_BEEF);
            event.accept(MoreFoodItems.GOLD_COOKED_BEEF);
            event.accept(MoreFoodItems.DIAMOND_COOKED_BEEF);
            event.accept(MoreFoodItems.EMERALD_COOKED_BEEF);
            event.accept(MoreFoodItems.RICE);
            event.accept(MoreFoodItems.RICE_CHICKENBOWL);
            event.accept(MoreFoodItems.RICE_SALMONBOWL);
            event.accept(MoreFoodItems.RICE_CODBOWL);
            event.accept(MoreFoodItems.RICE_VEGETABLEBOWL);
        }
    }
}