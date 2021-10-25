package adresar.zamestnancu;

public class Zamestnanci {
	
	String jmeno;
	String prijmeni;
	String email;
	int emailcapacity;
	String password;
	
	//konstruktor///
	public Zamestnanci(String jmeno, String prijmeni) {
		super();
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
	}
	
	public void nastav () {
		nastavemail ();
		nastavenihesla ();
	}
	
	public void zmenahesla (String noveheslo) {
		this.password = noveheslo;
	}
	
	
	private  void nastavemail () {
		this.email = this.jmeno+ "." + this.prijmeni + "@spaceX.com";
		System.out.println(email);
	}
	
	private void nastavenihesla () {
		this.password =this.prijmeni.substring(0, 5) + this.jmeno.substring(0, 3);
	}

}
