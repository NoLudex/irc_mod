package net.rbweex.icerainclanmod.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.rbweex.icerainclanmod.IceRainClanMod;
import net.minecraft.data.worldgen.BootstapContext;
import net.rbweex.icerainclanmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
     public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHAROITE_ORE_LARGE_KEY = registerKey("deepslate_charoite_ore_large");
     public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHAROITE_ORE_SMALL_KEY = registerKey("deepslate_charoite_ore_small");

     public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
         RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

         register(context, OVERWORLD_CHAROITE_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables,
                 ModBlocks.DEEPSLATE_CHAROITE_ORE.get().defaultBlockState(), 4));
         register(context, OVERWORLD_CHAROITE_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables,
                 ModBlocks.DEEPSLATE_CHAROITE_ORE.get().defaultBlockState(), 2));
     }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(IceRainClanMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
