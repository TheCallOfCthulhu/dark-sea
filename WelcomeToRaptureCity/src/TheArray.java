import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


class Student {
	
	String jmeno;
	int [] znamky;
	
	
	
	
	public Student(String jmeno, int... znamky) { //variable argument
		super();
		this.jmeno = jmeno;
		this.znamky = znamky;
	}

	public void ziskejPocetZnamek() {
		System.out.println("Pocet znamek je: " + znamky.length);
	}

	public void ziskejSoucetZnamek() {
		int soucet = 0;
		for (int znamka:znamky) {
			soucet = soucet+znamka;
					}
		System.out.println("Soucet znamek je: " + soucet);
	}

	public void ziskejNejvyssiZnamku() {
		int max = 0;
		for (int znamka:znamky) {
		if (znamka > max) {
			max = znamka;
		}
	}
		System.out.println("Nejvyssi znamka je: " + max);
	}


	}
	
///////////////////////////////////////
	
	


public class TheArray {

	public static void main(String[] args) {
		
		String [] dny = {"Pondeli","Utery","Streda","Ctvrtek","Patek"};
		
		for (String den : dny) {
			System.out.println(den.length());
		}
		
		
		
		int [] znamky = {3,1,1,2,5,4,3,2,3}; //vytvoreni pole s hodnotami
		int [] znamky2 = new int [5]; //vytvoreni Pole bez hodnot s 5 pozicemi (kazda bude mit hodnotu 0)
		znamky2 [1] = 10; //naplneni konkretni pozice konkretni hodnotou
	//	Person [] = new Person [5] ; //pole objektu, honodta je null
		
		Student student = new Student ("Emil", znamky);
		Student student2 = new Student ("Kamil", 1, 5, 7, 8);
		
		student.ziskejPocetZnamek();
		student.ziskejSoucetZnamek();
		student.ziskejNejvyssiZnamku();
		
		
		
		Arrays.fill(znamky2, 20); //naplneni hodnot do vsech pozic
		Arrays.equals(znamky2, znamky); //porovnani dvou Poli
		
		int soucet = 0;
		
	//jak vypsat vsechny hodnoty Pole//
		
		for(int mark:znamky) { //operace pro Pole cokoliv:nazevPole - pro kazdou hodnotu v poli "enahnce for loop"
			soucet = soucet + mark; //secte hodnoty znamek
			System.out.print(mark);
					}
		//NEBO//
		for (int i=0; i < znamky.length; i++) {
			System.out.print(znamky[i]);
		}
		//NEBO//
		System.out.println(Arrays.toString(znamky)); //staticka metoda pro zjisteni vsech hodnot Pole
		
			
				System.out.println(soucet);
				System.out.println(student);
				System.out.println(znamky2[1]); //zobrazi hodnotu na konkretni pozici
				System.out.println(znamky2.length); //zobrazi pocet pozic
				
				
				
				
		//////////////////////////////ARRAYLIST////////////////////////
				
				ArrayList pole = new ArrayList(); //lze pridat jakykoliv datovy typ
				ArrayList<String> pole2 = new ArrayList<String>(); //lze pridat pouze String
				pole.add("Jablko");
				pole.add("Hruska");
				pole.add("Ovoce");
				pole.add("Chleba");
				pole.remove("Hruska");
				pole.remove(2); //smaze pozici
				System.out.println(pole); //vypise hodnoty
				System.out.println(pole.size()); //vypise delku pole
		//		System.out.println(Collection.max); //
			//	pole.
				
				

	}

}
