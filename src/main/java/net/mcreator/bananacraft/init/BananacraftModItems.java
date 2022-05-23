
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
import net.mcreator.bananacraft.item.SuspiciousBlobItem;
import net.mcreator.bananacraft.item.SuspiciousAxeItem;
import net.mcreator.bananacraft.item.SuspiciousArmorItem;
import net.mcreator.bananacraft.item.SusItem;
import net.mcreator.bananacraft.item.SusAiotItem;
import net.mcreator.bananacraft.item.NeverGonnaItem;
import net.mcreator.bananacraft.item.DreamItem;
import net.mcreator.bananacraft.item.CrewItemItem;
import net.mcreator.bananacraft.item.BottleItem;
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
	public static final RegistryObject<Item> SUS_AIOT = REGISTRY.register("sus_aiot", () -> new SusAiotItem());
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
	public static final RegistryObject<Item> NEVER_GONNA = REGISTRY.register("never_gonna", () -> new NeverGonnaItem());
	public static final RegistryObject<Item> AMONGUS_DRIP = REGISTRY.register("amongus_drip", () -> new AmongusDripItem());
	public static final RegistryObject<Item> DREAM = REGISTRY.register("dream", () -> new DreamItem());
	public static final RegistryObject<Item> GAMER_J_57 = block(BananacraftModBlocks.GAMER_J_57, BananacraftModTabs.TAB_SUS_CREATIVE_TAB);
	public static final RegistryObject<Item> GAMER_K_57 = block(BananacraftModBlocks.GAMER_K_57, BananacraftModTabs.TAB_SUS_CREATIVE_TAB);
	public static final RegistryObject<Item> BOTTLE = REGISTRY.register("bottle", () -> new BottleItem());
	public static final RegistryObject<Item> GAMER_J_57_MOB = REGISTRY.register("gamer_j_57_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.GAMER_J_57_MOB, -16777216, -1,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> RICK = REGISTRY.register("rick_spawn_egg", () -> new ForgeSpawnEggItem(BananacraftModEntities.RICK,
			-13422283, -8500438, new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> DREAM_BOSS = REGISTRY.register("dream_boss_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.DREAM_BOSS, -1, -1,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_RED = REGISTRY.register("crewmate_red_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_RED, -65536, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE = REGISTRY.register("crewmate_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE, -16777216, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_WHITE = REGISTRY.register("crewmate_white_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_WHITE, -1, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_BLUE = REGISTRY.register("crewmate_blue_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_BLUE, -16776961, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_CYAN = REGISTRY.register("crewmate_cyan_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_CYAN, -8585217, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_YELLOW = REGISTRY.register("crewmate_yellow_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_YELLOW, -256, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_PINK = REGISTRY.register("crewmate_pink_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_PINK, -2490193, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_PURPLE = REGISTRY.register("crewmate_purple_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_PURPLE, -10682262, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_ORANGE = REGISTRY.register("crewmate_orange_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_ORANGE, -2456832, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_LIME = REGISTRY.register("crewmate_lime_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_LIME, -16711936, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_GREEN = REGISTRY.register("crewmate_green_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_GREEN, -14467328, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREWMATE_BROWN = REGISTRY.register("crewmate_brown_spawn_egg",
			() -> new ForgeSpawnEggItem(BananacraftModEntities.CREWMATE_BROWN, -8633088, -16711681,
					new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB)));
	public static final RegistryObject<Item> CREW_ITEM = REGISTRY.register("crew_item", () -> new CrewItemItem());
	public static final RegistryObject<Item> SUS_INGOT_GENERATOR = block(BananacraftModBlocks.SUS_INGOT_GENERATOR,
			BananacraftModTabs.TAB_SUS_CREATIVE_TAB);
	public static final RegistryObject<Item> SUSPICIOUS_BLOB = REGISTRY.register("suspicious_blob", () -> new SuspiciousBlobItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
