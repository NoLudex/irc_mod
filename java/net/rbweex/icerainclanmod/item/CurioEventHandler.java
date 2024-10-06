package net.rbweex.icerainclanmod.item;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import top.theillusivec4.curios.api.event.CurioAttributeModifierEvent;

import java.util.Map;

public class CurioEventHandler {

    // Регистрируем слушателя событий
    public static void register() {
        MinecraftForge.EVENT_BUS.register(new CurioEventHandler());
    }

    // Слушатель событий для CurioAttributeModifierEvent
    @SubscribeEvent
    public void onCurioAttributeModifier(CurioAttributeModifierEvent event) {
        ItemStack stack = event.getItemStack();
        Item item = stack.getItem();

        // Проверяем, что это предмет нашего мода
        if (item instanceof CurioModItem) {
            CurioModItem curioItem = (CurioModItem) item;

            // Добавляем атрибуты в событие
            for (Map.Entry<Attribute, AttributeModifier> entry : curioItem.getAttributeModifiers().entrySet()) {
                event.addModifier(entry.getKey(), entry.getValue());
            }
        }
    }
}
