package net.tier1234.improve_the_end.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.improve_the_end.Constants;
import net.tier1234.improve_the_end.block.custom.ModFlammablePillar;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);

    public static final DeferredBlock<ModFlammablePillar> JACARANDA_LOG = registerBlock("jacaranda_log",
            ()-> new ModFlammablePillar(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<ModFlammablePillar> STRIPPED_JACARANDA_LOG = registerBlock("stripped_jacaranda_log",
            ()-> new ModFlammablePillar(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> JACARANDA_PLANKS = registerBlock("jacaranda_planks",
            ()-> new Block(BlockBehaviour.Properties.of().ofFullCopy(Blocks.OAK_PLANKS)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
