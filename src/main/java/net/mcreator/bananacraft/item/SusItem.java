
package net.mcreator.bananacraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.bananacraft.init.BananacraftModTabs;
import net.mcreator.bananacraft.init.BananacraftModFluids;

public class SusItem extends BucketItem {
	public SusItem() {
		super(BananacraftModFluids.SUS,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB));
	}
}
