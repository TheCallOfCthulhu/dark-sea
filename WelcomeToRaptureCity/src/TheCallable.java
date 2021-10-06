import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;

public class TheCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<String> welcome = executor.submit(new CallableTask("Jaaaaaj"));
		
		String welcomZprava = welcome.get();
		
		System.out.println("main metod complete");
	}
}

	class CallableTask implements Callable<String> {
	
	private String name;
	
	

	public CallableTask(String name) {
		super();
		this.name = name;
	}

	
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello" + name;
	}

}
