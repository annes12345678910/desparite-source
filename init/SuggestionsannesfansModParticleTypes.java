
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.suggestionsannesfans.SuggestionsannesfansMod;

public class SuggestionsannesfansModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, SuggestionsannesfansMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> TONGUE = REGISTRY.register("tongue", () -> new SimpleParticleType(true));
}
