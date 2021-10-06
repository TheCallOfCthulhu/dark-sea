import java.util.ArrayList;

class MojeSeznam<T> {

	ArrayList<T> list2 = new ArrayList<>();

public void pridejElement(T element) {
	list2.add(element);
}
	
	public void odstranElement(T element) {
		list2.remove(element);
}
	
	public String toString () {
		return list2.toString();
	}
	
	public T vypis (int x) {
		return list2.get(x);
	}
				
}



public class TheGenerics {
	
	static <X> X vynasob(X hodnota) {
		
	return hodnota;

		}


	public static void main(String[] args) {
	
		vynasob(5);
		String neco = vynasob("vole");
		
		MojeSeznam<> seznam = new MojeSeznam ();
		
seznam.pridejElement("Element1");
seznam.pridejElement("Element2");
seznam.pridejElement(Integer.valueOf(5));
System.out.println(seznam);
System.out.println(seznam.vypis(2));



	}
}
