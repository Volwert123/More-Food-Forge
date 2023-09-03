package net.volwert123.morefood.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.block.MoreFoodBlocks;
import net.volwert123.morefood.block.custom.RiceCropBlock;

import java.util.function.Function;

public class MoreFoodBlockStateProvider extends BlockStateProvider {
    public MoreFoodBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreFood.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        makeCrop(((RiceCropBlock) MoreFoodBlocks.RICE_CROP.get()), "rice_stage", "rice_stage");
    }

    public void makeCrop(CropBlock cropBlock, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, cropBlock, modelName, textureName);

        getVariantBuilder(cropBlock).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((RiceCropBlock) block).getAgeProperty()),
                new ResourceLocation(MoreFood.MOD_ID, "block/" + textureName + state.getValue(((RiceCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }
}