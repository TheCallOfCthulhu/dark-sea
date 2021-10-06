import java.util.Scanner;

public class Agule {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cislo;
		int spatne = 0;
		
		System.out.println("11+6=");
		cislo = sc.nextInt();
		if (cislo == 17) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("19-2=");
		cislo = sc.nextInt();
		if (cislo == 17) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("11+9=");
		cislo = sc.nextInt();
		if (cislo == 20) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("14+4=");
		cislo = sc.nextInt();
		if (cislo == 18) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("4+6=");
		cislo = sc.nextInt();
		if (cislo == 10) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("15+5=");
		cislo = sc.nextInt();
		if (cislo == 20) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("17-2=");
		cislo = sc.nextInt();
		if (cislo == 15) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("15-5=");
		cislo = sc.nextInt();
		if (cislo == 10) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("20-11=");
		cislo = sc.nextInt();
		if (cislo == 9) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("9+3=");
		cislo = sc.nextInt();
		if (cislo == 12) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("12+8=");
		cislo = sc.nextInt();
		if (cislo == 20) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("11+5=");
		cislo = sc.nextInt();
		if (cislo == 16) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		System.out.println("1+9=");
		cislo = sc.nextInt();
		if (cislo == 10) {
			System.out.println("OK");
		} else {System.out.println("SPATNE");
		spatne++;
		}
		
		switch (spatne) {
		
		case 1:
			System.out.println("Tvoje znamka je 1");
			break;
		case 2:
			System.out.println("Tvoje znamka je 2");
			break;
		case 3:
			System.out.println("Tvoje znamka je 3");
			break;
		case 4:
			System.out.println("Tvoje znamka je 4");
			break;
		case 5:
			System.out.println("Tvoje znamka je 5");
			break;
			default: 
				System.out.println("Tvoje znamka je 1");
				break;
		
		}
		
		
		
	}

}
