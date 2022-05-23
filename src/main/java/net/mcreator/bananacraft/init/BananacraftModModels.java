
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananacraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bananacraft.client.model.Modelsus_two;
import net.mcreator.bananacraft.client.model.Modelplayer_two;
import net.mcreator.bananacraft.client.model.Modelgj57;
import net.mcreator.bananacraft.client.model.Modelcustom_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BananacraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsus_two.LAYER_LOCATION, Modelsus_two::createBodyLayer);
		event.registerLayerDefinition(Modelgj57.LAYER_LOCATION, Modelgj57::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelplayer_two.LAYER_LOCATION, Modelplayer_two::createBodyLayer);
	}
}
