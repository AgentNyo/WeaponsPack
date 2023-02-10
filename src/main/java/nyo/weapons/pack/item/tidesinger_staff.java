package nyo.weapons.pack.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class tidesinger_staff implements ToolMaterial{

    public static final tidesinger_staff INSTANCE = new tidesinger_staff();

    @Override
        public int getDurability() {
        return 1851;
    }

    @Override
        public float getAttackDamage() {
        return 0;
    }

    @Override
        public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.DIAMOND);
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
