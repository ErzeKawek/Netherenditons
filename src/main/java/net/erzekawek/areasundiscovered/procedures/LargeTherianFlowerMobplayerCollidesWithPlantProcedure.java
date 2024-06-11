package net.erzekawek.areasundiscovered.procedures;

import net.minecraft.world.entity.Entity;

public class LargeTherianFlowerMobplayerCollidesWithPlantProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(20);
	}
}
