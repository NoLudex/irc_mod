package net.rbweex.icerainclanmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rbweex.icerainclanmod.IceRainClanMod;
import net.rbweex.icerainclanmod.entity.custom.PhilipEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, IceRainClanMod.MOD_ID);

    public static final RegistryObject<EntityType<PhilipEntity>> PHILIP =
            ENTITY_TYPES.register("philip", () -> EntityType.Builder.of(PhilipEntity::new, MobCategory.CREATURE)
                    .sized(1f, 3f).build("philip"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
