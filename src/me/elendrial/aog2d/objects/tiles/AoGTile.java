package me.elendrial.aog2d.objects.tiles;

import me.elendrial.aog2d.gameSystems.players.Player;
import me.hii488.gameObjects.tiles.BaseTile;

public abstract class AoGTile extends BaseTile {
	
	// Defence Bonus
	// Effect on movement
	
	public void onLoad() {}
	public void onUnload() {}
	public void updateOnTick() {}
	public void updateOnSec() {}
	
	public void select(Player p) {}  // Show some basic information
	public void deselect(Player p) {}
	
	// Almost all will default to these values, might as well have them here
	@Override
	public int getTextureState() {
		return 0;
	}

	@Override
	public int getHighestState() {
		return 0;
	}
	
	@Override
	public String getTextureKey() {
		return this.tileName;
	}
	
	@Override
	public String getTextureLocation() {
		return "textures/tiles/" + this.tileName + ".png";
	}
	
}
