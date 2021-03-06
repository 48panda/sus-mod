
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmateCyanEntity;
import net.mcreator.bananacraft.client.model.Modelsus_two;

public class CrewmateCyanRenderer extends MobRenderer<CrewmateCyanEntity, Modelsus_two<CrewmateCyanEntity>> {
	public CrewmateCyanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsus_two(context.bakeLayer(Modelsus_two.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmateCyanEntity entity) {
		return new ResourceLocation("bananacraft:textures/cyan.png");
	}
}
