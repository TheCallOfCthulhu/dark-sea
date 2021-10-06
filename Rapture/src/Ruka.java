
public class Ruka {

	public int pocetPrstu;
	
	
	String [] prsty = {"malicek","prstenicek","prostrednicek","ukazovacek","palec"};
	
	/*konstruktor*/
	public Ruka(int arg) {
		super();
		this.pocetPrstu = arg;
	}
	
	
	/*metoda get*/
	public int kolikMamTedPrstu () {
			
		return pocetPrstu;
	}
	


	/*metoda set*/
	public void  uberMiPrst (int prst) {
		System.out.println("Text z objektu Ruka");
			this.pocetPrstu = this.pocetPrstu - prst;
	}


	
}
