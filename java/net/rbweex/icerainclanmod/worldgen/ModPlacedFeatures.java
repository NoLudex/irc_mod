package net.rbweex.icerainclanmod.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.rbweex.icerainclanmod.IceRainClanMod;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> DEEPSLATE_CHAROITE_ORE_LARGE_KEY = registerKey("deepslate_charoite_ore_large_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_CHAROITE_ORE_SMALL_KEY = registerKey("deepslate_charoite_ore_small_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

//        register(context, DEEPSLATE_CHAROITE_ORE_LARGE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CHAROITE_ORE_LARGE_KEY),
//                ModOrePlacement.rareOrePlacement(6,
//                        HeightRangePlacement.uniform(VerticalAnchor.absolute(8), VerticalAnchor.absolute(24))));
        register(context, DEEPSLATE_CHAROITE_ORE_LARGE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CHAROITE_ORE_LARGE_KEY),
                ModOrePlacement.rareOrePlacement(9,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-56), VerticalAnchor.absolute(-24))));

        register(context, DEEPSLATE_CHAROITE_ORE_SMALL_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CHAROITE_ORE_SMALL_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-56), VerticalAnchor.belowTop(-24))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(IceRainClanMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    public static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
