package net.volwert123.morefood.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.item.MoreFoodItem;

public class MoreFoodModelProvider extends ItemModelProvider {
    public MoreFoodModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreFood.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(MoreFoodItem.IRON_CARROT);
        simpleItem(MoreFoodItem.DIAMOND_CARROT);
        simpleItem(MoreFoodItem.EMERALD_CARROT);
        simpleItem(MoreFoodItem.COOKED_CARROT);
        simpleItem(MoreFoodItem.CARROT_PIECES);
        simpleItem(MoreFoodItem.CARROT_SOUP);
        simpleItem(MoreFoodItem.CARROT_BREAD);
        simpleItem(MoreFoodItem.CARROT_PIE);
        simpleItem(MoreFoodItem.IRON_APPLE);
        simpleItem(MoreFoodItem.DIAMOND_APPLE);
        simpleItem(MoreFoodItem.EMERALD_APPLE);
        simpleItem(MoreFoodItem.COOKED_APPLE);
        simpleItem(MoreFoodItem.APPLE_PIECES);
        simpleItem(MoreFoodItem.APPLE_SOUP);
        simpleItem(MoreFoodItem.APPLE_BREAD);
        simpleItem(MoreFoodItem.APPLE_PIE);
        simpleItem(MoreFoodItem.IRON_KELP);
        simpleItem(MoreFoodItem.GOLD_KELP);
        simpleItem(MoreFoodItem.DIAMOND_KELP);
        simpleItem(MoreFoodItem.EMERALD_KELP);
        simpleItem(MoreFoodItem.KELP_PIECES);
        simpleItem(MoreFoodItem.KELP_SOUP);
        simpleItem(MoreFoodItem.IRON_POTATO);
        simpleItem(MoreFoodItem.GOLD_POTATO);
        simpleItem(MoreFoodItem.DIAMOND_POTATO);
        simpleItem(MoreFoodItem.EMERALD_POTATO);
        simpleItem(MoreFoodItem.POTATO_PIECES);
        simpleItem(MoreFoodItem.POTATO_SOUP);
        simpleItem(MoreFoodItem.POTATO_BREAD);
        simpleItem(MoreFoodItem.COOKED_PHANTOM);
        simpleItem(MoreFoodItem.PHANTOM_PIECES);
        simpleItem(MoreFoodItem.PHANTOM_SOUP);
        simpleItem(MoreFoodItem.PUFFERFISH_PIECES);
        simpleItem(MoreFoodItem.PUFFERFISH_SOUP);
        simpleItem(MoreFoodItem.PUMPKING_SOUP);
        simpleItem(MoreFoodItem.PUMPKING_BREAD);
        simpleItem(MoreFoodItem.COOKED_BAMBOO);
        simpleItem(MoreFoodItem.BAMBOO_PIECES);
        simpleItem(MoreFoodItem.BAMBOO_SOUP);
        simpleItem(MoreFoodItem.IRON_COOKED_RABBIT);
        simpleItem(MoreFoodItem.GOLD_COOKED_RABBIT);
        simpleItem(MoreFoodItem.DIAMOND_COOKED_RABBIT);
        simpleItem(MoreFoodItem.EMERALD_COOKED_RABBIT);
        simpleItem(MoreFoodItem.IRON_MELON_SLICE);
        simpleItem(MoreFoodItem.GOLD_MELON_SLICE);
        simpleItem(MoreFoodItem.DIAMOND_MELON_SLICE);
        simpleItem(MoreFoodItem.EMERALD_MELON_SLICE);
        simpleItem(MoreFoodItem.IRON_COOKED_CHICKEN);
        simpleItem(MoreFoodItem.GOLD_COOKED_CHICKEN);
        simpleItem(MoreFoodItem.DIAMOND_COOKED_CHICKEN);
        simpleItem(MoreFoodItem.EMERALD_COOKED_CHICKEN);
        simpleItem(MoreFoodItem.IRON_COOKED_MUTTON);
        simpleItem(MoreFoodItem.GOLD_COOKED_MUTTON);
        simpleItem(MoreFoodItem.DIAMOND_COOKED_MUTTON);
        simpleItem(MoreFoodItem.EMERALD_COOKED_MUTTON);
        simpleItem(MoreFoodItem.IRON_COOKED_PORKCHOP);
        simpleItem(MoreFoodItem.GOLD_COOKED_PORKCHOP);
        simpleItem(MoreFoodItem.DIAMOND_COOKED_PORKCHOP);
        simpleItem(MoreFoodItem.EMERALD_COOKED_PORKCHOP);
        simpleItem(MoreFoodItem.IRON_COOKED_BEEF);
        simpleItem(MoreFoodItem.GOLD_COOKED_BEEF);
        simpleItem(MoreFoodItem.DIAMOND_COOKED_BEEF);
        simpleItem(MoreFoodItem.EMERALD_COOKED_BEEF);

    }
    private void simpleItem(RegistryObject<Item> item){
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreFood.MOD_ID,"item/" + item.getId().getPath()));
    }
}
