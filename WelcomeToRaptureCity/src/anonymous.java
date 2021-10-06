



class pocitej {
	
		
	public int secti () {
		int secti = 5+5;
		
		return secti;
	}	
	
}


public class anonymous {

	public static void main(String[] args) {
 pocitej pocitej = new pocitej();
		int celkem = 5 + pocitej.secti();
		System.out.println (celkem);
	}

}
