package io.github.surfer8137.spanishmod.item.items.flag;

import io.github.surfer8137.spanishmod.SpanishMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Angel on 04/01/2018.
 */
public abstract class FlagItem extends Item {
    public static final int MAX_STACK_SIZE = 1;
    public static final EnumRarity ITEM_RARITY = EnumRarity.COMMON;

    private String nationMessage;
    private String itemTooltip;

    public FlagItem(String unlocalizedName, String message, String tooltip) {
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(SpanishMod.spanishCreativeTab);
        nationMessage = message;
        itemTooltip = tooltip;
        setRegistryName(SpanishMod.MOD_ID + ":" + unlocalizedName);
        setMaxStackSize(MAX_STACK_SIZE);
    }

    /**
     * When the item is used, it sends a message to the chat
     */
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        Minecraft.getMinecraft().player.sendChatMessage(nationMessage);

        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    /**
     * Extra information of the item
     */
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(itemTooltip);

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    /**
     * Rarity of the item
     * @return Common rarity
     */
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return ITEM_RARITY;
    }
}
