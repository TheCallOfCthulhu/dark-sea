package interviewQ;

public class FibonaccihoCislo {

	public static void main(String[] args) {
		
		int pocetkrat = 5;
		int a=0;
		int b=0;
		int c=1;
		
		for (int i = 0; i <=pocetkrat; i++) {
			
			a = b;
            b = c;
            c = a+b;
			
			System.out.println(a);
			
			
		}

	}

}
