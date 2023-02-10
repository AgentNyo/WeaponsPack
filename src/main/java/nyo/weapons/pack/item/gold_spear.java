package nyo.weapons.pack.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class gold_spear implements ToolMaterial{

    public static final gold_spear INSTANCE = new gold_spear();

    @Override
        public int getDurability() {
        return 223;
    }

    @Override
        public float getAttackDamage() {
        return 0;
    }

    @Override
        public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.IRON_INGOT);
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 0;
    }
}
