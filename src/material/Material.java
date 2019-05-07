package material;

public class Material {
	String materialName;
	int materialNum;
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
		
	public Material(String materialName, int look, int flavor, int smell, int health, int satiety,
			int calorie, int cost, int acqLow, int acqHigh, int skill) {
		this.materialName = materialName;
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
	
	
}
