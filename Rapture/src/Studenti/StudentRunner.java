package Studenti;

public class StudentRunner {

	public static void main(String[] args) {
		

		int [] znamky = {99, 98, 100};
		Student student = new Student("Petr", znamky);
		
		int cislo = student.getPocetZnamek();
		System.out.println("pocet zname je: " + cislo);
		
		
		int soucet =	student.getSoucetZnamek();
	    System.out.println("soucet znamek je: " + soucet);
		
		
		
		
		
		
	}

}
