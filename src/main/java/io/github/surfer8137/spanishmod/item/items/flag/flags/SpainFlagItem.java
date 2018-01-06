package io.github.surfer8137.spanishmod.item.items.flag.flags;

import io.github.surfer8137.spanishmod.SpanishMod;
import io.github.surfer8137.spanishmod.item.items.flag.FlagItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Angel on 04/01/2018.
 */
public class SpainFlagItem extends FlagItem {
    public static final String NAME = "spainflag";
    public static final String USE_MESSAGE = "VIVA ESPAÑA";
    public static final String ITEM_TOOLTIP = "Spanish flag";

    public SpainFlagItem() {
        super(NAME, USE_MESSAGE, ITEM_TOOLTIP);
    }
}
