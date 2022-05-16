
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bananacraft.item.SuspiciousSwordItem;
import net.mcreator.bananacraft.item.SuspiciousShovelItem;
import net.mcreator.bananacraft.item.SuspiciousPickaxeItem;
import net.mcreator.bananacraft.item.SuspiciousIngotItem;
import net.mcreator.bananacraft.item.SuspiciousHoeItem;
import net.mcreator.bananacraft.item.SuspiciousAxeItem;
import net.mcreator.bananacraft.item.SuspiciousArmorItem;
import net.mcreator.bananacraft.item.SusItem;
import net.mcreator.bananacraft.item.NeverGonnaItem;
import net.mcreator.bananacraft.item.DreamSusItem;
import net.mcreator.bananacraft.item.DreamItem;
import net.mcreator.bananacraft.item.CrewItemItem;
import net.mcreator.bananacraft.item.AmongusDripItem;
import net.mcreator.bananacraft.BananacraftMod;

public class BananacraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BananacraftMod.MODID);
	public static final RegistryObject<Item> SUS_BUCKET = REGISTRY.register("sus_bucket", () -> new SusItem());
	public static final RegistryObject<Item> SUSPICIOUS_INGOT = REGISTRY.register("suspicious_ingot", () -> new SuspiciousIngotItem());
	public static final RegistryObject<Item> SUSPICIOUS_PICKAXE = REGISTRY.register("suspicious_pickaxe", () -> new SuspiciousPickaxeItem());
	public static final RegistryObject<Item> SUSPICIOUS_AXE = REGISTRY.register("suspicious_axe", () -> new SuspiciousAxeItem());
	public static final RegistryObject<Item> SUSPICIOUS_SHOVEL = REGISTRY.register("suspicious_shovel", () -> new SuspiciousShovelItem());
	public static final RegistryObject<Item> SUSPICIOUS_HOE = REGISTRY.register("suspicious_hoe", () -> new SuspiciousHoeItem());
	public static final RegistryObject<Item> SUSPICIOUS_SWORD = REGISTRY.register("suspicious_sword", () -> new SuspiciousSwordItem());
	public static final RegistryObject<Item> SUSPICIOUS_ARMOR_HELMET = REGISTRY.register("suspicious_armor_helmet",
			() -> new SuspiciousArmorItem.Helmet());
	public static final RegistryObject<Item> SUSPICIOUS_ARMOR_CHESTPLATE = REGISTRY.register("suspicious_armor_chestplate",
			() -> new SuspiciousArmorItem.Chestplate());
	public static final RegistryObject<Item> SUSPICIOUS_ARMOR_LEGGINGS = REGISTRY.register("suspicious_armor_leggings",
			() -> new SuspiciousArmorItem.Leggings());
	public static final RegistryObject<Item> SUSPICIOUS_ARMOR_BOOTS = REGISTRY.register("suspicious_armor_boots",
			() -> new SuspiciousArmorItem.Boots());
	public static final RegistryObject<Item> SUSPICIOUS_BLOCK = block(BananacraftModBlocks.SUSPICIOUS_BLOCK, BananacraftModTabs.TAB_SUS_CREATIVE_TAB);
	public static final RegistryObject<Item> CAKE = block(BananacraftModBlocks.CAKE, BananacraftModTabs.TAB_SUS_CREATIVE_TAB);
	public static final RegistryObject<Item> RICK = REGISTRY.register("rick_spawn_egg", () -> new ForgeSpawnEggItem(BananacraftModEntities.RICK,
			-13422283, -8500438, new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE = REGISTRY.register("crewmate_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE, -1, -1, new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> DREAM_BOSS = REGISTRY.register("dream_boss_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.DREAM_BOSS, -1, -1,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> NEVER_GONNA = REGISTRY.register("never_gonna", () -> new NeverGonnaItem());
	public static final RegistryObject<Item> AMONGUS_DRIP = REGISTRY.register("amongus_drip", () -> new AmongusDripItem());
	public static final RegistryObject<Item> DREAM = REGISTRY.register("dream", () -> new DreamItem());
	public static final RegistryObject<Item> DREAM_SUS = REGISTRY.register("dream_sus", () -> new DreamSusItem());
	public static final RegistryObject<Item> CREW_ITEM = REGISTRY.register("crew_item", () -> new CrewItemItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
