
enum Planets {
	MERKUR("Merkur", 1, 200),
	VENUSE("Venuše", 2, 100),
	ZEME("Zemì", 3, 25),
	MARS("Mars", 4, 50);
	
String nazev;
int vzdalenost;
int teplota;
	
	

	private Planets(String nazev, int vzdalenost, int teplota) {
		this.nazev = nazev;
		this.vzdalenost = vzdalenost;
		this.teplota = teplota;
	}
	
	
}



public class Planety {
	
	

	public static void main(String[] args) {
		
		
		
		Planets mojePlaneta1 = Planets.VENUSE;
		Planets mojePlaneta2 = Planets.MERKUR;
		Planets mojePlaneta3 = Planets.ZEME;
		Planets mojePlaneta4 = Planets.MARS;
		System.out.print(Planets.ZEME.nazev);
		System.out.print(Planets.values();
		vypis(mojePlaneta1);
	
	}
	
	
	static void vypis (Planets mojePlaneta) {
		System.out.print("Nazev: " + mojePlaneta.nazev + "\nVzdalenost od Slunce: " + mojePlaneta.vzdalenost + "\nPrumerna teplota: " + mojePlaneta.teplota);
	}
	
	
	
	

}
