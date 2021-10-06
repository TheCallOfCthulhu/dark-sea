
public class CarsShop {

	public static void main(String[] args) {
		
		
		Cars renault = new Cars();
		
		renault.getSpeed();
		
		renault.setSpeed(50);
		
		int renaultSpeed = renault.getSpeed() + 100;
		System.out.println(renaultSpeed);

	}

}
