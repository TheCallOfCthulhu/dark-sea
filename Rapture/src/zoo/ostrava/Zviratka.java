package zoo.ostrava;

public class Zviratka {

	int vyska;
	int vaha;
	String nazev;
	
	public Zviratka(int vyska, int vaha, String nazev) {
		super();
		this.vyska = vyska;
		this.vaha = vaha;
		this.nazev = nazev;
	}
	
	public void vypis() {
		System.out.println("vyska:" + vyska);
		System.out.println("vaha:" + vaha);
		System.out.println("nazev:" + nazev);
		
	}
	
	public int getvyska() {
		return this.vyska;

	}
	
	
	
}
