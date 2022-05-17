
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmateWhiteEntity;
import net.mcreator.bananacraft.client.model.Modelcustom_model;

public class CrewmateWhiteRenderer extends MobRenderer<CrewmateWhiteEntity, Modelcustom_model<CrewmateWhiteEntity>> {
	public CrewmateWhiteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmateWhiteEntity entity) {
		return new ResourceLocation("bananacraft:textures/white.png");
	}
}
