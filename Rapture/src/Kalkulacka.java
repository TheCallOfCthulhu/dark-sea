import java.util.Scanner;

public class Kalkulacka {
	
	
	/* metoda beznavrtoveho a bezparametroveho typu*/
	
	public static void VypisMenu () {
		
		System.out.println("Menu:");
		System.out.println("1. Scitani");
		System.out.println("2. Odecitani");
		System.out.println("3. Nasobeni");
		System.out.println("4. Deleni");
				
	}
/* bez navratu ale s parametrem*/
	public static void Secti (int scitanec1, int scitanec2) {
		System.out.println (scitanec1 + " + " + scitanec2 + " = " + (scitanec1 + scitanec2));
	}
	
	/*navratovy typ*/
	
	public static int NactiCislo () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadej cislo :");
		int cislo = sc.nextInt();
		
		return cislo;
		
	}
	
	/*navratovy typ + parametr*/
	
	public static int Odecti (int mensitel1, int mensitel2) {
		int vysledek = mensitel1 - mensitel2;
		return vysledek;
	}
	
	public static void main(String[] args) {
	
		VypisMenu();
		
		
		
		int volba = NactiCislo();
		
			if (volba == 1) {
								int a = NactiCislo();
							int b = NactiCislo();
				
				Secti(a, b);
			
			}
		
			if (volba == 2) {
			
				int x = NactiCislo();
				int y = NactiCislo();
				
				System.out.println(Odecti(x,y));
			}

	}

}
