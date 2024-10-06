package net.rbweex.icerainclanmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rbweex.icerainclanmod.IceRainClanMod;

import java.util.HashMap;
import java.util.Map;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IceRainClanMod.MOD_ID);

    public static final RegistryObject<Item> APPLE_WITH_SNAKE = ITEMS.register("apple_with_snake",
            () -> new Item(new Item.Properties().food(Foods.GOLDEN_APPLE)));
    public static final RegistryObject<Item> EXPERIENCE_ORB = ITEMS.register("experience_orb",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), true));

    // STORYLINE
    public static final RegistryObject<Item> FROZEN_NOTE = ITEMS.register("frozen_note",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), false));
    public static final RegistryObject<Item> TORN_NOTE = ITEMS.register("torn_note",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), false));
    public static final RegistryObject<Item> TATTERED_NOTE = ITEMS.register("tattered_note",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), false));
    public static final RegistryObject<Item> TATTERED_PIECE_OF_PAPER = ITEMS.register("tattered_piece_of_paper",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), false));
    public static final RegistryObject<Item> FORGOTTEN_BUTTERFLY_KNIFE = ITEMS.register("forgotten_butterfly_knife",
            () -> new ModSwordItem(Tiers.DIAMOND, 3, -2, new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).fireResistant().durability(0), true));
    public static final RegistryObject<Item> EFFECT_OF_COOLNESS = ITEMS.register("effect_of_coolness",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), false));
    public static final RegistryObject<Item> EFFECT_OF_COOLNESS_OFF = ITEMS.register("effect_of_coolness_off",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), false));

    // GEMS
    public static final RegistryObject<Item> CHAROITE = ITEMS.register("charoite",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), true));
    public static final RegistryObject<Item> EUCLASE = ITEMS.register("euclase",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), true));
    public static final RegistryObject<Item> MOLDAVITE = ITEMS.register("moldavite",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), true));
    public static final RegistryObject<Item> PYROPE = ITEMS.register("pyrope",
            () -> new ModItem(new Item.Properties().rarity(Rarity.RARE), true));

    // CURIOUS ITEMS
    // RING
    public static final RegistryObject<Item> SYMBOL_OF_SPEED = ITEMS.register("symbol_of_speed",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(
                    "generic.movement_speed",
                    0.25f,
                    AttributeModifier.Operation.MULTIPLY_BASE
            ));

            return new CurioModItem(
                new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                true,
                true,
                modifiers
            );
        }
    );

    // HAND
    public static final RegistryObject<Item> BLADE_OF_JUSTICE = ITEMS.register("blade_of_justice",
            () -> {
                Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
                modifiers.put(Attributes.LUCK, new AttributeModifier("generic.luck", 1, AttributeModifier.Operation.MULTIPLY_TOTAL));

                return new CurioModItem(
                        new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                        false,
                        true,
                        modifiers
                );
            });

    public static final RegistryObject<Item> FRAGMENT_OF_SOUL_STONE = ITEMS.register("fragment_of_soul_stone",
            () -> {
                Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
                modifiers.put(Attributes.MAX_HEALTH, new AttributeModifier("generic.max_health", 2, AttributeModifier.Operation.ADDITION));

                return new CurioModItem(
                        new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                        false,
                        true,
                        modifiers
                );
            });

    public static final RegistryObject<Item> GIFT_OF_COLD_WATERS = ITEMS.register("gift_of_cold_waters",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.LUCK, new AttributeModifier("generic.luck", 0.5, AttributeModifier.Operation.MULTIPLY_TOTAL));
            modifiers.put(Attributes.ATTACK_SPEED, new AttributeModifier("generic.attack_speed", -0.25, AttributeModifier.Operation.MULTIPLY_TOTAL));
            return new CurioModItem(
                    new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1).food(new FoodProperties.Builder().nutrition(6).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 1), 1.0F).effect(new MobEffectInstance(MobEffects.LUCK, 2400, 0), 1.0F).alwaysEat().build()),
                    true,
                    true,
                    modifiers
            );
        });

    public static final RegistryObject<Item> WOLFS_CLAW = ITEMS.register("wolfs_claw",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.ATTACK_SPEED, new AttributeModifier("generic.attack_speed", 0.10, AttributeModifier.Operation.MULTIPLY_BASE));
            return new CurioModItem(
                    new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                    false,
                    false,
                    modifiers
            );
        });
    public static final RegistryObject<Item> TROPHY_OF_BLOODTHIRSTY_BEAST = ITEMS.register("trophy_of_bloodthirsty_beast",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.ATTACK_SPEED, new AttributeModifier("generic.attack_speed", 0.25, AttributeModifier.Operation.MULTIPLY_BASE));

            return new CurioModItem(
                    new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                    false,
                    true,
                    modifiers
            );
        });

    public static final RegistryObject<Item> CROSS = ITEMS.register("cross",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.ARMOR, new AttributeModifier("generic.armor", 1, AttributeModifier.Operation.ADDITION));
            return new CurioModItem(
                    new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                    false,
                    false,
                    modifiers
            );
        });
    public static final RegistryObject<Item> SAVIOR_OF_GOD = ITEMS.register("savior_of_god",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.ARMOR, new AttributeModifier("generic.armor", 2, AttributeModifier.Operation.ADDITION));
            modifiers.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier("generic.armor_toughness", 1, AttributeModifier.Operation.ADDITION));

            return new CurioModItem(
                    new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                    true,
                    true,
                    modifiers
            );
        });

    public static final RegistryObject<Item> GOD_BLESSED_QATAR = ITEMS.register("god_blessed_qatar",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.ATTACK_DAMAGE, new AttributeModifier("generic.attack_damage", 0.25, AttributeModifier.Operation.MULTIPLY_BASE));

            return new CurioModItem(
                    new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                    false,
                    true,
                    modifiers
            );
        });

    public static final RegistryObject<Item> FORGOTTEN_SHIELD = ITEMS.register("forgotten_shield",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier("generic.knockback_resistance", 1, AttributeModifier.Operation.ADDITION));

            return new CurioModItem(
                    new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                    false,
                    true,
                    modifiers
            );
        });

    // HEAD
    public static final RegistryObject<Item> OLEG = ITEMS.register("oleg",
            () -> {
                Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
                modifiers.put(Attributes.LUCK, new AttributeModifier("generic.luck", 1, AttributeModifier.Operation.MULTIPLY_TOTAL));

                return new CurioModItem(
                        new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                        false,
                        true,
                        modifiers
                );
            });

    public static final RegistryObject<Item> MANTLE_OF_WHITE_DRAGON = ITEMS.register("mantle_of_white_dragon",
            () -> {
                Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
                modifiers.put(Attributes.ARMOR, new AttributeModifier("generic.armor", 2, AttributeModifier.Operation.ADDITION));
                modifiers.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier("generic.armor_toughness", 1, AttributeModifier.Operation.ADDITION));

                return new CurioModItem(
                        new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                        false,
                        true,
                        modifiers
                );
            });

    public static final RegistryObject<Item> TIARA = ITEMS.register("tiara",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.MAX_HEALTH, new AttributeModifier("generic.max_health", 2, AttributeModifier.Operation.ADDITION));
            return new CurioModItem(
                    new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                    false,
                    false,
                    modifiers
            );
        });
    public static final RegistryObject<Item> ATTRACTIVE_TIARA = ITEMS.register("attractive_tiara",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.MAX_HEALTH, new AttributeModifier("generic.max_health", 4, AttributeModifier.Operation.ADDITION));
            return new CurioModItem(
                new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                true,
                true,
                modifiers
            );
        });

    public static final RegistryObject<Item> YUMESILIN_TEAR = ITEMS.register("yumesilin_tear",
        () -> {
            Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
            modifiers.put(Attributes.ARMOR, new AttributeModifier("generic.armor", 2, AttributeModifier.Operation.ADDITION));
            modifiers.put(Attributes.LUCK, new AttributeModifier("generic.luck", 0.25, AttributeModifier.Operation.MULTIPLY_BASE));
            return new CurioModItem(
                new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                false,
                true,
                modifiers
            );
        });

    public static final RegistryObject<Item> SKULL_OF_RUNIC_RAVEN = ITEMS.register("skull_of_runic_raven",
            () -> {
                Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
                modifiers.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier("generic.attack_knockback", 0.25, AttributeModifier.Operation.MULTIPLY_TOTAL));
                return new CurioModItem(
                        new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                        false,
                        true,
                        modifiers
                );
            });

    // BRACELET
    public static final RegistryObject<Item> FORGOTTEN_DECLARATION_OF_LOVE = ITEMS.register("forgotten_declaration_of_love",
            () -> {
                Map<Attribute, AttributeModifier> modifiers = new HashMap<>();
                modifiers.put(Attributes.MAX_HEALTH, new AttributeModifier("generic.max_health", 2, AttributeModifier.Operation.ADDITION));
                return new CurioModItem(
                        new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1),
                        false,
                        true,
                        modifiers
                );
            });

    // EVENTS
    public static final RegistryObject<Item> EVENT_BAG = ITEMS.register("event_bag",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_BOOK = ITEMS.register("event_book",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_CAMERA = ITEMS.register("event_camera",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_COIN = ITEMS.register("event_coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_KEY = ITEMS.register("event_key",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_MUSIC_BOX = ITEMS.register("event_music_box",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_POTION = ITEMS.register("event_potion",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_RACE = ITEMS.register("event_race",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_RICH = ITEMS.register("event_rich",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_ROMANIA = ITEMS.register("event_romania",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_TIMER = ITEMS.register("event_timer",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EVENT_BOARD = ITEMS.register("event_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_GIFT = ITEMS.register("event_gift",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_GLASSES = ITEMS.register("event_glasses",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_KITCHEN = ITEMS.register("event_kitchen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_LIST = ITEMS.register("event_list",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_LUCK = ITEMS.register("event_luck",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_MELON = ITEMS.register("event_melon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_QUEST = ITEMS.register("event_quest",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_ROLLING_PIN = ITEMS.register("event_rolling_pin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_SETTINGS = ITEMS.register("event_settings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_SUN = ITEMS.register("event_sun",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_TNT = ITEMS.register("event_tnt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVENT_GAME_CUBE = ITEMS.register("event_game_cube",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHECK_MY_PRICE = ITEMS.register("check_my_price",
            () -> new ModItem(new Item.Properties(), false));

    // ICONS
    public static final RegistryObject<Item> ICON_ACCEPT = ITEMS.register("icon_accept",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ICON_ACCEPT_BLUE = ITEMS.register("icon_accept_blue",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ICON_MEDAL = ITEMS.register("icon_medal",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ICON_QUESTION = ITEMS.register("icon_question",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ICON_WARNING = ITEMS.register("icon_warning",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> QUEST_BOOK = ITEMS.register("quest_book",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
