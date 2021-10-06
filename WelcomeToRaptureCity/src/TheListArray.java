import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Pole {
	int [] znamky;

	public Pole(int[] znamky) {
		super();
		this.znamky = znamky;
	}
	
}

public class TheListArray {
	
	
	public static void main(String[] args) {
		
	int [] pole = {20,2,33,14,5};
	double [] pole2 = new double [5];
	boolean [] pole4 = new boolean [5];
	ArrayList pole3 = new ArrayList();
	Pole pole5 = new Pole(new int[] {20,30,40});
	Pole []  pole6 = new Pole[6];
	
	pole[1] = 8;
	Arrays.fill(pole2, 100);
	
	System.out.println(pole[2]);
	System.out.println(pole2[2]);
	System.out.println(pole4[2]);
	System.out.println(pole3);
	System.out.println(pole.length);
	System.out.println(pole2.length);
	System.out.println(pole3.size());
	System.out.println(Arrays.toString(pole5));
	Arrays.sort(pole);
	System.out.println(Arrays.toString(pole));
		
	
		
		
		
	}

}
