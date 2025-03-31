
package net.mcreator.suggestionsannesfans.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 150, 3.5f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("suggestionsannesfans:c_repair_items")));

	public CItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1f, -3f, properties);
	}
}
