package interviewQ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String[] args) {


	
			
		
	        // TODO Auto-generated method stub
	        HashMap<Integer,String> map = new HashMap<>();
	        map.put(2, "Saket");
	        map.put(25, "Saurav");
	        map.put(12, "HashMap");
	        System.out.println(map.size());
	        System.out.println("While Loop:");
	        
	        
	        
	    ///metoda1    
	        for (Integer value : map.keySet()) {
	        	
	        
	        	 System.out.println(value);
	        	
	        }
	       
	        
	        
	        
	        ///metoda2  
	        for(Entry<Integer, String> me2: map.entrySet()) {
	            System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
	        }
	   
	        
	        
	        
	        
	        
	        
	        
	       
	}

}
