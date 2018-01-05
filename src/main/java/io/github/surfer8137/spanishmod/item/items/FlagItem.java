package io.github.surfer8137.spanishmod.item.items;

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
public class FlagItem extends Item {
    public static final String NAME = "flag";
    public static final int MAX_STACK_SIZE = 1;
    public static final String USE_MESSAGE = "GORA EUSKADI";
    public static final String ITEM_TOOLTIP = "Vasque flag";
    public static final EnumRarity ITEM_RARITY = EnumRarity.COMMON;

    public FlagItem() {
        setUnlocalizedName(NAME);
        setCreativeTab(SpanishMod.spanishCreativeTab);
        setRegistryName(SpanishMod.MOD_ID + ":" + NAME);
        setMaxStackSize(MAX_STACK_SIZE);
    }

    /**
     * When the item is used, it sends a message to the chat
     */
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        Minecraft.getMinecraft().player.sendChatMessage(USE_MESSAGE);

        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    /**
     * Extra information of the item
     */
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(ITEM_TOOLTIP);

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
