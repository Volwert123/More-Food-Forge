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
        simpleItem(MoreFoodItem.COOKED_CARROT);
        simpleItem(MoreFoodItem.CARROT_PIECES);
        simpleItem(MoreFoodItem.CARROT_SOUP);

    }
    private void simpleItem(RegistryObject<Item> item){
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreFood.MOD_ID,"item/" + item.getId().getPath()));
    }
}
