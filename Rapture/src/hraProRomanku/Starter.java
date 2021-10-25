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
		
		
		System.out.println("**AHOJ ROMI. VÕTEJ V EROTICK… HÿE. PÿIPRAV SE.**\n");
	
			Thread.sleep(3000);
		
		System.out.println("JE P¡TEK ODPOLEDNE A ZA CHVÕLÕ M¡ä PADLA.\n"
				+ "TAK… SI DOSTALA HROZNOU CHUç NA SEX A R¡D¡ BY SES VE»ER POMILOVALA.\n"
				+ "CO TEœ UDÃL¡ä?\n");
		Thread.sleep(5000);
		
		
		while (volba1 != 3 ) {
		System.out.println("1 - Napsat mil·Ëkovi na Telegram.");
		System.out.println("2 - Zavolat Romanovi.");
		System.out.println("3 - Zavolat mamce.");
		System.out.println("4 - ÿekneö Andrei, ûe skonËÌö d¯Ìve a p˘jdeö na poötu");
			
	///////V PRACI
		switch (volba()) {
		
		case 1: 
			//nazhavit ho
			//VYBRAT HRU -  vybere romca
				
				
			break;
		case 2:
			System.out.println("Vol·ö Romanovi... \n ");
			Thread.sleep(2000);
			System.out.println("ROMAN: \"»au, co pot¯ebujeö?\"\n ");
			
			while (volba2 !=3) {
				System.out.println("1 - Kdy mi poöleö ty penÌze, na kter˝ch jsme se domlouvali?");
				System.out.println("2 - Co dÏl·ö? NepohlÌdal by si dneska malÈho?");
				System.out.println("3 - VÌö co, radÏji nic. ZapomeÚ na to. MÏj se.");
				switch (volba()) {
				case 1: 
					
					if(opakovani[0] == 0) {
					System.out.println("ROMAN: \"PromiÚ, tento mÏsÌc mi to nevyjde. Ale p¯ÌötÌ mÏsÌc uû slibuju!\"\n ");
					opakovani[0] = 1;
					} else System.out.println("ROMAN: \"TeÔ jsem ti ¯Ìkal ûe nem·m ani floka!\"");
					break;
				case 2:
					System.out.println("ROMAN: \"Dneska nem˘ûu. M·m tetov·nÌ. Jedna koËka chce vytetovat pampeliöku na vagÌnÏ. Sorry\"");
					break;
				case 3:
					System.out.println("ROMAN: \"JasnÏ, Ëus.\"");
					volba2 = 3;
					break;
					}
				}
				
			break;
			
			
			
			
			
			
			
		case 3:
			System.out.println("Vol·ö mamce... \n ");
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
