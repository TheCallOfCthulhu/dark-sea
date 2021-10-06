
public class Charektery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		String quest; 
				
			quest = (x>8 ? "ANO" : "NE");
	 
			System.out.println(quest);
		
		MyChar mojeChar = new MyChar('a');
		System.out.println(mojeChar.isVowel());
		String vysledek = tyvole(1);
		System.out.println(vysledek);
	}
		public static String tyvole (int a) {
			
			
		
		switch (a) {
		case 1: 
			return "vybral si ani 1";
			
		
		case 2: 
			return "vybral si2";
			
			default: 
				return "vybral si ani 1 ani 2";
			
		}
		
		
	}

}
