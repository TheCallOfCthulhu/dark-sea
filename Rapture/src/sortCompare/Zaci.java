package sortCompare;

public class Zaci implements Comparable<Zaci>{
	
	String jmeno;
	int vek;
	
	
	public Zaci(String jmeno, int vek) {
		super();
		this.jmeno = jmeno;
		this.vek = vek;
	}


	
	@Override
	public String toString() {
		return "Zaci [jmeno=" + jmeno + ", vek=" + vek + "]";
	}



	public int compareTo(Zaci that) {
		
		
		return Integer.compare(this.vek, that.vek);
	}
	
	

}
