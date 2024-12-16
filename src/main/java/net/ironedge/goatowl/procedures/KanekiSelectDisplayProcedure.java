package net.ironedge.goatowl.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.ironedge.goatowl.world.inventory.RizeFormSelectGUIMenu;
import net.ironedge.goatowl.world.inventory.KanekiFormSelectGUIMenu;

public class KanekiSelectDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof Player _plr0 && _plr0.containerMenu instanceof RizeFormSelectGUIMenu || entity instanceof Player _plr1 && _plr1.containerMenu instanceof KanekiFormSelectGUIMenu;
	}
}
