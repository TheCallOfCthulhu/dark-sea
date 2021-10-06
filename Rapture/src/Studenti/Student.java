package Studenti;

public class Student {

	private String name;
	private int[] znamky;

	public Student(String name, int[] znamky) {
		this.name = name;
		this.znamky = znamky;
		
	}

	public int getPocetZnamek() {
		
		return this.znamky.length;
	}
	
	public int getSoucetZnamek() {
		int sum = 0;		
		for (int mark:znamky) { //secte vsechny hodnoty na vsech pozicich
			sum = sum + mark;
			
		}
		return sum;

	}
	
	
	
	

}
