package nyo.weapons.pack.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class iron_scythe implements ToolMaterial{

    public static final iron_scythe INSTANCE = new iron_scythe();

    @Override
        public int getDurability() {
        return 675;
    }

    @Override
        public float getAttackDamage() {
        return 0;
    }

    @Override
        public int getEnchantability() {
        return 8;
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
