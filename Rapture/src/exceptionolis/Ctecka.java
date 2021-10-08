package exceptionolis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ctecka {
	
	

	////NACTE SOUBOR A ZAPISE DO JINEHO - BYTESTREAM

		public static void main(String[] args) throws IOException  {
			
			String filename3 = "C:\\Users\\surovjar\\Desktop\\soubor4.txt";
			String filename4 = "C:\\Users\\surovjar\\Desktop\\soubor5.txt";
			
			FileInputStream in = null;
			FileOutputStream out = null;
			
			try {
				in = new FileInputStream(filename3);
				out = new FileOutputStream(filename4);
				
				int c;
				while ((c = in.read()) != -1) {
					out.write(c);
				}
				
				
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} finally {
				
			}
			
			
			
			
			/////////////ZAPIS///////////////// CHARACTERSTREAM
		// definovat cestu k souboru
		String filename2 = "C:\\Users\\surovjar\\Desktop\\soubor2.txt"; //kdzy tam neni soubor tak ho vytvori
		String zprava = "funguje tooo!!!!!";
		
		// vytvorit souboru
		File file2 = new File(filename2);
		
		
		
		// otevrit souboru
		FileWriter fw;
		try {
			fw = new FileWriter(file2);
			
			// zapisovat souboru
			fw.write(zprava);
			fw.close();
		} catch (IOException e1) {
			System.out.println("nemuzu precist soubor");
			e1.printStackTrace();
		}
		
		
		
		
		/////////////CTENI/////////////////CHARACTERSTREAM
		// definovat cestu k souboru
		
		String filename = "C:\\Users\\surovjar\\Desktop\\soubor5.txt";
String text = null;
		
		//vytvori soubor
		File file = new File(filename);
		
		
		//open file
		BufferedReader br;
		try {
		br = new BufferedReader(new FileReader(file)); //bufferreader cte po radkach (filereader po charakterech)
		
		//read file
		text = br.readLine(); //readline cte po radcich
		
		//zavrit soubor
		br.close();
		} catch (IOException e) {
			System.out.println("soubor nenalezen");
		} finally {
			System.out.println("dokoncene cteni");
		}
		System.out.println(text);
		//read file
		
	
	}

}
