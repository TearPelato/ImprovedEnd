package net.tier1234.improve_the_end;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Constants.MOD_ID, value = Dist.CLIENT)
public class ImprovedEndClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

    }
}
