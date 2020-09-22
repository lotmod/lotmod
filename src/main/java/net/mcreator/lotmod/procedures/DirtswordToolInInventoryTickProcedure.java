package net.mcreator.lotmod.procedures;

@LotmodModElements.ModElement.Tag
public class DirtswordToolInInventoryTickProcedure extends LotmodModElements.ModElement {

	public DirtswordToolInInventoryTickProcedure(LotmodModElements instance) {
		super(instance, 54);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure DirtswordToolInInventoryTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getFoodStats().setFoodLevel((int) 100);

	}

}
