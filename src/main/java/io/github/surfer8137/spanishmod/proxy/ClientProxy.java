package io.github.surfer8137.spanishmod.proxy;

import io.github.surfer8137.spanishmod.SpanishMod;
import io.github.surfer8137.spanishmod.item.ModItems;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Angel on 04/01/2018.
 */
public class ClientProxy extends Proxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(SpanishMod.MOD_ID);
        ModItems.registerRenders();
    }

    @Override
    public void init(FMLInitializationEvent event) {
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
    }
}
