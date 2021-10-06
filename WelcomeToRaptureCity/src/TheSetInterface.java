import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TheSetInterface {

	//Nemuzou byt v set poli dve stejne hodnoty
	//Set je immutable
	//Set pole nepouziva pozice
	//Set je dobry pro UKLADANI UNIKATNICH HODNOT
	
	public static void main(String[] args) {
		
List<Character> characters = List.of('A','Z','A','B');

		Set<String> pole = Set.of("Jablko", "Banan", "Ananas");
		System.out.println(pole); //vypis hodnot je zprehazeny
		
		Set<Character> pole8 = new TreeSet<Character>();
		pole8.addAll(characters); //vyplneni z jineho pole serazeny
		System.out.println(pole8);
		
		Set<Integer> pole2 = new HashSet<Integer>();
		pole2.add(154);
		pole2.add(20);
		pole2.add(1005);
		System.out.println(pole2); //vypis hodnot je zprehazeny
		Set<Integer> pole3 = new LinkedHashSet<Integer>();
		pole3.add(154);
		pole3.add(20);
		pole3.add(1005);
		System.out.println(pole3); //vypis hodnot je podle casu zapsani
		
		
		//TREESET
		TreeSet<Integer> pole4 = new TreeSet<>(Set.of(154,20,1005,99));
			System.out.println(pole4); //vypis hodnot je podle velikosti
			System.out.println(pole4.floor(100)); //vypis hodnotu stejnou nebo mensi nez 100
			System.out.println(pole4.lower(100)); //vypis hodnotu mensi nez 100
			System.out.println(pole4.ceiling(100)); //vypis hodnotu stejnou nebo vetsi nez 100
			System.out.println(pole4.higher(100)); //vypis hodnotu vetsi nez 100
			System.out.println(pole4.subSet(90,180)); //vypis hodnoty mezi (mimo 180)
			System.out.println(pole4.headSet(100)); //vypis hodnot nad 100
			System.out.println(pole4.tailSet(100)); //vypis hodnotpod 100
		
		
		
	}

}
