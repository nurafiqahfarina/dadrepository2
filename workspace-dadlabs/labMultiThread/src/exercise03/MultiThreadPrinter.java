package exercise03;

import exercise02.DataPrinter;
import exercise02.data;

public class MultiThreadPrinter {

public static void main(String[] args) {
		
		// create objects of runnable
		Runnable statement = new DataArray();
		Thread statementThread = new Thread(statement);
		statementThread.setName("word1");
	
		
		// Execute thread
		statementThread.start();


	}
}
