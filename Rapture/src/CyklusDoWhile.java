import java.util.Scanner;

public class CyklusDoWhile {
	
	public static void main(String[] args) {

		Scanner SC = new Scanner (System.in);
	
		int x = 0;
	
		do {
			System.out.print(" Zadej cislo");
			x = SC.nextInt();
			System.out.print(" Zadal jsi cislo: " + x);
			} while (x >= 0);
	
			System.out.print(" Cislo je zaporne, program konci");
	
	SC.close();
	
	}
	
}
