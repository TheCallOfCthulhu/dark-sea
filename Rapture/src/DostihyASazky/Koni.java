package DostihyASazky;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Koni extends Thread{

	
	
	int km = 0;
	private String jmeno;
	boolean finish = false;
	
	static List <String> poradi = new ArrayList <>();
	
	
	public Koni(String jmeno) {
		super();
		this.jmeno = jmeno;
	}


	public void sprint () throws InterruptedException {
		Random rd = new Random ();
		km++;
		System.out.println(this.jmeno + " bezi " + km + " metru");
		int zzz = rd.nextInt(5)*200;
		sleep(zzz);
		
		if (km == 20) {
			System.out.println(jmeno + " FINISH");
			finish = true;
			poradi.add(jmeno);
		}
		
	}
	
	
	public void run () {
		
		while (finish == false) {
		try {
			sprint ();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	
	}
	
}








