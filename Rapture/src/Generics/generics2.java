package Generics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class generics2 {

	public static void main(String[] args) throws FileNotFoundException {
		
	File soubor = new File ("mujsoubor"); //otevre soubor
	Scanner sc = new Scanner(soubor);	 //otevre scanner(bude nacitat ze souvoru)
	while(sc.hasNextLine()) {		//podminka dokud scanner ma co nacitat
		String line = sc.nextLine();	//vloz do stringu line cely radek
		System.out.println(line);
	}
	sc.close();
	
	Set<Integer> set1 = new HashSet<>();
	set1.add(5);
	set1.add(2);
	set1.add(1);
	Set<Integer> set2 = new HashSet<>();
	set1.add(3);
	set1.add(5);
	set1.add(4);
	
	Set<Integer> newset = sjednoceni(set1, set2);
	
	Iterator<Integer> irt=newset.iterator();
	while(irt.hasNext()) {
		Integer var = irt.next();
		System.out.println(var);
	}
	
	}
	
	
	
	
	
//metoda return s generics
	
	public static <E> Set<E> sjednoceni (Set<E> Set1, Set<E> Set2) {
		Set<E> vysledek = new HashSet<> (Set1);
		vysledek.addAll(Set2);
		return vysledek;
	}
	
}
