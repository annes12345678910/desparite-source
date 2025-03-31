package net.mcreator.suggestionsannesfans.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class QueenEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < 10; index0++) {
			world.addParticle(ParticleTypes.ANGRY_VILLAGER, x, y, z, 0, 1, 0);
		}
	}
}
