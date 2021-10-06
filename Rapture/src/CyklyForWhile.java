import java.util.Scanner;

public class CyklyForWhile {

	public static void main(String[] args) {
		
	Scanner SC = new Scanner (System.in);
	System.out.print("Zadej cislo");
	int x = SC.nextInt();
	
	int faktorial = 1;
	
	// WHILE cyklus //
	while ( x > 1) {
		faktorial = faktorial * x;
		x = x - 1;
		
	}
	
	System.out.print("faktorial je: " + faktorial);
	
	/*FOR cyklus
	for (i = 1; i <= x; i++)
		*/
	
	SC.close();
	
	}

}
