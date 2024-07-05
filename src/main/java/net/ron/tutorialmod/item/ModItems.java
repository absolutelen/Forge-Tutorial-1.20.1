package net.ron.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ron.tutorialmod.TutorialMod;
import net.ron.tutorialmod.item.custom.MetalDetectoritem;

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


    public static  final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectoritem(new Item.Properties().durability(100)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
