
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.suggestionsannesfans.SuggestionsannesfansMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SuggestionsannesfansModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SuggestionsannesfansMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DESPARITE_NEEDS = REGISTRY.register("desparite_needs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.suggestionsannesfans.desparite_needs")).icon(() -> new ItemStack(SuggestionsannesfansModItems.CLEAN_PUFF.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SuggestionsannesfansModItems.CLEAN_PUFF.get());
				tabData.accept(SuggestionsannesfansModItems.WOODEN_KNIFE.get());
				tabData.accept(SuggestionsannesfansModItems.STONE_KNIFE.get());
				tabData.accept(SuggestionsannesfansModItems.IRON_KNIFE.get());
				tabData.accept(SuggestionsannesfansModItems.DIAMOND_KNIFE.get());
				tabData.accept(SuggestionsannesfansModItems.NETHERITE_KNIFE.get());
				tabData.accept(SuggestionsannesfansModBlocks.RICE_PLANT.get().asItem());
				tabData.accept(SuggestionsannesfansModItems.KIM.get());
				tabData.accept(SuggestionsannesfansModItems.SHEET.get());
				tabData.accept(SuggestionsannesfansModItems.COOKED_PUFF.get());
				tabData.accept(SuggestionsannesfansModItems.SMOKED_SALMON.get());
				tabData.accept(SuggestionsannesfansModItems.BLUE_CAT_FISH_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.RICE_MAKI.get());
				tabData.accept(SuggestionsannesfansModItems.PIGEON_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.BLUE_CAT_FISH_MEAT.get());
				tabData.accept(SuggestionsannesfansModItems.SHRIMP_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.BLUE_CAT_FISH_MEAT_COOK.get());
				tabData.accept(SuggestionsannesfansModBlocks.SARCOPHAGUS.get().asItem());
				tabData.accept(SuggestionsannesfansModBlocks.SARCOPHAGUS_FEET.get().asItem());
				tabData.accept(SuggestionsannesfansModItems.COPPER_PICKAXE.get());
				tabData.accept(SuggestionsannesfansModItems.COPPER_KNIFE.get());
				tabData.accept(SuggestionsannesfansModItems.C.get());
				tabData.accept(SuggestionsannesfansModItems.CW.get());
				tabData.accept(SuggestionsannesfansModItems.CH.get());
				tabData.accept(SuggestionsannesfansModItems.CA.get());
				tabData.accept(SuggestionsannesfansModItems.COPPER_HELMET.get());
				tabData.accept(SuggestionsannesfansModItems.COPPER_CHESTPLATE.get());
				tabData.accept(SuggestionsannesfansModItems.COPPER_LEGGINGS.get());
				tabData.accept(SuggestionsannesfansModItems.COPPER_BOOTS.get());
				tabData.accept(SuggestionsannesfansModItems.ULTAMITE.get());
				tabData.accept(SuggestionsannesfansModItems.LOVE.get());
				tabData.accept(SuggestionsannesfansModItems.SCULK_LIQ_BUCKET.get());
				tabData.accept(SuggestionsannesfansModItems.SCULK.get());
				tabData.accept(SuggestionsannesfansModItems.PRINCESS_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.QUEEN_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.PRINCE_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.KING_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.CROCODILE_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.OSTRICH_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.FORK.get());
				tabData.accept(SuggestionsannesfansModItems.EMERALD_ARMOR_HELMET.get());
				tabData.accept(SuggestionsannesfansModItems.EMERALD_ARMOR_CHESTPLATE.get());
				tabData.accept(SuggestionsannesfansModItems.EMERALD_ARMOR_LEGGINGS.get());
				tabData.accept(SuggestionsannesfansModItems.EMERALD_ARMOR_BOOTS.get());
				tabData.accept(SuggestionsannesfansModBlocks.TERMITE_MOUND.get().asItem());
				tabData.accept(SuggestionsannesfansModItems.TERMITE_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.TERMITE_QUEEN_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.PENGUIN_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.TERMITE_KING_SPAWN_EGG.get());
				tabData.accept(SuggestionsannesfansModItems.ELEPHANT_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(SuggestionsannesfansModItems.CLEAN_PUFF.get());
			tabData.accept(SuggestionsannesfansModItems.KIM.get());
			tabData.accept(SuggestionsannesfansModItems.SHEET.get());
			tabData.accept(SuggestionsannesfansModItems.COOKED_PUFF.get());
			tabData.accept(SuggestionsannesfansModItems.SMOKED_SALMON.get());
			tabData.accept(SuggestionsannesfansModItems.RICE_MAKI.get());
			tabData.accept(SuggestionsannesfansModItems.BLUE_CAT_FISH_MEAT.get());
			tabData.accept(SuggestionsannesfansModItems.BLUE_CAT_FISH_MEAT_COOK.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SuggestionsannesfansModItems.WOODEN_KNIFE.get());
			tabData.accept(SuggestionsannesfansModItems.STONE_KNIFE.get());
			tabData.accept(SuggestionsannesfansModItems.IRON_KNIFE.get());
			tabData.accept(SuggestionsannesfansModItems.DIAMOND_KNIFE.get());
			tabData.accept(SuggestionsannesfansModItems.NETHERITE_KNIFE.get());
			tabData.accept(SuggestionsannesfansModItems.COPPER_PICKAXE.get());
			tabData.accept(SuggestionsannesfansModItems.COPPER_KNIFE.get());
			tabData.accept(SuggestionsannesfansModItems.C.get());
			tabData.accept(SuggestionsannesfansModItems.CH.get());
			tabData.accept(SuggestionsannesfansModItems.CA.get());
			tabData.accept(SuggestionsannesfansModItems.ULTAMITE.get());
			tabData.accept(SuggestionsannesfansModItems.LOVE.get());
			tabData.accept(SuggestionsannesfansModItems.SCULK_LIQ_BUCKET.get());
			tabData.accept(SuggestionsannesfansModItems.SCULK.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(SuggestionsannesfansModBlocks.RICE_PLANT.get().asItem());
			tabData.accept(SuggestionsannesfansModBlocks.TERMITE_MOUND.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SuggestionsannesfansModItems.KIM.get());
			tabData.accept(SuggestionsannesfansModItems.SHEET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(SuggestionsannesfansModItems.BLUE_CAT_FISH_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.PIGEON_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.SHRIMP_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.PRINCESS_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.QUEEN_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.PRINCE_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.KING_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.CROCODILE_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.OSTRICH_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.TERMITE_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.TERMITE_QUEEN_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.PENGUIN_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.TERMITE_KING_SPAWN_EGG.get());
			tabData.accept(SuggestionsannesfansModItems.ELEPHANT_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SuggestionsannesfansModBlocks.SARCOPHAGUS.get().asItem());
			tabData.accept(SuggestionsannesfansModBlocks.SARCOPHAGUS_FEET.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SuggestionsannesfansModItems.CW.get());
			tabData.accept(SuggestionsannesfansModItems.COPPER_HELMET.get());
			tabData.accept(SuggestionsannesfansModItems.COPPER_CHESTPLATE.get());
			tabData.accept(SuggestionsannesfansModItems.COPPER_LEGGINGS.get());
			tabData.accept(SuggestionsannesfansModItems.COPPER_BOOTS.get());
			tabData.accept(SuggestionsannesfansModItems.FORK.get());
			tabData.accept(SuggestionsannesfansModItems.EMERALD_ARMOR_HELMET.get());
			tabData.accept(SuggestionsannesfansModItems.EMERALD_ARMOR_CHESTPLATE.get());
			tabData.accept(SuggestionsannesfansModItems.EMERALD_ARMOR_LEGGINGS.get());
			tabData.accept(SuggestionsannesfansModItems.EMERALD_ARMOR_BOOTS.get());
		}
	}
}
