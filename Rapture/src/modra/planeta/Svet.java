package modra.planeta;

public class Svet {

	public static void main(String[] args) {
		
	Zvirata kapr = new Ryby("Ryba"); /* musime naplnit udaje bo je konstruktor dynamicky */
	Zvirata sokol = new Sokol("Sokol");
	
	
		Zvirata vlastovka = new Ptaci("Vlastovka");
		Sokol sokolek = new Sokol ("Sokol");
		
		
		Zvirata.staticke();
		
	//	sokol.pohniSe();
		
	//	kapr.pohniSe();
		
		pohniZviraty(sokol);
	}
		
		public static void pohniZviraty(Zvirata zvirata) {
			zvirata.pohniSe();
			
		}
		
	//	pohniZviraty(kapr);
			
		
	//	public static void pohniZviraty (Zvirata animal) {
	//		zvirata.pohniSe();
	//	}
		

		
	}


