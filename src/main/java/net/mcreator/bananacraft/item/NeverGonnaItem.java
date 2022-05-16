
package net.mcreator.bananacraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.bananacraft.init.BananacraftModTabs;
import net.mcreator.bananacraft.init.BananacraftModSounds;

import java.util.List;

public class NeverGonnaItem extends RecordItem {
	public NeverGonnaItem() {
		super(0, BananacraftModSounds.REGISTRY.get(new ResourceLocation("bananacraft:nevergonna")),
				new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Never Gonna Let You Down"));
	}
}
