package net.erzekawek.areasundiscovered.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class IceCrystalUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
	}
}
