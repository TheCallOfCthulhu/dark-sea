package rapture.city;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Hraci {
	
	String jmeno;
	int pocetKostek;
	ArrayList<Integer> pole = new ArrayList<>();
	
	
	public Hraci(String jmeno, int pocetKostek) {
		super();
		this.jmeno = jmeno;
		this.pocetKostek = pocetKostek;
			}

	
	public void generuj () {
		Random rd = new Random ();
		
		pole.add(rd.nextInt(6)+1);
		pole.add(rd.nextInt(6)+1);
		pole.add(rd.nextInt(6)+1);
		pole.add(rd.nextInt(6)+1);
		pole.add(rd.nextInt(6)+1);
		Collections.sort(pole); //seradi cisla
	}
	
	public void odstranVsechnyKostky () {
		pole.remove(4);
		pole.remove(3);
		pole.remove(2);
		pole.remove(1);
		pole.remove(0);
		
	}
	
	
	public void odstranKostku () {
		switch (pocetKostek) {
		case 1: 
			pole.remove(4);
			pole.remove(3);
			pole.remove(2);
			pole.remove(1);
			break;
		case 2:
			pole.remove(4);
			pole.remove(3);
			pole.remove(2);
						break;
		case 3:
			pole.remove(4);
			pole.remove(3);
						break;
		case 4:
			pole.remove(4);
					break;
		case 5:
			break;
	
			}
	}
	
	
	
	public int sectiKostky (int [] pole, int cislo) {
	for (int policko:pole) {
		if (policko==cislo) {
			cislo=cislo++;}
					}
		return cislo;
	}
	


}
