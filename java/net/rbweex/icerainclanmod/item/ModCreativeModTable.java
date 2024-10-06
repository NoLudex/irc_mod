package net.rbweex.icerainclanmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rbweex.icerainclanmod.IceRainClanMod;
import net.rbweex.icerainclanmod.block.ModBlocks;

public class ModCreativeModTable
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IceRainClanMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ICR_MOD_TAB_ICONS = CREATIVE_MODE_TABS.register("irc_mod_tab_icons",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ICON_WARNING.get()))
                    .title(Component.translatable("creativetab.irc_mod_tab_icons"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // ICONS
                        output.accept(ModItems.ICON_ACCEPT.get());
                        output.accept(ModItems.ICON_ACCEPT_BLUE.get());
                        output.accept(ModItems.ICON_MEDAL.get());
                        output.accept(ModItems.ICON_QUESTION.get());
                        output.accept(ModItems.ICON_WARNING.get());

                        // Event Icons
                        output.accept(ModItems.EVENT_BAG.get());
                        output.accept(ModItems.EVENT_BOOK.get());
                        output.accept(ModItems.EVENT_CAMERA.get());
                        output.accept(ModItems.EVENT_COIN.get());
                        output.accept(ModItems.EVENT_KEY.get());
                        output.accept(ModItems.EVENT_MUSIC_BOX.get());
                        output.accept(ModItems.EVENT_POTION.get());
                        output.accept(ModItems.EVENT_RACE.get());
                        output.accept(ModItems.EVENT_RICH.get());
                        output.accept(ModItems.EVENT_ROMANIA.get());
                        output.accept(ModItems.EVENT_TIMER.get());
                        output.accept(ModItems.EVENT_BOARD.get());
                        output.accept(ModItems.EVENT_GIFT.get());
                        output.accept(ModItems.EVENT_GLASSES.get());
                        output.accept(ModItems.EVENT_KITCHEN.get());
                        output.accept(ModItems.EVENT_LIST.get());
                        output.accept(ModItems.EVENT_LUCK.get());
                        output.accept(ModItems.EVENT_MELON.get());
                        output.accept(ModItems.EVENT_QUEST.get());
                        output.accept(ModItems.EVENT_ROLLING_PIN.get());
                        output.accept(ModItems.EVENT_SETTINGS.get());
                        output.accept(ModItems.EVENT_SUN.get());
                        output.accept(ModItems.EVENT_TNT.get());
                        output.accept(ModItems.EVENT_GAME_CUBE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ICR_MOD_TAB_MAIN = CREATIVE_MODE_TABS.register("irc_mod_tab_main",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SKULL_OF_RUNIC_RAVEN.get()))
                    .title(Component.translatable("creativetab.irc_mod_tab_main"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Ores
                        output.accept(ModBlocks.DEEPSLATE_CHAROITE_ORE.get());

                        // Gem Blocks
                        output.accept(ModBlocks.CHAROITE_BLOCK.get());
                        output.accept(ModBlocks.EUCLASE_BLOCK.get());
                        output.accept(ModBlocks.MOLDAVITE_BLOCK.get());
                        output.accept(ModBlocks.PYROPE_BLOCK.get());

                        // Gems
                        output.accept(ModItems.CHAROITE.get());
                        output.accept(ModItems.EUCLASE.get());
                        output.accept(ModItems.MOLDAVITE.get());
                        output.accept(ModItems.PYROPE.get());

                        // Official Curio
                        output.accept(ModItems.WOLFS_CLAW.get());
                        output.accept(ModItems.TROPHY_OF_BLOODTHIRSTY_BEAST.get());
                        output.accept(ModItems.TIARA.get());
                        output.accept(ModItems.ATTRACTIVE_TIARA.get());
                        output.accept(ModItems.CROSS.get());
                        output.accept(ModItems.SAVIOR_OF_GOD.get());
                        output.accept(ModItems.SYMBOL_OF_SPEED.get());
                        output.accept(ModItems.GOD_BLESSED_QATAR.get());
                        output.accept(ModItems.FORGOTTEN_SHIELD.get());
                        output.accept(ModItems.GIFT_OF_COLD_WATERS.get());
                        // Community Curio
                        output.accept(ModItems.YUMESILIN_TEAR.get());
                        output.accept(ModItems.SKULL_OF_RUNIC_RAVEN.get());
                        output.accept(ModItems.FORGOTTEN_DECLARATION_OF_LOVE.get());
                        output.accept(ModItems.FRAGMENT_OF_SOUL_STONE.get());
                        output.accept(ModItems.BLADE_OF_JUSTICE.get());
                        output.accept(ModItems.MANTLE_OF_WHITE_DRAGON.get());


                        // Storyline
                        output.accept(ModItems.FROZEN_NOTE.get());
                        output.accept(ModItems.TORN_NOTE.get());
                        output.accept(ModItems.TATTERED_NOTE.get());
                        output.accept(ModItems.TATTERED_PIECE_OF_PAPER.get());

                        // Example
//                        output.accept(ModItems.EXPERIENCE_ORB.get());
//                        output.accept(ModItems.APPLE_WITH_SNAKE.get());
//                        output.accept(ModBlocks.ICE_WITH_FRAME.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
