package interviewQ;

import java.util.HashMap;
import java.util.Map;

public class countNumberOfWordsInStringUsingHashMap {

	public static void main(String[] args) {
		
		
		String input = "Sejmi jednorozce haha to je sranda";
		String[] split = input.split(" ");
		
	System.out.println(split.length);
	
	
	
	

	 HashMap<String,Integer> map = new HashMap<String,Integer>();
     for (int i=0; i<split.length; i++) {
         if (map.containsKey(split[i])) {
             int count = map.get(split[i]);
             map.put(split[i], count+1);
         }
         else {
             map.put(split[i], 1);
         }
     }
     System.out.println(map);


	
	}
	
	


		
		

		
		

	

	

}
