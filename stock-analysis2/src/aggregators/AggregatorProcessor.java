package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor <T extends Aggregator> {
	
	T aggregator;
	String file;
	Double  min = 1000d;
	
	
	public AggregatorProcessor(T aggregator, String file) {
		super();
		this.aggregator = aggregator;
		this.file = file;
	}
	
	
	public double runAggregator (int colIdx ) throws IOException {
		StockFileReader fileReader= new StockFileReader(file);
		List<String> lines = fileReader.readFileData();
		colIdx--;
		
		for (String line : lines) {
			System.out.println(line);
			String[] numbers =   line.split(",");
			Double value = Double.parseDouble(numbers[colIdx]);		
			
					if(value < min){
					min = value;
					
				}
			}
			
			
			
			
			//aggregator.add(value.doubleValue());
		//	System.out.println("nactene data do aggregator pole jsou " + aggregator);
			
	//	}
		
	//	double number = aggregator.calculate();
	//	System.out.println("aggregator calculate je " + number);
		return min;
	}
	



	
	
	
	
}
