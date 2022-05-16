
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananacraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BananacraftModTabs {
	public static CreativeModeTab TAB_SUS_CREATIVE_TAB;

	public static void load() {
		TAB_SUS_CREATIVE_TAB = new CreativeModeTab("tabsus_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BananacraftModItems.CREW_ITEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
