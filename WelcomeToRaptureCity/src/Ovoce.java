
public class Ovoce implements Comparable<Ovoce>{
	
	int cena;
	
	public Ovoce(int i) {
		this.cena = i;
	}

	@Override
	public int compareTo(Ovoce cokoliv) {
		// TODO Auto-generated method stub
		return Integer.compare(this.cena, cokoliv.cena);
	}


//	public String toString () {
//		return "cena je: " + cena;
//	}

}
