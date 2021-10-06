package obchodnik.loreno;
import java.util.Scanner;
import java.util.Random;




public class HraLorenzoObchodnik {
	
	int neco = 0;
		
	public static int Volba () {
		Scanner sc = new Scanner(System.in);
				int volba = sc.nextInt();
				return (volba);
				
			}
	


	

	public static void main(String[] args) {
		
		
		Lorenzo michal = new Lorenzo ();
		
		Komodity btc = new Komodity (50, "Jablko", 1);
		Komodity eth = new Komodity (40, "Chléb", 1);
		Komodity xrp = new Komodity (30, "Chléb", 1);
		Komodity doge = new Komodity (10, "Víno", 1);
		
		
		System.out.println(btc);
		System.out.println(eth);
		System.out.println("Kolik ti je let?");
		
		int vek = Volba();
		int rok = 0;
		
		
		while (vek != 90) {
			if (rok > 0) {
			btc.cena = btc.cena+10;
			eth.cena = eth.cena+10;
			xrp.cena = xrp.cena+10;
			doge.cena = doge.cena+10;
			}
			
			
			
			Random rd = new Random ();
			int genebtc = rd.nextInt(3)+1;
			int geneeth = rd.nextInt(3)+1;
			int genexrp = rd.nextInt(3)+1;
			int genedoge = rd.nextInt(3)+1;
			
			btc.cena=(btc.cena*genebtc)/2;
			eth.cena=(eth.cena*geneeth)/2;
			xrp.cena=(xrp.cena*genexrp)/2;
			doge.cena=(doge.cena*genedoge)/2;
			
		int volba = 9;
			
			while  (volba != 0) {
			System.out.println("Tvùj cash: " + michal.cash + " / Tvùj vìk: " + (vek + rok));
			
			System.out.println("Nazev: poèet (celková hodnota) / aktuální cena za jednotku:");
			System.out.println("BTC: \t" + btc.pocet + " \t(" + (btc.cena*btc.pocet) + ") \t \t " + btc.cena + "    ZMÁÈKNI: 1. Nakup BTC / 2. Prodej BTC ");
			System.out.println("ETH: \t" + eth.pocet + " \t(" + (eth.cena*eth.pocet) + ") \t \t " + eth.cena + "    ZMÁÈKNI: 3. Nakup ETH / 4. Prodej ETH ");
			System.out.println("XRP: \t" + xrp.pocet + " \t(" + (xrp.cena*xrp.pocet) + ") \t \t " + xrp.cena + "    ZMÁÈKNI: 5. Nakup XRP / 6. Prodej XRPC ");
			System.out.println("DOGE: \t" + doge.pocet + " \t(" + (doge.cena*doge.pocet) + ") \t \t " + doge.cena + "    ZMÁÈKNI: 7. Nakup DOGE / 8. Prodej DOGE ");
					System.out.println("    ZMÁÈKNI: 0. HODLuj 1 rok ");
			
		volba = Volba();
		
		switch (volba) {
		
		case 1:
			System.out.println("Kolik chces koupit BTC?");
			int volba1 = Volba();
			
			int celkem1 = volba1 * btc.cena;
			if (celkem1<=michal.cash) {
			michal.cash = michal.cash - celkem1;
			btc.pocet = btc.pocet+volba1; 
			System.out.println();
			System.out.println("INFO: nakoupil jsi " + volba1 + " BTC");
			} else {
				System.out.println("INFO: Nemas dostatek penez");
			}
		
			break;
			
		case 2:
			System.out.println("Kolik chces prodat BTC?");
			int volba2 = Volba();
			int celkem2 = volba2 * btc.cena;
			michal.cash = michal.cash + celkem2;
			btc.pocet = btc.pocet-volba2; 
			System.out.println();
			System.out.println("INFO: Prodal jsi " + volba2 + "BTC");
			break;
			
		case 3:
			System.out.println("Kolik chces koupit ETH?");
			int volba3 = Volba();
			int celkem3 = volba3 * eth.cena;
			if (celkem3<=michal.cash) {
			michal.cash = michal.cash - celkem3;
			eth.pocet = eth.pocet+volba3; 
			System.out.println();
			System.out.println("INFO: nakoupil jsi " + volba3 + " ETH");
			} else {
				System.out.println("INFO: Nemas dostatek penez");
			}
			break;
			
		case 4:
			System.out.println("Kolik chces prodat ETH?");
			int volba4 = Volba();
			int celkem4 = volba4 * eth.cena;
			michal.cash = michal.cash + celkem4;
			eth.pocet = eth.pocet-volba4; 
			System.out.println();
			System.out.println("INFO: Prodal jsi " + volba4 + "ETH");
			break;
			
		case 5:
			System.out.println("Kolik chces koupit XRP?");
			int volba5 = Volba();
			int celkem5 = volba5 * xrp.cena;
			if (celkem5<=michal.cash) {
			michal.cash = michal.cash - celkem5;
			xrp.pocet = xrp.pocet+volba5; 
			System.out.println();
			System.out.println("INFO: nakoupil jsi " + volba5 + " XRP");
			} else {
				System.out.println("INFO: Nemas dostatek penez");
			}
			break;
			
		case 6:
			System.out.println("Kolik chces prodat XRP?");
			int volba6 = Volba();
			int celkem6 = volba6 * xrp.cena;
			michal.cash = michal.cash + celkem6;
			xrp.pocet = xrp.pocet-volba6; 
			System.out.println();
			System.out.println("INFO: Prodal jsi " + volba6 + "XRP");
			break;
			
		case 7:
			System.out.println("Kolik chces koupit DOGE?");
			int volba7 = Volba();
			int celkem7 = volba7 * doge.cena;
			if (celkem7<=michal.cash) {
			michal.cash = michal.cash - celkem7;
			doge.pocet = doge.pocet+volba7; 
			System.out.println();
			System.out.println("INFO: nakoupil jsi " + volba7 + " DOGE");
			} else {
				System.out.println("INFO: Nemas dostatek penez");
			}
			break;
			
		case 8:
			System.out.println("Kolik chces prodat DOGE?");
			int volba8 = Volba();
			int celkem8 = volba8 * doge.cena;
			michal.cash = michal.cash + celkem8;
			doge.pocet = doge.pocet-volba8; 
			System.out.println();
			System.out.println("INFO: Prodal jsi " + volba8 + "DOGE");
			break;
			
		case 0:
			rok++;
				break;
		}
		}
		}
	
		
	}

}

