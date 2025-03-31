
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.suggestionsannesfans.fluid.types.SculkLiqFluidType;
import net.mcreator.suggestionsannesfans.SuggestionsannesfansMod;

public class SuggestionsannesfansModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, SuggestionsannesfansMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> SCULK_LIQ_TYPE = REGISTRY.register("sculk_liq", () -> new SculkLiqFluidType());
}
