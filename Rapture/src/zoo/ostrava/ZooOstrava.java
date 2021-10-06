package zoo.ostrava;

public class ZooOstrava {

	public static void main(String[] args) {

		

		Zviratka puma = new Zviratka(50, 48, "Puma");
		Zviratka panda = new Zviratka(11, 22, "Panda");
		Zviratka zirafa = new Zviratka(33, 44, "Zirafa");

		
		puma.vypis();
		zirafa.vypis();
		panda.vypis();
		puma.vypis();
		
	}

}
