package hraProRomanku;

import java.util.Scanner;

public class Starter {
	
	static Scanner sc = new Scanner (System.in);
	
	public static int volba () {
		int x = sc.nextInt();
		return x;
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		int volba1 = 9;
		int volba2 = 9;
		int volba3 = 9;
		int [] opakovani = {0,0,0,0,0,0,0,0,0};
		
		
		System.out.println("**AHOJ ROMI. V?TEJ V EROTICK? H?E. P?IPRAV SE.**\n");
	
			Thread.sleep(3000);
		
		System.out.println("JE P?TEK ODPOLEDNE A ZA CHV?L? M?? PADLA.\n"
				+ "TAK? SI DOSTALA HROZNOU CHU? NA SEX A R?D? BY SES VE?ER POMILOVALA.\n"
				+ "CO TE? UD?L???\n");
		Thread.sleep(5000);
		
		
		while (volba1 != 3 ) {
		System.out.println("1 - Napsat mil??kovi na Telegram.");
		System.out.println("2 - Zavolat Romanovi.");
		System.out.println("3 - Zavolat mamce.");
		System.out.println("4 - ?ekne? Andrei, ?e skon??? d??ve a p?jde? na po?tu");
			
	///////V PRACI
		switch (volba()) {
		
		case 1: 
			//nazhavit ho
			//VYBRAT HRU -  vybere romca
				
				
			break;
		case 2:
			System.out.println("Vol?? Romanovi... \n ");
			Thread.sleep(2000);
			System.out.println("ROMAN: \"?au, co pot?ebuje??\"\n ");
			
			while (volba2 !=3) {
				System.out.println("1 - Kdy mi po?le? ty pen?ze, na kter?ch jsme se domlouvali?");
				System.out.println("2 - Co d?l??? Nepohl?dal by si dneska mal?ho?");
				System.out.println("3 - V?? co, rad?ji nic. Zapome? na to. M?j se.");
				switch (volba()) {
				case 1: 
					
					if(opakovani[0] == 0) {
					System.out.println("ROMAN: \"Promi?, tento m?s?c mi to nevyjde. Ale p???t? m?s?c u? slibuju!\"\n ");
					opakovani[0] = 1;
					} else System.out.println("ROMAN: \"Te? jsem ti ??kal ?e nem?m ani floka!\"");
					break;
				case 2:
					System.out.println("ROMAN: \"Dneska nem??u. M?m tetov?n?. Jedna ko?ka chce vytetovat pampeli?ku na vag?n?. Sorry\"");
					break;
				case 3:
					System.out.println("ROMAN: \"Jasn?, ?us.\"");
					volba2 = 3;
					break;
					}
				}
				
			break;
			
			
			
			
			
			
			
		case 3:
			System.out.println("Vol?? mamce... \n ");
			Thread.sleep(2000);
			System.out.println("MAMKA: \"Ahoj Romanko, co se stalo?\"");
			
			while (volba3 !=3) {
				System.out.println("1 - Jak se mas? Neco noveho u vas?");
				System.out.println("2 - Chtela jsem se zeptat. Nehlidali byste dneska Tobiho?");
				System.out.println("3 - Jen jsem te chtela slyset. Mej se hezky.");
				switch (volba()) {
				case 1: 
					System.out.println("Co ti mam povidat Romanko. Vsechno na hovno. Dedek na pive a ja jsem doma. Musim si nabarvit vlasy");
					break;
				case 2:
					System.out.println("No mohla bych. Jsem doma. Prijd v 17h jen si musim nabarvit vlasy");
					break;
				case 3:
					System.out.println("Dekuju, si hodna. Taky se mej a pozdrav Jarouska.");
					volba3 = 3;
					break;
					}
				}
				
			break;
		
		}
		
		}
		
		//JIZDA AUTEM
		
		//NA POSTU+PRO MALEHO VYZVEDNOUT
		//V OCHODE
		//PREDAT MALEHO
		//DOMA SE PREVLECT + vybrat pradlo
		//NA SIDLE
		
		
		
//-napsat chut na to
//-zajit do obchodu a koupit rum+s colou
//-zahrat hru
//-vzit si pradlo
//-spani u me


		
		
		
		
		
		
		
		
		
		
		
	}

}
