package rapture.city;

import java.util.Random;
import java.util.Scanner;

public class Welcome {
	
	
	//////// Scanner - pro INT ////
	private static int nascanuj () {
		Scanner sc = new Scanner (System.in);
	//	int volba = sc.nextInt();						// lze pouzit primo v returnu
	//	sc.close(); 									// kdyz se jednou zavre uz ho nelze otevrit, proc?
		return sc.nextInt();
	}
	
	private static void  hodKostkami () {
		Random rd = new Random ();
		int hod = rd.nextInt(50);
		System.out.println(hod);
	}
	
	
	private static void  zapniKalkulacku () {
		System.out.println("Zadej prvni cislo");
		int prvniCislo = nascanuj();
		System.out.println("Zadej druhe cislo");
		int druheCislo = nascanuj();
		System.out.println("Zadan� ��sla jsou: \"" + prvniCislo + "\" a \"" + druheCislo + "\" \n");		
		System.out.println("V�sledek s��t�n� je:\t " + prvniCislo + " + " + druheCislo + " = " + (prvniCislo+druheCislo));
		System.out.println("V�sledek ode��t�n� je:\t " + prvniCislo + " - " + druheCislo + " = " + (prvniCislo-druheCislo));
		System.out.println("V�sledek n�soben� je:\t " + prvniCislo + " * " + druheCislo + " = " + (prvniCislo*druheCislo));
		System.out.println("V�sledek d�len� je:\t " + prvniCislo + " / " + druheCislo + " = " + (prvniCislo/druheCislo));
		
	}
	
	

	public static void main(String[] args) {
	
		System.out.println("WELCOME TO RATPURE CITY");
		hodKostkami();
		//zapniKalkulacku();

		System.out.println("KONEC");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
