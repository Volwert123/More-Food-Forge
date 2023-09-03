package net.volwert123.morefood.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.item.MoreFoodItems;
import net.volwert123.morefood.loot.AddItemModifier;

public class MoreFoodGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public MoreFoodGlobalLootModifierProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID);
    }

    @Override
    protected void start() {
        add("rice_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, MoreFoodItems.RICE.get()));
        add("rice_from_fern", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.FERN).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, MoreFoodItems.RICE.get()));
    }
}