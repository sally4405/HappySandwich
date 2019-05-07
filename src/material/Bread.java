package material;

public class Bread {
	String breadName;
	int breadNum;
	public int look;
	public int flavor;
	public int smell;
	public int health;
	public int satiety;
	public int total = (look + flavor + smell + health + satiety);
	public int calorie;
	public int cost;
	public int acqLow;
	public int acqHigh;
	public int acqAve = (acqLow + acqHigh) / 2;
	public int skill;
		
	public Bread(String breadName, int look, int flavor, int smell, int health, int satiety,
			int calorie, int cost, int acqLow, int acqHigh, int skill) {
		this.breadName = breadName;
		this.look = look*100;
		this.flavor = flavor*100;
		this.smell = smell*100;
		this.health = health*100;
		this.satiety = satiety*100;
		this.calorie = calorie*100;
		this.cost = cost;
		this.acqLow = acqLow;
		this.acqHigh = acqHigh;
		this.total = (look + flavor + smell + health + satiety)*100;
		this.acqAve = (acqLow + acqHigh) / 2;
		this.skill = skill;
	}

	@Override
	public String toString() {		
		return breadName + "의 외관은 " + look + "점, 맛은 " + flavor + "점, 냄새는 " + smell + 
				"점 입니다!";
	}

	
}
