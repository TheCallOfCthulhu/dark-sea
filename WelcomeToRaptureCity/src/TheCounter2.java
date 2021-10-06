import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TheCounter2 {

	
	private AtomicInteger j = new AtomicInteger();
	private int i;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	synchronized public void incrementI () { //pouze jeden thread muze spustit tuto metodu
			//get lock
			lockForI.lock();
		i++;
			//release lock
		lockForI.unlock();
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
	synchronized public void incrementJ () { //pouze jeden thread muze spustit tuto metodu
		j.incrementAndGet(); // automatikcy je to thread safe
		//get i
		//increment
		//set i
	}
	public int getJ() {
		return j.get();
	}
	public void setJ(int i) {
		this.j = j;
	}
	
	
	
}
