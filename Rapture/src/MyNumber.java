
public class MyNumber {

	
	int cislo;
	//int i = 0;

	public MyNumber(int cislo) {
		super();
		this.cislo = cislo;
	}
	
	
	public void pyramida () {
		for (int i = 1; i <= cislo ; i++) {
			for (int x = 1; x <=i; x++) {
			System.out.print(x);
			}
		System.out.println();
			}
		
		
	}
	
	
}
