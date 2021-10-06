package rapture.city;

import java.util.Random;
import java.util.Scanner;



public class ProlhanyKostky extends Thread{
	
	static Random rd = new Random ();
	
	 
	
	
	
	String cislo;
	
	private static String rekniPocet(int cislo) {
		switch (cislo) {
		case 1: return "jedna";
		case 2: return "dvì";
		case 3: return "tøi";
		case 4: return "ètyøi";
		case 5: return "pìt";
		case 6: return "šest";
		default: return "nula";
		}
			}
	
	private static String rekniHodnotu(int cislo, int cislo2) {
		
		if (cislo2 ==1 ) {
		switch (cislo) {
		case 1: return "jednièka";
		case 2: return "dvojka";
		case 3: return "trojka";
		case 4: return "ètyøka";
		case 5: return "pìtka";
		case 6: return "šestka";
		default: return "nula";
		}
		} else if (cislo2>=2 && cislo2 <=4) {
		switch (cislo) {
		case 1: return "jednièky";
		case 2: return "dvojky";
		case 3: return "trojky";
		case 4: return "ètyøky";
		case 5: return "pìtky";
		case 6: return "šestky";
		default: return "nula";
		}
		} else {
		
		switch (cislo) {
		case 1: return "jednièek";
		case 2: return "dvojek";
		case 3: return "trojek";
		case 4: return "ètyøek";
		case 5: return "pìtek";
		case 6: return "šestek";
		default: return "nula";
		}
		}
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		int zadanaHodnota = 0;
		int zadanyPocet = 0;
		int celkovyPocet = 0;
		
		int vstup1;
		boolean vyhra = true;
		

		Scanner sc = new Scanner (System.in);

				
		
		Hraci hrac1 = new Hraci ("Ty", 5); 
		Hraci hrac2 = new Hraci ("Kamil", 5); 
		
		int veris = 1;
		


		
System.out.println("P R O L H A N Ý   K O S T K Y\n");
		
do {
		System.out.println("Kostky jsou vrzeny....");
		hrac1.odstranVsechnyKostky();
		hrac2.odstranVsechnyKostky();
		hrac1.generuj();
		hrac2.generuj();
		
		hrac1.odstranKostku();
		hrac2.odstranKostku();
	System.out.println(hrac1.pole);
	System.out.println(hrac2.pole);
		ProlhanyKostky.sleep(2000);
		
		do {
		System.out.println("Jsi na øadì. Zadej hodnotu kostky.");
		
		//vstup a overeni hodnoty
			do {
					vstup1 = sc.nextInt();
					if (zadanaHodnota <= vstup1 && vstup1 < 7) {
						zadanaHodnota = vstup1;
						} else {
							System.out.println("Zadal si špatné èíslo. Zadej èíslo znovu.");
						}
			} while (vstup1 < zadanaHodnota || vstup1 > 6);
			
		System.out.println("Zadej poèet kostek.");
		
		//vstup a overeni poctu 
		do {
			vstup1 = sc.nextInt();
			if (zadanyPocet <= vstup1 && vstup1 <= 6) {
				zadanyPocet = vstup1;
				} else {
					System.out.println("Zadal si špatné èíslo. Zadej èíslo znovu.");
				}
	} while (vstup1 < zadanyPocet  && vstup1 <= 6);
		
		System.out.println("Øíkáš: " + rekniPocet(zadanyPocet) + " " + rekniHodnotu(zadanaHodnota, zadanyPocet) + "\n");
		
		{	System.out.println(hrac2.jmeno + " ...");
			ProlhanyKostky.sleep(3000);
		}
			
			
			if (true/*rd.nextBoolean()*/) {
								System.out.println("VÌØÍ\n");
				zadanaHodnota = zadanaHodnota+1;
				zadanyPocet = zadanyPocet+1;
				ProlhanyKostky.sleep(2000);
				System.out.println(hrac2.jmeno + " øíká: " + rekniPocet(zadanyPocet) + " " + rekniHodnotu(zadanaHodnota, zadanyPocet) + "\n");
			} else {
				 ProlhanyKostky.sleep(3000);
				System.out.println("NEVÌØÍ\n");
				////pocitani kostek a hodnot
				ProlhanyKostky.sleep(2000);
				for (int policko:hrac1.pole) {
					if (policko==zadanaHodnota) {
						celkovyPocet++;
									}
						}
					for (int policko:hrac2.pole) {
					if (policko==zadanaHodnota) {
						celkovyPocet++;
								}
								}
					if (zadanyPocet <= celkovyPocet) {
						System.out.println("*NEMÁ PRAVDU*");
						System.out.println("Pøišel o kostku");
						
						
					} else {System.out.println("*MÁ PRAVDU*");
		
					System.out.println("Pøišel si o kostku");
					hrac1.odstranKostku();
					}
					
					System.out.println(hrac1.jmeno + ": " + hrac1.pole);
					System.out.println(hrac2.jmeno + ": " + hrac2.pole);
			}
			
			System.out.println("Vìøíš nebo nevìøíš?");
			//zadanaHodnota = sc.nextInt();
			String clean = sc.nextLine();
			veris = sc.nextInt();
			System.out.println(veris);
		} while (veris == 1);
		
		
		System.out.println(hrac1.jmeno + ": " + hrac1.pole);
		System.out.println(hrac2.jmeno + ": " + hrac2.pole);
		
		
		for (int policko:hrac1.pole) {
			if (policko==zadanaHodnota) {
				celkovyPocet++;
							}
				}
			for (int policko:hrac2.pole) {
			if (policko==zadanaHodnota) {
				celkovyPocet++;
						}
						}
		
		if (zadanyPocet <= celkovyPocet) {
			System.out.println("*NEMÁŠ PRAVDU*");
			//vyhra = false;
			System.out.println("Pøišel si o kostku");
			hrac1.pocetKostek = hrac1.pocetKostek -1;
		} else {
			System.out.println("*MÁŠ PRAVDU*");
			//vyhra = false;
			hrac2.pocetKostek = hrac2.pocetKostek -1;
			System.out.println("Hrác pøišel o kostku");
		}
		
	} while (vyhra == true);

		
		
		
		
		sc.close();
		
		
		
	}

}
