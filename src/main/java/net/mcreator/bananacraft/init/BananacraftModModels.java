
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananacraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bananacraft.client.model.Modelplayer_model;
import net.mcreator.bananacraft.client.model.Modelgj57;
import net.mcreator.bananacraft.client.model.Modelcustom_model;
import net.mcreator.bananacraft.client.model.Modelamogus;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BananacraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelgj57.LAYER_LOCATION, Modelgj57::createBodyLayer);
		event.registerLayerDefinition(Modelplayer_model.LAYER_LOCATION, Modelplayer_model::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelamogus.LAYER_LOCATION, Modelamogus::createBodyLayer);
	}
}
