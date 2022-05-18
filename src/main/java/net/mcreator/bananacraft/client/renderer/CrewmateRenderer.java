
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmateEntity;
import net.mcreator.bananacraft.client.model.Modelamogus;

public class CrewmateRenderer extends MobRenderer<CrewmateEntity, Modelamogus<CrewmateEntity>> {
	public CrewmateRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelamogus(context.bakeLayer(Modelamogus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmateEntity entity) {
		return new ResourceLocation("bananacraft:textures/black.png");
	}
}
