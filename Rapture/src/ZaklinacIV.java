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
		
		System.out.println("Jsi v obchodì. Co chces udìlat?");
		System.out.println("1. Promluvit si s hokynáøem");
		System.out.println("2. Nakoupit zboží");
		System.out.println("3. Prodat bylinky (pokud nìjaké máš)");
		System.out.println("0. Odejit z obchodu na namesti");
		
		int obchodvolba = Volba();	
		
		konec = obchodvolba;
		switch (obchodvolba) {
		
		case 1: 
			System.out.println("POUTNÍK: Co prodáváš hokynáøi?");
			System.out.println("HOKYNÁØ: Ahoj, jmenuju se Pankrác, ale ve vesnici mi všichni øíkaj prostì hokynáø."
					+ "Prodávám zbranì co tu zùstaly po poutnících jako jis ty. Taktéž prodávám léèivé lektvary."
					+ "Bohužel, od doby co se v lesích potuluje vlkodlak, neodvážím se tam sbírat bylinky do lektvarù."
					+ "Jestli nìjaké najdeš a doneseš, štìdøe se ti odmìním");
							break;
		case 2: 
			System.out.println("HOKYNÁØ: Mám tady krátký meè, ale za to ostrý jako bøitva. Tìžký palcát, který rozdrtí vše na co narazí. "
					+ "A samozøejmì lektvary. Co si vybereš?");
			System.out.println("1. Krátký meè (dmg 3-5) = 100 dukátù");
			System.out.println("2. Palcát (dmg 0-9) = 100 dukátù");
			System.out.println("3. Léèivý lektvar (+30HP) = 30 dukátù");
			
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
		
		
		System.out.println("Vítej ve høe Zaklínaè IV - Drtivý Zvon. \n Zadej své jméno poutníku:");
		
		
		Scanner sc = new Scanner(System.in);
		String jmeno = sc.nextLine();
		int dukaty = 20;
		int hpcka = 50;
		String zbran = "dyka";
		int poskozeni = 5;
		int lektvary = 0;
		int bylinky = 1;
		
		int les = 0;
		
		
		System.out.println("To je ale trapné jméno " + jmeno + ". Nu co se dá dìlat. \n\n" );
	
		System.out.println("Po dlouhé cestì si koneènì došel do malé vesnice zvané Restinpiece. \n "
				+ "Vesnice je již mìsíce odøíznutá od svìta kvùli zuøivému vlkodlakovi, èekajíc spásu boží. Ocitl ses uprostøed malého námìstí. ");
		
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

	


