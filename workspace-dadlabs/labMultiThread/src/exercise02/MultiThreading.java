package exercise02;

import java.util.Arrays;

public class MultiThreading  implements Runnable{

	Thread multithread;
	String[] name = { "It is recommended to use Calender class"};

	MultiThreading() {
		multithread = new Thread(this, "My runnable thread");
		multithread.start();
	}

	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(Arrays.toString(name) + " " + i);
				//put a time gap between execution
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("my thread interrupted");
		}
		System.out.println("mythread run is over");
	}
}
