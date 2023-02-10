package nyo.weapons.pack.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class blade implements ToolMaterial{

    public static final blade INSTANCE = new blade();

    @Override
        public int getDurability() {
        return 764;
    }

    @Override
        public float getAttackDamage() {
        return 0;
    }

    @Override
        public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.OBSIDIAN);
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
