package io.github.surfer8137.spanishmod.block.blocks.flag.flags;

import io.github.surfer8137.spanishmod.block.blocks.flag.BlockFlag;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.util.EnumFacing;

/**
 * Created by Angel on 06/01/2018.
 */
public class BlockBaseFlag extends BlockFlag {
    private static final PropertyEnum<EnumFacing> FACING = PropertyEnum.<EnumFacing>create("facing", EnumFacing.class);
    public static final String FLAG_NAME = "baseflag";

    public BlockBaseFlag() {
        super(FLAG_NAME);
    }
}
