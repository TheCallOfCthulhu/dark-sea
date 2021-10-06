
	enum Planet {
		MARS,VENUS,EARTH
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
		break;
		default: System.out.print("nemuzes tu zit");
		}
		
	}

}
