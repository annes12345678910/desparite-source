
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.suggestionsannesfans.SuggestionsannesfansMod;

public class SuggestionsannesfansModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, SuggestionsannesfansMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> PRINCESSAMBIENT = REGISTRY.register("princessambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "princessambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PRINCESSDIE = REGISTRY.register("princessdie", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "princessdie")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PRINCESSHURT = REGISTRY.register("princesshurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "princesshurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> QUEENBRAG = REGISTRY.register("queenbrag", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "queenbrag")));
	public static final DeferredHolder<SoundEvent, SoundEvent> OSTRICHAMBIENT = REGISTRY.register("ostrichambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "ostrichambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> THEREGONNABEMORE = REGISTRY.register("theregonnabemore", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "theregonnabemore")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TERMITEQUEENCRY = REGISTRY.register("termitequeencry", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "termitequeencry")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ELEPHANTHURT = REGISTRY.register("elephanthurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "elephanthurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ELEFANTDEATH = REGISTRY.register("elefantdeath", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "elefantdeath")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ELEFANTAMBIENT = REGISTRY.register("elefantambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("suggestionsannesfans", "elefantambient")));
}
