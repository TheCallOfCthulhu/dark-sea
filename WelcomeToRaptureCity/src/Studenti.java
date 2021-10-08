
public class Studenti extends Person{
	
	String jmeno;
	int [] znamky;
	int speed;
	
	public Studenti () {
		this.speed = 5;
	}
	
	
	public Studenti(String jmeno, int[] znamky) {
		super();
		this.jmeno = jmeno;
		this.znamky = znamky;
	}
	
	public int soucetZnamek(int... znamky) {
		int soucet = 0;
		for (int cokoliv:znamky) {;
		soucet = soucet+cokoliv;
				}
		return soucet;
	}
	
	public String toString () {
		return "Jmenuju se" + jmeno;
	}
	

}
