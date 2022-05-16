package net.mcreator.bananacraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.bananacraft.init.BananacraftModEntities;
import net.mcreator.bananacraft.entity.RickEntity;
import net.mcreator.bananacraft.entity.DreamBossEntity;

public class CakeOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.TORCH
				&& (world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.TORCH
				&& (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.TORCH
				&& (world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.TORCH
				&& (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.TORCH
				&& (world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.TORCH
				&& (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.TORCH
				&& (world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.TORCH) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new DreamBossEntity(BananacraftModEntities.DREAM_BOSS.get(), _level);
				entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bananacraft:dream")),
							SoundSource.MASTER, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bananacraft:dream")),
							SoundSource.MASTER, 1, 1, false);
				}
			}
		} else {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new RickEntity(BananacraftModEntities.RICK.get(), _level);
				entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
