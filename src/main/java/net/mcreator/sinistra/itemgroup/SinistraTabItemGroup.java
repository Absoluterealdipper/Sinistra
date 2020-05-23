
package net.mcreator.sinistra.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.sinistra.block.DarkStoneBlock;
import net.mcreator.sinistra.SinistraModElements;

@SinistraModElements.ModElement.Tag
public class SinistraTabItemGroup extends SinistraModElements.ModElement {
	public SinistraTabItemGroup(SinistraModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsinistra_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DarkStoneBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
