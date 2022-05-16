
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.bananacraft.entity.RickEntity;
import net.mcreator.bananacraft.entity.CrewmateEntity;
import net.mcreator.bananacraft.BananacraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BananacraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, BananacraftMod.MODID);
	public static final RegistryObject<EntityType<RickEntity>> RICK = register("rick",
			EntityType.Builder.<RickEntity>of(RickEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RickEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateEntity>> CREWMATE = register("crewmate",
			EntityType.Builder.<CrewmateEntity>of(CrewmateEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CrewmateEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RickEntity.init();
			CrewmateEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RICK.get(), RickEntity.createAttributes().build());
		event.put(CREWMATE.get(), CrewmateEntity.createAttributes().build());
	}
}
