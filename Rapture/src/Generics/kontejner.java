package Generics;

public class kontejner <E1, E2> {

	
	E1 item1;
	E2 item2;
	
	
	public kontejner(E1 item1, E2 item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
	
	
	public void printhem () {
		System.out.println(item1);
		System.out.println(item2);
	}
}
