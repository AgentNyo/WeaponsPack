package nyo.weapons.pack.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class stone implements ToolMaterial{

    public static final stone INSTANCE = new stone();

    @Override
        public int getDurability() {
        return 102;
    }

    @Override
        public float getAttackDamage() {
        return 0;
    }

    @Override
        public int getEnchantability() {
        return 6;
    }

    @Override
    public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.COBBLESTONE);
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
