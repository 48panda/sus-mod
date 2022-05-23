
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmateEntity;
import net.mcreator.bananacraft.client.model.Modelsus_two;

public class CrewmateRenderer extends MobRenderer<CrewmateEntity, Modelsus_two<CrewmateEntity>> {
	public CrewmateRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsus_two(context.bakeLayer(Modelsus_two.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmateEntity entity) {
		return new ResourceLocation("bananacraft:textures/black.png");
	}
}
