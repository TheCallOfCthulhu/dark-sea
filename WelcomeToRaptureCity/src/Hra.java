import java.util.Random;
import java.util.Scanner;

public class Hra {
	static int z = 2;
	static int y = 2;
	
	static int [] []pole = {{1,2,3,2,1},{1,2,3,2,1},{1,2,3,2,1},{1,2,3,2,1},{1,2,3,2,1}};

	//vypis pole
	
	public static void vypisPole () {
		pole [y] [z] = 10;
		for (int i=0; i<pole.length; i++) {
	
				for (int j=0; j<pole[i].length; j++) {
					
					System.out.print(" (" +pole[i][j] + ") ");
					
								}
		System.out.println();
		
			}
		
		}
	
	
	public static void main(String[] args) {
	
		Random random = new Random ();
		Scanner sc = new Scanner (System.in);
		
		
	
		
		
	
		pole [y] [z] = 10;
		
		vypisPole();
	
		int volba = 8;
		
		while (volba != 0) {
		
			volba = sc.nextInt();
	
		switch (volba) {
		case 1: { 
			pole [y] [z] = random.nextInt(5);
			z = z-1;
			vypisPole();	
			break;
					}
	
		
		case 2: {
			pole [y] [z] = random.nextInt(5);
			y = y+1;
			vypisPole();
			break;
					}
		
		case 3: {
			pole [y] [z] = random.nextInt(5);
			z = z+1;
			vypisPole();
			break;
			
		}
		case 5: {
			pole [y] [z] = random.nextInt(5);
			y = y-1;
			vypisPole();
			break;
		}
				
		
		}
		
		}
		/*naplneni pole
		for (int i=0; i<pole.length-1; i++) {
			for (int j = 0; j<pole[0].length-1; j++) {
				pole[i][j] = 
			}
			
		}*/
		
		

	}

}
