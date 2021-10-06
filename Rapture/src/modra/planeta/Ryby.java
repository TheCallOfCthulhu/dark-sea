package modra.planeta;

public class Ryby extends Zvirata {
	
	public Ryby(String jmeno) { /* musime stejny konstruktor jako parretn class zvirata */
		super(jmeno);
	
	}

	String ploutev;  /* pouze pro ryby */
	
	
	
	

	public void pohniSe () { /* override method pokud ma paretn class stejnou neabstraktni metodu*/
		System.out.println("plave");
	}
	
		public void uplavej () {  /* pouze pro Ryby, nema to parrent class */
			System.out.println("uplavala");
		}
			
			public void ploutev () {  /* pouze pro Ryby, nema to parrent class */
				System.out.println("moje ploutev je " + ploutev);
		
	}
	
	
}
