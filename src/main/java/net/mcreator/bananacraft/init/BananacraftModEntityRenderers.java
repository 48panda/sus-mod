
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananacraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bananacraft.client.renderer.RickRenderer;
import net.mcreator.bananacraft.client.renderer.DreamBossRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmateRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BananacraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BananacraftModEntities.RICK.get(), RickRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE.get(), CrewmateRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.DREAM_BOSS.get(), DreamBossRenderer::new);
	}
}
