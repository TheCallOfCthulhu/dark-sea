import java.util.Random;

public class GenerovaniCisel {

	public static void main(String[] args) {

Random generator = new Random ();

// cisla od 30-70
int a = generator.nextInt(40) + 30;

System.out.print(a);

	}

}
