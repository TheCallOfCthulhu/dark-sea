package zoo.zlin;

public abstract class Zvire {
	
	String nazev;
	int velikost;
	String lokace;
	
	
	//konstruktor s dynamickymi promenami (musi se zadat hodnoty pri vytvareni instanci)
	public Zvire(String nazev, int velikost, String lokace) {
		super();
		this.nazev = nazev;
		this.velikost = velikost;
		this.lokace = lokace;
	}
	
	public void InfoO () {
		System.out.println("Druh: " + nazev + ", Velikost: " + velikost + "cm, " + "Lokace: " + lokace);
		SpecialInfo();
		}
	
	abstract public void SpecialInfo (); //abstraktni metoda - musi se definovat v podTride
	
	public void Pohyb () {
		
	}
	
	

	
	
	
	
	
	
}
