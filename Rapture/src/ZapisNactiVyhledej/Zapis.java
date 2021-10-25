package ZapisNactiVyhledej;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zapis {
	
	
	public static void ZapisTo (String slovo) {
	String filename = "C:\\Users\\surovjar\\Desktop\\list.txt";	
	File soubor = new File (filename);
	
	try {
		FileWriter fw = new FileWriter (soubor);
		fw.write(slovo); 
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	

}
