
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananacraft.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.bananacraft.network.SussMessage;
import net.mcreator.bananacraft.BananacraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BananacraftModKeyMappings {
	public static final KeyMapping SUSS = new KeyMapping("key.bananacraft.suss", GLFW.GLFW_KEY_C, "key.categories.movement");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(SUSS);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == SUSS.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						BananacraftMod.PACKET_HANDLER.sendToServer(new SussMessage(0, 0));
						SussMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
