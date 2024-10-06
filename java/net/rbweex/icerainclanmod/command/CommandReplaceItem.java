package net.rbweex.icerainclanmod.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandBuildContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.item.ItemArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CommandReplaceItem {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext context) {
        dispatcher.register(Commands.literal("replaceitem")
                .requires(source -> source.hasPermission(4))
                .then(Commands.argument("check", ItemArgument.item(context))
                .then(Commands.argument("replace", ItemArgument.item(context))
                .executes(cmdContext -> {
                    Item itemToCheck = ItemArgument.getItem(cmdContext, "check").getItem();
                    Item itemToReplace = ItemArgument.getItem(cmdContext, "replace").getItem();

                    for (ServerPlayer player : cmdContext.getSource().getServer().getPlayerList().getPlayers()) {
                        Inventory inventory = player.getInventory();
                        boolean found = false;

                        for (int i = 0; i < inventory.getContainerSize(); i++) {
                            ItemStack itemStack = inventory.getItem(i);
                            if (itemStack.getItem() == itemToCheck) {
                                inventory.setItem(i, new ItemStack(itemToReplace, itemStack.getCount()));
                                found = true;
                            }
                        }

                        if (found) {
                            player.sendSystemMessage(Component.literal("Предмет " + itemToCheck.getDescriptionId() + " заменен на " + itemToReplace.getDescriptionId()));
                            // cmdContext.getSource().getServer().getPlayerList().broadcastSystemMessage(Component.literal(player.getName().getString() + " получил " + itemToReplace), false);
                        }
                    }

                    return 1;
                }))));
    }

    @SubscribeEvent
    public static void onRegisterCommands(RegisterCommandsEvent event) {
        CommandReplaceItem.register(event.getDispatcher(), event.getBuildContext());
    }
}
