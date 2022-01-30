package exercise02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class data implements Runnable{

	public void printRandom (String currentThread) {
	
		try {
			
			String[] data = {"It", "is", "recommended", "to", "use", "calendar", "class"};
			
			List<String> list = Arrays.asList(data);
			Collections.shuffle(list);
			list.toArray(data);
			
			for(String element:data) {
				
				System.out.println(currentThread + "->"+element);		
			}
			
					
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	@Override
	public void run() {
		
		//Get Thread
		Thread currentThread = Thread.currentThread();
		//Execute task
		printRandom(currentThread.getName());
		
	}

}