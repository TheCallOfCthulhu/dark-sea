package Generics;

import java.util.ArrayList;

public class generick <A,B>{
	
	A a;
	B b;
	
	
	
	
	public generick(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}


	public static void main (String [] args) {
		
		generick<Integer, Integer> cokoliv = new generick<> (5,5);
		
		
		
		generickametoda(cokoliv);
		
	}
	
	
	
	
	
	
	
	public static <A,B> void generickametoda (generick<A, B>) {
		int x = neco.a;
		System.out.println(neco.a + neco.b);
		
	}

}
