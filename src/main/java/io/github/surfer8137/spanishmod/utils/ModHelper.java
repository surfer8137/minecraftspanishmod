package io.github.surfer8137.spanishmod.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Angel on 05/01/2018.
 */
public class ModHelper {

    /**
     * Sends a chat message using the local player
     * @param message text to send
     */
    public static void sendMessageFromLocalPlayer(String message) {
        Minecraft.getMinecraft().player.sendChatMessage(message);
    }

    /**
     * Throws a lightning bolt at an entity position. It doesn't damage anything, only visual purpose
     * @param target
     */
    public static void throwLightningBoltAtEntity(EntityLivingBase target) {
        target.world.addWeatherEffect(new EntityLightningBolt(
                target.world,
                target.getPosition().getX(),
                target.getPosition().getY(),
                target.getPosition().getZ(),
                true)
        );
    }
}
