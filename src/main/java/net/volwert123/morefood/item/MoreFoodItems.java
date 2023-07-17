package net.volwert123.morefood.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
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

public class MoreFoodItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreFood.MOD_ID);

    public static final RegistryObject<Item> IRON_CARROT = ITEMS.register("iron_carrot", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(3).saturationMod(1.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(3, 1.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> DIAMOND_CARROT = ITEMS.register("diamond_carrot", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(3).saturationMod(1.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000,2));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(3, 1.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> EMERALD_CARROT = ITEMS.register("emerald_carrot", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(3).saturationMod(1.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200,3));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(3, 1.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())));
    public static final RegistryObject<Item> CARROT_PIECES = ITEMS.register("carrot_pieces", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {

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
    public static final RegistryObject<Item> CARROT_BREAD = ITEMS.register("carrot_bread", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())));
    public static final RegistryObject<Item> CARROT_PIE = ITEMS.register("carrot_pie", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(10).saturationMod(5f).build())));
    public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("iron_apple", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(4).saturationMod(2f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(4, 2f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });

    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(4).saturationMod(2f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000,2));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(4, 2f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(4).saturationMod(2f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200,3));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(4, 2f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> COOKED_APPLE = ITEMS.register("cooked_apple", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())));
    public static final RegistryObject<Item> APPLE_PIECES = ITEMS.register("apple_pieces", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> APPLE_SOUP = ITEMS.register("apple_soup", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
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
    public static final RegistryObject<Item> APPLE_BREAD = ITEMS.register("apple_bread", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())));
    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(10).saturationMod(5f).build())));
    public static final RegistryObject<Item> IRON_KELP = ITEMS.register("iron_kelp", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> GOLD_KELP = ITEMS.register("gold_kelp", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 800));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 800,1));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> DIAMOND_KELP = ITEMS.register("diamond_kelp", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000,2));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> EMERALD_KELP = ITEMS.register("emerald_kelp", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200,3));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> KELP_PIECES = ITEMS.register("kelp_pieces", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> KELP_SOUP = ITEMS.register("kelp_soup", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
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
    public static final RegistryObject<Item> IRON_POTATO = ITEMS.register("iron_potato", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> GOLD_POTATO = ITEMS.register("gold_potato", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 800));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 800,1));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> DIAMOND_POTATO = ITEMS.register("diamond_potato", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000,2));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> EMERALD_POTATO = ITEMS.register("emerald_potato", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(4).saturationMod(2f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200,3));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(4, 2f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> POTATO_PIECES = ITEMS.register("potato_pieces", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> POTATO_SOUP = ITEMS.register("potato_soup", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
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
    public static final RegistryObject<Item> POTATO_BREAD = ITEMS.register("potato_bread", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())));
    public static final RegistryObject<Item> COOKED_PHANTOM = ITEMS.register("cooked_phantom", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())));
    public static final RegistryObject<Item> PHANTOM_PIECES = ITEMS.register("phantom_pieces", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PHANTOM_SOUP = ITEMS.register("phantom_soup", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
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
    public static final RegistryObject<Item> PUFFERFISH_PIECES = ITEMS.register("pufferfish_pieces", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> PUFFERFISH_SOUP = ITEMS.register("pufferfish_soup", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer) CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player,stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 700));
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
    public static final RegistryObject<Item> PUMPKING_SOUP = ITEMS.register("pumpking_soup", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
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
    public static final RegistryObject<Item> PUMPKING_BREAD = ITEMS.register("pumpking_bread", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())));
    public static final RegistryObject<Item> COOKED_BAMBOO = ITEMS.register("cooked_bamboo", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())));
    public static final RegistryObject<Item> BAMBOO_PIECES = ITEMS.register("bamboo_pieces", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BAMBOO_SOUP = ITEMS.register("bamboo_soup", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {
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
    public static final RegistryObject<Item> IRON_COOKED_RABBIT = ITEMS.register("iron_cooked_rabbit", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> GOLD_COOKED_RABBIT = ITEMS.register("gold_cooked_rabbit", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 800));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 800,1));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> DIAMOND_COOKED_RABBIT = ITEMS.register("diamond_cooked_rabbit", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000,2));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> EMERALD_COOKED_RABBIT = ITEMS.register("emerald_cooked_rabbit", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200,3));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> IRON_MELON_SLICE = ITEMS.register("iron_melon_slice", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> GOLD_MELON_SLICE = ITEMS.register("gold_melon_slice", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 800));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 800, 1));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> DIAMOND_MELON_SLICE = ITEMS.register("diamond_melon_slice", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000, 2));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> EMERALD_MELON_SLICE = ITEMS.register("emerald_melon_slice", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 3));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(5, 2.5f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> IRON_COOKED_CHICKEN = ITEMS.register("iron_cooked_chicken", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> GOLD_COOKED_CHICKEN = ITEMS.register("gold_cooked_chicken", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 800));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 800,1));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> DIAMOND_COOKED_CHICKEN = ITEMS.register("diamond_cooked_chicken", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000,2));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> EMERALD_COOKED_CHICKEN = ITEMS.register("emerald_cooked_chicken", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200,3));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> IRON_COOKED_MUTTON = ITEMS.register("iron_cooked_mutton", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> GOLD_COOKED_MUTTON = ITEMS.register("gold_cooked_mutton", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 800));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 800,1));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> DIAMOND_COOKED_MUTTON = ITEMS.register("diamond_cooked_mutton", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000,2));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> EMERALD_COOKED_MUTTON = ITEMS.register("emerald_cooked_mutton", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(6).saturationMod(3f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200,3));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(6, 3f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> IRON_COOKED_PORKCHOP = ITEMS.register("iron_cooked_porkchop", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(8).saturationMod(4f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(8, 4f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> GOLD_COOKED_PORKCHOP = ITEMS.register("gold_cooked_porkchop", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(8).saturationMod(4f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 800));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 800,1));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(8, 4f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> DIAMOND_COOKED_PORKCHOP = ITEMS.register("diamond_cooked_porkchop", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(8).saturationMod(4f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000,2));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(8, 4f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> EMERALD_COOKED_PORKCHOP = ITEMS.register("emerald_cooked_porkchop", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(8).saturationMod(4f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200,3));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(8, 4f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> IRON_COOKED_BEEF = ITEMS.register("iron_cooked_beef", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(8).saturationMod(4f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 600));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(8, 4f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> GOLD_COOKED_BEEF = ITEMS.register("gold_cooked_beef", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(8).saturationMod(4f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 800));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 800,1));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(8, 4f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> DIAMOND_COOKED_BEEF = ITEMS.register("diamond_cooked_beef", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(8).saturationMod(4f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000,2));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(8, 4f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });
    public static final RegistryObject<Item> EMERALD_COOKED_BEEF = ITEMS.register("emerald_cooked_beef", () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(8).saturationMod(4f).build())) {

                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
                    Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
                    if (player instanceof ServerPlayer)
                        CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
                    if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200,3));
                    if (player != null) {
                        player.awardStat(Stats.ITEM_USED.get(this));
                        player.getFoodData().eat(8, 4f);
                        if (!player.getAbilities().instabuild) stack.shrink(1);
                    }

                    return stack;
                }
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}