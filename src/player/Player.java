package player;

public class Player {
	String playerName;
	int level;
	int layer;
	
	public Player(String playerName, int level) {
		this.playerName = playerName;
		this.level = level;
		layer = level / 10 + 1;
	}
}
