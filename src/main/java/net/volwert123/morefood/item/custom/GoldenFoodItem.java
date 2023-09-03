package net.volwert123.morefood.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GoldenFoodItem extends Item {
    public GoldenFoodItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity user) {
        Player player = user instanceof Player ? (Player) user : null;
        if (player instanceof ServerPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
        }
        if (level.isClientSide) user.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 800));
        if (level.isClientSide) user.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 800, 1));
        if (player != null) {
            player.awardStat(Stats.ITEM_USED.get(this));
            player.getFoodData().eat(stack.getFoodProperties(user).getNutrition(), stack.getFoodProperties(user).getSaturationModifier());
            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }
        }
        return stack;
    }
}