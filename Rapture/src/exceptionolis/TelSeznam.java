package exceptionolis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TelSeznam {

	public static void main(String[] args) throws IOException {

 //github commit test
		
		
		String cesta = "C:\\Users\\surovjar\\Desktop\\telseznam.txt";
		String telefon = "5123456789";
		
		File souborSeznam = new File (cesta);

		
		
		try {
			FileWriter fw;
			fw = new FileWriter (souborSeznam);
			fw.write(telefon);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		BufferedReader br;
		br = new BufferedReader (new FileReader(souborSeznam)); 
		String text = br.readLine();
		
		if (text.startsWith("0") || text.startsWith("9")) {
			System.out.println("cislo nemuze zacinat 0 nebo 9");
					} else if (text.length() != 10) {
						System.out.println("cislo nema 10 cisel");
					} else {
		
		br.close();
		System.out.println(text);
					}
		
	}

}
