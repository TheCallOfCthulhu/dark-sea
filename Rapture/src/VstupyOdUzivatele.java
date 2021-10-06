import java.util.Scanner;

public class VstupyOdUzivatele {

	public static void main(String[] args) {
		
		boolean konec = false;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Zadej vetu: ");
		sc.next(); //musi se udelat flush scanneru
		String string = sc.nextLine();
		System.out.println(string);
		
		
		while (konec == false) {
			 
		System.out.println("\n");
		System.out.println("Chces zadat: ");
		System.out.println("1. Int");
		System.out.println("2. Double");
		System.out.println("3. String");
		System.out.println("4. Char");
		System.out.println("0. Char");
		
		switch (sc.nextInt()) {
		
			case 1:
				System.out.println("Zadej cele cislo: ");
				int i = sc.nextInt();
				System.out.println("Zadal si Int: " + i);
				break;
				
			case 2:
				System.out.println("Zadej realne cislo: ");
				double e = sc.nextDouble();
				System.out.println("Zadal si realne: " + e);
				break;
				
			case 3:
				System.out.println("Zadej vetu: ");
				sc.next(); //musi se udelat flush scanneru
				String a = sc.nextLine();
				System.out.println(a);
				break;
				
			case 4:
				System.out.println("Zadej znak: ");
				char o = sc.next().charAt(0);
				System.out.println("Zadal si znak: " + o);
				break;
		
			case 0:
				konec = true;
				break;
		}

		}

		
		sc.close();
		
	}

}
