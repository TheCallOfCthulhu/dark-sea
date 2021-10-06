package zoo.zlin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).forEach(System.out::println);
		
		Files.walk(Paths.get("."), 4).forEach(System.out::println);
		
		Files.find(Paths.get("."), 4, matcher).forEach(System.out::println);
		
		

	}

}
