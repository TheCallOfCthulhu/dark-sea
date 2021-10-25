package lambda.practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AppStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		
		IntStream.range(1, 10).skip(2).forEach((x)->System.out.println(x));
		
		Stream.of("Ahoj","vole","jak").filter((x)->x.contains("o")).sorted().forEach((x)->System.out.println(x));
		
		
	}

}
