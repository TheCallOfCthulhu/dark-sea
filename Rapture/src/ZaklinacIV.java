import java.util.Scanner;

public class ZaklinacIV {
	
	
	
	public static int Volba () {
Scanner sc = new Scanner(System.in);
		
		int volba = sc.nextInt();
		return (volba);
	}
	
	public static void Obchod ( ) {
		
		int konec = 1 ;
		while (konec != 0) {
		
		System.out.println("Jsi v obchod?. Co chces ud?lat?");
		System.out.println("1. Promluvit si s hokyn??em");
		System.out.println("2. Nakoupit zbo??");
		System.out.println("3. Prodat bylinky (pokud n?jak? m??)");
		System.out.println("0. Odejit z obchodu na namesti");
		
		int obchodvolba = Volba();	
		
		konec = obchodvolba;
		switch (obchodvolba) {
		
		case 1: 
			System.out.println("POUTN?K: Co prod?v?? hokyn??i?");
			System.out.println("HOKYN??: Ahoj, jmenuju se Pankr?c, ale ve vesnici mi v?ichni ??kaj prost? hokyn??."
					+ "Prod?v?m zbran? co tu z?staly po poutn?c?ch jako jis ty. Takt?? prod?v?m l??iv? lektvary."
					+ "Bohu?el, od doby co se v les?ch potuluje vlkodlak, neodv???m se tam sb?rat bylinky do lektvar?."
					+ "Jestli n?jak? najde? a donese?, ?t?d?e se ti odm?n?m");
							break;
		case 2: 
			System.out.println("HOKYN??: M?m tady kr?tk? me?, ale za to ostr? jako b?itva. T??k? palc?t, kter? rozdrt? v?e na co naraz?. "
					+ "A samoz?ejm? lektvary. Co si vybere??");
			System.out.println("1. Kr?tk? me? (dmg 3-5) = 100 duk?t?");
			System.out.println("2. Palc?t (dmg 0-9) = 100 duk?t?");
			System.out.println("3. L??iv? lektvar (+30HP) = 30 duk?t?");
			
						int zbranevolba = Volba();
							switch (obchodvolba) {
							case 1: 
								break;
							case 2 : 
								break;
							case 3 :
								break;
												
									}
					break;
					case 3:
						break;
		}
		}
	}
	}
}

	
	/*
	public static void Vesnice ( ) {
		
		int konec = 1 ;
		while (konec != 0) {
		
		System.out.println("Jsi na namesti. Kudmy se chces vidat?");
		System.out.println("1. Krcma");
		System.out.println("2. Obchod");
		System.out.println("3. Kostel");
		
		
		
		
		int vesnicevolba = Volba();	
		
		konec = vesnicevolba;
		
		switch (vesnicevolba) {
		case 1: 
			Krcma();
		break;
		case 2: 
			Obchod();
		break;
		case 3: System.out.println("Jsi v Kostele. S kym chces mluvit?");
		break;
				}
		}
	}
	*/
	
	

	public static void main(String[] args) {
		
		
		System.out.println("V?tej ve h?e Zakl?na? IV - Drtiv? Zvon. \n Zadej sv? jm?no poutn?ku:");
		
		
		Scanner sc = new Scanner(System.in);
		String jmeno = sc.nextLine();
		int dukaty = 20;
		int hpcka = 50;
		String zbran = "dyka";
		int poskozeni = 5;
		int lektvary = 0;
		int bylinky = 1;
		
		int les = 0;
		
		
		System.out.println("To je ale trapn? jm?no " + jmeno + ". Nu co se d? d?lat. \n\n" );
	
		System.out.println("Po dlouh? cest? si kone?n? do?el do mal? vesnice zvan? Restinpiece. \n "
				+ "Vesnice je ji? m?s?ce od??znut? od sv?ta kv?li zu?iv?mu vlkodlakovi, ?ekaj?c sp?su bo??. Ocitl ses uprost?ed mal?ho n?m?st?. ");
		
		int konec = 1 ;
		
		while (konec != 9) {
			
			
		
		System.out.println("Jsi na namesti. Kudy se chces vidat?");
		System.out.println("1. Krcma");
		System.out.println("2. Obchod");
		System.out.println("3. Kostel");
		if (les == 9) {
			System.out.println("4. Temny les");
					}
		System.out.println("8. Inventar");
		
		
		
		int vesnicevolba = Volba();	
		
		konec = vesnicevolba;
		
		switch (vesnicevolba) {
		case 1: 
			int koneckrcma = 1 ;
			int zvraceni = 0;
		while (koneckrcma != 0) {
		
			System.out.println("Jsi v Krcme. S kym chces mluvit?");
		System.out.println("1. S hospodskym");
		System.out.println("2. S peknou prsatou cisnici");
		System.out.println("0. Chci zpatky na namesti");
		
		int krcmavolba = Volba();
		
		koneckrcma = krcmavolba;
		
		
		
		
		switch (krcmavolba) {
		
		
		case 1: 
														/* KRCMA*/
			
			System.out.println("Nazdarek. Divis ze znam tvoje jmeno Zaklinaci? Co bys rad?");
			System.out.println("1. Rekni mi, kudy se vydat do Temneho lesa?");
			System.out.println("2. Nacepuj mi jedno pivko. Mam uplne vyschlo");
			 int krcmavolbales = Volba();
			 switch (krcmavolbales) {
			 case 1: System.out.println("\n HOSPODSKY: Napravo a doleva \n");
			 	les = 9;
						 break;
			 case 2:
				 if (zvraceni != 3) {
				 System.out.println("\n HOSPODSKY: Tady mas ty barde jeden. Hlavne se mi tu neopij! \n" );
			 
			 zvraceni = zvraceni + 1;
			 if (zvraceni == 1) {
					System.out.println("\n (Chutna ti!) \n\n");
				}
			 if (zvraceni == 2) {
					System.out.println("\n (Citis jak se ti mota kebule) \n\n");
				}
			 			 if (zvraceni == 3) {
					System.out.println("\n (Udelalo se ti spatne a ublinkl sis na kalhoty) \n\n");
				}
				 } else {
					 System.out.println("\n (Uz ti nenaleju ty prase! Zmiz mi z oci!) \n\n");
			
			 }
			 break;
				 					 
			 }
			 break;
		case 2: System.out.println("\n SLICNA CISNICE: Snad si nemyslis ze mas sanci? Vodprejskni troubo! \n");
		break;
		case 0: 
			break;
		}
				}
		
	}
			
			
			
			
			
			
		break;
		/*
		case 2: 
			Obchod();
		break;
		case 3: System.out.println("Jsi v Kostele. S kym chces mluvit?");
		break;
		
		
		case 8: System.out.println("Jmeno: " + jmeno);
		System.out.println("HP: " + hpcka);
		System.out.println("Zbran: " + zbran);
		System.out.println("Dukaty: " + dukaty);
		System.out.println("Lektvary: " + lektvary);
		System.out.println("Bylinky: " + bylinky);
		break;
		
				}
		}
	}
		
		*/

	


