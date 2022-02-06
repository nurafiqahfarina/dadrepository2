package lab08;

public class ArrayWriter implements Runnable {
	
	private final SimpleArray sharedSimpleArray;
	private int startValue;

	public ArrayWriter(int value, SimpleArray simpleArray) {
		
		this.startValue = value;
		this.sharedSimpleArray = simpleArray;
		
	}
	
	@Override
	public void run() {
		
		for(int i= startValue; i < startValue + 3; i++) {
			
			//add an data to the sharedArray 
			sharedSimpleArray.add(i);
		}
		
	}

}
