package ZapisNactiVyhledej;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Nacti {
	
	
	public static int NactiTo () throws IOException {
int i = 0;
	String filename = "C:\\Users\\surovjar\\Desktop\\list.txt";	
	
	try {
		BufferedReader br = new BufferedReader (new FileReader (filename));
		String cs = br.readLine(); 
		i = Integer.parseInt(cs);
		br.close();
		
	} catch (FileNotFoundException e) {
			e.printStackTrace();
	}
	
	return i;
	}
}
