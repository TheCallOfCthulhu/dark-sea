package aggregators;

import java.util.List;

public class MinAggregator extends Aggregator{

	@Override
	public double calculate() {
		double min = numbers.get(0);
		for(double number : numbers){
			System.out.println(number);
			if(number < min){
				min = number;
				System.out.println("min je" + min);
			}
		}
		return min;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}
	
	public String toString () {
		return "pole agg je " + numbers;
	}

}
