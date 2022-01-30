package exercise01;

public class exe1 {

	public static void main(String args[]) {
		MultiThreads threadThing = new MultiThreads();
		try {
			while (threadThing.isAlive()) {
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread's run is over");
	}
}
