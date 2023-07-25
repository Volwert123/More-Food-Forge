package net.volwert123.morefood.item.custom;

import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class SoupItem extends Item {
    public SoupItem(Properties properties) {
        super(properties);
    }

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
}
