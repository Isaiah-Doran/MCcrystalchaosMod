package net.isaiah.crystalchaosmod.item;

import net.isaiah.crystalchaosmod.CrystalChaosMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrystalChaosMod.MOD_ID);

    public static final RegistryObject<Item> BLUE_MANA_CRYSTAL = ITEMS.register("bluemanacrystal",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

}
