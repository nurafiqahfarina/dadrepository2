package exercise01;

import java.util.Date;

public class MultiThreads extends Thread {
	
	Date date = java.util.Calendar.getInstance().getTime();

	MultiThreads()
	   {
	     System.out.println("My thread created " + date);
	     start();
	   }

	public void run() {
				
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(date + " " + getClass().getName() + " " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("my thread interrupted");
		}
		System.out.println("My thread run is over");
	}

}
