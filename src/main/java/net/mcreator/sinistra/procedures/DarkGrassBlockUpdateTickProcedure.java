package net.mcreator.sinistra.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.sinistra.block.DarkDirtBlock;
import net.mcreator.sinistra.SinistraModElements;

@SinistraModElements.ModElement.Tag
public class DarkGrassBlockUpdateTickProcedure extends SinistraModElements.ModElement {
	public DarkGrassBlockUpdateTickProcedure(SinistraModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DarkGrassBlockUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DarkGrassBlockUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DarkGrassBlockUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DarkGrassBlockUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double LightLevel = 0;
		if ((true)) {
			if (((world.getLight(new BlockPos((int) x, (int) (y + 1), (int) z))) < 7)) {
				if ((!(world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z))))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DarkDirtBlock.block.getDefaultState(), 3);
				}
			}
		}
	}
}
