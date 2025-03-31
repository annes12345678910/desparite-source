
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.suggestionsannesfans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.suggestionsannesfans.entity.TermiteQueenEntity;
import net.mcreator.suggestionsannesfans.entity.TermiteKingEntity;
import net.mcreator.suggestionsannesfans.entity.TermiteEntity;
import net.mcreator.suggestionsannesfans.entity.ShrimpEntity;
import net.mcreator.suggestionsannesfans.entity.QueenEntity;
import net.mcreator.suggestionsannesfans.entity.PrincessEntity;
import net.mcreator.suggestionsannesfans.entity.PrinceEntity;
import net.mcreator.suggestionsannesfans.entity.PigeonEntity;
import net.mcreator.suggestionsannesfans.entity.PenguinEntity;
import net.mcreator.suggestionsannesfans.entity.OstrichEntity;
import net.mcreator.suggestionsannesfans.entity.KingEntity;
import net.mcreator.suggestionsannesfans.entity.ElephantEntity;
import net.mcreator.suggestionsannesfans.entity.CrocodileEntity;
import net.mcreator.suggestionsannesfans.entity.BlueCatFishEntity;
import net.mcreator.suggestionsannesfans.entity.BeamEntity;
import net.mcreator.suggestionsannesfans.SuggestionsannesfansMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SuggestionsannesfansModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, SuggestionsannesfansMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<BlueCatFishEntity>> BLUE_CAT_FISH = register("blue_cat_fish",
			EntityType.Builder.<BlueCatFishEntity>of(BlueCatFishEntity::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.5f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<PigeonEntity>> PIGEON = register("pigeon",
			EntityType.Builder.<PigeonEntity>of(PigeonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShrimpEntity>> SHRIMP = register("shrimp",
			EntityType.Builder.<ShrimpEntity>of(ShrimpEntity::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.4f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<BeamEntity>> BEAM = register("beam",
			EntityType.Builder.<BeamEntity>of(BeamEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrincessEntity>> PRINCESS = register("princess",
			EntityType.Builder.<PrincessEntity>of(PrincessEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<QueenEntity>> QUEEN = register("queen",
			EntityType.Builder.<QueenEntity>of(QueenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PrinceEntity>> PRINCE = register("prince",
			EntityType.Builder.<PrinceEntity>of(PrinceEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<KingEntity>> KING = register("king",
			EntityType.Builder.<KingEntity>of(KingEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrocodileEntity>> CROCODILE = register("crocodile",
			EntityType.Builder.<CrocodileEntity>of(CrocodileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.8f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<OstrichEntity>> OSTRICH = register("ostrich",
			EntityType.Builder.<OstrichEntity>of(OstrichEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TermiteEntity>> TERMITE = register("termite",
			EntityType.Builder.<TermiteEntity>of(TermiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TermiteQueenEntity>> TERMITE_QUEEN = register("termite_queen",
			EntityType.Builder.<TermiteQueenEntity>of(TermiteQueenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PenguinEntity>> PENGUIN = register("penguin",
			EntityType.Builder.<PenguinEntity>of(PenguinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TermiteKingEntity>> TERMITE_KING = register("termite_king",
			EntityType.Builder.<TermiteKingEntity>of(TermiteKingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElephantEntity>> ELEPHANT = register("elephant",
			EntityType.Builder.<ElephantEntity>of(ElephantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(SuggestionsannesfansMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		BlueCatFishEntity.init(event);
		PigeonEntity.init(event);
		ShrimpEntity.init(event);
		PrincessEntity.init(event);
		QueenEntity.init(event);
		PrinceEntity.init(event);
		KingEntity.init(event);
		CrocodileEntity.init(event);
		OstrichEntity.init(event);
		TermiteEntity.init(event);
		TermiteQueenEntity.init(event);
		PenguinEntity.init(event);
		TermiteKingEntity.init(event);
		ElephantEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLUE_CAT_FISH.get(), BlueCatFishEntity.createAttributes().build());
		event.put(PIGEON.get(), PigeonEntity.createAttributes().build());
		event.put(SHRIMP.get(), ShrimpEntity.createAttributes().build());
		event.put(PRINCESS.get(), PrincessEntity.createAttributes().build());
		event.put(QUEEN.get(), QueenEntity.createAttributes().build());
		event.put(PRINCE.get(), PrinceEntity.createAttributes().build());
		event.put(KING.get(), KingEntity.createAttributes().build());
		event.put(CROCODILE.get(), CrocodileEntity.createAttributes().build());
		event.put(OSTRICH.get(), OstrichEntity.createAttributes().build());
		event.put(TERMITE.get(), TermiteEntity.createAttributes().build());
		event.put(TERMITE_QUEEN.get(), TermiteQueenEntity.createAttributes().build());
		event.put(PENGUIN.get(), PenguinEntity.createAttributes().build());
		event.put(TERMITE_KING.get(), TermiteKingEntity.createAttributes().build());
		event.put(ELEPHANT.get(), ElephantEntity.createAttributes().build());
	}
}
