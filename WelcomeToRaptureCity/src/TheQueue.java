import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


//takhle se muze menit comparator pro setrizeni fronty
class StringLenghtComaparator implements Comparator<String> {
	public int compare(String value1, String value2) {
				return Integer.compare(value1.length(), value2.length());
	}
	
}

public class TheQueue {

	public static void main(String[] args) {


		Queue<String> fronta = new PriorityQueue<>(); //v zavorce lze pouzit new StringLenghtComaparator()
		fronta.offer("3 Pracuj"); //pridava do fronty dalsi polozky
		fronta.offer("1 Prevlekni se");
		fronta.offer("2 Zapni pocitac");
		fronta.offer("4 Jdi domu");

		System.out.println(fronta.poll()); //seradi a vypise prvni vec
		System.out.println(fronta.poll());
		System.out.println(fronta.poll());
		System.out.println(fronta.poll());
	}

}
