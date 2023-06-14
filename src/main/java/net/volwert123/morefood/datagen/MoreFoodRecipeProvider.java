package net.volwert123.morefood.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.item.MoreFoodItem;

import java.util.function.Consumer;

public class MoreFoodRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MoreFoodRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.CARROT.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_CARROT.get(),1.0f,200, RecipeSerializer.SMELTING_RECIPE)
                .unlockedBy(getHasName(Items.CARROT),has(Items.CARROT))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_CARROT.get()) + "_smelting"));

        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.CARROT.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_CARROT.get(),1.0f,100, RecipeSerializer.SMOKING_RECIPE)
                .unlockedBy(getHasName(Items.CARROT),has(Items.CARROT))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_CARROT.get()) + "_smoking"));

        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.CARROT.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_CARROT.get(),1.0f,600, RecipeSerializer.CAMPFIRE_COOKING_RECIPE)
                .unlockedBy(getHasName(Items.CARROT),has(Items.CARROT))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_CARROT.get()) + "_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,MoreFoodItem.CARROT_PIECES.get(),4)
                .requires(Items.CARROT.asItem())
                .unlockedBy(getHasName(Items.CARROT.asItem()), has(Items.CARROT.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.CARROT_PIECES.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.CARROT_SOUP.get())
                .requires(Items.BOWL.asItem())
                .requires(MoreFoodItem.CARROT_PIECES.get())
                .requires(Items.CARROT.asItem())
                .unlockedBy(getHasName(Items.BOWL.asItem()), has(Items.BOWL.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.CARROT_PIECES.get()), has(MoreFoodItem.CARROT_PIECES.get()))
                .unlockedBy(getHasName(Items.CARROT.asItem()), has(Items.CARROT.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.CARROT_SOUP.get())));



        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.APPLE.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_APPLE.get(),1.0f,200, RecipeSerializer.SMELTING_RECIPE)
                .unlockedBy(getHasName(Items.APPLE),has(Items.APPLE))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_APPLE.get()) + "_smelting"));

        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.APPLE.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_APPLE.get(),1.0f,100, RecipeSerializer.SMOKING_RECIPE)
                .unlockedBy(getHasName(Items.APPLE),has(Items.APPLE))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_APPLE.get()) + "_smoking"));

        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.APPLE.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_APPLE.get(),1.0f,600, RecipeSerializer.CAMPFIRE_COOKING_RECIPE)
                .unlockedBy(getHasName(Items.APPLE),has(Items.APPLE))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_APPLE.get()) + "_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,MoreFoodItem.APPLE_PIECES.get(),4)
                .requires(Items.APPLE.asItem())
                .unlockedBy(getHasName(Items.APPLE.asItem()), has(Items.CARROT.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.APPLE_PIECES.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.APPLE_SOUP.get())
                .requires(Items.BOWL.asItem())
                .requires(MoreFoodItem.APPLE_PIECES.get())
                .requires(Items.APPLE.asItem())
                .unlockedBy(getHasName(Items.BOWL.asItem()), has(Items.BOWL.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.APPLE_PIECES.get()), has(MoreFoodItem.APPLE_PIECES.get()))
                .unlockedBy(getHasName(Items.APPLE.asItem()), has(Items.APPLE.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.APPLE_SOUP.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,MoreFoodItem.KELP_PIECES.get(),4)
                .requires(Items.KELP.asItem())
                .unlockedBy(getHasName(Items.APPLE.asItem()), has(Items.KELP.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.KELP_PIECES.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.KELP_SOUP.get())
                .requires(Items.BOWL.asItem())
                .requires(MoreFoodItem.KELP_PIECES.get())
                .requires(Items.KELP.asItem())
                .unlockedBy(getHasName(Items.BOWL.asItem()), has(Items.BOWL.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.KELP_PIECES.get()), has(MoreFoodItem.KELP_PIECES.get()))
                .unlockedBy(getHasName(Items.KELP.asItem()), has(Items.KELP.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.KELP_SOUP.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,MoreFoodItem.POTATO_PIECES.get(),4)
                .requires(Items.POTATO.asItem())
                .unlockedBy(getHasName(Items.POTATO.asItem()), has(Items.POTATO.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.POTATO_PIECES.get())));


        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.POTATO_SOUP.get())
                .requires(Items.BOWL.asItem())
                .requires(MoreFoodItem.POTATO_SOUP.get())
                .requires(Items.POTATO.asItem())
                .unlockedBy(getHasName(Items.BOWL.asItem()), has(Items.BOWL.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.POTATO_SOUP.get()), has(MoreFoodItem.POTATO_SOUP.get()))
                .unlockedBy(getHasName(Items.POTATO.asItem()), has(Items.POTATO.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.POTATO_SOUP.get())));

    }

}
