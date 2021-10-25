package ProjektAdresarX;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StarterApp {
	
	
	static String pokracovaniPridaniOsob = "a";
	static int o = 0; //pocitadlo radku pole
	static String [][] osoba = new String [10][3];
	static Scanner sc = new Scanner (System.in);

	 ///ADRESAR jmen a emailu pomoci pole
	
	public static void main(String[] args) {
		
	
		int exit = 1;
		int s = 0;
	
		
		while (exit !=0) {
			pokracovaniPridaniOsob = "a";
			s = 0;
	
			
			
		System.out.println("VITEJ V ADRESARI. CO CHCES UDELAT?" );
		
		for (int i = 0; i < osoba.length; i++ ) {
				if (osoba[i][0]!=null) {
					s++;
					}				
						}
		
		
		System.out.println("AKTUALNI STAV: " + s + "/10" );
		System.out.println("1 - PRIDAT OSOBU" );
		System.out.println("2 - VYHLEDEJ" );
		System.out.println("3 - EXPORTUJ DO SOUBORU" );
		System.out.println("4 - VYPIS CELY ADRESAR" );
		System.out.println("0 - EXIT" );
		
		int volba = sc.nextInt();
		
		
		
		switch (volba) {
		
	case 1:
		zadejOsobu();
		break;
				
	case 2:
		vyhledej();
		break;				

	case 3:
		zapisDoSouboru();
		break;
		
	case 4:
		vypisVse();
		break;
				
	case 0:
		exit = 0;
		break;
		}
			
	}
		
		
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	public static void zadejOsobu() {
	while (pokracovaniPridaniOsob.equals("a")){
		System.out.println("ZADEJ JMENO: ");
		osoba[o][0] = sc.next();
		System.out.println("ZADEJ PRIJMENI: ");
		osoba[o][1] = sc.next();
		String temp = (osoba[o][0])+"."+(osoba[o][1])+"@spaceX.com";
		osoba[o][2] = temp.toLowerCase();
		o++;
		System.out.println("OSOBA PRIDANA"); 
		System.out.println("CHCETE POKRACOVAT? a/n"); 
		pokracovaniPridaniOsob = sc.next();
		}
	}
	
	
////////////VYHLEDAVANI////////////
	static public void vyhledej() {
		boolean nasel = false;
System.out.println("ZADEJ JMENO");
String vyhledej = sc.next();

for (int i = 0; i < osoba.length; i++ ) {
	for (int b = 0; b < osoba[0].length;b++) {
		if (osoba[i][b]!=null && osoba[i][b].contains(vyhledej)) {
			System.out.println("NALEZENO");
			System.out.print(osoba[i][0]+" "+osoba[i][1]+" "+osoba[i][2]);
			System.out.println();
			nasel = true;
		} 
		}
		}
if (nasel== false) {
	System.out.println("NENALEZENO");
}

	}
	////////////////////////////////////
	
	
	
	
	
	static public void zapisDoSouboru() {
		String cesta = "C:\\Users\\surovjar\\eclipse-workspace\\Rapture\\mujsoubor";
	File soubor = new File (cesta);
	try (FileWriter fw = new FileWriter(soubor)){ // try s resourcy - autoclose
		for (int i = 0; i < osoba.length; i++ ) {
			for (int b = 0; b < osoba[0].length;b++) {
				if (osoba[i][b]!=null) {
				fw.write(osoba[i][b] + " ");
				}
				
			}
			fw.write("\n");
						
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("VYEXPORTOVANO DO " + cesta +"\n");
	}
	
	
	
	static public void vypisVse () {
	for (int i = 0; i < osoba.length; i++ ) {
		for (int b = 0; b < osoba[0].length;b++) {
			if (osoba[i][b] !=null) {
				System.out.print(osoba[i][b] + " ");}
		}
				System.out.println();}
					}
	
	
	///////////konec classy/////////////
}
