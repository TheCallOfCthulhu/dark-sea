
public class Customer {

	
	String jmeno;
	Adresa adresa;
	
	
	
	public Customer(String jmeno, Adresa adresa) {
		super();
		this.jmeno = jmeno;
		this.adresa = adresa;
	}
	
	public String toString () {
		return (jmeno + adresa);
	}
	
	
	
	
}
