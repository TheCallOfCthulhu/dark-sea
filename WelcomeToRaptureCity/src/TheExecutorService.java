import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheExecutorService {

	public static void main(String[] args) {
	
	//	ExecutorService executor = Executors.newSingleThreadExecutor(); //pouze jeden thread bude spusten najednou
		ExecutorService executor = Executors.newFixedThreadPool(2); //pouze dva thready budou spusteny najednou
		executor.execute(new Task1());
		executor.execute(new Thread (new Task2()));
		executor.execute(new Thread (new Task3()));
		executor.execute(new Thread (new Task4()));

		
		executor.shutdown();
	}

}
