package exceptionolis;

public class VlastniEx extends Exception {
	
	
public VlastniEx(String popis) {
	super(popis);
	System.out.println(popis);
}

public String toString () {
	return "blbyyyy";
}
}
