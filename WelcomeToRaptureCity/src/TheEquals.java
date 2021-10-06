
class Klient {
	private int id;

	public Klient(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Klient other = (Klient) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
	
	
}


public class TheEquals {

	public static void main(String[] args) {

		Klient klient1 = new Klient(5);
		Klient klient2 = new Klient(5);
		
System.out.println(klient1.equals(klient2));		//provna Id a je true
		

	}

}
