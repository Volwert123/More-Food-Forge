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

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.IRON_CARROT.get())
                .define('I', Items.IRON_INGOT)
                .define('C', Items.CARROT)
                .pattern("III")
                .pattern("ICI")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .unlockedBy(getHasName(Items.CARROT.asItem()), has(Items.CARROT.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.IRON_CARROT.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.DIAMOND_CARROT.get())
                .define('D', Items.DIAMOND)
                .define('C', Items.CARROT)
                .pattern("DDD")
                .pattern("DCD")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                .unlockedBy(getHasName(Items.CARROT.asItem()), has(Items.CARROT.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.DIAMOND_CARROT.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.EMERALD_CARROT.get())
                .define('E', Items.EMERALD)
                .define('C', Items.CARROT)
                .pattern("EEE")
                .pattern("ECE")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD.asItem()), has(Items.EMERALD.asItem()))
                .unlockedBy(getHasName(Items.CARROT.asItem()), has(Items.CARROT.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.EMERALD_CARROT.get())));

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




        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.IRON_APPLE.get())
                .define('I', Items.IRON_INGOT)
                .define('A', Items.APPLE)
                .pattern("III")
                .pattern("IAI")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .unlockedBy(getHasName(Items.APPLE.asItem()), has(Items.APPLE.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.IRON_APPLE.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.DIAMOND_APPLE.get())
                .define('D', Items.DIAMOND)
                .define('A', Items.APPLE)
                .pattern("DDD")
                .pattern("DAD")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                .unlockedBy(getHasName(Items.APPLE.asItem()), has(Items.APPLE.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.DIAMOND_APPLE.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.EMERALD_APPLE.get())
                .define('E', Items.EMERALD)
                .define('A', Items.APPLE)
                .pattern("EEE")
                .pattern("EAE")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD.asItem()), has(Items.EMERALD.asItem()))
                .unlockedBy(getHasName(Items.APPLE.asItem()), has(Items.APPLE.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.EMERALD_APPLE.get())));

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




        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.IRON_KELP.get())
                .define('I', Items.IRON_INGOT)
                .define('K', Items.DRIED_KELP)
                .pattern("III")
                .pattern("IKI")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .unlockedBy(getHasName(Items.DRIED_KELP.asItem()), has(Items.DRIED_KELP.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.IRON_KELP.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.GOLD_KELP.get())
                .define('G', Items.GOLD_INGOT)
                .define('K', Items.DRIED_KELP)
                .pattern("GGG")
                .pattern("GKG")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT.asItem()), has(Items.GOLD_INGOT.asItem()))
                .unlockedBy(getHasName(Items.DRIED_KELP.asItem()), has(Items.DRIED_KELP.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.GOLD_KELP.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.DIAMOND_KELP.get())
                .define('D', Items.DIAMOND)
                .define('K', Items.DRIED_KELP)
                .pattern("DDD")
                .pattern("DKD")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                .unlockedBy(getHasName(Items.DRIED_KELP.asItem()), has(Items.DRIED_KELP.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.DIAMOND_KELP.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.EMERALD_KELP.get())
                .define('E', Items.EMERALD)
                .define('K', Items.DRIED_KELP)
                .pattern("EEE")
                .pattern("EKE")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD.asItem()), has(Items.EMERALD.asItem()))
                .unlockedBy(getHasName(Items.DRIED_KELP.asItem()), has(Items.DRIED_KELP.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.EMERALD_KELP.get())));

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

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.IRON_POTATO.get())
                .define('I', Items.IRON_INGOT)
                .define('P', Items.POTATO)
                .pattern("III")
                .pattern("IPI")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .unlockedBy(getHasName(Items.POTATO.asItem()), has(Items.POTATO.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.IRON_POTATO.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.GOLD_POTATO.get())
                .define('G', Items.GOLD_INGOT)
                .define('P', Items.POTATO)
                .pattern("GGG")
                .pattern("GPG")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT.asItem()), has(Items.GOLD_INGOT.asItem()))
                .unlockedBy(getHasName(Items.POTATO.asItem()), has(Items.POTATO.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.GOLD_POTATO.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.DIAMOND_POTATO.get())
                .define('D', Items.DIAMOND)
                .define('P', Items.POTATO)
                .pattern("DDD")
                .pattern("DPD")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                .unlockedBy(getHasName(Items.POTATO.asItem()), has(Items.POTATO.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.DIAMOND_POTATO.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.EMERALD_POTATO.get())
                .define('E', Items.EMERALD)
                .define('P', Items.POTATO)
                .pattern("EEE")
                .pattern("EPE")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD.asItem()), has(Items.EMERALD.asItem()))
                .unlockedBy(getHasName(Items.POTATO.asItem()), has(Items.POTATO.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.EMERALD_POTATO.get())));


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


        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,MoreFoodItem.PUFFERFISH_SOUP.get())
                .requires(Items.BOWL.asItem())
                .requires(MoreFoodItem.PUFFERFISH_PIECES.get())
                .requires(Items.PUFFERFISH.asItem())
                .unlockedBy(getHasName(Items.BOWL.asItem()), has(Items.BOWL.asItem()))
                .unlockedBy(getHasName(MoreFoodItem.PUFFERFISH_PIECES.get()), has(MoreFoodItem.PUFFERFISH_PIECES.get()))
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




        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.IRON_COOKED_RABBIT.get())
                .define('I', Items.IRON_INGOT)
                .define('R', Items.COOKED_RABBIT)
                .pattern("III")
                .pattern("IRI")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .unlockedBy(getHasName(Items.COOKED_RABBIT.asItem()), has(Items.COOKED_RABBIT.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.IRON_COOKED_RABBIT.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.GOLD_COOKED_RABBIT.get())
                .define('G', Items.GOLD_INGOT)
                .define('R', Items.COOKED_RABBIT)
                .pattern("GGG")
                .pattern("GRG")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT.asItem()), has(Items.GOLD_INGOT.asItem()))
                .unlockedBy(getHasName(Items.COOKED_RABBIT.asItem()), has(Items.COOKED_RABBIT.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.GOLD_COOKED_RABBIT.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.DIAMOND_COOKED_RABBIT.get())
                .define('D', Items.DIAMOND)
                .define('R', Items.COOKED_RABBIT)
                .pattern("DDD")
                .pattern("DRD")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                .unlockedBy(getHasName(Items.COOKED_RABBIT.asItem()), has(Items.COOKED_RABBIT.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.DIAMOND_COOKED_RABBIT.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.EMERALD_COOKED_RABBIT.get())
                .define('E', Items.EMERALD)
                .define('R', Items.COOKED_RABBIT)
                .pattern("EEE")
                .pattern("ERE")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD.asItem()), has(Items.EMERALD.asItem()))
                .unlockedBy(getHasName(Items.COOKED_RABBIT.asItem()), has(Items.COOKED_RABBIT.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.EMERALD_COOKED_RABBIT.get())));




        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.IRON_MELON_SLICE.get())
                .define('I', Items.IRON_INGOT)
                .define('M', Items.MELON_SLICE)
                .pattern("III")
                .pattern("IMI")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .unlockedBy(getHasName(Items.MELON_SLICE.asItem()), has(Items.MELON_SLICE.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.IRON_MELON_SLICE.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.GOLD_MELON_SLICE.get())
                .define('G', Items.GOLD_INGOT)
                .define('M', Items.MELON_SLICE)
                .pattern("GGG")
                .pattern("GMG")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT.asItem()), has(Items.GOLD_INGOT.asItem()))
                .unlockedBy(getHasName(Items.MELON_SLICE.asItem()), has(Items.MELON_SLICE.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.GOLD_MELON_SLICE.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.DIAMOND_MELON_SLICE.get())
                .define('D', Items.DIAMOND)
                .define('M', Items.MELON_SLICE)
                .pattern("DDD")
                .pattern("DMD")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                .unlockedBy(getHasName(Items.MELON_SLICE.asItem()), has(Items.MELON_SLICE.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.DIAMOND_MELON_SLICE.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.EMERALD_MELON_SLICE.get())
                .define('E', Items.EMERALD)
                .define('M', Items.MELON_SLICE)
                .pattern("EEE")
                .pattern("EME")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD.asItem()), has(Items.EMERALD.asItem()))
                .unlockedBy(getHasName(Items.MELON_SLICE.asItem()), has(Items.MELON_SLICE.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.EMERALD_MELON_SLICE.get())));




        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.IRON_COOKED_CHICKEN.get())
                .define('I', Items.IRON_INGOT)
                .define('C', Items.COOKED_CHICKEN)
                .pattern("III")
                .pattern("ICI")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .unlockedBy(getHasName(Items.COOKED_CHICKEN.asItem()), has(Items.COOKED_CHICKEN.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.IRON_COOKED_CHICKEN.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.GOLD_COOKED_CHICKEN.get())
                .define('G', Items.GOLD_INGOT)
                .define('C', Items.COOKED_CHICKEN)
                .pattern("GGG")
                .pattern("GCG")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT.asItem()), has(Items.GOLD_INGOT.asItem()))
                .unlockedBy(getHasName(Items.COOKED_CHICKEN.asItem()), has(Items.COOKED_CHICKEN.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.GOLD_COOKED_CHICKEN.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.DIAMOND_COOKED_CHICKEN.get())
                .define('D', Items.DIAMOND)
                .define('C', Items.COOKED_CHICKEN)
                .pattern("DDD")
                .pattern("DCD")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                .unlockedBy(getHasName(Items.COOKED_CHICKEN.asItem()), has(Items.COOKED_CHICKEN.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.DIAMOND_COOKED_CHICKEN.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.EMERALD_COOKED_CHICKEN.get())
                .define('E', Items.EMERALD)
                .define('C', Items.COOKED_CHICKEN)
                .pattern("EEE")
                .pattern("ECE")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD.asItem()), has(Items.EMERALD.asItem()))
                .unlockedBy(getHasName(Items.COOKED_CHICKEN.asItem()), has(Items.COOKED_CHICKEN.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.EMERALD_COOKED_CHICKEN.get())));




        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.IRON_COOKED_MUTTON.get())
                .define('I', Items.IRON_INGOT)
                .define('M', Items.COOKED_MUTTON)
                .pattern("III")
                .pattern("IMI")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .unlockedBy(getHasName(Items.COOKED_MUTTON.asItem()), has(Items.COOKED_MUTTON.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.IRON_COOKED_MUTTON.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.GOLD_COOKED_MUTTON.get())
                .define('G', Items.GOLD_INGOT)
                .define('M', Items.COOKED_MUTTON)
                .pattern("GGG")
                .pattern("GMG")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT.asItem()), has(Items.GOLD_INGOT.asItem()))
                .unlockedBy(getHasName(Items.COOKED_MUTTON.asItem()), has(Items.COOKED_MUTTON.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.GOLD_COOKED_MUTTON.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.DIAMOND_COOKED_MUTTON.get())
                .define('D', Items.DIAMOND)
                .define('M', Items.COOKED_MUTTON)
                .pattern("DDD")
                .pattern("DMD")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                .unlockedBy(getHasName(Items.COOKED_MUTTON.asItem()), has(Items.COOKED_MUTTON.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.DIAMOND_COOKED_MUTTON.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.EMERALD_COOKED_MUTTON.get())
                .define('E', Items.EMERALD)
                .define('M', Items.COOKED_MUTTON)
                .pattern("EEE")
                .pattern("EME")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD.asItem()), has(Items.EMERALD.asItem()))
                .unlockedBy(getHasName(Items.COOKED_MUTTON.asItem()), has(Items.COOKED_MUTTON.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.EMERALD_COOKED_MUTTON.get())));



        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.IRON_COOKED_PORKCHOP.get())
                .define('I', Items.IRON_INGOT)
                .define('P', Items.COOKED_PORKCHOP)
                .pattern("III")
                .pattern("IPI")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .unlockedBy(getHasName(Items.COOKED_PORKCHOP.asItem()), has(Items.COOKED_PORKCHOP.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.IRON_COOKED_PORKCHOP.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.GOLD_COOKED_PORKCHOP.get())
                .define('G', Items.GOLD_INGOT)
                .define('P', Items.COOKED_PORKCHOP)
                .pattern("GGG")
                .pattern("GPG")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT.asItem()), has(Items.GOLD_INGOT.asItem()))
                .unlockedBy(getHasName(Items.COOKED_PORKCHOP.asItem()), has(Items.COOKED_PORKCHOP.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.GOLD_COOKED_PORKCHOP.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.DIAMOND_COOKED_PORKCHOP.get())
                .define('D', Items.DIAMOND)
                .define('P', Items.COOKED_PORKCHOP)
                .pattern("DDD")
                .pattern("DPD")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                .unlockedBy(getHasName(Items.COOKED_PORKCHOP.asItem()), has(Items.COOKED_PORKCHOP.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.DIAMOND_COOKED_PORKCHOP.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.EMERALD_COOKED_PORKCHOP.get())
                .define('E', Items.EMERALD)
                .define('P', Items.COOKED_PORKCHOP)
                .pattern("EEE")
                .pattern("EPE")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD.asItem()), has(Items.EMERALD.asItem()))
                .unlockedBy(getHasName(Items.COOKED_PORKCHOP.asItem()), has(Items.COOKED_PORKCHOP.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.EMERALD_COOKED_PORKCHOP.get())));



        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.IRON_COOKED_BEEF.get())
                .define('I', Items.IRON_INGOT)
                .define('B', Items.COOKED_BEEF)
                .pattern("III")
                .pattern("IBI")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                .unlockedBy(getHasName(Items.COOKED_BEEF.asItem()), has(Items.COOKED_BEEF.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.IRON_COOKED_BEEF.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.GOLD_COOKED_BEEF.get())
                .define('G', Items.GOLD_INGOT)
                .define('B', Items.COOKED_BEEF)
                .pattern("GGG")
                .pattern("GBG")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT.asItem()), has(Items.GOLD_INGOT.asItem()))
                .unlockedBy(getHasName(Items.COOKED_BEEF.asItem()), has(Items.COOKED_BEEF.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.GOLD_COOKED_BEEF.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.DIAMOND_COOKED_BEEF.get())
                .define('D', Items.DIAMOND)
                .define('B', Items.COOKED_BEEF)
                .pattern("DDD")
                .pattern("DBD")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                .unlockedBy(getHasName(Items.COOKED_BEEF.asItem()), has(Items.COOKED_BEEF.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.DIAMOND_COOKED_BEEF.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD,MoreFoodItem.EMERALD_COOKED_BEEF.get())
                .define('E', Items.EMERALD)
                .define('B', Items.COOKED_BEEF)
                .pattern("EEE")
                .pattern("EBE")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD.asItem()), has(Items.EMERALD.asItem()))
                .unlockedBy(getHasName(Items.COOKED_BEEF.asItem()), has(Items.COOKED_BEEF.asItem()))
                .save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItem.EMERALD_COOKED_BEEF.get())));

    }

}
