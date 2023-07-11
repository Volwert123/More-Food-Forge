package net.volwert123.morefood;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.volwert123.morefood.item.MoreFoodCreativeModeTabs;
import net.volwert123.morefood.item.MoreFoodItem;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreFood.MOD_ID)
public class MoreFood
{
    // Define mod id in a common place for everything to reference

    public static final String MOD_ID = "morefood";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace

    public MoreFood()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        MoreFoodItem.register(modEventBus);
        MoreFoodCreativeModeTabs.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {}

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
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

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {}
    }
}
