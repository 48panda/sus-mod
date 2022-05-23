
package net.mcreator.bananacraft.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.bananacraft.init.BananacraftModFluids;
import net.mcreator.bananacraft.init.BananacraftModBlocks;

public abstract class SuspiciousSludgeFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(BananacraftModFluids.SUSPICIOUS_SLUDGE,
			BananacraftModFluids.FLOWING_SUSPICIOUS_SLUDGE,
			FluidAttributes.builder(new ResourceLocation("bananacraft:blocks/puresus"), new ResourceLocation("bananacraft:blocks/puresus"))

	).explosionResistance(100f)

			.block(() -> (LiquidBlock) BananacraftModBlocks.SUSPICIOUS_SLUDGE.get());

	private SuspiciousSludgeFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SuspiciousSludgeFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SuspiciousSludgeFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
