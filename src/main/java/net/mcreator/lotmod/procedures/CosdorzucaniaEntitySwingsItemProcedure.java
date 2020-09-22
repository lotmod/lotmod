package net.mcreator.lotmod.procedures;

@LotmodModElements.ModElement.Tag
public class CosdorzucaniaEntitySwingsItemProcedure extends LotmodModElements.ModElement {

	public CosdorzucaniaEntitySwingsItemProcedure(LotmodModElements instance) {
		super(instance, 55);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CosdorzucaniaEntitySwingsItem!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure CosdorzucaniaEntitySwingsItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure CosdorzucaniaEntitySwingsItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure CosdorzucaniaEntitySwingsItem!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure CosdorzucaniaEntitySwingsItem!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.disableDamage = (true);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
		world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);

	}

}
