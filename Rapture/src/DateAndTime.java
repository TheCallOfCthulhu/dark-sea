import java.time.*;

public class DateAndTime {

	public static void main(String[] args) {
	

		LocalDate datum = LocalDate.now();
		LocalDate meNarozeniny = LocalDate.of(1986, 5, 5);
		System.out.println(datum);
		System.out.println(meNarozeniny);
		System.out.println(datum.getDayOfYear());
		System.out.println(datum.getDayOfMonth());
		System.out.println(datum.getDayOfWeek());
		System.out.println(datum.lengthOfMonth());
		System.out.println(datum.plusDays(55));
		System.out.println(datum.minusMonths(2));
		System.out.println(datum.isBefore(meNarozeniny));
				
						
				
				
				
				
				
				
	}

}
