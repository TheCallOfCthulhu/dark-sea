import java.util.Random;

public class Randomek {

	public static void main(String[] args) {

		Random rd = new Random ();
		
		int gen1 = rd.nextInt(50); //Nahodne cisla od 0 - 50
		int gen2 = rd.nextInt(50)+10; //Nahodne cisla od 10 - 60
			
		System.out.println(gen1);
		System.out.println(gen2);
		

	}

}
