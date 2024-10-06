package net.rbweex.icerainclanmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class CurioModItem extends Item {
    private final Map<Attribute, AttributeModifier> attributeModifiers;
    private final boolean hasEnchantmentEffect;
    private final boolean hasTooltip;

    @Override
    public boolean isFoil(ItemStack stack) {
        return this.hasEnchantmentEffect;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        if (this.hasTooltip) {
            super.appendHoverText(stack, world, tooltip, flag);
            // Получаем идентификатор предмета
            String itemId = ForgeRegistries.ITEMS.getKey(stack.getItem()).getPath();
            // Используем Component.translatable для добавления локализованного текста
            tooltip.add(Component.translatable("item.irc_mod." + itemId + ".tooltip"));
        }
    }

    public CurioModItem(Properties properties, boolean hasEnchantmentEffect, boolean hasTooltip, Map<Attribute, AttributeModifier> attributeModifiers) {
        super(properties);
        this.attributeModifiers = attributeModifiers;
        this.hasEnchantmentEffect = hasEnchantmentEffect;
        this.hasTooltip = hasTooltip;
    }

    public Map<Attribute, AttributeModifier> getAttributeModifiers() {
        return attributeModifiers;
    }
}

