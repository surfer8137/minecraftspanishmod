package io.github.surfer8137.spanishmod.item;

import io.github.surfer8137.spanishmod.item.items.PatxiFistItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 04/01/2018.
 */
public class ModItems {
    public static Item patxiFistItem;
    private static List<Item> modItems;

    /**
     * Creation of the items and the list that contains every mod item
     */
    static {
        patxiFistItem = new PatxiFistItem(EnumHelper.addToolMaterial(
                "basque",
                0,
                5,
                10.0f,
                10.0f,
                30
        ));

        modItems = new ArrayList<>();
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
