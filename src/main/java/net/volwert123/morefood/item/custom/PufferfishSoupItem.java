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
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class PufferfishSoupItem extends Item {
    public PufferfishSoupItem(Properties properties) {
        super(properties.stacksTo(1));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        Player player = livingEntity instanceof Player ? (Player) livingEntity : null;
        if (player instanceof ServerPlayer) CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player,stack);
        if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 600));
        if (!level.isClientSide) livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 700));
        if (player != null) {
            player.awardStat(Stats.ITEM_USED.get(this));
            player.getFoodData().eat(6, 3f);
            if (!player.getAbilities().instabuild) stack.shrink(1);
        }
        if (player == null || !player.getAbilities().instabuild) {
            if (stack.isEmpty()) return new ItemStack(Items.BOWL);
            if (player != null) player.getInventory().add(new ItemStack(Items.BOWL));
        }
        return stack;
    }
}