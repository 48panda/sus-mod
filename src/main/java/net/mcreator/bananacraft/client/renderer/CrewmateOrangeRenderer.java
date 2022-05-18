
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmateOrangeEntity;
import net.mcreator.bananacraft.client.model.Modelamogus;

public class CrewmateOrangeRenderer extends MobRenderer<CrewmateOrangeEntity, Modelamogus<CrewmateOrangeEntity>> {
	public CrewmateOrangeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelamogus(context.bakeLayer(Modelamogus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmateOrangeEntity entity) {
		return new ResourceLocation("bananacraft:textures/orange.png");
	}
}
