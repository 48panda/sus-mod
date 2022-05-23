
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.RickEntity;
import net.mcreator.bananacraft.client.model.Modelplayer_two;

public class RickRenderer extends MobRenderer<RickEntity, Modelplayer_two<RickEntity>> {
	public RickRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelplayer_two(context.bakeLayer(Modelplayer_two.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RickEntity entity) {
		return new ResourceLocation("bananacraft:textures/rick.png");
	}
}
