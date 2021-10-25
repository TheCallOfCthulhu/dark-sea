
public final class Person {
String name;
static final int cislo =5;

int num = 6.7;


private Person(String name) {
	super();
	this.name = name;
}



public final void poly () {
	System.out.println("ja jsem person");
}
	


public String toString () {
	jmenuju();
	return "tohle je toSTring metoda";
}

 void  jmenuju () {
	System.out.println(name);
}
}
