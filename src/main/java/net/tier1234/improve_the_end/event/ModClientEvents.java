package net.tier1234.improve_the_end.event;

import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.neoforge.client.event.ContainerScreenEvent;
import net.neoforged.neoforge.client.event.ScreenEvent;
import net.tier1234.improve_the_end.Constants;
import net.tier1234.improve_the_end.creative_tab.bundled.BundledTabSelector;

@EventBusSubscriber(modid = Constants.MOD_ID, value = Dist.CLIENT)
public class ModClientEvents {


    @SubscribeEvent
    public static void onPlayerJoinLevel(ClientPlayerNetworkEvent.LoggingIn event) {
        BundledTabSelector.bootstrap();
    }

    @SubscribeEvent
    public static void onContainerInit(ScreenEvent.Init.Post event) {
        if (!(event.getScreen() instanceof CreativeModeInventoryScreen)) return;
        BundledTabSelector.bootstrap().init(event);
    }

    @SubscribeEvent
    public static void onContainerRender(ContainerScreenEvent.Render.Background event) {
        if (!(event.getContainerScreen() instanceof CreativeModeInventoryScreen)) return;
        BundledTabSelector.bootstrap().renderBackground(event);
    }

    @SubscribeEvent
    public static void onContainerClose(ScreenEvent.Closing event) {
        if (!(event.getScreen() instanceof CreativeModeInventoryScreen)) return;
        BundledTabSelector.bootstrap().onClose(event);
    }
}