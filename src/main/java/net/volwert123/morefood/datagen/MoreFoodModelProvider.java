package net.volwert123.morefood.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.item.MoreFoodItems;

public class MoreFoodModelProvider extends ItemModelProvider {
    public MoreFoodModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreFood.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(MoreFoodItems.IRON_CARROT);
        simpleItem(MoreFoodItems.DIAMOND_CARROT);
        simpleItem(MoreFoodItems.EMERALD_CARROT);
        simpleItem(MoreFoodItems.COOKED_CARROT);
        simpleItem(MoreFoodItems.CARROT_PIECES);
        simpleItem(MoreFoodItems.CARROT_SOUP);
        simpleItem(MoreFoodItems.CARROT_BREAD);
        simpleItem(MoreFoodItems.CARROT_PIE);
        simpleItem(MoreFoodItems.IRON_APPLE);
        simpleItem(MoreFoodItems.DIAMOND_APPLE);
        simpleItem(MoreFoodItems.EMERALD_APPLE);
        simpleItem(MoreFoodItems.COOKED_APPLE);
        simpleItem(MoreFoodItems.APPLE_PIECES);
        simpleItem(MoreFoodItems.APPLE_SOUP);
        simpleItem(MoreFoodItems.APPLE_BREAD);
        simpleItem(MoreFoodItems.APPLE_PIE);
        simpleItem(MoreFoodItems.IRON_KELP);
        simpleItem(MoreFoodItems.GOLD_KELP);
        simpleItem(MoreFoodItems.DIAMOND_KELP);
        simpleItem(MoreFoodItems.EMERALD_KELP);
        simpleItem(MoreFoodItems.KELP_PIECES);
        simpleItem(MoreFoodItems.KELP_SOUP);
        simpleItem(MoreFoodItems.IRON_POTATO);
        simpleItem(MoreFoodItems.GOLD_POTATO);
        simpleItem(MoreFoodItems.DIAMOND_POTATO);
        simpleItem(MoreFoodItems.EMERALD_POTATO);
        simpleItem(MoreFoodItems.POTATO_PIECES);
        simpleItem(MoreFoodItems.POTATO_SOUP);
        simpleItem(MoreFoodItems.POTATO_BREAD);
        simpleItem(MoreFoodItems.COOKED_PHANTOM);
        simpleItem(MoreFoodItems.PHANTOM_PIECES);
        simpleItem(MoreFoodItems.PHANTOM_SOUP);
        simpleItem(MoreFoodItems.PUFFERFISH_PIECES);
        simpleItem(MoreFoodItems.PUFFERFISH_SOUP);
        simpleItem(MoreFoodItems.PUMPKING_SOUP);
        simpleItem(MoreFoodItems.PUMPKING_BREAD);
        simpleItem(MoreFoodItems.COOKED_BAMBOO);
        simpleItem(MoreFoodItems.BAMBOO_PIECES);
        simpleItem(MoreFoodItems.BAMBOO_SOUP);
        simpleItem(MoreFoodItems.IRON_COOKED_RABBIT);
        simpleItem(MoreFoodItems.GOLD_COOKED_RABBIT);
        simpleItem(MoreFoodItems.DIAMOND_COOKED_RABBIT);
        simpleItem(MoreFoodItems.EMERALD_COOKED_RABBIT);
        simpleItem(MoreFoodItems.IRON_MELON_SLICE);
        simpleItem(MoreFoodItems.GOLD_MELON_SLICE);
        simpleItem(MoreFoodItems.DIAMOND_MELON_SLICE);
        simpleItem(MoreFoodItems.EMERALD_MELON_SLICE);
        simpleItem(MoreFoodItems.IRON_COOKED_CHICKEN);
        simpleItem(MoreFoodItems.GOLD_COOKED_CHICKEN);
        simpleItem(MoreFoodItems.DIAMOND_COOKED_CHICKEN);
        simpleItem(MoreFoodItems.EMERALD_COOKED_CHICKEN);
        simpleItem(MoreFoodItems.IRON_COOKED_MUTTON);
        simpleItem(MoreFoodItems.GOLD_COOKED_MUTTON);
        simpleItem(MoreFoodItems.DIAMOND_COOKED_MUTTON);
        simpleItem(MoreFoodItems.EMERALD_COOKED_MUTTON);
        simpleItem(MoreFoodItems.IRON_COOKED_PORKCHOP);
        simpleItem(MoreFoodItems.GOLD_COOKED_PORKCHOP);
        simpleItem(MoreFoodItems.DIAMOND_COOKED_PORKCHOP);
        simpleItem(MoreFoodItems.EMERALD_COOKED_PORKCHOP);
        simpleItem(MoreFoodItems.IRON_COOKED_BEEF);
        simpleItem(MoreFoodItems.GOLD_COOKED_BEEF);
        simpleItem(MoreFoodItems.DIAMOND_COOKED_BEEF);
        simpleItem(MoreFoodItems.EMERALD_COOKED_BEEF);
        simpleItem(MoreFoodItems.RICE);
        simpleItem(MoreFoodItems.RICE_CHICKENBOWL);
        simpleItem(MoreFoodItems.RICE_SALMONBOWL);
        simpleItem(MoreFoodItems.RICE_CODBOWL);
        simpleItem(MoreFoodItems.RICE_VEGETABLEBOWL);
        simpleItem(MoreFoodItems.SUSHI_BAMBOO);
        simpleItem(MoreFoodItems.SUSHI_CARROT);
        simpleItem(MoreFoodItems.SUSHI_BEETROOT);
        simpleItem(MoreFoodItems.SUSHI_SALMON);
    }

    private void simpleItem(RegistryObject<Item> item){
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreFood.MOD_ID,"item/" + item.getId().getPath()));
    }
}