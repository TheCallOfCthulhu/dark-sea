

/////////////////////////////////////////////////
class Task1 extends Thread { //povine extednuje Thread
	
	public void run () { //povinny nazev
	System.out.println("\nSTART TASK1\n");
	for (int i = 0; i <100; i++) {
		System.out.print(i);
	}

	System.out.println("\nKONEC TASK1\n");
	}
}

//////////////////////////////////////////////////
class Task2 implements Runnable {
	
	public void run () {
		System.out.println("\nSTART TASK2\n");
	
	//TASK2
	for (int i = 200; i <299; i++) {
		System.out.print(i);
	}
	System.out.println("\nKONEC TASK2\n");
}
}
///////////////////////////////////////////////////
//////////////////////////////////////////////////
class Task3 implements Runnable {

public void run () {
System.out.println("\nSTART TASK3\n");

//TASK3
for (int i = 200; i <299; i++) {
System.out.print(i);
}
System.out.println("\nKONEC TASK3\n");
}
}
///////////////////////////////////////////////////
class Task4 implements Runnable {

public void run () {
System.out.println("\nSTART TASK4\n");

//TASK4
for (int i = 200; i <299; i++) {
System.out.print(i);
}
System.out.println("\nKONEC TASK4\n");
}
}
///////////////////////////////////////////////////


public class TheThread {
	
	
	

	public static void main(String[] args) /*throws InterruptedException*/ {

		Task1 task1 = new Task1();
		task1.setPriority(10); //urcuje se priorita
	//	task1.sleep(1000); //zapne se az po sekunde
		task1.start(); //timhle se spousti paralelni metoda, ne tedy pomoci run!
		
		//TASK2
		Task2 task2 = new Task2();
		Thread taskTwothread = new Thread(task2);
		taskTwothread.start();
		
		
		task1.join(); //dokud nebude cela metoda task1 nepokracuj dale
		
		System.out.println("START TASK3");
		for (int i = 300; i <399; i++) {
			System.out.print(i);
		}
		//TASK3
		System.out.println("KONEC TASK3");
		
		
		
	}

}
