package net.ron.tutorialmod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ron.tutorialmod.TutorialMod;
import net.ron.tutorialmod.item.ModItems;

import java.util.List;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event){
        if(event.getType() == VillagerProfession.FARMER){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader,pRandom)->new MerchantOffer(
                    new ItemStack(Items.EMERALD,2),
                    new ItemStack(ModItems.ACORN.get(),12),
                    10,8,0.02f));
            trades.get(2).add((pTrader,pRandom)->new MerchantOffer(
                    new ItemStack(Items.EMERALD,10),
                    new ItemStack(ModItems.CRACKED_DIAMOND_ACORN.get(),2),
                    3,8,0.035f));
            trades.get(5).add((pTrader,pRandom)->new MerchantOffer(
                    new ItemStack(Items.EMERALD,64),
                    new ItemStack(ModItems.DIAMOND_ACORN.get(),1),
                    2,8,0.2f));

        }
    }

}
