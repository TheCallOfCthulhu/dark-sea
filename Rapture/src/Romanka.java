import java.util.Scanner;




public class Romanka {

	public static void main(String[] args) {
		
		System.out.println("Pro vstup do programu si overim tvuj vek. Zadej kolik ti je roku.");
		Scanner age = new Scanner (System.in);
		int vek = age.nextInt();
		
		if (vek == 34) {
			
		
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ahoj Romanko, \n\n Ja jsem program jmenem Jari. Jak se mas? (dobre/spatne)");
		
		String jaksemas = sc.nextLine();
		
		String a = "dobre";
		String b = "ano";
		
		
				
		if (jaksemas.equals(a)) {
			
			System.out.println("To rad slysim. A co ted delas?");
			
			Scanner sc2 = new Scanner (System.in);
			String delas = sc2.nextLine();
			
			System.out.println("Rikas " + delas + "? Hmm, zajimave, a nechtela by sis se mnou zahrat nejakou deskovku?(ano/ne)");
			
			Scanner sc3 = new Scanner (System.in);
			String deskovka = sc3.nextLine();
			
			if (deskovka.equals(b)) {
				System.out.println("Super, ja taky. A nebojis se ze te rozdrtim?");
				Scanner sc4 = new Scanner (System.in);
				String rozdrtim = sc4.nextLine();
				
				System.out.println("Haha. Tak to by ses mela bat! :P \n Ukoncuji program papa");
				
			} else {
				System.out.println("Tak si naprd! Ukoncuji program papa");
			}
			
		} else {
			System.out.println("To je blby. Jaktoze se mas spatne?");
						
			Scanner sc5 = new Scanner (System.in);
			String blby = sc5.nextLine();

			
			System.out.println("Aha. Tak ja mam napad na rozveseleni, chces si zahrat nejakou deskovku? (ano/ne)");
			Scanner sc6 = new Scanner (System.in);
			String deskovka = sc6.nextLine();
			
			if (deskovka.equals(b)) {
				System.out.println("Super, ja taky. A nebojis se ze te rozdrtim?");
				Scanner sc7 = new Scanner (System.in);
				String rozdrtim2 = sc7.nextLine();
				System.out.println("Haha. Tak to bys mela bat! :P \n Ukoncuji program papa");
				
			} else {
				System.out.println("Tak si naprd! Ukoncuji program papa");
				
			}
			
		}
		
} else {
			
	System.out.println("Kecas! Overeni selhalo. Vypinam program");
		}
		
	
	
		

	}

}
