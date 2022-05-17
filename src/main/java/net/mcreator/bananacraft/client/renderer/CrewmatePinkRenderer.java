
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmatePinkEntity;
import net.mcreator.bananacraft.client.model.Modelcustom_model;

public class CrewmatePinkRenderer extends MobRenderer<CrewmatePinkEntity, Modelcustom_model<CrewmatePinkEntity>> {
	public CrewmatePinkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmatePinkEntity entity) {
		return new ResourceLocation("bananacraft:textures/pink.png");
	}
}
