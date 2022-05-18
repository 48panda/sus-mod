
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
import net.mcreator.bananacraft.entity.GamerJ57MobEntity;
import net.mcreator.bananacraft.entity.DreamBossEntity;
import net.mcreator.bananacraft.entity.CrewmateYellowEntity;
import net.mcreator.bananacraft.entity.CrewmateWhiteEntity;
import net.mcreator.bananacraft.entity.CrewmateRedEntity;
import net.mcreator.bananacraft.entity.CrewmatePurpleEntity;
import net.mcreator.bananacraft.entity.CrewmatePinkEntity;
import net.mcreator.bananacraft.entity.CrewmateOrangeEntity;
import net.mcreator.bananacraft.entity.CrewmateLimeEntity;
import net.mcreator.bananacraft.entity.CrewmateGreenEntity;
import net.mcreator.bananacraft.entity.CrewmateEntity;
import net.mcreator.bananacraft.entity.CrewmateCyanEntity;
import net.mcreator.bananacraft.entity.CrewmateBrownEntity;
import net.mcreator.bananacraft.entity.CrewmateBlueEntity;
import net.mcreator.bananacraft.BananacraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BananacraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, BananacraftMod.MODID);
	public static final RegistryObject<EntityType<GamerJ57MobEntity>> GAMER_J_57_MOB = register("gamer_j_57_mob",
			EntityType.Builder.<GamerJ57MobEntity>of(GamerJ57MobEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GamerJ57MobEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RickEntity>> RICK = register("rick",
			EntityType.Builder.<RickEntity>of(RickEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RickEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DreamBossEntity>> DREAM_BOSS = register("dream_boss",
			EntityType.Builder.<DreamBossEntity>of(DreamBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DreamBossEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateRedEntity>> CREWMATE_RED = register("crewmate_red",
			EntityType.Builder.<CrewmateRedEntity>of(CrewmateRedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateRedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateEntity>> CREWMATE = register("crewmate",
			EntityType.Builder.<CrewmateEntity>of(CrewmateEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CrewmateEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateWhiteEntity>> CREWMATE_WHITE = register("crewmate_white",
			EntityType.Builder.<CrewmateWhiteEntity>of(CrewmateWhiteEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateWhiteEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateBlueEntity>> CREWMATE_BLUE = register("crewmate_blue",
			EntityType.Builder.<CrewmateBlueEntity>of(CrewmateBlueEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateBlueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateCyanEntity>> CREWMATE_CYAN = register("crewmate_cyan",
			EntityType.Builder.<CrewmateCyanEntity>of(CrewmateCyanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateCyanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateYellowEntity>> CREWMATE_YELLOW = register("crewmate_yellow",
			EntityType.Builder.<CrewmateYellowEntity>of(CrewmateYellowEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateYellowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmatePinkEntity>> CREWMATE_PINK = register("crewmate_pink",
			EntityType.Builder.<CrewmatePinkEntity>of(CrewmatePinkEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmatePinkEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmatePurpleEntity>> CREWMATE_PURPLE = register("crewmate_purple",
			EntityType.Builder.<CrewmatePurpleEntity>of(CrewmatePurpleEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmatePurpleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateOrangeEntity>> CREWMATE_ORANGE = register("crewmate_orange",
			EntityType.Builder.<CrewmateOrangeEntity>of(CrewmateOrangeEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateOrangeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateLimeEntity>> CREWMATE_LIME = register("crewmate_lime",
			EntityType.Builder.<CrewmateLimeEntity>of(CrewmateLimeEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateLimeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateGreenEntity>> CREWMATE_GREEN = register("crewmate_green",
			EntityType.Builder.<CrewmateGreenEntity>of(CrewmateGreenEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateGreenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrewmateBrownEntity>> CREWMATE_BROWN = register("crewmate_brown",
			EntityType.Builder.<CrewmateBrownEntity>of(CrewmateBrownEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateBrownEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GamerJ57MobEntity.init();
			RickEntity.init();
			DreamBossEntity.init();
			CrewmateRedEntity.init();
			CrewmateEntity.init();
			CrewmateWhiteEntity.init();
			CrewmateBlueEntity.init();
			CrewmateCyanEntity.init();
			CrewmateYellowEntity.init();
			CrewmatePinkEntity.init();
			CrewmatePurpleEntity.init();
			CrewmateOrangeEntity.init();
			CrewmateLimeEntity.init();
			CrewmateGreenEntity.init();
			CrewmateBrownEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GAMER_J_57_MOB.get(), GamerJ57MobEntity.createAttributes().build());
		event.put(RICK.get(), RickEntity.createAttributes().build());
		event.put(DREAM_BOSS.get(), DreamBossEntity.createAttributes().build());
		event.put(CREWMATE_RED.get(), CrewmateRedEntity.createAttributes().build());
		event.put(CREWMATE.get(), CrewmateEntity.createAttributes().build());
		event.put(CREWMATE_WHITE.get(), CrewmateWhiteEntity.createAttributes().build());
		event.put(CREWMATE_BLUE.get(), CrewmateBlueEntity.createAttributes().build());
		event.put(CREWMATE_CYAN.get(), CrewmateCyanEntity.createAttributes().build());
		event.put(CREWMATE_YELLOW.get(), CrewmateYellowEntity.createAttributes().build());
		event.put(CREWMATE_PINK.get(), CrewmatePinkEntity.createAttributes().build());
		event.put(CREWMATE_PURPLE.get(), CrewmatePurpleEntity.createAttributes().build());
		event.put(CREWMATE_ORANGE.get(), CrewmateOrangeEntity.createAttributes().build());
		event.put(CREWMATE_LIME.get(), CrewmateLimeEntity.createAttributes().build());
		event.put(CREWMATE_GREEN.get(), CrewmateGreenEntity.createAttributes().build());
		event.put(CREWMATE_BROWN.get(), CrewmateBrownEntity.createAttributes().build());
	}
}
