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
            event.accept(MoreFoodItem.COOKED_CARROT);
            event.accept(MoreFoodItem.CARROT_PIECES);
            event.accept(MoreFoodItem.CARROT_SOUP);
            event.accept(MoreFoodItem.COOKED_APPLE);
            event.accept(MoreFoodItem.APPLE_PIECES);
            event.accept(MoreFoodItem.APPLE_SOUP);
            event.accept(MoreFoodItem.KELP_PIECES);
            event.accept(MoreFoodItem.KELP_SOUP);
            event.accept(MoreFoodItem.POTATO_PIECES);
            event.accept(MoreFoodItem.POTATO_SOUP);
            event.accept(MoreFoodItem.PHANTOM_PIECES);
            event.accept(MoreFoodItem.PHANTOM_SOUP);
            event.accept(MoreFoodItem.PUFFERFISH_PIECES);
            event.accept(MoreFoodItem.PUFFERFISH_SOUP);
            event.accept(MoreFoodItem.PUMPKING_SOUP);
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
