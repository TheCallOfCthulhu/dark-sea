import java.util.Scanner;

 

public class KdoJeNejvetsi {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.print("Zadej prvni cislo");
		byte a = SC.nextByte();
		System.out.print("Zadej druhe cislo");
		byte b = SC.nextByte();
		System.out.print("Zadej treti cislo");
		byte c = SC.nextByte();
				
		if (a > b) {
			if (a > c) {
				System.out.print(a);			
						}
			else {
				System.out.print(c);
				}
					}
		else {
			if (b > c) {
				System.out.print(b);
			}
			else {
				System.out.print(c);
		}
		
		}
		SC.close();


}
}
