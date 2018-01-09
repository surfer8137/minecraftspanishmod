package io.github.surfer8137.spanishmod.block.blocks.flag.flags;

import io.github.surfer8137.spanishmod.SpanishMod;
import io.github.surfer8137.spanishmod.block.blocks.flag.BlockFlag;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by Angel on 06/01/2018.
 */
public class BlockCataloniaFlag extends BlockFlag {
    private static final PropertyEnum<EnumFacing> FACING = PropertyEnum.<EnumFacing>create("facing", EnumFacing.class);
    public static final String FLAG_NAME = "cataloniaflag";

    public BlockCataloniaFlag() {
        super(FLAG_NAME);
    }
}
