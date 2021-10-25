package DostihyASazky;

public class Starter {

	public static void main(String[] args) throws InterruptedException {
		
		
			
		
		Koni pegas = new Koni ("pegas");
		Koni napoleon = new Koni ("napoleon");
		
		System.out.println("Na startovni pozici jsou pripraveno. VSAD.");
		
		int sazka = 50;
		
		pegas.start();
		napoleon.start();
		napoleon.join();
		pegas.join();
		
		System.out.println("Poradi koniku je:\n PRVNI MISTO: " + Koni.poradi.get(0) + "\nDRUHE MISTO: " + Koni.poradi.get(1) );

		
		if ((Koni.poradi.get(0)) == "pegas") {
		int vyhra = sazka*2;
		System.out.println("vyhral si " + vyhra);
		} else System.out.println("nevyhral si");
		
	}
	
	
	

	
	

}
