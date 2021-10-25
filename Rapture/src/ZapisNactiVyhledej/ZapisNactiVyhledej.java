package ZapisNactiVyhledej;

import java.io.IOException;
import java.util.Random;

public class ZapisNactiVyhledej {

	public static void main(String[] args) throws IOException {

		int [] seznamcisel = new int [5];
		
		Random rd = new Random ();
		
		for (int i = 0; i < seznamcisel.length; i++) {
			String cislo = Integer.toString(rd.nextInt(9)+10) ;
			
			Zapis.ZapisTo(cislo);
			seznamcisel[i] = Nacti.NactiTo();
		}
		
		
	  for (int x : seznamcisel) {
		  System.out.println(x);
	  }
				
	  
	  Vyhledej.VyhledejTo(seznamcisel, 15);
	
	}

}
