
import java.util.Scanner;

public class TheGame2 {

	public static void main(String[] args) {
		
		char [] [] plocha = new char [11][11];
		
		int i = 0;
		int x = 0;
		int hracx = 5;
		int hracy = 5;
		
		 
		  Scanner scan2 = new Scanner (System.in);
		  /*naplneni plochy*/
		  
		  for (int radek = 0; radek < plocha.length; radek++) {
				for (int sloupec = 0; sloupec < plocha[radek].length; sloupec++) {
					
					plocha [radek][sloupec] = '-';
				}
			}
		  plocha [hracx] [hracy] = 'X';
		 
		
		do {
			for (int radek = 0; radek < plocha.length; radek++) {
				for (int sloupec = 0; sloupec < plocha[radek].length; sloupec++) {
					
					System.out.print(plocha[radek] [sloupec] + " ");
				}
				System.out.println();
			}
		System.out.println("Zmackni 4: Doleva");
		System.out.println("Zmackni 6: Doprava");
		System.out.println("Zmackni 8: Nahoru");
		System.out.println("Zmackni 5: Dolu");
		System.out.println("Zmackni 0: Vypni hru");
		
		
		
		
			x = scan2.nextInt();
			
			System.out.println(x);
			
			
					
		 if (x == 1) {
			plocha[hracx][hracy] = '-';
			hracy  = hracy -1;
			if (hracy < 0) {
				hracy =0;
			}
			plocha[hracx][hracy] = 'X';
			
			}
			
		/*
			
			if (x == 2) {
				plocha[hrac] = '-';
				hrac  = hrac +1;
				if (hrac > 6) {
					hrac = 6;
				}
				plocha[hrac] = 'X';
								}
				*/
			
		
			} while (x !=0);
		
		System.out.print("hra konci");
	
		
		
		
		
		
		
	}
	
}


