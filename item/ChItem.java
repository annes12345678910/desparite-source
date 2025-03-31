
package net.mcreator.suggestionsannesfans.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ChItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 100, 3.5f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("suggestionsannesfans:ch_repair_items")));

	public ChItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, -3f, properties);
	}
}
