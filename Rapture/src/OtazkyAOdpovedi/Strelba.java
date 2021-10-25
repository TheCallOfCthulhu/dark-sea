package OtazkyAOdpovedi;

import java.util.List;

public class Strelba implements Runnable {

	
	
	List<Integer> nabijeni;
	
	
	
	public Strelba(List<Integer> nabojnik) {
		this.nabijeni = nabojnik;
	}


public void Vystrelit () throws InterruptedException {
		
		synchronized (nabijeni) {
			while (nabijeni.isEmpty()) {
				System.out.println("ZASOBNIK JE PRAZDNY");
				nabijeni.wait();
			}
		}
		
		synchronized (nabijeni) {
			
			System.out.println("PRASK");
			nabijeni.remove(0);
			Thread.sleep(200);
			nabijeni.notify();
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public void run() {
		while (true) {
		try {
			Vystrelit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}{
			
		}
		
		}
	}

}
