package sortCompare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Studenti {

	public static void main(String[] args) {
		
		
		ArrayList<Zaci> studenti = new ArrayList<>();
		
		studenti.add(new Zaci("Jarek",35));
		studenti.add(new Zaci("Petr",34));
		studenti.add(new Zaci("Alena",21));
		
		
		Collections.sort(studenti);
		
		System.out.print(studenti);

	}

}
