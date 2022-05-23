
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmatePinkEntity;
import net.mcreator.bananacraft.client.model.Modelsus_two;

public class CrewmatePinkRenderer extends MobRenderer<CrewmatePinkEntity, Modelsus_two<CrewmatePinkEntity>> {
	public CrewmatePinkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsus_two(context.bakeLayer(Modelsus_two.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmatePinkEntity entity) {
		return new ResourceLocation("bananacraft:textures/pink.png");
	}
}
