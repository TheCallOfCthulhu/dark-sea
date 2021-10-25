package OtazkyAOdpovedi;

import java.util.List;

public class Nabijeni implements Runnable {
	
	
	
	
	List<Integer> nabijeni;
	int LIMIT = 5;
	int pocetnaboju = 1;
	
	public Nabijeni (List<Integer> pole) {
		this.nabijeni = pole;
	}
	
	
	
	public void Nabit () throws InterruptedException {
		
		synchronized (nabijeni) {
			while (nabijeni.size() == LIMIT) {
				System.out.println("UZ JE PLNE NABITO");
				pocetnaboju = 1;
				nabijeni.wait();
				
			}
		}
		
		synchronized (nabijeni) {
			
			System.out.println("NABITO NABOJU: " + pocetnaboju);
			nabijeni.add(pocetnaboju);
			pocetnaboju = pocetnaboju + 1;
			Thread.sleep(500);
			nabijeni.notify();
			
		}
		
		
	}
	
	
	
	

	@Override
	public void run() {

		while (true) {
			
			try {
				Nabit();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} {
				
			}
			
		}


		
		
		
		

	}

}
