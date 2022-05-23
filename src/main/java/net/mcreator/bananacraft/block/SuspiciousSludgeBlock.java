
package net.mcreator.bananacraft.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.bananacraft.init.BananacraftModFluids;

public class SuspiciousSludgeBlock extends LiquidBlock {
	public SuspiciousSludgeBlock() {
		super(() -> (FlowingFluid) BananacraftModFluids.SUSPICIOUS_SLUDGE.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
