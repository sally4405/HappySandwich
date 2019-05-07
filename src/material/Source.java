package material;

public class Source {
	String sourceName;
	int sourceNum;
	public int look;
	public int flavor;
	public int smell;
	public int health;
	public int satiety;

		
	public Source(String sourceName, int look, int flavor, int smell, int health, int satiety) {
		this.sourceName = sourceName;
		this.look = look;
		this.flavor = flavor;
		this.smell = smell;
		this.health = health;
		this.satiety = satiety;		
	}
	
	static void addSource(String sourceName) {
		
	}
}
