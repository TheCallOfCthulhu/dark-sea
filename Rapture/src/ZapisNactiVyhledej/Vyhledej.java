package ZapisNactiVyhledej;

public class Vyhledej {
	
	static int i;
	
	public static void VyhledejTo (int [] cokoliv, int target) {
		System.out.println("Hledas cislo " + target);
		for (int x : cokoliv) {
			
			
			if (x == target) {
				 i = x;
				
			} 
		} 
		if (i == target) {
			System.out.println("JE TAM");
		} else System.out.println("NENI TAM");
			
		
	}
	

}
