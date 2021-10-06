
public class Panos {
	
	int cislo;

	public Panos(int cislo) {
		super();
		this.cislo = cislo;
	}



	

	@Override
	public boolean equals(Object obj) {
		
		Panos other = (Panos) obj;
		if (cislo != other.cislo)
			return false;
		return true;
	}



//	@Override
//	public boolean equals(int ono) {
//	
//		if (cislo != ono)
//			return false;
//		return true;
//	}
	
	
	
	
	
	

}
