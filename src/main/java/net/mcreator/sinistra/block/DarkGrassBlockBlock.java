
package net.mcreator.sinistra.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.sinistra.itemgroup.SinistraTabItemGroup;
import net.mcreator.sinistra.SinistraModElements;

import java.util.List;
import java.util.Collections;

@SinistraModElements.ModElement.Tag
public class DarkGrassBlockBlock extends SinistraModElements.ModElement {
	@ObjectHolder("sinistra:dark_grass_block")
	public static final Block block = null;
	public DarkGrassBlockBlock(SinistraModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(SinistraTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ORGANIC).sound(SoundType.GROUND).hardnessAndResistance(0.9f, 0.9f).lightValue(0).harvestLevel(0)
					.harvestTool(ToolType.SHOVEL));
			setRegistryName("dark_grass_block");
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(DarkDirtBlock.block, (int) (1)));
		}
	}
}
