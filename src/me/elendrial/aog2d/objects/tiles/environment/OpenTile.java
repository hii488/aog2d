package me.elendrial.aog2d.objects.tiles.environment;

import me.elendrial.aog2d.objects.tiles.AoGTile;
import me.elendrial.aog2d.objects.units.Unit;

public class OpenTile extends AoGTile {

	public OpenTile() {
		this.canPassThrough = true;
		this.tileName = "open";
	}

	@Override
	public double movementCost(Unit unit) {
		return 1;
	}

}
