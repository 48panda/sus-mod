
package net.mcreator.bananacraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bananacraft.entity.GamerJ57MobEntity;
import net.mcreator.bananacraft.client.model.Modelgj57;

public class GamerJ57MobRenderer extends MobRenderer<GamerJ57MobEntity, Modelgj57<GamerJ57MobEntity>> {
	public GamerJ57MobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgj57(context.bakeLayer(Modelgj57.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GamerJ57MobEntity entity) {
		return new ResourceLocation("bananacraft:textures/gj57.png");
	}
}
