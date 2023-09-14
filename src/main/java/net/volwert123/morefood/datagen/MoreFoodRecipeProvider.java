package net.volwert123.morefood.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.item.MoreFoodItems;

import java.util.function.Consumer;

public class MoreFoodRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public MoreFoodRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        createIronFoodRecipe(MoreFoodItems.IRON_CARROT.get(), Items.CARROT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.IRON_CARROT.get())));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_CARROT.get(), Items.CARROT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.DIAMOND_CARROT.get())));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_CARROT.get(), Items.CARROT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.EMERALD_CARROT.get())));
        createSmeltingRecipe(MoreFoodItems.COOKED_CARROT.get(), Items.CARROT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_CARROT.get()) + "_smelting"));
        createSmokingRecipe(MoreFoodItems.COOKED_CARROT.get(), Items.CARROT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_CARROT.get()) + "_smoking"));
        createCampfireCookingRecipe(MoreFoodItems.COOKED_CARROT.get(), Items.CARROT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_CARROT.get()) + "_campfire_cooking"));
        createPiecesRecipe(MoreFoodItems.CARROT_PIECES.get(), Items.CARROT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.CARROT_PIECES.get())));
        createSoupRecipe(MoreFoodItems.CARROT_SOUP.get(), Items.CARROT, MoreFoodItems.CARROT_PIECES.get()).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.CARROT_SOUP.get())));
        createBreadRecipe(MoreFoodItems.CARROT_BREAD.get(), Items.CARROT, MoreFoodItems.CARROT_PIECES.get()).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.CARROT_BREAD.get())));
        createPieRecipe(MoreFoodItems.CARROT_PIE.get(), Items.CARROT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.CARROT_PIE.get())));

        createIronFoodRecipe(MoreFoodItems.IRON_APPLE.get(), Items.APPLE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.IRON_APPLE.get())));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_APPLE.get(), Items.APPLE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.DIAMOND_APPLE.get())));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_APPLE.get(), Items.APPLE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.EMERALD_APPLE.get())));
        createSmeltingRecipe(MoreFoodItems.COOKED_APPLE.get(), Items.APPLE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_APPLE.get()) + "_smelting"));
        createSmokingRecipe(MoreFoodItems.COOKED_APPLE.get(), Items.APPLE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_APPLE.get()) + "_smoking"));
        createCampfireCookingRecipe(MoreFoodItems.COOKED_APPLE.get(), Items.APPLE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_APPLE.get()) + "_campfire_cooking"));
        createPiecesRecipe(MoreFoodItems.APPLE_PIECES.get(), Items.APPLE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.APPLE_PIECES.get())));
        createSoupRecipe(MoreFoodItems.APPLE_SOUP.get(), Items.APPLE, MoreFoodItems.APPLE_PIECES.get()).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.APPLE_SOUP.get())));
        createBreadRecipe(MoreFoodItems.APPLE_BREAD.get(), Items.APPLE, MoreFoodItems.APPLE_PIECES.get()).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.APPLE_BREAD.get())));
        createPieRecipe(MoreFoodItems.APPLE_PIE.get(), Items.APPLE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.APPLE_PIE.get())));

        createIronFoodRecipe(MoreFoodItems.IRON_KELP.get(), Items.DRIED_KELP).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.IRON_KELP.get())));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_KELP.get(), Items.DRIED_KELP).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.GOLD_KELP.get())));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_KELP.get(), Items.DRIED_KELP).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.DIAMOND_KELP.get())));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_KELP.get(), Items.DRIED_KELP).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.EMERALD_KELP.get())));
        createPiecesRecipe(MoreFoodItems.KELP_PIECES.get(), Items.KELP).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.KELP_PIECES.get())));
        createSoupRecipe(MoreFoodItems.KELP_SOUP.get(), Items.KELP, MoreFoodItems.KELP_PIECES.get()).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.KELP_SOUP.get())));

        createIronFoodRecipe(MoreFoodItems.IRON_POTATO.get(), Items.POTATO).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.IRON_POTATO.get())));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_POTATO.get(), Items.POTATO).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.GOLD_POTATO.get())));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_POTATO.get(), Items.POTATO).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.DIAMOND_POTATO.get())));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_POTATO.get(), Items.POTATO).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.EMERALD_POTATO.get())));
        createPiecesRecipe(MoreFoodItems.POTATO_PIECES.get(), Items.POTATO).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.POTATO_PIECES.get())));
        createSoupRecipe(MoreFoodItems.POTATO_SOUP.get(), Items.POTATO, MoreFoodItems.POTATO_PIECES.get()).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.POTATO_SOUP.get())));
        createBreadRecipe(MoreFoodItems.POTATO_BREAD.get(), Items.POTATO, MoreFoodItems.POTATO_PIECES.get()).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.POTATO_BREAD.get())));

        createSmeltingRecipe(MoreFoodItems.COOKED_PHANTOM.get(), Items.PHANTOM_MEMBRANE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_PHANTOM.get()) + "_smelting"));
        createSmokingRecipe(MoreFoodItems.COOKED_PHANTOM.get(), Items.PHANTOM_MEMBRANE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_PHANTOM.get()) + "_smoking"));
        createCampfireCookingRecipe(MoreFoodItems.COOKED_PHANTOM.get(), Items.PHANTOM_MEMBRANE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_PHANTOM.get()) + "_campfire_cooking"));
        createPiecesRecipe(MoreFoodItems.PHANTOM_PIECES.get(), Items.PHANTOM_MEMBRANE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.PHANTOM_PIECES.get())));
        createSoupRecipe(MoreFoodItems.PHANTOM_SOUP.get(), Items.PHANTOM_MEMBRANE, MoreFoodItems.PHANTOM_PIECES.get()).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.PHANTOM_SOUP.get())));

        createPiecesRecipe(MoreFoodItems.PUFFERFISH_PIECES.get(), Items.PUFFERFISH).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.PUFFERFISH_PIECES.get())));
        createSoupRecipe(MoreFoodItems.PUFFERFISH_SOUP.get(), Items.PUFFERFISH, MoreFoodItems.PUFFERFISH_PIECES.get()).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.PUFFERFISH_SOUP.get())));

        createSoupRecipe(MoreFoodItems.PUMPKING_SOUP.get(), Items.PUMPKIN, Items.PUMPKIN_SEEDS).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.PUMPKING_SOUP.get())));
        createBreadRecipe(MoreFoodItems.PUMPKING_BREAD.get(), Items.PUMPKIN, Items.PUMPKIN_SEEDS).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.PUMPKING_BREAD.get())));

        createSmeltingRecipe(MoreFoodItems.COOKED_BAMBOO.get(), Items.BAMBOO).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_BAMBOO.get()) + "_smelting"));
        createSmokingRecipe(MoreFoodItems.COOKED_BAMBOO.get(), Items.BAMBOO).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_BAMBOO.get()) + "_smoking"));
        createCampfireCookingRecipe(MoreFoodItems.COOKED_BAMBOO.get(), Items.BAMBOO).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.COOKED_BAMBOO.get()) + "_campfire_cooking"));
        createPiecesRecipe(MoreFoodItems.BAMBOO_PIECES.get(), Items.BAMBOO).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.BAMBOO_PIECES.get())));
        createSoupRecipe(MoreFoodItems.BAMBOO_SOUP.get(), Items.BAMBOO, MoreFoodItems.BAMBOO_PIECES.get()).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.BAMBOO_SOUP.get())));

        createIronFoodRecipe(MoreFoodItems.IRON_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.IRON_COOKED_RABBIT.get())));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.GOLD_COOKED_RABBIT.get())));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.DIAMOND_COOKED_RABBIT.get())));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.EMERALD_COOKED_RABBIT.get())));

        createIronFoodRecipe(MoreFoodItems.IRON_MELON_SLICE.get(), Items.MELON_SLICE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.IRON_MELON_SLICE.get())));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_MELON_SLICE.get(), Items.MELON_SLICE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.GOLD_MELON_SLICE.get())));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_MELON_SLICE.get(), Items.MELON_SLICE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.DIAMOND_MELON_SLICE.get())));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_MELON_SLICE.get(), Items.MELON_SLICE).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.EMERALD_MELON_SLICE.get())));

        createIronFoodRecipe(MoreFoodItems.IRON_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.IRON_COOKED_CHICKEN.get())));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.GOLD_COOKED_CHICKEN.get())));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.DIAMOND_COOKED_CHICKEN.get())));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.EMERALD_COOKED_CHICKEN.get())));

        createIronFoodRecipe(MoreFoodItems.IRON_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.IRON_COOKED_MUTTON.get())));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.GOLD_COOKED_MUTTON.get())));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.DIAMOND_COOKED_MUTTON.get())));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.EMERALD_COOKED_MUTTON.get())));

        createIronFoodRecipe(MoreFoodItems.IRON_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.IRON_COOKED_PORKCHOP.get())));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.GOLD_COOKED_PORKCHOP.get())));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.DIAMOND_COOKED_PORKCHOP.get())));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.EMERALD_COOKED_PORKCHOP.get())));

        createIronFoodRecipe(MoreFoodItems.IRON_COOKED_BEEF.get(), Items.COOKED_BEEF).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.IRON_COOKED_BEEF.get())));
        createGoldenFoodRecipe(MoreFoodItems.GOLD_COOKED_BEEF.get(), Items.COOKED_BEEF).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.GOLD_COOKED_BEEF.get())));
        createDiamondFoodRecipe(MoreFoodItems.DIAMOND_COOKED_BEEF.get(), Items.COOKED_BEEF).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.DIAMOND_COOKED_BEEF.get())));
        createEmeraldFoodRecipe(MoreFoodItems.EMERALD_COOKED_BEEF.get(), Items.COOKED_BEEF).save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.EMERALD_COOKED_BEEF.get())));

        createRiceBowlRecipe(MoreFoodItems.RICE_CHICKENBOWL.get(), Items.COOKED_CHICKEN).save(consumer,new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.RICE_CHICKENBOWL.get())));
        createRiceBowlRecipe(MoreFoodItems.RICE_SALMONBOWL.get(), Items.COOKED_SALMON).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.RICE_SALMONBOWL.get())));
        createRiceBowlRecipe(MoreFoodItems.RICE_CODBOWL.get(), Items.COOKED_COD).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.RICE_CODBOWL.get())));
        createRiceVegetableBowlRecipe().save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.RICE_VEGETABLEBOWL.get())));

        createSushiRecipe(MoreFoodItems.SUSHI_BAMBOO.get(), Items.BAMBOO).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.SUSHI_BAMBOO.get())));
        createSushiRecipe(MoreFoodItems.SUSHI_CARROT.get(), Items.CARROT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.SUSHI_CARROT.get())));
        createSushiRecipe(MoreFoodItems.SUSHI_BEETROOT.get(), Items.BEETROOT).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.SUSHI_BEETROOT.get())));
        createSushiRecipe(MoreFoodItems.SUSHI_SALMON.get(), Items.SALMON).save(consumer, new ResourceLocation(MoreFood.MOD_ID, getItemName(MoreFoodItems.SUSHI_SALMON.get())));


    }

    private static ShapedRecipeBuilder createIronFoodRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('I', Items.IRON_INGOT)
                .define('#', input)
                .pattern("III")
                .pattern("I#I")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapedRecipeBuilder createGoldenFoodRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('G', Items.GOLD_INGOT)
                .define('#', input)
                .pattern("GGG")
                .pattern("G#G")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapedRecipeBuilder createDiamondFoodRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('D', Items.DIAMOND)
                .define('#', input)
                .pattern("DDD")
                .pattern("D#D")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapedRecipeBuilder createEmeraldFoodRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('E', Items.EMERALD)
                .define('#', input)
                .pattern("EEE")
                .pattern("E#E")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .unlockedBy(getHasName(input), has(input));
    }

    private static SimpleCookingRecipeBuilder createSmeltingRecipe(ItemLike output, ItemLike input) {
        return SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,200, RecipeSerializer.SMELTING_RECIPE).unlockedBy(getHasName(input), has(input));
    }

    private static SimpleCookingRecipeBuilder createSmokingRecipe(ItemLike output, ItemLike input) {
        return SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,100, RecipeSerializer.SMOKING_RECIPE).unlockedBy(getHasName(input), has(input));
    }

    private static SimpleCookingRecipeBuilder createCampfireCookingRecipe(ItemLike output, ItemLike input) {
        return SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,600, RecipeSerializer.CAMPFIRE_COOKING_RECIPE).unlockedBy(getHasName(input), has(input));
    }

    private static ShapelessRecipeBuilder createPiecesRecipe(ItemLike output, ItemLike input) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 4)
                .requires(input)
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapelessRecipeBuilder createSoupRecipe(ItemLike output, ItemLike input, ItemLike material) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, output)
                .requires(Items.BOWL)
                .requires(input)
                .requires(material)
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(material), has(material));
    }

    private static ShapelessRecipeBuilder createBreadRecipe(ItemLike output, ItemLike input, ItemLike material) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, output)
                .requires(Items.WHEAT)
                .requires(input)
                .requires(material)
                .unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT))
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(material), has(material));
    }

    private static ShapelessRecipeBuilder createPieRecipe(ItemLike output, ItemLike input) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, output)
                .requires(input)
                .requires(Items.EGG)
                .requires(Items.SUGAR)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.EGG), has(Items.EGG))
                .unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR));
    }

    private static ShapedRecipeBuilder createRiceBowlRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('B', Items.BOWL)
                .define('R', MoreFoodItems.RICE.get())
                .define('#', input)
                .pattern("  #")
                .pattern("RRR")
                .pattern(" B ")
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(MoreFoodItems.RICE.get()), has(MoreFoodItems.RICE.get()))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapedRecipeBuilder createRiceVegetableBowlRecipe() {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, MoreFoodItems.RICE_VEGETABLEBOWL.get())
                .define('B', Items.BOWL)
                .define('R', MoreFoodItems.RICE.get())
                .define('A', MoreFoodItems.COOKED_BAMBOO.get())
                .define('C', Items.CARROT)
                .pattern(" AC")
                .pattern("RRR")
                .pattern(" B ")
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(MoreFoodItems.RICE.get()), has(MoreFoodItems.RICE.get()))
                .unlockedBy(getHasName(MoreFoodItems.COOKED_BAMBOO.get()), has(MoreFoodItems.COOKED_BAMBOO.get()))
                .unlockedBy(getHasName(Items.CARROT), has(Items.CARROT));
    }

    private static ShapedRecipeBuilder createSushiRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('K', Items.KELP)
                .define('R', MoreFoodItems.RICE.get())
                .define('#', input)
                .pattern("   ")
                .pattern("R#R")
                .pattern("KKK")
                .unlockedBy(getHasName(Items.KELP), has(Items.KELP))
                .unlockedBy(getHasName(MoreFoodItems.RICE.get()), has(MoreFoodItems.RICE.get()))
                .unlockedBy(getHasName(input), has(input));
    }

}