package net.rbweex.icerainclanmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;

public class ModItem extends Item {
    private final boolean hasEnchantmentEffect;

    public ModItem(Properties properties, boolean hasEnchantmentEffect) {
        super(properties);
        this.hasEnchantmentEffect = hasEnchantmentEffect;
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return this.hasEnchantmentEffect;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, world, tooltip, flag);
        // Получаем идентификатор предмета
        String itemId = ForgeRegistries.ITEMS.getKey(stack.getItem()).getPath();
        // Используем Component.translatable для добавления локализованного текста
        tooltip.add(Component.translatable("item.irc_mod." + itemId + ".tooltip"));
    }
}

