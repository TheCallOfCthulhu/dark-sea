import java.util.ArrayList;


class Popis {
	private String popis;

	public Popis(String popis) {
		super();
		this.popis = popis;
	}
	
	
}

class Adresy {
	private String ulice;
	private String mesto;
	
	
	public Adresy(String ulice, String mesto) {
		super();
		this.ulice = ulice;
		this.mesto = mesto;
	}

	public String getUlice() {
		return ulice;
	}

	public void setUlice(String ulice) {
		this.ulice = ulice;
	}

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	
	
	
	
		
}

///////////////////////////////////////////////////////////////////////////
class Zakaznici {

	private String name;
	private Adresy DomaciAdresa;
	private Adresy PracovniAdresa;
	private ArrayList <Popis> popis = new ArrayList<>();
		
	public Zakaznici(String name, Adresy domaciAdresa) {
		super();
		this.name = name;
		this.DomaciAdresa  = domaciAdresa;
	}
		
		public void pridatPopis (Popis popis2) {
			this.popis.add(popis2);
		}
		
		public String toString () {
			return String.format(name, popis);
		}
		
		public void popisek () {
			System.out.println(popis.size());
		}
	
}
	/////////////////////////////////////////////////////////////
public class TheCompositonAdresy {

	

	public static void main(String[] args) {

		Adresy adresa = new Adresy ("Herolda 2", "Ostrava");
		Zakaznici zakaznik1 = new Zakaznici ("Romca", adresa);
		Zakaznici zakaznik2 = new Zakaznici ("Jarek", adresa);

		Adresy PracovniAdresa = new Adresy ("Herolda 6", "Ostrava");
		
		
		zakaznik1.pridatPopis(new Popis ("Chytry"));
		zakaznik1.pridatPopis(new Popis ("Hodny"));
		zakaznik2.pridatPopis(new Popis ("Velky"));
		
		zakaznik1.popisek();
		zakaznik2.popisek();
	}

}
