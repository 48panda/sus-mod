
package net.mcreator.bananacraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.bananacraft.init.BananacraftModTabs;
import net.mcreator.bananacraft.init.BananacraftModItems;

public class SuspiciousHoeItem extends HoeItem {
	public SuspiciousHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BananacraftModItems.SUSPICIOUS_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB));
	}
}
