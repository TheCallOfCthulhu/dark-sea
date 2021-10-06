package zoo.zlin;

public interface Ryby {

	
	int MaxPloutvi = 8; //neni variable ale static constanta - nelze zmenit
	String ErrorMSG = ("Nemuze mit tolik ploutvi"); //neni variable ale static constanta - nelze zmenit
	
	public void KolikPloutvi(int x); //abstraktni metoda
	
	default void KolikJeMaxPLoutvi () { //pouze default metoda muze mit body v interface
		System.out.println(MaxPloutvi);
		AKolikMaZubu(); //volani privatni metody
	}
	
	private void AKolikMaZubu () { //privatni metoda
		System.out.println("150");
	}
	
	
	
	
	
	
	
	
}
