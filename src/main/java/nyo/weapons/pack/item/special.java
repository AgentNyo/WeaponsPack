package nyo.weapons.pack.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class special implements ToolMaterial{

    public static final special INSTANCE = new special();

    @Override
        public int getDurability() {
        return 1751;
    }

    @Override
        public float getAttackDamage() {
        return 0;
    }

    @Override
        public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.NETHER_STAR);
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
