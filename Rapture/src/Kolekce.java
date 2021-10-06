import java.util.List;
import java.util.ArrayList;

public class Kolekce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> words = List.of("Jablko", "Hruska", "Citron"); //vytvori array do ktereho nelze pridavat dalsi hodnoty /immutable
		
		System.out.println(words.size()); //kolik ma Array pozic
		System.out.println(words.isEmpty()); //je Array prazdne ? True/False
		System.out.println(words.get(1)); //Jake je slovo na pozici 1
		System.out.println(words.contains("Hruska")); // Obsahuje Array slovo Hruska? True/False
		System.out.println(words.indexOf("Citron")); // na ktere pozici je slovo Citron
		System.out.println(words); //vypise slova
		
		List<String> ArrayWords = new ArrayList<String>(words); //vytvoreni Array s moznosti pridavani hodnot
		ArrayWords.add("Meloun"); //pridani nove hodnoty
		ArrayWords.add(2, "Pomeranc"); //pridani nove hodnoty na konkretni pozici
		ArrayWords.addAll(words); //pridani vsech hodnot z jineho pole
		ArrayWords.set(4, "Hrozen"); //pridani hodnoty misto jine hodnoty
	
		ArrayWords.remove(3); //odstraneni hodnoty z konkretni pozice nebo podle hodnoty ArrayWords.remove("Pomeranc")
		System.out.println(ArrayWords); //vypis pole
		
		for(int i = 0; i < ArrayWords.size(); i++) { //metoda pro vypsani vsech hodnot pomoci loopu
			System.out.println(ArrayWords.get(i));
		}
		
		for(String hovno:ArrayWords) { //metoda pro vypsani vsech hodnot pomoci loopu
			System.out.println(hovno);
		}
		
		
		
	}

}
