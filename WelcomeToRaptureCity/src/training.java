import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import jdk.incubator.vector.VectorOperators.Test;

import java.util.Random;


public class training {
	static int i;
	
	public static void main(String[] args) {
		
		int a = 10, b =20;
		
		int c = a = b;
		System.out.println(c);
		

		Scanner sc = new Scanner (System.in);
		
	String str = "Jarek ��k�: Sejmi jednoro�ce";
	
System.out.println("Jarek ��k�: Sejmi jednoro�ce");

//int x = sc.nextInt();



	System.out.println(c);
	System.out.println(str.codePointAt(10)); 		//kod unicode na pozici 10 = 111
	System.out.println(str.codePointBefore(10));	//kod unicode pred pozici 10 = 225
	
	char t = 111;
	System.out.println(t);
	
	}
}