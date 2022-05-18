
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmateYellowEntity;
import net.mcreator.bananacraft.client.model.Modelamogus;

public class CrewmateYellowRenderer extends MobRenderer<CrewmateYellowEntity, Modelamogus<CrewmateYellowEntity>> {
	public CrewmateYellowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelamogus(context.bakeLayer(Modelamogus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmateYellowEntity entity) {
		return new ResourceLocation("bananacraft:textures/yellow.png");
	}
}
