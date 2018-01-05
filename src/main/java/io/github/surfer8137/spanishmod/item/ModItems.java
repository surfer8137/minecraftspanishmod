package io.github.surfer8137.spanishmod.item;

import io.github.surfer8137.spanishmod.item.items.FlagItem;
import io.github.surfer8137.spanishmod.item.items.PatxiFistItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.List;

/**
 * Created by Angel on 04/01/2018.
 */
public class ModItems {
    private static Item flagItem;
    private static Item patxiFistItem;
    private static List<Item> modItems;

    /**
     * Creation of the items and the list that contains every mod item
     */
    static {
        flagItem = new FlagItem();
        patxiFistItem = new PatxiFistItem(EnumHelper.addToolMaterial(
                "vasque",
                0,
                5,
                10.0f,
                10.0f,
                30
        ));

        modItems.add(flagItem);
        modItems.add(patxiFistItem);
    }

    /**
     * Method called on preInit
     */
    public static void preInit() {
        registerItems();
    }

    /**
     * Register renders of items in Minecraft
     */
    public static void registerRenders() {
        for(Item item : modItems)
            ItemHelper.registerRender(item);
    }

    /**
     * Register items in Minecraft
     */
    private static void registerItems() {
        for(Item item : modItems)
            ForgeRegistries.ITEMS.register(item);
    }
}
