package bestSandwichTest;

import material.Bread;
import material.Material;
import material.Source;

public class BreadInfo {

	public static void main(String[] args) {
/*		String breadName;
		int breadNum;
		int look;
		int flavor;
		int smell;
		int health;
		int satiety;
	//	int total = (look + flavor + smell + health + satiety);
		int calorie;
		int cost;
		int acqLow;
		int acqHigh;
	//	int acqAve = (acqLow + acqHigh) / 2;
*/		

		Bread[] bread = new Bread[2];
		bread[0] = new Bread("흰 빵", 2,2,2,2,2,169,5,1,2,1);
		bread[1] = new Bread("수제 흰빵", 2,2,2,3,3,154,10,2,6,1);
		
		
		Material[] material = new Material[2];
		material[0] = new Material("계란 샐러드", 3,2,1,1,5,64,6,2,6,1);
		material[1] = new Material("오이", 2,3,2,4,2,2,4,3,7,2);

	
		Source[] source = new Source[3];
		source[0] = new Source("밀가루", 0,0,0,0,0);		
		source[1] = new Source("우유", 0,0,0,0,0);		
		source[2] = new Source("계란 노른자", 30,0,0,0,0);

	
	}

}
