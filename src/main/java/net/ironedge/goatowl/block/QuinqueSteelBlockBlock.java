
package net.ironedge.goatowl.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class QuinqueSteelBlockBlock extends FallingBlock {
	public QuinqueSteelBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANVIL).strength(6.5f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
