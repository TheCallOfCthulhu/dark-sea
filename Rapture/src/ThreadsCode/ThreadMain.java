package ThreadsCode;

public class ThreadMain {

	public static void main(String[] args) {


		DalsiThread zavodnik1 = new DalsiThread ("Tredka-1") ;
		DalsiThread zavodnik2 = new DalsiThread ("Tredka-2") ;
		DalsiThread zavodnik3 = new DalsiThread ("Tredka-3") ;
		
		zavodnik1.start();
		zavodnik2.start();
		zavodnik3.start();
		

	}
	
	
	

}

class DalsiThread extends Thread {
	String name;
	
	
	
	public DalsiThread(String name) {
		super();
		this.name = name;
		setName(this.name);
	}

	
	
	public void run () {
		int f = 0;
		for (int i = 0; i < 100; i++) {
			System.out.println("-" + Thread.currentThread().getName());
			try {
				sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		if (f!=1) {
		System.out.println("FINISH"+ Thread.currentThread().getName());
		f = 1;}
		
		
	}
	
}
