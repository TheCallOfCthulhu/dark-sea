package adresar.zamestnancu;

import java.util.ArrayList;
import java.util.Scanner;

public class AplikaceStart {
	
	
	
	

	public static void main(String[] args) {
		Zamestnanci zam1 = new Zamestnanci ("Petr", "Jelinek");
		Zamestnanci zam2 = new Zamestnanci ("Jarek", "Surovecky");
		Zamestnanci zam3 = new Zamestnanci ("Muskat", "Volnyz");
		Zamestnanci zam4 = new Zamestnanci ("Patrik", "Vejmola");
zam1.nastav();

System.out.println(zam1.email);
System.out.println(zam1.password);		
		
zam1.zmenahesla("12345");
System.out.println(zam1.password);	
	}
	


}
