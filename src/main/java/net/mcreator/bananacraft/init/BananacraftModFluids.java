
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.bananacraft.fluid.SuspiciousSludgeFluid;
import net.mcreator.bananacraft.fluid.SusFluid;
import net.mcreator.bananacraft.BananacraftMod;

public class BananacraftModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, BananacraftMod.MODID);
	public static final RegistryObject<Fluid> SUS = REGISTRY.register("sus", () -> new SusFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SUS = REGISTRY.register("flowing_sus", () -> new SusFluid.Flowing());
	public static final RegistryObject<Fluid> SUSPICIOUS_SLUDGE = REGISTRY.register("suspicious_sludge", () -> new SuspiciousSludgeFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SUSPICIOUS_SLUDGE = REGISTRY.register("flowing_suspicious_sludge",
			() -> new SuspiciousSludgeFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SUS.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SUS.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SUSPICIOUS_SLUDGE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SUSPICIOUS_SLUDGE.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
