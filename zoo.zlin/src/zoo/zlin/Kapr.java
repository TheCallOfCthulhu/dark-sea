package zoo.zlin;

public class Kapr extends Zvire implements Ryby {

	public Kapr(String nazev, int velikost, String lokace) {
		super(nazev, velikost, lokace);
		
	}

	public void Pohyb () {
		System.out.println("Ryba plave");
	}

	
	public void SpecialInfo() {
		System.out.println(nazev + " se podava na Vanoce");
		
	}

	
	public void KolikPloutvi() {
		System.out.println(nazev + " ma 4 ploutve");
		
	}
	
	
	
	
	
	
	
	
	
	
}
