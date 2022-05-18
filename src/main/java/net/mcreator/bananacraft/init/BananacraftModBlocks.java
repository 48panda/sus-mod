
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.bananacraft.block.SuspiciousBlockBlock;
import net.mcreator.bananacraft.block.SusBlock;
import net.mcreator.bananacraft.block.GamerK57Block;
import net.mcreator.bananacraft.block.GamerJ57Block;
import net.mcreator.bananacraft.block.CakeBlock;
import net.mcreator.bananacraft.BananacraftMod;

public class BananacraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BananacraftMod.MODID);
	public static final RegistryObject<Block> SUS = REGISTRY.register("sus", () -> new SusBlock());
	public static final RegistryObject<Block> SUSPICIOUS_BLOCK = REGISTRY.register("suspicious_block", () -> new SuspiciousBlockBlock());
	public static final RegistryObject<Block> CAKE = REGISTRY.register("cake", () -> new CakeBlock());
	public static final RegistryObject<Block> GAMER_J_57 = REGISTRY.register("gamer_j_57", () -> new GamerJ57Block());
	public static final RegistryObject<Block> GAMER_K_57 = REGISTRY.register("gamer_k_57", () -> new GamerK57Block());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CakeBlock.registerRenderLayer();
		}
	}
}
