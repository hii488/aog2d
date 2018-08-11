package me.elendrial.aog2d.gameSystems.turns;

import me.elendrial.aog2d.levels.AoGLevel;

public class TurnController {
	
	// This is essentially the TickController, but rather than running on it's own and running continuously, it just forwards events to other parts of the game.
	// May remove, not strictly needed. Can be implemented as part of the AoGLevel
	
	private int amountOfPlayers;
	private int playerTurn;
	private AoGLevel parentLevel;
	
	public TurnController(int amountOfPlayers, AoGLevel level) {
		this.amountOfPlayers = amountOfPlayers;
		playerTurn = 0;
		parentLevel = level;
	}
	
	public void nextTurn() {
		endTurn();
		playerTurn ++;
		playerTurn %= amountOfPlayers;
		beginTurn();
	}
	
	private void endTurn() {
		// Not sure what'd happen here, except maybe show next player graphic?
	}
	
	private void beginTurn() {
		// Collect Mana
	}
	
}
