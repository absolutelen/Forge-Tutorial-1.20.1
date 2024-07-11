package net.ron.tutorialmod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ron.tutorialmod.TutorialMod;
import net.ron.tutorialmod.item.custom.MetalDetectoritem;
import net.ron.tutorialmod.item.custom.ModArmorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACORN = ITEMS.register("acorn",
            () -> new Item(new Item.Properties().food(ModFoods.ACORN)));
    public static final RegistryObject<Item> CRACKED_DIAMOND_ACORN = ITEMS.register("cracked_diamond_acorn",
            () -> new Item(new Item.Properties().food(ModFoods.CRACKED_DIAMOND_ACORN)));
    public static final RegistryObject<Item> DIAMOND_ACORN = ITEMS.register("diamond_acorn",
            () -> new Item(new Item.Properties().food(ModFoods.DIAMOND_ACORN)));

    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static  final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectoritem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> TEST_SWORD = ITEMS.register("test_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 10, 2, new Item.Properties()));
    public static final RegistryObject<Item> TEST_AXE = ITEMS.register("test_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 12, 1, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE,ArmorItem.Type.HELMET, new Item.Properties()));
   public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE,ArmorItem.Type.CHESTPLATE, new Item.Properties()));
   public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE,ArmorItem.Type.LEGGINGS, new Item.Properties()));
   public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE,ArmorItem.Type.BOOTS, new Item.Properties()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
