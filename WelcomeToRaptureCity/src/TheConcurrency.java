import java.util.Scanner;

public class TheConcurrency {
	
	static int volba;

	public static void main(String[] args) {
		TheCounter counter = new TheCounter();
		volba = 3;
		
		Scanner sc = new Scanner (System.in);
		
		// TODO Auto-generated method stub
		
		System.out.println("Vyber moznost: 1 - pricti +1 / 2 - odecti -1 / 0 - konec");
		
		while (volba != 0) {
			
			volba = sc.nextInt();
			
			switch (volba) {
			case 1: counter.increment();
				break;
			case 2:counter.decrement();
				break;
			}
			System.out.println(counter.getI());
			
		}
		
		
		
	

	}

}
