package io.github.surfer8137.spanishmod.item.items;

import io.github.surfer8137.spanishmod.SpanishMod;
import io.github.surfer8137.spanishmod.item.ItemHelper;
import io.github.surfer8137.spanishmod.utils.ModHelper;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.*;

/**
 * Created by Angel on 04/01/2018.
 */
public class PatxiFistItem extends ItemSword {
    private static final String NAME = "patxifist";
    private static final int ITEM_STACK_SIZE = 1;
    private static final int ITEM_MAX_DAMAGE = 5;
    public static final String HIT_MESSAGE = "POR EL PODER DE PATXI";

    public PatxiFistItem(ToolMaterial material) {
        super(material);
        setUnlocalizedName(NAME);
        setCreativeTab(SpanishMod.spanishCreativeTab);
        setMaxStackSize(ITEM_STACK_SIZE);
        setMaxDamage(ITEM_MAX_DAMAGE);
        setRegistryName(SpanishMod.MOD_ID + ":" + NAME);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        ModHelper.throwLightningBoltAtEntity(target);
        ModHelper.sendMessageFromLocalPlayer(HIT_MESSAGE);
        ItemHelper.damageItem(stack);

        if(ItemHelper.isItemStackToBeDestroyed(stack)) {
            ItemHelper.destroyItemStack(stack);
        }

        return true;
    }
}
