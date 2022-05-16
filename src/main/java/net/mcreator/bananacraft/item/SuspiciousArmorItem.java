
package net.mcreator.bananacraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.bananacraft.init.BananacraftModTabs;
import net.mcreator.bananacraft.init.BananacraftModItems;

public abstract class SuspiciousArmorItem extends ArmorItem {
	public SuspiciousArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 75;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{10, 30, 25, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 45;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BananacraftModItems.SUSPICIOUS_INGOT.get()));
			}

			@Override
			public String getName() {
				return "suspicious_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SuspiciousArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "bananacraft:textures/models/armor/suspicious_layer_1.png";
		}
	}

	public static class Chestplate extends SuspiciousArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "bananacraft:textures/models/armor/suspicious_layer_1.png";
		}
	}

	public static class Leggings extends SuspiciousArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "bananacraft:textures/models/armor/suspicious_layer_2.png";
		}
	}

	public static class Boots extends SuspiciousArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(BananacraftModTabs.TAB_SUS_CREATIVE_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "bananacraft:textures/models/armor/suspicious_layer_1.png";
		}
	}
}
