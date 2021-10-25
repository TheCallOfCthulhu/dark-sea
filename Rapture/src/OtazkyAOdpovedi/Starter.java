package OtazkyAOdpovedi;

import java.util.ArrayList;
import java.util.List;

public class Starter {

	public static void main(String[] args) {
	
		
		
		
		List<Integer> nabojnik = new ArrayList<> ();

		Thread thread1 = new Thread (new Nabijeni(nabojnik));
		Thread thread2 = new Thread (new Strelba(nabojnik));
		
		
		
		
		thread1.start();
		
		thread2.start();
		
		
	}

}
