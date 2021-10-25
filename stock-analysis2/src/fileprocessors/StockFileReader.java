package fileprocessors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockFileReader {
	
	String filePath = null;
	
	public StockFileReader(String filePath){
		this.filePath = filePath;
	}
	
	
	
	public List<String> readFileData() throws IOException{
		List<String> lines = new ArrayList<String>();
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			//skip the first line:
			br.readLine();
			String line = null;
			// populate data from next line onwards
			while((line = br.readLine()) != null){
				lines.add(line);
			}
		}
	    return lines;
	}
	

}
