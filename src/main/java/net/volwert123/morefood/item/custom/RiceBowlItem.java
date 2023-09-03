package net.volwert123.morefood.item.custom;

import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class RiceBowlItem extends Item {
    public RiceBowlItem(Properties properties) {
        super(properties.stacksTo(1));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity user) {
        Player player = user instanceof Player ? (Player) user : null;
        if (player != null){
            player.awardStat(Stats.ITEM_USED.get(this));
            player.getFoodData().eat(stack.getFoodProperties(user).getNutrition(), stack.getFoodProperties(user).getSaturationModifier());
            if (!player.getAbilities().instabuild) stack.shrink(1);
        }
        if (player == null || !player.getAbilities().instabuild) {
            if (stack.isEmpty()) return new ItemStack(Items.BOWL);
            if (player != null) player.getInventory().add(new ItemStack(Items.BOWL));
        }
        return stack;
    }
}