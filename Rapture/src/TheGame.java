
import java.util.Scanner;

public class TheGame {

	public static void main(String[] args) {
		
		char [] plocha = {'-','-','-','X','-','-','-'};
		
		int i = 0;
		int x = 0;
		int hrac = 3;
		
		
		  Scanner scan2 = new Scanner (System.in);
		 
		
		do {
		for (i = 0; i < plocha.length; i++) {
			System.out.print(plocha[i] + " ");
	}
		
		System.out.println("   \n" + "Zmackni: \n\n" + "1 pro krok doleva \n" + "2 pro krok doprava \n" + "0 konec hry \n");
		
		
		
			x = scan2.nextInt();
			
			System.out.println(x);
			
					
		 if (x == 1) {
			plocha[hrac] = '-';
			hrac  = hrac -1;
			if (hrac < 0) {
				hrac =0;
			}
			plocha[hrac] = 'X';
			
			}
			
		
			
			if (x == 2) {
				plocha[hrac] = '-';
				hrac  = hrac +1;
				if (hrac > 6) {
					hrac = 6;
				}
				plocha[hrac] = 'X';
								}
				
			
		
			} while (x !=0);
		
		System.out.print("hra konci");
	
		
		
		
		
		
		
	}
	
}


