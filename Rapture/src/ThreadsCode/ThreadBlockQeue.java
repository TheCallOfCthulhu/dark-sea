package ThreadsCode;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadBlockQeue {

	public static void main(String[] args) {


		BlockingQueue<Integer> blockq = new ArrayBlockingQueue<> (5);
		
		Thread t1 = new Thread (new Producer(blockq));
		Thread t2 = new Thread (new Consumer(blockq));

	}

}
