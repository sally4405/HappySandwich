package bestSandwichTest;

import java.util.ArrayList;

import material.Bread;
import material.Material;
import material.Source;

public class Test {

	
	public static void main(String[] args) {
		
		Bread[] bread = new Bread[2];
		Material[] material = new Material[2];
		Source[] source = new Source[3];
		ArrayList<Sandwich> sandwich = new ArrayList<Sandwich>(); 
		
		for(int i = 0; i < bread.length; i++) {
			sandwich.add(new Sandwich(i, bread[i].look, bread[i].flavor, ));
			 
			for(int j = 0; j < material.length; j++) {
				
			}
		}

		
/*		
		next = next.good[i];
		sandwich[i].smell += next.smell;
		sandwichT = (sandwichT > sandwich[i].total)? sandwichT : sandwich[i].total;
*/		
	}

}
