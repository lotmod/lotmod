package net.mcreator.lotmod.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.lotmod.LotmodModElements;

import java.util.Map;

@LotmodModElements.ModElement.Tag
public class TntmocneOnKeyReleasedProcedure extends LotmodModElements.ModElement {
	public TntmocneOnKeyReleasedProcedure(LotmodModElements instance) {
		super(instance, 32);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure TntmocneOnKeyReleased!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.isFlying = (false);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
	}
}
