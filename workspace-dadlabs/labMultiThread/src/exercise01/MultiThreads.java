package exercise01;

import java.util.Date;

public class MultiThreads extends Thread {
	
	public static void main(String[] args) {
		// create objects of thread
		Thread statementPrinter1 = new Statementprinter();
		Thread statementPrinter2 = new Statementprinter();
		
		//create objects of thread with name
		Thread printerThread1 = new Thread(statementPrinter1, "printThread");
		Thread printerThread2 = new Thread(statementPrinter2);
		
		//Execute thread
		printerThread2.start();
		printerThread1.start();

	}

}
