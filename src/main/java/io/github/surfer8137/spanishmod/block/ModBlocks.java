package io.github.surfer8137.spanishmod.block;

import io.github.surfer8137.spanishmod.block.blocks.VasqueBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 04/01/2018.
 */
public class ModBlocks {
    public static final Block vasqueBlock;
    private static List<Block> modBlocks;

    /**
     * Creation of the blocks and the list that contains every mod block
     */
    static {
        vasqueBlock = new VasqueBlock(Material.GLASS, "vasqueflag");

        modBlocks = new ArrayList<>();
        modBlocks.add(vasqueBlock);
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
