package exercise02;

public class exe2 {
	public static void main(String args[]) {
		MultiThreading cnt = new MultiThreading();
		try {
			while (cnt.multithread.isAlive()) {
				System.out.println("This is for my multithreading");
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread run is over");
	}
}
