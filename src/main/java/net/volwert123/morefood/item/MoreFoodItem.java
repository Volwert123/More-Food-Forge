package net.volwert123.morefood.item;

import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.morefood.MoreFood;

public class MoreFoodItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreFood.MOD_ID);

    public static final RegistryObject<Item> COOKED_CARROT = ITEMS.register("cooked_carrot",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())));

    public static final RegistryObject<Item> CARROT_PIECES = ITEMS.register("carrot_pieces",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player != null){
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }
                    if (player == null || !player.getAbilities().instabuild){
                        if (stack.isEmpty()) return new ItemStack(Items.BOWL);
                        if (player != null) player.getInventory().add(new ItemStack(Items.BOWL));
                    }

                    return stack;
                }
            });


    public static final RegistryObject<Item> COOKED_APPLE = ITEMS.register("cooked_apple",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)
                    .food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())));

    public static final RegistryObject<Item> APPLE_PIECES = ITEMS.register("apple_pieces",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> APPLE_SOUP = ITEMS.register("apple_soup",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
        @Override
            public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                if (player != null){
                    player.awardStat(Stats.ITEM_USED.get(this));
                    player.getFoodData().eat(6, 3f);
                    if (!player.getAbilities().instabuild) stack.shrink(1);
                }
                if (player == null || !player.getAbilities().instabuild){
                    if (stack.isEmpty()) return new ItemStack(Items.BOWL);
                    if (player != null) player.getInventory().add(new ItemStack(Items.BOWL));
                }

                return stack;
            }});



    public static final RegistryObject<Item> KELP_PIECES = ITEMS.register("kelp_pieces",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> KELP_SOUP = ITEMS.register("kelp_soup",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player != null){
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }
                    if (player == null || !player.getAbilities().instabuild){
                        if (stack.isEmpty()) return new ItemStack(Items.BOWL);
                        if (player != null) player.getInventory().add(new ItemStack(Items.BOWL));
                    }

                    return stack;
                }
            });


    public static final RegistryObject<Item> POTATO_PIECES = ITEMS.register("potato_pieces",
            () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player != null){
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }
                    if (player == null || !player.getAbilities().instabuild){
                        if (stack.isEmpty()) return new ItemStack(Items.BOWL);
                        if (player != null) player.getInventory().add(new ItemStack(Items.BOWL));
                    }

                    return stack;
                }
            });


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
