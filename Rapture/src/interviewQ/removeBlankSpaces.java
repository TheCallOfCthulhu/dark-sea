package interviewQ;

import java.io.File;
import java.io.FileInputStream;

public class removeBlankSpaces {

	public static void main(String[] args) {


		
		
		
		
		String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
		  
        char[] chars = str1.toCharArray();
  
        StringBuffer sb = new StringBuffer();
  
        for (int i = 0; i < chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
        System.out.println(sb);    
        
        
        
        ////metoda2
        String str2 = str1.replaceAll("\\s", "");
        
        System.out.println(str2);
		
		
		
		
		

	}

}
