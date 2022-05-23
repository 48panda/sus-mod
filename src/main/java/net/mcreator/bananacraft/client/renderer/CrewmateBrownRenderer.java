
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmateBrownEntity;
import net.mcreator.bananacraft.client.model.Modelsus_two;

public class CrewmateBrownRenderer extends MobRenderer<CrewmateBrownEntity, Modelsus_two<CrewmateBrownEntity>> {
	public CrewmateBrownRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsus_two(context.bakeLayer(Modelsus_two.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmateBrownEntity entity) {
		return new ResourceLocation("bananacraft:textures/brown.png");
	}
}
