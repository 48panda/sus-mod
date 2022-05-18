
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmateRedEntity;
import net.mcreator.bananacraft.client.model.Modelamogus;

public class CrewmateRedRenderer extends MobRenderer<CrewmateRedEntity, Modelamogus<CrewmateRedEntity>> {
	public CrewmateRedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelamogus(context.bakeLayer(Modelamogus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmateRedEntity entity) {
		return new ResourceLocation("bananacraft:textures/red.png");
	}
}
