package io.github.surfer8137.spanishmod.block;

import io.github.surfer8137.spanishmod.SpanishMod;
import io.github.surfer8137.spanishmod.item.ItemHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Angel on 05/01/2018.
 */
public class BlockHelper {
    /**
     * Registers a block render
     *
     * @param block item to register
     */
    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);

        ItemHelper.registerRender(item);
        ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition() {
            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return new ModelResourceLocation(SpanishMod.MOD_ID, block.getUnlocalizedName());
            }
        });
    }
}
