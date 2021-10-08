package exceptionolis;

public class Vyjmulky {

	public static void main(String[] args) throws VlastniEx   {


	int a = 5, b= 2;
	System.out.println("zacatek programu");
	secti(a, b);
	System.out.println("konec programu");
		

	}

	private static void secti(int a, int b) throws VlastniEx {
		
		try {
			int c = a/b;
		
		System.out.println(c);
		if (c==10) {
			throw new VlastniEx("mas to spatne vole");
		}
	} catch (VlastniEx e) {
		System.out.println(e.toString());
	}
		
//		try {
//		int c = a/b;
//		System.out.println(c);
//	} catch (Exception e)
//	      { e.printStackTrace();
//		}
	}

}
