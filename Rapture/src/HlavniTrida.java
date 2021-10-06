
public class HlavniTrida {

	public static void main(String[] args) {
		
		Ruka ruka = new Ruka(5);
		System.out.println("Tva ruka ma prstu: " + ruka.pocetPrstu); 
		ruka.uberMiPrst(1);
		System.out.println("Tva ruka ma prstu: " + ruka.kolikMamTedPrstu());
		
/*	int vaha = 100;
	/*	Objekt krychle = new Objekt(); /*pojmenoval si vytvoreny objekt na krychle*/
	/*	System.out.println("vaha pred setem" + krychle.vaha); /*ted volas pomoci krychle. jakoukoliv promennou*/
	/*	System.out.println(krychle.ziskejVahu()); /*volani metody*/
	/*	int a = krychle.vyska;
	/*	krychle.setVahu(vaha);
	/*	System.out.println("vaha po setu" + krychle.vaha);
	/*	System.out.println(a);
	/*	System.out.println(krychle.hustota); /*z objektu ktery zdedil po Dedeni*/
		
		
	}

}
