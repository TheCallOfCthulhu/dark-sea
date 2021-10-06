
public class TheException {

	public static void main(String[] args) {


		Metoda2();
		System.out.println("Konec metody 1");
				

	}
	
	
	public static void Metoda2 () {
		Metoda3();
		System.out.println("Konec metody 2");
	}
	
	public static void Metoda3 () {
		//try { 												//try catch block - schova hlasku a bude pokracovat v dalsi metodach
					String str = null;
					str.length();
					System.out.println("Konec metody 3");
	//	} catch (Exception ex) {
	//	}
		/*{							// konci catch blok
		}
			ex.printStackTrace();							//vypise excpetions uzivateli, bez toho nevi ze nehae expetion nastalo
		} finally {											 //posledni operace ktera se ma jeste vykonat - vzdycky se vykona i kdyz neni chyba
			System.out.println("Chyba byla podchycena");
		}*/
	}
	

}
