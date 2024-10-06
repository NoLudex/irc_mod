package net.rbweex.icerainclanmod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.rbweex.icerainclanmod.block.ModBlocks;
import net.rbweex.icerainclanmod.command.CommandReplaceItem;
import net.rbweex.icerainclanmod.item.*;
import org.slf4j.Logger;

import java.util.HashSet;
import java.util.Set;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(IceRainClanMod.MOD_ID)
public class IceRainClanMod
{
    public static final String MOD_ID = "irc_mod";
    public static final Logger LOGGER = LogUtils.getLogger();

    private static RestrictedItemHandler restrictedItemHandler;

    private static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, MOD_ID);

    public IceRainClanMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTable.register(modEventBus);
        CurioEventHandler.register();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    @SubscribeEvent
    public void onRegisterCommands(RegisterCommandsEvent event) {
        CommandReplaceItem.register(event.getDispatcher(), event.getBuildContext());
    }


    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Запрещенные предметы
        // Set<Item> restrictedItems = new HashSet<>();
        // restrictedItems.add(ModItems.EFFECT_OF_COOLNESS.get());
        // restrictedItems.add(ModItems.EFFECT_OF_COOLNESS_OFF.get());
        // restrictedItemHandler = new RestrictedItemHandler(restrictedItems);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}

