package io.github.surfer8137.spanishmod;

import io.github.surfer8137.spanishmod.block.ModBlocks;
import io.github.surfer8137.spanishmod.item.ModItems;
import io.github.surfer8137.spanishmod.proxy.Proxy;
import io.github.surfer8137.spanishmod.tab.SpanishCreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SpanishMod.MOD_ID, version = SpanishMod.VERSION, name = SpanishMod.NAME)
public class SpanishMod {
    public static final String MOD_ID = "spanishmod";
    public static final String VERSION = "0.1";
    public static final String NAME = "Spanish Mod";
    public static final String TAB_NAME = "tabSpanish";
    public static final String CLIENT_PROXY_PATH = "io.github.surfer8137.spanishmod.proxy.ClientProxy";
    public static final String SERVER_PROXY_PATH = "io.github.surfer8137.spanishmod.proxy.Proxy";

    @SidedProxy(clientSide = CLIENT_PROXY_PATH, serverSide = SERVER_PROXY_PATH)
    public static Proxy proxy;
    @Mod.Instance
    public static SpanishMod instance;
    public static SpanishCreativeTab spanishCreativeTab;

    /**
     * Method called by the preInit event
     * @param event
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Creation of the inventory tab for the creative mode to access the mod items.
        spanishCreativeTab = new SpanishCreativeTab(CreativeTabs.getNextID(), TAB_NAME);
        //Initialization of the mod items
        ModItems.preInit();
        //Initialization of mod blocks
        ModBlocks.preInit();
        //Initialization of the client proxy
        proxy.preInit(event);
    }

    /**
     * Method called by the preInit event
     * @param event
     */
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    /**
     * Method called by the postInit event
     * @param event
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
