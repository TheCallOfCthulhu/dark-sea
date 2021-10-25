package Code1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Starter {
	
	static String konec="neco";
	static int konec2=8;

	public static void main(String[] args) {
		
		
	//	vratPoleSeIntegerem();

	
		String [] novepole = vratPoleSeStringem();
		System.out.println("VYPSANE HODNOTY V POLI:" );
		for (String pole : novepole) {
			System.out.println(pole);
		}
		
	}
	
	
	
	
	public static int [] vratPoleSeIntegerem () {
		Scanner scin = new Scanner (System.in);
		ArrayList al = new ArrayList ();
		ArrayList al2 = new ArrayList ();
		int [] seznam2 = new int [10];
		
		
									///zadavani hodnot/////
		while (konec2!=0) {
			System.out.println("ZADAVEJ HODNOTY:" );
		int temp = scin.nextInt();
		al2.add(temp);
		konec2 = temp;
		System.out.println(al2);
		} 
		
		

		
									///vytvoreni souboru a zapsani hodnot do souboru/////
		String cesta = "mujsoubor";
		
		File soubor = new File (cesta);
		try {
			FileWriter fw = new FileWriter (soubor);
			
			for (int i = 0; i < al2.size(); i++) {
			int zprava = (int) al2.get(i);
			fw.write(zprava);
			}
			System.out.println("HODNOTY SE ZAPSALI DO SOUBORU." );
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
											///nacteni hodnot ze souboru pomoci Scanneru primo do pole/////
		try {
			Scanner scout = new Scanner (soubor);
			int i =0;
			if (scout.hasNext()) {
				i++;
			seznam2[i] = scout.nextInt();
			}
			//seznam2 = temp2;
			System.out.println("HODNOTY ZE SOUBORU JSOU V POLI.");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
		
		
		
												///vypsani pole/////
		for (int pole : seznam2) {
			System.out.println(pole);
		}
		
		return seznam2;
	}
	
	
	
	
	
	
	
	
	
	public static String [] vratPoleSeStringem () {
		Scanner scin = new Scanner (System.in);
		ArrayList al = new ArrayList ();
		String [] seznam2 = new String [10];
		
		
									///zadavani hodnot/////
		while (!konec.equals("konec")) {
			System.out.println("ZADAVEJ HODNOTY:" );
		String temp = scin.next();
		al.add(temp);
		konec = temp;
		System.out.println(al);
		} 
		
		

		
									///vytvoreni souboru a zapsani hodnot do souboru/////
		String cesta = "mujsoubor";
		
		File soubor = new File (cesta);
		try {
			FileWriter fw = new FileWriter (soubor);
			
			for (int i = 0; i < al.size(); i++) {
			String zprava = (String) al.get(i);
			fw.write(zprava + " ");
			}
			System.out.println("HODNOTY SE ZAPSALI DO SOUBORU." );
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
											///nacteni hodnot ze souboru pomoci Scanneru primo do pole/////
		try {
			Scanner scout = new Scanner (soubor);
			String temp2 = scout.nextLine();
			seznam2 = temp2.split(" ");
			System.out.println("HODNOTY ZE SOUBORU JSOU V POLI.");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
		
		
		
												///vypsani pole/////
//		for (String pole : seznam2) {
//			System.out.println(pole);
//		}
//		
		return seznam2;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
