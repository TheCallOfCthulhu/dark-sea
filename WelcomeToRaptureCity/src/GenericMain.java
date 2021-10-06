
public class GenericMain {

	public static void main(String[] args) {

String pokus = "jednorozec";
int pokus2 = 1;
		
		Generace generace = new Generace ();
		
		
		generace.pridejElement(pokus);
		generace.pridejElement(5);
		
		generace.vypisElementy();
		
		
		System.out.println(generace.vrat(pokus2));

	}

}
