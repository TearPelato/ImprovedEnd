package net.tier1234.improve_the_end.init;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.improve_the_end.Constants;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
