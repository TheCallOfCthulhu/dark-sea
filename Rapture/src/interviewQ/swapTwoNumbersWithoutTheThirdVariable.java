package interviewQ;

public class swapTwoNumbersWithoutTheThirdVariable {

	public static void main(String[] args) {


		int a = 1;
		int b = 9;
		
		System.out.println("pred swapem " + a + " "+ b);
		
		a = (a+b);
		b = a - b;
		a = a -b ;
		
		System.out.println("po swapu " + a + " "+ b);
	}

}
