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
	Uk?zka k?du z Java - n?vrhov? vzor Singleton[3]

	Druh? mo?nost implementace vzoru je n?sleduj?c?:

	public class Singleton {

	    private static final Singleton instance = new Singleton();

	    private Singleton() {
	    }

	    public static Singleton getInstance() {
	        return instance;
	    }

	    // Pou?it? je stejn?
	    public static void main(String[] args) {
	        Singleton objekt = Singleton.getInstance();
	    }
	}

}
