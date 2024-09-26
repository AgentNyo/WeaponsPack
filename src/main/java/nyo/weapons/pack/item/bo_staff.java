package nyo.weapons.pack.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class bo_staff implements ToolMaterial{

    public static final bo_staff INSTANCE = new bo_staff();

    @Override
        public int getDurability() {
        return 171;
    }

    @Override
        public float getAttackDamage() {
        return 0;
    }

    @Override
        public int getEnchantability() {
        return 3;
    }

    @Override
    public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.STICK);
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
