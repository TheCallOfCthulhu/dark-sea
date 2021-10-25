package interviewQ;

public class secondLargestNumber {

	public static void main(String[] args) {


		int [] cisla = {5,10,268,1050,201,1,05,05,1,105,999,0,11,};
		
		int max = 0;
		int max2 = 0;
		
		
		
		for (int i =0; i <cisla.length; i++ ) {
			
			if (max < cisla[i]) {
				max2=max;
				max = cisla[i];
				
			} else if (max2 < cisla[i]) {
				max2 = cisla[i];
						
			}
		}
		
		
		
		
		
		System.out.println(max);
		System.out.println(max2);
		
		
		
	}

}
