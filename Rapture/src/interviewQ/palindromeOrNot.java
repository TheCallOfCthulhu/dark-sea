package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class palindromeOrNot {

	public static void main(String[] args) {
		
		boolean palindrom = true;

	String slovo = "osel";
	String reverse = "";
	
	char [] chara = slovo.toCharArray();
	
//	if (chara[0] == chara[4]) {
//		System.out.println("jooooooooooooo");
//	}
//	System.out.println(chara[0]);
//	System.out.println(chara[chara.length-1]);
	
	for (int i = 0; i < chara.length; i++) {
		
		
		
		if ( chara[i] == chara[chara.length-(1+i)] ) {
		//	System.out.println("ok");
			
	} else {
		palindrom = false;
	}
		}
	
		
//	if ((palindrom == true) ? " je palindrom" : " NENI palindrom" ) {
//		System.out.println(slovo + " je palindrom");
//	} else System.out.println(slovo + " NENI palindrom");
	
	System.out.println((palindrom == true) ? " je palindrom" : " NENI palindrom" );
	

	
	
	////////////jak obratit slovo
	for (int i = chara.length-1; i >=0; i--) {
	reverse = reverse + slovo.charAt(i);
      
 }
	
		System.out.println(reverse);

	}

}
