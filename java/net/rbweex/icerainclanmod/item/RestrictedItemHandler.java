package net.rbweex.icerainclanmod.item;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.HopperBlockEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Set;

public class RestrictedItemHandler {
    private final Set<Item> restrictedItems;

    public RestrictedItemHandler(Set<Item> restrictedItems) {
        this.restrictedItems = restrictedItems;
        MinecraftForge.EVENT_BUS.register(this);
    }

    // Добавить предмет в список запрещенных
    public void addRestrictedItem(Item item) {
        restrictedItems.add(item);
    }

    // Удалить предмет из списка запрещённых
    public void removeRestrictedItem(Item item) {
        restrictedItems.remove(item);
    }

    // Проверка, является ли предмет запрещённым
    private boolean isRestrictedItem(ItemStack stack) {
        return restrictedItems.contains(stack.getItem());
    }

    // Запретить выбрасывание предмета
    @SubscribeEvent
    public void onItemToss(ItemTossEvent event) {
        ItemStack stack = event.getEntity().getItem();
        if (isRestrictedItem(stack)) {
            event.setCanceled(true);  // Запретить выброс предмета
        }
    }

    // Запретить помещение предмета в сундук, шалкер или другое хранилище
    @SubscribeEvent
    public void onContainerOpen(PlayerContainerEvent.Open event) {
        Player player = event.getEntity();
        for (int i = 0; i < event.getContainer().slots.size(); i++) {
            ItemStack stack = event.getContainer().getSlot(i).getItem();
            if (isRestrictedItem(stack)) {
                // Выбросить предмет в мир
                ItemEntity itemEntity = new ItemEntity(player.level(), player.getX(), player.getY(), player.getZ(), stack);
                player.level().addFreshEntity(itemEntity);
                event.getContainer().getSlot(i).set(ItemStack.EMPTY);  // Удалить предмет из контейнера
            }
        }
    }

    // Запретить перемещение в воронку
    @SubscribeEvent
    public void onHopperTransfer(PlayerInteractEvent.RightClickBlock event) {
        if (event.getLevel().getBlockEntity(event.getPos()) instanceof HopperBlockEntity hopper) {
            for (int i = 0; i < hopper.getContainerSize(); i++) {
                ItemStack stack = hopper.getItem(i);
                if (isRestrictedItem(stack)) {
                    hopper.removeItem(i, stack.getCount());  // Удалить предмет из воронки
                    event.getLevel().addFreshEntity(new ItemEntity(event.getLevel(), hopper.getBlockPos().getX(), hopper.getBlockPos().getY(), hopper.getBlockPos().getZ(), stack));  // Выбросить предмет в мир
                }
            }
        }
    }
}
