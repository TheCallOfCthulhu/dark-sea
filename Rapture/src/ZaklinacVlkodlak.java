import java.util.Scanner;


public class ZaklinacVlkodlak {
	
	public static int Volba () {
		Scanner sc = new Scanner(System.in);
				
				int volba = sc.nextInt();
				return (volba);
			}

	public static void main(String[] args) {

		System.out.println(" V?tej ve h?e Zakl?na? IV - Duniv? Zvon. \n Zadej sv? jm?no poutn?ku:");
		
		Scanner sc = new Scanner(System.in);
		String jmeno = sc.nextLine();
		
		
		System.out.println("\n To je ale hodn? trapn? jm?no " + jmeno + ". Nu co se d? d?lat. \n\n" );
		System.out.println(" Po dlouh? cest? si kone?n? do?el do mal? vesnice zvan? Restinpiece. \n "
				+ "Vesnice je ji? m?s?ce od??znut? od sv?ta kv?li zu?iv?mu vlkodlakovi, ?ekaj?c sp?su bo??. \nOcitl ses uprost?ed mal?ho n?m?st?. ");
		
		int konecnamesti = 1;
		while (konecnamesti != 0) {
		
		System.out.println("Stojis na namesti. Kudy se chces vidat?\n");
		System.out.println("1. Krcma");
		System.out.println("2. Obchod");
		System.out.println("3. Kostel");
		System.out.println("i. Inventar");
		
		int namestivolba = Volba();
		
		switch (namestivolba) {
		
																	/*KRCMA*/
		
		case 1: 
			int koneckrcma = 1;
			while (koneckrcma != 0) {
				
			
			System.out.println("Jsi v Krcme.");
		
			
						int krcmavolba = Volba();
						koneckrcma = krcmavolba;
																	
						switch (krcmavolba) {
																	/*KRCMA-HOSPODSKY*/
						case 1:
							
							int konechospodsky = 1;
							while (konechospodsky != 0) {
						System.out.println(" HOSPODSKY: Nazdarek" + jmeno + ". Divis ze znam tvoje jmeno poutniku? Co bys rad?");
						System.out.println("1. Rekni mi, kudy se vydat do Temneho lesa?");
						System.out.println("2. Nacepuj mi jedno pivko. Mam uplne vyschlo");
						
								int hospodskyvolba = Volba();
								
								switch (hospodskyvolba) {
								case 1:
									System.out.println("\n HOSPODSKY: Napravo a doleva \n");
									break;
									
								
								}
								break;
									}
						break;
						
							
						
						
																	/*KRCMA-CISNICE*/
						case 2:
						System.out.println("\n SLICNA CISNICE: Snad si nemyslis ze mas sanci? Vodprejskni troubo! \n");	
						break;
						
						case 0:
						break;
						}
						
			break;
			}
		
		}
		
		}
		
	}
	

}
