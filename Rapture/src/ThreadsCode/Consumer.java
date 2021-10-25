package ThreadsCode;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	int questionNo;
	
	BlockingQueue<Integer> cokoliv;
	
	public Consumer (BlockingQueue<Integer> neco) {
		this.cokoliv = neco;
	}

	@Override
	public void run() {
	
		try {
			cokoliv.put(getNextQ());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	
	private synchronized int getNextQ () {
		int nextQ = questionNo++;
		System.out.println("mame novy dotaz " + nextQ);
		return nextQ;
	}

}
