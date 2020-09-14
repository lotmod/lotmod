package net.mcreator.lotmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.lotmod.LotmodModElements;

import java.util.Map;

@LotmodModElements.ModElement.Tag
public class SzybkiepodrorzePlayerLeavesDimensionProcedure extends LotmodModElements.ModElement {
	public SzybkiepodrorzePlayerLeavesDimensionProcedure(LotmodModElements instance) {
		super(instance, 48);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SzybkiepodrorzePlayerLeavesDimension!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, (int) 1, (int) 8838));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, (int) 1, (int) 23245));
	}
}
