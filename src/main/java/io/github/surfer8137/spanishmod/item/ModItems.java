package io.github.surfer8137.spanishmod.item;

import io.github.surfer8137.spanishmod.item.items.flag.FlagItem;
import io.github.surfer8137.spanishmod.item.items.PatxiFistItem;
import io.github.surfer8137.spanishmod.item.items.flag.flags.CataloniaFlagItem;
import io.github.surfer8137.spanishmod.item.items.flag.flags.SpainFlagItem;
import io.github.surfer8137.spanishmod.item.items.flag.flags.VasqueFlagItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 04/01/2018.
 */
public class ModItems {
    public static FlagItem spainFlag;
    public static FlagItem cataloniaFlag;
    public static FlagItem vasqueFlag;
    public static Item patxiFistItem;
    private static List<Item> modItems;

    /**
     * Creation of the items and the list that contains every mod item
     */
    static {
        spainFlag = new SpainFlagItem();
        cataloniaFlag = new CataloniaFlagItem();
        //vasqueFlag = new VasqueFlagItem();
        patxiFistItem = new PatxiFistItem(EnumHelper.addToolMaterial(
                "vasque",
                0,
                5,
                10.0f,
                10.0f,
                30
        ));

        modItems = new ArrayList<>();
        modItems.add(spainFlag);
        modItems.add(cataloniaFlag);
        //modItems.add(vasqueFlag);
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
