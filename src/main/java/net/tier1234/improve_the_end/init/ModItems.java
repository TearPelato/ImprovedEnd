package net.tier1234.improve_the_end.init;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.improve_the_end.Constants;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);


    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }
}
