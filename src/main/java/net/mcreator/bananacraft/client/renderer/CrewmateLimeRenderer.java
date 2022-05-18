
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.CrewmateLimeEntity;
import net.mcreator.bananacraft.client.model.Modelamogus;

public class CrewmateLimeRenderer extends MobRenderer<CrewmateLimeEntity, Modelamogus<CrewmateLimeEntity>> {
	public CrewmateLimeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelamogus(context.bakeLayer(Modelamogus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmateLimeEntity entity) {
		return new ResourceLocation("bananacraft:textures/lime.png");
	}
}
