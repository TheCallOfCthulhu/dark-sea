
public class DveD {

	public static void main(String[] args) {
		int pole [][] = new int [11][11];
		
		/*naplneni hodnot*/
		for (int radek = 0; radek < pole.length; radek++) {
			for (int sloupec = 0; sloupec < pole[radek].length; sloupec++) {
				
				pole [radek][sloupec] = 3;
			}
		}
		
		pole [5][5] = 0;
		
		/*vypis na obrazovku*/
		for (int radek = 0; radek < pole.length; radek++) {
			for (int sloupec = 0; sloupec < pole[radek].length; sloupec++) {
				System.out.print(pole[radek] [sloupec] + " ");
				
			}
			System.out.println();
		}

	}

}
