
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SuggestionsannesfansModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> IS_FISH_RULE;
	public static GameRules.Key<GameRules.BooleanValue> HAVE_MATE;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		IS_FISH_RULE = GameRules.register("isFishRule", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		HAVE_MATE = GameRules.register("haveMate", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	}
}
