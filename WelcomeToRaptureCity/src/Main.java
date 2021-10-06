
	enum Planet {
		MARS(1),
		VENUS(2),
		EARTH(3);
		
		int vzdalenost;
		
		Planet (int vzdalenost) {
			this.vzdalenost = vzdalenost;
		}

	}
	
	
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planet mojePlaneta = Planet.EARTH;
		
		muzuTamZit(mojePlaneta);
		

	}
	
	static void muzuTamZit(Planet mojePlaneta) {
		
		switch (mojePlaneta) {
		case EARTH: System.out.print("muzes tu zit");
		System.out.print("planeta je vzdalena " + mojePlaneta.vzdalenost);
		break;
		default: System.out.print("nemuzes tu zit");
		}
		
	}

}
