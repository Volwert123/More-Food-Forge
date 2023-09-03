package net.volwert123.morefood.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.morefood.block.MoreFoodBlocks;
import net.volwert123.morefood.block.custom.RiceCropBlock;
import net.volwert123.morefood.item.MoreFoodItems;

import java.util.Set;

public class MoreFoodBlockLootTables extends BlockLootSubProvider {

    public MoreFoodBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(MoreFoodBlocks.RICE_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(RiceCropBlock.AGE, 7));
        add(MoreFoodBlocks.RICE_CROP.get(), applyExplosionDecay(MoreFoodBlocks.RICE_CROP.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(MoreFoodItems.RICE.get()))).withPool(LootPool.lootPool().when(lootitemcondition$builder).add(LootItem.lootTableItem(MoreFoodItems.RICE.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));
    }

    protected Iterable<Block> getKnownBlocks() {
        return MoreFoodBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}