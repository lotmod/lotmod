package net.mcreator.lotmod.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.lotmod.LotmodModElements;

import java.util.Map;

@LotmodModElements.ModElement.Tag
public class KilofyRightClickedInAirProcedure extends LotmodModElements.ModElement {
	public KilofyRightClickedInAirProcedure(LotmodModElements instance) {
		super(instance, 36);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure KilofyRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).addExperienceLevel((int) 6677);
	}
}
