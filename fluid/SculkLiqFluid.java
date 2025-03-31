
package net.mcreator.suggestionsannesfans.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.suggestionsannesfans.init.SuggestionsannesfansModParticleTypes;
import net.mcreator.suggestionsannesfans.init.SuggestionsannesfansModItems;
import net.mcreator.suggestionsannesfans.init.SuggestionsannesfansModFluids;
import net.mcreator.suggestionsannesfans.init.SuggestionsannesfansModFluidTypes;
import net.mcreator.suggestionsannesfans.init.SuggestionsannesfansModBlocks;

public abstract class SculkLiqFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> SuggestionsannesfansModFluidTypes.SCULK_LIQ_TYPE.get(), () -> SuggestionsannesfansModFluids.SCULK_LIQ.get(),
			() -> SuggestionsannesfansModFluids.FLOWING_SCULK_LIQ.get()).explosionResistance(100f).bucket(() -> SuggestionsannesfansModItems.SCULK_LIQ_BUCKET.get()).block(() -> (LiquidBlock) SuggestionsannesfansModBlocks.SCULK_LIQ.get());

	private SculkLiqFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (SuggestionsannesfansModParticleTypes.TONGUE.get());
	}

	public static class Source extends SculkLiqFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SculkLiqFluid {
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
