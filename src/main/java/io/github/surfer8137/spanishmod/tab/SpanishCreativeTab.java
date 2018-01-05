package io.github.surfer8137.spanishmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Angel on 04/01/2018.
 */
public class SpanishCreativeTab extends CreativeTabs {

    public SpanishCreativeTab(int index, String label) {
        super(index, label);
    }

    /**
     * Defines the icon of the creative mode inventory tab for the mod
     * @return
     */
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.EGG);
    }

}
