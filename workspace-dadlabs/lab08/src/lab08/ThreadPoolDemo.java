package lab08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		
		//create SimpleArray 
		SimpleArray simpleSharedArray = new SimpleArray(6);
		
		//create two object from ArrayWriter
		ArrayWriter write1 = new ArrayWriter(1, simpleSharedArray);
		ArrayWriter write2 = new ArrayWriter(11, simpleSharedArray);
		
		//execute the tasks with an ExcutorService
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(write1);
		executor.execute(write2);
		
		//Shutdown the pool
		executor.shutdown();
		
		try {
			
			//Wait for 1 minute for both writers to finish executing
			boolean endFlag = executor.awaitTermination(1, TimeUnit.MINUTES);
			
			if(endFlag) {
				
				//print content of shared array
				System.out.println("\nContent of SimpleArray");
				System.out.println(simpleSharedArray);
				
			}else {
				
				System.out.println("Timed out while waiting for tasks to finish");
			}
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
	}

}
