package nyo.weapons.pack.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class diamond_sword implements ToolMaterial{

    public static final diamond_sword INSTANCE = new diamond_sword();

    @Override
        public int getDurability() {
        return 1421;
    }

    @Override
        public float getAttackDamage() {
        return 0;
    }

    @Override
        public int getEnchantability() {
        return 9;
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
