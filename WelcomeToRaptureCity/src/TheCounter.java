
public class TheCounter {

	
	int i;
	synchronized public void increment () { //pouze jeden thread muze spustit tuto metodu
		i++;
		//get i
		//increment
		//set i
	}
	
	
	synchronized public void decrement () { //pouze jeden thread muze spustit tuto metodu
		i--;
		//get i
		//increment
		//set i
	}
	
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
	
}
