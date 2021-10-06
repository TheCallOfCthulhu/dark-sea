import java.util.Random;

public class MetodyPole {
	
	
	public static void VypisPole (int [] pole) {
		for (int i = 0; i < pole.length; i++) {
			System.out.print(pole[i] + ", ");
		}
	}
	
	public static void NaplnPole (int [] pole) {
		
		Random rd = new Random ();
		
		for (int i = 0; i <pole.length; i++) {
			pole[i] = rd.nextInt(50);
		}
		
	}

	public static void main(String[] args) {
		
		int policko [] = new int [20];
		
		VypisPole(policko);
		
		NaplnPole (policko);
		
		VypisPole(policko);
			
		}
	
		
	}


