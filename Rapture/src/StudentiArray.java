import java.util.Arrays;

public class StudentiArray {

	public static void main(String[] args) {
		
		
		int [] znamky = {75, 60, 56}; // vytvoreni pole se tremi pozicemi naplnenymi hodnotami
		int [] cisla = new int[5]; // vytvoreni pole se tremi pozicemi bez hodnot (0)
		Cars [] Renaulty = new Cars[5]; //vytvoreni pole objektu (defaultni hodnota je null)
		
		
		cisla[1] = 8; // prirazeni hodnoty konkretni pozici 8ku na pozici 1
		Arrays.fill(cisla, 100); // priradi vsem pozicim cislo 100
		Arrays.sort(cisla); // seradi hodnoty podle velikosti
		
		int sum = 0;		
		for (int mark:znamky) { //secte vsechny hodnoty na vsech pozicich
			sum = sum + mark;
		}
		
		for (int mark:znamky) { //vypise vsechny hodnoty na vsech pozicich
			System.out.print(mark + " ");
		}
		
	
		for (int i=0; i<znamky.length; i++) { //vypise vsechny hodnoty
			System.out.println(znamky[i]);
		}
		
		System.out.println(sum);
		System.out.println(cisla[1]); //vypise hondotu na pozici pole 1
		System.out.println(Arrays.toString(znamky)); //vypise vsechny hondoty
		System.out.println(cisla.length); //kolik ma pole pozic
	}

}
