package net.volwert123.morefood.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.volwert123.morefood.loot.MoreFoodBlockLootTables;

import java.util.List;
import java.util.Set;

public class MoreFoodLootTableProvider {
    public static LootTableProvider create (PackOutput packOutput) {
        return new LootTableProvider(packOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(MoreFoodBlockLootTables::new, LootContextParamSets.BLOCK)));
    }
}