package io.github.surfer8137.spanishmod.proxy;

import io.github.surfer8137.spanishmod.SpanishMod;
import io.github.surfer8137.spanishmod.item.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;

/**
 * Created by Angel on 04/01/2018.
 */
public class ClientProxy extends Proxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.registerRenders();

        OBJLoader.INSTANCE.addDomain(SpanishMod.MOD_ID);
        registerModel(ModItems.flagItem);
    }

    public void registerModel(Item item){
        ModelLoader.setCustomModelResourceLocation(
                item,
                0,
                new ModelResourceLocation(
                        item.getRegistryName(),
                        "inventory"
                )
        );
    }

    @Override
    public void init(FMLInitializationEvent event) {
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
    }
}
