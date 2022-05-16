
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananacraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BananacraftModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("bananacraft", "nevergonna"), new SoundEvent(new ResourceLocation("bananacraft", "nevergonna")));
		REGISTRY.put(new ResourceLocation("bananacraft", "crewstep"), new SoundEvent(new ResourceLocation("bananacraft", "crewstep")));
		REGISTRY.put(new ResourceLocation("bananacraft", "crewmatedies"), new SoundEvent(new ResourceLocation("bananacraft", "crewmatedies")));
		REGISTRY.put(new ResourceLocation("bananacraft", "amongusdrip"), new SoundEvent(new ResourceLocation("bananacraft", "amongusdrip")));
		REGISTRY.put(new ResourceLocation("bananacraft", "dream"), new SoundEvent(new ResourceLocation("bananacraft", "dream")));
		REGISTRY.put(new ResourceLocation("bananacraft", "dreamsus"), new SoundEvent(new ResourceLocation("bananacraft", "dreamsus")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
