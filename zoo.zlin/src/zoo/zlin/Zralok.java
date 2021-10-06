package zoo.zlin;

public class Zralok extends Zvire implements Ryby{
	
	int ploutve = 6;

	public Zralok(String nazev, int velikost, String lokace) {
		super(nazev, velikost, lokace);
		
	}

	public void Pohyb () {
		System.out.println("Zralok plave");
	}

	public void SpecialInfo() {
		System.out.println(nazev + " obcas zere lidi");
		
	}
	public void KolikJeMaxPLoutvi () { //prepisuje default metodu interface
		System.out.println("Zralok muze mit maximlane 6 ploutvi");
	}

	public void KolikPloutvi() {
		if (ploutve >= MaxPloutvi) { //zde pracujem s konstantou interfacu
			System.out.println(ErrorMSG);
	} else {
		System.out.println(nazev + " ma 5 ploutvi");
	}
	}
	
}