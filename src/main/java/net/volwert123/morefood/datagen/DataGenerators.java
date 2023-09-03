package net.volwert123.morefood.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.volwert123.morefood.MoreFood;

@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new MoreFoodBlockStateProvider(packOutput, fileHelper));
        generator.addProvider(true, new MoreFoodGlobalLootModifierProvider(packOutput));
        generator.addProvider(true, MoreFoodLootTableProvider.create(packOutput));
        generator.addProvider(true, new MoreFoodModelProvider(packOutput, fileHelper));
        generator.addProvider(true, new MoreFoodRecipeProvider(packOutput));
    }
}