package net.tier1234.improve_the_end.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.improve_the_end.Constants;

import java.util.function.Supplier;

public class ModCreativeTab {
public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

public static final Supplier<CreativeModeTab> MAIN_TAB = CREATIVE_TAB.register("bismuth_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.JACARANDA_LOG.get()))
                    .title(Component.translatable("itemGroup."+ Constants.MOD_ID))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.JACARANDA_LOG.get());
                        output.accept(ModBlocks.STRIPPED_JACARANDA_LOG.get());
                        output.accept(ModBlocks.JACARANDA_PLANKS.get());
                    }).build());



public static void init(IEventBus bus) {
    CREATIVE_TAB.register(bus);
 }

}
