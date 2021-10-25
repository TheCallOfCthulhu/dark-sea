package JakNejrychlejiVyhledatCisloVPoli;

import java.util.Random;

public class RychleVyhledavani {
	
	
	public static void main(String [] args) {
		
	
		
		boolean nasel = false;
		int target = 280;
		int c = 0;
		
		System.out.println("hleda se cislo " + target);
		int xc = 5/2;
		System.out.println(xc);
		
		Random rd = new Random ();
		
		int [] pole = new int [40];
		
		
		//naplneni pole
		for (int i = 0; i < pole.length; i++) {
				pole [i] = 10*i;
		}
		
		
		//vypis pole
		for (int policko1 : pole) {
			System.out.print(" " + policko1);
		}
		System.out.println();
		
		
//		//vyhledavani po jednom
		for (int policko : pole) {
			System.out.print(policko + " ");
			c++;
				if (policko == target) {					
					nasel = true;
									}
						
		}
		
//		//vyhledavani napul
//		int napul = pole.length/2;
//		
//		while (nasel != true) {
//		if (pole[napul] > target) {
//			napul = napul/2;
//			c++;
//			
//		} else if ((pole[napul] < target)) {
//			napul = napul+10;
//			c++;
//		} else {
//			nasel = true;
//			c++;
//		}
//		}
		
		
		//vysledek
		if (nasel == true) {
		System.out.println("NALEZENO" + target + " = " + target);
		System.out.println("pocet pokusu " + c);
		} else System.out.println("\nNENALEZENO");
		
		
		
		
		
		
		
	
		
		
		
	}

}
