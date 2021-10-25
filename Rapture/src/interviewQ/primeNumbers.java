package interviewQ;

public class primeNumbers {

	public static void main(String[] args) {

		int [] pole= {1,5,48,15,13,20,15,48,79,12,11,10};
		
		
		for (int i = 0; i <pole.length; i++) {
			
			if ((pole[i]%2) == 0) {
				System.out.println(pole[i] + " neni prvocislo");
			} else {
				System.out.println(pole[i] + " je prvocsilo");
			}
			
		}
		
	}

}
