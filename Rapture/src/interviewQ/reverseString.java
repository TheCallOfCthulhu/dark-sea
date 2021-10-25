package interviewQ;

public class reverseString {

	public static void main(String[] args) {
		
			String input = "Sejmi jednorozce";

			
			////////metoda 1
			char [] pole = new char [input.length()];
			
			int b= input.length()-1;
			
			for (int i = 0; i <input.length(); i++) {
				
				pole[b] = input.charAt(i);
				b--;
			}
			
			
			
			////////metoda 2 
			 char[] pole2 = input.toCharArray();
		
			 for(int i= pole2.length-1; i!=0; i--) {
		            System.out.print(pole2[i]);
		        }
			 
			 
			 

			 System.out.println(pole);
	}

}
