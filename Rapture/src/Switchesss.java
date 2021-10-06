import java.util.Scanner;

public class Switchesss {

	public static void main(String[] args) {
		
		System.out.println("Jak se mas?");
		System.out.println("1: Dobre");
		System.out.println("2: Spatne");
		System.out.println("3: Na Hovno");
		System.out.println("4: OK");
		
		Scanner sc = new Scanner(System.in);
		
		int vstup = sc.nextInt();
		
		int volba1 = vstup;
	
		switch (volba1) {
		case 1: System.out.println("Tak to je fajn");
		break;
		case 2: System.out.println("Hm, jakto?");
		break;
		case 3: System.out.println("Coze???");
		break;
		case 4: System.out.println("Fajn");
		}
		
		

	}

}
