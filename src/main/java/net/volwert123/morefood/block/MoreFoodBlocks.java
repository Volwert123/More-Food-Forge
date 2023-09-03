package net.volwert123.morefood.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.morefood.MoreFood;
import net.volwert123.morefood.block.custom.RiceCropBlock;

public class MoreFoodBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreFood.MOD_ID);

    public static final RegistryObject<Block> RICE_CROP = BLOCKS.register("rice_crop", () -> new RiceCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission().noOcclusion()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}