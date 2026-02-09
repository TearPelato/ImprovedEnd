package net.tier1234.improve_the_end.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.improve_the_end.Constants;
import net.tier1234.improve_the_end.creative_tab.bundled.BundledTabs;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class ModCreativeTab {
public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

public static final Supplier<CreativeModeTab> MAIN_TAB = CREATIVE_TAB.register("bismuth_items_tab",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP,1)
                    .withSearchBar()
                    .icon(() -> new ItemStack(ModBlocks.JACARANDA_LOG.get()))
                    .title(Component.translatable("itemGroup."+ Constants.MOD_ID))
                    .displayItems((parameters, output) -> {
                        List<BundledTabs> filters = ModBundledTabs.getFilters();
                        Collections.reverse(filters);
                        filters.stream()
                                .flatMap(filter -> filter.getDisplayItems().stream())
                                .forEach(output::accept);
                    }).build());



public static void init(IEventBus bus) {
    CREATIVE_TAB.register(bus);
 }

}
