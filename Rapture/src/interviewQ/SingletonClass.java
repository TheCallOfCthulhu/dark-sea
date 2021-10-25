package interviewQ;

public class SingletonClass {
	
	
	
	public class Singleton {

	     private static Singleton instance;

	     //Vytvorime soukromy konstruktor
	     private Singleton() { }
	 
	     //Metoda pro vytvoreni objektu jedinacek
	     public static Singleton getInstance() {
	     //Je-li promenna instance null, tak se vytvori objekt
	         if (instance == null) {
	             instance = new Singleton();
	         }
	         //Vratime jedinacka
	         return instance;
	     }
	 
	     //Pouziti
	     public static void main(String[] args) {
	         Singleton objekt = Singleton.getInstance();
	     }
	 }
	Ukázka kódu z Java - návrhový vzor Singleton[3]

	Druhá možnost implementace vzoru je následující:

	public class Singleton {

	    private static final Singleton instance = new Singleton();

	    private Singleton() {
	    }

	    public static Singleton getInstance() {
	        return instance;
	    }

	    // Použití je stejné
	    public static void main(String[] args) {
	        Singleton objekt = Singleton.getInstance();
	    }
	}

}
