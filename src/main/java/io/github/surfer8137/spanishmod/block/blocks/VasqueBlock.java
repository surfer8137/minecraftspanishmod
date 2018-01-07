package io.github.surfer8137.spanishmod.block.blocks;

import io.github.surfer8137.spanishmod.SpanishMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by Angel on 06/01/2018.
 */
public class VasqueBlock extends Block {
    public static final PropertyEnum<EnumFacing> FACING = PropertyEnum.<EnumFacing>create("facing", EnumFacing.class);

    public VasqueBlock(Material materialIn, String name) {
        super(materialIn);
        setUnlocalizedName(name);
        setCreativeTab(SpanishMod.spanishCreativeTab);
        setHardness(1.0f);
        setResistance(10);
        setSoundType(SoundType.METAL);
        setRegistryName(SpanishMod.MOD_ID + ":" + name);
        setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing enumfacing = EnumFacing.getFront(meta);

        return this.getDefaultState().withProperty(FACING, enumfacing);
    }

    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
        worldIn.destroyBlock(pos, true);
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing) state.getValue(FACING)).getIndex();
    }

    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        //If there is no block down
        if (worldIn.isAirBlock(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()))) {
            worldIn.destroyBlock(pos, true);
        }
        if (!worldIn.isAirBlock(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()))) {
            worldIn.destroyBlock(pos, true);
        }
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if (pos.getY() - 1 == fromPos.getY()) {
            worldIn.destroyBlock(pos, true);
        }
        if (pos.getY() + 1 == fromPos.getY()) {
            worldIn.destroyBlock(pos, true);
        }
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        EnumFacing enumfacing = EnumFacing.getFront(getMetaFromState(worldIn.getBlockState(pos)));

        if (enumfacing == EnumFacing.DOWN || enumfacing == EnumFacing.UP) {
            enumfacing = EnumFacing.NORTH;
        }

        if (enumfacing == EnumFacing.NORTH) {
            enumfacing = EnumFacing.EAST;
        } else if (enumfacing == EnumFacing.EAST) {
            enumfacing = EnumFacing.SOUTH;
        } else if (enumfacing == EnumFacing.SOUTH) {
            enumfacing = EnumFacing.WEST;
        } else if (enumfacing == EnumFacing.WEST) {
            enumfacing = EnumFacing.NORTH;
        }

        worldIn.setBlockState(pos, getDefaultState().withProperty(FACING, enumfacing));
        return true;
    }

    @Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        EnumFacing enumfacing = EnumFacing.getFront(getMetaFromState(worldIn.getBlockState(pos)));

        if (enumfacing == EnumFacing.DOWN || enumfacing == EnumFacing.UP) {
            enumfacing = EnumFacing.NORTH;
        }

        if (enumfacing == EnumFacing.NORTH) {
            enumfacing = EnumFacing.EAST;
        } else if (enumfacing == EnumFacing.EAST) {
            enumfacing = EnumFacing.SOUTH;
        } else if (enumfacing == EnumFacing.SOUTH) {
            enumfacing = EnumFacing.WEST;
        } else if (enumfacing == EnumFacing.WEST) {
            enumfacing = EnumFacing.NORTH;
        }

        worldIn.setBlockState(pos, getDefaultState().withProperty(FACING, enumfacing));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }
}
