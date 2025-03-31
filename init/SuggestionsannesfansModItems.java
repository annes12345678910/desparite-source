
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import org.checkerframework.checker.units.qual.C;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.suggestionsannesfans.item.WoodenKnifeItem;
import net.mcreator.suggestionsannesfans.item.UltamiteItem;
import net.mcreator.suggestionsannesfans.item.StoneKnifeItem;
import net.mcreator.suggestionsannesfans.item.SmokedSalmonItem;
import net.mcreator.suggestionsannesfans.item.SheetItem;
import net.mcreator.suggestionsannesfans.item.SculkLiqItem;
import net.mcreator.suggestionsannesfans.item.SculkItem;
import net.mcreator.suggestionsannesfans.item.RiceMakiItem;
import net.mcreator.suggestionsannesfans.item.NetheriteKnifeItem;
import net.mcreator.suggestionsannesfans.item.LoveItem;
import net.mcreator.suggestionsannesfans.item.KimItem;
import net.mcreator.suggestionsannesfans.item.IronKniferItem;
import net.mcreator.suggestionsannesfans.item.ForkItem;
import net.mcreator.suggestionsannesfans.item.EmeraldArmorItem;
import net.mcreator.suggestionsannesfans.item.DiamondKnifeItem;
import net.mcreator.suggestionsannesfans.item.CwItem;
import net.mcreator.suggestionsannesfans.item.CopperPickaxeItem;
import net.mcreator.suggestionsannesfans.item.CopperKnifeItem;
import net.mcreator.suggestionsannesfans.item.CopperItem;
import net.mcreator.suggestionsannesfans.item.CookedPuffItem;
import net.mcreator.suggestionsannesfans.item.CleanPuffItem;
import net.mcreator.suggestionsannesfans.item.ChItem;
import net.mcreator.suggestionsannesfans.item.CaItem;
import net.mcreator.suggestionsannesfans.item.CItem;
import net.mcreator.suggestionsannesfans.item.BlueCatFishMeatItem;
import net.mcreator.suggestionsannesfans.item.BlueCatFishMeatCookItem;
import net.mcreator.suggestionsannesfans.SuggestionsannesfansMod;

import java.util.function.Function;

public class SuggestionsannesfansModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SuggestionsannesfansMod.MODID);
	public static final DeferredItem<Item> CLEAN_PUFF = register("clean_puff", CleanPuffItem::new);
	public static final DeferredItem<Item> WOODEN_KNIFE = register("wooden_knife", WoodenKnifeItem::new);
	public static final DeferredItem<Item> STONE_KNIFE = register("stone_knife", StoneKnifeItem::new);
	public static final DeferredItem<Item> IRON_KNIFE = register("iron_knife", IronKniferItem::new);
	public static final DeferredItem<Item> DIAMOND_KNIFE = register("diamond_knife", DiamondKnifeItem::new);
	public static final DeferredItem<Item> NETHERITE_KNIFE = register("netherite_knife", NetheriteKnifeItem::new);
	public static final DeferredItem<Item> RICE_PLANT = block(SuggestionsannesfansModBlocks.RICE_PLANT);
	public static final DeferredItem<Item> KIM = register("kim", KimItem::new);
	public static final DeferredItem<Item> SHEET = register("sheet", SheetItem::new);
	public static final DeferredItem<Item> COOKED_PUFF = register("cooked_puff", CookedPuffItem::new);
	public static final DeferredItem<Item> SMOKED_SALMON = register("smoked_salmon", SmokedSalmonItem::new);
	public static final DeferredItem<Item> BLUE_CAT_FISH_SPAWN_EGG = register("blue_cat_fish_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.BLUE_CAT_FISH.get(), properties));
	public static final DeferredItem<Item> RICE_MAKI = register("rice_maki", RiceMakiItem::new);
	public static final DeferredItem<Item> PIGEON_SPAWN_EGG = register("pigeon_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.PIGEON.get(), properties));
	public static final DeferredItem<Item> BLUE_CAT_FISH_MEAT = register("blue_cat_fish_meat", BlueCatFishMeatItem::new);
	public static final DeferredItem<Item> SHRIMP_SPAWN_EGG = register("shrimp_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.SHRIMP.get(), properties));
	public static final DeferredItem<Item> BLUE_CAT_FISH_MEAT_COOK = register("blue_cat_fish_meat_cook", BlueCatFishMeatCookItem::new);
	public static final DeferredItem<Item> SARCOPHAGUS = block(SuggestionsannesfansModBlocks.SARCOPHAGUS);
	public static final DeferredItem<Item> SARCOPHAGUS_FEET = block(SuggestionsannesfansModBlocks.SARCOPHAGUS_FEET);
	public static final DeferredItem<Item> COPPER_PICKAXE = register("copper_pickaxe", CopperPickaxeItem::new);
	public static final DeferredItem<Item> COPPER_KNIFE = register("copper_knife", CopperKnifeItem::new);
	public static final DeferredItem<Item> C = register("c", CItem::new);
	public static final DeferredItem<Item> CW = register("cw", CwItem::new);
	public static final DeferredItem<Item> CH = register("ch", ChItem::new);
	public static final DeferredItem<Item> CA = register("ca", CaItem::new);
	public static final DeferredItem<Item> COPPER_HELMET = register("copper_helmet", CopperItem.Helmet::new);
	public static final DeferredItem<Item> COPPER_CHESTPLATE = register("copper_chestplate", CopperItem.Chestplate::new);
	public static final DeferredItem<Item> COPPER_LEGGINGS = register("copper_leggings", CopperItem.Leggings::new);
	public static final DeferredItem<Item> COPPER_BOOTS = register("copper_boots", CopperItem.Boots::new);
	public static final DeferredItem<Item> ULTAMITE = register("ultamite", UltamiteItem::new);
	public static final DeferredItem<Item> LOVE = register("love", LoveItem::new);
	public static final DeferredItem<Item> SCULK_LIQ_BUCKET = register("sculk_liq_bucket", SculkLiqItem::new);
	public static final DeferredItem<Item> SCULK = register("sculk", SculkItem::new);
	public static final DeferredItem<Item> PRINCESS_SPAWN_EGG = register("princess_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.PRINCESS.get(), properties));
	public static final DeferredItem<Item> QUEEN_SPAWN_EGG = register("queen_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.QUEEN.get(), properties));
	public static final DeferredItem<Item> PRINCE_SPAWN_EGG = register("prince_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.PRINCE.get(), properties));
	public static final DeferredItem<Item> KING_SPAWN_EGG = register("king_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.KING.get(), properties));
	public static final DeferredItem<Item> CROCODILE_SPAWN_EGG = register("crocodile_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.CROCODILE.get(), properties));
	public static final DeferredItem<Item> OSTRICH_SPAWN_EGG = register("ostrich_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.OSTRICH.get(), properties));
	public static final DeferredItem<Item> FORK = register("fork", ForkItem::new);
	public static final DeferredItem<Item> EMERALD_ARMOR_HELMET = register("emerald_armor_helmet", EmeraldArmorItem.Helmet::new);
	public static final DeferredItem<Item> EMERALD_ARMOR_CHESTPLATE = register("emerald_armor_chestplate", EmeraldArmorItem.Chestplate::new);
	public static final DeferredItem<Item> EMERALD_ARMOR_LEGGINGS = register("emerald_armor_leggings", EmeraldArmorItem.Leggings::new);
	public static final DeferredItem<Item> EMERALD_ARMOR_BOOTS = register("emerald_armor_boots", EmeraldArmorItem.Boots::new);
	public static final DeferredItem<Item> TERMITE_MOUND = block(SuggestionsannesfansModBlocks.TERMITE_MOUND);
	public static final DeferredItem<Item> TERMITE_SPAWN_EGG = register("termite_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.TERMITE.get(), properties));
	public static final DeferredItem<Item> TERMITE_QUEEN_SPAWN_EGG = register("termite_queen_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.TERMITE_QUEEN.get(), properties));
	public static final DeferredItem<Item> PENGUIN_SPAWN_EGG = register("penguin_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.PENGUIN.get(), properties));
	public static final DeferredItem<Item> TERMITE_KING_SPAWN_EGG = register("termite_king_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.TERMITE_KING.get(), properties));
	public static final DeferredItem<Item> ELEPHANT_SPAWN_EGG = register("elephant_spawn_egg", properties -> new SpawnEggItem(SuggestionsannesfansModEntities.ELEPHANT.get(), properties));

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
