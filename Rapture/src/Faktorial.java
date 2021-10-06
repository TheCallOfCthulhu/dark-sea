import java.util.Scanner;

public class Faktorial {

	public static void main(String[] args) {
		
		System.out.println("Zadej cislo pro vypocet faktorialu:");
		Scanner vstup = new Scanner(System.in);
		
		long x = vstup.nextLong();
		long fakt = 1;
		long i = 0;
		
		for (i = 1; i <= x; i++) {
			
			fakt = fakt * i;
			System.out.println(i);
			System.out.println(fakt);
			
		}
		
		System.out.println(i);
		
		System.out.println("Faktorial cisla " + x + " je: " + fakt);
		
		
		
		vstup.close();
		
		
		
		
		
		

	}

}
