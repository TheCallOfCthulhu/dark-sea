
public class WelcomeToRapture {
	
	String material;
	 int hloubka = 600;
	static int tlak;
	
	
	public WelcomeToRapture() {
	//	hloubka = 600;
	}
	

	public WelcomeToRapture(String material, int hloubka, int tlak) {
		super();
		this.material = material;
		this.hloubka = hloubka;
		this.tlak = tlak;
	}






	public static void main(String[] args) {
		
		WelcomeToRapture mesto = new WelcomeToRapture();
		WelcomeToRapture mesto3 = new WelcomeToRapture();
		WelcomeToRapture mesto2 = new WelcomeToRapture("ocel", 1000, 150);
		
		
		int a = tlak;
		int b = mesto.tlak;
		mesto.material = "drevo";
		mesto.hloubka = 250;
		System.out.println(mesto.hloubka);
		System.out.print(mesto3.hloubka);
		
		
		mesto2.hloubka = 300;
	}

}
