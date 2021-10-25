package carDealership;

public class Dealership {

	public static void main(String[] args) {


		Customer customer1 = new Customer () ;
			customer1.name = "Tom";
			customer1.address = "J. Herolda 6";
			customer1.cash = 12500;
			
			customer1.purchaseCar(null, null, false);
			
		

	}

}
