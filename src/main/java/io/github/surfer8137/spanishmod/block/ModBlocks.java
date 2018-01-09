package io.github.surfer8137.spanishmod.block;

import io.github.surfer8137.spanishmod.block.blocks.flag.flags.BlockBasqueFlag;
import io.github.surfer8137.spanishmod.block.blocks.flag.flags.BlockCataloniaFlag;
import io.github.surfer8137.spanishmod.block.blocks.flag.flags.BlockSpainFlag;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 04/01/2018.
 */
public class ModBlocks {
    private static final Block basqueFlagBlock;
    private static final Block spainFlagBlock;
    private static final Block cataloniaFlagBlock;
    private static List<Block> modBlocks;

    /**
     * Creation of the blocks and the list that contains every mod block
     */
    static {
        basqueFlagBlock = new BlockBasqueFlag();
        spainFlagBlock = new BlockSpainFlag();
        cataloniaFlagBlock = new BlockCataloniaFlag();

        modBlocks = new ArrayList<>();
        modBlocks.add(basqueFlagBlock);
        modBlocks.add(cataloniaFlagBlock);
        modBlocks.add(spainFlagBlock);
    }

    /**
     * Method called on preInit
     */
    public static void preInit() {
        registerBlocks();
    }

    /**
     * Register renders of blocks in Minecraft
     */
    public static void registerRenders() {
        for(Block block : modBlocks)
            BlockHelper.registerRender(block);
    }

    /**
     * Register blocks in Minecraft
     */
    private static void registerBlocks() {
        for(Block block : modBlocks) {
            ForgeRegistries.BLOCKS.register(block);

            ItemBlock itemBlock = new ItemBlock(block);
            itemBlock.setRegistryName(block.getRegistryName());
            ForgeRegistries.ITEMS.register(itemBlock);
        }
    }
}
