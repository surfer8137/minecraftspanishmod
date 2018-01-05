package io.github.surfer8137.spanishmod.item;

import net.minecraft.item.ItemStack;

/**
 * Created by Angel on 05/01/2018.
 */
public class ItemHelper {
    /**
     * It destroys an itemStack
     * @param stack
     */
    public static void destroyItemStack(ItemStack stack){
        stack.setCount(0);
    }

    /**
     * It damages an itemStack (adds one use)
     * @param stack
     */
    public static void damageItem(ItemStack stack) {
        stack.setItemDamage(stack.getItemDamage() + 1);
    }

    /**
     * Returns whether the object has been used its maximum number of times
     * @param stack
     * @return
     */
    public static boolean isItemStackToBeDestroyed(ItemStack stack) {
        return stack.getItemDamage() >= stack.getMaxDamage();
    }
}
