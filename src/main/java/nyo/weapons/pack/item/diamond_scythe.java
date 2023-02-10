package nyo.weapons.pack.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class diamond_scythe implements ToolMaterial{

    public static final diamond_scythe INSTANCE = new diamond_scythe();

    @Override
        public int getDurability() {
        return 1362;
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
