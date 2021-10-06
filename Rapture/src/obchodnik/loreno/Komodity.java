package obchodnik.loreno;
import java.util.Random;

public class Komodity {
	
	int cena;
	String nazev;
	int pocet;

	
public String toString () {
	return ("BTC: \t" + pocet + " \t(" + (cena*pocet) + ") \t \t " + cena + "    ZM¡»KNI: 1. Nakup BTC / 2. Prodej BTC ");
}
	

	public Komodity(int cena, String nazev, int pocet) {
		this.cena = cena;
		this.nazev = nazev;
		this.pocet = pocet;
	}

	
	public void Trznice () {
		//System.out.println(nazev + cena);
	
	}
	
	
	
	

}
