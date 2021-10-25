package lambda.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {


	
	public static void main(String[] args) {
		
		A neco = () -> System.out.println("ahoj");
		neco.print();
		
		printit(() -> System.out.println("ahoj2"));
				
		
		B neco2 = (a, b) -> a+b;
		System.out.println(neco2.sum(5,10));
		

		Predicate<Integer> neco3 = (x) -> x > 5;
		System.out.println(neco3.test(8));
		//	public interface Predicate<T> {
		//	boolean test(T t);
		
		
		
		
	}	

	
	static public void printit (A cokoliv) {
		cokoliv.print();
	}
	
	
}

interface A {
	public void print ();
}

interface B {
	public int sum (int a, int b );
}