import java.util.List;
import java.util.stream.IntStream;

public class StreamFuncionality {

	public static void main(String[] args) {
		
		
		List <Integer> cisla = List.of(25,1,435,435,45);
		
		cisla.stream().sorted().forEach(element -> System.out.println(element));
		System.out.println("\n");
		
		List <String> ovoce = List.of("Jablko","Hruska","Meloun","Ciron");
		ovoce.stream().map(hovno->hovno.toLowerCase()).forEach(element -> System.out.println(element));
		System.out.println("\n");

	//	IntStream.range(1, 11).reduce(0, (n1, n2) -> (n1+n2));
		int sum = cisla.stream().sorted().reduce(0, (element1, element2) -> element1 + element2); //0-poatenci hodnota, pro prvni a druhy element -> secti je
		System.out.println(sum);
		
		List.of(25,1,435,435,45).stream().filter(e -> e%2==1).forEach(element -> System.out.println(element));
		List.of(25,1,435,435,45).stream().filter(e -> e%2==1).forEach(System.out::println); //method reference
		
		

		
	}

}
