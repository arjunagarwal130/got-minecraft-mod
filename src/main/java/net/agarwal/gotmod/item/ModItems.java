package net.agarwal.gotmod.item;

import net.agarwal.gotmod.GOTMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GOTMod.MOD_ID);

    public static final DeferredItem<Item> DRAGONGLASS = ITEMS.registerSimpleItem("dragonglass");
    public static final DeferredItem<Item> DRAGONGLASS_SHARD = ITEMS.registerSimpleItem("dragonglass_shard");

    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem("steel_ingot");
    public static final DeferredItem<Item> VALYRIAN_STEEL_INGOT = ITEMS.registerSimpleItem("valyrian_steel_ingot");


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
