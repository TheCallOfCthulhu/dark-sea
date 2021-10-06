package modra.planeta;

public abstract class Zvirata {

	/* atributy */
	String jmeno;
	
	
	/* konstrutor - dynamicka promenna */
	public Zvirata(String jmeno) {
		super();
		this.jmeno = jmeno;
	}
	
	
	static void staticke () {
		System.out.println("Ahoj, to jsem zase ja.");
	}
	
	/* konstruktor - pevne dana promenna */
	
	/*   public Zvirata () {
		jmeno = "Zvire";
	}   */

	public abstract void pohniSe ();
		
		public void mluv () {
			System.out.println("jsem " + jmeno);
	
	}
	
	
}
