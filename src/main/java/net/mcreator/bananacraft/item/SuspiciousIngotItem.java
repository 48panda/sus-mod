
package net.mcreator.bananacraft.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bananacraft.init.BananacraftModTabs;

public class SuspiciousIngotItem extends Item {
	public SuspiciousIngotItem() {
		super(new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
