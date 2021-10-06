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
		
System.out.println("            Vítej ve høe!");
System.out.println("****************************************");
System.out.println("****************************************");
System.out.println("****** Zaklínaè IV - Dunivý Zvon *******");
System.out.println("****************************************");
System.out.println("****************************************");
System.out.println("\n\n Zadej své jméno poutníku:");
		

		Random rd = new Random ();
		Scanner sc = new Scanner(System.in);
		String jmeno = sc.nextLine();
		
		int hpcka = 50;
		int dukaty = 30;
		int bylinky = 0;
		int lahvicky = 0;
		String zbran = "Dýka (0-2dmg)";
		int posveceni = 0;
		int cesta = 0;
		int vlk = 100;
		int victory = 0;
		int cisnice = 0;
		 			
		  
		 
				
		
		
		System.out.println("\n To je ale hodnì trapné jméno " + jmeno + ". Nu co se dá dìlat. \n\n" );
		System.out.println(" Po dlouhé cestì si koneènì došel do malé vesnice zvané Odpoèívej v Pokoji. \n "
				+ "Vesnice je již mìsíce odøíznutá od svìta kvùli zuøivému vlkodlakovi. Obyvatelé èekají na hrdinu, který je zachrání. \nOcitl ses uprostøed malého námìstí. ");
		

			int konecnamesti = 1;
				while (konecnamesti != 0) {
					System.out.println("\n ----------------------\n");
					System.out.println(" Kam se vydáš dále?\n");
					System.out.println("1. Krèma U chlemtacího konì");
					System.out.println("2. Obchùdek se smíšeným zbožím");
					System.out.println("3. Kostel Pany Magdalény");
					if (cesta == 1) {
						System.out.println("4. Cestovat na sever.");	
					}
					System.out.println("8. Inventáø");
					
					int namestivolba = Volba();
					konecnamesti = namestivolba;
					
					switch (namestivolba) {
					
									/*KRCMA*/
					case 1: 
						int koneckrcma = 1;
						int zvraceni = 0;
						while (koneckrcma != 0) {
							System.out.println("\nV plné krèmì hostù vidíš hospodského za pultem a hezkou èíšnící, která lítá mezi stoly. S kým si chceš promluvit?\n");
							System.out.println("1. S hospodským");
							System.out.println("2. S èíšnicí");
							System.out.println("0. Chci zpátky na námìstí");
							
							int krcmavolba = Volba();
							koneckrcma = krcmavolba;
							
							switch (krcmavolba) {
																		/*HOSPODSKY*/
							
													
													case 1:
														int konechospodsky = 1;
														while (konechospodsky != 0) {
															if (victory !=1) {
														System.out.println("\nHOSPODSKY: Zdravím tì " + jmeno + ". Divis ze znam tvoje jméno? Co bys rad?\n");
														System.out.println("1. Povìz mi, kudy se vydat do Temného lesa, kde žije vlkodlak?");
														System.out.println("2. Naèepuj mi jedno pivko. Mám úplne vyschlo.");
														System.out.println("0. Dekuji. Uz nic nepotrebuju.");
															} else {
																System.out.println("Rád tì vidím! Tady máš pivo zdarma hrdino.");
													
													
															}
														 int krcmavolbales = Volba();
														 konechospodsky = krcmavolbales;
														 switch (krcmavolbales) {
														 case 1: 
															 cesta = 1;
															 System.out.println("\n HOSPODSKY: Musíš z vesnice na sever až dojdeš k planinì. "
														 		+ "Za ní je Temný les. Ten už poznáš. \n");
														 	
														 break;
														 case 2:
															 if (zvraceni != 3) {
															 System.out.println("\n HOSPODSKY: \"Tady mas ty barde jeden. Hlavne se mi tu neopij!\" \n" );
														 
														 zvraceni = zvraceni + 1;
														 if (zvraceni == 1) {
																System.out.println("\n (*Chutná ti!*) \n\n");
															}
														 if (zvraceni == 2) {
																System.out.println("\n (*Citis jak se ti mota kebule*) \n\n");
															}
														 			 if (zvraceni == 3) {
																System.out.println("\n (*Udelalo se ti spatne a ublinkl sis na kalhoty*) \n\n");
															}
															 } else {
																 System.out.println("\n HOSPODSKÝ: Uz ti nenaleju ty prase! Zmiz mi z oci! \n\n");
														
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
															System.out.println("\n SLICNA CISNICE: Pojï sem ty mùj hrdino! Vezmi si mì a mìjme spoustu dìtí. \n");
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
							System.out.println("1. Promluv si s hokynáøem");
							System.out.println("2. Nakup zboží");
							System.out.println("3. Prodej Bylinky (pokud nìjaké máš)");
							System.out.println("0. Jdi zpatky na namesti");
							
							int obchodvolba = Volba();
							konecobchod = obchodvolba;
							
													switch (obchodvolba) {
													case 1: 
														if (victory != 1) {
														System.out.println("POUTNIK: \"Co prodáváš hokynáøi?\" \n\n"
															+ "HOKYNÁØ: Ahoj, jmenuju se Pankrác, ale ve vesnici mi všichni øíkaj prostì hokynáø.\n"
															+ "Prodávám zbranì co tu zùstaly po poutnících jako jses ty. Taktéž prodávám léèivé lektvary.\n"
															+ "Bohužel, od doby co se v lesích potuluje vlkodlak, neodvážím se tam sbírat bylinky do lektvarù.\n"
															+ "Jestli nìjaké najdeš a doneseš, štìdøe se ti odmìním");
														}else {
															System.out.println("HOKYNÁØ:Tys ho zabil, neuvìøitelné! Si frajer!\n");
														}
														
													break;
													
													case 2: 
														System.out.println("HOKYNÁØ: Mám tady krátký meè, ale za to ostrý jako bøitva. Tìžký palcát, který rozdrtí vše na co narazí. "
																+ "A samozøejmì lektvary. Co si vybereš?\n\n");
														System.out.println("1. Krátký meè (dmg 3-5) = 100 dukátù");
														System.out.println("2. Palcát (dmg 0-9) = 100 dukátù");
														System.out.println("3. Léèivý lektvar (+30HP) = 30 dukátù");
														
														int zbranevolba = Volba();
														switch (zbranevolba) {
														case 1: 
															if (dukaty >= 100) {
															dukaty = dukaty - 100;
															zbran = "Krátký meè (dmg 3-5)";
															System.out.println("(*Ziskal jsi kratky mec. Nyni mas: " + dukaty + "dukatu*)");
															} else {
																System.out.println("(*Nemas dostatek penez*)");
															}
															break;
														case 2 : 
															if (dukaty >= 100) {
															dukaty = dukaty - 100;
															zbran = "Palcát (dmg 0-9)";
															System.out.println("(*Ziskal jsi palcat. Nyni mas: " + dukaty + "dukatu*)");
															} else {
																System.out.println("(*Nemas dostatek penez*)");
															}
															break;
														case 3 :
															if (dukaty >= 30) {
															dukaty = dukaty - 30;
															System.out.println("HOKYNÁØ: Tahle lahvicka ti vlije do zil novou krev!\n"
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
															System.out.println("(*Nemáš již u sebe žádné bylinky*)");
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
							System.out.println("1. Zpovìï");
							System.out.println("2. Posvìtit me proti zlu");
							System.out.println("3. Oddej mì");
							System.out.println("0. Zpatky na namesti");
							
							int kostelvolba = Volba();
							koneckostel = kostelvolba;
							
													switch (kostelvolba) {
													case 1:
														if (hpcka < 60) {
														hpcka = hpcka + 10;
														System.out.println("\nPO HODINÌ...  OTEC FURA: Je to to nejzvrhlejší co jsem kdy za svùj celý život slyšel"
																+ ",ale tvé høíchy jsou odpuštìny a tvá duše oèistìna! (+10HP)");
														} else {
															System.out.println("\n Uz to radeji nechci slyset. Nech si to pro sebe.");
														}
														break;
													case 2:
														if (posveceni != 1) {
														posveceni = 1;
														System.out.println("\n Jsi posvìcený.");
														} else {
															System.out.println("\n Už jsi posvìcen. Bež a konej dobro proti zlu. ");
														}
														break;
													case 3:
														if (cisnice == 1) {
															konecnamesti = 0;
															koneckostel = 0;
														} else {
														System.out.println("\nOTEC FURA: K sòatku je vždy potøeba dvou. A pokud si nechceš vzít mou"
																+ " ovdovìlou babièku, mìl by sis první nìkoho najít, chlapèe.\n Slyšel jsem, že èíšnice Marie je svobodná");
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
						
						System.out.println("\nPo hodinì chùze ses dostal k planinì a za ní Temný les. Co chceš udìlat?\n");
						System.out.println("1. Chvíli se porozhlédnout po planinì a zkusit najít bylinky");
						if (victory != 1) {
						System.out.println("2. Vydat se do Temného lesa");
						}
						System.out.println("0. Vrátit se do vesnice");
						
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
								System.out.println("\n(*Našel si bylinku.*)");
								System.out.println("(*Nyní máš bylinek: " + bylinky + "*)");
							} else {
								System.out.println("\n(*Bohužel, nic jsi nenašel. Zkus se znova porozhlédnout.*)\n");
							}
							}
							
							/*hledani bylinek							* /
							 * 
							 */
							
							
							break;
						case 2:
							/*vlkodla*/
							System.out.println("\nVstoupil si do hustého tmavého lesa. Zdá se, jak by zde zemøel všechen život.\n Ani lístek"
									+ "se nepohne. Najednou uslyšíš køupnutí vìtvì. \nPrudce se otoèíš a vidíš deset metrù pøed sebou"
									+ " pøes dva metry vysokého šedoèerného vlkodlaka. \nZírá na tebe s vycenìnými zuby a èeká na tvùj pohyb\n");
							
							int konecvlk = 1;
							while (konecvlk != 0) {
								
							System.out.println(jmeno + "------------ vlkodlak");
							System.out.println(hpcka + "/50HP------------" + vlk +"/100HP");
							System.out.println(zbran + "------- drapy (10-15dmg)");
							
							System.out.println("\nJak teï zareaguješ?\n");
							System.out.println("1. Zaútoè na vlkodlaka");
							System.out.println("2. Vypij léèivý lektvar");
							System.out.println("0. Uteè z lesa");
							
							int vlkvolba = Volba();
							konecvlk = vlkvolba;
							int utok = 0;
							
							switch (vlkvolba) {
							
							case 1:
								int hlasky = rd.nextInt(3);
							if (hlasky == 1) {
								System.out.println("Vyrazil si proti vlkodlakovi a bleskurychle zaútoèil\n");
							}
							if (hlasky == 2) {
								System.out.println("Vlkodlak po tobì skoèil. Na poslední chvíli si uhnul.\n");
							}
							if (hlasky == 3) {
								System.out.println("Drápy se tì zaryly hluboko do masa. Tys ho svou zbraní sekl do paže.\n");
							}
								
								if (zbran == "Dýka (0-2dmg)") {
								utok = rd.nextInt(2);
								}
								if (zbran == "Krátký meè (dmg 3-5)") {
									utok = rd.nextInt(2)+3;
									}
								if (zbran == "Palcát (dmg 0-9)") {
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
									System.out.println(zbran + "------- drápy (10-15dmg)");
									System.out.println("Vlkodlak tì rozpáral na cucky. Umøel jsi a prohrál.");
									
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
						System.out.println("Jméno: " + jmeno);
						System.out.println("HP: " + hpcka);
						System.out.println("Zbraò: " + zbran);
						System.out.println("Dukáty: " + dukaty);
						System.out.println("Lahvièky: " + lahvicky);
						System.out.println("Bylinky: " + bylinky);
						break;

					
					
				}

				}
if (victory == 1) {
				System.out.println("\n Vlkodlak byl poražen a ve vesnici závladl klid a mír. \n");
				System.out.println(jmeno + "si vzal Marii za ženu a mìli spolu tøi dìti.");
				System.out.println("\n Žili spolu štastnì až do smrti");
				
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


System.out.println("HESLO je: Kaštan");
System.out.println("Zmackni jakekoliv cislo pro uknceni hry");
int end = Volba();

sc.close();
















	}

}
