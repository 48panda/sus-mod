
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
import net.mcreator.bananacraft.client.renderer.CrewmateYellowRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmateWhiteRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmateRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmateRedRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmatePurpleRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmatePinkRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmateOrangeRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmateLimeRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmateGreenRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmateCyanRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmateBrownRenderer;
import net.mcreator.bananacraft.client.renderer.CrewmateBlueRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BananacraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BananacraftModEntities.RICK.get(), RickRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.DREAM_BOSS.get(), DreamBossRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_RED.get(), CrewmateRedRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE.get(), CrewmateRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_WHITE.get(), CrewmateWhiteRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_BLUE.get(), CrewmateBlueRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_CYAN.get(), CrewmateCyanRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_YELLOW.get(), CrewmateYellowRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_PINK.get(), CrewmatePinkRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_PURPLE.get(), CrewmatePurpleRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_ORANGE.get(), CrewmateOrangeRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_LIME.get(), CrewmateLimeRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_GREEN.get(), CrewmateGreenRenderer::new);
		event.registerEntityRenderer(BananacraftModEntities.CREWMATE_BROWN.get(), CrewmateBrownRenderer::new);
	}
}
