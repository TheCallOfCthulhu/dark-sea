package default2;
import java.util.Scanner;
import java.util.Random;

public class ZaklinacMK2 {
	
	public static int Volba () {
		Scanner sc = new Scanner(System.in);
				
				int volba = sc.nextInt();
				return (volba);
				
			}

	public static void main(String[] args) {
		
																/*UVOD*/
		
System.out.println("            V?tej ve h?e!");
System.out.println("****************************************");
System.out.println("****************************************");
System.out.println("****** Zakl?na? IV - Duniv? Zvon *******");
System.out.println("****************************************");
System.out.println("****************************************");
System.out.println("\n\n Zadej sv? jm?no poutn?ku:");
		

		Random rd = new Random ();
		Scanner sc = new Scanner(System.in);
		String jmeno = sc.nextLine();
		
		int hpcka = 50;
		int dukaty = 30;
		int bylinky = 0;
		int lahvicky = 0;
		String zbran = "D?ka (0-2dmg)";
		int posveceni = 0;
		int cesta = 0;
		int vlk = 100;
		int victory = 0;
		int cisnice = 0;
		 			
		  
		 
				
		
		
		System.out.println("\n To je ale hodn? trapn? jm?no " + jmeno + ". Nu co se d? d?lat. \n\n" );
		System.out.println(" Po dlouh? cest? si kone?n? do?el do mal? vesnice zvan? Odpo??vej v Pokoji. \n "
				+ "Vesnice je ji? m?s?ce od??znut? od sv?ta kv?li zu?iv?mu vlkodlakovi. Obyvatel? ?ekaj? na hrdinu, kter? je zachr?n?. \nOcitl ses uprost?ed mal?ho n?m?st?. ");
		

			int konecnamesti = 1;
				while (konecnamesti != 0) {
					System.out.println("\n ----------------------\n");
					System.out.println(" Kam se vyd?? d?le?\n");
					System.out.println("1. Kr?ma U chlemtac?ho kon?");
					System.out.println("2. Obch?dek se sm??en?m zbo??m");
					System.out.println("3. Kostel Pany Magdal?ny");
					if (cesta == 1) {
						System.out.println("4. Cestovat na sever.");	
					}
					System.out.println("8. Invent??");
					
					int namestivolba = Volba();
					konecnamesti = namestivolba;
					
					switch (namestivolba) {
					
									/*KRCMA*/
					case 1: 
						int koneckrcma = 1;
						int zvraceni = 0;
						while (koneckrcma != 0) {
							System.out.println("\nV pln? kr?m? host? vid?? hospodsk?ho za pultem a hezkou ???n?c?, kter? l?t? mezi stoly. S k?m si chce? promluvit?\n");
							System.out.println("1. S hospodsk?m");
							System.out.println("2. S ???nic?");
							System.out.println("0. Chci zp?tky na n?m?st?");
							
							int krcmavolba = Volba();
							koneckrcma = krcmavolba;
							
							switch (krcmavolba) {
																		/*HOSPODSKY*/
							
													
													case 1:
														int konechospodsky = 1;
														while (konechospodsky != 0) {
															if (victory !=1) {
														System.out.println("\nHOSPODSKY: Zdrav?m t? " + jmeno + ". Divis ze znam tvoje jm?no? Co bys rad?\n");
														System.out.println("1. Pov?z mi, kudy se vydat do Temn?ho lesa, kde ?ije vlkodlak?");
														System.out.println("2. Na?epuj mi jedno pivko. M?m ?plne vyschlo.");
														System.out.println("0. Dekuji. Uz nic nepotrebuju.");
															} else {
																System.out.println("R?d t? vid?m! Tady m?? pivo zdarma hrdino.");
													
													
															}
														 int krcmavolbales = Volba();
														 konechospodsky = krcmavolbales;
														 switch (krcmavolbales) {
														 case 1: 
															 cesta = 1;
															 System.out.println("\n HOSPODSKY: Mus?? z vesnice na sever a? dojde? k planin?. "
														 		+ "Za n? je Temn? les. Ten u? pozn??. \n");
														 	
														 break;
														 case 2:
															 if (zvraceni != 3) {
															 System.out.println("\n HOSPODSKY: \"Tady mas ty barde jeden. Hlavne se mi tu neopij!\" \n" );
														 
														 zvraceni = zvraceni + 1;
														 if (zvraceni == 1) {
																System.out.println("\n (*Chutn? ti!*) \n\n");
															}
														 if (zvraceni == 2) {
																System.out.println("\n (*Citis jak se ti mota kebule*) \n\n");
															}
														 			 if (zvraceni == 3) {
																System.out.println("\n (*Udelalo se ti spatne a ublinkl sis na kalhoty*) \n\n");
															}
															 } else {
																 System.out.println("\n HOSPODSK?: Uz ti nenaleju ty prase! Zmiz mi z oci! \n\n");
														
														 }
														 break;
														 case 0: 
															 
															 break;
														 }
														}
														 break;
													
								
																		/*CISNICE*/
													case 2:
														if (victory == 1) {
															System.out.println("\n SLICNA CISNICE: Poj? sem ty m?j hrdino! Vezmi si m? a m?jme spoustu d?t?. \n");
															cisnice = 1;
														} else {
														System.out.println("\n SLICNA CISNICE: Snad si nemyslis ze mas sanci? Vodprejskni troubo! \n");
														}
														break;
													}
												
												
													}
												break;
												
												
										/*OBCHOD*/
					case 2:
						
						int konecobchod = 1;
						while (konecobchod != 0) {
							System.out.println("\nJsi v malem zavsivenem kramku. Co chces udelat?\n");
							System.out.println("1. Promluv si s hokyn??em");
							System.out.println("2. Nakup zbo??");
							System.out.println("3. Prodej Bylinky (pokud n?jak? m??)");
							System.out.println("0. Jdi zpatky na namesti");
							
							int obchodvolba = Volba();
							konecobchod = obchodvolba;
							
													switch (obchodvolba) {
													case 1: 
														if (victory != 1) {
														System.out.println("POUTNIK: \"Co prod?v?? hokyn??i?\" \n\n"
															+ "HOKYN??: Ahoj, jmenuju se Pankr?c, ale ve vesnici mi v?ichni ??kaj prost? hokyn??.\n"
															+ "Prod?v?m zbran? co tu z?staly po poutn?c?ch jako jses ty. Takt?? prod?v?m l??iv? lektvary.\n"
															+ "Bohu?el, od doby co se v les?ch potuluje vlkodlak, neodv???m se tam sb?rat bylinky do lektvar?.\n"
															+ "Jestli n?jak? najde? a donese?, ?t?d?e se ti odm?n?m");
														}else {
															System.out.println("HOKYN??:Tys ho zabil, neuv??iteln?! Si frajer!\n");
														}
														
													break;
													
													case 2: 
														System.out.println("HOKYN??: M?m tady kr?tk? me?, ale za to ostr? jako b?itva. T??k? palc?t, kter? rozdrt? v?e na co naraz?. "
																+ "A samoz?ejm? lektvary. Co si vybere??\n\n");
														System.out.println("1. Kr?tk? me? (dmg 3-5) = 100 duk?t?");
														System.out.println("2. Palc?t (dmg 0-9) = 100 duk?t?");
														System.out.println("3. L??iv? lektvar (+30HP) = 30 duk?t?");
														
														int zbranevolba = Volba();
														switch (zbranevolba) {
														case 1: 
															if (dukaty >= 100) {
															dukaty = dukaty - 100;
															zbran = "Kr?tk? me? (dmg 3-5)";
															System.out.println("(*Ziskal jsi kratky mec. Nyni mas: " + dukaty + "dukatu*)");
															} else {
																System.out.println("(*Nemas dostatek penez*)");
															}
															break;
														case 2 : 
															if (dukaty >= 100) {
															dukaty = dukaty - 100;
															zbran = "Palc?t (dmg 0-9)";
															System.out.println("(*Ziskal jsi palcat. Nyni mas: " + dukaty + "dukatu*)");
															} else {
																System.out.println("(*Nemas dostatek penez*)");
															}
															break;
														case 3 :
															if (dukaty >= 30) {
															dukaty = dukaty - 30;
															System.out.println("HOKYN??: Tahle lahvicka ti vlije do zil novou krev!\n"
																	+ "(*Ziskal jsi lahvicku. Nyni mas: " + dukaty + "dukatu*)");
															lahvicky = lahvicky +1;
														} else {
															System.out.println("(*Nemas dostatek penez*)");
														}
															break;
																			
																}
														break;
													case 3: 
														/*bylinky*/
														if (bylinky >= 1) {
														dukaty = dukaty + (bylinky*20);
													
														System.out.println("(*Prodal si " + bylinky + " bylinek*)");
														System.out.println("(*Nyni mas: " + dukaty + " dukatu*)");
														bylinky = 0;
														
														} else {
															System.out.println("(*Nem?? ji? u sebe ??dn? bylinky*)");
														}
														
														break;
														
													case 4:
														break;
														
													
													}
							
							
							
						}
						break;
						
						
						
						/*KOSTEL*/
						
						
						
					case 3:
						int koneckostel = 1;
						while (koneckostel != 0) {
							System.out.println("\nJsi v Kostele. \nOTEC FURA: Zdravim te poutniku pod strechou Pana Boha. Co bys rad?\n");
							System.out.println("1. Zpov??");
							System.out.println("2. Posv?tit me proti zlu");
							System.out.println("3. Oddej m?");
							System.out.println("0. Zpatky na namesti");
							
							int kostelvolba = Volba();
							koneckostel = kostelvolba;
							
													switch (kostelvolba) {
													case 1:
														if (hpcka < 60) {
														hpcka = hpcka + 10;
														System.out.println("\nPO HODIN?...  OTEC FURA: Je to to nejzvrhlej?? co jsem kdy za sv?j cel? ?ivot sly?el"
																+ ",ale tv? h??chy jsou odpu?t?ny a tv? du?e o?ist?na! (+10HP)");
														} else {
															System.out.println("\n Uz to radeji nechci slyset. Nech si to pro sebe.");
														}
														break;
													case 2:
														if (posveceni != 1) {
														posveceni = 1;
														System.out.println("\n Jsi posv?cen?.");
														} else {
															System.out.println("\n U? jsi posv?cen. Be? a konej dobro proti zlu. ");
														}
														break;
													case 3:
														if (cisnice == 1) {
															konecnamesti = 0;
															koneckostel = 0;
														} else {
														System.out.println("\nOTEC FURA: K s?atku je v?dy pot?eba dvou. A pokud si nechce? vz?t mou"
																+ " ovdov?lou babi?ku, m?l by sis prvn? n?koho naj?t, chlap?e.\n Sly?el jsem, ?e ???nice Marie je svobodn?");
														}
														break;
													case 4:
														break;
													
													
													
													}
							
							
							
						}
						break;
						
					case 4:
						/*cesta na sever*/
						
						int konecsever = 1;
						while (konecsever != 0) {
						
						System.out.println("\nPo hodin? ch?ze ses dostal k planin? a za n? Temn? les. Co chce? ud?lat?\n");
						System.out.println("1. Chv?li se porozhl?dnout po planin? a zkusit naj?t bylinky");
						if (victory != 1) {
						System.out.println("2. Vydat se do Temn?ho lesa");
						}
						System.out.println("0. Vr?tit se do vesnice");
						
						int severvolba = Volba();
						konecsever = severvolba;
						
						switch (severvolba) {
						case 1: 
							int hledani = rd.nextInt(60);
							if (bylinky > 10) {
								System.out.println("\nUz si je nemas kam nacpat leda do trenek.");
							} else {
							
							if (hledani < 21) {
								bylinky = bylinky +1;
								System.out.println("\n(*Na?el si bylinku.*)");
								System.out.println("(*Nyn? m?? bylinek: " + bylinky + "*)");
							} else {
								System.out.println("\n(*Bohu?el, nic jsi nena?el. Zkus se znova porozhl?dnout.*)\n");
							}
							}
							
							/*hledani bylinek							* /
							 * 
							 */
							
							
							break;
						case 2:
							/*vlkodla*/
							System.out.println("\nVstoupil si do hust?ho tmav?ho lesa. Zd? se, jak by zde zem?el v?echen ?ivot.\n Ani l?stek"
									+ "se nepohne. Najednou usly??? k?upnut? v?tv?. \nPrudce se oto??? a vid?? deset metr? p?ed sebou"
									+ " p?es dva metry vysok?ho ?edo?ern?ho vlkodlaka. \nZ?r? na tebe s vycen?n?mi zuby a ?ek? na tv?j pohyb\n");
							
							int konecvlk = 1;
							while (konecvlk != 0) {
								
							System.out.println(jmeno + "------------ vlkodlak");
							System.out.println(hpcka + "/50HP------------" + vlk +"/100HP");
							System.out.println(zbran + "------- drapy (10-15dmg)");
							
							System.out.println("\nJak te? zareaguje??\n");
							System.out.println("1. Za?to? na vlkodlaka");
							System.out.println("2. Vypij l??iv? lektvar");
							System.out.println("0. Ute? z lesa");
							
							int vlkvolba = Volba();
							konecvlk = vlkvolba;
							int utok = 0;
							
							switch (vlkvolba) {
							
							case 1:
								int hlasky = rd.nextInt(3);
							if (hlasky == 1) {
								System.out.println("Vyrazil si proti vlkodlakovi a bleskurychle za?to?il\n");
							}
							if (hlasky == 2) {
								System.out.println("Vlkodlak po tob? sko?il. Na posledn? chv?li si uhnul.\n");
							}
							if (hlasky == 3) {
								System.out.println("Dr?py se t? zaryly hluboko do masa. Tys ho svou zbran? sekl do pa?e.\n");
							}
								
								if (zbran == "D?ka (0-2dmg)") {
								utok = rd.nextInt(2);
								}
								if (zbran == "Kr?tk? me? (dmg 3-5)") {
									utok = rd.nextInt(2)+3;
									}
								if (zbran == "Palc?t (dmg 0-9)") {
									utok = rd.nextInt(9);
									}
								int drapy = rd.nextInt(5) + 10;
								
								hpcka = hpcka - drapy;
								vlk = vlk - utok;
								
								if (vlk <=0) {
									System.out.println(jmeno + "------------ vlkodlak");
									System.out.println(hpcka + "/50HP------------" + vlk +"/100HP");
									System.out.println(zbran + "------- drapy (10-15dmg)");
									System.out.println("\nZabil si vlkodlaka!");
									System.out.println("\nVrat se do vesnice a stan se hrdinou.");
									victory = 1;
									konecvlk = 0;
																	}
								if (hpcka <=0) {
									System.out.println(jmeno + "------------ vlkodlak");
									System.out.println(hpcka + "/50HP------------" + vlk +"/100HP");
									System.out.println(zbran + "------- dr?py (10-15dmg)");
									System.out.println("Vlkodlak t? rozp?ral na cucky. Um?el jsi a prohr?l.");
									
									konecvlk = 0;
									konecsever = 0;
									konecnamesti = 0;
							
																	}
								
								break;
							case 2:
								if (lahvicky > 0) {
									lahvicky = lahvicky -1;
									hpcka = hpcka +30;
									if (hpcka > 50) {
										hpcka = 50;
									}
										
								} else {
									System.out.println("Dosly ti lahvicky");
								}
								break;
							case 0:
								break;
							
							
							}
							}
							break;
							
						case 0: 
							break;
						}
						}
						
						break;
						
					case 8: 
						System.out.println("Jm?no: " + jmeno);
						System.out.println("HP: " + hpcka);
						System.out.println("Zbra?: " + zbran);
						System.out.println("Duk?ty: " + dukaty);
						System.out.println("Lahvi?ky: " + lahvicky);
						System.out.println("Bylinky: " + bylinky);
						break;

					
					
				}

				}
if (victory == 1) {
				System.out.println("\n Vlkodlak byl pora?en a ve vesnici z?vladl klid a m?r. \n");
				System.out.println(jmeno + "si vzal Marii za ?enu a m?li spolu t?i d?ti.");
				System.out.println("\n ?ili spolu ?tastn? a? do smrti");
				
				System.out.println("****************************************");
				System.out.println("****************************************");
				System.out.println("**************** KONEC *****************");
				System.out.println("****************************************");
				System.out.println("****************************************");
} else {
	System.out.println("****************************************");
	System.out.println("****************************************");
	System.out.println("**************** KONEC *****************");
	System.out.println("****************************************");
	System.out.println("****************************************");
}


System.out.println("HESLO je: Ka?tan");
System.out.println("Zmackni jakekoliv cislo pro uknceni hry");
int end = Volba();

sc.close();
















	}

}
