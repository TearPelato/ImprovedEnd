package net.tier1234.improve_the_end.init;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.tier1234.improve_the_end.creative_tab.bundled.BundledTabs;

import java.util.ArrayList;
import java.util.List;

/**
 * BundledTabs from VanillaBackport, used with BlackGear's permission.
 * @author BlackGear
 */
public class ModBundledTabs {
    private static final List<BundledTabs> FILTERS = new ArrayList<>();

    public static final BundledTabs JACARANDA_FIELDS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.jacaranda_fields"))
                    .icon(new ItemStack(ModBlocks.JACARANDA_LOG.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.JACARANDA_LOG.get());
                        output.accept(ModBlocks.STRIPPED_JACARANDA_LOG.get());
                        output.accept(ModBlocks.JACARANDA_PLANKS.get());



                    })
                    .build()
    );

    public static BundledTabs register(BundledTabs builder) {
        FILTERS.add(builder);
        return builder;
    }

    public static List<BundledTabs> getFilters() {
        return FILTERS;
    }

}
