import java.util.Scanner;

public class Pocitadlo {
	public static int o;
	
	public void pokusAOmyl () {
		int k=1;
		System.out.println(k);
	}

	public static void main(String[] args) {
		int l;
		String str = "Ahoj";
		
	//	MyNumber mecislo= new MyNumber(8);
		
	//	System.out.println(o);
		
		
		//mecislo.pyramida();
		
		str = "Toto je pokus metod String   ";
		
		
		System.out.println(str.length()); // jaka je delka celeho stringu
		System.out.println(str.charAt(0)); // jaky je charakter na miste 0
		System.out.println(str.substring(8,14)); // jake jsou charaktery na miste 8-13 vcetne
		System.out.println(str.indexOf("metod")); // vypise index pismene na zacatku slova pokus (lze pouzit 'char')
		System.out.println(str.lastIndexOf("m")); // index posledniho charakteru m
		System.out.println(str.contains("metod")); // obsahuje string slovo? true - false
		System.out.println(str.toUpperCase()); // vse na velke
		System.out.println(str.toLowerCase()); // vse na male
		System.out.println(str.trim()); // vyrusi zbytecne mezery
		


		
		
		
		
		
		
		
		
	}

}
