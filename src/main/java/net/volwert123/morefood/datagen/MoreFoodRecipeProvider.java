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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.CARROT_BREAD.get())
                .requires(Items.CARROT.asItem())
                .requires(Items.WHEAT.asItem())
                .requires(MoreFoodItem.CARROT_PIECES.get())
                .unlockedBy(getHasName(Items.CARROT.asItem()), has(Items.CARROT.asItem()))
                .unlockedBy(getHasName(Items.WHEAT.asItem()), has(Items.WHEAT.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.CARROT_PIECES.get()), has(MoreFoodItem.CARROT_PIECES.get()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.CARROT_BREAD.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.CARROT_PIE.get())
                .requires(Items.CARROT.asItem())
                .requires(Items.EGG.asItem())
                .requires(Items.SUGAR.asItem())
                .unlockedBy(getHasName(Items.CARROT.asItem()), has(Items.CARROT.asItem()))
                .unlockedBy(getHasName(Items.EGG.asItem()), has(Items.EGG.asItem()))
                .unlockedBy(getHasName(Items.SUGAR.asItem()), has(Items.SUGAR.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.CARROT_PIE.get())));

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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.APPLE_BREAD.get())
                .requires(Items.APPLE.asItem())
                .requires(Items.WHEAT.asItem())
                .requires(MoreFoodItem.APPLE_PIECES.get())
                .unlockedBy(getHasName(Items.APPLE.asItem()), has(Items.APPLE.asItem()))
                .unlockedBy(getHasName(Items.WHEAT.asItem()), has(Items.WHEAT.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.APPLE_PIECES.get()), has(MoreFoodItem.APPLE_PIECES.get()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.APPLE_BREAD.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.APPLE_PIE.get())
                .requires(Items.APPLE.asItem())
                .requires(Items.EGG.asItem())
                .requires(Items.SUGAR.asItem())
                .unlockedBy(getHasName(Items.APPLE.asItem()), has(Items.APPLE.asItem()))
                .unlockedBy(getHasName(Items.EGG.asItem()), has(Items.EGG.asItem()))
                .unlockedBy(getHasName(Items.SUGAR.asItem()), has(Items.SUGAR.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.APPLE_PIE.get())));

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
                .requires(MoreFoodItem.POTATO_PIECES.get())
                .requires(Items.POTATO.asItem())
                .unlockedBy(getHasName(Items.BOWL.asItem()), has(Items.BOWL.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.POTATO_PIECES.get()), has(MoreFoodItem.POTATO_PIECES.get()))
                .unlockedBy(getHasName(Items.POTATO.asItem()), has(Items.POTATO.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.POTATO_SOUP.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.POTATO_BREAD.get())
                .requires(Items.POTATO.asItem())
                .requires(Items.WHEAT.asItem())
                .requires(MoreFoodItem.POTATO_PIECES.get())
                .unlockedBy(getHasName(Items.POTATO.asItem()), has(Items.POTATO.asItem()))
                .unlockedBy(getHasName(Items.WHEAT.asItem()), has(Items.WHEAT.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.POTATO_PIECES.get()), has(MoreFoodItem.POTATO_PIECES.get()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.POTATO_BREAD.get())));


        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.PHANTOM_MEMBRANE.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_PHANTOM.get(),1.0f,200, RecipeSerializer.SMELTING_RECIPE)
                .unlockedBy(getHasName(Items.PHANTOM_MEMBRANE),has(Items.PHANTOM_MEMBRANE))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_PHANTOM.get()) + "_smelting"));

        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.PHANTOM_MEMBRANE.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_PHANTOM.get(),1.0f,100, RecipeSerializer.SMOKING_RECIPE)
                .unlockedBy(getHasName(Items.PHANTOM_MEMBRANE),has(Items.PHANTOM_MEMBRANE))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_PHANTOM.get()) + "_smoking"));

        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.PHANTOM_MEMBRANE.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_PHANTOM.get(),1.0f,600, RecipeSerializer.CAMPFIRE_COOKING_RECIPE)
                .unlockedBy(getHasName(Items.PHANTOM_MEMBRANE),has(Items.PHANTOM_MEMBRANE))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_PHANTOM.get()) + "_campfire_cooking"));


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,MoreFoodItem.PHANTOM_PIECES.get(),4)
                .requires(Items.PHANTOM_MEMBRANE.asItem())
                .unlockedBy(getHasName(Items.PHANTOM_MEMBRANE.asItem()), has(Items.PHANTOM_MEMBRANE.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.PHANTOM_PIECES.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.PHANTOM_SOUP.get())
                .requires(Items.BOWL.asItem())
                .requires(MoreFoodItem.PHANTOM_PIECES.get())
                .requires(Items.PHANTOM_MEMBRANE.asItem())
                .unlockedBy(getHasName(Items.BOWL.asItem()), has(Items.BOWL.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.PHANTOM_PIECES.get()), has(MoreFoodItem.PHANTOM_PIECES.get()))
                .unlockedBy(getHasName(Items.PHANTOM_MEMBRANE.asItem()), has(Items.PHANTOM_MEMBRANE.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.PHANTOM_SOUP.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,MoreFoodItem.PUFFERFISH_PIECES.get(),4)
                .requires(Items.PUFFERFISH.asItem())
                .unlockedBy(getHasName(Items.PUFFERFISH.asItem()), has(Items.PUFFERFISH.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.PUFFERFISH_PIECES.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.PUMPKING_SOUP.get())
                .requires(Items.BOWL.asItem())
                .requires(MoreFoodItem.PUFFERFISH_PIECES.get())
                .requires(Items.PUFFERFISH.asItem())
                .unlockedBy(getHasName(Items.BOWL.asItem()), has(Items.BOWL.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.PUFFERFISH_PIECES.get()), has(MoreFoodItem.PUFFERFISH_SOUP.get()))
                .unlockedBy(getHasName(Items.PUFFERFISH.asItem()), has(Items.PUFFERFISH.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.PUFFERFISH_SOUP.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.PUMPKING_SOUP.get())
                .requires(Items.BOWL.asItem())
                .requires(Items.PUMPKIN_SEEDS.asItem())
                .requires(Items.PUMPKIN.asItem())
                .unlockedBy(getHasName(Items.BOWL.asItem()), has(Items.BOWL.asItem()))
                .unlockedBy(getHasName(Items.PUMPKIN_SEEDS.asItem()), has(Items.PUMPKIN_SEEDS.asItem()))
                .unlockedBy(getHasName(Items.PUMPKIN.asItem()), has(Items.PUMPKIN.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.PUMPKING_SOUP.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.PUMPKING_BREAD.get())
                .requires(Items.PUMPKIN.asItem())
                .requires(Items.WHEAT.asItem())
                .requires(Items.PUMPKIN_SEEDS.asItem())
                .unlockedBy(getHasName(Items.PUMPKIN.asItem()), has(Items.PUMPKIN.asItem()))
                .unlockedBy(getHasName(Items.WHEAT.asItem()), has(Items.WHEAT.asItem()))
                .unlockedBy(getHasName(Items.PUMPKIN_SEEDS.asItem()), has(Items.PUMPKIN_SEEDS.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.PUMPKING_BREAD.get())));


        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.BAMBOO.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_BAMBOO.get(),1.0f,200, RecipeSerializer.SMELTING_RECIPE)
                .unlockedBy(getHasName(Items.BAMBOO),has(Items.BAMBOO))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_BAMBOO.get()) + "_smelting"));

        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.BAMBOO.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_BAMBOO.get(),1.0f,100, RecipeSerializer.SMOKING_RECIPE)
                .unlockedBy(getHasName(Items.BAMBOO),has(Items.BAMBOO))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_BAMBOO.get()) + "_smoking"));

        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.BAMBOO.asItem()), RecipeCategory.FOOD,MoreFoodItem.COOKED_BAMBOO.get(),1.0f,600, RecipeSerializer.CAMPFIRE_COOKING_RECIPE)
                .unlockedBy(getHasName(Items.BAMBOO),has(Items.BAMBOO))
                .save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.COOKED_BAMBOO.get()) + "_campfire_cooking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,MoreFoodItem.BAMBOO_PIECES.get(),4)
                .requires(Items.BAMBOO.asItem())
                .unlockedBy(getHasName(Items.BAMBOO.asItem()), has(Items.BAMBOO.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.BAMBOO_PIECES.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.BAMBOO_SOUP.get())
                .requires(Items.BOWL.asItem())
                .requires(MoreFoodItem.BAMBOO_PIECES.get())
                .requires(Items.BAMBOO.asItem())
                .unlockedBy(getHasName(Items.BOWL.asItem()), has(Items.BOWL.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.BAMBOO_PIECES.get()), has(MoreFoodItem.BAMBOO_PIECES.get()))
                .unlockedBy(getHasName(Items.BAMBOO.asItem()), has(Items.BAMBOO.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.BAMBOO_SOUP.get())));

    }

}
