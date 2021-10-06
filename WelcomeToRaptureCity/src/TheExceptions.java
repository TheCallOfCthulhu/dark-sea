
class MenaJeJinaException extends Exception { //custom svuj vlastni exceptions
	public MenaJeJinaException (String popis) {
		System.out.println("Tyvole mas to spatne");
	}
}


class Amount {
	private String currency;
	private int amount;
	
		
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public String toString () {
		return this.amount + this.currency;
	
	}
	
	public void add(Amount druhaMena) throws MenaJeJinaException {
		if (!this.currency.equals(druhaMena.currency))  {
	//		throw new RuntimeException("BACHA");	//je unchecked exception - nemusi byt throw deklarace
			throw new MenaJeJinaException("BACHA nesedi meny"); //je checked exception - musi byt throw deklarace
		}
	this.amount = this.amount +druhaMena.amount;

}

}

public class TheExceptions {

	public static void main(String[] args) throws MenaJeJinaException   {

		Amount amount1 = new Amount ("USD", 50);
		Amount amount2 = new Amount ("EU", 20);
		
		amount1.add(amount2);
		System.out.println(amount1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
