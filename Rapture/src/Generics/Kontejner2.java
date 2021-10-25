package Generics;

public class Kontejner2 <A, B>{
	
	A item1;
	B item2;
	
	
	public Kontejner2(A item1, B item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
	
	
	public void vypis () {
		System.out.println(this.item1);
		System.out.println(this.item2);
	}
	
	
	
	

}
