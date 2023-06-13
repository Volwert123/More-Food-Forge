package net.volwert123.morefood.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
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

            });


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
