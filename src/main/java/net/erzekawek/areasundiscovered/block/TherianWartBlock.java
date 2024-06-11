
package net.erzekawek.areasundiscovered.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class TherianWartBlock extends Block {
	public TherianWartBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WART_BLOCK).strength(2f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
